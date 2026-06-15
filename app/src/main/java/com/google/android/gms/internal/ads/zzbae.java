package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbae implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzazw zza;
    final /* synthetic */ zzbyu zzb;
    final /* synthetic */ zzbag zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbae(zzbag zzbagVar, zzazw zzazwVar, zzbyu zzbyuVar) {
        this.zza = zzazwVar;
        this.zzb = zzbyuVar;
        this.zzc = zzbagVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z10;
        final zzazv zzazvVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            zzbag zzbagVar = this.zzc;
            z10 = zzbagVar.zzb;
            if (z10) {
                return;
            }
            zzbagVar.zzb = true;
            zzazvVar = this.zzc.zza;
            if (zzazvVar == null) {
                return;
            }
            zzgba zzgbaVar = zzbyp.zza;
            final zzazw zzazwVar = this.zza;
            final zzbyu zzbyuVar = this.zzb;
            final b6.a zza = zzgbaVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbab
                @Override // java.lang.Runnable
                public final void run() {
                    zzazt zzf;
                    zzbae zzbaeVar = zzbae.this;
                    zzazv zzazvVar2 = zzazvVar;
                    zzbyu zzbyuVar2 = zzbyuVar;
                    try {
                        zzazy zzq = zzazvVar2.zzq();
                        boolean zzp = zzazvVar2.zzp();
                        zzazw zzazwVar2 = zzazwVar;
                        if (zzp) {
                            zzf = zzq.zzg(zzazwVar2);
                        } else {
                            zzf = zzq.zzf(zzazwVar2);
                        }
                        if (!zzf.zze()) {
                            zzbyuVar2.zzd(new RuntimeException("No entry contents."));
                            zzbag.zze(zzbaeVar.zzc);
                            return;
                        }
                        zzbad zzbadVar = new zzbad(zzbaeVar, zzf.zzc(), 1);
                        int read = zzbadVar.read();
                        if (read != -1) {
                            zzbadVar.unread(read);
                            zzbyuVar2.zzc(zzbai.zzb(zzbadVar, zzf.zzd(), zzf.zzg(), zzf.zza(), zzf.zzf()));
                            return;
                        }
                        throw new IOException("Unable to read from cache.");
                    } catch (RemoteException | IOException e8) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to obtain a cache service instance.", e8);
                        zzbyuVar2.zzd(e8);
                        zzbag.zze(zzbaeVar.zzc);
                    }
                }
            });
            final zzbyu zzbyuVar2 = this.zzb;
            zzbyuVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbac
                @Override // java.lang.Runnable
                public final void run() {
                    if (zzbyu.this.isCancelled()) {
                        zza.cancel(true);
                    }
                }
            }, zzbyp.zzg);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
    }
}
