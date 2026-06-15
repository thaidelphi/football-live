package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MapUtils {
    @KeepForSdk
    public static void a(StringBuilder sb, HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z10 = true;
        for (String str : hashMap.keySet()) {
            if (!z10) {
                sb.append(",");
            }
            String str2 = hashMap.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z10 = false;
        }
        sb.append("}");
    }
}
