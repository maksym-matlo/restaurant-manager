package com.maximalus.openapi.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order item info
 */
@ApiModel(description = "Order item info")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-12T15:05:08.452693200+03:00[Europe/Helsinki]")
public class OrderItemDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("pricePerUnit")
  private Double pricePerUnit;

  @JsonProperty("orderedAmount")
  private Integer orderedAmount;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("totalCost")
  private Double totalCost;

  public OrderItemDto id(Long id) {
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

  public OrderItemDto name(String name) {
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

  public OrderItemDto pricePerUnit(Double pricePerUnit) {
    this.pricePerUnit = pricePerUnit;
    return this;
  }

  /**
   * Get pricePerUnit
   * @return pricePerUnit
  */
  @ApiModelProperty(example = "1200.00", value = "")


  public Double getPricePerUnit() {
    return pricePerUnit;
  }

  public void setPricePerUnit(Double pricePerUnit) {
    this.pricePerUnit = pricePerUnit;
  }

  public OrderItemDto orderedAmount(Integer orderedAmount) {
    this.orderedAmount = orderedAmount;
    return this;
  }

  /**
   * Get orderedAmount
   * @return orderedAmount
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getOrderedAmount() {
    return orderedAmount;
  }

  public void setOrderedAmount(Integer orderedAmount) {
    this.orderedAmount = orderedAmount;
  }

  public OrderItemDto comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  */
  @ApiModelProperty(example = "Some comment", value = "")


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public OrderItemDto totalCost(Double totalCost) {
    this.totalCost = totalCost;
    return this;
  }

  /**
   * Get totalCost
   * @return totalCost
  */
  @ApiModelProperty(example = "1200.00", value = "")


  public Double getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(Double totalCost) {
    this.totalCost = totalCost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemDto orderItem = (OrderItemDto) o;
    return Objects.equals(this.id, orderItem.id)
            && Objects.equals(this.name, orderItem.name)
            && Objects.equals(this.pricePerUnit, orderItem.pricePerUnit)
            && Objects.equals(this.orderedAmount, orderItem.orderedAmount)
            && Objects.equals(this.comment, orderItem.comment)
            && Objects.equals(this.totalCost, orderItem.totalCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, pricePerUnit, orderedAmount, comment, totalCost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pricePerUnit: ").append(toIndentedString(pricePerUnit)).append("\n");
    sb.append("    orderedAmount: ").append(toIndentedString(orderedAmount)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
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

