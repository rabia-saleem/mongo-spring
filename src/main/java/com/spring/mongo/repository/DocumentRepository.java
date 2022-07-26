package com.spring.mongo.repository;


import com.spring.mongo.domain.TestDocument;
import java.util.Optional;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DocumentRepository {


  private final MongoTemplate mongoTemplate;

  public DocumentRepository(MongoTemplate mongoTemplate) {
    this.mongoTemplate = mongoTemplate;
  }

  public Optional<TestDocument> findById(String id) {
    return Optional.ofNullable(mongoTemplate.findById(id,TestDocument.class));
  }

  public TestDocument save(TestDocument document) {
    return mongoTemplate.save(document);
  }

}
