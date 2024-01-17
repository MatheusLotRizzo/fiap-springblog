package com.matheus.springblog.repository;

import com.matheus.springblog.model.Artigo;
import com.matheus.springblog.model.Autor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AutorRepository extends MongoRepository<Autor, String> {
}
