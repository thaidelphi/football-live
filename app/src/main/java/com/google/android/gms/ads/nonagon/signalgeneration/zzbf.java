package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdbw;
import com.google.android.gms.internal.ads.zzdcq;
import com.google.android.gms.internal.ads.zzfdn;
import com.google.android.gms.internal.ads.zzgba;
import com.google.android.gms.internal.ads.zzhdk;
import com.google.android.gms.internal.ads.zzhdt;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbf implements zzhdk {

    /* renamed from: a  reason: collision with root package name */
    private final zzhdt f11756a;

    /* renamed from: b  reason: collision with root package name */
    private final zzhdt f11757b;

    /* renamed from: c  reason: collision with root package name */
    private final zzhdt f11758c;

    public zzbf(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4) {
        this.f11756a = zzhdtVar;
        this.f11757b = zzhdtVar2;
        this.f11758c = zzhdtVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdcq zzdcqVar = (zzw) this.f11756a.zzb();
        zzdcq zzdcqVar2 = (zzbm) this.f11757b.zzb();
        zzgba zzc = zzfdn.zzc();
        if (((Integer) this.f11758c.zzb()).intValue() == 2) {
            zzdcqVar = zzdcqVar2;
        }
        return new zzdbw(zzdcqVar, zzc);
    }
}
