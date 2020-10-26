/*
 * Copyright © 2011 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.everit.atlassian.restclient.jiracloud.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.everit.atlassian.restclient.jiracloud.v3.model.PermissionGrant;
import org.everit.atlassian.restclient.jiracloud.v3.model.Scope;

/**
 * Details of a permission scheme.
 */
@ApiModel(description = "Details of a permission scheme.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-26T10:18:51.013+01:00[Europe/Prague]")
public class PermissionScheme {
  @JsonProperty("expand")
  private String expand;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("self")
  private URI self;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("scope")
  private Scope scope;

  @JsonProperty("permissions")
  private List<PermissionGrant> permissions = new ArrayList<>();

  private HashMap<String, Object> additionalProperties_ = new HashMap<String, Object>();

   /**
   * The expand options available for the permission scheme.
   * @return expand
  **/
  @ApiModelProperty(value = "The expand options available for the permission scheme.")
  public String getExpand() {
    return expand;
  }

   /**
   * The ID of the permission scheme.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the permission scheme.")
  public Long getId() {
    return id;
  }

   /**
   * The URL of the permission scheme.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of the permission scheme.")
  public URI getSelf() {
    return self;
  }

  public PermissionScheme name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the permission scheme. Must be unique.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the permission scheme. Must be unique.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PermissionScheme description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description for the permission scheme.
   * @return description
  **/
  @ApiModelProperty(value = "A description for the permission scheme.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PermissionScheme scope(Scope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the permission scheme.
   * @return scope
  **/
  @ApiModelProperty(value = "The scope of the permission scheme.")
  public Scope getScope() {
    return scope;
  }

  public void setScope(Scope scope) {
    this.scope = scope;
  }

  public PermissionScheme permissions(List<PermissionGrant> permissions) {
    this.permissions = permissions;
    return this;
  }

  public PermissionScheme addPermissionsItem(PermissionGrant permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * The permission scheme to create or update. See [About permission schemes and grants](#about-permission-schemes-and-grants) for more information.
   * @return permissions
  **/
  @ApiModelProperty(value = "The permission scheme to create or update. See [About permission schemes and grants](#about-permission-schemes-and-grants) for more information.")
  public List<PermissionGrant> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<PermissionGrant> permissions) {
    this.permissions = permissions;
  }


  @com.fasterxml.jackson.annotation.JsonAnyGetter
  public Map<String, Object> any() {
   return this.additionalProperties_;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter
  public void set(String name, Object value) {
   this.additionalProperties_.put(name, value);
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionScheme permissionScheme = (PermissionScheme) o;
    return Objects.equals(this.expand, permissionScheme.expand) &&
        Objects.equals(this.id, permissionScheme.id) &&
        Objects.equals(this.self, permissionScheme.self) &&
        Objects.equals(this.name, permissionScheme.name) &&
        Objects.equals(this.description, permissionScheme.description) &&
        Objects.equals(this.scope, permissionScheme.scope) &&
        Objects.equals(this.permissions, permissionScheme.permissions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, id, self, name, description, scope, permissions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionScheme {\n");
    
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties_)).append("\n");
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

