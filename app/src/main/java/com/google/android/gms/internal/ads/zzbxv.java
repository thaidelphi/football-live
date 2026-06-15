package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbxv implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbyu zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxv(zzbxw zzbxwVar, Context context, zzbyu zzbyuVar) {
        this.zza = context;
        this.zzb = zzbyuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e8) {
            this.zzb.zzd(e8);
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception while getting advertising Id info", e8);
        }
    }
}
