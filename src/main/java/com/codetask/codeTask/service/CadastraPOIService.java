package com.codetask.codeTask.service;

import com.codetask.codeTask.model.CadastraPOIModel;
import com.codetask.codeTask.repository.CadastraPOIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastraPOIService {
    @Autowired
    private CadastraPOIRepository cadastraPOIRepository;

    public CadastraPOIModel criarPOI(CadastraPOIModel cadastraPOIModel){
        return this.cadastraPOIRepository.save(cadastraPOIModel);
    }
}