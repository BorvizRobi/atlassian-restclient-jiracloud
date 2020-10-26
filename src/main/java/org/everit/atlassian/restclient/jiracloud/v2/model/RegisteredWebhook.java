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

/**
 * ID of a registered webhook or error messages explaining why a webhook wasn&#39;t registered.
 */
@ApiModel(description = "ID of a registered webhook or error messages explaining why a webhook wasn't registered.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-26T10:18:44.797+01:00[Europe/Prague]")
public class RegisteredWebhook {
  @JsonProperty("createdWebhookId")
  private Long createdWebhookId;

  @JsonProperty("errors")
  private List<String> errors = new ArrayList<>();

  public RegisteredWebhook createdWebhookId(Long createdWebhookId) {
    this.createdWebhookId = createdWebhookId;
    return this;
  }

   /**
   * The ID of the webhook. Returned if the webhook is created.
   * @return createdWebhookId
  **/
  @ApiModelProperty(value = "The ID of the webhook. Returned if the webhook is created.")
  public Long getCreatedWebhookId() {
    return createdWebhookId;
  }

  public void setCreatedWebhookId(Long createdWebhookId) {
    this.createdWebhookId = createdWebhookId;
  }

  public RegisteredWebhook errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public RegisteredWebhook addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Error messages specifying why the webhook creation failed.
   * @return errors
  **/
  @ApiModelProperty(value = "Error messages specifying why the webhook creation failed.")
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisteredWebhook registeredWebhook = (RegisteredWebhook) o;
    return Objects.equals(this.createdWebhookId, registeredWebhook.createdWebhookId) &&
        Objects.equals(this.errors, registeredWebhook.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdWebhookId, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisteredWebhook {\n");
    
    sb.append("    createdWebhookId: ").append(toIndentedString(createdWebhookId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

