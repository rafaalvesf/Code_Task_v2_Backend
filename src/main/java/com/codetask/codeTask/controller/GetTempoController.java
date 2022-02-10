package com.codetask.codeTask.controller;

import com.codetask.codeTask.model.GetTempoModel;
import com.codetask.codeTask.service.GetTempoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/{placa}")
    public List<GetTempoModel> getTempoByPlaca(@PathVariable("placa") String placa) {
        return getTempoService.getTempoByPlaca(placa);
    }

    @GetMapping("/{placa}/{data}")
    public List<GetTempoModel> getTempoByPlacaData(@PathVariable("placa") String placa, @PathVariable("data") String data) {
        return getTempoService.getTempoByPlacaData(placa, data);
    }
}
