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
import com.alipay.v3.model.AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel;
import com.alipay.v3.model.CommonErrorType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.alipay.v3.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel> adapterAlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel.class));
            final TypeAdapter<CommonErrorType> adapterCommonErrorType = gson.getDelegateAdapter(this, TypeToken.get(CommonErrorType.class));

            return (TypeAdapter<T>) new TypeAdapter<AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse>() {
                @Override
                public void write(JsonWriter out, AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel`
                    if (value.getActualInstance() instanceof AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel) {
                        JsonObject obj = adapterAlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel.toJsonTree((AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `CommonErrorType`
                    if (value.getActualInstance() instanceof CommonErrorType) {
                        JsonObject obj = adapterCommonErrorType.toJsonTree((CommonErrorType)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel, CommonErrorType");
                }

                @Override
                public AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse ret = new AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse();
                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    // TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel.validateJsonObject(jsonObject);
                        // actualAdapter = adapterAlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel;
                        ret.setActualInstance(adapterAlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel.fromJsonTree(jsonObject));
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel'", e);
                    }

                    // deserialize CommonErrorType
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CommonErrorType.validateJsonObject(jsonObject);
                        // actualAdapter = adapterCommonErrorType;
                        ret.setActualInstance(adapterCommonErrorType.fromJsonTree(jsonObject));
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CommonErrorType'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CommonErrorType failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CommonErrorType'", e);
                    }

                    if (match == 1) {
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse() {
        super("oneOf", Boolean.FALSE);
    }

    public AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse(AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse(CommonErrorType o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel", new GenericType<AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel>() {
        });
        schemas.put("CommonErrorType", new GenericType<CommonErrorType>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel, CommonErrorType
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CommonErrorType) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel, CommonErrorType");
    }

    /**
     * Get the actual instance, which can be the following:
     * AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel, CommonErrorType
     *
     * @return The actual instance (AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel, CommonErrorType)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel`. If the actual instance is not `AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel`
     * @throws ClassCastException if the instance is not `AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel`
     */
    public AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel getAlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel() throws ClassCastException {
        return (AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CommonErrorType`. If the actual instance is not `CommonErrorType`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CommonErrorType`
     * @throws ClassCastException if the instance is not `CommonErrorType`
     */
    public CommonErrorType getCommonErrorType() throws ClassCastException {
        return (CommonErrorType)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel
    try {
      AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CommonErrorType
    try {
      CommonErrorType.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CommonErrorType failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse with oneOf schemas: AlipayOpenOperationOpenbizmockOpenidtestingQueryErrorResponseModel, CommonErrorType. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse
  */
  public static AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse.class);
  }

 /**
  * Convert an instance of AlipayOpenOperationOpenbizmockOpenidtestingQueryDefaultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
