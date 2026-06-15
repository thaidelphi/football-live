package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class xp {

    /* renamed from: a  reason: collision with root package name */
    private final w2 f21424a;

    /* renamed from: b  reason: collision with root package name */
    private final List<zn> f21425b;

    /* renamed from: c  reason: collision with root package name */
    private final w1 f21426c;

    /* renamed from: d  reason: collision with root package name */
    private final IronSource.AD_UNIT f21427d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21428a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f21428a = iArr;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b extends hr {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NetworkSettings f21430b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AdapterBaseInterface f21431c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AdData f21432d;

        b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
            this.f21430b = networkSettings;
            this.f21431c = adapterBaseInterface;
            this.f21432d = adData;
        }

        @Override // com.ironsource.hr
        public void a() {
            xp xpVar = xp.this;
            NetworkSettings networkSettings = this.f21430b;
            AdapterBaseInterface networkAdapter = this.f21431c;
            kotlin.jvm.internal.n.e(networkAdapter, "networkAdapter");
            xpVar.a(networkSettings, networkAdapter, this.f21432d);
        }

        @Override // com.ironsource.hr
        public void a(Throwable t10) {
            kotlin.jvm.internal.n.f(t10, "t");
            fv h10 = xp.this.f21424a.e().h();
            h10.g("initProvider - exception while calling networkAdapter.init with " + this.f21430b.getProviderName() + " - " + t10);
        }
    }

    public xp(w2 adUnitTools, LevelPlay.AdFormat adFormat, List<zn> providers, w1 adUnitData) {
        kotlin.jvm.internal.n.f(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(providers, "providers");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        this.f21424a = adUnitTools;
        this.f21425b = providers;
        this.f21426c = adUnitData;
        this.f21427d = a(adFormat);
    }

    private final IronSource.AD_UNIT a(LevelPlay.AdFormat adFormat) {
        int i10 = a.f21428a[adFormat.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return IronSource.AD_UNIT.NATIVE_AD;
                    }
                    throw new i8.l();
                }
                return IronSource.AD_UNIT.BANNER;
            }
            return IronSource.AD_UNIT.INTERSTITIAL;
        }
        return IronSource.AD_UNIT.REWARDED_VIDEO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
        a("Start initializing provider %s on thread %s", networkSettings);
        adapterBaseInterface.init(adData, ContextProvider.getInstance().getApplicationContext(), null);
        a("Done initializing provider %s on thread %s", networkSettings);
    }

    private final void a(String str, NetworkSettings networkSettings) {
        IronLog ironLog = IronLog.INTERNAL;
        w2 w2Var = this.f21424a;
        kotlin.jvm.internal.d0 d0Var = kotlin.jvm.internal.d0.f27370a;
        String format = String.format(str, Arrays.copyOf(new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}, 2));
        kotlin.jvm.internal.n.e(format, "format(format, *args)");
        ironLog.verbose(o1.a(w2Var, format, (String) null, 2, (Object) null));
    }

    private final boolean a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return false;
        }
        w2 w2Var = this.f21424a;
        IronSource.AD_UNIT ad_unit = this.f21427d;
        String providerInstanceName = networkSettings.getProviderInstanceName();
        kotlin.jvm.internal.n.e(providerInstanceName, "providerSettings.providerInstanceName");
        if (w2Var.a(adapterBaseInterface, ad_unit, providerInstanceName)) {
            return false;
        }
        return networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.f21427d);
    }

    public final void a() {
        IronLog.INTERNAL.verbose(o1.a(this.f21424a, (String) null, (String) null, 3, (Object) null));
        UUID randomUUID = UUID.randomUUID();
        for (zn znVar : this.f21425b) {
            NetworkSettings f10 = znVar.f();
            AdapterBaseInterface b10 = com.ironsource.mediationsdk.c.b().b(f10, this.f21427d, randomUUID);
            if (a(f10, b10)) {
                wt.a(wt.f21318a, new b(f10, b10, this.f21426c.a(f10)), 0L, 2, null);
            }
        }
    }
}
