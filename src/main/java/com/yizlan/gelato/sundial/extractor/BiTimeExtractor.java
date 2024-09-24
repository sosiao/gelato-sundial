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

package com.yizlan.gelato.sundial.extractor;

import com.yizlan.gelato.sundial.field.CreateTimeAccessor;
import com.yizlan.gelato.sundial.field.UpdateTimeAccessor;

import java.io.Serializable;

/**
 * Provides accessors for the creation time and update time.
 *
 * @param <T> the type of the creation time, should implement {@link Comparable} and {@link Serializable}
 * @param <U> the type of the update time, should implement {@link Comparable} and {@link Serializable}
 * @author Zen Gershon
 * @see CreateTimeAccessor
 * @see UpdateTimeAccessor
 * @since 1.1
 */
public interface BiTimeExtractor<T extends Comparable<? super T> & Serializable,
        U extends Comparable<? super U> & Serializable> extends CreateTimeAccessor<T>, UpdateTimeAccessor<U> {

}