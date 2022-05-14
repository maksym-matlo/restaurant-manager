package com.maximalus.storage;

import com.maximalus.BaseEntity;
import com.maximalus.outlet.Outlet;
import com.maximalus.product.UnitName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@ToString(callSuper = true)
@MappedSuperclass
public abstract class Storage extends BaseEntity {
    @Column(nullable = false)
    @Enumerated
    private UnitName unitName;

    @Column(precision = 10, scale = 2)
    private BigDecimal totalPrice;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal costPerUnit;

    @ManyToOne
    @JoinColumn(name = "storage_type_id")
    private StorageCategory storageCategory;

    @ManyToOne
    @JoinColumn(name = "outlet_id")
    private Outlet outlet;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Storage)) return false;
        if (!super.equals(o)) return false;
        Storage storage = (Storage) o;
        return unitName == storage.unitName
                && Objects.equals(totalPrice, storage.totalPrice)
                && Objects.equals(costPerUnit, storage.costPerUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), unitName, totalPrice, costPerUnit);
    }
}
