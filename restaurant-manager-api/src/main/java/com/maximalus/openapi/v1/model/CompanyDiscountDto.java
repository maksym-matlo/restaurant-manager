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
 * Info about company discount
 */
@ApiModel(description = "Info about company discount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-12T15:05:08.452693200+03:00[Europe/Helsinki]")
public class CompanyDiscountDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("companyName")
  private String companyName;

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

  public CompanyDiscountDto discountPercentage(Integer discountPercentage) {
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

  public CompanyDiscountDto creationDate(OffsetDateTime creationDate) {
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

  public CompanyDiscountDto changingDate(OffsetDateTime changingDate) {
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

