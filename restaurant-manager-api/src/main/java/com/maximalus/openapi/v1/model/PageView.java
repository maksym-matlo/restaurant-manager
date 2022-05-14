package com.maximalus.openapi.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

/**
 * PageViewDto
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-03T11:47:28.437270400+03:00[Europe/Helsinki]")
public class PageView<T> {
  @JsonProperty("total")
  private Long total;

  @JsonProperty("data")
  @Valid
  private List<T> data = null;

  public PageView total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  @ApiModelProperty(example = "1000", value = "")


  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public PageView data(List<T> data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<T> getData() {
    return data;
  }

  public void setData(List<T> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageView pageView = (PageView) o;
    return Objects.equals(this.total, pageView.total)
            && Objects.equals(this.data, pageView.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageViewDto {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

