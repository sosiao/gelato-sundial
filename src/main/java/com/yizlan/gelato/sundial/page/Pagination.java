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
import java.util.List;

/**
 * Pagination class is responsible for handling pagination and sorting parameters.
 *
 * @author Zen Gershon
 * @see Builder
 * @since 1.0
 */
public class Pagination implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Page number
     */
    private Integer pageIndex = 0;

    /**
     * Page capacity
     */
    private Integer pageSize = 10;

    /**
     * Sort fields
     */
    private List<SortField> sortFields;

    protected Pagination() {
        // to do nothing
    }

    public Pagination(PaginationBuilder<?, ?> paginationBuilder) {
        this.pageIndex = paginationBuilder.pageIndex;
        this.pageSize = paginationBuilder.pageSize;
        this.sortFields = paginationBuilder.sortFields;
    }

    public static PaginationBuilder<?, ?> builder() {
        return new PaginationBuilderImpl();
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<SortField> getSortFields() {
        return sortFields;
    }

    public void setSortFields(List<SortField> sortFields) {
        this.sortFields = sortFields;
    }

    private static final class PaginationBuilderImpl extends PaginationBuilder<Pagination, PaginationBuilderImpl> {

        private PaginationBuilderImpl() {
            // to do nothing
        }

        @Override
        protected PaginationBuilderImpl self() {
            return this;
        }

        @Override
        public Pagination build() {
            return new Pagination(this);
        }
    }

    public abstract static class PaginationBuilder<T extends Pagination,
            R extends PaginationBuilder<T, R>> implements Builder<T> {

        private Integer pageIndex;

        private Integer pageSize;

        private List<SortField> sortFields;

        public R pageIndex(final Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this.self();
        }

        public R pageSize(final Integer pageSize) {
            this.pageSize = pageSize;
            return this.self();
        }

        public R sortFields(final List<SortField> sortFields) {
            this.sortFields = sortFields;
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
