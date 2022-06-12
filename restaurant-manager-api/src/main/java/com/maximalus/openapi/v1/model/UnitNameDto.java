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
 * Menu item statuses
 */
public enum UnitNameDto {
  
  LITER("Liter"),
  
  MILLILITER("Milliliter"),
  
  KILOGRAM("Kilogram"),
  
  GRAM("Gram"),
  
  PACK("Pack"),
  
  BOTTLE("Bottle");

  private String value;

  UnitNameDto(String value) {
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
  public static UnitNameDto fromValue(String value) {
    for (UnitNameDto b : UnitNameDto.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

