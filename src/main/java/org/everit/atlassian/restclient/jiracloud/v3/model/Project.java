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
import java.util.UUID;
import org.everit.atlassian.restclient.jiracloud.v3.model.AvatarUrlsBean;
import org.everit.atlassian.restclient.jiracloud.v3.model.Component;
import org.everit.atlassian.restclient.jiracloud.v3.model.Hierarchy;
import org.everit.atlassian.restclient.jiracloud.v3.model.IssueTypeBean;
import org.everit.atlassian.restclient.jiracloud.v3.model.ProjectCategory;
import org.everit.atlassian.restclient.jiracloud.v3.model.ProjectPermissions;
import org.everit.atlassian.restclient.jiracloud.v3.model.User;
import org.everit.atlassian.restclient.jiracloud.v3.model.Version;

/**
 * Details about a project.
 */
@ApiModel(description = "Details about a project.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-01T13:57:05.408+02:00[Europe/Prague]")
public class Project {
  @JsonProperty("expand")
  private String expand;

  @JsonProperty("self")
  private URI self;

  @JsonProperty("id")
  private String id;

  @JsonProperty("key")
  private String key;

  @JsonProperty("description")
  private String description;

  @JsonProperty("lead")
  private User lead;

  @JsonProperty("components")
  private List<Component> components = new ArrayList<>();

  @JsonProperty("issueTypes")
  private List<IssueTypeBean> issueTypes = new ArrayList<>();

  @JsonProperty("url")
  private String url;

  @JsonProperty("email")
  private String email;

  /**
   * The default assignee when creating issues for this project.
   */
  public enum AssigneeTypeEnum {
    PROJECT_LEAD("PROJECT_LEAD"),
    
    UNASSIGNED("UNASSIGNED");

    private String value;

    AssigneeTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AssigneeTypeEnum fromValue(String value) {
      for (AssigneeTypeEnum b : AssigneeTypeEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("assigneeType")
  private AssigneeTypeEnum assigneeType;

  @JsonProperty("versions")
  private List<Version> versions = new ArrayList<>();

  @JsonProperty("name")
  private String name;

  @JsonProperty("roles")
  private Map<String, URI> roles = new HashMap<>();

  @JsonProperty("avatarUrls")
  private AvatarUrlsBean avatarUrls;

  @JsonProperty("projectCategory")
  private ProjectCategory projectCategory;

  /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
   */
  public enum ProjectTypeKeyEnum {
    SOFTWARE("software"),
    
    SERVICE_DESK("service_desk"),
    
    BUSINESS("business");

    private String value;

    ProjectTypeKeyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProjectTypeKeyEnum fromValue(String value) {
      for (ProjectTypeKeyEnum b : ProjectTypeKeyEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("projectTypeKey")
  private ProjectTypeKeyEnum projectTypeKey;

  @JsonProperty("simplified")
  private Boolean simplified;

  /**
   * The type of the project.
   */
  public enum StyleEnum {
    CLASSIC("CLASSIC"),
    
    NEXTGEN("NEXTGEN"),
    
    NEXT_GEN("next-gen");

    private String value;

    StyleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StyleEnum fromValue(String value) {
      for (StyleEnum b : StyleEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("style")
  private StyleEnum style;

  @JsonProperty("isPrivate")
  private Boolean isPrivate;

  @JsonProperty("issueTypeHierarchy")
  private Hierarchy issueTypeHierarchy;

  @JsonProperty("permissions")
  private ProjectPermissions permissions;

  @JsonProperty("properties")
  private Map<String, Object> properties = new HashMap<>();

  @JsonProperty("uuid")
  private UUID uuid;

   /**
   * Expand options that include additional project details in the response.
   * @return expand
  **/
  @ApiModelProperty(value = "Expand options that include additional project details in the response.")
  public String getExpand() {
    return expand;
  }

   /**
   * The URL of the project details.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of the project details.")
  public URI getSelf() {
    return self;
  }

  public Project id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the project.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the project.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * The key of the project.
   * @return key
  **/
  @ApiModelProperty(value = "The key of the project.")
  public String getKey() {
    return key;
  }

   /**
   * A brief description of the project.
   * @return description
  **/
  @ApiModelProperty(value = "A brief description of the project.")
  public String getDescription() {
    return description;
  }

   /**
   * The username of the project lead.
   * @return lead
  **/
  @ApiModelProperty(value = "The username of the project lead.")
  public User getLead() {
    return lead;
  }

   /**
   * List of the components contained in the project.
   * @return components
  **/
  @ApiModelProperty(value = "List of the components contained in the project.")
  public List<Component> getComponents() {
    return components;
  }

   /**
   * List of the issue types available in the project.
   * @return issueTypes
  **/
  @ApiModelProperty(value = "List of the issue types available in the project.")
  public List<IssueTypeBean> getIssueTypes() {
    return issueTypes;
  }

   /**
   * A link to information about this project, such as project documentation.
   * @return url
  **/
  @ApiModelProperty(value = "A link to information about this project, such as project documentation.")
  public String getUrl() {
    return url;
  }

  public Project email(String email) {
    this.email = email;
    return this;
  }

   /**
   * An email address associated with the project.
   * @return email
  **/
  @ApiModelProperty(value = "An email address associated with the project.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

   /**
   * The default assignee when creating issues for this project.
   * @return assigneeType
  **/
  @ApiModelProperty(value = "The default assignee when creating issues for this project.")
  public AssigneeTypeEnum getAssigneeType() {
    return assigneeType;
  }

   /**
   * The versions defined in the project. For more information, see [Create version](#api-rest-api-3-version-post).
   * @return versions
  **/
  @ApiModelProperty(value = "The versions defined in the project. For more information, see [Create version](#api-rest-api-3-version-post).")
  public List<Version> getVersions() {
    return versions;
  }

   /**
   * The name of the project.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the project.")
  public String getName() {
    return name;
  }

   /**
   * The name and self URL for each role defined in the project. For more information, see [Create project role](#api-rest-api-3-role-post).
   * @return roles
  **/
  @ApiModelProperty(value = "The name and self URL for each role defined in the project. For more information, see [Create project role](#api-rest-api-3-role-post).")
  public Map<String, URI> getRoles() {
    return roles;
  }

   /**
   * The URLs of the project&#39;s avatars.
   * @return avatarUrls
  **/
  @ApiModelProperty(value = "The URLs of the project's avatars.")
  public AvatarUrlsBean getAvatarUrls() {
    return avatarUrls;
  }

   /**
   * The category the project belongs to.
   * @return projectCategory
  **/
  @ApiModelProperty(value = "The category the project belongs to.")
  public ProjectCategory getProjectCategory() {
    return projectCategory;
  }

   /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
   * @return projectTypeKey
  **/
  @ApiModelProperty(value = "The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.")
  public ProjectTypeKeyEnum getProjectTypeKey() {
    return projectTypeKey;
  }

   /**
   * Indicates whether the project is simplified.
   * @return simplified
  **/
  @ApiModelProperty(value = "Indicates whether the project is simplified.")
  public Boolean getSimplified() {
    return simplified;
  }

   /**
   * The type of the project.
   * @return style
  **/
  @ApiModelProperty(value = "The type of the project.")
  public StyleEnum getStyle() {
    return style;
  }

   /**
   * Indicates whether the project is private.
   * @return isPrivate
  **/
  @ApiModelProperty(value = "Indicates whether the project is private.")
  public Boolean getIsPrivate() {
    return isPrivate;
  }

   /**
   * The issue type hierarchy for the project
   * @return issueTypeHierarchy
  **/
  @ApiModelProperty(value = "The issue type hierarchy for the project")
  public Hierarchy getIssueTypeHierarchy() {
    return issueTypeHierarchy;
  }

   /**
   * User permissions on the project
   * @return permissions
  **/
  @ApiModelProperty(value = "User permissions on the project")
  public ProjectPermissions getPermissions() {
    return permissions;
  }

   /**
   * Map of project properties
   * @return properties
  **/
  @ApiModelProperty(value = "Map of project properties")
  public Map<String, Object> getProperties() {
    return properties;
  }

   /**
   * unique ID for next-gen projects
   * @return uuid
  **/
  @ApiModelProperty(value = "unique ID for next-gen projects")
  public UUID getUuid() {
    return uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.expand, project.expand) &&
        Objects.equals(this.self, project.self) &&
        Objects.equals(this.id, project.id) &&
        Objects.equals(this.key, project.key) &&
        Objects.equals(this.description, project.description) &&
        Objects.equals(this.lead, project.lead) &&
        Objects.equals(this.components, project.components) &&
        Objects.equals(this.issueTypes, project.issueTypes) &&
        Objects.equals(this.url, project.url) &&
        Objects.equals(this.email, project.email) &&
        Objects.equals(this.assigneeType, project.assigneeType) &&
        Objects.equals(this.versions, project.versions) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.roles, project.roles) &&
        Objects.equals(this.avatarUrls, project.avatarUrls) &&
        Objects.equals(this.projectCategory, project.projectCategory) &&
        Objects.equals(this.projectTypeKey, project.projectTypeKey) &&
        Objects.equals(this.simplified, project.simplified) &&
        Objects.equals(this.style, project.style) &&
        Objects.equals(this.isPrivate, project.isPrivate) &&
        Objects.equals(this.issueTypeHierarchy, project.issueTypeHierarchy) &&
        Objects.equals(this.permissions, project.permissions) &&
        Objects.equals(this.properties, project.properties) &&
        Objects.equals(this.uuid, project.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, self, id, key, description, lead, components, issueTypes, url, email, assigneeType, versions, name, roles, avatarUrls, projectCategory, projectTypeKey, simplified, style, isPrivate, issueTypeHierarchy, permissions, properties, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    issueTypes: ").append(toIndentedString(issueTypes)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    projectCategory: ").append(toIndentedString(projectCategory)).append("\n");
    sb.append("    projectTypeKey: ").append(toIndentedString(projectTypeKey)).append("\n");
    sb.append("    simplified: ").append(toIndentedString(simplified)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    issueTypeHierarchy: ").append(toIndentedString(issueTypeHierarchy)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

