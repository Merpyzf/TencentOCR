/*
 * Copyright (c) 2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.merpyzf.common.helper.tencent_ocr.common;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

/**
 * api response类，用以格式化接收http response
 * @param <T> 具体对应的response类
 */
public class JsonResponseModel <T> {
	
	@SerializedName("Response")
	@Expose
    public T response;
}
