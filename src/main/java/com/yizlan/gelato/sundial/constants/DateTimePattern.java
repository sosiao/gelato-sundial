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
 * date time pattern
 *
 * @author Hoipang
 * @since 1.4.0
 */
public interface DateTimePattern {

    /**
     * ISO date format: 2026
     */
    String ISO_YEAR = "yyyy";

    /**
     * ISO date format: 202601
     */
    String ISO_YEAR_MONTH_BASIC = "yyyyMM";

    /**
     * ISO date format: 20260119
     */
    String ISO_DATE_BASIC = "yyyyMMdd";

    /**
     * ISO date format: 2026-01
     */
    String ISO_YEAR_MONTH_LOCAL = "yyyy-MM";

    /**
     * ISO date format: 2026-01-19
     */
    String ISO_DATE_LOCAL = "yyyy-MM-dd";

    /**
     * ISO date format: 2026-01-19+08:00
     */
    String ISO_DATE_LOCAL_OFFSET = "yyyy-MM-ddXXX";

    /**
     * ISO date format: 213000
     */
    String ISO_TIME_BASIC = "HHmmss";

    /**
     * ISO date format: 21:30:00
     */
    String ISO_TIME_LOCAL = "HH:mm:ss";

    /**
     * ISO date format: 21:30:00+08:00
     */
    String ISO_TIME_LOCAL_OFFSET = "HH:mm:ssXXX";

    /**
     * ISO date format: 213000123
     */
    String ISO_TIME_MILLIS_BASIC = "HHmmssSSS";

    /**
     * ISO date format: 21:30:00.123
     */
    String ISO_TIME_MILLIS_LOCAL = "HH:mm:ss.SSS";

    /**
     * ISO date format: 21:30:00.123+08:00
     */
    String ISO_TIME_MILLIS_LOCAL_OFFSET = "HH:mm:ss.SSSXXX";

    /**
     * ISO date format: 20260119T213000
     */
    String ISO_DATE_TIME_BASIC = "yyyyMMdd'T'HHmmss";

    /**
     * ISO date format: 2026-01-19T21:30:00
     */
    String ISO_DATE_TIME_LOCAL = "yyyy-MM-dd'T'HH:mm:ss";

    /**
     * ISO date format: 2026-01-19T21:30:00 Asia/Shanghai
     */
    String ISO_DATE_TIME_LOCAL_ZONED = "yyyy-MM-dd'T'HH:mm:ss VV";

    /**
     * ISO date format: 2026-01-19T21:30:00+08:00
     */
    String ISO_DATE_TIME_LOCAL_OFFSET = "yyyy-MM-dd'T'HH:mm:ssXXX";

    /**
     * ISO date format: 20260119T213000123
     */
    String ISO_DATE_TIME_MILLIS_BASIC = "yyyyMMdd'T'HHmmssSSS";

    /**
     * ISO date format: 2026-01-19T21:30:00.123
     */
    String ISO_DATE_TIME_MILLIS_LOCAL = "yyyy-MM-dd'T'HH:mm:ss.SSS";

    /**
     * ISO date format: 2026-01-19T21:30:00.123+08:00
     */
    String ISO_DATE_TIME_MILLIS_LOCAL_OFFSET = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";

    /**
     * ISO date format: 20260119T213000Z
     */
    String ISO_DATE_TIME_UTC_BASIC = "yyyyMMdd'T'HHmmss'Z'";

    /**
     * ISO date format: 2026-01-19T21:30:00Z
     */
    String ISO_DATE_TIME_UTC_LOCAL = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    /**
     * ISO date format: 20260119T213000123Z
     */
    String ISO_DATE_TIME_MILLIS_UTC_BASIC = "yyyyMMdd'T'HHmmssSSS'Z'";

    /**
     * ISO date format: 2026-01-19T21:30:00.123Z
     */
    String ISO_DATE_TIME_MILLIS_UTC_LOCAL = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    /**
     * ISO date format: 2026-019
     */
    String ISO_ORDINAL_DAY = "yyyy-DDD";

    /**
     * ISO date format: 2026-W04
     */
    String ISO_YEAR_WEEK = "yyyy-'W'ww";

    /**
     * ISO date format: 2026-W04-2
     */
    String ISO_YEAR_WEEK_ORDINAL_DAY = "yyyy-'W'ww-e";

    /**
     * RFC date format: 星期一, 19 一月 2026 21:30:00 CST
     */
    String RFC_1123_DATE_TIME = "eee, dd MMM yyyy HH:mm:ss z";
}
