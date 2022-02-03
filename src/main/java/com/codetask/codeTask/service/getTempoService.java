package com.codetask.codeTask.service;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

@Data
@Document(collection = "estoque")
public class getTempoService {

    private String tempoPassado;

}
