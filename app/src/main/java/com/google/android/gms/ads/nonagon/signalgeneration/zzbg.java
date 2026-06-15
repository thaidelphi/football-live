package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import b6.a;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzcti;
import com.google.android.gms.internal.ads.zzctj;
import com.google.android.gms.internal.ads.zzctw;
import com.google.android.gms.internal.ads.zzdct;
import com.google.android.gms.internal.ads.zzdpn;
import com.google.android.gms.internal.ads.zzfen;
import com.google.android.gms.internal.ads.zzfet;
import com.google.android.gms.internal.ads.zzgap;
import com.google.android.gms.internal.ads.zzhdk;
import com.google.android.gms.internal.ads.zzhds;
import com.google.android.gms.internal.ads.zzhdt;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbg implements zzhdk {

    /* renamed from: a  reason: collision with root package name */
    private final zzhdt f11759a;

    /* renamed from: b  reason: collision with root package name */
    private final zzhdt f11760b;

    /* renamed from: c  reason: collision with root package name */
    private final zzhdt f11761c;

    /* renamed from: d  reason: collision with root package name */
    private final zzhdt f11762d;

    /* renamed from: e  reason: collision with root package name */
    private final zzhdt f11763e;

    /* renamed from: f  reason: collision with root package name */
    private final zzhdt f11764f;

    /* renamed from: g  reason: collision with root package name */
    private final zzhdt f11765g;

    /* renamed from: h  reason: collision with root package name */
    private final zzhdt f11766h;

    /* renamed from: i  reason: collision with root package name */
    private final zzhdt f11767i;

    public zzbg(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4, zzhdt zzhdtVar5, zzhdt zzhdtVar6, zzhdt zzhdtVar7, zzhdt zzhdtVar8, zzhdt zzhdtVar9) {
        this.f11759a = zzhdtVar;
        this.f11760b = zzhdtVar2;
        this.f11761c = zzhdtVar3;
        this.f11762d = zzhdtVar4;
        this.f11763e = zzhdtVar5;
        this.f11764f = zzhdtVar6;
        this.f11765g = zzhdtVar7;
        this.f11766h = zzhdtVar8;
        this.f11767i = zzhdtVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        a zza;
        zzau zzauVar = (zzau) this.f11759a.zzb();
        zzfet zzfetVar = (zzfet) this.f11760b.zzb();
        zzbi zzb = ((zzbj) this.f11761c).zzb();
        zzcti zzb2 = ((zzctj) this.f11762d).zzb();
        zzdct zzdctVar = (zzdct) this.f11763e.zzb();
        zzb zzbVar = (zzb) this.f11764f.zzb();
        zzbxr zzbxrVar = (zzbxr) this.f11765g.zzb();
        int intValue = ((Integer) this.f11766h.zzb()).intValue();
        Bundle bundle = ((zzctw) this.f11767i).zza().zzs;
        zzbk zzbkVar = null;
        if (intValue == 1 && zzbxrVar != null) {
            bundle.putLong(zzdpn.READ_FROM_DISK_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
            zzbkVar = zzbVar.zza(zzbxrVar, zzauVar, bundle);
            bundle.putLong(zzdpn.READ_FROM_DISK_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        if (zzbkVar != null) {
            zzdctVar.zza(zzbkVar);
            zza = zzgap.zzh(zzbkVar);
        } else {
            zza = zzfetVar.zzb(zzfen.GENERATE_SIGNALS, zzb2.zzc()).zzf(zzb).zzi(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfz)).intValue(), TimeUnit.SECONDS).zza();
            zzgap.zzr(zza, new zzaw(zzdctVar), zzbyp.zza);
        }
        zzhds.zzb(zza);
        return zza;
    }
}
