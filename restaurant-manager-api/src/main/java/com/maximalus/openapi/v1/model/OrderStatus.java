package com.maximalus.openapi.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Order statuses
 */
public enum OrderStatus {
  
  PUBLISHED("PUBLISHED"),
  
  EDITED("EDITED"),
  
  DIVIDED("DIVIDED"),
  
  CLOSED("CLOSED"),
  
  PARTIAL_PAID("PARTIAL_PAID"),
  
  FULLY_PAID("FULLY_PAID");

  private String value;

  OrderStatus(String value) {
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
  public static OrderStatus fromValue(String value) {
    for (OrderStatus b : OrderStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

