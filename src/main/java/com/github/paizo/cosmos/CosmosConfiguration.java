package com.github.paizo.cosmos;

import com.microsoft.azure.spring.data.cosmosdb.repository.config.EnableCosmosRepositories;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@EnableCosmosRepositories
public class CosmosConfiguration {
}
