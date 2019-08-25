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

public class Coord  extends AbstractModel {

    /**
    * 横坐标
    */
    @SerializedName("X")
    @Expose
    private Integer X;

    /**
    * 纵坐标
    */
    @SerializedName("Y")
    @Expose
    private Integer Y;

    /**
     * 获取横坐标
     * @return X 横坐标
     */
    public Integer getX() {
        return this.X;
    }

    /**
     * 设置横坐标
     * @param X 横坐标
     */
    public void setX(Integer X) {
        this.X = X;
    }

    /**
     * 获取纵坐标
     * @return Y 纵坐标
     */
    public Integer getY() {
        return this.Y;
    }

    /**
     * 设置纵坐标
     * @param Y 纵坐标
     */
    public void setY(Integer Y) {
        this.Y = Y;
    }

    /**
     * 内部实现，用户禁止调用
     */
    @Override
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);

    }
}

