package com.maximalus.outlet;

import com.maximalus.BaseEntity;
import com.maximalus.order.Order;
import com.maximalus.storage.IngredientStorage;
import com.maximalus.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "outlets")
public class Outlet extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "outlet_generator")
    @SequenceGenerator(allocationSize = 1, name = "outlet_generator")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Setter(AccessLevel.PRIVATE)
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private List<Order> orders = new ArrayList<>();

    @Setter(AccessLevel.PRIVATE)
    @OneToMany
    @ToString.Exclude
    private List<User> users = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "storage_id")
    private IngredientStorage ingredientStorage;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Outlet)) return false;
        if (!super.equals(o)) return false;
        Outlet outlet = (Outlet) o;
        return Objects.equals(id, outlet.id)
                && Objects.equals(name, outlet.name)
                && Objects.equals(ingredientStorage, outlet.ingredientStorage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, name, ingredientStorage);
    }
}
