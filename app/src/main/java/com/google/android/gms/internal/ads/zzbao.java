package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbao {
    final /* synthetic */ zzbaq zza;
    private final byte[] zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbao(zzbaq zzbaqVar, byte[] bArr, zzbap zzbapVar) {
        this.zza = zzbaqVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzbaq zzbaqVar = this.zza;
            if (zzbaqVar.zzb) {
                zzbaqVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Clearcut log failed", e8);
        }
    }

    public final zzbao zza(int i10) {
        this.zzc = i10;
        return this;
    }

    public final synchronized void zzc() {
        ExecutorService executorService;
        executorService = this.zza.zzc;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzban
            @Override // java.lang.Runnable
            public final void run() {
                zzbao.this.zzd();
            }
        });
    }
}
