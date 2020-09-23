package jp.ivan.swadeshnessproject.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="configuration")
public class SwadeshnessProperties {
}
