package com.codetask.codeTask.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class GetTempoModel implements Serializable {

    private String nome;
    private String placa;
    private Integer tempoemminutos;
}
