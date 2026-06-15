package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfrv {
    private final Context zzb;
    private final zzfrw zzc;
    private boolean zzf;
    private final Intent zzg;
    private ServiceConnection zzi;
    private IInterface zzj;
    private final List zze = new ArrayList();
    private final String zzd = "OverlayDisplayService";
    private final zzftn zza = zzftr.zza(new zzftn("OverlayDisplayService") { // from class: com.google.android.gms.internal.ads.zzfrm
        public final /* synthetic */ String zza = "OverlayDisplayService";

        @Override // com.google.android.gms.internal.ads.zzftn
        public final Object zza() {
            HandlerThread handlerThread = new HandlerThread(this.zza, 10);
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    });
    private final IBinder.DeathRecipient zzh = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzfrn
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzfrv.zzh(zzfrv.this);
        }
    };

    public zzfrv(Context context, zzfrw zzfrwVar, String str, Intent intent, zzfra zzfraVar) {
        this.zzb = context;
        this.zzc = zzfrwVar;
        this.zzg = intent;
    }

    public static /* bridge */ /* synthetic */ IBinder.DeathRecipient zza(zzfrv zzfrvVar) {
        return zzfrvVar.zzh;
    }

    public static /* bridge */ /* synthetic */ IInterface zzb(zzfrv zzfrvVar) {
        return zzfrvVar.zzj;
    }

    public static /* bridge */ /* synthetic */ zzfrw zzd(zzfrv zzfrvVar) {
        return zzfrvVar.zzc;
    }

    public static /* bridge */ /* synthetic */ List zze(zzfrv zzfrvVar) {
        return zzfrvVar.zze;
    }

    public static /* synthetic */ void zzf(zzfrv zzfrvVar, Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e8) {
            zzfrvVar.zzc.zza("error caused by ", e8);
        }
    }

    public static /* synthetic */ void zzg(zzfrv zzfrvVar, Runnable runnable) {
        if (zzfrvVar.zzj == null && !zzfrvVar.zzf) {
            zzfrvVar.zzc.zzc("Initiate binding to the service.", new Object[0]);
            synchronized (zzfrvVar.zze) {
                zzfrvVar.zze.add(runnable);
            }
            zzfrt zzfrtVar = new zzfrt(zzfrvVar, null);
            zzfrvVar.zzi = zzfrtVar;
            zzfrvVar.zzf = true;
            if (zzfrvVar.zzb.bindService(zzfrvVar.zzg, zzfrtVar, 1)) {
                return;
            }
            zzfrvVar.zzc.zzc("Failed to bind to the service.", new Object[0]);
            zzfrvVar.zzf = false;
            synchronized (zzfrvVar.zze) {
                zzfrvVar.zze.clear();
            }
        } else if (zzfrvVar.zzf) {
            zzfrvVar.zzc.zzc("Waiting to bind to the service.", new Object[0]);
            synchronized (zzfrvVar.zze) {
                zzfrvVar.zze.add(runnable);
            }
        } else {
            runnable.run();
        }
    }

    public static /* synthetic */ void zzh(zzfrv zzfrvVar) {
        zzfrvVar.zzc.zzc("%s : Binder has died.", zzfrvVar.zzd);
        synchronized (zzfrvVar.zze) {
            zzfrvVar.zze.clear();
        }
    }

    public static /* synthetic */ void zzi(zzfrv zzfrvVar) {
        if (zzfrvVar.zzj != null) {
            zzfrvVar.zzc.zzc("Unbind from service.", new Object[0]);
            Context context = zzfrvVar.zzb;
            ServiceConnection serviceConnection = zzfrvVar.zzi;
            Objects.requireNonNull(serviceConnection);
            context.unbindService(serviceConnection);
            zzfrvVar.zzf = false;
            zzfrvVar.zzj = null;
            zzfrvVar.zzi = null;
            synchronized (zzfrvVar.zze) {
                zzfrvVar.zze.clear();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzj(zzfrv zzfrvVar, boolean z10) {
        zzfrvVar.zzf = false;
    }

    public static /* bridge */ /* synthetic */ void zzk(zzfrv zzfrvVar, IInterface iInterface) {
        zzfrvVar.zzj = iInterface;
    }

    public final void zzo(final Runnable runnable) {
        ((Handler) this.zza.zza()).post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfro
            @Override // java.lang.Runnable
            public final void run() {
                zzfrv.zzf(zzfrv.this, runnable);
            }
        });
    }

    public final IInterface zzc() {
        return this.zzj;
    }

    public final void zzm(final Runnable runnable) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrp
            @Override // java.lang.Runnable
            public final void run() {
                zzfrv.zzg(zzfrv.this, runnable);
            }
        });
    }

    public final void zzn() {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrq
            @Override // java.lang.Runnable
            public final void run() {
                zzfrv.zzi(zzfrv.this);
            }
        });
    }
}
