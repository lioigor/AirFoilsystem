package com.lioigor22.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lioigor22.objects.Experiment;

public interface ExperimentDAO extends JpaRepository<Experiment, Long> {

	public void add(Experiment p);

	public void update(Experiment p);

	@Override
	public List<Experiment> findAll();

	public Experiment getById(Long id);

	public void removeById(Long id);

}
