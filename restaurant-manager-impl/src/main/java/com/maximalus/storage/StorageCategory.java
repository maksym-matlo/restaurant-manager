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
@ToString
@Entity
@Table(name="storage_category")
public class StorageCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "storage_type_generator")
    @SequenceGenerator(allocationSize = 1, name = "storage_type_generator")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StorageCategory)) return false;
        StorageCategory that = (StorageCategory) o;
        return Objects.equals(id, that.id)
                && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}