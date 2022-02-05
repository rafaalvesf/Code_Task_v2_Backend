package com.codetask.codeTask.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class GetTempoModel {


    private String nome;

    private String placa;

    private String tempo;
}
