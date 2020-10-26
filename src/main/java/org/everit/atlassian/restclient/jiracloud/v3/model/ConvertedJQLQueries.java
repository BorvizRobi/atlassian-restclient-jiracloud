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
import org.everit.atlassian.restclient.jiracloud.v3.model.JQLQueryWithUnknownUsers;

/**
 * The converted JQL queries.
 */
@ApiModel(description = "The converted JQL queries.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-26T10:18:51.013+01:00[Europe/Prague]")
public class ConvertedJQLQueries {
  @JsonProperty("queryStrings")
  private List<String> queryStrings = new ArrayList<>();

  @JsonProperty("queriesWithUnknownUsers")
  private List<JQLQueryWithUnknownUsers> queriesWithUnknownUsers = new ArrayList<>();

  public ConvertedJQLQueries queryStrings(List<String> queryStrings) {
    this.queryStrings = queryStrings;
    return this;
  }

  public ConvertedJQLQueries addQueryStringsItem(String queryStringsItem) {
    if (this.queryStrings == null) {
      this.queryStrings = new ArrayList<>();
    }
    this.queryStrings.add(queryStringsItem);
    return this;
  }

   /**
   * The list of converted query strings with account IDs in place of user identifiers.
   * @return queryStrings
  **/
  @ApiModelProperty(value = "The list of converted query strings with account IDs in place of user identifiers.")
  public List<String> getQueryStrings() {
    return queryStrings;
  }

  public void setQueryStrings(List<String> queryStrings) {
    this.queryStrings = queryStrings;
  }

  public ConvertedJQLQueries queriesWithUnknownUsers(List<JQLQueryWithUnknownUsers> queriesWithUnknownUsers) {
    this.queriesWithUnknownUsers = queriesWithUnknownUsers;
    return this;
  }

  public ConvertedJQLQueries addQueriesWithUnknownUsersItem(JQLQueryWithUnknownUsers queriesWithUnknownUsersItem) {
    if (this.queriesWithUnknownUsers == null) {
      this.queriesWithUnknownUsers = new ArrayList<>();
    }
    this.queriesWithUnknownUsers.add(queriesWithUnknownUsersItem);
    return this;
  }

   /**
   * List of queries containing user information that could not be mapped to an existing user
   * @return queriesWithUnknownUsers
  **/
  @ApiModelProperty(value = "List of queries containing user information that could not be mapped to an existing user")
  public List<JQLQueryWithUnknownUsers> getQueriesWithUnknownUsers() {
    return queriesWithUnknownUsers;
  }

  public void setQueriesWithUnknownUsers(List<JQLQueryWithUnknownUsers> queriesWithUnknownUsers) {
    this.queriesWithUnknownUsers = queriesWithUnknownUsers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertedJQLQueries convertedJQLQueries = (ConvertedJQLQueries) o;
    return Objects.equals(this.queryStrings, convertedJQLQueries.queryStrings) &&
        Objects.equals(this.queriesWithUnknownUsers, convertedJQLQueries.queriesWithUnknownUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryStrings, queriesWithUnknownUsers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertedJQLQueries {\n");
    
    sb.append("    queryStrings: ").append(toIndentedString(queryStrings)).append("\n");
    sb.append("    queriesWithUnknownUsers: ").append(toIndentedString(queriesWithUnknownUsers)).append("\n");
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

