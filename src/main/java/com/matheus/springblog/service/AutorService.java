package com.matheus.springblog.service;

import com.matheus.springblog.model.Artigo;
import com.matheus.springblog.model.Autor;

import java.util.List;

public interface AutorService {
    public List<Autor> obterTodos();
    public Autor obterPorCodigo(String codigo);
    public Autor criar(Autor autor);
}