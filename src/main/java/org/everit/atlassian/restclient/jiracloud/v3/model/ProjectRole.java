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
import java.util.List;
import org.everit.atlassian.restclient.jiracloud.v3.model.RoleActor;
import org.everit.atlassian.restclient.jiracloud.v3.model.Scope;

/**
 * Details about the roles in a project.
 */
@ApiModel(description = "Details about the roles in a project.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-26T10:18:51.013+01:00[Europe/Prague]")
public class ProjectRole {
  @JsonProperty("self")
  private URI self;

  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("description")
  private String description;

  @JsonProperty("actors")
  private List<RoleActor> actors = new ArrayList<>();

  @JsonProperty("scope")
  private Scope scope;

  @JsonProperty("translatedName")
  private String translatedName;

  @JsonProperty("currentUserRole")
  private Boolean currentUserRole;

  @JsonProperty("roleConfigurable")
  private Boolean roleConfigurable;

  @JsonProperty("admin")
  private Boolean admin;

  @JsonProperty("default")
  private Boolean _default;

   /**
   * The URL the project role details.
   * @return self
  **/
  @ApiModelProperty(value = "The URL the project role details.")
  public URI getSelf() {
    return self;
  }

  public ProjectRole name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the project role.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the project role.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * The ID of the project role.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the project role.")
  public Long getId() {
    return id;
  }

   /**
   * The description of the project role.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the project role.")
  public String getDescription() {
    return description;
  }

   /**
   * The list of users who act in this role.
   * @return actors
  **/
  @ApiModelProperty(value = "The list of users who act in this role.")
  public List<RoleActor> getActors() {
    return actors;
  }

   /**
   * The scope of the role. Indicated for roles associated with [next-gen projects](https://confluence.atlassian.com/x/loMyO).
   * @return scope
  **/
  @ApiModelProperty(value = "The scope of the role. Indicated for roles associated with [next-gen projects](https://confluence.atlassian.com/x/loMyO).")
  public Scope getScope() {
    return scope;
  }

  public ProjectRole translatedName(String translatedName) {
    this.translatedName = translatedName;
    return this;
  }

   /**
   * The translated name of the project role.
   * @return translatedName
  **/
  @ApiModelProperty(value = "The translated name of the project role.")
  public String getTranslatedName() {
    return translatedName;
  }

  public void setTranslatedName(String translatedName) {
    this.translatedName = translatedName;
  }

  public ProjectRole currentUserRole(Boolean currentUserRole) {
    this.currentUserRole = currentUserRole;
    return this;
  }

   /**
   * Whether the calling user is part of this role.
   * @return currentUserRole
  **/
  @ApiModelProperty(value = "Whether the calling user is part of this role.")
  public Boolean getCurrentUserRole() {
    return currentUserRole;
  }

  public void setCurrentUserRole(Boolean currentUserRole) {
    this.currentUserRole = currentUserRole;
  }

   /**
   * Whether the roles are configurable for this project.
   * @return roleConfigurable
  **/
  @ApiModelProperty(value = "Whether the roles are configurable for this project.")
  public Boolean getRoleConfigurable() {
    return roleConfigurable;
  }

   /**
   * Whether this role is the admin role for the project.
   * @return admin
  **/
  @ApiModelProperty(value = "Whether this role is the admin role for the project.")
  public Boolean getAdmin() {
    return admin;
  }

   /**
   * Whether this role is the default role for the project
   * @return _default
  **/
  @ApiModelProperty(value = "Whether this role is the default role for the project")
  public Boolean getDefault() {
    return _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRole projectRole = (ProjectRole) o;
    return Objects.equals(this.self, projectRole.self) &&
        Objects.equals(this.name, projectRole.name) &&
        Objects.equals(this.id, projectRole.id) &&
        Objects.equals(this.description, projectRole.description) &&
        Objects.equals(this.actors, projectRole.actors) &&
        Objects.equals(this.scope, projectRole.scope) &&
        Objects.equals(this.translatedName, projectRole.translatedName) &&
        Objects.equals(this.currentUserRole, projectRole.currentUserRole) &&
        Objects.equals(this.roleConfigurable, projectRole.roleConfigurable) &&
        Objects.equals(this.admin, projectRole.admin) &&
        Objects.equals(this._default, projectRole._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, name, id, description, actors, scope, translatedName, currentUserRole, roleConfigurable, admin, _default);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRole {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    actors: ").append(toIndentedString(actors)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    translatedName: ").append(toIndentedString(translatedName)).append("\n");
    sb.append("    currentUserRole: ").append(toIndentedString(currentUserRole)).append("\n");
    sb.append("    roleConfigurable: ").append(toIndentedString(roleConfigurable)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

