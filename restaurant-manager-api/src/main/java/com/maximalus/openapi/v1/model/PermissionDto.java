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
 * User permissions info
 */
public enum PermissionDto {
  
  ADMINISTRATOR("ADMINISTRATOR"),
  
  GENERAL_MANAGER("GENERAL_MANAGER"),
  
  FOOD_AND_BEVERAGE_DEPARTMENT("FOOD_AND_BEVERAGE_DEPARTMENT"),
  
  ACCOUNTING_DEPARTMENT("ACCOUNTING_DEPARTMENT"),
  
  STORAGE_DEPARTMENT("STORAGE_DEPARTMENT"),
  
  RESTAURANT_MANAGER("RESTAURANT_MANAGER"),
  
  ASSISTANT_MANAGER("ASSISTANT_MANAGER"),
  
  HEAD_WAITER("HEAD_WAITER"),
  
  CASHIER("CASHIER"),
  
  WAITER("WAITER");

  private String value;

  PermissionDto(String value) {
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
  public static PermissionDto fromValue(String value) {
    for (PermissionDto b : PermissionDto.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

