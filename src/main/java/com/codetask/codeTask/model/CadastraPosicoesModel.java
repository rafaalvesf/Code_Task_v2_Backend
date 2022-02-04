package com.codetask.codeTask.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "posicoes")
public class CadastraPosicoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "placa", nullable = false)
    private String placa;
    @Column(name = "data_posicao", nullable = false)
    private String data_posicao;
    @Column(name = "velocidade", nullable = false)
    private String velocidade;
    @Column(name = "longitude", nullable = false)
    private String longitude;
    @Column(name = "latitude", nullable = false)
    private String latitude;
    @Column(name = "ignicao", nullable = false)
    private String ignicao;
}
