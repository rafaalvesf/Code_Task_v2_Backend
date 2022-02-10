package com.codetask.codeTask.service;

import com.codetask.codeTask.model.CadastraPosicoesModel;
import com.codetask.codeTask.repository.CadastraposicoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastraPosicoesService {
    @Autowired
    private CadastraposicoesRepository cadastraposicoesRepository;

    public CadastraPosicoesModel criarPosicoes(CadastraPosicoesModel cadastraPosicoesModel) {
        return this.cadastraposicoesRepository.save(cadastraPosicoesModel);
    }
    public List<CadastraPosicoesModel> findAll() {
        return this.cadastraposicoesRepository.findAll();
    }

    public List<CadastraPosicoesModel> findByPlaca(String placa){
        return this.cadastraposicoesRepository.findByPlaca(placa);
    }

    public List<CadastraPosicoesModel> findByPlacaData(String placa, String data){
        data = "%"+data+"%";
        return this.cadastraposicoesRepository.findByPlacaData(placa, data);
    }
}
