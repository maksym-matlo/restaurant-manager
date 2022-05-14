package com.maximalus.openapi.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Info with info about sales in concrete outlet
 */
@ApiModel(description = "Info with info about sales in concrete outlet")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-03T11:47:28.437270400+03:00[Europe/Helsinki]")
public class SalesReportDto {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("outletName")
  private String outletName;

  @JsonProperty("totalOrdersNumber")
  private Long totalOrdersNumber;

  @JsonProperty("publishedOrdersNumber")
  private Long publishedOrdersNumber;

  @JsonProperty("paidOrdersNumber")
  private Long paidOrdersNumber;

  @JsonProperty("unpaidOrdersNumber")
  private Long unpaidOrdersNumber;

  @JsonProperty("partialPaidOrdersNumber")
  private Long partialPaidOrdersNumber;

  @JsonProperty("closedOrdersNumber")
  private Long closedOrdersNumber;

  @JsonProperty("totalSales")
  private Double totalSales;

  @JsonProperty("ingredientsCost")
  private Double ingredientsCost;

  @JsonProperty("totalRevenue")
  private Double totalRevenue;

  @JsonProperty("dateFrom")
  private LocalDate dateFrom;

  @JsonProperty("dateUntil")
  private LocalDate dateUntil;

  public SalesReportDto id(Long id) {
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

  public SalesReportDto outletName(String outletName) {
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

  public SalesReportDto totalOrdersNumber(Long totalOrdersNumber) {
    this.totalOrdersNumber = totalOrdersNumber;
    return this;
  }

  /**
   * Get totalOrdersNumber
   * @return totalOrdersNumber
  */
  @ApiModelProperty(example = "820", value = "")


  public Long getTotalOrdersNumber() {
    return totalOrdersNumber;
  }

  public void setTotalOrdersNumber(Long totalOrdersNumber) {
    this.totalOrdersNumber = totalOrdersNumber;
  }

  public SalesReportDto publishedOrdersNumber(Long publishedOrdersNumber) {
    this.publishedOrdersNumber = publishedOrdersNumber;
    return this;
  }

  /**
   * Get publishedOrdersNumber
   * @return publishedOrdersNumber
  */
  @ApiModelProperty(example = "820", value = "")


  public Long getPublishedOrdersNumber() {
    return publishedOrdersNumber;
  }

  public void setPublishedOrdersNumber(Long publishedOrdersNumber) {
    this.publishedOrdersNumber = publishedOrdersNumber;
  }

  public SalesReportDto paidOrdersNumber(Long paidOrdersNumber) {
    this.paidOrdersNumber = paidOrdersNumber;
    return this;
  }

  /**
   * Get paidOrdersNumber
   * @return paidOrdersNumber
  */
  @ApiModelProperty(example = "820", value = "")


  public Long getPaidOrdersNumber() {
    return paidOrdersNumber;
  }

  public void setPaidOrdersNumber(Long paidOrdersNumber) {
    this.paidOrdersNumber = paidOrdersNumber;
  }

  public SalesReportDto unpaidOrdersNumber(Long unpaidOrdersNumber) {
    this.unpaidOrdersNumber = unpaidOrdersNumber;
    return this;
  }

  /**
   * Get unpaidOrdersNumber
   * @return unpaidOrdersNumber
  */
  @ApiModelProperty(example = "820", value = "")


  public Long getUnpaidOrdersNumber() {
    return unpaidOrdersNumber;
  }

  public void setUnpaidOrdersNumber(Long unpaidOrdersNumber) {
    this.unpaidOrdersNumber = unpaidOrdersNumber;
  }

  public SalesReportDto partialPaidOrdersNumber(Long partialPaidOrdersNumber) {
    this.partialPaidOrdersNumber = partialPaidOrdersNumber;
    return this;
  }

  /**
   * Get partialPaidOrdersNumber
   * @return partialPaidOrdersNumber
  */
  @ApiModelProperty(example = "820", value = "")


  public Long getPartialPaidOrdersNumber() {
    return partialPaidOrdersNumber;
  }

  public void setPartialPaidOrdersNumber(Long partialPaidOrdersNumber) {
    this.partialPaidOrdersNumber = partialPaidOrdersNumber;
  }

  public SalesReportDto closedOrdersNumber(Long closedOrdersNumber) {
    this.closedOrdersNumber = closedOrdersNumber;
    return this;
  }

  /**
   * Get closedOrdersNumber
   * @return closedOrdersNumber
  */
  @ApiModelProperty(example = "820", value = "")


  public Long getClosedOrdersNumber() {
    return closedOrdersNumber;
  }

  public void setClosedOrdersNumber(Long closedOrdersNumber) {
    this.closedOrdersNumber = closedOrdersNumber;
  }

  public SalesReportDto totalSales(Double totalSales) {
    this.totalSales = totalSales;
    return this;
  }

  /**
   * Get totalSales
   * @return totalSales
  */
  @ApiModelProperty(example = "1123.0", value = "")


  public Double getTotalSales() {
    return totalSales;
  }

  public void setTotalSales(Double totalSales) {
    this.totalSales = totalSales;
  }

  public SalesReportDto ingredientsCost(Double ingredientsCost) {
    this.ingredientsCost = ingredientsCost;
    return this;
  }

  /**
   * Get ingredientsCost
   * @return ingredientsCost
  */
  @ApiModelProperty(example = "1123.0", value = "")


  public Double getIngredientsCost() {
    return ingredientsCost;
  }

  public void setIngredientsCost(Double ingredientsCost) {
    this.ingredientsCost = ingredientsCost;
  }

  public SalesReportDto totalRevenue(Double totalRevenue) {
    this.totalRevenue = totalRevenue;
    return this;
  }

  /**
   * Get totalRevenue
   * @return totalRevenue
  */
  @ApiModelProperty(example = "1123.0", value = "")


  public Double getTotalRevenue() {
    return totalRevenue;
  }

  public void setTotalRevenue(Double totalRevenue) {
    this.totalRevenue = totalRevenue;
  }

  public SalesReportDto dateFrom(LocalDate dateFrom) {
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

  public SalesReportDto dateUntil(LocalDate dateUntil) {
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
    SalesReportDto saleReport = (SalesReportDto) o;
    return Objects.equals(this.id, saleReport.id)
            && Objects.equals(this.outletName, saleReport.outletName)
            && Objects.equals(this.totalOrdersNumber, saleReport.totalOrdersNumber)
            && Objects.equals(this.publishedOrdersNumber, saleReport.publishedOrdersNumber)
            && Objects.equals(this.paidOrdersNumber, saleReport.paidOrdersNumber)
            && Objects.equals(this.unpaidOrdersNumber, saleReport.unpaidOrdersNumber)
            && Objects.equals(this.partialPaidOrdersNumber, saleReport.partialPaidOrdersNumber)
            && Objects.equals(this.closedOrdersNumber, saleReport.closedOrdersNumber)
            && Objects.equals(this.totalSales, saleReport.totalSales)
            && Objects.equals(this.ingredientsCost, saleReport.ingredientsCost)
            && Objects.equals(this.totalRevenue, saleReport.totalRevenue)
            && Objects.equals(this.dateFrom, saleReport.dateFrom)
            && Objects.equals(this.dateUntil, saleReport.dateUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, outletName, totalOrdersNumber, publishedOrdersNumber, paidOrdersNumber, unpaidOrdersNumber, partialPaidOrdersNumber, closedOrdersNumber, totalSales, ingredientsCost, totalRevenue, dateFrom, dateUntil);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleReportDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    outletName: ").append(toIndentedString(outletName)).append("\n");
    sb.append("    totalOrdersNumber: ").append(toIndentedString(totalOrdersNumber)).append("\n");
    sb.append("    publishedOrdersNumber: ").append(toIndentedString(publishedOrdersNumber)).append("\n");
    sb.append("    paidOrdersNumber: ").append(toIndentedString(paidOrdersNumber)).append("\n");
    sb.append("    unpaidOrdersNumber: ").append(toIndentedString(unpaidOrdersNumber)).append("\n");
    sb.append("    partialPaidOrdersNumber: ").append(toIndentedString(partialPaidOrdersNumber)).append("\n");
    sb.append("    closedOrdersNumber: ").append(toIndentedString(closedOrdersNumber)).append("\n");
    sb.append("    totalSales: ").append(toIndentedString(totalSales)).append("\n");
    sb.append("    ingredientsCost: ").append(toIndentedString(ingredientsCost)).append("\n");
    sb.append("    totalRevenue: ").append(toIndentedString(totalRevenue)).append("\n");
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

