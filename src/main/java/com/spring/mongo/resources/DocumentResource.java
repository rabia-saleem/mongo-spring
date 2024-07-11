package com.spring.mongo.resources;


import com.spring.mongo.domain.TestDocument;
import com.spring.mongo.dto.DocumentDto;
import com.spring.mongo.service.MongoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/hello/document")

public class DocumentResource {
    private MongoService mongoService;

    public DocumentResource(MongoService mongoService) {
        this.mongoService = mongoService;
    }
    @RequestMapping(value="/test", method= RequestMethod.POST)
    public DocumentDto createEmployee(@RequestBody TestDocument dto) {
        return mongoService.save(dto);
    }
}
