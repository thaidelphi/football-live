package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbgv extends RemoteCreator {
    public zzbgv() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof zzbfl ? (zzbfl) queryLocalInterface : new zzbfj(iBinder);
    }

    public final zzbfi zza(View view, HashMap hashMap, HashMap hashMap2) {
        try {
            IBinder zze = ((zzbfl) getRemoteCreatorInstance(view.getContext())).zze(ObjectWrapper.u0(view), ObjectWrapper.u0(hashMap), ObjectWrapper.u0(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return queryLocalInterface instanceof zzbfi ? (zzbfi) queryLocalInterface : new zzbfg(zze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote NativeAdViewHolderDelegate.", e8);
            return null;
        }
    }
}
