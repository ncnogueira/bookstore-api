package com.natercio.biblioteca.config;

import com.natercio.biblioteca.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

    @Autowired
    private DBService dbService;

    @Value("${spring.jpa.hibernate.dll-auto}")
    private String strategy;

    @Bean
    public boolean instanciaBaseDeDados(){
        if(strategy.equals("create")){
            this.dbService.instanciaBaseDeDados();
        }
        return false;
    }

}
