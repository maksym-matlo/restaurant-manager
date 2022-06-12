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
public enum MenuItemStatusDto {
  
  IN_STOCK("IN_STOCK"),
  
  ROLLING_OUT("ROLLING_OUT"),
  
  DOES_NOT_EXIST("DOES_NOT_EXIST");

  private String value;

  MenuItemStatusDto(String value) {
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
  public static MenuItemStatusDto fromValue(String value) {
    for (MenuItemStatusDto b : MenuItemStatusDto.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

