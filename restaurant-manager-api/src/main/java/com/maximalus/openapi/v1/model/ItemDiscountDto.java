package com.maximalus.openapi.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.maximalus.openapi.v1.model.DiscountProofDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Info about item discount
 */
@ApiModel(description = "Info about item discount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-12T15:05:08.452693200+03:00[Europe/Helsinki]")
public class ItemDiscountDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("menuItemName")
  private String menuItemName;

  @JsonProperty("amountOfProduct")
  private Integer amountOfProduct;

  @JsonProperty("discountPercentage")
  private Integer discountPercentage;

  @JsonProperty("discountProof")
  private DiscountProofDto discountProof;

  @JsonProperty("isDeleted")
  private Boolean isDeleted;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate;

  @JsonProperty("changingDate")
  private OffsetDateTime changingDate;

  public ItemDiscountDto id(Long id) {
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

  public ItemDiscountDto menuItemName(String menuItemName) {
    this.menuItemName = menuItemName;
    return this;
  }

  /**
   * Get menuItemName
   * @return menuItemName
  */
  @ApiModelProperty(example = "Cesar salad", value = "")


  public String getMenuItemName() {
    return menuItemName;
  }

  public void setMenuItemName(String menuItemName) {
    this.menuItemName = menuItemName;
  }

  public ItemDiscountDto amountOfProduct(Integer amountOfProduct) {
    this.amountOfProduct = amountOfProduct;
    return this;
  }

  /**
   * Get amountOfProduct
   * @return amountOfProduct
  */
  @ApiModelProperty(example = "2", value = "")


  public Integer getAmountOfProduct() {
    return amountOfProduct;
  }

  public void setAmountOfProduct(Integer amountOfProduct) {
    this.amountOfProduct = amountOfProduct;
  }

  public ItemDiscountDto discountPercentage(Integer discountPercentage) {
    this.discountPercentage = discountPercentage;
    return this;
  }

  /**
   * Get discountPercentage
   * @return discountPercentage
  */
  @ApiModelProperty(example = "18", value = "")


  public Integer getDiscountPercentage() {
    return discountPercentage;
  }

  public void setDiscountPercentage(Integer discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

  public ItemDiscountDto discountProof(DiscountProofDto discountProof) {
    this.discountProof = discountProof;
    return this;
  }

  /**
   * Get discountProof
   * @return discountProof
  */
  @ApiModelProperty(value = "")

  @Valid

  public DiscountProofDto getDiscountProof() {
    return discountProof;
  }

  public void setDiscountProof(DiscountProofDto discountProof) {
    this.discountProof = discountProof;
  }

  public ItemDiscountDto isDeleted(Boolean isDeleted) {
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

  public ItemDiscountDto creationDate(OffsetDateTime creationDate) {
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

  public ItemDiscountDto changingDate(OffsetDateTime changingDate) {
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
    ItemDiscountDto itemDiscount = (ItemDiscountDto) o;
    return Objects.equals(this.id, itemDiscount.id)
            && Objects.equals(this.menuItemName, itemDiscount.menuItemName)
            && Objects.equals(this.amountOfProduct, itemDiscount.amountOfProduct)
            && Objects.equals(this.discountPercentage, itemDiscount.discountPercentage)
            && Objects.equals(this.discountProof, itemDiscount.discountProof)
            && Objects.equals(this.isDeleted, itemDiscount.isDeleted)
            && Objects.equals(this.creationDate, itemDiscount.creationDate)
            && Objects.equals(this.changingDate, itemDiscount.changingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, menuItemName, amountOfProduct, discountPercentage, discountProof,
            isDeleted, creationDate, changingDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDiscountDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    menuItemName: ").append(toIndentedString(menuItemName)).append("\n");
    sb.append("    amountOfProduct: ").append(toIndentedString(amountOfProduct)).append("\n");
    sb.append("    discountPercentage: ").append(toIndentedString(discountPercentage)).append("\n");
    sb.append("    discountProof: ").append(toIndentedString(discountProof)).append("\n");
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

