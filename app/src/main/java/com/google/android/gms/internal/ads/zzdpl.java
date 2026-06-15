package com.google.android.gms.internal.ads;

import android.os.Bundle;
import c1.i;
import com.ironsource.b9;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdpl implements zzcxc, zzcvt, zzcui, zzdcq {
    private final zzdpz zza;
    private final zzdqk zzb;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpl(zzdpz zzdpzVar, zzdqk zzdqkVar, int i10) {
        this.zza = zzdpzVar;
        this.zzb = zzdqkVar;
        this.zzc = i10;
    }

    private final void zzc(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j10 = bundle.getLong(str);
            if (j10 >= 0) {
                this.zza.zzc(str, String.valueOf(j10));
            }
        }
    }

    private final void zzd(Bundle bundle, zzfvv zzfvvVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzck)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(zzdpn.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        if (bundle.containsKey("ls")) {
            this.zza.zzc("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzfvvVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzdpo zzdpoVar = (zzdpo) zzfvvVar.get(i10);
            long j10 = bundle.getLong(zzdpoVar.zza().zza(), -1L);
            long j11 = bundle.getLong(zzdpoVar.zzb().zza(), -1L);
            if (j10 > 0 && j11 > 0) {
                this.zza.zzc(zzdpoVar.zzc(), String.valueOf(j11 - j10));
            }
        }
        zzc(bundle.getBundle("client_sig_latency_key"));
        zzc(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzht)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                this.zza.zzc("sod_h", true == bundle.getBoolean("sod_h") ? "1" : "0");
            }
            if (bundle.containsKey("cmr")) {
                this.zza.zzc("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdl(zzbud zzbudVar) {
        this.zza.zze(zzbudVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdm(zzfag zzfagVar) {
        this.zza.zzd(zzfagVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcui
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zzb().put("action", "ftl");
        this.zza.zzc("ftl", String.valueOf(zzeVar.zza));
        this.zza.zzc("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhb)).booleanValue()) {
            this.zza.zzc("emsg", zzeVar.zzb);
        }
        this.zzb.zzg(this.zza.zzb());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    @Override // com.google.android.gms.internal.ads.zzdcq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk r5) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdpl.zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdcq
    public final void zzf(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgN)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzht)).booleanValue()) {
                this.zza.zzb().put("sgw", String.valueOf(this.zzc));
            }
            this.zza.zzb().put("action", "sgf");
            this.zza.zzc("sgf_reason", str);
            this.zzb.zzg(this.zza.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzs() {
        this.zza.zzb().put("action", b9.h.f16672r);
        zzd(this.zza.zza(), zzdpo.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmy)).booleanValue()) {
            this.zza.zzb().put("mafe", true != i.a("MUTE_AUDIO") ? "0" : "1");
        }
        this.zzb.zzg(this.zza.zzb());
    }
}
