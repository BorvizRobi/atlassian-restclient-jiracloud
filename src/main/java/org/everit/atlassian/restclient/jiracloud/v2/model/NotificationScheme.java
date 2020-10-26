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
import org.everit.atlassian.restclient.jiracloud.v2.model.NotificationSchemeEvent;
import org.everit.atlassian.restclient.jiracloud.v2.model.Scope;

/**
 * Details about a notification scheme.
 */
@ApiModel(description = "Details about a notification scheme.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-26T10:18:44.797+01:00[Europe/Prague]")
public class NotificationScheme {
  @JsonProperty("expand")
  private String expand;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("self")
  private String self;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("notificationSchemeEvents")
  private List<NotificationSchemeEvent> notificationSchemeEvents = new ArrayList<>();

  @JsonProperty("scope")
  private Scope scope;

  public NotificationScheme expand(String expand) {
    this.expand = expand;
    return this;
  }

   /**
   * Expand options that include additional notification scheme details in the response.
   * @return expand
  **/
  @ApiModelProperty(value = "Expand options that include additional notification scheme details in the response.")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public NotificationScheme id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the notification scheme.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the notification scheme.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public NotificationScheme self(String self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public NotificationScheme name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the notification scheme.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the notification scheme.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NotificationScheme description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the notification scheme.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the notification scheme.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NotificationScheme notificationSchemeEvents(List<NotificationSchemeEvent> notificationSchemeEvents) {
    this.notificationSchemeEvents = notificationSchemeEvents;
    return this;
  }

  public NotificationScheme addNotificationSchemeEventsItem(NotificationSchemeEvent notificationSchemeEventsItem) {
    if (this.notificationSchemeEvents == null) {
      this.notificationSchemeEvents = new ArrayList<>();
    }
    this.notificationSchemeEvents.add(notificationSchemeEventsItem);
    return this;
  }

   /**
   * The notification events and associated recipients.
   * @return notificationSchemeEvents
  **/
  @ApiModelProperty(value = "The notification events and associated recipients.")
  public List<NotificationSchemeEvent> getNotificationSchemeEvents() {
    return notificationSchemeEvents;
  }

  public void setNotificationSchemeEvents(List<NotificationSchemeEvent> notificationSchemeEvents) {
    this.notificationSchemeEvents = notificationSchemeEvents;
  }

  public NotificationScheme scope(Scope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the notification scheme.
   * @return scope
  **/
  @ApiModelProperty(value = "The scope of the notification scheme.")
  public Scope getScope() {
    return scope;
  }

  public void setScope(Scope scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationScheme notificationScheme = (NotificationScheme) o;
    return Objects.equals(this.expand, notificationScheme.expand) &&
        Objects.equals(this.id, notificationScheme.id) &&
        Objects.equals(this.self, notificationScheme.self) &&
        Objects.equals(this.name, notificationScheme.name) &&
        Objects.equals(this.description, notificationScheme.description) &&
        Objects.equals(this.notificationSchemeEvents, notificationScheme.notificationSchemeEvents) &&
        Objects.equals(this.scope, notificationScheme.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, id, self, name, description, notificationSchemeEvents, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationScheme {\n");
    
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notificationSchemeEvents: ").append(toIndentedString(notificationSchemeEvents)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

