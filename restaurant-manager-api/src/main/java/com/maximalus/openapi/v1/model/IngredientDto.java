package com.maximalus.openapi.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * Informaation about ingredient
 */
@ApiModel(description = "Informaation about ingredient")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-03T11:47:28.437270400+03:00[Europe/Helsinki]")
public class IngredientDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("unitName")
  private String unitName;

  @JsonProperty("ingredientGroupName")
  private String ingredientGroupName;

  public IngredientDto id(Long id) {
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

  public IngredientDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "Turkey ham", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IngredientDto unitName(String unitName) {
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

  public IngredientDto ingredientGroupName(String ingredientGroupName) {
    this.ingredientGroupName = ingredientGroupName;
    return this;
  }

  /**
   * Get ingredientGroupName
   * @return ingredientGroupName
  */
  @ApiModelProperty(example = "Meat", value = "")


  public String getIngredientGroupName() {
    return ingredientGroupName;
  }

  public void setIngredientGroupName(String ingredientGroupName) {
    this.ingredientGroupName = ingredientGroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngredientDto ingredient = (IngredientDto) o;
    return Objects.equals(this.id, ingredient.id)
            && Objects.equals(this.name, ingredient.name)
            && Objects.equals(this.unitName, ingredient.unitName)
            && Objects.equals(this.ingredientGroupName, ingredient.ingredientGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, unitName, ingredientGroupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unitName: ").append(toIndentedString(unitName)).append("\n");
    sb.append("    ingredientGroupName: ").append(toIndentedString(ingredientGroupName)).append("\n");
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

