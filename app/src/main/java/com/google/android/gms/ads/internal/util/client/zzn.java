package com.google.android.gms.ads.internal.util.client;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class zzn extends zzx {

    /* renamed from: a  reason: collision with root package name */
    private final int f11390a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11391b;

    /* renamed from: c  reason: collision with root package name */
    private final double f11392c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11393d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(int i10, int i11, double d10, boolean z10) {
        this.f11390a = i10;
        this.f11391b = i11;
        this.f11392c = d10;
        this.f11393d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzx) {
            zzx zzxVar = (zzx) obj;
            if (this.f11390a == zzxVar.zzc() && this.f11391b == zzxVar.zzb() && Double.doubleToLongBits(this.f11392c) == Double.doubleToLongBits(zzxVar.zza()) && this.f11393d == zzxVar.zzd()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((int) ((Double.doubleToLongBits(this.f11392c) >>> 32) ^ Double.doubleToLongBits(this.f11392c))) ^ ((((this.f11390a ^ 1000003) * 1000003) ^ this.f11391b) * 1000003)) * 1000003) ^ (true != this.f11393d ? 1237 : 1231);
    }

    public final String toString() {
        return "PingStrategy{maxAttempts=" + this.f11390a + ", initialBackoffMs=" + this.f11391b + ", backoffMultiplier=" + this.f11392c + ", bufferAfterMaxAttempts=" + this.f11393d + "}";
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final double zza() {
        return this.f11392c;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zzb() {
        return this.f11391b;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zzc() {
        return this.f11390a;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final boolean zzd() {
        return this.f11393d;
    }
}
