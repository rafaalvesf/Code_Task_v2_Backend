package com.codetask.codeTask.controller;

import com.codetask.codeTask.model.CadastraPOIModel;
import com.codetask.codeTask.model.CadastraPosicoesModel;
import com.codetask.codeTask.service.CadastraPOIService;
import com.codetask.codeTask.service.CadastraPosicoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/posicoes")
public class CadastraPosicoesController {
    @Autowired
    private CadastraPosicoesService cadastraPosicoesService;

    @PostMapping
    public CadastraPosicoesModel criarPosicoes(@RequestBody CadastraPosicoesModel cadastraPosicoesModel){
        return this.cadastraPosicoesService.criarPosicoes(cadastraPosicoesModel);
    }

}
