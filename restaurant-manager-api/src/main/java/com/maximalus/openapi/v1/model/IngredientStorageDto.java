package com.maximalus.openapi.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.maximalus.openapi.v1.model.StorageCategoryDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about one ingredient in storage
 */
@ApiModel(description = "Information about one ingredient in storage")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-12T15:05:08.452693200+03:00[Europe/Helsinki]")
public class IngredientStorageDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("ingredientName")
  private String ingredientName;

  @JsonProperty("currentQuantity")
  private Double currentQuantity;

  @JsonProperty("initialQuantity")
  private Double initialQuantity;

  @JsonProperty("unitName")
  private String unitName;

  @JsonProperty("totalPrice")
  private Double totalPrice;

  @JsonProperty("costPerUnit")
  private Double costPerUnit;

  @JsonProperty("storageCategory")
  private StorageCategoryDto storageCategory;

  @JsonProperty("outletName")
  private String outletName;

  public IngredientStorageDto id(Long id) {
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

  public IngredientStorageDto ingredientName(String ingredientName) {
    this.ingredientName = ingredientName;
    return this;
  }

  /**
   * Get ingredientName
   * @return ingredientName
  */
  @ApiModelProperty(example = "Cow milk", value = "")


  public String getIngredientName() {
    return ingredientName;
  }

  public void setIngredientName(String ingredientName) {
    this.ingredientName = ingredientName;
  }

  public IngredientStorageDto currentQuantity(Double currentQuantity) {
    this.currentQuantity = currentQuantity;
    return this;
  }

  /**
   * Get currentQuantity
   * @return currentQuantity
  */
  @ApiModelProperty(example = "120.0", value = "")


  public Double getCurrentQuantity() {
    return currentQuantity;
  }

  public void setCurrentQuantity(Double currentQuantity) {
    this.currentQuantity = currentQuantity;
  }

  public IngredientStorageDto initialQuantity(Double initialQuantity) {
    this.initialQuantity = initialQuantity;
    return this;
  }

  /**
   * Get initialQuantity
   * @return initialQuantity
  */
  @ApiModelProperty(example = "150.0", value = "")


  public Double getInitialQuantity() {
    return initialQuantity;
  }

  public void setInitialQuantity(Double initialQuantity) {
    this.initialQuantity = initialQuantity;
  }

  public IngredientStorageDto unitName(String unitName) {
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

  public IngredientStorageDto totalPrice(Double totalPrice) {
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

  public IngredientStorageDto costPerUnit(Double costPerUnit) {
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

  public IngredientStorageDto storageCategory(StorageCategoryDto storageCategory) {
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

  public IngredientStorageDto outletName(String outletName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngredientStorageDto ingredientStorage = (IngredientStorageDto) o;
    return Objects.equals(this.id, ingredientStorage.id)
            && Objects.equals(this.ingredientName, ingredientStorage.ingredientName)
            && Objects.equals(this.currentQuantity, ingredientStorage.currentQuantity)
            && Objects.equals(this.initialQuantity, ingredientStorage.initialQuantity)
            && Objects.equals(this.unitName, ingredientStorage.unitName)
            && Objects.equals(this.totalPrice, ingredientStorage.totalPrice)
            && Objects.equals(this.costPerUnit, ingredientStorage.costPerUnit)
            && Objects.equals(this.storageCategory, ingredientStorage.storageCategory)
            && Objects.equals(this.outletName, ingredientStorage.outletName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ingredientName, currentQuantity, initialQuantity, unitName,
            totalPrice, costPerUnit, storageCategory, outletName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientStorageDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ingredientName: ").append(toIndentedString(ingredientName)).append("\n");
    sb.append("    currentQuantity: ").append(toIndentedString(currentQuantity)).append("\n");
    sb.append("    initialQuantity: ").append(toIndentedString(initialQuantity)).append("\n");
    sb.append("    unitName: ").append(toIndentedString(unitName)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    costPerUnit: ").append(toIndentedString(costPerUnit)).append("\n");
    sb.append("    storageCategory: ").append(toIndentedString(storageCategory)).append("\n");
    sb.append("    outletName: ").append(toIndentedString(outletName)).append("\n");
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

