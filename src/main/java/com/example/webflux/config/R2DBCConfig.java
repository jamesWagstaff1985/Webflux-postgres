package com.example.webflux.config;

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;

@Configuration
class R2DBCConfig extends AbstractR2dbcConfiguration {

    @Value("${db.host}")
    String host;
    @Value("${db.port}")
    Integer port;
    @Value("${db.user}")
    String user;
    @Value("${db.pass}")
    String pass;
    @Value("${db.table}")
    String database;

    @Bean
    @Override
    public ConnectionFactory connectionFactory() {
        return new PostgresqlConnectionFactory(
                PostgresqlConnectionConfiguration.builder()
                        .host(host)
                        .port(port)
                        .username(user)
                        .password(pass)
                        .database(database)
                        .build());
    }
}
