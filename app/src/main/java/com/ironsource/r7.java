package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class r7 implements e3 {

    /* renamed from: a  reason: collision with root package name */
    private final s8 f19927a;

    /* renamed from: b  reason: collision with root package name */
    private final cq f19928b;

    /* renamed from: c  reason: collision with root package name */
    private final IronSource.AD_UNIT f19929c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19930a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19930a = iArr;
        }
    }

    public r7(s8 adFormatConfigurations, cq cqVar, IronSource.AD_UNIT adFormat) {
        kotlin.jvm.internal.n.f(adFormatConfigurations, "adFormatConfigurations");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        this.f19927a = adFormatConfigurations;
        this.f19928b = cqVar;
        this.f19929c = adFormat;
    }

    @Override // com.ironsource.e3
    public ui a(yp providerName) {
        NetworkSettings b10;
        yq f10;
        kotlin.jvm.internal.n.f(providerName, "providerName");
        cq cqVar = this.f19928b;
        if (cqVar == null || (b10 = cqVar.b(providerName.value())) == null) {
            return null;
        }
        int i10 = a.f19930a[this.f19929c.ordinal()];
        if (i10 == 1) {
            u6 c10 = this.f19927a.c();
            if (c10 != null) {
                return new z6(new c3(b10, b10.getBannerSettings(), this.f19929c), c10);
            }
            return null;
        } else if (i10 != 2) {
            if (i10 == 3 && (f10 = this.f19927a.f()) != null) {
                return new lq(new c3(b10, b10.getRewardedVideoSettings(), this.f19929c), f10);
            }
            return null;
        } else {
            mj d10 = this.f19927a.d();
            if (d10 != null) {
                return new pj(new c3(b10, b10.getInterstitialSettings(), this.f19929c), d10);
            }
            return null;
        }
    }
}
