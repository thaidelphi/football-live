package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbft {
    private final zzbfs zza;

    public zzbft(zzbfs zzbfsVar) {
        Context context;
        this.zza = zzbfsVar;
        try {
            context = (Context) ObjectWrapper.t0(zzbfsVar.zzh());
        } catch (RemoteException | NullPointerException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzs(ObjectWrapper.u0(new MediaView(context)));
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e10);
            }
        }
    }

    public final zzbfs zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            return null;
        }
    }
}
