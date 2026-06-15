package com.startapp;

import com.startapp.common.parser.TypeParser;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a9 implements TypeParser<Long> {
    @Override // com.startapp.common.parser.TypeParser
    public final Long parse(Class<Long> cls, Object obj) {
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(o9.c((String) obj));
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }
}
