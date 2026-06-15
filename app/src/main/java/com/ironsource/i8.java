package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class i8 {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17816a;

        static {
            int[] iArr = new int[n8.values().length];
            try {
                iArr[n8.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n8.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n8.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17816a = iArr;
        }
    }

    public final int a(n8 cappingType) {
        kotlin.jvm.internal.n.f(cappingType, "cappingType");
        int i10 = a.f17816a[cappingType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        }
        if (i10 == 3) {
            return 3001;
        }
        throw new i8.l();
    }
}
