package com.lioigor22.service;

import java.util.List;

import com.lioigor22.objects.Experiment;

public interface ExperimentService {

	public void add(Experiment p);

	public void update(Experiment p);

	public List<Experiment> findAll();

	public Experiment getById(Long id);

	public void removeById(Long id);

}
