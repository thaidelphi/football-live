package com.ironsource;

import com.ironsource.fe;
import com.ironsource.mediationsdk.IronSource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class x2 {

    /* renamed from: a  reason: collision with root package name */
    public static final x2 f21353a = new x2();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21354a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f21354a = iArr;
        }
    }

    private x2() {
    }

    public static final fe.a a(IronSource.AD_UNIT adUnit) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        int i10 = a.f21354a[adUnit.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return fe.a.NATIVE_AD;
                    }
                    throw new i8.l();
                }
                return fe.a.BANNER;
            }
            return fe.a.INTERSTITIAL;
        }
        return fe.a.REWARDED_VIDEO;
    }
}
