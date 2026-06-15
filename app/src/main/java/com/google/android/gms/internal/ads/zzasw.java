package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzasw implements PackageManager.OnChecksumsReadyListener {
    final zzgbj zza = zzgbj.zze();

    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zzc("");
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ApkChecksum apkChecksum = (ApkChecksum) list.get(i10);
                if (apkChecksum.getType() == 8) {
                    zzgbj zzgbjVar = this.zza;
                    zzfyi zzf = zzfyi.zzi().zzf();
                    byte[] value = apkChecksum.getValue();
                    zzgbjVar.zzc(zzf.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zzc("");
    }
}
