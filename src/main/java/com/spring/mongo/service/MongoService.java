package com.spring.mongo.service;


import com.spring.mongo.domain.TestDocument;
import com.spring.mongo.dto.DocumentDto;
import com.spring.mongo.repository.DocumentRepository;
import org.springframework.stereotype.Service;

@Service
public class MongoService {


  private final DocumentRepository repo;

  public MongoService(DocumentRepository repo) {
    this.repo = repo;
  }

  public DocumentDto save(TestDocument document) {
     TestDocument save = repo.save(document);
      DocumentDto dto = new DocumentDto(save.getUserId());
        return dto;
  }


}
