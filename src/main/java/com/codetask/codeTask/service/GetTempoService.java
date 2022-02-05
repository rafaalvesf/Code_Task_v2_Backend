package com.codetask.codeTask.service;

import com.codetask.codeTask.controller.CadastraPOIController;
import com.codetask.codeTask.controller.CadastraPosicoesController;
import com.codetask.codeTask.model.CadastraPOIModel;
import com.codetask.codeTask.model.CadastraPosicoesModel;
import com.codetask.codeTask.model.GetTempoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetTempoService {
    @Autowired
    CadastraPOIController cadastraPOIController;
    CadastraPosicoesController cadastraPosicoesController;

    ArrayList<CadastraPOIModel> listaPOi = new ArrayList();
    ArrayList<CadastraPosicoesModel> listaPosicoes = new ArrayList();


    public List<GetTempoModel> getTempo() {
        ArrayList<GetTempoModel> listaTempo = new ArrayList();

        String teste = retornaNome();

        listaTempo.add(new GetTempoModel(teste, "teste", "teste"));
        listaTempo.add(new GetTempoModel("teste", "teste", "teste"));
        listaTempo.add(new GetTempoModel("teste", "teste", "teste"));


        return listaTempo;
    }
    public String retornaNome(){
        listaPOi.addAll(cadastraPOIController.findAll());
        listaPosicoes.addAll(cadastraPosicoesController.findAll());

        String teste = listaPOi.get(1).getNome();

    return teste;
    }
}
