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

package com.yizlan.gelato.sundial.page;

import com.yizlan.gelato.sundial.builder.Builder;

import java.io.Serializable;

/**
 * Sort field class，used to represent the sorting rules of database columns in queries.
 *
 * @author Zen Gershon
 * @since 1.0
 */
public class SortField implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Bb column.
     * Represents the specific column name in the database table that needs to be sorted.
     */
    private String column;

    /**
     * Order flag，default: {@code true}
     * Indicates the sorting method: if {@code true}，sort in ascending order; otherwise {@code false}，sort in
     * descending order.
     */
    private boolean asc = true;

    protected SortField() {
        // to do nothing
    }

    public SortField(SortFieldBuilder<?, ?> sortFieldBuilder) {
        this.column = sortFieldBuilder.column;
        this.asc = sortFieldBuilder.asc;
    }

    public static SortFieldBuilder<?, ?> builder() {
        return new SortFieldBuilderImpl();
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public boolean isAsc() {
        return asc;
    }

    public void setAsc(boolean asc) {
        this.asc = asc;
    }

    private static final class SortFieldBuilderImpl extends SortFieldBuilder<SortField, SortFieldBuilderImpl> {

        private SortFieldBuilderImpl() {
            // to do nothing
        }

        @Override
        protected SortFieldBuilderImpl self() {
            return this;
        }

        @Override
        public SortField build() {
            return new SortField(this);
        }
    }

    public abstract static class SortFieldBuilder<T extends SortField,
            R extends SortFieldBuilder<T, R>> implements Builder<T> {

        private String column;

        private boolean asc;

        public R column(final String column) {
            this.column = column;
            return this.self();
        }

        public R asc(final boolean asc) {
            this.asc = asc;
            return this.self();
        }

        /**
         * Returns the current builder instance.
         *
         * @return the current builder instance
         */
        protected abstract R self();
    }

}
