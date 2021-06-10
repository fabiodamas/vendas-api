package io.fabiodamas.vendas.repository;

import io.fabiodamas.vendas.model.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {

}
