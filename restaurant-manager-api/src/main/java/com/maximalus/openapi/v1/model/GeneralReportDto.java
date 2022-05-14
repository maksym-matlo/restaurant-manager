package com.maximalus.openapi.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Report with general info
 */
@ApiModel(description = "Report with general info")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-03T11:47:28.437270400+03:00[Europe/Helsinki]")
public class GeneralReportDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("outletName")
  private String outletName;

  @JsonProperty("numberOfOrders")
  private Long numberOfOrders;

  @JsonProperty("numberOfCustomers")
  private Long numberOfCustomers;

  @JsonProperty("numberOfUnpaidOrders")
  private Long numberOfUnpaidOrders;

  @JsonProperty("dateFrom")
  private LocalDate dateFrom;

  @JsonProperty("dateUntil")
  private LocalDate dateUntil;

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

  public GeneralReportDto numberOfOrders(Long numberOfOrders) {
    this.numberOfOrders = numberOfOrders;
    return this;
  }

  /**
   * Get numberOfOrders
   * @return numberOfOrders
  */
  @ApiModelProperty(example = "820", value = "")


  public Long getNumberOfOrders() {
    return numberOfOrders;
  }

  public void setNumberOfOrders(Long numberOfOrders) {
    this.numberOfOrders = numberOfOrders;
  }

  public GeneralReportDto numberOfCustomers(Long numberOfCustomers) {
    this.numberOfCustomers = numberOfCustomers;
    return this;
  }

  /**
   * Get numberOfCustomers
   * @return numberOfCustomers
  */
  @ApiModelProperty(example = "1860", value = "")


  public Long getNumberOfCustomers() {
    return numberOfCustomers;
  }

  public void setNumberOfCustomers(Long numberOfCustomers) {
    this.numberOfCustomers = numberOfCustomers;
  }

  public GeneralReportDto numberOfUnpaidOrders(Long numberOfUnpaidOrders) {
    this.numberOfUnpaidOrders = numberOfUnpaidOrders;
    return this;
  }

  /**
   * Get numberOfUnpaidOrders
   * @return numberOfUnpaidOrders
  */
  @ApiModelProperty(example = "47", value = "")


  public Long getNumberOfUnpaidOrders() {
    return numberOfUnpaidOrders;
  }

  public void setNumberOfUnpaidOrders(Long numberOfUnpaidOrders) {
    this.numberOfUnpaidOrders = numberOfUnpaidOrders;
  }

  public GeneralReportDto dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Get dateFrom
   * @return dateFrom
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GeneralReportDto dateUntil(LocalDate dateUntil) {
    this.dateUntil = dateUntil;
    return this;
  }

  /**
   * Get dateUntil
   * @return dateUntil
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateUntil() {
    return dateUntil;
  }

  public void setDateUntil(LocalDate dateUntil) {
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
    return Objects.equals(this.id, generalReport.id)
            && Objects.equals(this.outletName, generalReport.outletName)
            && Objects.equals(this.numberOfOrders, generalReport.numberOfOrders)
            && Objects.equals(this.numberOfCustomers, generalReport.numberOfCustomers)
            && Objects.equals(this.numberOfUnpaidOrders, generalReport.numberOfUnpaidOrders)
            && Objects.equals(this.dateFrom, generalReport.dateFrom)
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

