package com.codetask.codeTask.controller;

import com.codetask.codeTask.model.CadastraPOIModel;
import com.codetask.codeTask.model.CadastraPosicoesModel;
import com.codetask.codeTask.model.GetTempoModel;
import com.codetask.codeTask.service.CadastraPOIService;
import com.codetask.codeTask.service.GetTempoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/getdados")
public class GetTempoController {
    @Autowired
    GetTempoService getTempoService;

    @GetMapping
    public List<GetTempoModel> getTempo() {
        return getTempoService.getTempo();
    }
}
