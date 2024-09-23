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

/**
 * demo user search object
 *
 * @author Zen Gershon
 * @since 1.0
 */
public class UserSearch extends Pagination {

    private String name;

    private String email;

    public UserSearch() {
        super();
    }

    public UserSearch(UserSearchBuilder<?, ?> userSearchBuilder) {
        super(userSearchBuilder);
        this.name = userSearchBuilder.name;
        this.email = userSearchBuilder.email;
    }

    public static UserSearchBuilder<?, ?> builder() {
        return new UserSearchBuilderImpl();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private static final class UserSearchBuilderImpl extends UserSearchBuilder<UserSearch, UserSearchBuilderImpl> {

        private UserSearchBuilderImpl() {
            // to do nothing
        }

        @Override
        protected UserSearchBuilderImpl self() {
            return this;
        }

        @Override
        public UserSearch build() {
            return new UserSearch(this);
        }
    }


    public abstract static class UserSearchBuilder<T extends UserSearch,
            R extends UserSearchBuilder<T, R>> extends PaginationBuilder<T, R> {

        private String name;

        private String email;

        public R name(final String name) {
            this.name = name;
            return this.self();
        }

        public R email(final String email) {
            this.email = email;
            return this.self();
        }
    }
}
