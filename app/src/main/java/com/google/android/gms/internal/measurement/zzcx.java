package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcx extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ zzee zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzee zzeeVar, String str, String str2, Context context, Bundle bundle) {
        super(zzeeVar, true);
        this.zze = zzeeVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = context;
        this.zzd = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        boolean zzV;
        String str;
        String str2;
        String str3;
        zzcc zzccVar;
        int c10;
        zzcc zzccVar2;
        String str4;
        String str5;
        try {
            zzee zzeeVar = this.zze;
            zzV = zzee.zzV(this.zza, this.zzb);
            if (zzV) {
                String str6 = this.zzb;
                String str7 = this.zza;
                str5 = this.zze.zzd;
                str2 = str7;
                str3 = str6;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.m(this.zzc);
            zzee zzeeVar2 = this.zze;
            zzeeVar2.zzj = zzeeVar2.zzf(this.zzc, true);
            zzccVar = this.zze.zzj;
            if (zzccVar == null) {
                str4 = this.zze.zzd;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int a10 = DynamiteModule.a(this.zzc, ModuleDescriptor.MODULE_ID);
            zzcl zzclVar = new zzcl(73000L, Math.max(a10, c10), DynamiteModule.c(this.zzc, ModuleDescriptor.MODULE_ID) < a10, str, str2, str3, this.zzd, com.google.android.gms.measurement.internal.zzfq.a(this.zzc));
            zzccVar2 = this.zze.zzj;
            ((zzcc) Preconditions.m(zzccVar2)).initialize(ObjectWrapper.u0(this.zzc), zzclVar, this.zzh);
        } catch (Exception e8) {
            this.zze.zzS(e8, true, false);
        }
    }
}
