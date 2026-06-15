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
public final class zzi extends RemoteCreator {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbu(iBinder);
    }

    public final zzbt zza(Context context, String str, zzbod zzbodVar) {
        try {
            IBinder zze = ((zzbu) getRemoteCreatorInstance(context)).zze(ObjectWrapper.u0(context), str, zzbodVar, 250505300);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbt ? (zzbt) queryLocalInterface : new zzbr(zze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote builder for AdLoader.", e8);
            return null;
        }
    }
}
