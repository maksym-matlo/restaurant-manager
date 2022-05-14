package com.maximalus.openapi.v1.model;

import java.util.Objects;

/**
 * RequestFilter.
 *
 * @author Maksym Matlo
 */
public class RequestFilter {

    private String firstName;

    private String lastName;

    private String outletName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOutletName() {
        return outletName;
    }

    public void setOutletName(String outletName) {
        this.outletName = outletName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RequestFilter)) return false;
        RequestFilter that = (RequestFilter) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(outletName, that.outletName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, outletName);
    }
}
