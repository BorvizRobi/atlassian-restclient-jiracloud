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
import org.everit.atlassian.restclient.jiracloud.v2.model.JqlQueryClauseTimePredicate;
import org.everit.atlassian.restclient.jiracloud.v2.model.JqlQueryField;

/**
 * A clause that asserts whether a field was changed. For example, &#x60;status CHANGED AFTER startOfMonth(-1M)&#x60;.See [CHANGED](https://confluence.atlassian.com/x/dgiiLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for more information about the CHANGED operator.
 */
@ApiModel(description = "A clause that asserts whether a field was changed. For example, `status CHANGED AFTER startOfMonth(-1M)`.See [CHANGED](https://confluence.atlassian.com/x/dgiiLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for more information about the CHANGED operator.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-01T13:56:58.037+02:00[Europe/Prague]")
public class FieldChangedClause {
  @JsonProperty("field")
  private JqlQueryField field;

  /**
   * The operator applied to the field.
   */
  public enum OperatorEnum {
    CHANGED("changed");

    private String value;

    OperatorEnum(String value) {
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
    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("operator")
  private OperatorEnum operator;

  @JsonProperty("predicates")
  private List<JqlQueryClauseTimePredicate> predicates = new ArrayList<>();

  public FieldChangedClause field(JqlQueryField field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @ApiModelProperty(required = true, value = "")
  public JqlQueryField getField() {
    return field;
  }

  public void setField(JqlQueryField field) {
    this.field = field;
  }

  public FieldChangedClause operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * The operator applied to the field.
   * @return operator
  **/
  @ApiModelProperty(required = true, value = "The operator applied to the field.")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public FieldChangedClause predicates(List<JqlQueryClauseTimePredicate> predicates) {
    this.predicates = predicates;
    return this;
  }

  public FieldChangedClause addPredicatesItem(JqlQueryClauseTimePredicate predicatesItem) {
    this.predicates.add(predicatesItem);
    return this;
  }

   /**
   * The list of time predicates.
   * @return predicates
  **/
  @ApiModelProperty(required = true, value = "The list of time predicates.")
  public List<JqlQueryClauseTimePredicate> getPredicates() {
    return predicates;
  }

  public void setPredicates(List<JqlQueryClauseTimePredicate> predicates) {
    this.predicates = predicates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldChangedClause fieldChangedClause = (FieldChangedClause) o;
    return Objects.equals(this.field, fieldChangedClause.field) &&
        Objects.equals(this.operator, fieldChangedClause.operator) &&
        Objects.equals(this.predicates, fieldChangedClause.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operator, predicates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldChangedClause {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
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

