package org.coderearth.springbootkitchen.bootscheduler;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class BootschedulerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(AppConfig.class)
                .run(args);
	}
}
