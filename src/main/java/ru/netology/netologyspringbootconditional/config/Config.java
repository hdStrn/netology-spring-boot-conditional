package ru.netology.netologyspringbootconditional.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.netologyspringbootconditional.profile.DevProfile;
import ru.netology.netologyspringbootconditional.profile.ProductionProfile;
import ru.netology.netologyspringbootconditional.profile.SystemProfile;

@Configuration
public class Config {

    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "true", matchIfMissing = true)
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "false")
    public SystemProfile productionProfile() {
        return new ProductionProfile();
    }
}
