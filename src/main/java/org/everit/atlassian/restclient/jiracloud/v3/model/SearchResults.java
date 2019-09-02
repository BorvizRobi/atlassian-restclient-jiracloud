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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.everit.atlassian.restclient.jiracloud.v3.model.IssueBean;
import org.everit.atlassian.restclient.jiracloud.v3.model.JsonTypeBean;

/**
 * The result of a JQL search.
 */
@ApiModel(description = "The result of a JQL search.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-01T13:57:05.408+02:00[Europe/Prague]")
public class SearchResults {
  @JsonProperty("expand")
  private String expand;

  @JsonProperty("startAt")
  private Integer startAt;

  @JsonProperty("maxResults")
  private Integer maxResults;

  @JsonProperty("total")
  private Integer total;

  @JsonProperty("issues")
  private List<IssueBean> issues = new ArrayList<>();

  @JsonProperty("warningMessages")
  private List<String> warningMessages = new ArrayList<>();

  @JsonProperty("names")
  private Map<String, String> names = new HashMap<>();

  @JsonProperty("schema")
  private Map<String, JsonTypeBean> schema = new HashMap<>();

   /**
   * Expand options that include additional search result details in the response.
   * @return expand
  **/
  @ApiModelProperty(value = "Expand options that include additional search result details in the response.")
  public String getExpand() {
    return expand;
  }

   /**
   * The index of the first item returned on the page.
   * @return startAt
  **/
  @ApiModelProperty(value = "The index of the first item returned on the page.")
  public Integer getStartAt() {
    return startAt;
  }

   /**
   * The maximum number of results that could be on the page.
   * @return maxResults
  **/
  @ApiModelProperty(value = "The maximum number of results that could be on the page.")
  public Integer getMaxResults() {
    return maxResults;
  }

   /**
   * The number of results on the page.
   * @return total
  **/
  @ApiModelProperty(value = "The number of results on the page.")
  public Integer getTotal() {
    return total;
  }

   /**
   * The list of issues found by the search.
   * @return issues
  **/
  @ApiModelProperty(value = "The list of issues found by the search.")
  public List<IssueBean> getIssues() {
    return issues;
  }

   /**
   * Any warnings related to the JQL query.
   * @return warningMessages
  **/
  @ApiModelProperty(value = "Any warnings related to the JQL query.")
  public List<String> getWarningMessages() {
    return warningMessages;
  }

   /**
   * The ID and name of each field in the search results.
   * @return names
  **/
  @ApiModelProperty(value = "The ID and name of each field in the search results.")
  public Map<String, String> getNames() {
    return names;
  }

   /**
   * The schema describing the field types in the search results.
   * @return schema
  **/
  @ApiModelProperty(value = "The schema describing the field types in the search results.")
  public Map<String, JsonTypeBean> getSchema() {
    return schema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResults searchResults = (SearchResults) o;
    return Objects.equals(this.expand, searchResults.expand) &&
        Objects.equals(this.startAt, searchResults.startAt) &&
        Objects.equals(this.maxResults, searchResults.maxResults) &&
        Objects.equals(this.total, searchResults.total) &&
        Objects.equals(this.issues, searchResults.issues) &&
        Objects.equals(this.warningMessages, searchResults.warningMessages) &&
        Objects.equals(this.names, searchResults.names) &&
        Objects.equals(this.schema, searchResults.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, startAt, maxResults, total, issues, warningMessages, names, schema);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResults {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    warningMessages: ").append(toIndentedString(warningMessages)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

