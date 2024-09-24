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
 * Provides accessors for the version field.
 * It allows for retrieving and setting the version field of an entity.
 *
 * @param <T> A comparable and serializable type used for the version field.
 * @author Zen Gershon
 * @since 1.1
 */
public interface VersionAccessor<T extends Comparable<T> & Serializable> {

    /**
     * Get version
     *
     * @return version
     */
    T getVersion();

    /**
     * Set version
     * @param version version
     */
    void setVersion(T version);

}