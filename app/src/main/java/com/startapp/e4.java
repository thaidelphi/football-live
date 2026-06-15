package com.startapp;

import com.startapp.common.parser.TypeParser;
import java.util.WeakHashMap;
import org.json.JSONArray;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e4 implements TypeParser<int[]> {
    @Override // com.startapp.common.parser.TypeParser
    public final int[] parse(Class<int[]> cls, Object obj) {
        int[] iArr;
        int parseInt;
        if (obj instanceof Number) {
            return new int[]{((Number) obj).intValue()};
        }
        if (obj instanceof String) {
            WeakHashMap weakHashMap = o9.f22359a;
            String[] split = ((String) obj).split(",");
            int length = split.length;
            iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    iArr[i10] = Integer.parseInt(split[i10].trim());
                } catch (NumberFormatException unused) {
                }
            }
        } else {
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = new JSONArray();
                int length2 = jSONArray.length();
                iArr = new int[length2];
                for (int i11 = 0; i11 < length2; i11++) {
                    Object opt = jSONArray.opt(i11);
                    if (opt instanceof Number) {
                        iArr[i11] = ((Number) opt).intValue();
                    } else if (opt instanceof String) {
                        String str = (String) opt;
                        WeakHashMap weakHashMap2 = o9.f22359a;
                        if (str != null) {
                            try {
                                parseInt = Integer.parseInt(str);
                            } catch (NumberFormatException unused2) {
                            }
                            iArr[i11] = parseInt;
                        }
                        parseInt = 0;
                        iArr[i11] = parseInt;
                    }
                }
            }
            return null;
        }
        return iArr;
    }
}
