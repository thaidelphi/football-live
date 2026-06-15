package com.unity3d.mediation.rewarded;

import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LevelPlayReward {

    /* renamed from: a  reason: collision with root package name */
    private final String f23793a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23794b;

    public LevelPlayReward(String name, int i10) {
        n.f(name, "name");
        this.f23793a = name;
        this.f23794b = i10;
    }

    public static /* synthetic */ LevelPlayReward copy$default(LevelPlayReward levelPlayReward, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = levelPlayReward.f23793a;
        }
        if ((i11 & 2) != 0) {
            i10 = levelPlayReward.f23794b;
        }
        return levelPlayReward.copy(str, i10);
    }

    public final String component1() {
        return this.f23793a;
    }

    public final int component2() {
        return this.f23794b;
    }

    public final LevelPlayReward copy(String name, int i10) {
        n.f(name, "name");
        return new LevelPlayReward(name, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LevelPlayReward) {
            LevelPlayReward levelPlayReward = (LevelPlayReward) obj;
            return n.a(this.f23793a, levelPlayReward.f23793a) && this.f23794b == levelPlayReward.f23794b;
        }
        return false;
    }

    public final int getAmount() {
        return this.f23794b;
    }

    public final String getName() {
        return this.f23793a;
    }

    public int hashCode() {
        return (this.f23793a.hashCode() * 31) + this.f23794b;
    }

    public String toString() {
        return "LevelPlayReward(name=" + this.f23793a + ", amount=" + this.f23794b + ')';
    }
}
