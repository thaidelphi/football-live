package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaog {
    private final Executor zza;

    public zzaog(Handler handler) {
        this.zza = new zzaoe(this, handler);
    }

    public final void zza(zzaop zzaopVar, zzaoy zzaoyVar) {
        zzaopVar.zzm("post-error");
        ((zzaoe) this.zza).zza.post(new zzaof(zzaopVar, zzaov.zza(zzaoyVar), null));
    }

    public final void zzb(zzaop zzaopVar, zzaov zzaovVar, Runnable runnable) {
        zzaopVar.zzq();
        zzaopVar.zzm("post-response");
        ((zzaoe) this.zza).zza.post(new zzaof(zzaopVar, zzaovVar, runnable));
    }
}
