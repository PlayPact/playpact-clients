/*
 * PlayPact API
 * The API for PlayPact.
 *
 * The version of the OpenAPI document: v1
 * Contact: contact@playpact.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ReviewEvaluation
 */
@JsonAdapter(ReviewEvaluation.Adapter.class)
public enum ReviewEvaluation {
  
  CONFIRMED("Confirmed"),
  
  REJECTED("Rejected"),
  
  REMOVED("Removed"),
  
  ERROR("Error");

  private String value;

  ReviewEvaluation(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReviewEvaluation fromValue(String value) {
    for (ReviewEvaluation b : ReviewEvaluation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReviewEvaluation> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReviewEvaluation enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReviewEvaluation read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReviewEvaluation.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ReviewEvaluation.fromValue(value);
  }
}

