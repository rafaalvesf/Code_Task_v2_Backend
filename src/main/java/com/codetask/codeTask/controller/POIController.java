package com.codetask.codeTask.controller;

import com.codetask.codeTask.model.POIModel;
import com.codetask.codeTask.service.POIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/poi")
public class POIController {
    @Autowired
    private POIService POIService;

    @PostMapping
    public POIModel criarPOI(@RequestBody POIModel cadastraPOIModel) {
        return this.POIService.criarPOI(cadastraPOIModel);
    }

    @GetMapping
    public List<POIModel> findAll() {
        return POIService.findAll();
    }
}
