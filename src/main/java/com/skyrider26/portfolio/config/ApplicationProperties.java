package com.skyrider26.portfolio.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Skyrider 26 Application.
 * <p>
 * Properties are configured in the application.yml file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

}
