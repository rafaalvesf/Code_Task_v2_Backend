package com.codetask.codeTask.service;

import com.codetask.codeTask.controller.POIController;
import com.codetask.codeTask.controller.PosicoesController;
import com.codetask.codeTask.model.POIModel;
import com.codetask.codeTask.model.PosicoesModel;
import com.codetask.codeTask.model.GetTempoModel;
import com.codetask.codeTask.service.funcoes.FuncoesCalculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GetTempoService {
    @Autowired
    POIController POIController;
    @Autowired
    PosicoesController posicoesController;
    @Autowired
    FuncoesCalculo funcoesCalculo;


    public List<GetTempoModel> getTempo() {

        //Declarando Listas
        ArrayList<POIModel> listaPOi = new ArrayList();
        ArrayList<PosicoesModel> listaPosicoes = new ArrayList();

        listaPOi.addAll(POIController.findAll());
        listaPosicoes.addAll(posicoesController.findAll());

        ArrayList<GetTempoModel> calculoTempo = new ArrayList();

        //Verificando em qual POI o veículo se encontra atualmente

        for (POIModel ponto : listaPOi
        ) {
            Map<String, Integer> placas = new HashMap<String, Integer>();

            for (PosicoesModel posicoes : listaPosicoes) {

                //calcula se Veículo está está dentro do raio
                Double dpc;
                dpc = funcoesCalculo.calculaRaio(ponto.getLatitude(),
                        ponto.getLongitude(), posicoes.getLatitude(), posicoes.getLongitude());

                //Verifica se o veiculo atual está dentro do raio
                if (dpc <= (ponto.getRaio())) {

                    //funcao paleativa p somar tempo
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

                GetTempoModel localizacaoVeiculo = new GetTempoModel(ponto.getNome(), placasETempo.getKey(), placasETempo.getValue() * 30);
                calculoTempo.add(localizacaoVeiculo);
            }
        }

        return calculoTempo;
    }

    //
    public List<GetTempoModel> getTempoByPlaca(String placa) {

        //Declarando Listas
        ArrayList<POIModel> listaPOi = new ArrayList();
        ArrayList<PosicoesModel> listaPosicoes = new ArrayList();

        listaPOi.addAll(POIController.findAll());
        listaPosicoes.addAll(posicoesController.findByPlaca(placa));

        ArrayList<GetTempoModel> calculoTempo = new ArrayList();

        //Verificando em qual POI o veículo se encontra atualmente

        for (POIModel ponto : listaPOi
        ) {
            Map<String, Integer> placas = new HashMap<String, Integer>();

            for (PosicoesModel posicoes : listaPosicoes) {

                //calcula se Veículo está está dentro do raio
                Double dpc;
                dpc = funcoesCalculo.calculaRaio(ponto.getLatitude(),
                        ponto.getLongitude(), posicoes.getLatitude(), posicoes.getLongitude());

                //Verifica se o veiculo atual está dentro do raio
                if (dpc <= (ponto.getRaio())) {

                    //funcao paleativa p somar tempo
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

                GetTempoModel localizacaoVeiculo = new GetTempoModel(ponto.getNome(), placasETempo.getKey(), placasETempo.getValue() * 30);
                calculoTempo.add(localizacaoVeiculo);
            }
        }

        return calculoTempo;
    }

    //
    public List<GetTempoModel> getTempoByPlacaData(String placa, String data) {

        //Declarando Listas
        ArrayList<POIModel> listaPOi = new ArrayList();
        ArrayList<PosicoesModel> listaPosicoes = new ArrayList();

        listaPOi.addAll(POIController.findAll());
        listaPosicoes.addAll(posicoesController.findByPlacaData(placa, data));

        ArrayList<GetTempoModel> calculoTempo = new ArrayList();

        //Verificando em qual POI o veículo se encontra atualmente

        for (POIModel ponto : listaPOi
        ) {
            Map<String, Integer> placas = new HashMap<String, Integer>();

            for (PosicoesModel posicoes : listaPosicoes) {

                //calcula se Veículo está está dentro do raio
                Double dpc;
                dpc = funcoesCalculo.calculaRaio(ponto.getLatitude(),
                        ponto.getLongitude(), posicoes.getLatitude(), posicoes.getLongitude());

                //Verifica se o veiculo atual está dentro do raio
                if (dpc <= (ponto.getRaio())) {

                    //funcao paleativa p somar tempo
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

                GetTempoModel localizacaoVeiculo = new GetTempoModel(ponto.getNome(), placasETempo.getKey(), placasETempo.getValue() * 30);
                calculoTempo.add(localizacaoVeiculo);
            }
        }

        return calculoTempo;
    }
}
