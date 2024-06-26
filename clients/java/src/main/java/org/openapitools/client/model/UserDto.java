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
 * UserDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-27T21:45:49.723319836Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class UserDto {
  public static final String SERIALIZED_NAME_PLAY_PACT_USER_ID = "playPactUserId";
  @SerializedName(SERIALIZED_NAME_PLAY_PACT_USER_ID)
  private UUID playPactUserId;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_MAIL = "mail";
  @SerializedName(SERIALIZED_NAME_MAIL)
  private String mail;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_PACT_POINTS = "pactPoints";
  @SerializedName(SERIALIZED_NAME_PACT_POINTS)
  private Integer pactPoints;

  public UserDto() {
  }

  public UserDto playPactUserId(UUID playPactUserId) {
    this.playPactUserId = playPactUserId;
    return this;
  }

   /**
   * Get playPactUserId
   * @return playPactUserId
  **/
  @javax.annotation.Nullable
  public UUID getPlayPactUserId() {
    return playPactUserId;
  }

  public void setPlayPactUserId(UUID playPactUserId) {
    this.playPactUserId = playPactUserId;
  }


  public UserDto username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public UserDto mail(String mail) {
    this.mail = mail;
    return this;
  }

   /**
   * Get mail
   * @return mail
  **/
  @javax.annotation.Nullable
  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }


  public UserDto phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public UserDto pactPoints(Integer pactPoints) {
    this.pactPoints = pactPoints;
    return this;
  }

   /**
   * Get pactPoints
   * @return pactPoints
  **/
  @javax.annotation.Nullable
  public Integer getPactPoints() {
    return pactPoints;
  }

  public void setPactPoints(Integer pactPoints) {
    this.pactPoints = pactPoints;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDto userDto = (UserDto) o;
    return Objects.equals(this.playPactUserId, userDto.playPactUserId) &&
        Objects.equals(this.username, userDto.username) &&
        Objects.equals(this.mail, userDto.mail) &&
        Objects.equals(this.phone, userDto.phone) &&
        Objects.equals(this.pactPoints, userDto.pactPoints);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(playPactUserId, username, mail, phone, pactPoints);
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
    sb.append("class UserDto {\n");
    sb.append("    playPactUserId: ").append(toIndentedString(playPactUserId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    pactPoints: ").append(toIndentedString(pactPoints)).append("\n");
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
    openapiFields.add("playPactUserId");
    openapiFields.add("username");
    openapiFields.add("mail");
    openapiFields.add("phone");
    openapiFields.add("pactPoints");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UserDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserDto is not found in the empty JSON string", UserDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("playPactUserId") != null && !jsonObj.get("playPactUserId").isJsonNull()) && !jsonObj.get("playPactUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playPactUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playPactUserId").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("mail") != null && !jsonObj.get("mail").isJsonNull()) && !jsonObj.get("mail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mail").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserDto.class));

       return (TypeAdapter<T>) new TypeAdapter<UserDto>() {
           @Override
           public void write(JsonWriter out, UserDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserDto
  * @throws IOException if the JSON string is invalid with respect to UserDto
  */
  public static UserDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserDto.class);
  }

 /**
  * Convert an instance of UserDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

