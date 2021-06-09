package io.fabiodamas.vendas.resource;

import io.fabiodamas.vendas.event.RecursoCriadoEvent;
import io.fabiodamas.vendas.model.Cliente;
import io.fabiodamas.vendas.repository.ClienteRepository;
import io.fabiodamas.vendas.service.ClienteService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteResource {
    private ClienteRepository clienteRepository;
    private final ApplicationEventPublisher publisher;
    private final ClienteService ClienteService;

    public ClienteResource(ClienteRepository clienteRepository, ApplicationEventPublisher publisher, ClienteService pessoaService) {
        this.clienteRepository = clienteRepository;
        this.publisher = publisher;
        this.ClienteService = pessoaService;
    }

    @PostMapping
    public ResponseEntity<Cliente> criar(@Valid @RequestBody Cliente Cliente, HttpServletResponse response){
        Cliente ClienteSalvo = clienteRepository.save(Cliente);
        publisher.publishEvent(new RecursoCriadoEvent(this, response, ClienteSalvo.getId()));
        return ResponseEntity.status(HttpStatus.CREATED).body(ClienteSalvo);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPeloId(@PathVariable Long id) {
        return this.clienteRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public  Iterable<Cliente> listar(){
        return clienteRepository.findAll();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @Valid @RequestBody Cliente Cliente) {
        Cliente pessoaSalva = ClienteService.atualizar(id, Cliente);
        return ResponseEntity.ok(pessoaSalva);
    }

    @PutMapping("/{id}/ativo")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarPropriedadeAtivo(@PathVariable Long id, @RequestBody Boolean ativo) {
        ClienteService.atualizarPropriedadeAtivo(id, ativo);
    }


}
