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
 * ***
 *
 * @author Hoipang
 * @since 1.4.0
 */
public interface DateTimePatterns {

    /* ========== Chinese Formats ========== */
    String CN_DATE = "yyyy年MM月dd日";
    String CN_MONTH = "yyyy年MM月";
    String CN_MONTH_DAY = "MM月dd日";
    String CN_DATE_H = "yyyy年MM月dd日HH时";
    String CN_DATE_HM = "yyyy年MM月dd日HH时mm分";
    String CN_DATE_HMS = "yyyy年MM月dd日 HH:mm:ss";
    String CN_DATE_HMS_MS = "yyyy年MM月dd日 HH:mm:ss.SSS";
    String CN_MONTH_DAY_HMS = "MM月dd日 HH:mm:ss";
    String CN_MONTH_DAY_HM = "MM月dd日 HH:mm";

    /* ========== ISO Standard Formats ========== */
    String ISO_DATE = "yyyy-MM-dd";
    String ISO_MONTH = "yyyy-MM";
    String ISO_MONTH_DAY = "MM-dd";
    String ISO_DATE_H = "yyyy-MM-dd HH";
    String ISO_DATE_HM = "yyyy-MM-dd HH:mm";
    String ISO_DATE_HMS = "yyyy-MM-dd HH:mm:ss";
    String ISO_DATE_HMS_MS = "yyyy-MM-dd HH:mm:ss.SSS";
    String ISO_MONTH_DAY_HMS = "MM-dd HH:mm:ss";
    String ISO_MONTH_DAY_HM = "MM-dd HH:mm";

    /* ========== Dot Separator ========== */
    String DOT_DATE = "yyyy.MM.dd";
    String DOT_MONTH = "yyyy.MM";
    String DOT_MONTH_DAY = "MM.dd";
    String DOT_DATE_H = "yyyy.MM.dd HH";
    String DOT_DATE_HM = "yyyy.MM.dd HH:mm";
    String DOT_DATE_HMS = "yyyy.MM.dd HH:mm:ss";
    String DOT_DATE_HMS_MS = "yyyy.MM.dd HH:mm:ss.SSS";

    /* ========== Slash - International ========== */
    String SLASH_INTL_DATE = "dd/MM/yyyy";
    String SLASH_INTL_DATE_H = "dd/MM/yyyy HH";
    String SLASH_INTL_DATE_HM = "dd/MM/yyyy HH:mm";
    String SLASH_INTL_DATE_HMS = "dd/MM/yyyy HH:mm:ss";
    String SLASH_INTL_DATE_HMS_MS = "dd/MM/yyyy HH:mm:ss.SSS";

    /* ========== Slash - yyyy/MM/dd ========== */
    String SLASH_DATE = "yyyy/MM/dd";
    String SLASH_DATE_H = "yyyy/MM/dd HH";
    String SLASH_DATE_HM = "yyyy/MM/dd HH:mm";
    String SLASH_DATE_HMS = "yyyy/MM/dd HH:mm:ss";
    String SLASH_DATE_HMS_MS = "yyyy/MM/dd HH:mm:ss.SSS";

    /* ========== Two-digit Year ========== */
    String SLASH_INTL_SHORT_DATE = "dd/MM/yy";
    String SLASH_INTL_SHORT_DATE_H = "dd/MM/yy HH";
    String SLASH_INTL_SHORT_DATE_HM = "dd/MM/yy HH:mm";
    String SLASH_INTL_SHORT_DATE_HMS = "dd/MM/yy HH:mm:ss";
    String SLASH_INTL_SHORT_DATE_HMS_MS = "dd/MM/yy HH:mm:ss.SSS";

    /* ========== Compact Formats ========== */
    String COMPACT_YEAR = "yyyy";
    String COMPACT_MONTH = "yyyyMM";
    String COMPACT_DATE = "yyyyMMdd";
    String COMPACT_DATE_HH = "yyyyMMddHH";
    String COMPACT_DATE_HHMM = "yyyyMMddHHmm";
    String COMPACT_DATE_TIME = "yyyyMMddHHmmss";
    String COMPACT_DATE_TIME_MS = "yyyyMMddHHmmssSSS";

    String COMPACT_SHORT_YEAR = "yy";
    String COMPACT_SHORT_MONTH = "yyMM";
    String COMPACT_SHORT_DATE = "yyMMdd";
    String COMPACT_SHORT_DATE_TIME = "yyMMddHHmmss";

    String COMPACT_MMDD = "MMdd";
    String COMPACT_MMDDHHMM = "MMddHHmm";
    String COMPACT_MMDDHHMMSS = "MMddHHmmss";

    String COMPACT_HH = "HH";
    String COMPACT_HHMM = "HHmm";
    String COMPACT_HHMMSS = "HHmmss";
    String COMPACT_HHMMSS_MS = "HHmmssSSS";

    /* ========== Time Only ========== */
    String TIME_HM = "HH:mm";
    String TIME_HMS = "HH:mm:ss";
    String TIME_HMS_MS = "HH:mm:ss.SSS";
    String TIME_H = "HH";

    /* ========== 12-hour Clock ========== */
    String CN_DATE_12H = "yyyy年MM月dd日 ahh时mm分";
    String ISO_DATE_12H = "yyyy-MM-dd ahh:mm";
    String SLASH_DATE_12H = "yyyy/MM/dd ahh:mm";

    /* ========== With Timezone ========== */
    String ISO_DATE_TIME_ZONE = "yyyy-MM-dd HH:mm:ss XXX";
    String ISO_DATE_TIME_MS_ZONE = "yyyy-MM-dd HH:mm:ss.SSS XXX";
    // HTTP Date Format
    String RFC_1123 = "EEE, dd MMM yyyy HH:mm:ss z";


    String FILE_TIMESTAMP = "yyyyMMdd_HHmmss_SSS";
}
