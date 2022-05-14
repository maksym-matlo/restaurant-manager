package com.maximalus.storage;

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
@Table(name = "material_storage")
public class MaterialStorage extends Storage{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "material_storage_generator")
    @SequenceGenerator(allocationSize = 1, name = "material_storage_generator")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int initialAmount;

    @Column(nullable = false)
    private int currentAmount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MaterialStorage)) return false;
        if (!super.equals(o)) return false;
        MaterialStorage that = (MaterialStorage) o;
        return initialAmount == that.initialAmount
                && currentAmount == that.currentAmount
                && Objects.equals(id, that.id)
                && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, name, initialAmount, currentAmount);
    }
}
