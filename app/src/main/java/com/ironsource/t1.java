package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    private final p1 f20771a;

    /* renamed from: b  reason: collision with root package name */
    private final LevelPlayAdInfo f20772b;

    public t1(p1 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f20771a = adUnit;
        this.f20772b = levelPlayAdInfo;
    }

    public /* synthetic */ t1(p1 p1Var, LevelPlayAdInfo levelPlayAdInfo, int i10, kotlin.jvm.internal.h hVar) {
        this(p1Var, (i10 & 2) != 0 ? null : levelPlayAdInfo);
    }

    public static /* synthetic */ t1 a(t1 t1Var, p1 p1Var, LevelPlayAdInfo levelPlayAdInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            p1Var = t1Var.f20771a;
        }
        if ((i10 & 2) != 0) {
            levelPlayAdInfo = t1Var.f20772b;
        }
        return t1Var.a(p1Var, levelPlayAdInfo);
    }

    public final p1 a() {
        return this.f20771a;
    }

    public final t1 a(p1 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        return new t1(adUnit, levelPlayAdInfo);
    }

    public final LevelPlayAdInfo b() {
        return this.f20772b;
    }

    public final LevelPlayAdInfo c() {
        return this.f20772b;
    }

    public final p1 d() {
        return this.f20771a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t1) {
            t1 t1Var = (t1) obj;
            return kotlin.jvm.internal.n.a(this.f20771a, t1Var.f20771a) && kotlin.jvm.internal.n.a(this.f20772b, t1Var.f20772b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f20771a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.f20772b;
        return hashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    public String toString() {
        return "AdUnitCallback(adUnit=" + this.f20771a + ", adInfo=" + this.f20772b + ')';
    }
}
