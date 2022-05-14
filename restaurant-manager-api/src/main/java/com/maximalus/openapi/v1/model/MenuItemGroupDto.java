package com.maximalus.openapi.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

/**
 * Info about menu item groups
 */
@ApiModel(description = "Info about menu item groups")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-03T11:47:28.437270400+03:00[Europe/Helsinki]")
public class MenuItemGroupDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("menuItems")
  @Valid
  private List<MenuItemShortInfoDto> menuItems = null;

  public MenuItemGroupDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(example = "186", value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public MenuItemGroupDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "Salads", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MenuItemGroupDto menuItems(List<MenuItemShortInfoDto> menuItems) {
    this.menuItems = menuItems;
    return this;
  }

  /**
   * Get menuItems
   * @return menuItems
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<MenuItemShortInfoDto> getMenuItems() {
    return menuItems;
  }

  public void setMenuItems(List<MenuItemShortInfoDto> menuItems) {
    this.menuItems = menuItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuItemGroupDto menuItemGroup = (MenuItemGroupDto) o;
    return Objects.equals(this.id, menuItemGroup.id)
            && Objects.equals(this.name, menuItemGroup.name)
            && Objects.equals(this.menuItems, menuItemGroup.menuItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, menuItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuItemGroupDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    menuItems: ").append(toIndentedString(menuItems)).append("\n");
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

