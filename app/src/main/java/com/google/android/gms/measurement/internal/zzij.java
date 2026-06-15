package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzij {
    public static String a(String str, String[] strArr, String[] strArr2) {
        Preconditions.m(strArr);
        Preconditions.m(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i10];
            }
        }
        return null;
    }

    public static String b(Context context, String str, String str2) {
        Preconditions.m(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = zzfq.a(context);
        }
        return zzfq.b("google_app_id", resources, str2);
    }
}
