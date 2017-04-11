package com.lioigor22.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lioigor22.objects.Experiment;

@Repository
public interface ExperimentDAO extends JpaRepository<Experiment, Long> {

}
