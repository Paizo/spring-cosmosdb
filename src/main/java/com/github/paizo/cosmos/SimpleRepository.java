package com.github.paizo.cosmos;

import com.microsoft.azure.spring.data.cosmosdb.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleRepository extends CosmosRepository<Entity, String> {
}

