package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzazs {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzazo(this);
    private final Object zzc = new Object();
    private zzazv zzd;
    private Context zze;
    private zzazy zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzh(zzazs zzazsVar) {
        synchronized (zzazsVar.zzc) {
            zzazv zzazvVar = zzazsVar.zzd;
            if (zzazvVar == null) {
                return;
            }
            if (zzazvVar.isConnected() || zzazsVar.zzd.isConnecting()) {
                zzazsVar.zzd.disconnect();
            }
            zzazsVar.zzd = null;
            zzazsVar.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                zzazv zzd = zzd(new zzazq(this), new zzazr(this));
                this.zzd = zzd;
                zzd.checkAvailabilityAndConnect();
            }
        }
    }

    public final long zza(zzazw zzazwVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zze(zzazwVar);
                } catch (RemoteException e8) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call into cache service.", e8);
                }
            }
            return -2L;
        }
    }

    public final zzazt zzb(zzazw zzazwVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzazt();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzazwVar);
                }
                return this.zzf.zzf(zzazwVar);
            } catch (RemoteException e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call into cache service.", e8);
                return new zzazt();
            }
        }
    }

    protected final synchronized zzazv zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzazv(this.zze, com.google.android.gms.ads.internal.zzv.zzu().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zze != null) {
                return;
            }
            this.zze = context.getApplicationContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzen)).booleanValue()) {
                zzl();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzem)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzb().zzc(new zzazp(this));
                }
            }
        }
    }

    public final void zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeo)).booleanValue()) {
            synchronized (this.zzc) {
                zzl();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzbyp.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzep)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
