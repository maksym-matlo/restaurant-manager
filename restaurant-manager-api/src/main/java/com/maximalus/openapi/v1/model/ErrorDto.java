package com.maximalus.openapi.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error description
 */
@ApiModel(description = "Error description")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-12T15:05:08.452693200+03:00[Europe/Helsinki]")
public class ErrorDto   {
  @JsonProperty("timestamp")
  private OffsetDateTime timestamp;

  @JsonProperty("status")
  private Integer status;

  @JsonProperty("errorCode")
  private String errorCode;

  @JsonProperty("message")
  private String message;

  @JsonProperty("path")
  private String path;

  @JsonProperty("additional")
  @Valid
  private Map<String, Object> additional = null;

  public ErrorDto timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Date and time the error occurred
   * @return timestamp
  */
  @ApiModelProperty(example = "2018-12-03T10:15:30+01:00", required = true, value = "Date and time the error occurred")
  @NotNull

  @Valid

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public ErrorDto status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * HTTP status code of the error
   * @return status
  */
  @ApiModelProperty(example = "404", required = true, value = "HTTP status code of the error")
  @NotNull


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ErrorDto errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Business error code that allows using 'additional' or redefine 'message'
   * @return errorCode
  */
  @ApiModelProperty(example = "VALIDATION_ERROR", value = "Business error code that allows using 'additional' or redefine 'message'")


  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ErrorDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message
   * @return message
  */
  @ApiModelProperty(required = true, value = "Error message")
  @NotNull


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorDto path(String path) {
    this.path = path;
    return this;
  }

  /**
   * URL that resulted in the error
   * @return path
  */
  @ApiModelProperty(example = "ui/cards/54321/history", required = true, value = "URL that resulted in the error")
  @NotNull


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ErrorDto additional(Map<String, Object> additional) {
    this.additional = additional;
    return this;
  }

  /**
   * Additional information on the error that is a map of keys and values. Different error code can have different keys 
   * @return additional
  */
  @ApiModelProperty(value = "Additional information on the error that is a map of keys and values. Different error code can have different keys ")


  public Map<String, Object> getAdditional() {
    return additional;
  }

  public void setAdditional(Map<String, Object> additional) {
    this.additional = additional;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDto error = (ErrorDto) o;
    return Objects.equals(this.timestamp, error.timestamp)
            && Objects.equals(this.status, error.status)
            && Objects.equals(this.errorCode, error.errorCode)
            && Objects.equals(this.message, error.message)
            && Objects.equals(this.path, error.path)
            && Objects.equals(this.additional, error.additional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, status, errorCode, message, path, additional);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDto {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
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

