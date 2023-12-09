package com.astrainnovations.foodgetic.rest.commons;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
public class BaseEntity {
    @Id
    @Field(value = "_id", write = Field.Write.ALWAYS)
    private ObjectId id;

    @Field(value = "created_time", write = Field.Write.ALWAYS)
    private LocalDateTime createdTime;

    @Field(value = "updated_time", write = Field.Write.ALWAYS)
    private LocalDateTime updatedTime;

    @Field(value = "deleted_time", write = Field.Write.ALWAYS)
    private LocalDateTime deletedTime;

    @Field(value = "deleted", write = Field.Write.ALWAYS)
    private Boolean deleted;
}
