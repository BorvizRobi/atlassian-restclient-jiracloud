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
import org.everit.atlassian.restclient.jiracloud.v3.model.WorkflowTransitionRule;

/**
 * A collection of transition rules.
 */
@ApiModel(description = "A collection of transition rules.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-01T13:57:05.408+02:00[Europe/Prague]")
public class WorkflowRules {
  @JsonProperty("conditions")
  private List<WorkflowTransitionRule> conditions = new ArrayList<>();

  @JsonProperty("validators")
  private List<WorkflowTransitionRule> validators = new ArrayList<>();

  @JsonProperty("postFunctions")
  private List<WorkflowTransitionRule> postFunctions = new ArrayList<>();

  public WorkflowRules conditions(List<WorkflowTransitionRule> conditions) {
    this.conditions = conditions;
    return this;
  }

  public WorkflowRules addConditionsItem(WorkflowTransitionRule conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The workflow conditions.
   * @return conditions
  **/
  @ApiModelProperty(required = true, value = "The workflow conditions.")
  public List<WorkflowTransitionRule> getConditions() {
    return conditions;
  }

  public void setConditions(List<WorkflowTransitionRule> conditions) {
    this.conditions = conditions;
  }

  public WorkflowRules validators(List<WorkflowTransitionRule> validators) {
    this.validators = validators;
    return this;
  }

  public WorkflowRules addValidatorsItem(WorkflowTransitionRule validatorsItem) {
    this.validators.add(validatorsItem);
    return this;
  }

   /**
   * The workflow validators.
   * @return validators
  **/
  @ApiModelProperty(required = true, value = "The workflow validators.")
  public List<WorkflowTransitionRule> getValidators() {
    return validators;
  }

  public void setValidators(List<WorkflowTransitionRule> validators) {
    this.validators = validators;
  }

  public WorkflowRules postFunctions(List<WorkflowTransitionRule> postFunctions) {
    this.postFunctions = postFunctions;
    return this;
  }

  public WorkflowRules addPostFunctionsItem(WorkflowTransitionRule postFunctionsItem) {
    this.postFunctions.add(postFunctionsItem);
    return this;
  }

   /**
   * The workflow post functions.
   * @return postFunctions
  **/
  @ApiModelProperty(required = true, value = "The workflow post functions.")
  public List<WorkflowTransitionRule> getPostFunctions() {
    return postFunctions;
  }

  public void setPostFunctions(List<WorkflowTransitionRule> postFunctions) {
    this.postFunctions = postFunctions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowRules workflowRules = (WorkflowRules) o;
    return Objects.equals(this.conditions, workflowRules.conditions) &&
        Objects.equals(this.validators, workflowRules.validators) &&
        Objects.equals(this.postFunctions, workflowRules.postFunctions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, validators, postFunctions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowRules {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
    sb.append("    postFunctions: ").append(toIndentedString(postFunctions)).append("\n");
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

