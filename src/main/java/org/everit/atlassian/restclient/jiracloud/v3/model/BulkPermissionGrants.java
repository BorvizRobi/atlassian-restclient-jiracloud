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
import java.util.ArrayList;
import java.util.List;
import org.everit.atlassian.restclient.jiracloud.v3.model.BulkProjectPermissionGrants;

/**
 * Details of global and project permissions granted to the user.
 */
@ApiModel(description = "Details of global and project permissions granted to the user.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-01T13:57:05.408+02:00[Europe/Prague]")
public class BulkPermissionGrants {
  @JsonProperty("projectPermissions")
  private List<BulkProjectPermissionGrants> projectPermissions = new ArrayList<>();

  @JsonProperty("globalPermissions")
  private List<String> globalPermissions = new ArrayList<>();

  public BulkPermissionGrants projectPermissions(List<BulkProjectPermissionGrants> projectPermissions) {
    this.projectPermissions = projectPermissions;
    return this;
  }

  public BulkPermissionGrants addProjectPermissionsItem(BulkProjectPermissionGrants projectPermissionsItem) {
    this.projectPermissions.add(projectPermissionsItem);
    return this;
  }

   /**
   * List of project permissions and the projects and issues those permissions provide access to.
   * @return projectPermissions
  **/
  @ApiModelProperty(required = true, value = "List of project permissions and the projects and issues those permissions provide access to.")
  public List<BulkProjectPermissionGrants> getProjectPermissions() {
    return projectPermissions;
  }

  public void setProjectPermissions(List<BulkProjectPermissionGrants> projectPermissions) {
    this.projectPermissions = projectPermissions;
  }

  public BulkPermissionGrants globalPermissions(List<String> globalPermissions) {
    this.globalPermissions = globalPermissions;
    return this;
  }

  public BulkPermissionGrants addGlobalPermissionsItem(String globalPermissionsItem) {
    this.globalPermissions.add(globalPermissionsItem);
    return this;
  }

   /**
   * List of permissions granted to the user.
   * @return globalPermissions
  **/
  @ApiModelProperty(required = true, value = "List of permissions granted to the user.")
  public List<String> getGlobalPermissions() {
    return globalPermissions;
  }

  public void setGlobalPermissions(List<String> globalPermissions) {
    this.globalPermissions = globalPermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkPermissionGrants bulkPermissionGrants = (BulkPermissionGrants) o;
    return Objects.equals(this.projectPermissions, bulkPermissionGrants.projectPermissions) &&
        Objects.equals(this.globalPermissions, bulkPermissionGrants.globalPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectPermissions, globalPermissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPermissionGrants {\n");
    sb.append("    projectPermissions: ").append(toIndentedString(projectPermissions)).append("\n");
    sb.append("    globalPermissions: ").append(toIndentedString(globalPermissions)).append("\n");
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

