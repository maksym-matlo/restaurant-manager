package com.maximalus.product.item.orderitem;

import com.maximalus.order.Order;
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@ToString
@Entity
@Table(name = "order_items")
public class OrderItem{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_item_generator")
    @SequenceGenerator(allocationSize = 1, name = "order_item_generator")
    private Long id;

    @OneToOne
    private MenuItem menuItem;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(nullable = false)
    private BigDecimal pricePerUnit;

    @Column(nullable = false)
    private int orderedAmount;

    @Column(precision = 10, scale = 2)
    private BigDecimal totalCost;

    @Column
    private String comment;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return orderedAmount == orderItem.orderedAmount
                && Objects.equals(id, orderItem.id)
                && Objects.equals(menuItem, orderItem.menuItem)
                && Objects.equals(order, orderItem.order)
                && Objects.equals(pricePerUnit, orderItem.pricePerUnit)
                && Objects.equals(totalCost, orderItem.totalCost)
                && Objects.equals(comment, orderItem.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, menuItem, order, pricePerUnit, orderedAmount, totalCost, comment);
    }
}
