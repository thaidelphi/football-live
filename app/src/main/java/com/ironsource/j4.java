package com.ironsource;

import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class j4 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f17929a;

    public j4() {
        this(null, 1, null);
    }

    public j4(Map<String, String> mediationTypes) {
        kotlin.jvm.internal.n.f(mediationTypes, "mediationTypes");
        this.f17929a = mediationTypes;
    }

    public /* synthetic */ j4(Map map, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? j8.j0.f() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j4 a(j4 j4Var, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = j4Var.f17929a;
        }
        return j4Var.a(map);
    }

    public final j4 a(Map<String, String> mediationTypes) {
        kotlin.jvm.internal.n.f(mediationTypes, "mediationTypes");
        return new j4(mediationTypes);
    }

    public final Map<String, String> a() {
        return this.f17929a;
    }

    public final Map<String, String> b() {
        return this.f17929a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j4) && kotlin.jvm.internal.n.a(this.f17929a, ((j4) obj).f17929a);
    }

    public int hashCode() {
        return this.f17929a.hashCode();
    }

    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f17929a + ')';
    }
}
