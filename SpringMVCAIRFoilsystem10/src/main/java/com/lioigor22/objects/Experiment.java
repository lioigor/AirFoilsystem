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
	private int id;

	private String name;

	private double temperature;

	private double pressure;

	private int flowVelocity;

	private double kinematicViscosity;

	private double diameterOfProbes;

	private double tubeSize;

	private double powerEngine;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(diameterOfProbes);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + flowVelocity;
		result = prime * result + id;
		temp = Double.doubleToLongBits(kinematicViscosity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(powerEngine);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(pressure);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(temperature);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(tubeSize);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Experiment other = (Experiment) obj;
		if (Double.doubleToLongBits(diameterOfProbes) != Double.doubleToLongBits(other.diameterOfProbes))
			return false;
		if (flowVelocity != other.flowVelocity)
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(kinematicViscosity) != Double.doubleToLongBits(other.kinematicViscosity))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(powerEngine) != Double.doubleToLongBits(other.powerEngine))
			return false;
		if (Double.doubleToLongBits(pressure) != Double.doubleToLongBits(other.pressure))
			return false;
		if (Double.doubleToLongBits(temperature) != Double.doubleToLongBits(other.temperature))
			return false;
		if (Double.doubleToLongBits(tubeSize) != Double.doubleToLongBits(other.tubeSize))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Experiment [id=" + id + ", name=" + name + ", temperature=" + temperature + ", pressure=" + pressure + ", flowVelocity=" + flowVelocity + ", kinematicViscosity=" + kinematicViscosity + ", diameterOfProbes=" + diameterOfProbes
				+ ", tubeSize=" + tubeSize + ", powerEngine=" + powerEngine + "]";
	}

}
