package com.appnext.core.ra.a;

import android.content.Context;
import android.os.Bundle;
import com.appnext.core.ra.services.a;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c {

    /* renamed from: com.appnext.core.ra.a.c$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] et;

        static {
            int[] iArr = new int[a.EnumC0158a.values().length];
            et = iArr;
            try {
                iArr[a.EnumC0158a.SendRA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                et[a.EnumC0158a.StoreRa.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                et[a.EnumC0158a.DownloadingConfig.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static b a(Context context, a.EnumC0158a enumC0158a, Bundle bundle) {
        int i10 = AnonymousClass1.et[enumC0158a.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return null;
                }
                return new a(context, bundle);
            }
            return new e(context, bundle);
        }
        return new d(context, bundle);
    }
}
