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

/**
 * Details about the default workflow.
 */
@ApiModel(description = "Details about the default workflow.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-26T10:18:51.013+01:00[Europe/Prague]")
public class DefaultWorkflow {
  @JsonProperty("workflow")
  private String workflow;

  @JsonProperty("updateDraftIfNeeded")
  private Boolean updateDraftIfNeeded;

  public DefaultWorkflow workflow(String workflow) {
    this.workflow = workflow;
    return this;
  }

   /**
   * The name of the workflow to set as the default workflow.
   * @return workflow
  **/
  @ApiModelProperty(required = true, value = "The name of the workflow to set as the default workflow.")
  public String getWorkflow() {
    return workflow;
  }

  public void setWorkflow(String workflow) {
    this.workflow = workflow;
  }

  public DefaultWorkflow updateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    this.updateDraftIfNeeded = updateDraftIfNeeded;
    return this;
  }

   /**
   * Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new default workflow. Defaults to &#x60;false&#x60;.
   * @return updateDraftIfNeeded
  **/
  @ApiModelProperty(value = "Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new default workflow. Defaults to `false`.")
  public Boolean getUpdateDraftIfNeeded() {
    return updateDraftIfNeeded;
  }

  public void setUpdateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    this.updateDraftIfNeeded = updateDraftIfNeeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultWorkflow defaultWorkflow = (DefaultWorkflow) o;
    return Objects.equals(this.workflow, defaultWorkflow.workflow) &&
        Objects.equals(this.updateDraftIfNeeded, defaultWorkflow.updateDraftIfNeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflow, updateDraftIfNeeded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultWorkflow {\n");
    
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
    sb.append("    updateDraftIfNeeded: ").append(toIndentedString(updateDraftIfNeeded)).append("\n");
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

