package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class i2 {

    /* renamed from: a  reason: collision with root package name */
    private final long f17765a;

    public i2(long j10) {
        this.f17765a = j10;
    }

    public static /* synthetic */ i2 a(i2 i2Var, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = i2Var.f17765a;
        }
        return i2Var.a(j10);
    }

    public final long a() {
        return this.f17765a;
    }

    public final i2 a(long j10) {
        return new i2(j10);
    }

    public final long b() {
        return this.f17765a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2) && this.f17765a == ((i2) obj).f17765a;
    }

    public int hashCode() {
        return androidx.privacysandbox.ads.adservices.topics.d.a(this.f17765a);
    }

    public String toString() {
        return "AdUnitInteractionData(impressionTimeout=" + this.f17765a + ')';
    }
}
