package com.startapp;

import com.google.android.gms.common.api.Api;
import com.startapp.common.parser.TypeParser;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f4 implements TypeParser<int[][]> {
    @Override // com.startapp.common.parser.TypeParser
    public final int[][] parse(Class<int[][]> cls, Object obj) {
        if (obj instanceof Number) {
            return new int[][]{new int[]{((Number) obj).intValue(), Api.BaseClientBuilder.API_PRIORITY_OTHER}};
        }
        if (obj instanceof String) {
            String str = (String) obj;
            WeakHashMap weakHashMap = o9.f22359a;
            if (str != null) {
                try {
                    return o9.d(str);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }
}
