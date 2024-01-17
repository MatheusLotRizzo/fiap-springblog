package com.matheus.springblog.service.impl;

import com.matheus.springblog.model.Artigo;
import com.matheus.springblog.model.Autor;
import com.matheus.springblog.repository.ArtigoRepository;
import com.matheus.springblog.repository.AutorRepository;
import com.matheus.springblog.service.ArtigoService;
import com.matheus.springblog.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    @Override
    public List<Autor> obterTodos() {
        return autorRepository.findAll();
    }

    @Override
    public Autor obterPorCodigo(String codigo) {
        return autorRepository.findById(codigo).orElseThrow(() -> new IllegalArgumentException("Autor não existe"));
    }

    @Override
    public Autor criar(Autor autor) {
        return autorRepository.save(autor);
    }
}