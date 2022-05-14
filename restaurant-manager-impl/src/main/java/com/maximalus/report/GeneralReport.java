package com.maximalus.report;

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
@Table(name="general_reports")
public class GeneralReport extends Report {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "general_report_generator")
    @SequenceGenerator(allocationSize = 1, name = "general_report_generator")
    private Long id;

    @Column(nullable = false)
    private int numberOfOrders;

    @Column(nullable = false)
    private int numberOfCustomers;

    @Column(nullable = false)
    private int numberOfUnpaidOrders;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeneralReport)) return false;
        if (!super.equals(o)) return false;
        GeneralReport that = (GeneralReport) o;
        return numberOfOrders == that.numberOfOrders
                && numberOfCustomers == that.numberOfCustomers
                && numberOfUnpaidOrders == that.numberOfUnpaidOrders
                && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, numberOfOrders, numberOfCustomers, numberOfUnpaidOrders);
    }
}
