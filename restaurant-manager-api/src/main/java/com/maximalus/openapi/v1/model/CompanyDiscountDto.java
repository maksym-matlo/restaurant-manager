package com.maximalus.openapi.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Info about company discount
 */
@ApiModel(description = "Info about company discount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-03T11:47:28.437270400+03:00[Europe/Helsinki]")
public class CompanyDiscountDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("companyName")
  private String companyName;

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

  public CompanyDiscountDto id(Long id) {
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

  public CompanyDiscountDto companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  */
  @ApiModelProperty(example = "Microsoft", value = "")


  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public CompanyDiscountDto discountPercentage(Long discountPercentage) {
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

  public CompanyDiscountDto discountProof(DiscountProofDto discountProof) {
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

  public CompanyDiscountDto isDeleted(Boolean isDeleted) {
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

  public CompanyDiscountDto creationDate(LocalDate creationDate) {
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

  public CompanyDiscountDto changingDate(LocalDate changingDate) {
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
    CompanyDiscountDto companyDiscount = (CompanyDiscountDto) o;
    return Objects.equals(this.id, companyDiscount.id)
            && Objects.equals(this.companyName, companyDiscount.companyName)
            && Objects.equals(this.discountPercentage, companyDiscount.discountPercentage)
            && Objects.equals(this.discountProof, companyDiscount.discountProof)
            && Objects.equals(this.isDeleted, companyDiscount.isDeleted)
            && Objects.equals(this.creationDate, companyDiscount.creationDate)
            && Objects.equals(this.changingDate, companyDiscount.changingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyName, discountPercentage, discountProof, isDeleted, creationDate, changingDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyDiscountDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
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

