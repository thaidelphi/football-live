package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbvu {
    public static final zzbvi zza(Context context, String str, zzbod zzbodVar) {
        try {
            IBinder zze = ((zzbvm) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzbvt
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return queryLocalInterface instanceof zzbvm ? (zzbvm) queryLocalInterface : new zzbvm(iBinder);
                }
            })).zze(ObjectWrapper.u0(context), str, zzbodVar, 250505300);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzbvi ? (zzbvi) queryLocalInterface : new zzbvg(zze);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
            return null;
        }
    }
}
