package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class v1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f21093a;

    /* renamed from: b  reason: collision with root package name */
    private final List<NetworkSettings> f21094b;

    /* renamed from: c  reason: collision with root package name */
    private final qk f21095c;

    /* JADX WARN: Multi-variable type inference failed */
    public v1(String str, List<? extends NetworkSettings> providerList, qk publisherDataHolder) {
        kotlin.jvm.internal.n.f(providerList, "providerList");
        kotlin.jvm.internal.n.f(publisherDataHolder, "publisherDataHolder");
        this.f21093a = str;
        this.f21094b = providerList;
        this.f21095c = publisherDataHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ v1 a(v1 v1Var, String str, List list, qk qkVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = v1Var.f21093a;
        }
        if ((i10 & 2) != 0) {
            list = v1Var.f21094b;
        }
        if ((i10 & 4) != 0) {
            qkVar = v1Var.f21095c;
        }
        return v1Var.a(str, list, qkVar);
    }

    public final v1 a(String str, List<? extends NetworkSettings> providerList, qk publisherDataHolder) {
        kotlin.jvm.internal.n.f(providerList, "providerList");
        kotlin.jvm.internal.n.f(publisherDataHolder, "publisherDataHolder");
        return new v1(str, providerList, publisherDataHolder);
    }

    public final String a() {
        return this.f21093a;
    }

    public final List<NetworkSettings> b() {
        return this.f21094b;
    }

    public final qk c() {
        return this.f21095c;
    }

    public final List<NetworkSettings> d() {
        return this.f21094b;
    }

    public final qk e() {
        return this.f21095c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            return kotlin.jvm.internal.n.a(this.f21093a, v1Var.f21093a) && kotlin.jvm.internal.n.a(this.f21094b, v1Var.f21094b) && kotlin.jvm.internal.n.a(this.f21095c, v1Var.f21095c);
        }
        return false;
    }

    public final String f() {
        return this.f21093a;
    }

    public int hashCode() {
        String str = this.f21093a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f21094b.hashCode()) * 31) + this.f21095c.hashCode();
    }

    public String toString() {
        return "AdUnitCommonData(userId=" + this.f21093a + ", providerList=" + this.f21094b + ", publisherDataHolder=" + this.f21095c + ')';
    }
}
