package com.matheus.springblog.repository;

import com.matheus.springblog.model.Artigo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface ArtigoRepository extends MongoRepository<Artigo, String> {
    public void deleteById(String id);

    public List<Artigo> findByStatusAndDataGreaterThan(Integer status, LocalDateTime data);
}
