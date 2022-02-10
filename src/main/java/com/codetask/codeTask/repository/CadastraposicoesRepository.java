package com.codetask.codeTask.repository;

import com.codetask.codeTask.model.CadastraPosicoesModel;
import org.hibernate.annotations.Filter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CadastraposicoesRepository extends JpaRepository<CadastraPosicoesModel, Long> {


    @Query("from CadastraPosicoesModel where placa = ?1")
    List<CadastraPosicoesModel> findByPlaca(String placa);


    @Query("from CadastraPosicoesModel where placa = ?1 AND data_posicao like ?2 ")
    List<CadastraPosicoesModel> findByPlacaData(String placa,String data);
}
