package com.codetask.codeTask.service.funcoes;

import org.springframework.stereotype.Service;

import static java.lang.Math.*;

@Service
public class FuncoesCalculo {

    public Double calculaRaio(Double latitudePonto,Double longitudePonto, Double latitudePosicoes,Double longitudePosicoes ){
       Double Raio = 637100 *
                acos(
                        cos(toRadians(latitudePonto)) *
                                cos(toRadians(latitudePosicoes)) *
                                cos(toRadians(longitudePonto) - toRadians(longitudePosicoes)) +
                                sin(toRadians(latitudePonto)) *
                                        sin(toRadians(latitudePosicoes)));

                return Raio;
    }

}
