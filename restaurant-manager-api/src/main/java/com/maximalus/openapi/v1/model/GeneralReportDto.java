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
 * Report with general info
 */
@ApiModel(description = "Report with general info")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-12T15:05:08.452693200+03:00[Europe/Helsinki]")
public class GeneralReportDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("outletName")
  private String outletName;

  @JsonProperty("numberOfOrders")
  private Integer numberOfOrders;

  @JsonProperty("numberOfCustomers")
  private Integer numberOfCustomers;

  @JsonProperty("numberOfUnpaidOrders")
  private Integer numberOfUnpaidOrders;

  @JsonProperty("dateFrom")
  private OffsetDateTime dateFrom;

  @JsonProperty("dateUntil")
  private OffsetDateTime dateUntil;

  public GeneralReportDto id(Long id) {
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

  public GeneralReportDto outletName(String outletName) {
    this.outletName = outletName;
    return this;
  }

  /**
   * Get outletName
   * @return outletName
  */
  @ApiModelProperty(example = "La Spiga", value = "")


  public String getOutletName() {
    return outletName;
  }

  public void setOutletName(String outletName) {
    this.outletName = outletName;
  }

  public GeneralReportDto numberOfOrders(Integer numberOfOrders) {
    this.numberOfOrders = numberOfOrders;
    return this;
  }

  /**
   * Get numberOfOrders
   * @return numberOfOrders
  */
  @ApiModelProperty(example = "820", value = "")


  public Integer getNumberOfOrders() {
    return numberOfOrders;
  }

  public void setNumberOfOrders(Integer numberOfOrders) {
    this.numberOfOrders = numberOfOrders;
  }

  public GeneralReportDto numberOfCustomers(Integer numberOfCustomers) {
    this.numberOfCustomers = numberOfCustomers;
    return this;
  }

  /**
   * Get numberOfCustomers
   * @return numberOfCustomers
  */
  @ApiModelProperty(example = "1860", value = "")


  public Integer getNumberOfCustomers() {
    return numberOfCustomers;
  }

  public void setNumberOfCustomers(Integer numberOfCustomers) {
    this.numberOfCustomers = numberOfCustomers;
  }

  public GeneralReportDto numberOfUnpaidOrders(Integer numberOfUnpaidOrders) {
    this.numberOfUnpaidOrders = numberOfUnpaidOrders;
    return this;
  }

  /**
   * Get numberOfUnpaidOrders
   * @return numberOfUnpaidOrders
  */
  @ApiModelProperty(example = "47", value = "")


  public Integer getNumberOfUnpaidOrders() {
    return numberOfUnpaidOrders;
  }

  public void setNumberOfUnpaidOrders(Integer numberOfUnpaidOrders) {
    this.numberOfUnpaidOrders = numberOfUnpaidOrders;
  }

  public GeneralReportDto dateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Get dateFrom
   * @return dateFrom
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GeneralReportDto dateUntil(OffsetDateTime dateUntil) {
    this.dateUntil = dateUntil;
    return this;
  }

  /**
   * Get dateUntil
   * @return dateUntil
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDateUntil() {
    return dateUntil;
  }

  public void setDateUntil(OffsetDateTime dateUntil) {
    this.dateUntil = dateUntil;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralReportDto generalReport = (GeneralReportDto) o;
    return Objects.equals(this.id, generalReport.id )
            && Objects.equals(this.outletName, generalReport.outletName )
            && Objects.equals(this.numberOfOrders, generalReport.numberOfOrders )
            && Objects.equals(this.numberOfCustomers, generalReport.numberOfCustomers )
            && Objects.equals(this.numberOfUnpaidOrders, generalReport.numberOfUnpaidOrders )
            && Objects.equals(this.dateFrom, generalReport.dateFrom )
            && Objects.equals(this.dateUntil, generalReport.dateUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, outletName, numberOfOrders, numberOfCustomers, numberOfUnpaidOrders, dateFrom, dateUntil);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralReportDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    outletName: ").append(toIndentedString(outletName)).append("\n");
    sb.append("    numberOfOrders: ").append(toIndentedString(numberOfOrders)).append("\n");
    sb.append("    numberOfCustomers: ").append(toIndentedString(numberOfCustomers)).append("\n");
    sb.append("    numberOfUnpaidOrders: ").append(toIndentedString(numberOfUnpaidOrders)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateUntil: ").append(toIndentedString(dateUntil)).append("\n");
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

