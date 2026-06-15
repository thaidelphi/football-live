package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzayf {
    private final Object zza = new Object();
    private zzayd zzb = null;
    private boolean zzc = false;

    public final Activity zza() {
        synchronized (this.zza) {
            zzayd zzaydVar = this.zzb;
            if (zzaydVar != null) {
                return zzaydVar.zza();
            }
            return null;
        }
    }

    public final Context zzb() {
        synchronized (this.zza) {
            zzayd zzaydVar = this.zzb;
            if (zzaydVar != null) {
                return zzaydVar.zzb();
            }
            return null;
        }
    }

    public final void zzc(zzaye zzayeVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzayd();
            }
            this.zzb.zzf(zzayeVar);
        }
    }

    public final void zzd(Context context) {
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Can not cast Context to Application");
                    return;
                }
                if (this.zzb == null) {
                    this.zzb = new zzayd();
                }
                this.zzb.zzg(application, context);
                this.zzc = true;
            }
        }
    }

    public final void zze(zzaye zzayeVar) {
        synchronized (this.zza) {
            zzayd zzaydVar = this.zzb;
            if (zzaydVar == null) {
                return;
            }
            zzaydVar.zzh(zzayeVar);
        }
    }
}
