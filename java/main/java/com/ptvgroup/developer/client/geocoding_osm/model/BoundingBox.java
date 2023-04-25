/*
 * Geocoding OSM
 * With the Geocoding OSM service places can be searched based on OSM data. The search is based on an address, text input or a geographical position.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.geocoding_osm.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Corner coordinates of the area surrounding the place.
 */
@JsonPropertyOrder({
  BoundingBox.JSON_PROPERTY_LEFT,
  BoundingBox.JSON_PROPERTY_BOTTOM,
  BoundingBox.JSON_PROPERTY_RIGHT,
  BoundingBox.JSON_PROPERTY_TOP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-25T13:50:21.651630Z[Etc/UTC]")
public class BoundingBox {
  public static final String JSON_PROPERTY_LEFT = "left";
  private Double left;

  public static final String JSON_PROPERTY_BOTTOM = "bottom";
  private Double bottom;

  public static final String JSON_PROPERTY_RIGHT = "right";
  private Double right;

  public static final String JSON_PROPERTY_TOP = "top";
  private Double top;

  public BoundingBox() { 
  }

  public BoundingBox left(Double left) {
    this.left = left;
    return this;
  }

   /**
   * The longitude value in degrees (WGS84/EPSG:4326) from west to east.
   * minimum: -180
   * maximum: 180
   * @return left
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LEFT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getLeft() {
    return left;
  }


  @JsonProperty(JSON_PROPERTY_LEFT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLeft(Double left) {
    this.left = left;
  }


  public BoundingBox bottom(Double bottom) {
    this.bottom = bottom;
    return this;
  }

   /**
   * The latitude value in degrees (WGS84/EPSG:4326) from south to north.
   * minimum: -90
   * maximum: 90
   * @return bottom
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BOTTOM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getBottom() {
    return bottom;
  }


  @JsonProperty(JSON_PROPERTY_BOTTOM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBottom(Double bottom) {
    this.bottom = bottom;
  }


  public BoundingBox right(Double right) {
    this.right = right;
    return this;
  }

   /**
   * The longitude value in degrees (WGS84/EPSG:4326) from west to east.
   * minimum: -180
   * maximum: 180
   * @return right
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getRight() {
    return right;
  }


  @JsonProperty(JSON_PROPERTY_RIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRight(Double right) {
    this.right = right;
  }


  public BoundingBox top(Double top) {
    this.top = top;
    return this;
  }

   /**
   * The latitude value in degrees (WGS84/EPSG:4326) from south to north.
   * minimum: -90
   * maximum: 90
   * @return top
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getTop() {
    return top;
  }


  @JsonProperty(JSON_PROPERTY_TOP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTop(Double top) {
    this.top = top;
  }


  /**
   * Return true if this BoundingBox object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoundingBox boundingBox = (BoundingBox) o;
    return Objects.equals(this.left, boundingBox.left) &&
        Objects.equals(this.bottom, boundingBox.bottom) &&
        Objects.equals(this.right, boundingBox.right) &&
        Objects.equals(this.top, boundingBox.top);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, bottom, right, top);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoundingBox {\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `left` to the URL query string
    if (getLeft() != null) {
      joiner.add(String.format("%sleft%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLeft()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `bottom` to the URL query string
    if (getBottom() != null) {
      joiner.add(String.format("%sbottom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBottom()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `right` to the URL query string
    if (getRight() != null) {
      joiner.add(String.format("%sright%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRight()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `top` to the URL query string
    if (getTop() != null) {
      joiner.add(String.format("%stop%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTop()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

