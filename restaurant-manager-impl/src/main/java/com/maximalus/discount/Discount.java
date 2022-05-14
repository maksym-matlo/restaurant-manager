package com.maximalus.discount;

import com.maximalus.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

@Getter
@Setter
@ToString(callSuper = true)
@MappedSuperclass
public abstract class Discount extends BaseEntity {
    @Column(nullable = false)
    private int discountPercentage;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private DiscountProof discountProof;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Discount)) return false;
        if (!super.equals(o)) return false;
        Discount discount = (Discount) o;
        return discountPercentage == discount.discountPercentage && Objects.equals(discountProof, discount.discountProof);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discountPercentage, discountProof);
    }
}
