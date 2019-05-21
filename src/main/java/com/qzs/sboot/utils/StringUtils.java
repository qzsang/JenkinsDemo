package com.qzs.sboot.utils;

import com.sun.istack.internal.Nullable;

public class StringUtils {

    public static boolean isEmpty(@Nullable CharSequence str) {
        return str == null || str.length() == 0;
    }
}
