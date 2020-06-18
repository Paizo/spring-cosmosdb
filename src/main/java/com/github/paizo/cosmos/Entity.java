package com.github.paizo.cosmos;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.PartitionKey;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Builder
@AllArgsConstructor
@Data
@Document
//@Document(collection = "testCosmos")
public class Entity {

    @Id
    @PartitionKey
    private String id;

    private String value;
}
