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
import java.util.HashMap;
import java.util.Map;

/**
 * An issue priority.
 */
@ApiModel(description = "An issue priority.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-26T10:18:51.013+01:00[Europe/Prague]")
public class Priority {
  @JsonProperty("self")
  private String self;

  @JsonProperty("statusColor")
  private String statusColor;

  @JsonProperty("description")
  private String description;

  @JsonProperty("iconUrl")
  private String iconUrl;

  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private String id;

  private HashMap<String, Object> additionalProperties_ = new HashMap<String, Object>();

  public Priority self(String self) {
    this.self = self;
    return this;
  }

   /**
   * The URL of the issue priority.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of the issue priority.")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public Priority statusColor(String statusColor) {
    this.statusColor = statusColor;
    return this;
  }

   /**
   * The color used to indicate the issue priority.
   * @return statusColor
  **/
  @ApiModelProperty(value = "The color used to indicate the issue priority.")
  public String getStatusColor() {
    return statusColor;
  }

  public void setStatusColor(String statusColor) {
    this.statusColor = statusColor;
  }

  public Priority description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the issue priority.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the issue priority.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Priority iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * The URL of the icon for the issue priority.
   * @return iconUrl
  **/
  @ApiModelProperty(value = "The URL of the icon for the issue priority.")
  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public Priority name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the issue priority.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the issue priority.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Priority id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the issue priority.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the issue priority.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @com.fasterxml.jackson.annotation.JsonAnyGetter
  public Map<String, Object> any() {
   return this.additionalProperties_;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter
  public void set(String name, Object value) {
   this.additionalProperties_.put(name, value);
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Priority priority = (Priority) o;
    return Objects.equals(this.self, priority.self) &&
        Objects.equals(this.statusColor, priority.statusColor) &&
        Objects.equals(this.description, priority.description) &&
        Objects.equals(this.iconUrl, priority.iconUrl) &&
        Objects.equals(this.name, priority.name) &&
        Objects.equals(this.id, priority.id) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, statusColor, description, iconUrl, name, id, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Priority {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    statusColor: ").append(toIndentedString(statusColor)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties_)).append("\n");
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

