package com.thxran.dropbox.config;

import com.thxran.dropbox.utils.CUID;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class AppConfig {
    @Bean
    public CUID cuid() {
        return new CUID();
    }
}
