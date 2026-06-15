package com.google.android.gms.internal.ads;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzclb implements zzgal {
    final /* synthetic */ zzfhp zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzv zzc;
    final /* synthetic */ zzclc zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzclb(zzclc zzclcVar, zzfhp zzfhpVar, String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = zzfhpVar;
        this.zzb = str;
        this.zzc = zzvVar;
        this.zzd = zzclcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(final Throwable th) {
        zzgba zzgbaVar;
        zzgbaVar = this.zzd.zzg;
        final zzfhp zzfhpVar = this.zza;
        final String str = this.zzb;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        zzgbaVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckz
            @Override // java.lang.Runnable
            public final void run() {
                Context context;
                Context context2;
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkk)).booleanValue();
                zzclb zzclbVar = zzclb.this;
                Throwable th2 = th;
                if (booleanValue) {
                    zzclc zzclcVar = zzclbVar.zzd;
                    context2 = zzclcVar.zzc;
                    zzclcVar.zzb = zzbta.zzc(context2);
                    zzclbVar.zzd.zzb.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzclc zzclcVar2 = zzclbVar.zzd;
                    context = zzclcVar2.zzc;
                    zzclcVar2.zza = zzbta.zza(context);
                    zzclbVar.zzd.zza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                com.google.android.gms.ads.internal.util.client.zzv zzvVar2 = zzvVar;
                zzfhpVar.zzd(str, zzvVar2, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzgba zzgbaVar;
        final zzfhp zzfhpVar = this.zza;
        final String str = (String) obj;
        zzgbaVar = this.zzd.zzg;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        zzgbaVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcla
            @Override // java.lang.Runnable
            public final void run() {
                zzfhp.this.zzd(str, zzvVar, null);
            }
        });
    }
}
