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

import org.junit.jupiter.api.Test;

import java.util.Collections;

public class PageTest {

    @Test
    public void testSortField() {
        SortField sortField = SortField.builder()
                .asc(false)
                .column("name")
                .build();

        assert sortField.getColumn().equals("name");
        assert !sortField.isAsc();
    }

    @Test
    public void testPagination() {
        UserSearch userSearch = UserSearch.builder()
                .name("Zen Gershon")
                .email("aiilary@163.com")
                .pageIndex(1)
                .pageSize(5)
                .sortFields(
                        Collections.singletonList(SortField.builder()
                                .asc(false)
                                .column("name")
                                .build())
                )
                .build();

        assert userSearch.getEmail().equals("aiilary@163.com");
        assert userSearch.getName().contains("Gershon");
        assert userSearch.getPageIndex() == 1;
        assert userSearch.getPageSize() == 5;
        assert userSearch.getSortFields().size() == 1;
    }
}
