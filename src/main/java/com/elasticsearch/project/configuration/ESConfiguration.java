package com.elasticsearch.project.configuration;

import org.elasticsearch.client.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages= {"com.elasticsearch.project.repository"})
@ComponentScan(basePackages = {"com.elasticsearch.project"} )
public class ESConfiguration extends AbstractElasticsearchConfiguration
{
    @Value("${elasticsearch.url}")
    public String elasticSearchURL;

    @Bean
    @Override
    public RestHighLevelClient elasticsearchClient() {
        final ClientConfiguration configuration = ClientConfiguration.builder().connectedTo(elasticSearchURL).build();
        return RestClients.create(configuration).rest();
    }
}