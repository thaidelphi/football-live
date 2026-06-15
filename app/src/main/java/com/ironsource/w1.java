package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class w1 {

    /* renamed from: r  reason: collision with root package name */
    public static final a f21222r = new a(null);

    /* renamed from: s  reason: collision with root package name */
    public static final int f21223s = -1;

    /* renamed from: a  reason: collision with root package name */
    private final f1 f21224a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f21225b;

    /* renamed from: c  reason: collision with root package name */
    private final String f21226c;

    /* renamed from: d  reason: collision with root package name */
    private final List<NetworkSettings> f21227d;

    /* renamed from: e  reason: collision with root package name */
    private final qk f21228e;

    /* renamed from: f  reason: collision with root package name */
    private final o5 f21229f;

    /* renamed from: g  reason: collision with root package name */
    private int f21230g;

    /* renamed from: h  reason: collision with root package name */
    private final int f21231h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f21232i;

    /* renamed from: j  reason: collision with root package name */
    private final int f21233j;

    /* renamed from: k  reason: collision with root package name */
    private final int f21234k;

    /* renamed from: l  reason: collision with root package name */
    private final o2 f21235l;

    /* renamed from: m  reason: collision with root package name */
    private final long f21236m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f21237n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f21238o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f21239p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f21240q;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final <AdFormatConfig, AdUnitData> AdUnitData a(f1 adProperties, el elVar, t8.l<? super s8, ? extends AdFormatConfig> getAdFormatConfig, t8.p<? super v1, ? super AdFormatConfig, ? extends AdUnitData> createAdUnitData) {
            List<zn> d10;
            int k10;
            ls d11;
            kotlin.jvm.internal.n.f(adProperties, "adProperties");
            kotlin.jvm.internal.n.f(getAdFormatConfig, "getAdFormatConfig");
            kotlin.jvm.internal.n.f(createAdUnitData, "createAdUnitData");
            Object obj = (AdFormatConfig) getAdFormatConfig.invoke((elVar == null || (d11 = elVar.d()) == null) ? null : d11.c());
            if (obj == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (elVar == null || (d10 = elVar.c(adProperties.d(), adProperties.c())) == null) {
                d10 = j8.q.d();
            }
            String userIdForNetworks = IronSourceUtils.getUserIdForNetworks();
            k10 = j8.r.k(d10, 10);
            ArrayList arrayList = new ArrayList(k10);
            for (zn znVar : d10) {
                arrayList.add(znVar.f());
            }
            qk b10 = qk.b();
            kotlin.jvm.internal.n.e(b10, "getInstance()");
            return createAdUnitData.invoke(new v1(userIdForNetworks, arrayList, b10), obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w1(f1 adProperties, boolean z10, String str, List<? extends NetworkSettings> providerList, qk publisherDataHolder, o5 auctionSettings, int i10, int i11, boolean z11, int i12, int i13, o2 loadingData, long j10, boolean z12, boolean z13, boolean z14, boolean z15) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        kotlin.jvm.internal.n.f(providerList, "providerList");
        kotlin.jvm.internal.n.f(publisherDataHolder, "publisherDataHolder");
        kotlin.jvm.internal.n.f(auctionSettings, "auctionSettings");
        kotlin.jvm.internal.n.f(loadingData, "loadingData");
        this.f21224a = adProperties;
        this.f21225b = z10;
        this.f21226c = str;
        this.f21227d = providerList;
        this.f21228e = publisherDataHolder;
        this.f21229f = auctionSettings;
        this.f21230g = i10;
        this.f21231h = i11;
        this.f21232i = z11;
        this.f21233j = i12;
        this.f21234k = i13;
        this.f21235l = loadingData;
        this.f21236m = j10;
        this.f21237n = z12;
        this.f21238o = z13;
        this.f21239p = z14;
        this.f21240q = z15;
    }

    public /* synthetic */ w1(f1 f1Var, boolean z10, String str, List list, qk qkVar, o5 o5Var, int i10, int i11, boolean z11, int i12, int i13, o2 o2Var, long j10, boolean z12, boolean z13, boolean z14, boolean z15, int i14, kotlin.jvm.internal.h hVar) {
        this(f1Var, z10, str, list, qkVar, o5Var, i10, i11, z11, i12, i13, o2Var, j10, z12, z13, z14, (i14 & 65536) != 0 ? false : z15);
    }

    public final int a() {
        return this.f21234k;
    }

    public AdData a(NetworkSettings providerSettings) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        AdData createAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(providerSettings), b().a(), this.f21226c);
        kotlin.jvm.internal.n.e(createAdDataForNetworkAdapter, "createAdDataForNetworkAd…perties.adFormat, userId)");
        return createAdDataForNetworkAdapter;
    }

    public final NetworkSettings a(String instanceName) {
        Object obj;
        kotlin.jvm.internal.n.f(instanceName, "instanceName");
        Iterator<T> it = this.f21227d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((NetworkSettings) obj).getProviderInstanceName().equals(instanceName)) {
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    public final void a(int i10) {
        this.f21230g = i10;
    }

    public final void a(boolean z10) {
        this.f21232i = z10;
    }

    public f1 b() {
        return this.f21224a;
    }

    public abstract JSONObject b(NetworkSettings networkSettings);

    public final void b(boolean z10) {
        this.f21240q = z10;
    }

    public abstract String c();

    public final boolean d() {
        return this.f21232i;
    }

    public final o5 e() {
        return this.f21229f;
    }

    public final long f() {
        return this.f21236m;
    }

    public final int g() {
        return this.f21233j;
    }

    public final int h() {
        return this.f21231h;
    }

    public final o2 i() {
        return this.f21235l;
    }

    public abstract String j();

    public final int k() {
        return this.f21230g;
    }

    public final String l() {
        String placementName;
        Placement e8 = b().e();
        return (e8 == null || (placementName = e8.getPlacementName()) == null) ? "" : placementName;
    }

    public final List<NetworkSettings> m() {
        return this.f21227d;
    }

    public final boolean n() {
        return this.f21237n;
    }

    public final qk o() {
        return this.f21228e;
    }

    public final boolean p() {
        return this.f21239p;
    }

    public final boolean q() {
        return this.f21240q;
    }

    public final String r() {
        return this.f21226c;
    }

    public final boolean s() {
        return this.f21238o;
    }

    public final boolean t() {
        return this.f21229f.g() > 0;
    }

    public boolean u() {
        return this.f21225b;
    }

    public final String v() {
        String format = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.f18578x, Integer.valueOf(this.f21230g), com.ironsource.mediationsdk.d.f18579y, Boolean.valueOf(this.f21232i), com.ironsource.mediationsdk.d.f18580z, Boolean.valueOf(this.f21240q));
        kotlin.jvm.internal.n.e(format, "format(\n          Locale…     showPriorityEnabled)");
        return format;
    }
}
