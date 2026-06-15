package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbod;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzl extends RemoteCreator {
    public zzl() {
        super("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return queryLocalInterface instanceof zzci ? (zzci) queryLocalInterface : new zzci(iBinder);
    }

    public final zzch zza(Context context, zzbod zzbodVar) {
        zzch zzcfVar;
        try {
            IBinder zze = ((zzci) getRemoteCreatorInstance(context)).zze(ObjectWrapper.u0(context), zzbodVar, 250505300);
            if (zze == null) {
                zzcfVar = null;
            } else {
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzcfVar = queryLocalInterface instanceof zzch ? (zzch) queryLocalInterface : new zzcf(zze);
            }
            zzcfVar.zzh(zzbodVar);
            return zzcfVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not get remote AdPreloaderCreator.", e8);
            return null;
        }
    }
}
