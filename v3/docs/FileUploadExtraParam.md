

# FileUploadExtraParam


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externUpload** | **String** | 是否同步上传到其他平台。素材类型为视频且需要同步优酷，请必传入参数youku，素材接口将代上传到优酷账号；素材类型为图片，无需传入参数 |  [optional] |
|**fileEncryptType** | **String** | 文件加密类型，可选值：NO_ENCRYPT（不加密），CLIENT_DECRYPT（afts服务器加密，客户端解密），AFTS_SERVER（afts服务器端自动加解密），OSS_DECRYPT（使用oss存储加解密），AFTS_SERVER_STANDRAD（afts服务器自动加解密标准版，与AFTS_SERVER的差别在于秘钥使用方式不同） |  [optional] |



