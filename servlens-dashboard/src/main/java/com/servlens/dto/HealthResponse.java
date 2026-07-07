
package com.servlens.dto;

/**
 * DTO summarizing health across monitored microservices.
 */

public class HealthResponse {

	private int totalServices;

	private int healthyServices;

	private int unhealthyServices;

	/** Average response time in milliseconds across services */
	private double averageResponseTime;

	public HealthResponse() {
	}

	public HealthResponse(int totalServices, int healthyServices, int unhealthyServices, double averageResponseTime) {
		this.totalServices = totalServices;
		this.healthyServices = healthyServices;
		this.unhealthyServices = unhealthyServices;
		this.averageResponseTime = averageResponseTime;
	}

	public int getTotalServices() {
		return totalServices;
	}

	public void setTotalServices(int totalServices) {
		this.totalServices = totalServices;
	}

	public int getHealthyServices() {
		return healthyServices;
	}

	public void setHealthyServices(int healthyServices) {
		this.healthyServices = healthyServices;
	}

	public int getUnhealthyServices() {
		return unhealthyServices;
	}

	public void setUnhealthyServices(int unhealthyServices) {
		this.unhealthyServices = unhealthyServices;
	}

	public double getAverageResponseTime() {
		return averageResponseTime;
	}

	public void setAverageResponseTime(double averageResponseTime) {
		this.averageResponseTime = averageResponseTime;
	}

}
