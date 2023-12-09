package com.astrainnovations.foodgetic.rest.customer;

import com.astrainnovations.foodgetic.rest.commons.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "customer")
public class CustomerEntity extends BaseEntity {
    @Field(value = "customer_id", write = Field.Write.ALWAYS)
    private Long customerId;

    @Field(value = "user_id", write = Field.Write.ALWAYS)
    private Long userId;

    @Field(value = "customer_type", write = Field.Write.ALWAYS)
    private String customerType;

    @Field(value = "latitude", write = Field.Write.ALWAYS)
    private Double latitude;

    @Field(value = "longitude", write = Field.Write.ALWAYS)
    private Double longitude;
}
