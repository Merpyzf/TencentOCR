/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.merpyzf.common.helper.tencent_ocr.ocr.v20181119.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.merpyzf.common.helper.tencent_ocr.common.AbstractModel;

import java.util.HashMap;

public class GeneralBasicOCRRequest extends AbstractModel {

    /**
     * 图片的 Base64 值。
     * 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
     * 支持的图片大小：所下载图片经Base64编码后不超过 3M。图片下载时间不超过 3 秒。
     * 图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
     * 图片的 Url 地址。
     * 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
     * 支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
     * 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
     * 保留字段。
     */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
     * 识别语言类型。
     * 支持自动识别语言类型，同时支持自选语言种类，默认中英文混合(zh)。
     * 可选值：
     * zh\auto\jap\kor\
     * spa\fre\ger\por\
     * vie\may\rus\ita\
     * hol\swe\fin\dan\
     * nor\hun\tha\lat
     * 可选值分别表示：
     * 中英文混合、自动识别、日语、韩语、
     * 西班牙语、法语、德语、葡萄牙语、
     * 越南语、马来语、俄语、意大利语、
     * 荷兰语、瑞典语、芬兰语、丹麦语、
     * 挪威语、匈牙利语、泰语、拉丁语系。
     */
    @SerializedName("LanguageType")
    @Expose
    private String LanguageType;

    /**
     * 获取图片的 Base64 值。
     * 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
     * 支持的图片大小：所下载图片经Base64编码后不超过 3M。图片下载时间不超过 3 秒。
     * 图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     *
     * @return ImageBase64 图片的 Base64 值。
     * 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
     * 支持的图片大小：所下载图片经Base64编码后不超过 3M。图片下载时间不超过 3 秒。
     * 图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * 设置图片的 Base64 值。
     * 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
     * 支持的图片大小：所下载图片经Base64编码后不超过 3M。图片下载时间不超过 3 秒。
     * 图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     *
     * @param ImageBase64 图片的 Base64 值。
     *                    支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
     *                    支持的图片大小：所下载图片经Base64编码后不超过 3M。图片下载时间不超过 3 秒。
     *                    图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * 获取图片的 Url 地址。
     * 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
     * 支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
     * 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     *
     * @return ImageUrl 图片的 Url 地址。
     * 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
     * 支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
     * 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * 设置图片的 Url 地址。
     * 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
     * 支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
     * 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     *
     * @param ImageUrl 图片的 Url 地址。
     *                 支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
     *                 支持的图片大小：所下载图片经 Base64 编码后不超过 3M。图片下载时间不超过 3 秒。
     *                 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
     *                 非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * 获取保留字段。
     *
     * @return Scene 保留字段。
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * 设置保留字段。
     *
     * @param Scene 保留字段。
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * 获取识别语言类型。
     * 支持自动识别语言类型，同时支持自选语言种类，默认中英文混合(zh)。
     * 可选值：
     * zh\auto\jap\kor\
     * spa\fre\ger\por\
     * vie\may\rus\ita\
     * hol\swe\fin\dan\
     * nor\hun\tha\lat
     * 可选值分别表示：
     * 中英文混合、自动识别、日语、韩语、
     * 西班牙语、法语、德语、葡萄牙语、
     * 越南语、马来语、俄语、意大利语、
     * 荷兰语、瑞典语、芬兰语、丹麦语、
     * 挪威语、匈牙利语、泰语、拉丁语系。
     *
     * @return LanguageType 识别语言类型。
     * 支持自动识别语言类型，同时支持自选语言种类，默认中英文混合(zh)。
     * 可选值：
     * zh\auto\jap\kor\
     * spa\fre\ger\por\
     * vie\may\rus\ita\
     * hol\swe\fin\dan\
     * nor\hun\tha\lat
     * 可选值分别表示：
     * 中英文混合、自动识别、日语、韩语、
     * 西班牙语、法语、德语、葡萄牙语、
     * 越南语、马来语、俄语、意大利语、
     * 荷兰语、瑞典语、芬兰语、丹麦语、
     * 挪威语、匈牙利语、泰语、拉丁语系。
     */
    public String getLanguageType() {
        return this.LanguageType;
    }

    /**
     * 设置识别语言类型。
     * 支持自动识别语言类型，同时支持自选语言种类，默认中英文混合(zh)。
     * 可选值：
     * zh\auto\jap\kor\
     * spa\fre\ger\por\
     * vie\may\rus\ita\
     * hol\swe\fin\dan\
     * nor\hun\tha\lat
     * 可选值分别表示：
     * 中英文混合、自动识别、日语、韩语、
     * 西班牙语、法语、德语、葡萄牙语、
     * 越南语、马来语、俄语、意大利语、
     * 荷兰语、瑞典语、芬兰语、丹麦语、
     * 挪威语、匈牙利语、泰语、拉丁语系。
     *
     * @param LanguageType 识别语言类型。
     *                     支持自动识别语言类型，同时支持自选语言种类，默认中英文混合(zh)。
     *                     可选值：
     *                     zh\auto\jap\kor\
     *                     spa\fre\ger\por\
     *                     vie\may\rus\ita\
     *                     hol\swe\fin\dan\
     *                     nor\hun\tha\lat
     *                     可选值分别表示：
     *                     中英文混合、自动识别、日语、韩语、
     *                     西班牙语、法语、德语、葡萄牙语、
     *                     越南语、马来语、俄语、意大利语、
     *                     荷兰语、瑞典语、芬兰语、丹麦语、
     *                     挪威语、匈牙利语、泰语、拉丁语系。
     */
    public void setLanguageType(String LanguageType) {
        this.LanguageType = LanguageType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    @Override
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "LanguageType", this.LanguageType);

    }
}

