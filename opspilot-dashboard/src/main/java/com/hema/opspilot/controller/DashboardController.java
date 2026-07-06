
package com.hema.opspilot.controller;

import com.hema.opspilot.model.MicroserviceInfo;
import com.hema.opspilot.service.DashboardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

	private final DashboardService dashboardService;

	public DashboardController(DashboardService dashboardService) {
		this.dashboardService = dashboardService;
	}

	@GetMapping("/services")
	public List<MicroserviceInfo> getServices() {
		return dashboardService.getAllServices();
	}

}
