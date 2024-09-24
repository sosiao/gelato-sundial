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

package com.yizlan.gelato.sundial.builder;

import java.io.Serializable;

/**
 * Builder pattern.
 * <p>
 * Used to construct objects of type T.
 * <p>
 * Note: In the version {@code 1.2.0}, this class will be moved to
 * the <code>com.yizlan.gelato.sundial.gof</code> package.
 *
 * @param <T> The type of object the builder will construct.
 * @author Zen Gershon
 * @since 1.0
 */
public interface Builder<T> extends Serializable {

    /**
     * build <code>T</code>
     *
     * @return T The constructed object
     */
    T build();

}
