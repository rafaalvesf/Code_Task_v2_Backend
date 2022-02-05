package com.codetask.codeTask.controller;
import com.codetask.codeTask.model.CadastraPosicoesModel;
import com.codetask.codeTask.service.CadastraPosicoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/posicoes")
public class CadastraPosicoesController {
    @Autowired
    private CadastraPosicoesService cadastraPosicoesService;

    @PostMapping
    public CadastraPosicoesModel criarPosicoes(@RequestBody CadastraPosicoesModel cadastraPosicoesModel){
        return this.cadastraPosicoesService.criarPosicoes(cadastraPosicoesModel);
    }

    @GetMapping
    public List<CadastraPosicoesModel> findAll() {
        return cadastraPosicoesService.findAll();
    }


}
