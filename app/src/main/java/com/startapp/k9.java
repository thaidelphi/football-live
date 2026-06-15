package com.startapp;

import com.startapp.common.parser.TypeParser;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k9 implements TypeParser<Double> {
    @Override // com.startapp.common.parser.TypeParser
    public final Double parse(Class<Double> cls, Object obj) {
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return Double.valueOf(Boolean.TRUE.equals(obj) ? 1.0d : 0.0d);
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (Throwable unused) {
            }
        }
        return Double.valueOf(0.0d);
    }
}
