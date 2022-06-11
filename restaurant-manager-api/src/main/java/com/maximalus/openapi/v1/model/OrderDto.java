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
 * Order info
 */
@ApiModel(description = "Order info")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-03T11:47:28.437270400+03:00[Europe/Helsinki]")
public class OrderDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("userInfo")
  private String userInfo;

  @JsonProperty("orderItems")
  @Valid
  private List<OrderItemDto> orderItems = null;

  @JsonProperty("customerNumber")
  private int customerNumber;

  @JsonProperty("tableNumber")
  private int tableNumber;

  @JsonProperty("companyDiscount")
  private CompanyDiscountDto companyDiscount;

  @JsonProperty("itemDiscount")
  private ItemDiscountDto itemDiscount;

  @JsonProperty("totalCost")
  private Double totalCost;

  @JsonProperty("orderStatusRecords")
  @Valid
  private List<OrderStatusRecordDto> orderStatusRecords = null;

  @JsonProperty("isDeleted")
  private Boolean isDeleted;

  @JsonProperty("creationDate")
  private LocalDate creationDate;

  @JsonProperty("changingDate")
  private LocalDate changingDate;

  public OrderDto id(Long id) {
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

  public OrderDto userInfo(String userInfo) {
    this.userInfo = userInfo;
    return this;
  }

  /**
   * Get userInfo
   * @return userInfo
  */
  @ApiModelProperty(example = "David Valter - Waiter", value = "")


  public String getUserInfo() {
    return userInfo;
  }

  public void setUserInfo(String userInfo) {
    this.userInfo = userInfo;
  }

  public OrderDto orderItems(List<OrderItemDto> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  /**
   * Get orderItems
   * @return orderItems
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderItemDto> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<OrderItemDto> orderItems) {
    this.orderItems = orderItems;
  }

  public OrderDto customerNumber(int customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

  /**
   * Get customerNumber
   * @return customerNumber
  */
  @ApiModelProperty(example = "186", value = "")


  public int getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(int customerNumber) {
    this.customerNumber = customerNumber;
  }

  public OrderDto tableNumber(int tableNumber) {
    this.tableNumber = tableNumber;
    return this;
  }

  /**
   * Get tableNumber
   * @return tableNumber
  */
  @ApiModelProperty(example = "16", value = "")


  public int getTableNumber() {
    return tableNumber;
  }

  public void setTableNumber(int tableNumber) {
    this.tableNumber = tableNumber;
  }

  public OrderDto companyDiscount(CompanyDiscountDto companyDiscount) {
    this.companyDiscount = companyDiscount;
    return this;
  }

  /**
   * Get companyDiscount
   * @return companyDiscount
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyDiscountDto getCompanyDiscount() {
    return companyDiscount;
  }

  public void setCompanyDiscount(CompanyDiscountDto companyDiscount) {
    this.companyDiscount = companyDiscount;
  }

  public OrderDto itemDiscount(ItemDiscountDto itemDiscount) {
    this.itemDiscount = itemDiscount;
    return this;
  }

  /**
   * Get itemDiscount
   * @return itemDiscount
  */
  @ApiModelProperty(value = "")

  @Valid

  public ItemDiscountDto getItemDiscount() {
    return itemDiscount;
  }

  public void setItemDiscount(ItemDiscountDto itemDiscount) {
    this.itemDiscount = itemDiscount;
  }

  public OrderDto totalCost(Double totalCost) {
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

  public OrderDto orderStatusRecords(List<OrderStatusRecordDto> orderStatusRecords) {
    this.orderStatusRecords = orderStatusRecords;
    return this;
  }

  /**
   * Get orderStatusRecords
   * @return orderStatusRecords
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderStatusRecordDto> getOrderStatusRecords() {
    return orderStatusRecords;
  }

  public void setOrderStatusRecords(List<OrderStatusRecordDto> orderStatusRecords) {
    this.orderStatusRecords = orderStatusRecords;
  }

  public OrderDto isDeleted(Boolean isDeleted) {
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

  public OrderDto creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public OrderDto changingDate(LocalDate changingDate) {
    this.changingDate = changingDate;
    return this;
  }

  /**
   * Get changingDate
   * @return changingDate
  */
  @ApiModelProperty(value = "")

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
    OrderDto order = (OrderDto) o;
    return Objects.equals(this.id, order.id)
            && Objects.equals(this.userInfo, order.userInfo)
            && Objects.equals(this.orderItems, order.orderItems)
            && Objects.equals(this.customerNumber, order.customerNumber)
            && Objects.equals(this.tableNumber, order.tableNumber)
            && Objects.equals(this.companyDiscount, order.companyDiscount)
            && Objects.equals(this.itemDiscount, order.itemDiscount)
            && Objects.equals(this.totalCost, order.totalCost)
            && Objects.equals(this.orderStatusRecords, order.orderStatusRecords)
            && Objects.equals(this.isDeleted, order.isDeleted)
            && Objects.equals(this.creationDate, order.creationDate)
            && Objects.equals(this.changingDate, order.changingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userInfo, orderItems, customerNumber, tableNumber, companyDiscount, itemDiscount, totalCost, orderStatusRecords, isDeleted, creationDate, changingDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    tableNumber: ").append(toIndentedString(tableNumber)).append("\n");
    sb.append("    companyDiscount: ").append(toIndentedString(companyDiscount)).append("\n");
    sb.append("    itemDiscount: ").append(toIndentedString(itemDiscount)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
    sb.append("    orderStatusRecords: ").append(toIndentedString(orderStatusRecords)).append("\n");
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

