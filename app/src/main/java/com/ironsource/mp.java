package com.ironsource;

import com.ironsource.zf;
import com.unity3d.mediation.LevelPlay;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class mp implements zf, zf.a {

    /* renamed from: a  reason: collision with root package name */
    private final j8 f19286a;

    /* renamed from: b  reason: collision with root package name */
    private final pa f19287b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19288a;

        static {
            int[] iArr = new int[n8.values().length];
            try {
                iArr[n8.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n8.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n8.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19288a = iArr;
        }
    }

    public mp() {
        this(null, null, 3, null);
    }

    public mp(j8 cappingService, pa deliveryHandler) {
        kotlin.jvm.internal.n.f(cappingService, "cappingService");
        kotlin.jvm.internal.n.f(deliveryHandler, "deliveryHandler");
        this.f19286a = cappingService;
        this.f19287b = deliveryHandler;
    }

    public /* synthetic */ mp(j8 j8Var, pa paVar, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? new j8(null, null, null, 7, null) : j8Var, (i10 & 2) != 0 ? new pa() : paVar);
    }

    @Override // com.ironsource.zf
    public synchronized l8 a(String placementName, LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        String a10 = new rp(placementName, adFormat).a();
        l8 a11 = this.f19287b.a(a10);
        if (a11.d()) {
            return a11;
        }
        return this.f19286a.a(a10);
    }

    @Override // com.ironsource.zf.a
    public synchronized Object a(String placementName, LevelPlay.AdFormat adFormat, n8 cappingType, df cappingConfig) {
        Object a10;
        kotlin.jvm.internal.n.f(placementName, "placementName");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(cappingType, "cappingType");
        kotlin.jvm.internal.n.f(cappingConfig, "cappingConfig");
        String a11 = new rp(placementName, adFormat).a();
        int i10 = a.f19288a[cappingType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                throw new i8.l();
            }
            a10 = this.f19286a.a(a11, cappingType, cappingConfig);
        } else {
            a10 = this.f19287b.a(a11, cappingType, cappingConfig);
        }
        return a10;
    }

    @Override // com.ironsource.zf.a
    public synchronized void b(String placementName, LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        String a10 = new rp(placementName, adFormat).a();
        if (!this.f19287b.a(a10).d()) {
            this.f19286a.b(a10);
        }
    }
}
