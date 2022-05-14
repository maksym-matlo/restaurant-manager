package com.maximalus.openapi.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.Objects;

/**
 * Short info about menu item specially for menu sheet
 */
@ApiModel(description = "Short info about menu item specially for menu sheet")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-03T11:47:28.437270400+03:00[Europe/Helsinki]")
public class MenuItemShortInfoDto   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("pricePerUnit")
  private Double pricePerUnit;

  @JsonProperty("menuItemGroup")
  private MenuItemGroupDto menuItemGroup;

  public MenuItemShortInfoDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "Cesar salad", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MenuItemShortInfoDto pricePerUnit(Double pricePerUnit) {
    this.pricePerUnit = pricePerUnit;
    return this;
  }

  /**
   * Get pricePerUnit
   * @return pricePerUnit
  */
  @ApiModelProperty(example = "120.00", value = "")


  public Double getPricePerUnit() {
    return pricePerUnit;
  }

  public void setPricePerUnit(Double pricePerUnit) {
    this.pricePerUnit = pricePerUnit;
  }

  public MenuItemShortInfoDto menuItemGroup(MenuItemGroupDto menuItemGroup) {
    this.menuItemGroup = menuItemGroup;
    return this;
  }

  /**
   * Get menuItemGroup
   * @return menuItemGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public MenuItemGroupDto getMenuItemGroup() {
    return menuItemGroup;
  }

  public void setMenuItemGroup(MenuItemGroupDto menuItemGroup) {
    this.menuItemGroup = menuItemGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuItemShortInfoDto menuItemShortInfo = (MenuItemShortInfoDto) o;
    return Objects.equals(this.name, menuItemShortInfo.name)
            && Objects.equals(this.pricePerUnit, menuItemShortInfo.pricePerUnit)
            && Objects.equals(this.menuItemGroup, menuItemShortInfo.menuItemGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pricePerUnit, menuItemGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuItemShortInfoDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pricePerUnit: ").append(toIndentedString(pricePerUnit)).append("\n");
    sb.append("    menuItemGroup: ").append(toIndentedString(menuItemGroup)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

