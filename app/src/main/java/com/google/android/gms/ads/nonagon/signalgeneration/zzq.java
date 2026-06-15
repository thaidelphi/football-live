package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.query.QueryInfo;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzq {

    /* renamed from: a  reason: collision with root package name */
    private final QueryInfo f11814a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11815b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11816c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11817d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f11818e = new AtomicBoolean(false);

    public zzq(QueryInfo queryInfo, String str, long j10, int i10) {
        this.f11814a = queryInfo;
        this.f11815b = str;
        this.f11816c = j10;
        this.f11817d = i10;
    }

    public final int zza() {
        return this.f11817d;
    }

    public final QueryInfo zzb() {
        return this.f11814a;
    }

    public final String zzc() {
        return this.f11815b;
    }

    public final void zzd() {
        this.f11818e.set(true);
    }

    public final boolean zze() {
        return this.f11816c <= com.google.android.gms.ads.internal.zzv.zzC().a();
    }

    public final boolean zzf() {
        return this.f11818e.get();
    }
}
