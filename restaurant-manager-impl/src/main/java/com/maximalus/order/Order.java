package com.maximalus.order;

import com.maximalus.BaseEntity;
import com.maximalus.discount.ItemDiscount;
import com.maximalus.outlet.Outlet;
import com.maximalus.user.User;
import com.maximalus.discount.CompanyDiscount;
import com.maximalus.product.item.orderitem.OrderItem;
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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Setter
@Getter
@ToString(callSuper = true)
@Entity
@Table(name = "orders")
public class Order extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_generator")
    @SequenceGenerator(allocationSize = 1, name = "order_generator")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "outlet_id")
    private Outlet outlet;

    @OneToMany(mappedBy = "order")
    @ToString.Exclude
    private List<OrderItem> orderItems = new ArrayList<>();

    @Column(nullable = false)
    private int customerNumber;

    @Column(nullable = false)
    private int tableNumber;

    @OneToOne
    private CompanyDiscount companyDiscount;

    @OneToOne
    private ItemDiscount itemDiscount;

    @Column(nullable = false)
    private BigDecimal totalCost;

    @OneToMany(mappedBy = "order")
    @ToString.Exclude
    private List<OrderStatusRecord> orderStatusRecords = new ArrayList<>();

    public void addOrderStatusRecord(OrderStatus orderStatus){
        OrderStatusRecord orderStatusRecord = new OrderStatusRecord();
        orderStatusRecord.setOrderStatus(orderStatus);
        orderStatusRecord.setCreationDate(LocalDateTime.now());
        this.orderStatusRecords.add(orderStatusRecord);
        orderStatusRecord.setOrder(this);
    }

    public void addOrderItem (OrderItem orderItem) {
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }

    public void removeOrderItem(OrderItem orderItem) {
        orderItems.remove(orderItem);
        orderItem.setOrder(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        if (!super.equals(o)) return false;
        Order order = (Order) o;
        return customerNumber == order.customerNumber
                && tableNumber == order.tableNumber
                && Objects.equals(id, order.id)
                && Objects.equals(user, order.user)
                && Objects.equals(outlet, order.outlet)
                && Objects.equals(companyDiscount, order.companyDiscount)
                && Objects.equals(itemDiscount, order.itemDiscount)
                && Objects.equals(totalCost, order.totalCost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, user, outlet, customerNumber, tableNumber,
                companyDiscount, itemDiscount, totalCost);
    }
}
