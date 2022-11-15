

# CommonErrorType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | [**CodeEnum**](#CodeEnum) | 错误码 |  |
|**links** | **String** | 解决方案链接 |  [optional] |
|**message** | **String** | 错误描述 |  |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| INVALID_PARAMETER | &quot;invalid-parameter&quot; |
| UPLOAD_FAIL | &quot;upload-fail&quot; |
| INVALID_FILE_EXTENSION | &quot;invalid-file-extension&quot; |
| INVALID_FILE_SIZE | &quot;invalid-file-size&quot; |
| FILE_CHECK_FAIL | &quot;file-check-fail&quot; |
| APP_CALL_LIMITED | &quot;app-call-limited&quot; |
| METHOD_CALL_LIMITED | &quot;method-call-limited&quot; |
| INSUFFICIENT_ISV_PERMISSIONS | &quot;insufficient-isv-permissions&quot; |
| ILLEGAL_CLIENT_IP | &quot;illegal-client-ip&quot; |
| INSUFFICIENT_USER_PERMISSIONS | &quot;insufficient-user-permissions&quot; |
| SELF_INVOKE_FORBIDDEN | &quot;self-invoke-forbidden&quot; |
| APP_AUTH_INVOKE_LIMIT | &quot;app-auth-invoke-limit&quot; |
| APP_API_PUNISHED | &quot;app-api-punished&quot; |
| MISSING_METHOD | &quot;missing-method&quot; |
| MISSING_PLATFORM | &quot;missing-platform&quot; |
| INVALID_PLATFORM | &quot;invalid-platform&quot; |
| INVALID_METHOD | &quot;invalid-method&quot; |
| FORBIDDEN_API | &quot;forbidden-api&quot; |
| INVALID_FORMAT | &quot;invalid-format&quot; |
| MISSING_SIGNATURE | &quot;missing-signature&quot; |
| MISSING_APP_ACCESS_TOKEN | &quot;missing-app-access-token&quot; |
| MISSING_SIGNATURE_TYPE | &quot;missing-signature-type&quot; |
| MISSING_DEFAULT_SIGNATURE_TYPE | &quot;missing-default-signature-type&quot; |
| MISSING_SIGNATURE_KEY | &quot;missing-signature-key&quot; |
| INVALID_SIGNATURE_TYPE | &quot;invalid-signature-type&quot; |
| INVALID_SIGNATURE_TYPE_SAID_INTERFACE | &quot;invalid-signature-type-said-interface&quot; |
| INVALID_SIGNATURE | &quot;invalid-signature&quot; |
| UNSUPPORTED_EXPIRED_APP_KEY_SIGN | &quot;unsupported-expired-app-key-sign&quot; |
| APP_KEY_SECURITY_RISK_APP_CERT_EXPIRED | &quot;app-key-security-risk, app-cert-expired&quot; |
| APP_CERT_NOT_EXIST | &quot;app-cert-not-exist&quot; |
| ALIPAY_CERT_NOT_EXIST | &quot;alipay-cert-not-exist&quot; |
| MISSING_APP_CERT_SN | &quot;missing-app-cert-sn&quot; |
| MISSING_ALIPAY_CERT_SN | &quot;missing-alipay-cert-sn&quot; |
| MISSING_ALIPAY_ROOT_CERT_SN | &quot;missing-alipay-root-cert-sn&quot; |
| INVALID_ALIPAY_ROOT_CERT_SN | &quot;invalid-alipay-root-cert-sn&quot; |
| INVALID_REQUEST_DATA | &quot;invalid-request-data&quot; |
| INVALID_RESPONSE_DATA | &quot;invalid-response-data&quot; |
| MISSING_ENCRYPT_TYPE | &quot;missing-encrypt-type&quot; |
| MISSING_ENCRYPT_KEY | &quot;missing-encrypt-key&quot; |
| INVALID_ENCRYPT_TYPE | &quot;invalid-encrypt-type&quot; |
| INVALID_ENCRYPT | &quot;invalid-encrypt&quot; |
| MISSING_SESSION | &quot;missing-session&quot; |
| MISSING_APP_ID | &quot;missing-app-id&quot; |
| INVALID_APP_ID | &quot;invalid-app-id&quot; |
| MISSING_TIMESTAMP | &quot;missing-timestamp&quot; |
| INVALID_TIMESTAMP | &quot;invalid-timestamp&quot; |
| ILLEGAL_TIMESTAMP | &quot;illegal-timestamp&quot; |
| MISSING_VERSION | &quot;missing-version&quot; |
| INVALID_VERSION | &quot;invalid-version&quot; |
| UNSUPPORTED_VERSION | &quot;unsupported-version&quot; |
| INVALID_ENCODING | &quot;invalid-encoding&quot; |
| INVALID_CHARSET | &quot;invalid-charset&quot; |
| INVALID_DIGEST_TYPE | &quot;invalid-digest-type&quot; |
| INVALID_DIGEST | &quot;invalid-digest&quot; |
| INVALID_APP_STATE | &quot;invalid-app-state&quot; |
| INVALID_SUBSCRIBE_RELATIONS | &quot;invalid-subscribe-relations&quot; |
| INVALID_AUTH_TOKEN | &quot;invalid-auth-token&quot; |
| AUTH_TOKEN_TIME_OUT | &quot;auth-token-time-out&quot; |
| INVALID_APP_AUTH_TOKEN | &quot;invalid-app-auth-token&quot; |
| INVALID_APP_AUTH_TOKEN_NO_API | &quot;invalid-app-auth-token-no-api&quot; |
| APP_AUTH_TOKEN_TIME_OUT | &quot;app-auth-token-time-out&quot; |
| NOT_SUPPORT_APP_AUTH | &quot;not-support-app-auth&quot; |
| ACCESS_DATA_TIME_OUT | &quot;access-data-time-out&quot; |
| UNSUPPORT_OPERATION | &quot;unsupport-operation&quot; |
| OPENID_ERROR | &quot;openid-error&quot; |
| UNKNOW_ERROR | &quot;unknow-error&quot; |
| INVALID_APP_METHOD | &quot;invalid-app-method&quot; |
| MISSING_APP_UID | &quot;missing-app-uid&quot; |
| ILLEGAL_JSON | &quot;illegal-json&quot; |
| ILLEGAL_CARD_NO | &quot;illegal-card-no&quot; |
| INVALID_PARTNERID | &quot;invalid-partnerid&quot; |
| NO_PRODUCT_REG_BY_PARTNER | &quot;no-product-reg-by-partner&quot; |
| DECRYPTION_ERROR | &quot;decryption-error&quot; |
| DECRYPTION_ERROR_MISSING_ENCRYPT_TYPE | &quot;decryption-error-missing-encrypt-type&quot; |
| DECRYPTION_ERROR_NOT_VALID_ENCRYPT_TYPE | &quot;decryption-error-not-valid-encrypt-type&quot; |
| DECRYPTION_ERROR_NOT_VALID_ENCRYPT_KEY | &quot;decryption-error-not-valid-encrypt-key&quot; |
| DECRYPTION_ERROR_UNKNOWN | &quot;decryption-error-unknown&quot; |
| MISSING_SIGNATURE_CONFIG | &quot;missing-signature-config&quot; |
| SEVICE_NOT_BEEN_SUBSCRIBED_TO | &quot;sevice-not-been-subscribed-to&quot; |
| UNKNOWN_SUB_CODE | &quot;unknown-sub-code&quot; |
| SUSPECTED_ATTACK | &quot;suspected-attack&quot; |
| INVALID_AUTH_RELATIONS | &quot;invalid-auth-relations&quot; |
| INVALID_PRODUCT | &quot;invalid-product&quot; |
| METHOD_FORBIDDEN_BATCH_INVOKE | &quot;method-forbidden-batch-invoke&quot; |
| EXIST_BLANK_SUB_REQUEST_ID | &quot;exist-blank-sub-request-id&quot; |
| EXIST_REPEATED_SUB_REQUEST_ID | &quot;exist-repeated-sub-request-id&quot; |
| INVALID_APP_AUTH_RELATIONS | &quot;invalid-app-auth-relations&quot; |
| APP_UNBIND_PARTNER | &quot;app-unbind-partner&quot; |
| APP_INVALID_OID | &quot;app-invalid-oid&quot; |
| EXCEED_API_BALANCE | &quot;exceed-api-balance&quot; |
| INNER_APP_NO_ACCESS | &quot;inner-app-no-access&quot; |
| INVALID_INNER_INVOKE_SCENE | &quot;invalid-inner-invoke-scene&quot; |
| INVALID_APP_API_FIELD_CONFIG | &quot;invalid-app-api-field-config&quot; |



