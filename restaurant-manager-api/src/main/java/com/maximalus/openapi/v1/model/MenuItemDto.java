package com.maximalus.openapi.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

/**
 * Information about item from menu
 */
@ApiModel(description = "Information about item from menu")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-03T11:47:28.437270400+03:00[Europe/Helsinki]")
public class MenuItemDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("pricePerUnit")
  private Double pricePerUnit;

  @JsonProperty("markupPercentage")
  private Long markupPercentage;

  @JsonProperty("purchasePricePerUnit")
  private Double purchasePricePerUnit;

  @JsonProperty("availableQuantity")
  private Long availableQuantity;

  @JsonProperty("outletName")
  private String outletName;

  @JsonProperty("recipes")
  @Valid
  private List<RecipeDto> recipes = null;

  @JsonProperty("itemDiscount")
  private ItemDiscountDto itemDiscount;

  @JsonProperty("menuItemGroup")
  private MenuItemGroupDto menuItemGroup;

  @JsonProperty("menuItemStatus")
  private String menuItemStatus;

  public MenuItemDto id(Long id) {
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

  public MenuItemDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "Cesar salad", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MenuItemDto pricePerUnit(Double pricePerUnit) {
    this.pricePerUnit = pricePerUnit;
    return this;
  }

  /**
   * Get pricePerUnit
   * @return pricePerUnit
  */
  @ApiModelProperty(example = "120.00", value = "")


  public Double getPricePerUnit() {
    return pricePerUnit;
  }

  public void setPricePerUnit(Double pricePerUnit) {
    this.pricePerUnit = pricePerUnit;
  }

  public MenuItemDto markupPercentage(Long markupPercentage) {
    this.markupPercentage = markupPercentage;
    return this;
  }

  /**
   * Get markupPercentage
   * @return markupPercentage
  */
  @ApiModelProperty(example = "18", value = "")


  public Long getMarkupPercentage() {
    return markupPercentage;
  }

  public void setMarkupPercentage(Long markupPercentage) {
    this.markupPercentage = markupPercentage;
  }

  public MenuItemDto purchasePricePerUnit(Double purchasePricePerUnit) {
    this.purchasePricePerUnit = purchasePricePerUnit;
    return this;
  }

  /**
   * Get purchasePricePerUnit
   * @return purchasePricePerUnit
  */
  @ApiModelProperty(example = "120.00", value = "")


  public Double getPurchasePricePerUnit() {
    return purchasePricePerUnit;
  }

  public void setPurchasePricePerUnit(Double purchasePricePerUnit) {
    this.purchasePricePerUnit = purchasePricePerUnit;
  }

  public MenuItemDto availableQuantity(Long availableQuantity) {
    this.availableQuantity = availableQuantity;
    return this;
  }

  /**
   * Get availableQuantity
   * @return availableQuantity
  */
  @ApiModelProperty(example = "186", value = "")


  public Long getAvailableQuantity() {
    return availableQuantity;
  }

  public void setAvailableQuantity(Long availableQuantity) {
    this.availableQuantity = availableQuantity;
  }

  public MenuItemDto outletName(String outletName) {
    this.outletName = outletName;
    return this;
  }

  /**
   * Get outletName
   * @return outletName
  */
  @ApiModelProperty(example = "LaSpiga", value = "")


  public String getOutletName() {
    return outletName;
  }

  public void setOutletName(String outletName) {
    this.outletName = outletName;
  }

  public MenuItemDto recipes(List<RecipeDto> recipes) {
    this.recipes = recipes;
    return this;
  }

  /**
   * Get recipes
   * @return recipes
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RecipeDto> getRecipes() {
    return recipes;
  }

  public void setRecipes(List<RecipeDto> recipes) {
    this.recipes = recipes;
  }

  public MenuItemDto itemDiscount(ItemDiscountDto itemDiscount) {
    this.itemDiscount = itemDiscount;
    return this;
  }

  /**
   * Get itemDiscount
   * @return itemDiscount
  */
  @ApiModelProperty(value = "")

  @Valid

  public ItemDiscountDto getItemDiscount() {
    return itemDiscount;
  }

  public void setItemDiscount(ItemDiscountDto itemDiscount) {
    this.itemDiscount = itemDiscount;
  }

  public MenuItemDto menuItemGroup(MenuItemGroupDto menuItemGroup) {
    this.menuItemGroup = menuItemGroup;
    return this;
  }

  /**
   * Get menuItemGroup
   * @return menuItemGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public MenuItemGroupDto getMenuItemGroup() {
    return menuItemGroup;
  }

  public void setMenuItemGroup(MenuItemGroupDto menuItemGroup) {
    this.menuItemGroup = menuItemGroup;
  }

  public MenuItemDto menuItemStatus(String menuItemStatus) {
    this.menuItemStatus = menuItemStatus;
    return this;
  }

  /**
   * Get menuItemStatus
   * @return menuItemStatus
  */
  @ApiModelProperty(example = "IN_STOCK", value = "")


  public String getMenuItemStatus() {
    return menuItemStatus;
  }

  public void setMenuItemStatus(String menuItemStatus) {
    this.menuItemStatus = menuItemStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuItemDto menuItem = (MenuItemDto) o;
    return Objects.equals(this.id, menuItem.id)
            && Objects.equals(this.name, menuItem.name)
            && Objects.equals(this.pricePerUnit, menuItem.pricePerUnit)
            && Objects.equals(this.markupPercentage, menuItem.markupPercentage)
            && Objects.equals(this.purchasePricePerUnit, menuItem.purchasePricePerUnit)
            && Objects.equals(this.availableQuantity, menuItem.availableQuantity)
            && Objects.equals(this.outletName, menuItem.outletName)
            && Objects.equals(this.recipes, menuItem.recipes)
            && Objects.equals(this.itemDiscount, menuItem.itemDiscount)
            && Objects.equals(this.menuItemGroup, menuItem.menuItemGroup)
            && Objects.equals(this.menuItemStatus, menuItem.menuItemStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, pricePerUnit, markupPercentage, purchasePricePerUnit, availableQuantity, outletName, recipes, itemDiscount, menuItemGroup, menuItemStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuItemDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pricePerUnit: ").append(toIndentedString(pricePerUnit)).append("\n");
    sb.append("    markupPercentage: ").append(toIndentedString(markupPercentage)).append("\n");
    sb.append("    purchasePricePerUnit: ").append(toIndentedString(purchasePricePerUnit)).append("\n");
    sb.append("    availableQuantity: ").append(toIndentedString(availableQuantity)).append("\n");
    sb.append("    outletName: ").append(toIndentedString(outletName)).append("\n");
    sb.append("    recipes: ").append(toIndentedString(recipes)).append("\n");
    sb.append("    itemDiscount: ").append(toIndentedString(itemDiscount)).append("\n");
    sb.append("    menuItemGroup: ").append(toIndentedString(menuItemGroup)).append("\n");
    sb.append("    menuItemStatus: ").append(toIndentedString(menuItemStatus)).append("\n");
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

