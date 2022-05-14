package com.maximalus.product.ingredient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.maximalus.BaseEntity;
import com.maximalus.product.UnitName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name="ingredients")
public class Ingredient extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ingredient_generator")
    @SequenceGenerator(allocationSize = 1, name = "ingredient_generator")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UnitName unitName;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name="ingredient_group_id", nullable = false)
    @JsonBackReference
    private IngredientGroup ingredientGroup;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingredient)) return false;
        if (!super.equals(o)) return false;
        Ingredient that = (Ingredient) o;
        return Objects.equals(id, that.id)
                && Objects.equals(name, that.name)
                && unitName == that.unitName
                && Objects.equals(ingredientGroup, that.ingredientGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, name, unitName, ingredientGroup);
    }
}
