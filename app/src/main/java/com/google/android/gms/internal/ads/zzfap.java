package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfap {
    public final com.google.android.gms.ads.internal.client.zzfx zza;
    public final zzbky zzb;
    public final zzeis zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final com.google.android.gms.ads.internal.client.zzr zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzben zzi;
    public final com.google.android.gms.ads.internal.client.zzx zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcl zzn;
    public final zzfac zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;
    public final com.google.android.gms.ads.internal.client.zzcp zzt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfap(zzfan zzfanVar, zzfao zzfaoVar) {
        com.google.android.gms.ads.internal.client.zzr zzrVar;
        String str;
        com.google.android.gms.ads.internal.client.zzcp zzcpVar;
        com.google.android.gms.ads.internal.client.zzm zzmVar;
        com.google.android.gms.ads.internal.client.zzm zzmVar2;
        com.google.android.gms.ads.internal.client.zzm zzmVar3;
        com.google.android.gms.ads.internal.client.zzm zzmVar4;
        com.google.android.gms.ads.internal.client.zzm zzmVar5;
        com.google.android.gms.ads.internal.client.zzm zzmVar6;
        com.google.android.gms.ads.internal.client.zzm zzmVar7;
        com.google.android.gms.ads.internal.client.zzm zzmVar8;
        com.google.android.gms.ads.internal.client.zzm zzmVar9;
        com.google.android.gms.ads.internal.client.zzm zzmVar10;
        com.google.android.gms.ads.internal.client.zzm zzmVar11;
        com.google.android.gms.ads.internal.client.zzm zzmVar12;
        com.google.android.gms.ads.internal.client.zzm zzmVar13;
        com.google.android.gms.ads.internal.client.zzm zzmVar14;
        com.google.android.gms.ads.internal.client.zzm zzmVar15;
        com.google.android.gms.ads.internal.client.zzm zzmVar16;
        com.google.android.gms.ads.internal.client.zzm zzmVar17;
        com.google.android.gms.ads.internal.client.zzm zzmVar18;
        com.google.android.gms.ads.internal.client.zzm zzmVar19;
        com.google.android.gms.ads.internal.client.zzm zzmVar20;
        com.google.android.gms.ads.internal.client.zzm zzmVar21;
        com.google.android.gms.ads.internal.client.zzm zzmVar22;
        com.google.android.gms.ads.internal.client.zzm zzmVar23;
        com.google.android.gms.ads.internal.client.zzm zzmVar24;
        com.google.android.gms.ads.internal.client.zzm zzmVar25;
        com.google.android.gms.ads.internal.client.zzm zzmVar26;
        com.google.android.gms.ads.internal.client.zzfx zzfxVar;
        zzben zzbenVar;
        com.google.android.gms.ads.internal.client.zzfx zzfxVar2;
        zzben zzbenVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        zzben zzbenVar3;
        zzben zzbenVar4;
        com.google.android.gms.ads.internal.client.zzx zzxVar;
        int i10;
        AdManagerAdViewOptions adManagerAdViewOptions;
        PublisherAdViewOptions publisherAdViewOptions;
        com.google.android.gms.ads.internal.client.zzcl zzclVar;
        zzbky zzbkyVar;
        zzfaa zzfaaVar;
        boolean z10;
        boolean z11;
        zzeis zzeisVar;
        boolean z12;
        Bundle bundle;
        boolean z13;
        zzrVar = zzfanVar.zzb;
        this.zze = zzrVar;
        str = zzfanVar.zzc;
        this.zzf = str;
        zzcpVar = zzfanVar.zzu;
        this.zzt = zzcpVar;
        zzmVar = zzfanVar.zza;
        int i11 = zzmVar.zza;
        zzmVar2 = zzfanVar.zza;
        long j10 = zzmVar2.zzb;
        zzmVar3 = zzfanVar.zza;
        Bundle bundle2 = zzmVar3.zzc;
        zzmVar4 = zzfanVar.zza;
        int i12 = zzmVar4.zzd;
        zzmVar5 = zzfanVar.zza;
        List list = zzmVar5.zze;
        zzmVar6 = zzfanVar.zza;
        boolean z14 = zzmVar6.zzf;
        zzmVar7 = zzfanVar.zza;
        int i13 = zzmVar7.zzg;
        zzmVar8 = zzfanVar.zza;
        boolean z15 = true;
        if (!zzmVar8.zzh) {
            z13 = zzfanVar.zze;
            if (!z13) {
                z15 = false;
            }
        }
        zzmVar9 = zzfanVar.zza;
        String str2 = zzmVar9.zzi;
        zzmVar10 = zzfanVar.zza;
        com.google.android.gms.ads.internal.client.zzfu zzfuVar = zzmVar10.zzj;
        zzmVar11 = zzfanVar.zza;
        Location location = zzmVar11.zzk;
        zzmVar12 = zzfanVar.zza;
        String str3 = zzmVar12.zzl;
        zzmVar13 = zzfanVar.zza;
        Bundle bundle3 = zzmVar13.zzm;
        zzmVar14 = zzfanVar.zza;
        Bundle bundle4 = zzmVar14.zzn;
        zzmVar15 = zzfanVar.zza;
        List list2 = zzmVar15.zzo;
        zzmVar16 = zzfanVar.zza;
        String str4 = zzmVar16.zzp;
        zzmVar17 = zzfanVar.zza;
        String str5 = zzmVar17.zzq;
        zzmVar18 = zzfanVar.zza;
        boolean z16 = zzmVar18.zzr;
        zzmVar19 = zzfanVar.zza;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar19.zzs;
        zzmVar20 = zzfanVar.zza;
        int i14 = zzmVar20.zzt;
        zzmVar21 = zzfanVar.zza;
        String str6 = zzmVar21.zzu;
        zzmVar22 = zzfanVar.zza;
        List list3 = zzmVar22.zzv;
        zzmVar23 = zzfanVar.zza;
        int zza = com.google.android.gms.ads.internal.util.zzs.zza(zzmVar23.zzw);
        zzmVar24 = zzfanVar.zza;
        String str7 = zzmVar24.zzx;
        zzmVar25 = zzfanVar.zza;
        int i15 = zzmVar25.zzy;
        zzmVar26 = zzfanVar.zza;
        this.zzd = new com.google.android.gms.ads.internal.client.zzm(i11, j10, bundle2, i12, list, z14, i13, z15, str2, zzfuVar, location, str3, bundle3, bundle4, list2, str4, str5, z16, zzcVar, i14, str6, list3, zza, str7, i15, zzmVar26.zzz);
        zzfxVar = zzfanVar.zzd;
        if (zzfxVar != null) {
            zzfxVar2 = zzfanVar.zzd;
        } else {
            zzbenVar = zzfanVar.zzh;
            if (zzbenVar != null) {
                zzbenVar2 = zzfanVar.zzh;
                zzfxVar2 = zzbenVar2.zzf;
            } else {
                zzfxVar2 = null;
            }
        }
        this.zza = zzfxVar2;
        arrayList = zzfanVar.zzf;
        this.zzg = arrayList;
        arrayList2 = zzfanVar.zzg;
        this.zzh = arrayList2;
        arrayList3 = zzfanVar.zzf;
        if (arrayList3 == null) {
            zzbenVar4 = null;
        } else {
            zzbenVar3 = zzfanVar.zzh;
            zzbenVar4 = zzbenVar3 == null ? new zzben(new NativeAdOptions.Builder().build()) : zzfanVar.zzh;
        }
        this.zzi = zzbenVar4;
        zzxVar = zzfanVar.zzi;
        this.zzj = zzxVar;
        i10 = zzfanVar.zzm;
        this.zzk = i10;
        adManagerAdViewOptions = zzfanVar.zzj;
        this.zzl = adManagerAdViewOptions;
        publisherAdViewOptions = zzfanVar.zzk;
        this.zzm = publisherAdViewOptions;
        zzclVar = zzfanVar.zzl;
        this.zzn = zzclVar;
        zzbkyVar = zzfanVar.zzn;
        this.zzb = zzbkyVar;
        zzfaaVar = zzfanVar.zzo;
        this.zzo = new zzfac(zzfaaVar, null);
        z10 = zzfanVar.zzp;
        this.zzp = z10;
        z11 = zzfanVar.zzq;
        this.zzq = z11;
        zzeisVar = zzfanVar.zzr;
        this.zzc = zzeisVar;
        z12 = zzfanVar.zzs;
        this.zzr = z12;
        bundle = zzfanVar.zzt;
        this.zzs = bundle;
    }

    public final boolean zza() {
        zzbbd zzbbdVar = zzbbm.zzdo;
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar));
    }
}
