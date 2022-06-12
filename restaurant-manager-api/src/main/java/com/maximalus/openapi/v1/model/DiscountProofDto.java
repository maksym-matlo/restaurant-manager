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
 * Info about discount proof
 */
@ApiModel(description = "Info about discount proof")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-12T15:05:08.452693200+03:00[Europe/Helsinki]")
public class DiscountProofDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("encodedImage")
  private String encodedImage;

  @JsonProperty("isDeleted")
  private Boolean isDeleted;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate;

  @JsonProperty("changingDate")
  private OffsetDateTime changingDate;

  public DiscountProofDto id(Long id) {
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

  public DiscountProofDto encodedImage(String encodedImage) {
    this.encodedImage = encodedImage;
    return this;
  }

  /**
   * Get encodedImage
   * @return encodedImage
  */
  @ApiModelProperty(value = "")


  public String getEncodedImage() {
    return encodedImage;
  }

  public void setEncodedImage(String encodedImage) {
    this.encodedImage = encodedImage;
  }

  public DiscountProofDto isDeleted(Boolean isDeleted) {
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

  public DiscountProofDto creationDate(OffsetDateTime creationDate) {
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

  public DiscountProofDto changingDate(OffsetDateTime changingDate) {
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
    DiscountProofDto discountProof = (DiscountProofDto) o;
    return Objects.equals(this.id, discountProof.id)
            && Objects.equals(this.encodedImage, discountProof.encodedImage)
            && Objects.equals(this.isDeleted, discountProof.isDeleted)
            && Objects.equals(this.creationDate, discountProof.creationDate)
            && Objects.equals(this.changingDate, discountProof.changingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, encodedImage, isDeleted, creationDate, changingDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountProofDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    encodedImage: ").append(toIndentedString(encodedImage)).append("\n");
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

