package com.codetask.codeTask.repository;

import com.codetask.codeTask.model.GetTempoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GetTempoRepository extends JpaRepository<GetTempoModel,Long> {

}
