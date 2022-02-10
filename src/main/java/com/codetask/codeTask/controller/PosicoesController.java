package com.codetask.codeTask.controller;

import com.codetask.codeTask.model.PosicoesModel;
import com.codetask.codeTask.service.PosicoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/posicoes")
public class PosicoesController {
    @Autowired
    private PosicoesService posicoesService;

    @PostMapping
    public PosicoesModel criarPosicoes(@RequestBody PosicoesModel posicoesModel) {
        return this.posicoesService.criarPosicoes(posicoesModel);
    }

    @GetMapping
    public List<PosicoesModel> findAll() {
        return posicoesService.findAll();
    }

    @GetMapping("/{placa}")
    public List<PosicoesModel> findByPlaca(@PathVariable("placa") String placa) {
        return posicoesService.findByPlaca(placa);
    }

    @GetMapping("/{placa}/{data}")
    public List<PosicoesModel> findByPlacaData(@PathVariable("placa") String placa, @PathVariable("data") String data) {
        return posicoesService.findByPlacaData(placa, data);
    }
}
