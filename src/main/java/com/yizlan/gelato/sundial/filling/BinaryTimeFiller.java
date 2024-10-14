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

import com.yizlan.gelato.sundial.complex.BinaryTimeExtractor;

import java.io.Serializable;

/**
 * Fill fields of the target object.
 *
 * @param <T> the type of fields that contains the creation time and the update time with the same type,
 *            should implement {@link Comparable} and {@link Serializable}
 * @author Zen Gershon
 * @since 1.0
 */
public interface BinaryTimeFiller<T extends Comparable<? super T> & Serializable> {

    /**
     * Populates the creation time and the update time with the same type
     *
     * @param target the target object to be populated
     * @param <R>    the type of the target object, should extends {@link BinaryTimeExtractor}
     * @return the target object
     */
    <R extends BinaryTimeExtractor<T>> R populate(R target);

}
