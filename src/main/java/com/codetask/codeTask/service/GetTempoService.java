package com.codetask.codeTask.service;

import com.codetask.codeTask.controller.CadastraPOIController;
import com.codetask.codeTask.controller.CadastraPosicoesController;
import com.codetask.codeTask.model.CadastraPOIModel;
import com.codetask.codeTask.model.CadastraPosicoesModel;
import com.codetask.codeTask.model.GetTempoModel;
import com.codetask.codeTask.service.funcoes.FuncoesCalculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GetTempoService {
    @Autowired
    CadastraPOIController cadastraPOIController;
    @Autowired
    CadastraPosicoesController cadastraPosicoesController;
    @Autowired
    FuncoesCalculo funcoesCalculo;


    public List<GetTempoModel> getTempo() {

        //Declarando Listas
        ArrayList<CadastraPOIModel> listaPOi = new ArrayList();
        ArrayList<CadastraPosicoesModel> listaPosicoes = new ArrayList();

        listaPOi.addAll(cadastraPOIController.findAll());
        listaPosicoes.addAll(cadastraPosicoesController.findAll());

        ArrayList<GetTempoModel> calculoTempo = new ArrayList();

        //Verificando em qual POI o veículo se encontra atualmente

        for (CadastraPOIModel ponto : listaPOi
        ) {
            Map<String, Integer> placas = new HashMap<String, Integer>();

            for (CadastraPosicoesModel posicoes : listaPosicoes) {

                //calcula se Veículo está está dentro do raio
                Double dpc;
                dpc =  funcoesCalculo.calculaRaio(ponto.getLatitude(),
                        ponto.getLongitude(),posicoes.getLatitude(),posicoes.getLongitude());

                //Verifica se o veiculo atual está dentro do raio
                if (dpc <= (ponto.getRaio())) {

                    if (placas.containsKey(posicoes.getPlaca())) {
                            Integer tes = (placas.get(posicoes.getPlaca()));
                            tes += 1;
                            placas.put(posicoes.getPlaca(), tes);
                    }
                    else {
                        placas.put(posicoes.getPlaca(), 1);
                    }
                }
            }
            for (Map.Entry<String, Integer> placasETempo : placas.entrySet()) {

                GetTempoModel localizacaoVeiculo = new GetTempoModel(ponto.getNome(), placasETempo.getKey(), placasETempo.getValue()*30);
                calculoTempo.add(localizacaoVeiculo);
            }
        }

        return calculoTempo;
    }
}
