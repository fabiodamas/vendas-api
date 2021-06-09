package io.fabiodamas.vendas.service;

import io.fabiodamas.vendas.model.Cliente;
import io.fabiodamas.vendas.repository.ClienteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final ClienteRepository ClienteRepository;

    public ClienteService(ClienteRepository ClienteRepository) {
        this.ClienteRepository = ClienteRepository;
    }

    public Cliente atualizar(Long id, Cliente Cliente) {
        Cliente ClienteSalvo = ClienteRepository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
        BeanUtils.copyProperties(Cliente, ClienteSalvo, "id");
        return ClienteRepository.save(ClienteSalvo);
    }

    public void atualizarPropriedadeAtivo(Long id, Boolean ativo) {
        Cliente ClienteSalvo = buscarPessoaPeloCodigo(id);
        ClienteSalvo.setAtivo(ativo);
        ClienteRepository.save(ClienteSalvo);
    }

    private Cliente buscarPessoaPeloCodigo(Long id) {
        return ClienteRepository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
    }



}
