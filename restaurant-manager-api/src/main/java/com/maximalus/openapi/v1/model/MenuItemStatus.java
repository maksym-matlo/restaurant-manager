package com.maximalus.openapi.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Menu item statuses
 */
public enum MenuItemStatus {
  
  IN_STOCK("IN_STOCK"),
  
  ROLLING_OUT("ROLLING_OUT"),
  
  DOES_NOT_EXIST("DOES_NOT_EXIST");

  private String value;

  MenuItemStatus(String value) {
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
  public static MenuItemStatus fromValue(String value) {
    for (MenuItemStatus b : MenuItemStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

