package com.astrainnovations.foodgetic.rest.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CustomerCreateRequestDto {
    @JsonProperty(value = "nick_name")
    private String nickName;

    @JsonProperty(value = "customer_type")
    private String customerType;

    @JsonProperty(value = "logo_url")
    private String logoUrl;

    @JsonProperty(value = "user_name")
    private String userName;

    @JsonProperty(value = "password")
    private String password;

    @JsonProperty(value = "latitude")
    private Double latitude;

    @JsonProperty(value = "longitude")
    private Double longitude;

    @JsonProperty(value = "country")
    private String country;

    @JsonProperty(value = "city")
    private String city;

    @JsonProperty(value = "county")
    private String county;

    @JsonProperty(value = "district")
    private String district;

    @JsonProperty(value = "address")
    private String address;
}
