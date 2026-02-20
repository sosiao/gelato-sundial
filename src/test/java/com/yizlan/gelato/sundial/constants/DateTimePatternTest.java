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

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePatternTest {

    @Test
    public void testDateTimeFormat() {
        LocalDateTime localDateTime = LocalDateTime.of(
                2026, 1, 19, 21, 30, 0, 123000000
        );

        ZonedDateTime zonedDateTime = ZonedDateTime.of(
                2026, 1, 19, 21, 30, 0, 123000000,
                ZoneId.of("Asia/Shanghai")
        );

        assert "2026".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_YEAR)));
        assert "202601".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_YEAR_MONTH_BASIC)));
        assert "20260119".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_DATE_BASIC)));
        assert "2026-01".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_YEAR_MONTH_LOCAL)));
        assert "2026-01-19".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_DATE_LOCAL)));
        assert "2026-01-19+08:00".equals(zonedDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_DATE_LOCAL_OFFSET)));
        assert "213000".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_TIME_BASIC)));
        assert "21:30:00".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_TIME_LOCAL)));
        assert "21:30:00+08:00".equals(zonedDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_TIME_LOCAL_OFFSET)));
        assert "213000123".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_TIME_MS_BASIC)));
        assert "21:30:00.123".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_TIME_MS_LOCAL)));
        assert "21:30:00.123+08:00".equals(zonedDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_TIME_MS_LOCAL_OFFSET)));
        assert "20260119T213000".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_DATE_TIME_BASIC)));
        assert "2026-01-19T21:30:00".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_DATE_TIME_LOCAL)));
        assert "2026-01-19T21:30:00 Asia/Shanghai".equals(zonedDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_DATE_TIME_LOCAL_ZONED)));
        assert "2026-01-19T21:30:00+08:00".equals(zonedDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_DATE_TIME_LOCAL_OFFSET)));
        assert "20260119T213000123".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_DATE_TIME_MS_BASIC)));
        assert "2026-01-19T21:30:00.123".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_DATE_TIME_MS_LOCAL)));
        assert "2026-01-19T21:30:00.123+08:00".equals(zonedDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_DATE_TIME_MS_LOCAL_OFFSET)));
        assert "20260119T213000Z".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_DATE_TIME_UTC_BASIC)));
        assert "2026-01-19T21:30:00Z".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_DATE_TIME_UTC_LOCAL)));
        assert "20260119T213000123Z".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_DATE_TIME_MS_UTC_BASIC)));
        assert "2026-01-19T21:30:00.123Z".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_DATE_TIME_MS_UTC_LOCAL)));
        assert "2026-019".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_ORDINAL_DAY)));
        assert "2026-W04".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_YEAR_WEEK)));
        assert "2026-W04-2".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.ISO_YEAR_WEEK_ORDINAL_DAY)));
        assert "星期一, 19 一月 2026 21:30:00 CST".equals(zonedDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.RFC_1123_DATE_TIME)));
        assert "2026-01-19 21:30:00".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.LIVING_DATE_TIME)));
        assert "2026-01-19 21:30:00.123".equals(localDateTime.format(DateTimeFormatter.ofPattern(DateTimePattern.LIVING_DATE_TIME_MS)));
    }
}
