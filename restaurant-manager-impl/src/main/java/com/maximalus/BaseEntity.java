package com.maximalus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class BaseEntity {
    @Column(nullable = false)
    private boolean deleted;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    @Column(nullable = false)
    private LocalDateTime changingDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntity)) return false;
        BaseEntity that = (BaseEntity) o;
        return deleted == that.deleted
                && Objects.equals(creationDate, that.creationDate)
                && Objects.equals(changingDate, that.changingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleted, creationDate, changingDate);
    }
}
