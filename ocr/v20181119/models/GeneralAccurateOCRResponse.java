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

public class GeneralAccurateOCRResponse extends AbstractModel {

    /**
     * 检测到的文本信息，具体内容请点击左侧链接。
     */
    @SerializedName("TextDetections")
    @Expose
    private TextDetection[] TextDetections;

    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取检测到的文本信息，具体内容请点击左侧链接。
     *
     * @return TextDetections 检测到的文本信息，具体内容请点击左侧链接。
     */
    public TextDetection[] getTextDetections() {
        return this.TextDetections;
    }

    /**
     * 设置检测到的文本信息，具体内容请点击左侧链接。
     *
     * @param TextDetections 检测到的文本信息，具体内容请点击左侧链接。
     */
    public void setTextDetections(TextDetection[] TextDetections) {
        this.TextDetections = TextDetections;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     *
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     *
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    @Override
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TextDetections.", this.TextDetections);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

