package com.lioigor22.objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * Entity bean with JPA annotations Hibernate provides JPA implementation**
 * 
 * @author lio
 *
 */
@Entity
@Table(name = "experiment")

public class Experiment {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "temperature")
	private double temperature;

	@Column(name = "pressure")
	private double pressure;

	@Column(name = "flowVelocity")
	private int flowVelocity;

	@Column(name = "kinematicViscosity")
	private double kinematicViscosity;

	@Column(name = "diameterOfProbes")
	private double diameterOfProbes;

	@Column(name = "tubeSize")
	private double tubeSize;

	@Column(name = "powerEngine")
	private double powerEngine;

	public Experiment() {
		super();
		this.id = new Long(0);
		this.name = "";
		this.temperature = 0.0;
		this.pressure = 0.0;
		this.flowVelocity = 0;
		this.kinematicViscosity = 0.0;
		this.diameterOfProbes = 0.0;
		this.tubeSize = 0.0;
		this.powerEngine = 0.0;
	}

	public Experiment(Long id, String name, double temperature, double pressure, int flowVelocity, double kinematicViscosity, double diameterOfProbes, double tubeSize, double powerEngine) {
		super();
		this.id = id;
		this.name = name;
		this.temperature = temperature;
		this.pressure = pressure;
		this.flowVelocity = flowVelocity;
		this.kinematicViscosity = kinematicViscosity;
		this.diameterOfProbes = diameterOfProbes;
		this.tubeSize = tubeSize;
		this.powerEngine = powerEngine;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public int getFlowVelocity() {
		return flowVelocity;
	}

	public void setFlowVelocity(int flowVelocity) {
		this.flowVelocity = flowVelocity;
	}

	public double getKinematicViscosity() {
		return kinematicViscosity;
	}

	public void setKinematicViscosity(double kinematicViscosity) {
		this.kinematicViscosity = kinematicViscosity;
	}

	public double getDiameterOfProbes() {
		return diameterOfProbes;
	}

	public void setDiameterOfProbes(double diameterOfProbes) {
		this.diameterOfProbes = diameterOfProbes;
	}

	public double getTubeSize() {
		return tubeSize;
	}

	public void setTubeSize(double tubeSize) {
		this.tubeSize = tubeSize;
	}

	public double getPowerEngine() {
		return powerEngine;
	}

	public void setPowerEngine(double powerEngine) {
		this.powerEngine = powerEngine;
	}

}
