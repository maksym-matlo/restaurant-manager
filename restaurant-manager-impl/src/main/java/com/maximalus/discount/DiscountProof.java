package com.maximalus.discount;

import com.maximalus.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "discount_proofs")
public class DiscountProof extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "discount_proof_generator")
    @SequenceGenerator(allocationSize = 1, name = "discount_proof_generator")
    private Long id;

    @Lob
    @Column(nullable = false)
    private String encodedImage;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DiscountProof that = (DiscountProof) o;
        return Objects.equals(id, that.id) && Objects.equals(encodedImage, that.encodedImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, encodedImage);
    }
}
