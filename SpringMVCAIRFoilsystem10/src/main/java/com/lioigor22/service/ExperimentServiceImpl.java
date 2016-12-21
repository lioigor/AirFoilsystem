package com.lioigor22.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lioigor22.dao.ExperimentDAO;
import com.lioigor22.objects.Experiment;

@Service

public class ExperimentServiceImpl implements ExperimentService {

	private ExperimentDAO ExperimentDAO;

	public void setExperimentDAO(ExperimentDAO ExperimentDAO) {
		this.ExperimentDAO = ExperimentDAO;
	}

	@Override
	@Transactional
	public void addExperiment(Experiment experiment) {
		this.ExperimentDAO.addExperiment(experiment);
	}

	@Override
	@Transactional
	public void updateExperiment(Experiment experiment) {
		this.ExperimentDAO.updateExperiment(experiment);
	}

	@Override
	@Transactional
	public List<Experiment> listExperiments() {
		return this.ExperimentDAO.listExperiments();
	}

	@Override
	@Transactional
	public Experiment getExperimentById(int id) {
		return this.ExperimentDAO.getExperimentById(id);
	}

	@Override
	@Transactional
	public void removeExperiment(int id) {
		this.ExperimentDAO.removeExperiment(id);
	}

}
