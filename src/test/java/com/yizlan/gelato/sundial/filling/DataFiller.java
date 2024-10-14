/*
 * Copyright (C) 2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yizlan.gelato.sundial.filling;

import com.yizlan.gelato.sundial.complex.BiBaseExtractor;
import com.yizlan.gelato.sundial.complex.BinaryBaseExtractor;

import java.util.Date;

public class DataFiller implements BiBaseFiller<String, Date,String, Date>, BinaryBaseFiller<String, Date> {

    @Override
    public <R extends BiBaseExtractor<String, Date, String, Date>> R populate(R target) {
        target.setCreateBy("createBy1");
        target.setUpdateBy("updateBy1");
        target.setCreateTime(new Date());
        target.setUpdateTime(new Date());
        return target;
    }

    @Override
    public <R extends BinaryBaseExtractor<String, Date>> R populate(R target) {
        target.setCreateBy("createBy2");
        target.setUpdateBy("updateBy2");
        target.setCreateTime(new Date());
        target.setUpdateTime(new Date());
        return target;
    }
}
