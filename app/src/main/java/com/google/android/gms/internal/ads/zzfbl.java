package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfbl {
    private static zzfbl zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcv zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfbl(Context context, com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
        this.zzb = context;
        this.zzc = zzcvVar;
    }

    static com.google.android.gms.ads.internal.client.zzcv zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzcu.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to retrieve lite SDK info.", e8);
            return null;
        }
    }

    public static zzfbl zzd(Context context) {
        synchronized (zzfbl.class) {
            zzfbl zzfblVar = zza;
            if (zzfblVar != null) {
                return zzfblVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbdn.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcv zzcvVar = null;
            if (longValue > 0 && longValue <= 250505301) {
                zzcvVar = zza(applicationContext);
            }
            zzfbl zzfblVar2 = new zzfbl(applicationContext, zzcvVar);
            zza = zzfblVar2;
            return zzfblVar2;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzey zzg() {
        com.google.android.gms.ads.internal.client.zzcv zzcvVar = this.zzc;
        if (zzcvVar != null) {
            try {
                return zzcvVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbod zzb() {
        return (zzbod) this.zzd.get();
    }

    public final VersionInfoParcel zzc(int i10, boolean z10, int i11) {
        com.google.android.gms.ads.internal.client.zzey zzg;
        com.google.android.gms.ads.internal.zzv.zzq();
        boolean zzF = com.google.android.gms.ads.internal.util.zzs.zzF(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(250505300, i11, true, zzF);
        return (((Boolean) zzbdn.zzc.zze()).booleanValue() && (zzg = zzg()) != null) ? new VersionInfoParcel(250505300, zzg.zza(), true, zzF) : versionInfoParcel;
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzey zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(com.google.android.gms.internal.ads.zzbod r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbcw r0 = com.google.android.gms.internal.ads.zzbdn.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L22
            com.google.android.gms.ads.internal.client.zzcv r0 = r3.zzc
            if (r0 != 0) goto L15
        L13:
            r0 = r1
            goto L19
        L15:
            com.google.android.gms.internal.ads.zzbod r0 = r0.getAdapterCreator()     // Catch: android.os.RemoteException -> L13
        L19:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 == 0) goto L1e
            r4 = r0
        L1e:
            com.google.android.gms.internal.ads.zzfbk.zza(r2, r1, r4)
            return
        L22:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzfbk.zza(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbl.zzf(com.google.android.gms.internal.ads.zzbod):void");
    }
}
