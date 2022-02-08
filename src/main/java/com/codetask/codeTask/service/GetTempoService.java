package com.codetask.codeTask.service;

import com.codetask.codeTask.controller.CadastraPOIController;
import com.codetask.codeTask.controller.CadastraPosicoesController;
import com.codetask.codeTask.model.CadastraPOIModel;
import com.codetask.codeTask.model.CadastraPosicoesModel;
import com.codetask.codeTask.model.GetTempoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.*;

@Service
public class GetTempoService {
    @Autowired
    CadastraPOIController cadastraPOIController;
    @Autowired
    CadastraPosicoesController cadastraPosicoesController;


    public List<GetTempoModel> getTempo() {

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
                //calcula se está no raio
                Double dpc;
                dpc = (637100 *
                        acos(
                                cos(Math.toRadians(ponto.getLatitude())) *
                                        cos(Math.toRadians(posicoes.getLatitude())) *
                                        cos(Math.toRadians(ponto.getLongitude()) - Math.toRadians(posicoes.getLongitude())) +
                                        sin(Math.toRadians(ponto.getLatitude())) *
                                                sin(Math.toRadians(posicoes.getLatitude()))));

                if (dpc <= (ponto.getRaio())) {

                    if (placas.containsKey(posicoes.getPlaca())) {
                        Integer tes = (placas.get(posicoes.getPlaca()));
                        tes += 1;
                        placas.put(posicoes.getPlaca(), tes);
                    } else {
                        placas.put(posicoes.getPlaca(), 1);
                    }

                }
            }
            for (Map.Entry<String, Integer> placasETempo : placas.entrySet()) {

                GetTempoModel localizacaoVeiculo = new GetTempoModel(ponto.getNome(), placasETempo.getKey(), (placasETempo.getValue() * 30));
                calculoTempo.add(localizacaoVeiculo);
            }

        }

        //Verifica o Tempo em cada POI



        /*String teste = listaPOi.get(1).getNome();
        String teste1 = listaPOi.get(2).getNome();

        GetTempoModel g1 = new GetTempoModel(teste1,"testexcbv","testesdfgxc");
        GetTempoModel g2 = new GetTempoModel(teste,"testewer","testesdfsd");

        ArrayList<GetTempoModel> listaTeste = new ArrayList();
        listaTeste.add(g1);
        listaTeste.add(g2);
        */
        return calculoTempo;
    }


}
