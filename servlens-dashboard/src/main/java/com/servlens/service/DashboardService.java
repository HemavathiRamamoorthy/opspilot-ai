
package com.servlens.service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.servlens.model.MicroserviceInfo;

@Service
public class DashboardService {

	public List<MicroserviceInfo> getAllServices() {
		List<MicroserviceInfo> services = new ArrayList<>();

		services.add(build("Customer Service", "UP", "1.2.0", 120, 12.5, 45.3));
		services.add(build("Payment Service", "UP", "2.0.1", 200, 25.1, 62.0));
		services.add(build("Notification Service", "DEGRADED", "1.0.5", 450, 55.0, 72.4));
		services.add(build("Kafka Service", "UP", "3.3.0", 80, 8.2, 30.0));
		services.add(build("Database Service", "DOWN", "12.1", 0, 0.0, 0.0));

		return services;
	}

	private MicroserviceInfo build(String name, String status, String version, long responseTime, double cpu, double memory) {
		MicroserviceInfo info = new MicroserviceInfo();
		info.setId(UUID.randomUUID().toString());
		info.setServiceName(name);
		info.setStatus(status);
		info.setVersion(version);
		info.setResponseTime(responseTime);
		info.setCpuUsage(cpu);
		info.setMemoryUsage(memory);
		info.setLastUpdated(Instant.now());
		return info;
	}

}
