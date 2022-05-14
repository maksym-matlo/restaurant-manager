package com.maximalus.openapi.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.Objects;

/**
 * Information about one material in storage
 */
@ApiModel(description = "Information about one material in storage")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-03T11:47:28.437270400+03:00[Europe/Helsinki]")
public class MaterialStorageDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("initialAmount")
  private Long initialAmount;

  @JsonProperty("currentAmount")
  private Long currentAmount;

  @JsonProperty("unitName")
  private String unitName;

  @JsonProperty("totalPrice")
  private Double totalPrice;

  @JsonProperty("costPerUnit")
  private Double costPerUnit;

  @JsonProperty("storageCategory")
  private StorageCategoryDto storageCategory;

  public MaterialStorageDto id(Long id) {
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

  public MaterialStorageDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "Soap", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MaterialStorageDto initialAmount(Long initialAmount) {
    this.initialAmount = initialAmount;
    return this;
  }

  /**
   * Get initialAmount
   * @return initialAmount
  */
  @ApiModelProperty(example = "186", value = "")


  public Long getInitialAmount() {
    return initialAmount;
  }

  public void setInitialAmount(Long initialAmount) {
    this.initialAmount = initialAmount;
  }

  public MaterialStorageDto currentAmount(Long currentAmount) {
    this.currentAmount = currentAmount;
    return this;
  }

  /**
   * Get currentAmount
   * @return currentAmount
  */
  @ApiModelProperty(example = "186", value = "")


  public Long getCurrentAmount() {
    return currentAmount;
  }

  public void setCurrentAmount(Long currentAmount) {
    this.currentAmount = currentAmount;
  }

  public MaterialStorageDto unitName(String unitName) {
    this.unitName = unitName;
    return this;
  }

  /**
   * Get unitName
   * @return unitName
  */
  @ApiModelProperty(example = "Kilogram", value = "")


  public String getUnitName() {
    return unitName;
  }

  public void setUnitName(String unitName) {
    this.unitName = unitName;
  }

  public MaterialStorageDto totalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

  /**
   * Get totalPrice
   * @return totalPrice
  */
  @ApiModelProperty(example = "150.0", value = "")


  public Double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
  }

  public MaterialStorageDto costPerUnit(Double costPerUnit) {
    this.costPerUnit = costPerUnit;
    return this;
  }

  /**
   * Get costPerUnit
   * @return costPerUnit
  */
  @ApiModelProperty(example = "1.5", value = "")


  public Double getCostPerUnit() {
    return costPerUnit;
  }

  public void setCostPerUnit(Double costPerUnit) {
    this.costPerUnit = costPerUnit;
  }

  public MaterialStorageDto storageCategory(StorageCategoryDto storageCategory) {
    this.storageCategory = storageCategory;
    return this;
  }

  /**
   * Get storageCategory
   * @return storageCategory
  */
  @ApiModelProperty(value = "")

  @Valid

  public StorageCategoryDto getStorageCategory() {
    return storageCategory;
  }

  public void setStorageCategory(StorageCategoryDto storageCategory) {
    this.storageCategory = storageCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialStorageDto materialStorage = (MaterialStorageDto) o;
    return Objects.equals(this.id, materialStorage.id)
            && Objects.equals(this.name, materialStorage.name)
            && Objects.equals(this.initialAmount, materialStorage.initialAmount)
            && Objects.equals(this.currentAmount, materialStorage.currentAmount)
            && Objects.equals(this.unitName, materialStorage.unitName)
            && Objects.equals(this.totalPrice, materialStorage.totalPrice)
            && Objects.equals(this.costPerUnit, materialStorage.costPerUnit)
            && Objects.equals(this.storageCategory, materialStorage.storageCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, initialAmount, currentAmount, unitName, totalPrice, costPerUnit, storageCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaterialStorageDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    initialAmount: ").append(toIndentedString(initialAmount)).append("\n");
    sb.append("    currentAmount: ").append(toIndentedString(currentAmount)).append("\n");
    sb.append("    unitName: ").append(toIndentedString(unitName)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    costPerUnit: ").append(toIndentedString(costPerUnit)).append("\n");
    sb.append("    storageCategory: ").append(toIndentedString(storageCategory)).append("\n");
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

