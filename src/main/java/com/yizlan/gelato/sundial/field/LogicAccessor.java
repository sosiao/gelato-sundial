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
 * Provides accessors for the logic delete.
 * It allows for retrieving and setting the logic delete field of an entity.
 *
 * @param <T> A comparable and serializable type used for the logic delete field.
 * @author Zen Gershon
 * @since 1.1
 */
public interface LogicAccessor<T extends Comparable<T> & Serializable> {

    /**
     * Gets the value of the logic delete.
     *
     * @return The value of the logic delete field.
     */
    T getDeleted();

    /**
     * Sets the value of the logic delete.
     *
     * @param deleted The value to set for the logic delete field.
     */
    void setDeleted(T deleted);

}
