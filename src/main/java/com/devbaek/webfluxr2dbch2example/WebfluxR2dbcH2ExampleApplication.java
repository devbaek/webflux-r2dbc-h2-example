package com.devbaek.webfluxr2dbch2example;

import io.r2dbc.spi.ConnectionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;

@SpringBootApplication
@EnableR2dbcRepositories
public class WebfluxR2dbcH2ExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxR2dbcH2ExampleApplication.class, args);
    }

    /**
     * schema.sql 실행
     */
    @Bean
    ConnectionFactoryInitializer databaseInitializer(@Qualifier("connectionFactory") ConnectionFactory connectionFactory) {
        ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
        initializer.setConnectionFactory(connectionFactory);
        initializer.setDatabasePopulator(new ResourceDatabasePopulator(new ClassPathResource("schema.sql")));

        return initializer;
    }
}
