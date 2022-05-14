package com.maximalus.openapi.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * User permissions info
 */
public enum Permission {
  
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

  Permission(String value) {
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
  public static Permission fromValue(String value) {
    for (Permission b : Permission.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

