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

import java.io.Serializable;

/**
 * Provides accessors for the creation time.
 * It allows for retrieving and setting the creation time of an entity.
 *
 * @param <T> A comparable and serializable type used for the creation time.
 * @author Zen Gershon
 * @since 1.1
 */
public interface CreateTimeAccessor<T extends Comparable<? super T> & Serializable> {

    /**
     * Retrieves the creation time.
     *
     * @return The creation time of the required type.
     */
    T getCreateTime();

    /**
     * Assigns the creation time.
     *
     * @param createTime The T-type parameter used to set the creation time.
     */
    void setCreateTime(T createTime);

}
