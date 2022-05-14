package com.maximalus.order;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@Entity
public class OrderStatusRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_status_entry_generator")
    @SequenceGenerator(allocationSize = 1, name = "order_status_entry_generator")
    private Long id;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    @ManyToOne
    @JoinColumn(name="order_id", nullable = false)
    private Order order;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderStatusRecord)) return false;
        OrderStatusRecord that = (OrderStatusRecord) o;
        return Objects.equals(id, that.id) && orderStatus == that.orderStatus
                && Objects.equals(creationDate, that.creationDate)
                && Objects.equals(order, that.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderStatus, creationDate, order);
    }
}
