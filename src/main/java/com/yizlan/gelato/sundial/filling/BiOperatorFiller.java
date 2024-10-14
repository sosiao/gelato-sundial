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

import com.yizlan.gelato.sundial.complex.BiOperatorExtractor;

import java.io.Serializable;

/**
 * Fill fields of the target object.
 *
 * @param <T> the type of the creator ID, should implement {@link Comparable} and {@link Serializable}
 * @param <U> the type of the updater ID, should implement {@link Comparable} and {@link Serializable}
 * @author Zen Gershon
 * @since 1.0
 */
public interface BiOperatorFiller<T extends Comparable<T> & Serializable, U extends Comparable<U> & Serializable> {

    /**
     * Populates the creator ID and the updater ID
     *
     * @param target the target object to be populated
     * @param <R>    the type of the target object, should extends {@link BiOperatorExtractor}
     * @return the target object
     */
    <R extends BiOperatorExtractor<T, U>> R populate(R target);

}
