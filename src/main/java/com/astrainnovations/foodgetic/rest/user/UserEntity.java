package com.astrainnovations.foodgetic.rest.user;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "user")
public class UserEntity {
    @Field(value = "nick_name", write = Field.Write.ALWAYS)
    private String nickName;

    @Field(value = "user_name", write = Field.Write.ALWAYS)
    private String userName;

    @Field(value = "password", write = Field.Write.ALWAYS)
    private String password;

    @Field(value = "logo_url", write = Field.Write.ALWAYS)
    private String logoUrl;

    @Field(value = "country", write = Field.Write.ALWAYS)
    private String country;

    @Field(value = "city", write = Field.Write.ALWAYS)
    private String city;

    @Field(value = "county", write = Field.Write.ALWAYS)
    private String county;

    @Field(value = "district", write = Field.Write.ALWAYS)
    private String district;

    @Field(value = "address", write = Field.Write.ALWAYS)
    private String address;
}
