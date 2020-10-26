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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UserWriteBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-26T10:18:51.013+01:00[Europe/Prague]")
public class UserWriteBean {
  @JsonProperty("self")
  private String self;

  @JsonProperty("key")
  private String key;

  @JsonProperty("name")
  private String name;

  @JsonProperty("password")
  private String password;

  @JsonProperty("emailAddress")
  private String emailAddress;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("notification")
  private String notification;

  @JsonProperty("applicationKeys")
  private List<String> applicationKeys = new ArrayList<>();

  private HashMap<String, Object> additionalProperties_ = new HashMap<String, Object>();

   /**
   * The URL of the user.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of the user.")
  public String getSelf() {
    return self;
  }

  public UserWriteBean key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key for the user. When provided with &#x60;name&#x60;, overrides the value in &#x60;name&#x60; to set both &#x60;name&#x60; and &#x60;key&#x60;. This property is deprecated because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return key
  **/
  @ApiModelProperty(value = "The key for the user. When provided with `name`, overrides the value in `name` to set both `name` and `key`. This property is deprecated because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public UserWriteBean name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The username for the user. This property is deprecated because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return name
  **/
  @ApiModelProperty(value = "The username for the user. This property is deprecated because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserWriteBean password(String password) {
    this.password = password;
    return this;
  }

   /**
   * A password for the user. If a password is not set, a random password is generated.
   * @return password
  **/
  @ApiModelProperty(value = "A password for the user. If a password is not set, a random password is generated.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserWriteBean emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address for the user.
   * @return emailAddress
  **/
  @ApiModelProperty(required = true, value = "The email address for the user.")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public UserWriteBean displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name for the user.
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "The display name for the user.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserWriteBean notification(String notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Sends the user an email confirmation that they have been added to Jira. Default is &#x60;false&#x60;.
   * @return notification
  **/
  @ApiModelProperty(value = "Sends the user an email confirmation that they have been added to Jira. Default is `false`.")
  public String getNotification() {
    return notification;
  }

  public void setNotification(String notification) {
    this.notification = notification;
  }

  public UserWriteBean applicationKeys(List<String> applicationKeys) {
    this.applicationKeys = applicationKeys;
    return this;
  }

  public UserWriteBean addApplicationKeysItem(String applicationKeysItem) {
    if (this.applicationKeys == null) {
      this.applicationKeys = new ArrayList<>();
    }
    this.applicationKeys.add(applicationKeysItem);
    return this;
  }

   /**
   * Deprecated, do not use.
   * @return applicationKeys
  **/
  @ApiModelProperty(value = "Deprecated, do not use.")
  public List<String> getApplicationKeys() {
    return applicationKeys;
  }

  public void setApplicationKeys(List<String> applicationKeys) {
    this.applicationKeys = applicationKeys;
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
    UserWriteBean userWriteBean = (UserWriteBean) o;
    return Objects.equals(this.self, userWriteBean.self) &&
        Objects.equals(this.key, userWriteBean.key) &&
        Objects.equals(this.name, userWriteBean.name) &&
        Objects.equals(this.password, userWriteBean.password) &&
        Objects.equals(this.emailAddress, userWriteBean.emailAddress) &&
        Objects.equals(this.displayName, userWriteBean.displayName) &&
        Objects.equals(this.notification, userWriteBean.notification) &&
        Objects.equals(this.applicationKeys, userWriteBean.applicationKeys) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, key, name, password, emailAddress, displayName, notification, applicationKeys, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWriteBean {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    applicationKeys: ").append(toIndentedString(applicationKeys)).append("\n");
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

