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
@Table(name = "base_poi")
public class CadastraPOIModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "raio", nullable = false)
    private String raio;
    @Column(name = "latitude", nullable = false)
    private String latitude;
    @Column(name = "longitude", nullable = false)
    private String longitude;

}
