package org.coderearth.springbootkitchen.bootscheduler;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class PostmanEchoConnector {

    private static final Logger LOGGER = LoggerFactory.getLogger(PostmanEchoConnector.class);

    private LocalDateTime lastUpdatedDateTime;

    @Scheduled(fixedRate = 30000, initialDelay = 30000)
    public void refreshLastUpdatedDateTime() {
        LOGGER.debug("Starting refresh of lastUpdatedDateTime !!");
        LOGGER.debug("Refreshed lastUpdatedDateTime !!");
    }

}