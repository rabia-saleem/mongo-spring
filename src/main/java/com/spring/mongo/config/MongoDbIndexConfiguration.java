package com.spring.mongo.config;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.index.IndexOperations;
import org.springframework.data.mongodb.core.index.IndexResolver;
import org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexResolver;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

@Configuration
public class MongoDbIndexConfiguration {

  private static final Logger logger = LoggerFactory.getLogger(MongoDbIndexConfiguration.class);

  private final MongoTemplate mongoTemplate;
  private final MongoMappingContext mongoMappingContext;

  public MongoDbIndexConfiguration(
      MongoTemplate mongoTemplate, MongoMappingContext mongoMappingContext) {
    this.mongoTemplate = mongoTemplate;
    this.mongoMappingContext = mongoMappingContext;
  }

}
