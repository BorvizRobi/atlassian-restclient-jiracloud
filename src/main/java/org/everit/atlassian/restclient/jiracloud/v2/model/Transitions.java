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
import org.everit.atlassian.restclient.jiracloud.v2.model.IssueTransition;

/**
 * List of issue transitions.
 */
@ApiModel(description = "List of issue transitions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-01T13:56:58.037+02:00[Europe/Prague]")
public class Transitions {
  @JsonProperty("expand")
  private String expand;

  @JsonProperty("transitions")
  private List<IssueTransition> transitions = new ArrayList<>();

   /**
   * Expand options that include additional transitions details in the response.
   * @return expand
  **/
  @ApiModelProperty(value = "Expand options that include additional transitions details in the response.")
  public String getExpand() {
    return expand;
  }

   /**
   * List of issue transitions.
   * @return transitions
  **/
  @ApiModelProperty(value = "List of issue transitions.")
  public List<IssueTransition> getTransitions() {
    return transitions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transitions transitions = (Transitions) o;
    return Objects.equals(this.expand, transitions.expand) &&
        Objects.equals(this.transitions, transitions.transitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, transitions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transitions {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    transitions: ").append(toIndentedString(transitions)).append("\n");
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

