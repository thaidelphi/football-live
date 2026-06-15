package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzewz {
    public static void zza(AtomicReference atomicReference, zzewy zzewyVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzewyVar.zza(obj);
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        } catch (NullPointerException e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }
}
