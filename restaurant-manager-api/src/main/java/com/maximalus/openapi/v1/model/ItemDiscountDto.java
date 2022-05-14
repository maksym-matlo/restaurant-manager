package com.maximalus.openapi.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Info about item discount
 */
@ApiModel(description = "Info about item discount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-03T11:47:28.437270400+03:00[Europe/Helsinki]")
public class ItemDiscountDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("menuItemName")
  private String menuItemName;

  @JsonProperty("amountOfProduct")
  private Long amountOfProduct;

  @JsonProperty("discountPercentage")
  private Long discountPercentage;

  @JsonProperty("discountProof")
  private DiscountProofDto discountProof;

  @JsonProperty("isDeleted")
  private Boolean isDeleted;

  @JsonProperty("creationDate")
  private LocalDate creationDate;

  @JsonProperty("changingDate")
  private LocalDate changingDate;

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

  public ItemDiscountDto amountOfProduct(Long amountOfProduct) {
    this.amountOfProduct = amountOfProduct;
    return this;
  }

  /**
   * Get amountOfProduct
   * @return amountOfProduct
  */
  @ApiModelProperty(example = "2", value = "")


  public Long getAmountOfProduct() {
    return amountOfProduct;
  }

  public void setAmountOfProduct(Long amountOfProduct) {
    this.amountOfProduct = amountOfProduct;
  }

  public ItemDiscountDto discountPercentage(Long discountPercentage) {
    this.discountPercentage = discountPercentage;
    return this;
  }

  /**
   * Get discountPercentage
   * @return discountPercentage
  */
  @ApiModelProperty(example = "18", value = "")


  public Long getDiscountPercentage() {
    return discountPercentage;
  }

  public void setDiscountPercentage(Long discountPercentage) {
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

  public ItemDiscountDto creationDate(LocalDate creationDate) {
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

  public ItemDiscountDto changingDate(LocalDate changingDate) {
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
    return Objects.hash(id, menuItemName, amountOfProduct, discountPercentage, discountProof, isDeleted, creationDate, changingDate);
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

