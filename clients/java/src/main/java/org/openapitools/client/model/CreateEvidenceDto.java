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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.client.model.FileType;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * CreateEvidenceDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-27T21:45:49.723319836Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class CreateEvidenceDto {
  public static final String SERIALIZED_NAME_PLAY_PACT_UPLOADER_ID = "playPactUploaderId";
  @SerializedName(SERIALIZED_NAME_PLAY_PACT_UPLOADER_ID)
  private UUID playPactUploaderId;

  public static final String SERIALIZED_NAME_PLAY_PACT_ATTACHED_TO_ID = "playPactAttachedToId";
  @SerializedName(SERIALIZED_NAME_PLAY_PACT_ATTACHED_TO_ID)
  private UUID playPactAttachedToId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FILE_TYPE = "fileType";
  @SerializedName(SERIALIZED_NAME_FILE_TYPE)
  private FileType fileType;

  public static final String SERIALIZED_NAME_BLOB_STORAGE_URI = "blobStorageUri";
  @SerializedName(SERIALIZED_NAME_BLOB_STORAGE_URI)
  private String blobStorageUri;

  public CreateEvidenceDto() {
  }

  public CreateEvidenceDto playPactUploaderId(UUID playPactUploaderId) {
    this.playPactUploaderId = playPactUploaderId;
    return this;
  }

   /**
   * Get playPactUploaderId
   * @return playPactUploaderId
  **/
  @javax.annotation.Nullable
  public UUID getPlayPactUploaderId() {
    return playPactUploaderId;
  }

  public void setPlayPactUploaderId(UUID playPactUploaderId) {
    this.playPactUploaderId = playPactUploaderId;
  }


  public CreateEvidenceDto playPactAttachedToId(UUID playPactAttachedToId) {
    this.playPactAttachedToId = playPactAttachedToId;
    return this;
  }

   /**
   * Get playPactAttachedToId
   * @return playPactAttachedToId
  **/
  @javax.annotation.Nullable
  public UUID getPlayPactAttachedToId() {
    return playPactAttachedToId;
  }

  public void setPlayPactAttachedToId(UUID playPactAttachedToId) {
    this.playPactAttachedToId = playPactAttachedToId;
  }


  public CreateEvidenceDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CreateEvidenceDto fileType(FileType fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * Get fileType
   * @return fileType
  **/
  @javax.annotation.Nullable
  public FileType getFileType() {
    return fileType;
  }

  public void setFileType(FileType fileType) {
    this.fileType = fileType;
  }


  public CreateEvidenceDto blobStorageUri(String blobStorageUri) {
    this.blobStorageUri = blobStorageUri;
    return this;
  }

   /**
   * Get blobStorageUri
   * @return blobStorageUri
  **/
  @javax.annotation.Nullable
  public String getBlobStorageUri() {
    return blobStorageUri;
  }

  public void setBlobStorageUri(String blobStorageUri) {
    this.blobStorageUri = blobStorageUri;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEvidenceDto createEvidenceDto = (CreateEvidenceDto) o;
    return Objects.equals(this.playPactUploaderId, createEvidenceDto.playPactUploaderId) &&
        Objects.equals(this.playPactAttachedToId, createEvidenceDto.playPactAttachedToId) &&
        Objects.equals(this.description, createEvidenceDto.description) &&
        Objects.equals(this.fileType, createEvidenceDto.fileType) &&
        Objects.equals(this.blobStorageUri, createEvidenceDto.blobStorageUri);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(playPactUploaderId, playPactAttachedToId, description, fileType, blobStorageUri);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEvidenceDto {\n");
    sb.append("    playPactUploaderId: ").append(toIndentedString(playPactUploaderId)).append("\n");
    sb.append("    playPactAttachedToId: ").append(toIndentedString(playPactAttachedToId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    blobStorageUri: ").append(toIndentedString(blobStorageUri)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("playPactUploaderId");
    openapiFields.add("playPactAttachedToId");
    openapiFields.add("description");
    openapiFields.add("fileType");
    openapiFields.add("blobStorageUri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateEvidenceDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEvidenceDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEvidenceDto is not found in the empty JSON string", CreateEvidenceDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEvidenceDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEvidenceDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("playPactUploaderId") != null && !jsonObj.get("playPactUploaderId").isJsonNull()) && !jsonObj.get("playPactUploaderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playPactUploaderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playPactUploaderId").toString()));
      }
      if ((jsonObj.get("playPactAttachedToId") != null && !jsonObj.get("playPactAttachedToId").isJsonNull()) && !jsonObj.get("playPactAttachedToId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playPactAttachedToId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playPactAttachedToId").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `fileType`
      if (jsonObj.get("fileType") != null && !jsonObj.get("fileType").isJsonNull()) {
        FileType.validateJsonElement(jsonObj.get("fileType"));
      }
      if ((jsonObj.get("blobStorageUri") != null && !jsonObj.get("blobStorageUri").isJsonNull()) && !jsonObj.get("blobStorageUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blobStorageUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blobStorageUri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEvidenceDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEvidenceDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEvidenceDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEvidenceDto.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEvidenceDto>() {
           @Override
           public void write(JsonWriter out, CreateEvidenceDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEvidenceDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateEvidenceDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateEvidenceDto
  * @throws IOException if the JSON string is invalid with respect to CreateEvidenceDto
  */
  public static CreateEvidenceDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEvidenceDto.class);
  }

 /**
  * Convert an instance of CreateEvidenceDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

