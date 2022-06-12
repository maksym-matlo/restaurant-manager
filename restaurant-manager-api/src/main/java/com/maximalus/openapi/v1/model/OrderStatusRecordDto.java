package com.maximalus.openapi.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Info about stage of order lifecycle
 */
@ApiModel(description = "Info about stage of order lifecycle")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-12T15:05:08.452693200+03:00[Europe/Helsinki]")
public class OrderStatusRecordDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("orderStatus")
  private String orderStatus;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate;

  @JsonProperty("changingDate")
  private OffsetDateTime changingDate;

  public OrderStatusRecordDto id(Long id) {
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

  public OrderStatusRecordDto orderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

  /**
   * Get orderStatus
   * @return orderStatus
  */
  @ApiModelProperty(value = "")


  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public OrderStatusRecordDto creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public OrderStatusRecordDto changingDate(OffsetDateTime changingDate) {
    this.changingDate = changingDate;
    return this;
  }

  /**
   * Get changingDate
   * @return changingDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getChangingDate() {
    return changingDate;
  }

  public void setChangingDate(OffsetDateTime changingDate) {
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
    OrderStatusRecordDto orderStatusRecord = (OrderStatusRecordDto) o;
    return Objects.equals(this.id, orderStatusRecord.id)
            && Objects.equals(this.orderStatus, orderStatusRecord.orderStatus)
            && Objects.equals(this.creationDate, orderStatusRecord.creationDate)
            && Objects.equals(this.changingDate, orderStatusRecord.changingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderStatus, creationDate, changingDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatusRecordDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
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

