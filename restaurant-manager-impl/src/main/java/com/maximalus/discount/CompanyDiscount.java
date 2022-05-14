package com.maximalus.discount;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "company_discounts")
public class CompanyDiscount extends Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "discount_generator")
    @SequenceGenerator(allocationSize = 1, name = "discount_generator")
    private Long id;

    @Column(nullable = false)
    private String companyName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompanyDiscount)) return false;
        if (!super.equals(o)) return false;
        CompanyDiscount that = (CompanyDiscount) o;
        return Objects.equals(id, that.id) && Objects.equals(companyName, that.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, companyName);
    }
}
