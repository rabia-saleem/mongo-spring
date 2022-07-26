package com.spring.mongo.domain;

import com.google.common.base.MoreObjects;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("testdocument")
@TypeAlias("TestDocument")
public class TestDocument {



  public static final String FIELD_ID = "_id";
  public static final String FIELD_USER_ID = "userId";


  @Id
  @Field(FIELD_ID)
  private final String id;

  /** Contains travelerId but the userId notion kept for extensibility */
  @Indexed
  @Field(FIELD_USER_ID)
  private final String userId;



  public TestDocument(
      String id,
      String userId) {
    this.id = id;
    this.userId = userId;

  }



  /** Truncate to milliseconds, the precision supported by mongodb */


  public String getId() {
    return id;
  }

  public String getUserId() {
    return userId;
  }



  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("id", id)
        .add("userId", userId)

        .toString();
  }
}
