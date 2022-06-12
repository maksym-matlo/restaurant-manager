package com.maximalus.openapi.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * Info with info about sales in concrete outlet
 */
@ApiModel(description = "Info with info about sales in concrete outlet")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-12T15:05:08.452693200+03:00[Europe/Helsinki]")
public class SalesReportDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("outletName")
  private String outletName;

  @JsonProperty("totalOrdersNumber")
  private Integer totalOrderNumber;

  @JsonProperty("publishedOrdersNumber")
  private Integer publishedOrderNumber;

  @JsonProperty("paidOrdersNumber")
  private Integer paidOrderNumber;

  @JsonProperty("unpaidOrdersNumber")
  private Integer unpaidOrderNumber;

  @JsonProperty("partialPaidOrdersNumber")
  private Integer partialPaidOrderNumber;

  @JsonProperty("closedOrdersNumber")
  private Integer closedOrderNumber;

  @JsonProperty("totalSales")
  private Double totalSales;

  @JsonProperty("ingredientsCost")
  private Double ingredientsCost;

  @JsonProperty("totalRevenue")
  private Double totalRevenue;

  @JsonProperty("dateFrom")
  private OffsetDateTime dateFrom;

  @JsonProperty("dateUntil")
  private OffsetDateTime dateUntil;

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

  public SalesReportDto totalOrdersNumber(Integer totalOrdersNumber) {
    this.totalOrderNumber = totalOrdersNumber;
    return this;
  }

  /**
   * Get totalOrdersNumber
   * @return totalOrdersNumber
  */
  @ApiModelProperty(example = "820", value = "")


  public Integer getTotalOrderNumber() {
    return totalOrderNumber;
  }

  public void setTotalOrderNumber(Integer totalOrderNumber) {
    this.totalOrderNumber = totalOrderNumber;
  }

  public SalesReportDto publishedOrdersNumber(Integer publishedOrdersNumber) {
    this.publishedOrderNumber = publishedOrdersNumber;
    return this;
  }

  /**
   * Get publishedOrdersNumber
   * @return publishedOrdersNumber
  */
  @ApiModelProperty(example = "820", value = "")


  public Integer getPublishedOrderNumber() {
    return publishedOrderNumber;
  }

  public void setPublishedOrderNumber(Integer publishedOrderNumber) {
    this.publishedOrderNumber = publishedOrderNumber;
  }

  public SalesReportDto paidOrderNumber(Integer paidOrderNumber) {
    this.paidOrderNumber = paidOrderNumber;
    return this;
  }

  /**
   * Get paidOrdersNumber
   * @return paidOrdersNumber
  */
  @ApiModelProperty(example = "820", value = "")


  public Integer getPaidOrdersNumber() {
    return paidOrderNumber;
  }

  public void setPaidOrdersNumber(Integer paidOrdersNumber) {
    this.paidOrderNumber = paidOrdersNumber;
  }

  public SalesReportDto unpaidOrdersNumber(Integer unpaidOrdersNumber) {
    this.unpaidOrderNumber = unpaidOrdersNumber;
    return this;
  }

  /**
   * Get unpaidOrdersNumber
   * @return unpaidOrdersNumber
  */
  @ApiModelProperty(example = "820", value = "")


  public Integer getUnpaidOrderNumber() {
    return unpaidOrderNumber;
  }

  public void setUnpaidOrderNumber(Integer unpaidOrderNumber) {
    this.unpaidOrderNumber = unpaidOrderNumber;
  }

  public SalesReportDto partialPaidOrdersNumber(Integer partialPaidOrdersNumber) {
    this.partialPaidOrderNumber = partialPaidOrdersNumber;
    return this;
  }

  /**
   * Get partialPaidOrdersNumber
   * @return partialPaidOrdersNumber
  */
  @ApiModelProperty(example = "820", value = "")


  public Integer getPartialPaidOrderNumber() {
    return partialPaidOrderNumber;
  }

  public void setPartialPaidOrderNumber(Integer partialPaidOrderNumber) {
    this.partialPaidOrderNumber = partialPaidOrderNumber;
  }

  public SalesReportDto closedOrdersNumber(Integer closedOrdersNumber) {
    this.closedOrderNumber = closedOrdersNumber;
    return this;
  }

  /**
   * Get closedOrdersNumber
   * @return closedOrdersNumber
  */
  @ApiModelProperty(example = "820", value = "")


  public Integer getClosedOrderNumber() {
    return closedOrderNumber;
  }

  public void setClosedOrderNumber(Integer closedOrderNumber) {
    this.closedOrderNumber = closedOrderNumber;
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

  public SalesReportDto dateFrom(OffsetDateTime dateFrom) {
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

  public SalesReportDto dateUntil(OffsetDateTime dateUntil) {
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
    SalesReportDto salesReport = (SalesReportDto) o;
    return Objects.equals(this.id, salesReport.id)
            && Objects.equals(this.outletName, salesReport.outletName)
            && Objects.equals(this.totalOrderNumber, salesReport.totalOrderNumber)
            && Objects.equals(this.publishedOrderNumber, salesReport.publishedOrderNumber)
            && Objects.equals(this.paidOrderNumber, salesReport.paidOrderNumber)
            && Objects.equals(this.unpaidOrderNumber, salesReport.unpaidOrderNumber)
            && Objects.equals(this.partialPaidOrderNumber, salesReport.partialPaidOrderNumber)
            && Objects.equals(this.closedOrderNumber, salesReport.closedOrderNumber)
            && Objects.equals(this.totalSales, salesReport.totalSales)
            && Objects.equals(this.ingredientsCost, salesReport.ingredientsCost)
            && Objects.equals(this.totalRevenue, salesReport.totalRevenue)
            && Objects.equals(this.dateFrom, salesReport.dateFrom)
            && Objects.equals(this.dateUntil, salesReport.dateUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, outletName, totalOrderNumber, publishedOrderNumber, paidOrderNumber,
            unpaidOrderNumber, partialPaidOrderNumber, closedOrderNumber, totalSales,
            ingredientsCost, totalRevenue, dateFrom, dateUntil);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesReportDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    outletName: ").append(toIndentedString(outletName)).append("\n");
    sb.append("    totalOrderNumber: ").append(toIndentedString(totalOrderNumber)).append("\n");
    sb.append("    publishedOrderNumber: ").append(toIndentedString(publishedOrderNumber)).append("\n");
    sb.append("    paidOrderNumber: ").append(toIndentedString(paidOrderNumber)).append("\n");
    sb.append("    unpaidOrderNumber: ").append(toIndentedString(unpaidOrderNumber)).append("\n");
    sb.append("    partialPaidOrderNumber: ").append(toIndentedString(partialPaidOrderNumber)).append("\n");
    sb.append("    closedOrderNumber: ").append(toIndentedString(closedOrderNumber)).append("\n");
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

