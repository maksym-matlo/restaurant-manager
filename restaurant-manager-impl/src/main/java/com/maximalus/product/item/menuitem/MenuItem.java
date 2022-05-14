package com.maximalus.product.item.menuitem;

import com.maximalus.BaseEntity;
import com.maximalus.outlet.Outlet;
import com.maximalus.discount.ItemDiscount;
import com.maximalus.product.Recipe;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "menu_items")
public class MenuItem extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "menu_item_generator")
    @SequenceGenerator(allocationSize = 1, name = "menu_item_generator")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal pricePerUnit;

    @Column(nullable = false)
    private int markupPercentage;

    @Column(nullable = false)
    private BigDecimal purchasePricePerUnit;

    @Column(nullable = false)
    private int availableQuantity;

    @ManyToOne
    @JoinColumn(name="outlet_id")
    private Outlet outlet;

    @OneToMany(mappedBy = "menuItem")
    @ToString.Exclude
    private List<Recipe> recipes = new ArrayList<>();

    @OneToOne
    private ItemDiscount itemDiscount;

    @ManyToOne
    @JoinColumn(name="item_group_id")
    private MenuItemGroup menuItemGroup;

    @Enumerated
    private MenuItemStatus menuItemStatus;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        if (!super.equals(o)) return false;
        MenuItem menuItem = (MenuItem) o;
        return markupPercentage == menuItem.markupPercentage
                && availableQuantity == menuItem.availableQuantity
                && Objects.equals(id, menuItem.id)
                && Objects.equals(name, menuItem.name)
                && Objects.equals(pricePerUnit, menuItem.pricePerUnit)
                && Objects.equals(purchasePricePerUnit, menuItem.purchasePricePerUnit)
                && Objects.equals(outlet, menuItem.outlet)
                && Objects.equals(itemDiscount, menuItem.itemDiscount)
                && Objects.equals(menuItemGroup, menuItem.menuItemGroup)
                && menuItemStatus == menuItem.menuItemStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, name, pricePerUnit, markupPercentage,
                purchasePricePerUnit, availableQuantity, outlet,
                itemDiscount, menuItemGroup, menuItemStatus);
    }
}
