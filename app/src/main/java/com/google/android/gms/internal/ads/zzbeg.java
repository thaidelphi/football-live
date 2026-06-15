package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbeg {
    private final Context zza;

    public zzbeg(Context context) {
        this.zza = context;
    }

    public final void zza(zzbth zzbthVar) {
        try {
            ((zzbeh) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzbef
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return queryLocalInterface instanceof zzbeh ? (zzbeh) queryLocalInterface : new zzbeh(iBinder);
                }
            })).zze(zzbthVar);
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e8.getMessage())));
        } catch (com.google.android.gms.ads.internal.util.client.zzr e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e10.getMessage())));
        }
    }
}
