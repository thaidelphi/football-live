package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbnv {
    private static zzbnv zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    zzbnv() {
    }

    public static zzbnv zza() {
        if (zza == null) {
            zza = new zzbnv();
        }
        return zza;
    }

    public final Thread zzb(final Context context, final String str) {
        if (this.zzb.compareAndSet(false, true)) {
            Thread thread = new Thread(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbnu
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    zzbbm.zza(context2);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaG)).booleanValue()) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("measurementEnabled", ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzav)).booleanValue());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaC)).booleanValue()) {
                        bundle.putString("ad_storage", "denied");
                        bundle.putString("analytics_storage", "denied");
                    }
                    try {
                        ((zzcfp) com.google.android.gms.ads.internal.util.client.zzs.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzbnt
                            @Override // com.google.android.gms.ads.internal.util.client.zzq
                            public final Object zza(Object obj) {
                                return zzcfo.zzb((IBinder) obj);
                            }
                        })).zze(ObjectWrapper.u0(context2), new zzbns(AppMeasurementSdk.k(context2, "FA-Ads", "am", str, bundle)));
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e8) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
                    }
                }
            });
            thread.start();
            return thread;
        }
        return null;
    }
}
