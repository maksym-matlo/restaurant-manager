package com.maximalus.openapi.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.Objects;

/**
 * Info about usage of 1 ingredient for different menuItems
 */
@ApiModel(description = "Info about usage of 1 ingredient for different menuItems")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-03T11:47:28.437270400+03:00[Europe/Helsinki]")
public class RecipeDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("ingredient")
  private IngredientDto ingredient;

  @JsonProperty("menuItem")
  private MenuItemDto menuItem;

  @JsonProperty("outlet")
  private OutletDto outlet;

  @JsonProperty("amountOfIngredient")
  private Double amountOfIngredient;

  public RecipeDto id(Long id) {
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

  public RecipeDto ingredient(IngredientDto ingredient) {
    this.ingredient = ingredient;
    return this;
  }

  /**
   * Get ingredient
   * @return ingredient
  */
  @ApiModelProperty(value = "")

  @Valid

  public IngredientDto getIngredient() {
    return ingredient;
  }

  public void setIngredient(IngredientDto ingredient) {
    this.ingredient = ingredient;
  }

  public RecipeDto menuItem(MenuItemDto menuItem) {
    this.menuItem = menuItem;
    return this;
  }

  /**
   * Get menuItem
   * @return menuItem
  */
  @ApiModelProperty(value = "")

  @Valid

  public MenuItemDto getMenuItem() {
    return menuItem;
  }

  public void setMenuItem(MenuItemDto menuItem) {
    this.menuItem = menuItem;
  }

  public RecipeDto outlet(OutletDto outlet) {
    this.outlet = outlet;
    return this;
  }

  /**
   * Get outlet
   * @return outlet
  */
  @ApiModelProperty(value = "")

  @Valid

  public OutletDto getOutlet() {
    return outlet;
  }

  public void setOutlet(OutletDto outlet) {
    this.outlet = outlet;
  }

  public RecipeDto amountOfIngredient(Double amountOfIngredient) {
    this.amountOfIngredient = amountOfIngredient;
    return this;
  }

  /**
   * Get amountOfIngredient
   * @return amountOfIngredient
  */
  @ApiModelProperty(example = "1123.0", value = "")


  public Double getAmountOfIngredient() {
    return amountOfIngredient;
  }

  public void setAmountOfIngredient(Double amountOfIngredient) {
    this.amountOfIngredient = amountOfIngredient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipeDto recipe = (RecipeDto) o;
    return Objects.equals(this.id, recipe.id)
            && Objects.equals(this.ingredient, recipe.ingredient)
            && Objects.equals(this.menuItem, recipe.menuItem)
            && Objects.equals(this.outlet, recipe.outlet)
            && Objects.equals(this.amountOfIngredient, recipe.amountOfIngredient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ingredient, menuItem, outlet, amountOfIngredient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ingredient: ").append(toIndentedString(ingredient)).append("\n");
    sb.append("    menuItem: ").append(toIndentedString(menuItem)).append("\n");
    sb.append("    outlet: ").append(toIndentedString(outlet)).append("\n");
    sb.append("    amountOfIngredient: ").append(toIndentedString(amountOfIngredient)).append("\n");
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

