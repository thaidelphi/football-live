package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdv {
    private static zzdv zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    private int zze = 0;

    private zzdv(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzdt(this, null), intentFilter);
    }

    public static synchronized zzdv zzb(Context context) {
        zzdv zzdvVar;
        synchronized (zzdv.class) {
            if (zza == null) {
                zza = new zzdv(context);
            }
            zzdvVar = zza;
        }
        return zzdvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzc(zzdv zzdvVar, int i10) {
        synchronized (zzdvVar.zzd) {
            if (zzdvVar.zze == i10) {
                return;
            }
            zzdvVar.zze = i10;
            Iterator it = zzdvVar.zzc.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zzyf zzyfVar = (zzyf) weakReference.get();
                if (zzyfVar != null) {
                    zzyfVar.zza.zzl(i10);
                } else {
                    zzdvVar.zzc.remove(weakReference);
                }
            }
        }
    }

    public final int zza() {
        int i10;
        synchronized (this.zzd) {
            i10 = this.zze;
        }
        return i10;
    }

    public final void zzd(final zzyf zzyfVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzyfVar));
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdr
            @Override // java.lang.Runnable
            public final void run() {
                zzyfVar.zza.zzl(zzdv.this.zza());
            }
        });
    }
}
