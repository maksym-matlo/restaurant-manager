package com.maximalus.product;

import com.maximalus.BaseEntity;
import com.maximalus.outlet.Outlet;
import com.maximalus.product.ingredient.Ingredient;
import com.maximalus.product.item.menuitem.MenuItem;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "recipes")
public class Recipe extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipe_generator")
    @SequenceGenerator(allocationSize = 1, name = "recipe_generator")
    private Long id;

    @ManyToOne
    @JoinColumn(name="ingredient_id")
    private Ingredient ingredient;

    @ManyToOne
    @JoinColumn(name="menu_item_id")
    private MenuItem menuItem;

    @ManyToOne
    @JoinColumn(name="outlet_id")
    private Outlet outlet;

    @Column(nullable = false)
    private Double amountOfIngredient;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        if (!super.equals(o)) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(id, recipe.id)
                && Objects.equals(ingredient, recipe.ingredient)
                && Objects.equals(menuItem, recipe.menuItem)
                && Objects.equals(outlet, recipe.outlet)
                && Objects.equals(amountOfIngredient, recipe.amountOfIngredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, ingredient, menuItem, outlet, amountOfIngredient);
    }
}
