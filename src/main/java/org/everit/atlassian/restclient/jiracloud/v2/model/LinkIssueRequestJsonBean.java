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
import org.everit.atlassian.restclient.jiracloud.v2.model.Comment;
import org.everit.atlassian.restclient.jiracloud.v2.model.IssueLinkType;
import org.everit.atlassian.restclient.jiracloud.v2.model.LinkedIssue;

/**
 * LinkIssueRequestJsonBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-26T10:18:44.797+01:00[Europe/Prague]")
public class LinkIssueRequestJsonBean {
  @JsonProperty("type")
  private IssueLinkType type;

  @JsonProperty("inwardIssue")
  private LinkedIssue inwardIssue;

  @JsonProperty("outwardIssue")
  private LinkedIssue outwardIssue;

  @JsonProperty("comment")
  private Comment comment;

  public LinkIssueRequestJsonBean type(IssueLinkType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public IssueLinkType getType() {
    return type;
  }

  public void setType(IssueLinkType type) {
    this.type = type;
  }

  public LinkIssueRequestJsonBean inwardIssue(LinkedIssue inwardIssue) {
    this.inwardIssue = inwardIssue;
    return this;
  }

   /**
   * Get inwardIssue
   * @return inwardIssue
  **/
  @ApiModelProperty(value = "")
  public LinkedIssue getInwardIssue() {
    return inwardIssue;
  }

  public void setInwardIssue(LinkedIssue inwardIssue) {
    this.inwardIssue = inwardIssue;
  }

  public LinkIssueRequestJsonBean outwardIssue(LinkedIssue outwardIssue) {
    this.outwardIssue = outwardIssue;
    return this;
  }

   /**
   * Get outwardIssue
   * @return outwardIssue
  **/
  @ApiModelProperty(value = "")
  public LinkedIssue getOutwardIssue() {
    return outwardIssue;
  }

  public void setOutwardIssue(LinkedIssue outwardIssue) {
    this.outwardIssue = outwardIssue;
  }

  public LinkIssueRequestJsonBean comment(Comment comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public Comment getComment() {
    return comment;
  }

  public void setComment(Comment comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkIssueRequestJsonBean linkIssueRequestJsonBean = (LinkIssueRequestJsonBean) o;
    return Objects.equals(this.type, linkIssueRequestJsonBean.type) &&
        Objects.equals(this.inwardIssue, linkIssueRequestJsonBean.inwardIssue) &&
        Objects.equals(this.outwardIssue, linkIssueRequestJsonBean.outwardIssue) &&
        Objects.equals(this.comment, linkIssueRequestJsonBean.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, inwardIssue, outwardIssue, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkIssueRequestJsonBean {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inwardIssue: ").append(toIndentedString(inwardIssue)).append("\n");
    sb.append("    outwardIssue: ").append(toIndentedString(outwardIssue)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

