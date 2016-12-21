package com.lioigor22.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.lioigor22.objects.Experiment;

@Repository
public class ExperimentDAOImpl implements ExperimentDAO {

	private static final Logger logger = LoggerFactory.getLogger(ExperimentDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addExperiment(Experiment experiment) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(experiment);
		logger.info("Experiment saved successfully, Experiment Details=" + experiment);
	}

	@Override
	public void updateExperiment(Experiment experiment) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(experiment);
		logger.info("Experiment updated successfully, Experiment Details=" + experiment);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Experiment> listExperiments() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Experiment> experimentsList = session.createQuery("from Experiment").list();
		for (Experiment experiment : experimentsList) {
			logger.info("Experiment List::" + experiment);
		}
		return experimentsList;
	}

	@Override
	public Experiment getExperimentById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Experiment experiment = (Experiment) session.load(Experiment.class, new Integer(id));
		logger.info("Experiment loaded successfully, Experiment details=" + experiment);
		return experiment;
	}

	@Override
	public void removeExperiment(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Experiment experiment = (Experiment) session.load(Experiment.class, new Integer(id));
		if (null != experiment) {
			session.delete(experiment);
		}
		logger.info("Experiment deleted successfully, Experiment details=" + experiment);
	}

}
