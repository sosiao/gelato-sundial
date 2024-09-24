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

package com.yizlan.gelato.sundial.field;

import com.yizlan.gelato.sundial.builder.Builder;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

public class BaseTime implements CreateTimeAccessor<Date>, UpdateTimeAccessor<LocalDateTime>, Serializable {
    private static final long serialVersionUID = 1L;

    private Date createTime;

    private LocalDateTime updateTime;

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "BaseTime{" +
                "createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public static BaseTimeBuilder builder() {
        return new BaseTimeBuilder();
    }

    public static class BaseTimeBuilder implements Builder<BaseTime> {

        private final BaseTime baseTime;

        public BaseTimeBuilder() {
            this.baseTime = new BaseTime();
        }

        public BaseTimeBuilder createTime(final Date createTime) {
            this.baseTime.createTime = createTime;
            return this;
        }

        public BaseTimeBuilder updateTime(final LocalDateTime updateTime) {
            this.baseTime.updateTime = updateTime;
            return this;
        }

        @Override
        public BaseTime build() {
            return this.baseTime;
        }
    }
}
