package com.maximalus.openapi.v1.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Order statuses
 */
public enum OrderStatusDto {
  
  PUBLISHED("PUBLISHED"),
  
  EDITED("EDITED"),
  
  DIVIDED("DIVIDED"),
  
  CLOSED("CLOSED"),
  
  PARTIAL_PAID("PARTIAL_PAID"),
  
  FULLY_PAID("FULLY_PAID");

  private String value;

  OrderStatusDto(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderStatusDto fromValue(String value) {
    for (OrderStatusDto b : OrderStatusDto.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

