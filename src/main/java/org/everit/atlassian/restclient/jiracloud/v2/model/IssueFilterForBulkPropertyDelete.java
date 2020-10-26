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
import java.util.ArrayList;
import java.util.List;

/**
 * Bulk operation filter details.
 */
@ApiModel(description = "Bulk operation filter details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-26T10:18:44.797+01:00[Europe/Prague]")
public class IssueFilterForBulkPropertyDelete {
  @JsonProperty("entityIds")
  private List<Long> entityIds = new ArrayList<>();

  @JsonProperty("currentValue")
  private Object currentValue = null;

  public IssueFilterForBulkPropertyDelete entityIds(List<Long> entityIds) {
    this.entityIds = entityIds;
    return this;
  }

  public IssueFilterForBulkPropertyDelete addEntityIdsItem(Long entityIdsItem) {
    if (this.entityIds == null) {
      this.entityIds = new ArrayList<>();
    }
    this.entityIds.add(entityIdsItem);
    return this;
  }

   /**
   * List of issues to perform the bulk delete operation on.
   * @return entityIds
  **/
  @ApiModelProperty(value = "List of issues to perform the bulk delete operation on.")
  public List<Long> getEntityIds() {
    return entityIds;
  }

  public void setEntityIds(List<Long> entityIds) {
    this.entityIds = entityIds;
  }

  public IssueFilterForBulkPropertyDelete currentValue(Object currentValue) {
    this.currentValue = currentValue;
    return this;
  }

   /**
   * The value of properties to perform the bulk operation on.
   * @return currentValue
  **/
  @ApiModelProperty(value = "The value of properties to perform the bulk operation on.")
  public Object getCurrentValue() {
    return currentValue;
  }

  public void setCurrentValue(Object currentValue) {
    this.currentValue = currentValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueFilterForBulkPropertyDelete issueFilterForBulkPropertyDelete = (IssueFilterForBulkPropertyDelete) o;
    return Objects.equals(this.entityIds, issueFilterForBulkPropertyDelete.entityIds) &&
        Objects.equals(this.currentValue, issueFilterForBulkPropertyDelete.currentValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityIds, currentValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueFilterForBulkPropertyDelete {\n");
    
    sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
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

