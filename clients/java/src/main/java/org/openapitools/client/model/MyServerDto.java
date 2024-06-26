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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.RuleListDto;
import org.openapitools.client.model.UserListDto;
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
 * MyServerDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-27T21:45:49.723319836Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class MyServerDto {
  public static final String SERIALIZED_NAME_PLAY_PACT_SERVER_ID = "playPactServerId";
  @SerializedName(SERIALIZED_NAME_PLAY_PACT_SERVER_ID)
  private UUID playPactServerId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_LOGO_URI = "logoUri";
  @SerializedName(SERIALIZED_NAME_LOGO_URI)
  private String logoUri;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private UserListDto owner;

  public static final String SERIALIZED_NAME_ENFORCED_RULES = "enforcedRules";
  @SerializedName(SERIALIZED_NAME_ENFORCED_RULES)
  private List<RuleListDto> enforcedRules;

  public MyServerDto() {
  }

  public MyServerDto playPactServerId(UUID playPactServerId) {
    this.playPactServerId = playPactServerId;
    return this;
  }

   /**
   * Get playPactServerId
   * @return playPactServerId
  **/
  @javax.annotation.Nullable
  public UUID getPlayPactServerId() {
    return playPactServerId;
  }

  public void setPlayPactServerId(UUID playPactServerId) {
    this.playPactServerId = playPactServerId;
  }


  public MyServerDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public MyServerDto description(String description) {
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


  public MyServerDto ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public MyServerDto port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }


  public MyServerDto logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

   /**
   * Get logoUri
   * @return logoUri
  **/
  @javax.annotation.Nullable
  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }


  public MyServerDto tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public MyServerDto owner(UserListDto owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  public UserListDto getOwner() {
    return owner;
  }

  public void setOwner(UserListDto owner) {
    this.owner = owner;
  }


  public MyServerDto enforcedRules(List<RuleListDto> enforcedRules) {
    this.enforcedRules = enforcedRules;
    return this;
  }

  public MyServerDto addEnforcedRulesItem(RuleListDto enforcedRulesItem) {
    if (this.enforcedRules == null) {
      this.enforcedRules = new ArrayList<>();
    }
    this.enforcedRules.add(enforcedRulesItem);
    return this;
  }

   /**
   * Get enforcedRules
   * @return enforcedRules
  **/
  @javax.annotation.Nullable
  public List<RuleListDto> getEnforcedRules() {
    return enforcedRules;
  }

  public void setEnforcedRules(List<RuleListDto> enforcedRules) {
    this.enforcedRules = enforcedRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MyServerDto myServerDto = (MyServerDto) o;
    return Objects.equals(this.playPactServerId, myServerDto.playPactServerId) &&
        Objects.equals(this.name, myServerDto.name) &&
        Objects.equals(this.description, myServerDto.description) &&
        Objects.equals(this.ipAddress, myServerDto.ipAddress) &&
        Objects.equals(this.port, myServerDto.port) &&
        Objects.equals(this.logoUri, myServerDto.logoUri) &&
        Objects.equals(this.tag, myServerDto.tag) &&
        Objects.equals(this.owner, myServerDto.owner) &&
        Objects.equals(this.enforcedRules, myServerDto.enforcedRules);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(playPactServerId, name, description, ipAddress, port, logoUri, tag, owner, enforcedRules);
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
    sb.append("class MyServerDto {\n");
    sb.append("    playPactServerId: ").append(toIndentedString(playPactServerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    enforcedRules: ").append(toIndentedString(enforcedRules)).append("\n");
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
    openapiFields.add("playPactServerId");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("ipAddress");
    openapiFields.add("port");
    openapiFields.add("logoUri");
    openapiFields.add("tag");
    openapiFields.add("owner");
    openapiFields.add("enforcedRules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MyServerDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MyServerDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MyServerDto is not found in the empty JSON string", MyServerDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MyServerDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MyServerDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("playPactServerId") != null && !jsonObj.get("playPactServerId").isJsonNull()) && !jsonObj.get("playPactServerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playPactServerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playPactServerId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("ipAddress") != null && !jsonObj.get("ipAddress").isJsonNull()) && !jsonObj.get("ipAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipAddress").toString()));
      }
      if ((jsonObj.get("port") != null && !jsonObj.get("port").isJsonNull()) && !jsonObj.get("port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("port").toString()));
      }
      if ((jsonObj.get("logoUri") != null && !jsonObj.get("logoUri").isJsonNull()) && !jsonObj.get("logoUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoUri").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      // validate the optional field `owner`
      if (jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) {
        UserListDto.validateJsonElement(jsonObj.get("owner"));
      }
      if (jsonObj.get("enforcedRules") != null && !jsonObj.get("enforcedRules").isJsonNull()) {
        JsonArray jsonArrayenforcedRules = jsonObj.getAsJsonArray("enforcedRules");
        if (jsonArrayenforcedRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("enforcedRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `enforcedRules` to be an array in the JSON string but got `%s`", jsonObj.get("enforcedRules").toString()));
          }

          // validate the optional field `enforcedRules` (array)
          for (int i = 0; i < jsonArrayenforcedRules.size(); i++) {
            RuleListDto.validateJsonElement(jsonArrayenforcedRules.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MyServerDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MyServerDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MyServerDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MyServerDto.class));

       return (TypeAdapter<T>) new TypeAdapter<MyServerDto>() {
           @Override
           public void write(JsonWriter out, MyServerDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MyServerDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MyServerDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MyServerDto
  * @throws IOException if the JSON string is invalid with respect to MyServerDto
  */
  public static MyServerDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MyServerDto.class);
  }

 /**
  * Convert an instance of MyServerDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

