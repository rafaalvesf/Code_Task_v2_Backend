package com.codetask.codeTask.repository;

import com.codetask.codeTask.model.CadastraPosicoesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastraposicoesRepository extends JpaRepository<CadastraPosicoesModel, Long> {
}
