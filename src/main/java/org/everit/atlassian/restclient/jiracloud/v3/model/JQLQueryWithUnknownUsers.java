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
 * JQL queries that contained users that could not be found
 */
@ApiModel(description = "JQL queries that contained users that could not be found")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-26T10:18:51.013+01:00[Europe/Prague]")
public class JQLQueryWithUnknownUsers {
  @JsonProperty("originalQuery")
  private String originalQuery;

  @JsonProperty("convertedQuery")
  private String convertedQuery;

  public JQLQueryWithUnknownUsers originalQuery(String originalQuery) {
    this.originalQuery = originalQuery;
    return this;
  }

   /**
   * The original query, for reference
   * @return originalQuery
  **/
  @ApiModelProperty(value = "The original query, for reference")
  public String getOriginalQuery() {
    return originalQuery;
  }

  public void setOriginalQuery(String originalQuery) {
    this.originalQuery = originalQuery;
  }

  public JQLQueryWithUnknownUsers convertedQuery(String convertedQuery) {
    this.convertedQuery = convertedQuery;
    return this;
  }

   /**
   * The converted query, with accountIDs instead of user identifiers, or &#39;unknown&#39; for users that could not be found
   * @return convertedQuery
  **/
  @ApiModelProperty(value = "The converted query, with accountIDs instead of user identifiers, or 'unknown' for users that could not be found")
  public String getConvertedQuery() {
    return convertedQuery;
  }

  public void setConvertedQuery(String convertedQuery) {
    this.convertedQuery = convertedQuery;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JQLQueryWithUnknownUsers jqLQueryWithUnknownUsers = (JQLQueryWithUnknownUsers) o;
    return Objects.equals(this.originalQuery, jqLQueryWithUnknownUsers.originalQuery) &&
        Objects.equals(this.convertedQuery, jqLQueryWithUnknownUsers.convertedQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalQuery, convertedQuery);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JQLQueryWithUnknownUsers {\n");
    
    sb.append("    originalQuery: ").append(toIndentedString(originalQuery)).append("\n");
    sb.append("    convertedQuery: ").append(toIndentedString(convertedQuery)).append("\n");
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

