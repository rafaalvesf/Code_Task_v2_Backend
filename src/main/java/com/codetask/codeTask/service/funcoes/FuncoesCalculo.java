package com.codetask.codeTask.service.funcoes;

import org.springframework.stereotype.Service;

import static java.lang.Math.*;

@Service
public class FuncoesCalculo {

    public Double calculaRaio(Double latitudePonto, Double longitudePonto, Double latitudePosicoes, Double longitudePosicoes) {
        Double Raio = 637100 *
                acos(
                        cos(toRadians(latitudePonto)) *
                                cos(toRadians(latitudePosicoes)) *
                                cos(toRadians(longitudePonto) - toRadians(longitudePosicoes)) +
                                sin(toRadians(latitudePonto)) *
                                        sin(toRadians(latitudePosicoes)));

        return Raio;
    }

    public String converteData(String Data) {
        String dataRecebida = Data;
        String dia = dataRecebida.substring(8, 10);
        String mes = dataRecebida.substring(4, 7);
        String ano = dataRecebida.substring(11, 15);

        String hora = dataRecebida.substring(16, 18);
        String minutos = dataRecebida.substring(19, 21);
        String segundos = dataRecebida.substring(22, 24);

        String data = (dia + "/" + mes + "/" + ano + " " + hora + ":" + minutos + ":" + segundos);

        return data;
    }

    public String converteDataMenosTrintaS(String Data) {
        String dataRecebida = Data;
        String dia = dataRecebida.substring(8, 10);
        String mes = dataRecebida.substring(4, 7);
        String ano = dataRecebida.substring(11, 15);

        String hora = dataRecebida.substring(16, 18);
        String minutos = dataRecebida.substring(19, 21);
        String segundos = dataRecebida.substring(22, 24);


        Integer h = Integer.parseInt(hora);
        Integer min = Integer.parseInt(minutos);
        Integer seg = Integer.parseInt(segundos);

        h = ((h * 60) * 60);
        min = (min * 60);

        Integer totalSegundos = (h + min + seg) - 1803;

        h = totalSegundos / 3600;
        totalSegundos %= 3600;
        min = totalSegundos / 60;
        totalSegundos %= 60;

        hora = String.valueOf(h);
        minutos = String.valueOf(min);
        segundos = String.valueOf(totalSegundos);

        String data = (dia + "/" + mes + "/" + ano + " " + hora + ":" + minutos + ":" + segundos);

        return data;
    }

}
