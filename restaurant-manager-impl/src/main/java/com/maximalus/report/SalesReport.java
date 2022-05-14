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
import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name="sales_reports")
public class SalesReport extends Report {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sales_report_generator")
    @SequenceGenerator(allocationSize = 1, name = "sales_report_generator")
    private Long id;

    @Column(nullable = false)
    private int totalOrdersNumber;

    @Column(nullable = false)
    private int publishedOrdersNumber;

    @Column(nullable = false)
    private int paidOrdersNumber;

    @Column(nullable = false)
    private int unpaidOrdersNumber;

    @Column(nullable = false)
    private int partialPaidOrdersNumber;

    @Column(nullable = false)
    private int closedOrdersNumber;

    @Column(nullable = false)
    private BigDecimal totalSales;

    @Column(nullable = false)
    private BigDecimal ingredientsCost;

    @Column(nullable = false)
    private BigDecimal totalRevenue;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalesReport)) return false;
        if (!super.equals(o)) return false;
        SalesReport that = (SalesReport) o;
        return totalOrdersNumber == that.totalOrdersNumber
                && publishedOrdersNumber == that.publishedOrdersNumber
                && paidOrdersNumber == that.paidOrdersNumber
                && unpaidOrdersNumber == that.unpaidOrdersNumber
                && partialPaidOrdersNumber == that.partialPaidOrdersNumber
                && closedOrdersNumber == that.closedOrdersNumber
                && Objects.equals(id, that.id)
                && Objects.equals(totalSales, that.totalSales)
                && Objects.equals(ingredientsCost, that.ingredientsCost)
                && Objects.equals(totalRevenue, that.totalRevenue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, totalOrdersNumber, publishedOrdersNumber,
                paidOrdersNumber, unpaidOrdersNumber, partialPaidOrdersNumber, closedOrdersNumber,
                totalSales, ingredientsCost, totalRevenue);
    }
}
