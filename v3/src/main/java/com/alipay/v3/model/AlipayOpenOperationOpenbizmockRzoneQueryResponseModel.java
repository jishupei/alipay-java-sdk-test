/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alipay.v3.JSON;

/**
 * AlipayOpenOperationOpenbizmockRzoneQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenOperationOpenbizmockRzoneQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_RESULT_OPENID = "result_openid";
  @SerializedName(SERIALIZED_NAME_RESULT_OPENID)
  private String resultOpenid;

  public static final String SERIALIZED_NAME_ZONE_NAME = "zone_name";
  @SerializedName(SERIALIZED_NAME_ZONE_NAME)
  private String zoneName;

  public static final String SERIALIZED_NAME_ZONE_OPENID = "zone_openid";
  @SerializedName(SERIALIZED_NAME_ZONE_OPENID)
  private String zoneOpenid;

  public AlipayOpenOperationOpenbizmockRzoneQueryResponseModel() { 
  }

  public AlipayOpenOperationOpenbizmockRzoneQueryResponseModel result(String result) {
    
    this.result = result;
    return this;
  }

   /**
   * 测试
   * @return result
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "sucesee", required = true, value = "测试")

  public String getResult() {
    return result;
  }


  public void setResult(String result) {
    this.result = result;
  }


  public AlipayOpenOperationOpenbizmockRzoneQueryResponseModel resultOpenid(String resultOpenid) {
    
    this.resultOpenid = resultOpenid;
    return this;
  }

   /**
   * 测试
   * @return resultOpenid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "xxxxxscddcd", required = true, value = "测试")

  public String getResultOpenid() {
    return resultOpenid;
  }


  public void setResultOpenid(String resultOpenid) {
    this.resultOpenid = resultOpenid;
  }


  public AlipayOpenOperationOpenbizmockRzoneQueryResponseModel zoneName(String zoneName) {
    
    this.zoneName = zoneName;
    return this;
  }

   /**
   * RZ00B
   * @return zoneName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"name\":\"test_id\",\"buyer_id\":\"2088003194644606\",\"bbb\":{\"seller_id\":\"2088003194644670\",\"name\":\"zhenchen\"},\"ccc\":\"{\\\"name\\\": \\\"maise\\\", \\\"cid\\\": \\\"2088003194644699\\\"}\"}", required = true, value = "RZ00B")

  public String getZoneName() {
    return zoneName;
  }


  public void setZoneName(String zoneName) {
    this.zoneName = zoneName;
  }


  public AlipayOpenOperationOpenbizmockRzoneQueryResponseModel zoneOpenid(String zoneOpenid) {
    
    this.zoneOpenid = zoneOpenid;
    return this;
  }

   /**
   * RZ00B
   * @return zoneOpenid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{}", required = true, value = "RZ00B")

  public String getZoneOpenid() {
    return zoneOpenid;
  }


  public void setZoneOpenid(String zoneOpenid) {
    this.zoneOpenid = zoneOpenid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenOperationOpenbizmockRzoneQueryResponseModel alipayOpenOperationOpenbizmockRzoneQueryResponseModel = (AlipayOpenOperationOpenbizmockRzoneQueryResponseModel) o;
    return Objects.equals(this.result, alipayOpenOperationOpenbizmockRzoneQueryResponseModel.result) &&
        Objects.equals(this.resultOpenid, alipayOpenOperationOpenbizmockRzoneQueryResponseModel.resultOpenid) &&
        Objects.equals(this.zoneName, alipayOpenOperationOpenbizmockRzoneQueryResponseModel.zoneName) &&
        Objects.equals(this.zoneOpenid, alipayOpenOperationOpenbizmockRzoneQueryResponseModel.zoneOpenid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, resultOpenid, zoneName, zoneOpenid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenOperationOpenbizmockRzoneQueryResponseModel {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultOpenid: ").append(toIndentedString(resultOpenid)).append("\n");
    sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
    sb.append("    zoneOpenid: ").append(toIndentedString(zoneOpenid)).append("\n");
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
    openapiFields.add("result");
    openapiFields.add("result_openid");
    openapiFields.add("zone_name");
    openapiFields.add("zone_openid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("result");
    openapiRequiredFields.add("result_openid");
    openapiRequiredFields.add("zone_name");
    openapiRequiredFields.add("zone_openid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenOperationOpenbizmockRzoneQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenOperationOpenbizmockRzoneQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenOperationOpenbizmockRzoneQueryResponseModel is not found in the empty JSON string", AlipayOpenOperationOpenbizmockRzoneQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenOperationOpenbizmockRzoneQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenOperationOpenbizmockRzoneQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlipayOpenOperationOpenbizmockRzoneQueryResponseModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result").toString()));
      }
      if (jsonObj.get("result_openid") != null && !jsonObj.get("result_openid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_openid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result_openid").toString()));
      }
      if (jsonObj.get("zone_name") != null && !jsonObj.get("zone_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zone_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zone_name").toString()));
      }
      if (jsonObj.get("zone_openid") != null && !jsonObj.get("zone_openid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zone_openid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zone_openid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenOperationOpenbizmockRzoneQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenOperationOpenbizmockRzoneQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenOperationOpenbizmockRzoneQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenOperationOpenbizmockRzoneQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenOperationOpenbizmockRzoneQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenOperationOpenbizmockRzoneQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenOperationOpenbizmockRzoneQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenOperationOpenbizmockRzoneQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenOperationOpenbizmockRzoneQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenOperationOpenbizmockRzoneQueryResponseModel
  */
  public static AlipayOpenOperationOpenbizmockRzoneQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenOperationOpenbizmockRzoneQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenOperationOpenbizmockRzoneQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

