package com.servlens.model;

import java.time.Instant;

/**
 * Simple mock model representing microservice runtime information.
 * This is not a JPA entity — Lombok is used to generate boilerplate.
 */
public class MicroserviceInfo {

	private String id;

	private String serviceName;

	/** e.g. UP, DOWN, DEGRADED */
	private String status;

	private String version;

	/** Response time in milliseconds */
	private long responseTime;

	/** CPU usage as percentage (0.0 - 100.0) */
	private double cpuUsage;

	/** Memory usage as percentage (0.0 - 100.0) */
	private double memoryUsage;

	/** Timestamp of the last update */
	private Instant lastUpdated;

	// No-arg constructor
	public MicroserviceInfo() {
	}

	// All-args constructor
	public MicroserviceInfo(String id, String serviceName, String status, String version, long responseTime,
							double cpuUsage, double memoryUsage, Instant lastUpdated) {
		this.id = id;
		this.serviceName = serviceName;
		this.status = status;
		this.version = version;
		this.responseTime = responseTime;
		this.cpuUsage = cpuUsage;
		this.memoryUsage = memoryUsage;
		this.lastUpdated = lastUpdated;
	}

	// Getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public long getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(long responseTime) {
		this.responseTime = responseTime;
	}

	public double getCpuUsage() {
		return cpuUsage;
	}

	public void setCpuUsage(double cpuUsage) {
		this.cpuUsage = cpuUsage;
	}

	public double getMemoryUsage() {
		return memoryUsage;
	}

	public void setMemoryUsage(double memoryUsage) {
		this.memoryUsage = memoryUsage;
	}

	public Instant getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Instant lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}