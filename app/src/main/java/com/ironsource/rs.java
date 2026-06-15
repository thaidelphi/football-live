package com.ironsource;

import com.ironsource.ai;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class rs implements ai, ai.a {

    /* renamed from: c  reason: collision with root package name */
    private static final int f20018c = 1;

    /* renamed from: a  reason: collision with root package name */
    private final Map<IronSource.AD_UNIT, Integer> f20019a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final hk f20020b = new hk();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f20021a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            f20021a = iArr;
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20021a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20021a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20021a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public rs() {
        for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
            a(ad_unit, 1);
        }
    }

    private void a(IronSource.AD_UNIT ad_unit, int i10) {
        this.f20019a.put(ad_unit, Integer.valueOf(i10));
        int i11 = a.f20021a[ad_unit.ordinal()];
        if (i11 == 1) {
            this.f20020b.d(i10);
        } else if (i11 == 2) {
            this.f20020b.b(i10);
        } else if (i11 == 3) {
            this.f20020b.a(i10);
        } else if (i11 != 4) {
        } else {
            this.f20020b.c(i10);
        }
    }

    @Override // com.ironsource.ai
    public synchronized int a(IronSource.AD_UNIT ad_unit) {
        int i10 = -1;
        if (ad_unit == null) {
            return -1;
        }
        Integer num = this.f20019a.get(ad_unit);
        if (num != null) {
            i10 = num.intValue();
        }
        return i10;
    }

    @Override // com.ironsource.ai
    public int a(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return -1;
        }
        return a(com.unity3d.mediation.a.a(adFormat)) - 1;
    }

    @Override // com.ironsource.ai.a
    public synchronized void b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return;
        }
        a(ad_unit, this.f20019a.get(ad_unit).intValue() + 1);
    }
}
