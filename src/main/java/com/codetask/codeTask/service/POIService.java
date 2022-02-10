package com.codetask.codeTask.service;

import com.codetask.codeTask.model.POIModel;
import com.codetask.codeTask.repository.POIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class POIService {
    @Autowired
    private POIRepository POIRepository;

    public POIModel criarPOI(POIModel cadastraPOIModel){
        return this.POIRepository.save(cadastraPOIModel);
    }

    public List<POIModel> findAll() {
        return this.POIRepository.findAll();
    }
}
