package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzerk implements zzerw {
    private final zzgba zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzerk(zzgba zzgbaVar, Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.zza = zzgbaVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = str;
    }

    public static /* synthetic */ zzerl zzc(zzerk zzerkVar) {
        boolean g10 = Wrappers.a(zzerkVar.zzb).g();
        com.google.android.gms.ads.internal.zzv.zzq();
        boolean zzF = com.google.android.gms.ads.internal.util.zzs.zzF(zzerkVar.zzb);
        String str = zzerkVar.zzc.afmaVersion;
        com.google.android.gms.ads.internal.zzv.zzq();
        boolean zzG = com.google.android.gms.ads.internal.util.zzs.zzG();
        com.google.android.gms.ads.internal.zzv.zzq();
        ApplicationInfo applicationInfo = zzerkVar.zzb.getApplicationInfo();
        int i10 = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        Context context = zzerkVar.zzb;
        return new zzerl(g10, zzF, str, zzG, i10, DynamiteModule.c(context, ModuleDescriptor.MODULE_ID), DynamiteModule.a(context, ModuleDescriptor.MODULE_ID), zzerkVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerk.zzc(zzerk.this);
            }
        });
    }
}
