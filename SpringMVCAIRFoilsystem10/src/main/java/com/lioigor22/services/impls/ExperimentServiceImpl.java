package com.lioigor22.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lioigor22.dao.ExperimentDAO;
import com.lioigor22.objects.Experiment;
import com.lioigor22.services.ExperimentService;
import com.sun.xml.ws.api.tx.at.Transactional;

@Service

public class ExperimentServiceImpl implements ExperimentService {

	@Autowired
	private ExperimentDAO experimentDAO;

	@Override
	@Transactional
	public void add(Experiment experiment) {
		this.experimentDAO.saveAndFlush(experiment);
	}

	@Override
	@Transactional
	public void update(Experiment experiment) {

		this.experimentDAO.saveAndFlush(experiment);

	}

	@Override
	@Transactional
	public List<Experiment> findAll() {

		return experimentDAO.findAll();
	}

	@Override
	@Transactional
	public Experiment getById(Long id) {

		return this.experimentDAO.getOne(id);
	}

	@Override
	@Transactional
	public void removeById(Long id) {
		this.experimentDAO.delete(id);
	}

}
