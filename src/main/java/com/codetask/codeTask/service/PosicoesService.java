package com.codetask.codeTask.service;

import com.codetask.codeTask.model.PosicoesModel;
import com.codetask.codeTask.repository.PosicoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosicoesService {
    @Autowired
    private PosicoesRepository posicoesRepository;

    public PosicoesModel criarPosicoes(PosicoesModel posicoesModel) {
        return this.posicoesRepository.save(posicoesModel);
    }

    public List<PosicoesModel> findAll() {
        return this.posicoesRepository.findAll();
    }

    public List<PosicoesModel> findByPlaca(String placa) {
        return this.posicoesRepository.findByPlaca(placa);
    }

    public List<PosicoesModel> findByPlacaData(String placa, String data) {
        data = "%" + data + "%";
        return this.posicoesRepository.findByPlacaData(placa, data);
    }
}
