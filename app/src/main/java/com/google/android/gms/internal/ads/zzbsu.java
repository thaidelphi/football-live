package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbsu {
    private static zzbxn zza;
    private final Context zzb;
    private final AdFormat zzc;
    private final com.google.android.gms.ads.internal.client.zzeh zzd;
    private final String zze;

    public zzbsu(Context context, AdFormat adFormat, com.google.android.gms.ads.internal.client.zzeh zzehVar, String str) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzehVar;
        this.zze = str;
    }

    public static zzbxn zza(Context context) {
        zzbxn zzbxnVar;
        synchronized (zzbsu.class) {
            if (zza == null) {
                zza = com.google.android.gms.ads.internal.client.zzbb.zza().zzt(context, new zzbnz());
            }
            zzbxnVar = zza;
        }
        return zzbxnVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzm zza2;
        long currentTimeMillis = System.currentTimeMillis();
        zzbxn zza3 = zza(this.zzb);
        if (zza3 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzeh zzehVar = this.zzd;
        IObjectWrapper u02 = ObjectWrapper.u0(context);
        if (zzehVar == null) {
            com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
            zznVar.zzg(currentTimeMillis);
            zza2 = zznVar.zza();
        } else {
            zzehVar.zzo(currentTimeMillis);
            zza2 = com.google.android.gms.ads.internal.client.zzq.zza.zza(this.zzb, this.zzd);
        }
        try {
            zza3.zzf(u02, new zzbxr(this.zze, this.zzc.name(), null, zza2, 0, null), new zzbst(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
