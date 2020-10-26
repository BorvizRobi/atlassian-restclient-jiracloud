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

/**
 * Details of a custom field option and its cascading options.
 */
@ApiModel(description = "Details of a custom field option and its cascading options.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-26T10:18:51.013+01:00[Europe/Prague]")
public class CustomFieldOptionDetails {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("value")
  private String value;

  @JsonProperty("cascadingOptions")
  private List<String> cascadingOptions = new ArrayList<>();

   /**
   * The ID of the custom field option.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the custom field option.")
  public Long getId() {
    return id;
  }

   /**
   * The value of the custom field option.
   * @return value
  **/
  @ApiModelProperty(value = "The value of the custom field option.")
  public String getValue() {
    return value;
  }

   /**
   * The cascading options.
   * @return cascadingOptions
  **/
  @ApiModelProperty(value = "The cascading options.")
  public List<String> getCascadingOptions() {
    return cascadingOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldOptionDetails customFieldOptionDetails = (CustomFieldOptionDetails) o;
    return Objects.equals(this.id, customFieldOptionDetails.id) &&
        Objects.equals(this.value, customFieldOptionDetails.value) &&
        Objects.equals(this.cascadingOptions, customFieldOptionDetails.cascadingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, cascadingOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldOptionDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    cascadingOptions: ").append(toIndentedString(cascadingOptions)).append("\n");
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

