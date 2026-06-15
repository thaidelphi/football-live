package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zzcfx;
import com.google.android.gms.internal.ads.zzhdk;
import com.google.android.gms.internal.ads.zzhdt;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzc implements zzhdk {

    /* renamed from: a  reason: collision with root package name */
    private final zzhdt f11781a;

    /* renamed from: b  reason: collision with root package name */
    private final zzhdt f11782b;

    /* renamed from: c  reason: collision with root package name */
    private final zzhdt f11783c;

    /* renamed from: d  reason: collision with root package name */
    private final zzhdt f11784d;

    /* renamed from: e  reason: collision with root package name */
    private final zzhdt f11785e;

    public zzc(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4, zzhdt zzhdtVar5) {
        this.f11781a = zzhdtVar;
        this.f11782b = zzhdtVar2;
        this.f11783c = zzhdtVar3;
        this.f11784d = zzhdtVar4;
        this.f11785e = zzhdtVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzb(((zzcfx) this.f11781a).zza(), ((Long) this.f11782b.zzb()).longValue(), (PackageInfo) this.f11783c.zzb(), (zzd) this.f11784d.zzb(), (ScheduledExecutorService) this.f11785e.zzb());
    }
}
