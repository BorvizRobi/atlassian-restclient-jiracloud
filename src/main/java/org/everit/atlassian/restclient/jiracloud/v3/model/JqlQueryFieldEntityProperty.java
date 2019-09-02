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
 * Details of an entity property.
 */
@ApiModel(description = "Details of an entity property.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-01T13:57:05.408+02:00[Europe/Prague]")
public class JqlQueryFieldEntityProperty {
  @JsonProperty("entity")
  private String entity;

  @JsonProperty("key")
  private String key;

  @JsonProperty("path")
  private String path;

  /**
   * The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.
   */
  public enum TypeEnum {
    NUMBER("number"),
    
    STRING("string"),
    
    TEXT("text"),
    
    DATE("date"),
    
    USER("user");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  public JqlQueryFieldEntityProperty entity(String entity) {
    this.entity = entity;
    return this;
  }

   /**
   * The object on which the property is set.
   * @return entity
  **/
  @ApiModelProperty(example = "issue", required = true, value = "The object on which the property is set.")
  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public JqlQueryFieldEntityProperty key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key of the property.
   * @return key
  **/
  @ApiModelProperty(example = "stats", required = true, value = "The key of the property.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public JqlQueryFieldEntityProperty path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The path in the property value to query.
   * @return path
  **/
  @ApiModelProperty(example = "comments.count", required = true, value = "The path in the property value to query.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public JqlQueryFieldEntityProperty type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.
   * @return type
  **/
  @ApiModelProperty(example = "number", value = "The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQueryFieldEntityProperty jqlQueryFieldEntityProperty = (JqlQueryFieldEntityProperty) o;
    return Objects.equals(this.entity, jqlQueryFieldEntityProperty.entity) &&
        Objects.equals(this.key, jqlQueryFieldEntityProperty.key) &&
        Objects.equals(this.path, jqlQueryFieldEntityProperty.path) &&
        Objects.equals(this.type, jqlQueryFieldEntityProperty.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, key, path, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueryFieldEntityProperty {\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

