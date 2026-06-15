package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.o2;
import com.ironsource.w1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class gn extends w1 {

    /* renamed from: y  reason: collision with root package name */
    public static final a f17600y = new a(null);

    /* renamed from: t  reason: collision with root package name */
    private final f1 f17601t;

    /* renamed from: u  reason: collision with root package name */
    private final v1 f17602u;

    /* renamed from: v  reason: collision with root package name */
    private final rm f17603v;

    /* renamed from: w  reason: collision with root package name */
    private final String f17604w;

    /* renamed from: x  reason: collision with root package name */
    private final String f17605x;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final gn a(f1 adProperties, el elVar) {
            List<zn> d10;
            int k10;
            ls d11;
            kotlin.jvm.internal.n.f(adProperties, "adProperties");
            w1.a aVar = w1.f21222r;
            s8 c10 = (elVar == null || (d11 = elVar.d()) == null) ? null : d11.c();
            rm e8 = c10 != null ? c10.e() : null;
            if (e8 == null) {
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
            return new gn(adProperties, new v1(userIdForNetworks, arrayList, b10), e8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(f1 adProperties, v1 adUnitCommonData, rm configs) {
        super(adProperties, true, adUnitCommonData.f(), adUnitCommonData.d(), adUnitCommonData.e(), configs.d(), configs.b(), (int) (configs.c() / 1000), configs.a(), configs.f(), -1, new o2(o2.a.MANUAL, configs.d().j(), configs.d().b(), -1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 65536, null);
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        kotlin.jvm.internal.n.f(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.n.f(configs, "configs");
        this.f17601t = adProperties;
        this.f17602u = adUnitCommonData;
        this.f17603v = configs;
        this.f17604w = "NA";
        this.f17605x = fl.f17486e;
    }

    public static /* synthetic */ gn a(gn gnVar, f1 f1Var, v1 v1Var, rm rmVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f1Var = gnVar.f17601t;
        }
        if ((i10 & 2) != 0) {
            v1Var = gnVar.f17602u;
        }
        if ((i10 & 4) != 0) {
            rmVar = gnVar.f17603v;
        }
        return gnVar.a(f1Var, v1Var, rmVar);
    }

    public final rm A() {
        return this.f17603v;
    }

    public final gn a(f1 adProperties, v1 adUnitCommonData, rm configs) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        kotlin.jvm.internal.n.f(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.n.f(configs, "configs");
        return new gn(adProperties, adUnitCommonData, configs);
    }

    @Override // com.ironsource.w1
    public f1 b() {
        return this.f17601t;
    }

    @Override // com.ironsource.w1
    public JSONObject b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        kotlin.jvm.internal.n.e(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    @Override // com.ironsource.w1
    public String c() {
        return this.f17604w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gn) {
            gn gnVar = (gn) obj;
            return kotlin.jvm.internal.n.a(this.f17601t, gnVar.f17601t) && kotlin.jvm.internal.n.a(this.f17602u, gnVar.f17602u) && kotlin.jvm.internal.n.a(this.f17603v, gnVar.f17603v);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f17601t.hashCode() * 31) + this.f17602u.hashCode()) * 31) + this.f17603v.hashCode();
    }

    @Override // com.ironsource.w1
    public String j() {
        return this.f17605x;
    }

    public String toString() {
        return "NativeAdUnitData(adProperties=" + this.f17601t + ", adUnitCommonData=" + this.f17602u + ", configs=" + this.f17603v + ')';
    }

    public final f1 w() {
        return this.f17601t;
    }

    public final v1 x() {
        return this.f17602u;
    }

    public final rm y() {
        return this.f17603v;
    }

    public final v1 z() {
        return this.f17602u;
    }
}
