package com.maximalus.discount;

import com.maximalus.product.item.menuitem.MenuItem;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "product_discounts")
public class ItemDiscount extends Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "discount_generator")
    @SequenceGenerator(allocationSize = 1, name = "discount_generator")
    private Long id;

    @OneToOne
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private MenuItem menuItem;

    @Column(nullable = false)
    private int requiredProductAmount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemDiscount)) return false;
        if (!super.equals(o)) return false;
        ItemDiscount that = (ItemDiscount) o;
        return requiredProductAmount == that.requiredProductAmount
                && Objects.equals(id, that.id)
                && Objects.equals(menuItem, that.menuItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, menuItem, requiredProductAmount);
    }
}
