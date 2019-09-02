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
import org.everit.atlassian.restclient.jiracloud.v3.model.FunctionOperand;
import org.everit.atlassian.restclient.jiracloud.v3.model.JqlQueryUnitaryOperand;
import org.everit.atlassian.restclient.jiracloud.v3.model.KeywordOperand;
import org.everit.atlassian.restclient.jiracloud.v3.model.ListOperand;
import org.everit.atlassian.restclient.jiracloud.v3.model.ValueOperand;

/**
 * Details of an operand in a JQL clause.
 */
@ApiModel(description = "Details of an operand in a JQL clause.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-01T13:57:05.408+02:00[Europe/Prague]")
public class JqlQueryClauseOperand {
  @JsonProperty("values")
  private List<JqlQueryUnitaryOperand> values = new ArrayList<>();

  @JsonProperty("value")
  private String value;

  @JsonProperty("function")
  private String function;

  @JsonProperty("arguments")
  private List<String> arguments = new ArrayList<>();

  /**
   * The keyword that is the operand value.
   */
  public enum KeywordEnum {
    EMPTY("empty");

    private String value;

    KeywordEnum(String value) {
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
    public static KeywordEnum fromValue(String value) {
      for (KeywordEnum b : KeywordEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("keyword")
  private KeywordEnum keyword;

  public JqlQueryClauseOperand values(List<JqlQueryUnitaryOperand> values) {
    this.values = values;
    return this;
  }

  public JqlQueryClauseOperand addValuesItem(JqlQueryUnitaryOperand valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The list of operand values.
   * @return values
  **/
  @ApiModelProperty(value = "The list of operand values.")
  public List<JqlQueryUnitaryOperand> getValues() {
    return values;
  }

  public void setValues(List<JqlQueryUnitaryOperand> values) {
    this.values = values;
  }

  public JqlQueryClauseOperand value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The operand value.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The operand value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public JqlQueryClauseOperand function(String function) {
    this.function = function;
    return this;
  }

   /**
   * The name of the function.
   * @return function
  **/
  @ApiModelProperty(required = true, value = "The name of the function.")
  public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }

  public JqlQueryClauseOperand arguments(List<String> arguments) {
    this.arguments = arguments;
    return this;
  }

  public JqlQueryClauseOperand addArgumentsItem(String argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<>();
    }
    this.arguments.add(argumentsItem);
    return this;
  }

   /**
   * The list of function arguments.
   * @return arguments
  **/
  @ApiModelProperty(value = "The list of function arguments.")
  public List<String> getArguments() {
    return arguments;
  }

  public void setArguments(List<String> arguments) {
    this.arguments = arguments;
  }

  public JqlQueryClauseOperand keyword(KeywordEnum keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * The keyword that is the operand value.
   * @return keyword
  **/
  @ApiModelProperty(required = true, value = "The keyword that is the operand value.")
  public KeywordEnum getKeyword() {
    return keyword;
  }

  public void setKeyword(KeywordEnum keyword) {
    this.keyword = keyword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQueryClauseOperand jqlQueryClauseOperand = (JqlQueryClauseOperand) o;
    return Objects.equals(this.values, jqlQueryClauseOperand.values) &&
        Objects.equals(this.value, jqlQueryClauseOperand.value) &&
        Objects.equals(this.function, jqlQueryClauseOperand.function) &&
        Objects.equals(this.arguments, jqlQueryClauseOperand.arguments) &&
        Objects.equals(this.keyword, jqlQueryClauseOperand.keyword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, value, function, arguments, keyword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueryClauseOperand {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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

