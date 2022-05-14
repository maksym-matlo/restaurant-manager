package com.maximalus.storage;

import com.maximalus.product.ingredient.Ingredient;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Company ingredient storage
 *
 * @author Maksym Matlo
 */
@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "ingredient_storage")
public class IngredientStorage extends Storage {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ingredient_storage_generator")
    @SequenceGenerator(allocationSize = 1, name = "ingredient_storage_generator")
    private Long id;

    @OneToOne
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal currentQuantity;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal initialQuantity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IngredientStorage)) return false;
        if (!super.equals(o)) return false;
        IngredientStorage that = (IngredientStorage) o;
        return Objects.equals(id, that.id)
                && Objects.equals(ingredient, that.ingredient)
                && Objects.equals(currentQuantity, that.currentQuantity)
                && Objects.equals(initialQuantity, that.initialQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, ingredient, currentQuantity, initialQuantity);
    }
}
