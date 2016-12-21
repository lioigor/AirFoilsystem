package com.lioigor22.dao;

import java.util.List;

import com.lioigor22.objects.Experiment;

public interface ExperimentDAO {

	public void addExperiment(Experiment p);

	public void updateExperiment(Experiment p);

	public List<Experiment> listExperiments();

	public Experiment getExperimentById(int id);

	public void removeExperiment(int id);

}
