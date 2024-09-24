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
 * Provides accessors for the update time.
 * It allows for retrieving and setting the update time of an entity.
 *
 * @param <T> A comparable and serializable type used for the update time.
 * @author Zen Gershon
 * @since 1.1
 */
public interface UpdateTimeAccessor<T extends Comparable<? super T> & Serializable> {

    /**
     * Retrieves the update time.
     *
     * @return The update time of the required type.
     */
    T getUpdateTime();

    /**
     * Assigns the update time.
     *
     * @param updateTime The T-type parameter used to set the update time.
     */
    void setUpdateTime(T updateTime);

}
