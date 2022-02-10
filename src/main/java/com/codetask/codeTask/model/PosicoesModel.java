package com.codetask.codeTask.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "posicoes")
public class PosicoesModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "placa", nullable = false)
    private String placa;
    @Column(name = "data_posicao", nullable = false)
    private String data_posicao;
    @Column(name = "velocidade", nullable = false)
    private Double velocidade;
    @Column(name = "longitude", nullable = false)
    private Double longitude;
    @Column(name = "latitude", nullable = false)
    private Double latitude;
    @Column(name = "ignicao", nullable = false)
    private Boolean ignicao;

}
