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
 * Details about a notification event.
 */
@ApiModel(description = "Details about a notification event.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-01T13:57:05.408+02:00[Europe/Prague]")
public class NotificationEvent {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("templateEvent")
  private NotificationEvent templateEvent;

  public NotificationEvent id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg).
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg).")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public NotificationEvent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the event.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the event.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NotificationEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the event.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the event.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NotificationEvent templateEvent(NotificationEvent templateEvent) {
    this.templateEvent = templateEvent;
    return this;
  }

   /**
   * The template of the event. Only custom events configured by Jira administrators have template.
   * @return templateEvent
  **/
  @ApiModelProperty(value = "The template of the event. Only custom events configured by Jira administrators have template.")
  public NotificationEvent getTemplateEvent() {
    return templateEvent;
  }

  public void setTemplateEvent(NotificationEvent templateEvent) {
    this.templateEvent = templateEvent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationEvent notificationEvent = (NotificationEvent) o;
    return Objects.equals(this.id, notificationEvent.id) &&
        Objects.equals(this.name, notificationEvent.name) &&
        Objects.equals(this.description, notificationEvent.description) &&
        Objects.equals(this.templateEvent, notificationEvent.templateEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, templateEvent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    templateEvent: ").append(toIndentedString(templateEvent)).append("\n");
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

