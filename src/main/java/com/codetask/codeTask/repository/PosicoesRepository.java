package com.codetask.codeTask.repository;

import com.codetask.codeTask.model.PosicoesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PosicoesRepository extends JpaRepository<PosicoesModel, Long> {

    @Query("from PosicoesModel where placa = ?1")
    List<PosicoesModel> findByPlaca(String placa);

    @Query("from PosicoesModel where placa = ?1 AND data_posicao like ?2 ")
    List<PosicoesModel> findByPlacaData(String placa, String data);

}
