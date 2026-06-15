package com.google.android.gms.ads.internal.util.client;

import android.os.Bundle;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzp {
    public static boolean zza(Bundle bundle, Bundle bundle2) {
        Object obj = bundle2;
        obj = bundle2;
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj2 = bundle.get(str);
                Object obj3 = bundle2.get(str);
                if (obj2 == null || obj3 == null) {
                    obj = obj3;
                    bundle = obj2;
                } else if (obj2 instanceof Bundle) {
                    if (!(obj3 instanceof Bundle) || !zza((Bundle) obj2, (Bundle) obj3)) {
                        return false;
                    }
                } else if (obj2.getClass().isArray()) {
                    int length = Array.getLength(obj2);
                    if (obj3.getClass().isArray() && length == Array.getLength(obj3)) {
                        for (int i10 = 0; i10 < length; i10++) {
                            if (!Objects.a(Array.get(obj2, i10), Array.get(obj3, i10))) {
                                return false;
                            }
                        }
                        continue;
                    } else {
                        return false;
                    }
                } else if (!obj2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && obj == null;
    }
}
