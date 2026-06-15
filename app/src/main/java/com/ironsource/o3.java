package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class o3 implements p3 {

    /* renamed from: a  reason: collision with root package name */
    private final IronSource.AD_UNIT f19497a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19498a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19498a = iArr;
        }
    }

    public o3(IronSource.AD_UNIT adFormat) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        this.f19497a = adFormat;
    }

    @Override // com.ironsource.p3
    public q3 a(l3 eventBaseData) {
        kotlin.jvm.internal.n.f(eventBaseData, "eventBaseData");
        int i10 = a.f19498a[this.f19497a.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return new r6(eventBaseData);
                }
                throw new IllegalArgumentException("Unsupported ad format: " + this.f19497a);
            }
            return new xq(eventBaseData);
        }
        return new lj(eventBaseData);
    }
}
