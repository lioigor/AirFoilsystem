package com.lioigor22.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lioigor22.dao.ExperimentDAO;
import com.lioigor22.objects.Experiment;

@Service

public class ExperimentServiceImpl implements ExperimentService {

	@Autowired
	private ExperimentDAO ExperimentDAO;

	@Override
	@Transactional
	public void add(Experiment experiment) {
		this.ExperimentDAO.add(experiment);
	}

	@Override
	@Transactional
	public void update(Experiment experiment) {
		this.ExperimentDAO.update(experiment);
	}

	@Override
	@Transactional
	public List<Experiment> findAll() {
		return this.ExperimentDAO.findAll();
	}

	@Override
	@Transactional
	public Experiment getById(Long id) {
		return this.ExperimentDAO.getById(id);
	}

	@Override
	@Transactional
	public void removeById(Long id) {
		this.ExperimentDAO.removeById(id);
	}

}
