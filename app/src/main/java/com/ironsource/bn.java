package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.o2;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class bn extends u0 {

    /* renamed from: s  reason: collision with root package name */
    private final String f16767s;

    /* renamed from: t  reason: collision with root package name */
    private final List<NetworkSettings> f16768t;

    /* renamed from: u  reason: collision with root package name */
    private final rm f16769u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bn(String str, List<? extends NetworkSettings> list, rm configs) {
        super(IronSource.AD_UNIT.NATIVE_AD, str, list, configs.d(), configs.b(), (int) (configs.c() / 1000), configs.a(), configs.f(), -1, new o2(o2.a.MANUAL, configs.d().j(), configs.d().b(), -1L), new i2(-1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 32768, null);
        kotlin.jvm.internal.n.f(configs, "configs");
        this.f16767s = str;
        this.f16768t = list;
        this.f16769u = configs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ bn a(bn bnVar, String str, List list, rm rmVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bnVar.f16767s;
        }
        if ((i10 & 2) != 0) {
            list = bnVar.f16768t;
        }
        if ((i10 & 4) != 0) {
            rmVar = bnVar.f16769u;
        }
        return bnVar.a(str, list, rmVar);
    }

    public final bn a(String str, List<? extends NetworkSettings> list, rm configs) {
        kotlin.jvm.internal.n.f(configs, "configs");
        return new bn(str, list, configs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bn) {
            bn bnVar = (bn) obj;
            return kotlin.jvm.internal.n.a(this.f16767s, bnVar.f16767s) && kotlin.jvm.internal.n.a(this.f16768t, bnVar.f16768t) && kotlin.jvm.internal.n.a(this.f16769u, bnVar.f16769u);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f16767s;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f16768t;
        return ((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f16769u.hashCode();
    }

    @Override // com.ironsource.u0
    public List<NetworkSettings> j() {
        return this.f16768t;
    }

    @Override // com.ironsource.u0
    public String o() {
        return this.f16767s;
    }

    public final String s() {
        return this.f16767s;
    }

    public final List<NetworkSettings> t() {
        return this.f16768t;
    }

    public String toString() {
        return "NativeAdManagerData(userId=" + this.f16767s + ", providerList=" + this.f16768t + ", configs=" + this.f16769u + ')';
    }

    public final rm u() {
        return this.f16769u;
    }

    public final rm v() {
        return this.f16769u;
    }
}
