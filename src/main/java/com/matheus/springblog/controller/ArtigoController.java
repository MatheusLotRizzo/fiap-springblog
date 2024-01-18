package com.matheus.springblog.controller;

import com.matheus.springblog.model.Artigo;
import com.matheus.springblog.service.ArtigoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/artigos")
public class ArtigoController {

    @Autowired
    private ArtigoService artigoService;

    @GetMapping
    public List<Artigo> obterTodos() {
        return artigoService.obterTodos();
    }

    @GetMapping("/{codigo}")
    public Artigo obterPorCodigo(@PathVariable String codigo) {
        return artigoService.obterPorCodigo(codigo);
    }

    @PostMapping
    public Artigo criar(@RequestBody Artigo artigo) {
        return artigoService.criar(artigo);
    }

    @PutMapping
    public Artigo atualizar(@RequestBody Artigo artigo) {
        return artigoService.criar(artigo);
    }

    @GetMapping("/data-gt")
    public List<Artigo> findByDataGreaterThan(@RequestParam("data") LocalDateTime data) {
        return artigoService.findByDataGreaterThan(data);
    }

    @GetMapping("/data-status")
    public List<Artigo> findByDataAndStatus(@RequestParam("data") LocalDateTime data, @RequestParam("status") Integer status) {
        return artigoService.findByDataAndStatus(data, status);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        artigoService.deleteById(id);
    }
    @GetMapping("/data-status-gt")
    public List<Artigo> findByStatusAndDataGreaterThan(@RequestParam("status") Integer status, @RequestParam("data") LocalDateTime data) {
        return artigoService.findByStatusAndDataGreaterThan(status, data);
    }
}