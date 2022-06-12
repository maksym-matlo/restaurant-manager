package com.maximalus.openapi.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.maximalus.openapi.v1.model.CredentialDto;
import com.maximalus.openapi.v1.model.PermissionDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User role info
 */
@ApiModel(description = "User role info")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-12T15:05:08.452693200+03:00[Europe/Helsinki]")
public class RoleDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("credentials")
  @Valid
  private List<CredentialDto> credentials = null;

  @JsonProperty("permissions")
  @Valid
  private List<PermissionDto> permissions = null;

  public RoleDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(example = "186", value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RoleDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "accounting_specialist", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RoleDto credentials(List<CredentialDto> credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * Get credentials
   * @return credentials
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CredentialDto> getCredentials() {
    return credentials;
  }

  public void setCredentials(List<CredentialDto> credentials) {
    this.credentials = credentials;
  }

  public RoleDto permissions(List<PermissionDto> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Get permissions
   * @return permissions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PermissionDto> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<PermissionDto> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleDto role = (RoleDto) o;
    return Objects.equals(this.id, role.id)
            && Objects.equals(this.name, role.name)
            && Objects.equals(this.credentials, role.credentials)
            && Objects.equals(this.permissions, role.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, credentials, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

