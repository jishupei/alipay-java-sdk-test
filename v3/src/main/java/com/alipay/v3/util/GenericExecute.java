/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.alipay.v3.util;

import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.JSON;
import com.alipay.v3.util.model.CustomizedParams;
import com.google.common.base.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author jishupei.jsp
 * @version : GenericExecute, v0.1 2022年09月22日 11:15 上午 jishupei.jsp Exp $
 */
public class GenericExecute {

    private ApiClient localVarApiClient;

    private String localCustomBaseUrl;

    private boolean loadTest = false;

    public GenericExecute() {
        this(Configuration.getDefaultApiClient());
    }

    public GenericExecute(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Getter method for property <tt>localVarApiClient</tt>.
     *
     * @return property value of localVarApiClient
     */
    public ApiClient getLocalVarApiClient() {
        return localVarApiClient;
    }

    /**
     * Setter method for property <tt>localVarApiClient</tt>.
     *
     * @param localVarApiClient value to be assigned to property localVarApiClient
     */
    public void setLocalVarApiClient(ApiClient localVarApiClient) {
        this.localVarApiClient = localVarApiClient;
    }

    /**
     * Getter method for property <tt>localCustomBaseUrl</tt>.
     *
     * @return property value of localCustomBaseUrl
     */
    public String getLocalCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    /**
     * Setter method for property <tt>localCustomBaseUrl</tt>.
     *
     * @param localCustomBaseUrl value to be assigned to property localCustomBaseUrl
     */
    public void setLocalCustomBaseUrl(String localCustomBaseUrl) {
        this.localCustomBaseUrl = localCustomBaseUrl;
    }

    /**
     * Getter method for property <tt>loadTest</tt>.
     *
     * @return property value of loadTest
     */
    public boolean isLoadTest() {
        return loadTest;
    }

    /**
     * Setter method for property <tt>loadTest</tt>.
     *
     * @param loadTest value to be assigned to property loadTest
     */
    public void setLoadTest(boolean loadTest) {
        this.loadTest = loadTest;
    }

    /**
     * @param method     方法名
     * @param httpMethod GET/POST
     * @param bizParams  bizContent
     * @return
     */
    public String pageExecute(String method, String httpMethod, Map<String, Object> bizParams) throws ApiException {
        return pageExecute(method, httpMethod, bizParams, null, null, null);
    }

    /**
     * @param method           方法名
     * @param httpMethod       GET/POST
     * @param bizParams        bizContent
     * @param authToken        用户授权凭证
     * @param appAuthToken     系统服务商的第三方应用代商家的应用或小程序模板调用支付宝OpenAPI时所传入的授权凭证
     * @param customizedParams 额外参数
     * @return
     * @throws ApiException
     */
    public String pageExecute(String method, String httpMethod, Map<String, Object> bizParams, String authToken, String appAuthToken, CustomizedParams customizedParams) throws ApiException {
        Map<String, String> appParams = new HashMap<>();
        Map<String, String> systemParams = new HashMap<>();

        handleParams(appParams, systemParams, bizParams, authToken, appAuthToken, customizedParams);

        Map<String, String> sortedMap = localVarApiClient.getSortedMap(method, appParams, systemParams);
        if (loadTest && systemParams.containsKey("app_id")) {
            String appId = systemParams.get("app_id") + "_TEST_1A";
            systemParams.put("app_id", appId);
            sortedMap.put("app_id", appId);
        }

        if ("GET".equalsIgnoreCase(httpMethod)) {
            return getRedirectUrl(sortedMap, true);
        } else {
            return getRequestUrl(appParams, systemParams);
        }
    }

    /**
     * @param method    方法名
     * @param bizParams bizContent
     * @return
     * @throws ApiException
     */
    public String sdkExecute(String method, Map<String, Object> bizParams) throws ApiException {
        return sdkExecute(method, bizParams, null, null, null);
    }

    /**
     * @param method           方法名
     * @param bizParams        bizContent
     * @param authToken        用户授权凭证
     * @param appAuthToken     系统服务商的第三方应用代商家的应用或小程序模板调用支付宝OpenAPI时所传入的授权凭证
     * @param customizedParams 额外参数
     * @return
     * @throws ApiException
     */
    public String sdkExecute(String method, Map<String, Object> bizParams, String authToken, String appAuthToken, CustomizedParams customizedParams) throws ApiException {
        Map<String, String> appParams = new HashMap<>();
        Map<String, String> systemParams = new HashMap<>();

        handleParams(appParams, systemParams, bizParams, authToken, appAuthToken, customizedParams);

        Map<String, String> sortedMap = localVarApiClient.getSortedMap(method, appParams, systemParams);
        if (loadTest && sortedMap.containsKey("app_id")) {
            String appId = sortedMap.get("app_id") + "_TEST_1A";
            sortedMap.put("app_id", appId);
        }

        return getRedirectUrl(sortedMap, false);
    }

    private void handleParams(Map<String, String> appParams, Map<String, String> systemParams, Map<String, Object> bizParams, String authToken, String appAuthToken, CustomizedParams customizedParams) {
        if (customizedParams != null && !Strings.isNullOrEmpty(customizedParams.getBodyContent())) {
            appParams.put("biz_content", customizedParams.getBodyContent());
        } else if (bizParams != null && bizParams.containsKey("biz_content")) {
            appParams.put("biz_content", JSON.serialize(bizParams.get("biz_content")));
        }
        if (bizParams != null) {
            for (Map.Entry<String, Object> pair : bizParams.entrySet()) {
                if (!"biz_content".equals(pair.getKey())) {
                    appParams.put(pair.getKey(), localVarApiClient.parameterToString(pair.getValue()));
                }
            }
        }

        if (customizedParams != null) {
            if (!Strings.isNullOrEmpty(appAuthToken)) {
                appParams.put("app_auth_token", appAuthToken);
            }

            if (customizedParams.getQueryParams() != null) {
                systemParams.putAll(customizedParams.getQueryParams());
            }
            if (!Strings.isNullOrEmpty(authToken)) {
                systemParams.put("auth_token", authToken);
            }
        }
    }

    /**
     * GET模式下获取跳转链接
     *
     * @param sortedMap
     * @return
     */
    private String getRedirectUrl(Map<String, String> sortedMap, boolean isNeedUrl) {
        return localVarApiClient.buildQuery(sortedMap, localCustomBaseUrl, isNeedUrl);
    }

    /**
     * 获取POST请求的base url
     *
     * @param systemParams
     * @return
     */
    private String getRequestUrl(Map<String, String> appParams, Map<String, String> systemParams) {
        String baseUrl = localVarApiClient.buildQuery(systemParams, localCustomBaseUrl, true);
        return buildForm(baseUrl, appParams);
    }

    private String buildForm(String baseUrl, Map<String, String> parameters) {
        StringBuilder sb = new StringBuilder();
        sb.append("<form name=\"punchout_form\" method=\"post\" action=\"");
        sb.append(baseUrl);
        sb.append("\">\n");
        sb.append(buildHiddenFields(parameters));

        sb.append("<input type=\"submit\" value=\"立即支付\" style=\"display:none\" >\n");
        sb.append("</form>\n");
        sb.append("<script>document.forms[0].submit();</script>");
        return sb.toString();
    }

    private String buildHiddenFields(Map<String, String> parameters) {
        if (parameters == null || parameters.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Set<String> keys = parameters.keySet();
        for (String key : keys) {
            String value = parameters.get(key);
            // 除去参数中的空值
            if (Strings.isNullOrEmpty(key) || Strings.isNullOrEmpty(value)) {
                continue;
            }
            sb.append(buildHiddenField(key, value));
        }
        return sb.toString();
    }

    private String buildHiddenField(String key, String value) {
        StringBuilder sb = new StringBuilder();
        sb.append("<input type=\"hidden\" name=\"");
        sb.append(key);

        sb.append("\" value=\"");
        //转义双引号
        String a = value.replace("\"", "&quot;");
        sb.append(a).append("\">\n");
        return sb.toString();
    }

}
