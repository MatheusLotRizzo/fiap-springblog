package com.matheus.springblog.controller;

import com.matheus.springblog.model.Artigo;
import com.matheus.springblog.model.Autor;
import com.matheus.springblog.service.ArtigoService;
import com.matheus.springblog.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> obterTodos() {
        return autorService.obterTodos();
    }

    @GetMapping("/{codigo}")
    public Autor obterPorCodigo(@PathVariable String codigo) {
        return autorService.obterPorCodigo(codigo);
    }

    @PostMapping
    public Autor criar(@RequestBody Autor autor) {
        return autorService.criar(autor);
    }
}