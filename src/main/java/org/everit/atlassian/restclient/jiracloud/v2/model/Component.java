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


package org.everit.atlassian.restclient.jiracloud.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.everit.atlassian.restclient.jiracloud.v2.model.User;

/**
 * Details about a project component.
 */
@ApiModel(description = "Details about a project component.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-01T13:56:58.037+02:00[Europe/Prague]")
public class Component {
  @JsonProperty("self")
  private URI self;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("lead")
  private User lead;

  @JsonProperty("leadUserName")
  private String leadUserName;

  @JsonProperty("leadAccountId")
  private String leadAccountId;

  /**
   * The nominal user type used to determine the assignee for issues created with this component. See &#x60;realAssigneeType&#x60; for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:   *  &#x60;PROJECT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  &#x60;COMPONENT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the component.  *  &#x60;UNASSIGNED&#x60; an assignee is not set for issues created with this component.  *  &#x60;PROJECT_DEFAULT&#x60; the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.  Default value: &#x60;PROJECT_DEFAULT&#x60;.   Optional when creating or updating a component.
   */
  public enum AssigneeTypeEnum {
    PROJECT_DEFAULT("PROJECT_DEFAULT"),
    
    COMPONENT_LEAD("COMPONENT_LEAD"),
    
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

  @JsonProperty("assignee")
  private User assignee;

  /**
   * The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the &#x60;assigneeType&#x60;. For example, &#x60;assigneeType&#x60; is set to &#x60;COMPONENT_LEAD&#x60; but no component lead is set. This property is set to one of the following values:   *  &#x60;PROJECT_LEAD&#x60; when &#x60;assigneeType&#x60; is &#x60;PROJECT_LEAD&#x60; and the project lead has permission to be assigned issues in the project that the component is in.  *  &#x60;COMPONENT_LEAD&#x60; when &#x60;assignee&#x60;Type is &#x60;COMPONENT_LEAD&#x60; and the component lead has permission to be assigned issues in the project that the component is in.  *  &#x60;UNASSIGNED&#x60; when &#x60;assigneeType&#x60; is &#x60;UNASSIGNED&#x60; and Jira is configured to allow unassigned issues.  *  &#x60;PROJECT_DEFAULT&#x60; when none of the preceding cases are true.
   */
  public enum RealAssigneeTypeEnum {
    PROJECT_DEFAULT("PROJECT_DEFAULT"),
    
    COMPONENT_LEAD("COMPONENT_LEAD"),
    
    PROJECT_LEAD("PROJECT_LEAD"),
    
    UNASSIGNED("UNASSIGNED");

    private String value;

