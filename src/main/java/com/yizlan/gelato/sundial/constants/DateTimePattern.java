/*
 * Copyright (C) 2026 the original author or authors.
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

package com.yizlan.gelato.sundial.constants;

/**
 * 时间格式
 *
 * @author Hoipang
 * @since 1.4.0
 */
public interface DateTimePattern {

    /**
     * ISO date format: 20260119
     */
    String ISO_DATE_BASIC = "yyyyMMdd";

    /**
     * ISO date format: 2026-01-19
     */
    String ISO_DATE_LOCAL = "yyyy-MM-dd";

    /**
     * ISO date format: 2026-01-19+08:00
     */
    String ISO_DATE_OFFSET = "yyyy-MM-ddXXX";

    /**
     * ISO date format: 21:30:00
     */
    String ISO_TIME_BASIC = "HH:mm:ss";

    /**
     * ISO date format: 21:30:00+08:00
     */
    String ISO_TIME_OFFSET = "HH:mm:ssXXX";

    /**
     * ISO date format: 21:30:00.123
     */
    String ISO_TIME_MILLIS = "HH:mm:ss.SSS";

    /**
     * ISO date format: 21:30:00.123+08:00
     */
    String ISO_TIME_MILLIS_OFFSET = "HH:mm:ss.SSSXXX";

    /**
     * ISO date format: 2026-01-19T21:30:00
     */
    String ISO_DATE_TIME_BASIC = "yyyy-MM-dd'T'HH:mm:ss";

    /**
     * ISO date format: 2026-01-19T21:30:00
     */
    String ISO_DATE_TIME_ZONED = "yyyy-MM-dd'T'HH:mm:ss VV";

    /**
     * ISO date format: 2026-01-19T21:30:00+08:00
     */
    String ISO_DATE_TIME_OFFSET = "yyyy-MM-dd'T'HH:mm:ssXXX";

    /**
     * ISO date format: 2026-01-19T21:30:00.123
     */
    String ISO_DATE_TIME_MILLIS = "yyyy-MM-dd'T'HH:mm:ss.SSS";

    /**
     * ISO date format: 2026-01-19T21:30:00.123+08:00
     */
    String ISO_DATE_TIME_MILLIS_OFFSET = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";

    /**
     * ISO date format: 2026-01-19T21:30:00Z
     */
    String ISO_DATE_TIME_UTC = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    /**
     * ISO date format: 2026-01-19T21:30:00.123Z
     */
    String ISO_DATE_TIME_MILLIS_UTC = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    /**
     * ISO date format: 2026-19
     */
    String ISO_ORDINAL_DATE = "yyyy-D";

    /**
     * ISO date format: 2026-W03-1
     */
    String ISO_WEEK_DATE = "yyyy-'W'ww-e";

    /**
     * RFC date format: Mon, 19 Jan 2026 21:30:00 GMT
     */
    String RFC_1123_DATE_TIME = "EEE, dd MMM yyyy HH:mm:ss z";
}
