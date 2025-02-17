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


package com.ptvgroup.developer.client.geocoding.osm.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ptvgroup.developer.client.geocoding.osm.model.BoundingBox;
import com.ptvgroup.developer.client.geocoding.osm.model.ReferencePosition;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.geocoding.osm.ApiClient;
/**
 * Place
 */
@JsonPropertyOrder({
  Place.JSON_PROPERTY_REFERENCE_POSITION,
  Place.JSON_PROPERTY_BOUNDING_BOX,
  Place.JSON_PROPERTY_FORMATTED_ADDRESS,
  Place.JSON_PROPERTY_CATEGORY,
  Place.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-17T10:15:15.367389526Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Place {
  public static final String JSON_PROPERTY_REFERENCE_POSITION = "referencePosition";
  private ReferencePosition referencePosition;

  public static final String JSON_PROPERTY_BOUNDING_BOX = "boundingBox";
  private BoundingBox boundingBox;

  public static final String JSON_PROPERTY_FORMATTED_ADDRESS = "formattedAddress";
  private String formattedAddress;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public Place() { 
  }

  public Place referencePosition(ReferencePosition referencePosition) {
    this.referencePosition = referencePosition;
    return this;
  }

  /**
   * Get referencePosition
   * @return referencePosition
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REFERENCE_POSITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ReferencePosition getReferencePosition() {
    return referencePosition;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_POSITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReferencePosition(ReferencePosition referencePosition) {
    this.referencePosition = referencePosition;
  }


  public Place boundingBox(BoundingBox boundingBox) {
    this.boundingBox = boundingBox;
    return this;
  }

  /**
   * Get boundingBox
   * @return boundingBox
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOUNDING_BOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BoundingBox getBoundingBox() {
    return boundingBox;
  }


  @JsonProperty(JSON_PROPERTY_BOUNDING_BOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBoundingBox(BoundingBox boundingBox) {
    this.boundingBox = boundingBox;
  }


  public Place formattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

  /**
   * A single string containing the name and all address elements of a place.
   * @return formattedAddress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FORMATTED_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFormattedAddress() {
    return formattedAddress;
  }


  @JsonProperty(JSON_PROPERTY_FORMATTED_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }


  public Place category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category of this place, which corresponds to the key of the main OSM tag.
   * @return category
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCategory(String category) {
    this.category = category;
  }


  public Place type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of this place, which corresponds to the value of the main OSM tag. Each category is divided into different types.
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this Place object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Place place = (Place) o;
    return Objects.equals(this.referencePosition, place.referencePosition) &&
        Objects.equals(this.boundingBox, place.boundingBox) &&
        Objects.equals(this.formattedAddress, place.formattedAddress) &&
        Objects.equals(this.category, place.category) &&
        Objects.equals(this.type, place.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referencePosition, boundingBox, formattedAddress, category, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Place {\n");
    sb.append("    referencePosition: ").append(toIndentedString(referencePosition)).append("\n");
    sb.append("    boundingBox: ").append(toIndentedString(boundingBox)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `referencePosition` to the URL query string
    if (getReferencePosition() != null) {
      joiner.add(getReferencePosition().toUrlQueryString(prefix + "referencePosition" + suffix));
    }

    // add `boundingBox` to the URL query string
    if (getBoundingBox() != null) {
      joiner.add(getBoundingBox().toUrlQueryString(prefix + "boundingBox" + suffix));
    }

    // add `formattedAddress` to the URL query string
    if (getFormattedAddress() != null) {
      joiner.add(String.format("%sformattedAddress%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFormattedAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `category` to the URL query string
    if (getCategory() != null) {
      joiner.add(String.format("%scategory%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCategory()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

