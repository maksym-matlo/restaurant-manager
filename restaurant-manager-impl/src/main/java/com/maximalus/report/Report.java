package com.maximalus.report;

import com.maximalus.outlet.Outlet;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class Report {
    @OneToOne(cascade = CascadeType.ALL)
    private Outlet outlet;

    @Column(nullable = false)
    private LocalDateTime dateFrom;

    @Column(nullable = false)
    private LocalDateTime dateUntil;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Report)) return false;
        Report report = (Report) o;
        return Objects.equals(outlet, report.outlet)
                && Objects.equals(dateFrom, report.dateFrom)
                && Objects.equals(dateUntil, report.dateUntil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outlet, dateFrom, dateUntil);
    }
}
