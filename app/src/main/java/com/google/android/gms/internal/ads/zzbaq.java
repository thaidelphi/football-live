package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbaq {
    zzaxg zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzbaq() {
        this.zzc = com.google.android.gms.ads.internal.util.client.zzb.zzb;
    }

    public zzbaq(final Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbal
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfa)).booleanValue();
                zzbaq zzbaqVar = zzbaq.this;
                Context context2 = context;
                if (booleanValue) {
                    try {
                        zzbaqVar.zza = (zzaxg) com.google.android.gms.ads.internal.util.client.zzs.zzb(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzbam
                            @Override // com.google.android.gms.ads.internal.util.client.zzq
                            public final Object zza(Object obj) {
                                return zzaxf.zzb((IBinder) obj);
                            }
                        });
                        zzbaqVar.zza.zze(ObjectWrapper.u0(context2), "GMA_SDK");
                        zzbaqVar.zzb = true;
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.zzo.zze("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
