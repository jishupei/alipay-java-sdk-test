# OperationApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](OperationApi.md#query) | **GET** /v3/alipay/open/operation/openbizmock/closelyrzone/query | 测试路由转发closelyrzone |
| [**query_0**](OperationApi.md#query_0) | **POST** /v3/alipay/open/operation/openbizmock/encrydata/query | 测试专用_此接口类型为强制加密接口 |
| [**query_1**](OperationApi.md#query_1) | **GET** /v3/alipay/open/operation/openbizmock/gzone/query | V3网关测试gzone转发 |
| [**query_2**](OperationApi.md#query_2) | **POST** /v3/alipay/open/operation/openbizmock/openidtesting/query | 网关测试接口openid升级测试 |
| [**query_3**](OperationApi.md#query_3) | **GET** /v3/alipay/open/operation/openbizmock/rzone/query | 测试openapi路由 |
| [**query_4**](OperationApi.md#query_4) | **POST** /v3/alipay/open/operation/openbizmock/rzonegroovy/query | 测试路由转发groovy脚本 |
| [**query_5**](OperationApi.md#query_5) | **GET** /v3/alipay/open/operation/openbizmock/testcertificate/query | 测试专用此接口为强制走证书的接口 |
| [**query_6**](OperationApi.md#query_6) | **GET** /v3/alipay/open/operation/openbizmock/testerrorcode/query | 测试错误码验证接口 |
| [**query_7**](OperationApi.md#query_7) | **POST** /v3/alipay/open/operation/openbizmock/testpathkey/query/{keykey}/{a} | 测试网关协议3.0key和path |


<a name="query"></a>
# **query**
> AlipayOpenOperationOpenbizmockCloselyrzoneQueryResponseModel query(a)

测试路由转发closelyrzone

测试路由转发closelyrzone

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.models.*;
import com.alipay.v3.api.OperationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");

    OperationApi apiInstance = new OperationApi(defaultClient);
    String a = "a"; // String | 测试人员测试
    try {
      AlipayOpenOperationOpenbizmockCloselyrzoneQueryResponseModel result = apiInstance.query(a);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationApi#query");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **a** | **String**| 测试人员测试 | |

### Return type

[**AlipayOpenOperationOpenbizmockCloselyrzoneQueryResponseModel**](AlipayOpenOperationOpenbizmockCloselyrzoneQueryResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

<a name="query_0"></a>
# **query_0**
> AlipayOpenOperationOpenbizmockEncrydataQueryResponseModel query_0(alipayOpenOperationOpenbizmockEncrydataQueryModel)

测试专用_此接口类型为强制加密接口

测试专用_此接口类型为强制加密接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.models.*;
import com.alipay.v3.api.OperationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");

    OperationApi apiInstance = new OperationApi(defaultClient);
    AlipayOpenOperationOpenbizmockEncrydataQueryModel alipayOpenOperationOpenbizmockEncrydataQueryModel = new AlipayOpenOperationOpenbizmockEncrydataQueryModel(); // AlipayOpenOperationOpenbizmockEncrydataQueryModel | 
    try {
      AlipayOpenOperationOpenbizmockEncrydataQueryResponseModel result = apiInstance.query_0(alipayOpenOperationOpenbizmockEncrydataQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationApi#query_0");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alipayOpenOperationOpenbizmockEncrydataQueryModel** | [**AlipayOpenOperationOpenbizmockEncrydataQueryModel**](AlipayOpenOperationOpenbizmockEncrydataQueryModel.md)|  | [optional] |

### Return type

[**AlipayOpenOperationOpenbizmockEncrydataQueryResponseModel**](AlipayOpenOperationOpenbizmockEncrydataQueryResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

<a name="query_1"></a>
# **query_1**
> AlipayOpenOperationOpenbizmockGzoneQueryResponseModel query_1(a, aOpenid)

V3网关测试gzone转发

V3网关测试gzone转发

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.models.*;
import com.alipay.v3.api.OperationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");

    OperationApi apiInstance = new OperationApi(defaultClient);
    String a = "a"; // String | 测试
    String aOpenid = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | 测试
    try {
      AlipayOpenOperationOpenbizmockGzoneQueryResponseModel result = apiInstance.query_1(a, aOpenid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationApi#query_1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **a** | **String**| 测试 | |
| **aOpenid** | **String**| 测试 | |

### Return type

[**AlipayOpenOperationOpenbizmockGzoneQueryResponseModel**](AlipayOpenOperationOpenbizmockGzoneQueryResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

<a name="query_2"></a>
# **query_2**
> AlipayOpenOperationOpenbizmockOpenidtestingQueryResponseModel query_2(userId, openId, testJson, alipayOpenOperationOpenbizmockOpenidtestingQueryModel)

网关测试接口openid升级测试

openid升级功能测试

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.models.*;
import com.alipay.v3.api.OperationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");

    OperationApi apiInstance = new OperationApi(defaultClient);
    String userId = "2088xx"; // String | uid
    String openId = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5"; // String | uid
    String testJson = "{}"; // String | 测试循环嵌套含有json数组和对象
    AlipayOpenOperationOpenbizmockOpenidtestingQueryModel alipayOpenOperationOpenbizmockOpenidtestingQueryModel = new AlipayOpenOperationOpenbizmockOpenidtestingQueryModel(); // AlipayOpenOperationOpenbizmockOpenidtestingQueryModel | 
    try {
      AlipayOpenOperationOpenbizmockOpenidtestingQueryResponseModel result = apiInstance.query_2(userId, openId, testJson, alipayOpenOperationOpenbizmockOpenidtestingQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationApi#query_2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| uid | |
| **openId** | **String**| uid | |
| **testJson** | **String**| 测试循环嵌套含有json数组和对象 | [optional] |
| **alipayOpenOperationOpenbizmockOpenidtestingQueryModel** | [**AlipayOpenOperationOpenbizmockOpenidtestingQueryModel**](AlipayOpenOperationOpenbizmockOpenidtestingQueryModel.md)|  | [optional] |

### Return type

[**AlipayOpenOperationOpenbizmockOpenidtestingQueryResponseModel**](AlipayOpenOperationOpenbizmockOpenidtestingQueryResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

<a name="query_3"></a>
# **query_3**
> AlipayOpenOperationOpenbizmockRzoneQueryResponseModel query_3(uid, lalalaOpenid, testJson, testJsonOpenid, hahaha, hahahaOpenid)

测试openapi路由

测试openapi路由rzone_uid的规则

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.models.*;
import com.alipay.v3.api.OperationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");

    OperationApi apiInstance = new OperationApi(defaultClient);
    String uid = "2088003194644606"; // String | 测试专用
    String lalalaOpenid = "xxxxxscddcd"; // String | 测试专用
    String testJson = "{\"name\":\"test_id\",\"buyer_id\":\"2088003194644606\",\"bbb\":{\"seller_id\":\"2088003194644670\",\"name\":\"zhenchen\"},\"ccc\":\"{\\\"name\\\": \\\"maise\\\", \\\"cid\\\": \\\"2088003194644699\\\"}\"}"; // String | 测试专用
    String testJsonOpenid = "{}"; // String | 测试专用
    String hahaha = "20883245"; // String | 测试
    String hahahaOpenid = "{}"; // String | 测试
    try {
      AlipayOpenOperationOpenbizmockRzoneQueryResponseModel result = apiInstance.query_3(uid, lalalaOpenid, testJson, testJsonOpenid, hahaha, hahahaOpenid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationApi#query_3");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uid** | **String**| 测试专用 | |
| **lalalaOpenid** | **String**| 测试专用 | |
| **testJson** | **String**| 测试专用 | [optional] |
| **testJsonOpenid** | **String**| 测试专用 | [optional] |
| **hahaha** | **String**| 测试 | [optional] |
| **hahahaOpenid** | **String**| 测试 | [optional] |

### Return type

[**AlipayOpenOperationOpenbizmockRzoneQueryResponseModel**](AlipayOpenOperationOpenbizmockRzoneQueryResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

<a name="query_4"></a>
# **query_4**
> AlipayOpenOperationOpenbizmockRzonegroovyQueryResponseModel query_4(alipayOpenOperationOpenbizmockRzonegroovyQueryModel)

测试路由转发groovy脚本

测试路由转发groovy脚本

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.models.*;
import com.alipay.v3.api.OperationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");

    OperationApi apiInstance = new OperationApi(defaultClient);
    AlipayOpenOperationOpenbizmockRzonegroovyQueryModel alipayOpenOperationOpenbizmockRzonegroovyQueryModel = new AlipayOpenOperationOpenbizmockRzonegroovyQueryModel(); // AlipayOpenOperationOpenbizmockRzonegroovyQueryModel | 
    try {
      AlipayOpenOperationOpenbizmockRzonegroovyQueryResponseModel result = apiInstance.query_4(alipayOpenOperationOpenbizmockRzonegroovyQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationApi#query_4");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alipayOpenOperationOpenbizmockRzonegroovyQueryModel** | [**AlipayOpenOperationOpenbizmockRzonegroovyQueryModel**](AlipayOpenOperationOpenbizmockRzonegroovyQueryModel.md)|  | [optional] |

### Return type

[**AlipayOpenOperationOpenbizmockRzonegroovyQueryResponseModel**](AlipayOpenOperationOpenbizmockRzonegroovyQueryResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

<a name="query_5"></a>
# **query_5**
> AlipayOpenOperationOpenbizmockTestcertificateQueryResponseModel query_5(keykey)

测试专用此接口为强制走证书的接口

测试专用此接口为强制走证书的接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.models.*;
import com.alipay.v3.api.OperationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");

    OperationApi apiInstance = new OperationApi(defaultClient);
    String keykey = "hahahaha"; // String | ceshi
    try {
      AlipayOpenOperationOpenbizmockTestcertificateQueryResponseModel result = apiInstance.query_5(keykey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationApi#query_5");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keykey** | **String**| ceshi | |

### Return type

[**AlipayOpenOperationOpenbizmockTestcertificateQueryResponseModel**](AlipayOpenOperationOpenbizmockTestcertificateQueryResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

<a name="query_6"></a>
# **query_6**
> AlipayOpenOperationOpenbizmockTesterrorcodeQueryResponseModel query_6(key, keykey)

测试错误码验证接口

测试错误码验证接口

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.models.*;
import com.alipay.v3.api.OperationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");

    OperationApi apiInstance = new OperationApi(defaultClient);
    String key = "exist_error"; // String | 测试
    String keykey = "no_exist_error"; // String | 测试
    try {
      AlipayOpenOperationOpenbizmockTesterrorcodeQueryResponseModel result = apiInstance.query_6(key, keykey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationApi#query_6");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **key** | **String**| 测试 | |
| **keykey** | **String**| 测试 | |

### Return type

[**AlipayOpenOperationOpenbizmockTesterrorcodeQueryResponseModel**](AlipayOpenOperationOpenbizmockTesterrorcodeQueryResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

<a name="query_7"></a>
# **query_7**
> AlipayOpenOperationOpenbizmockTestpathkeyQueryResponseModel query_7(keykey, a, c, b, alipayOpenOperationOpenbizmockTestpathkeyQueryModel)

测试网关协议3.0key和path

测试网关协议3.0key和path

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.models.*;
import com.alipay.v3.api.OperationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");

    OperationApi apiInstance = new OperationApi(defaultClient);
    String keykey = "keykey"; // String | ceshi
    String a = "a"; // String | 测试
    String c = "c"; // String | 测试
    String b = "b"; // String | ceshi
    AlipayOpenOperationOpenbizmockTestpathkeyQueryModel alipayOpenOperationOpenbizmockTestpathkeyQueryModel = new AlipayOpenOperationOpenbizmockTestpathkeyQueryModel(); // AlipayOpenOperationOpenbizmockTestpathkeyQueryModel | 
    try {
      AlipayOpenOperationOpenbizmockTestpathkeyQueryResponseModel result = apiInstance.query_7(keykey, a, c, b, alipayOpenOperationOpenbizmockTestpathkeyQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationApi#query_7");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keykey** | **String**| ceshi | |
| **a** | **String**| 测试 | |
| **c** | **String**| 测试 | |
| **b** | **String**| ceshi | [optional] |
| **alipayOpenOperationOpenbizmockTestpathkeyQueryModel** | [**AlipayOpenOperationOpenbizmockTestpathkeyQueryModel**](AlipayOpenOperationOpenbizmockTestpathkeyQueryModel.md)|  | [optional] |

### Return type

[**AlipayOpenOperationOpenbizmockTestpathkeyQueryResponseModel**](AlipayOpenOperationOpenbizmockTestpathkeyQueryResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

