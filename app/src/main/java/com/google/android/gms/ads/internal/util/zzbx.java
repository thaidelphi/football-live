package com.google.android.gms.ads.internal.util;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbx {

    /* renamed from: a  reason: collision with root package name */
    private long f11455a;

    /* renamed from: b  reason: collision with root package name */
    private long f11456b = Long.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private final Object f11457c = new Object();

    public zzbx(long j10) {
        this.f11455a = j10;
    }

    public final void zza(long j10) {
        synchronized (this.f11457c) {
            this.f11455a = j10;
        }
    }

    public final boolean zzb() {
        synchronized (this.f11457c) {
            long b10 = com.google.android.gms.ads.internal.zzv.zzC().b();
            if (this.f11456b + this.f11455a > b10) {
                return false;
            }
            this.f11456b = b10;
            return true;
        }
    }
}
