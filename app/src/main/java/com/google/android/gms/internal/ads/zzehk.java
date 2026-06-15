package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzehk {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdnv zzb;

    public zzehk(zzdnv zzdnvVar) {
        this.zzb = zzdnvVar;
    }

    public final zzbqc zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbqc) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e8);
        }
    }
}
