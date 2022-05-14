package com.maximalus.openapi.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * Outlet info
 */
@ApiModel(description = "Outlet info")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-03T11:47:28.437270400+03:00[Europe/Helsinki]")
public class OutletDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("orders")
  @Valid
  private List<OrderDto> orders = null;

  @JsonProperty("users")
  @Valid
  private List<UserDto> users = null;

  @JsonProperty("ingredientStorage")
  private IngredientStorageDto ingredientStorage;

  @JsonProperty("isDeleted")
  private Boolean isDeleted;

  @JsonProperty("creationDate")
  private LocalDate creationDate;

  @JsonProperty("changingDate")
  private LocalDate changingDate;

  public OutletDto id(Long id) {
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

  public OutletDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "La Spiga", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OutletDto orders(List<OrderDto> orders) {
    this.orders = orders;
    return this;
  }

  /**
   * Get orders
   * @return orders
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderDto> getOrders() {
    return orders;
  }

  public void setOrders(List<OrderDto> orders) {
    this.orders = orders;
  }

  public OutletDto users(List<UserDto> users) {
    this.users = users;
    return this;
  }

  /**
   * Get users
   * @return users
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<UserDto> getUsers() {
    return users;
  }

  public void setUsers(List<UserDto> users) {
    this.users = users;
  }

  public OutletDto ingredientStorage(IngredientStorageDto ingredientStorage) {
    this.ingredientStorage = ingredientStorage;
    return this;
  }

  /**
   * Get ingredientStorage
   * @return ingredientStorage
  */
  @ApiModelProperty(value = "")

  @Valid

  public IngredientStorageDto getIngredientStorage() {
    return ingredientStorage;
  }

  public void setIngredientStorage(IngredientStorageDto ingredientStorage) {
    this.ingredientStorage = ingredientStorage;
  }

  public OutletDto isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   * @return isDeleted
  */
  @ApiModelProperty(example = "false", value = "")


  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public OutletDto creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  */
  @ApiModelProperty(example = "Tue May 19 03:00:00 EEST 2020", value = "")

  @Valid

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public OutletDto changingDate(LocalDate changingDate) {
    this.changingDate = changingDate;
    return this;
  }

  /**
   * Get changingDate
   * @return changingDate
  */
  @ApiModelProperty(example = "Sat Jun 20 03:00:00 EEST 2020", value = "")

  @Valid

  public LocalDate getChangingDate() {
    return changingDate;
  }

  public void setChangingDate(LocalDate changingDate) {
    this.changingDate = changingDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutletDto outlet = (OutletDto) o;
    return Objects.equals(this.id, outlet.id)
            && Objects.equals(this.name, outlet.name)
            && Objects.equals(this.orders, outlet.orders)
            && Objects.equals(this.users, outlet.users)
            && Objects.equals(this.ingredientStorage, outlet.ingredientStorage)
            && Objects.equals(this.isDeleted, outlet.isDeleted)
            && Objects.equals(this.creationDate, outlet.creationDate)
            && Objects.equals(this.changingDate, outlet.changingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, orders, users, ingredientStorage, isDeleted, creationDate, changingDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutletDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    ingredientStorage: ").append(toIndentedString(ingredientStorage)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    changingDate: ").append(toIndentedString(changingDate)).append("\n");
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