    RealAssigneeTypeEnum(String value) {
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
    public static RealAssigneeTypeEnum fromValue(String value) {
      for (RealAssigneeTypeEnum b : RealAssigneeTypeEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("realAssigneeType")
  private RealAssigneeTypeEnum realAssigneeType;

  @JsonProperty("realAssignee")
  private User realAssignee;

  @JsonProperty("isAssigneeTypeValid")
  private Boolean isAssigneeTypeValid;

  @JsonProperty("project")
  private String project;

  @JsonProperty("projectId")
  private Long projectId;

   /**
   * The URL of the component.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of the component.")
  public URI getSelf() {
    return self;
  }

   /**
   * The unique identifier for the component.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier for the component.")
  public String getId() {
    return id;
  }

  public Component name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The unique name for the component in the project. Required when creating a component. Optional when updating a component. The maximum length is 255 characters.
   * @return name
  **/
  @ApiModelProperty(value = "The unique name for the component in the project. Required when creating a component. Optional when updating a component. The maximum length is 255 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Component description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description for the component. Optional when creating or updating a component.
   * @return description
  **/
  @ApiModelProperty(value = "The description for the component. Optional when creating or updating a component.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * The user details for the component&#39;s lead user.
   * @return lead
  **/
  @ApiModelProperty(value = "The user details for the component's lead user.")
  public User getLead() {
    return lead;
  }

  public Component leadUserName(String leadUserName) {
    this.leadUserName = leadUserName;
    return this;
  }

   /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return leadUserName
  **/
  @ApiModelProperty(value = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.")
  public String getLeadUserName() {
    return leadUserName;
  }

  public void setLeadUserName(String leadUserName) {
    this.leadUserName = leadUserName;
  }

  public Component leadAccountId(String leadAccountId) {
    this.leadAccountId = leadAccountId;
    return this;
  }

   /**
   * The accountId of the component&#39;s lead user. The accountId uniquely identifies the user across all Atlassian products. For example, *384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192*.Optional when creating or updating a component.
   * @return leadAccountId
  **/
  @ApiModelProperty(value = "The accountId of the component's lead user. The accountId uniquely identifies the user across all Atlassian products. For example, *384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192*.Optional when creating or updating a component.")
  public String getLeadAccountId() {
    return leadAccountId;
  }

  public void setLeadAccountId(String leadAccountId) {
    this.leadAccountId = leadAccountId;
  }

  public Component assigneeType(AssigneeTypeEnum assigneeType) {
    this.assigneeType = assigneeType;
    return this;
  }

   /**
   * The nominal user type used to determine the assignee for issues created with this component. See &#x60;realAssigneeType&#x60; for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:   *  &#x60;PROJECT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  &#x60;COMPONENT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the component.  *  &#x60;UNASSIGNED&#x60; an assignee is not set for issues created with this component.  *  &#x60;PROJECT_DEFAULT&#x60; the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.  Default value: &#x60;PROJECT_DEFAULT&#x60;.   Optional when creating or updating a component.
   * @return assigneeType
  **/
  @ApiModelProperty(value = "The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.  Default value: `PROJECT_DEFAULT`.   Optional when creating or updating a component.")
  public AssigneeTypeEnum getAssigneeType() {
    return assigneeType;
  }

  public void setAssigneeType(AssigneeTypeEnum assigneeType) {
    this.assigneeType = assigneeType;
  }

   /**
   * The details of the user associated with &#x60;assigneeType&#x60;, if any. See &#x60;realAssignee&#x60; for details of the user assigned to issues created with this component.
   * @return assignee
  **/
  @ApiModelProperty(value = "The details of the user associated with `assigneeType`, if any. See `realAssignee` for details of the user assigned to issues created with this component.")
  public User getAssignee() {
    return assignee;
  }

   /**
   * The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the &#x60;assigneeType&#x60;. For example, &#x60;assigneeType&#x60; is set to &#x60;COMPONENT_LEAD&#x60; but no component lead is set. This property is set to one of the following values:   *  &#x60;PROJECT_LEAD&#x60; when &#x60;assigneeType&#x60; is &#x60;PROJECT_LEAD&#x60; and the project lead has permission to be assigned issues in the project that the component is in.  *  &#x60;COMPONENT_LEAD&#x60; when &#x60;assignee&#x60;Type is &#x60;COMPONENT_LEAD&#x60; and the component lead has permission to be assigned issues in the project that the component is in.  *  &#x60;UNASSIGNED&#x60; when &#x60;assigneeType&#x60; is &#x60;UNASSIGNED&#x60; and Jira is configured to allow unassigned issues.  *  &#x60;PROJECT_DEFAULT&#x60; when none of the preceding cases are true.
   * @return realAssigneeType
  **/
  @ApiModelProperty(value = "The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:   *  `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.  *  `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.  *  `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.  *  `PROJECT_DEFAULT` when none of the preceding cases are true.")
  public RealAssigneeTypeEnum getRealAssigneeType() {
    return realAssigneeType;
  }

   /**
   * The user assigned to issues created with this component, when &#x60;assigneeType&#x60; does not identify a valid assignee.
   * @return realAssignee
  **/
  @ApiModelProperty(value = "The user assigned to issues created with this component, when `assigneeType` does not identify a valid assignee.")
  public User getRealAssignee() {
    return realAssignee;
  }

   /**
   * Indicates whether a user is associated with &#x60;assigneeType&#x60;. For example, if the &#x60;assigneeType&#x60; is set to &#x60;COMPONENT_LEAD&#x60; but the component lead is not set, then &#x60;false&#x60; is returned.
   * @return isAssigneeTypeValid
  **/
  @ApiModelProperty(value = "Indicates whether a user is associated with `assigneeType`. For example, if the `assigneeType` is set to `COMPONENT_LEAD` but the component lead is not set, then `false` is returned.")
  public Boolean getIsAssigneeTypeValid() {
    return isAssigneeTypeValid;
  }

  public Component project(String project) {
    this.project = project;
    return this;
  }

   /**
   * The key of the project the component is assigned to. Required when creating a component. Can&#39;t be updated.
   * @return project
  **/
  @ApiModelProperty(value = "The key of the project the component is assigned to. Required when creating a component. Can't be updated.")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

   /**
   * The ID of the project the component is assigned to.
   * @return projectId
  **/
  @ApiModelProperty(value = "The ID of the project the component is assigned to.")
  public Long getProjectId() {
    return projectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Component component = (Component) o;
    return Objects.equals(this.self, component.self) &&
        Objects.equals(this.id, component.id) &&
        Objects.equals(this.name, component.name) &&
        Objects.equals(this.description, component.description) &&
        Objects.equals(this.lead, component.lead) &&
        Objects.equals(this.leadUserName, component.leadUserName) &&
        Objects.equals(this.leadAccountId, component.leadAccountId) &&
        Objects.equals(this.assigneeType, component.assigneeType) &&
        Objects.equals(this.assignee, component.assignee) &&
        Objects.equals(this.realAssigneeType, component.realAssigneeType) &&
        Objects.equals(this.realAssignee, component.realAssignee) &&
        Objects.equals(this.isAssigneeTypeValid, component.isAssigneeTypeValid) &&
        Objects.equals(this.project, component.project) &&
        Objects.equals(this.projectId, component.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, name, description, lead, leadUserName, leadAccountId, assigneeType, assignee, realAssigneeType, realAssignee, isAssigneeTypeValid, project, projectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Component {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
    sb.append("    leadUserName: ").append(toIndentedString(leadUserName)).append("\n");
    sb.append("    leadAccountId: ").append(toIndentedString(leadAccountId)).append("\n");
    sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    realAssigneeType: ").append(toIndentedString(realAssigneeType)).append("\n");
    sb.append("    realAssignee: ").append(toIndentedString(realAssignee)).append("\n");
    sb.append("    isAssigneeTypeValid: ").append(toIndentedString(isAssigneeTypeValid)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

