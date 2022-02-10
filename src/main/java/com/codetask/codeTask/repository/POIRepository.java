package com.codetask.codeTask.repository;

import com.codetask.codeTask.model.POIModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface POIRepository extends JpaRepository<POIModel, String> {
}
