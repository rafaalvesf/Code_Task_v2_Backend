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
public class POIModel implements Serializable {
    @Id
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "raio", nullable = false)
    private Double raio;
    @Column(name = "latitude", nullable = false)
    private Double latitude;
    @Column(name = "longitude", nullable = false)
    private Double longitude;

}
