# spring-cosmosdb

Hello world application for saving and loading data to/from azure cosmosdb

issues using custom CosmosConfiguration as per https://docs.microsoft.com/en-us/azure/developer/java/spring-framework/how-to-guides-spring-data-cosmosdb

`Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.azure.data.cosmos.CosmosClient]: Factory method 'cosmosClient' threw exception; nested exception is java.lang.IllegalArgumentException: Input byte array has incorrect ending byte at 88
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:185) ~[spring-beans-5.2.6.RELEASE.jar:5.2.6.RELEASE]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:651) ~[spring-beans-5.2.6.RELEASE.jar:5.2.6.RELEASE]
	... 84 common frames omitted
Caused by: java.lang.IllegalArgumentException: Input byte array has incorrect ending byte at 88
	at java.util.Base64$Decoder.decode0(Base64.java:742) ~[na:1.8.0_241]
	at java.util.Base64$Decoder.decode(Base64.java:526) ~[na:1.8.0_241]
	at com.azure.data.cosmos.internal.BaseAuthorizationTokenProvider.getMacInstance(BaseAuthorizationTokenProvider.java:251) ~[azure-cosmos-3.7.3.jar:na]
`	
same issue without using a custom configuration and @EnableCosmosRepositories

`Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.microsoft.azure.spring.data.cosmosdb.core.CosmosTemplate]: Factory method 'cosmosTemplate' threw exception; nested exception is java.lang.IllegalArgumentException: Input byte array has incorrect ending byte at 88
Caused by: java.lang.IllegalArgumentException: Input byte array has incorrect ending byte at 88`