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
import org.openapitools.client.model.EvidenceDto;
import org.openapitools.client.model.MyServerListDto;
import org.openapitools.client.model.ReportStatus;
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
 * MyReportDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-27T21:45:49.723319836Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class MyReportDto {
  public static final String SERIALIZED_NAME_PLAY_PACT_REPORT_ID = "playPactReportId";
  @SerializedName(SERIALIZED_NAME_PLAY_PACT_REPORT_ID)
  private UUID playPactReportId;

  public static final String SERIALIZED_NAME_ACCUSATION = "accusation";
  @SerializedName(SERIALIZED_NAME_ACCUSATION)
  private String accusation;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private UserListDto creator;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private UserListDto subject;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private MyServerListDto server;

  public static final String SERIALIZED_NAME_REPORT_STATUS = "reportStatus";
  @SerializedName(SERIALIZED_NAME_REPORT_STATUS)
  private ReportStatus reportStatus;

  public static final String SERIALIZED_NAME_EVIDENCE = "evidence";
  @SerializedName(SERIALIZED_NAME_EVIDENCE)
  private List<EvidenceDto> evidence;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<RuleListDto> rules;

  public MyReportDto() {
  }

  public MyReportDto playPactReportId(UUID playPactReportId) {
    this.playPactReportId = playPactReportId;
    return this;
  }

   /**
   * Get playPactReportId
   * @return playPactReportId
  **/
  @javax.annotation.Nullable
  public UUID getPlayPactReportId() {
    return playPactReportId;
  }

  public void setPlayPactReportId(UUID playPactReportId) {
    this.playPactReportId = playPactReportId;
  }


  public MyReportDto accusation(String accusation) {
    this.accusation = accusation;
    return this;
  }

   /**
   * Get accusation
   * @return accusation
  **/
  @javax.annotation.Nullable
  public String getAccusation() {
    return accusation;
  }

  public void setAccusation(String accusation) {
    this.accusation = accusation;
  }


  public MyReportDto creator(UserListDto creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable
  public UserListDto getCreator() {
    return creator;
  }

  public void setCreator(UserListDto creator) {
    this.creator = creator;
  }


  public MyReportDto subject(UserListDto subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  public UserListDto getSubject() {
    return subject;
  }

  public void setSubject(UserListDto subject) {
    this.subject = subject;
  }


  public MyReportDto server(MyServerListDto server) {
    this.server = server;
    return this;
  }

   /**
   * Get server
   * @return server
  **/
  @javax.annotation.Nullable
  public MyServerListDto getServer() {
    return server;
  }

  public void setServer(MyServerListDto server) {
    this.server = server;
  }


  public MyReportDto reportStatus(ReportStatus reportStatus) {
    this.reportStatus = reportStatus;
    return this;
  }

   /**
   * Get reportStatus
   * @return reportStatus
  **/
  @javax.annotation.Nullable
  public ReportStatus getReportStatus() {
    return reportStatus;
  }

  public void setReportStatus(ReportStatus reportStatus) {
    this.reportStatus = reportStatus;
  }


  public MyReportDto evidence(List<EvidenceDto> evidence) {
    this.evidence = evidence;
    return this;
  }

  public MyReportDto addEvidenceItem(EvidenceDto evidenceItem) {
    if (this.evidence == null) {
      this.evidence = new ArrayList<>();
    }
    this.evidence.add(evidenceItem);
    return this;
  }

   /**
   * Get evidence
   * @return evidence
  **/
  @javax.annotation.Nullable
  public List<EvidenceDto> getEvidence() {
    return evidence;
  }

  public void setEvidence(List<EvidenceDto> evidence) {
    this.evidence = evidence;
  }


  public MyReportDto rules(List<RuleListDto> rules) {
    this.rules = rules;
    return this;
  }

  public MyReportDto addRulesItem(RuleListDto rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  public List<RuleListDto> getRules() {
    return rules;
  }

  public void setRules(List<RuleListDto> rules) {
    this.rules = rules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MyReportDto myReportDto = (MyReportDto) o;
    return Objects.equals(this.playPactReportId, myReportDto.playPactReportId) &&
        Objects.equals(this.accusation, myReportDto.accusation) &&
        Objects.equals(this.creator, myReportDto.creator) &&
        Objects.equals(this.subject, myReportDto.subject) &&
        Objects.equals(this.server, myReportDto.server) &&
        Objects.equals(this.reportStatus, myReportDto.reportStatus) &&
        Objects.equals(this.evidence, myReportDto.evidence) &&
        Objects.equals(this.rules, myReportDto.rules);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(playPactReportId, accusation, creator, subject, server, reportStatus, evidence, rules);
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
    sb.append("class MyReportDto {\n");
    sb.append("    playPactReportId: ").append(toIndentedString(playPactReportId)).append("\n");
    sb.append("    accusation: ").append(toIndentedString(accusation)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
    sb.append("    evidence: ").append(toIndentedString(evidence)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
    openapiFields.add("playPactReportId");
    openapiFields.add("accusation");
    openapiFields.add("creator");
    openapiFields.add("subject");
    openapiFields.add("server");
    openapiFields.add("reportStatus");
    openapiFields.add("evidence");
    openapiFields.add("rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MyReportDto
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MyReportDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MyReportDto is not found in the empty JSON string", MyReportDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MyReportDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MyReportDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("playPactReportId") != null && !jsonObj.get("playPactReportId").isJsonNull()) && !jsonObj.get("playPactReportId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playPactReportId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playPactReportId").toString()));
      }
      if ((jsonObj.get("accusation") != null && !jsonObj.get("accusation").isJsonNull()) && !jsonObj.get("accusation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accusation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accusation").toString()));
      }
      // validate the optional field `creator`
      if (jsonObj.get("creator") != null && !jsonObj.get("creator").isJsonNull()) {
        UserListDto.validateJsonElement(jsonObj.get("creator"));
      }
      // validate the optional field `subject`
      if (jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) {
        UserListDto.validateJsonElement(jsonObj.get("subject"));
      }
      // validate the optional field `server`
      if (jsonObj.get("server") != null && !jsonObj.get("server").isJsonNull()) {
        MyServerListDto.validateJsonElement(jsonObj.get("server"));
      }
      // validate the optional field `reportStatus`
      if (jsonObj.get("reportStatus") != null && !jsonObj.get("reportStatus").isJsonNull()) {
        ReportStatus.validateJsonElement(jsonObj.get("reportStatus"));
      }
      if (jsonObj.get("evidence") != null && !jsonObj.get("evidence").isJsonNull()) {
        JsonArray jsonArrayevidence = jsonObj.getAsJsonArray("evidence");
        if (jsonArrayevidence != null) {
          // ensure the json data is an array
          if (!jsonObj.get("evidence").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `evidence` to be an array in the JSON string but got `%s`", jsonObj.get("evidence").toString()));
          }

          // validate the optional field `evidence` (array)
          for (int i = 0; i < jsonArrayevidence.size(); i++) {
            EvidenceDto.validateJsonElement(jsonArrayevidence.get(i));
          };
        }
      }
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) {
        JsonArray jsonArrayrules = jsonObj.getAsJsonArray("rules");
        if (jsonArrayrules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rules` to be an array in the JSON string but got `%s`", jsonObj.get("rules").toString()));
          }

          // validate the optional field `rules` (array)
          for (int i = 0; i < jsonArrayrules.size(); i++) {
            RuleListDto.validateJsonElement(jsonArrayrules.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MyReportDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MyReportDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MyReportDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MyReportDto.class));

       return (TypeAdapter<T>) new TypeAdapter<MyReportDto>() {
           @Override
           public void write(JsonWriter out, MyReportDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MyReportDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MyReportDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MyReportDto
  * @throws IOException if the JSON string is invalid with respect to MyReportDto
  */
  public static MyReportDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MyReportDto.class);
  }

 /**
  * Convert an instance of MyReportDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

