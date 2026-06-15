package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzavd implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzavf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavd(zzavf zzavfVar, int i10, boolean z10) {
        this.zza = i10;
        this.zzb = zzavfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasa zzasaVar;
        int i10 = this.zza;
        zzavf zzavfVar = this.zzb;
        if (i10 > 0) {
            try {
                Thread.sleep(i10 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzavfVar.zza.getPackageManager().getPackageInfo(zzavfVar.zza.getPackageName(), 0);
            Context context = zzavfVar.zza;
            zzasaVar = zzfly.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzasaVar = null;
        }
        this.zzb.zzk = zzasaVar;
        if (this.zza < 4) {
            if (zzasaVar != null && zzasaVar.zzaf() && !zzasaVar.zzg().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzasaVar.zzag() && zzasaVar.zzf().zzg() && zzasaVar.zzf().zza() != -2) {
                return;
            }
            this.zzb.zzn(this.zza + 1, true);
        }
    }
}
