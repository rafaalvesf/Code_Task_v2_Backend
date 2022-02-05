package com.codetask.codeTask.controller;

import com.codetask.codeTask.model.CadastraPOIModel;
import com.codetask.codeTask.service.CadastraPOIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/poi")
public class CadastraPOIController {
    @Autowired
    private CadastraPOIService cadastraPOIService;

    @PostMapping
    public CadastraPOIModel criarPOI(@RequestBody CadastraPOIModel cadastraPOIModel){
        return this.cadastraPOIService.criarPOI(cadastraPOIModel);
    }
    @GetMapping
    public List<CadastraPOIModel> findAll() {
        return cadastraPOIService.findAll();
    }
}
