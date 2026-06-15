package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzavx implements Callable {
    private final zzavf zza;
    private final zzarf zzb;

    public zzavx(zzavf zzavfVar, zzarf zzarfVar) {
        this.zza = zzavfVar;
        this.zzb = zzarfVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzk() != null) {
            this.zza.zzk().get();
        }
        zzasa zzc = this.zza.zzc();
        if (zzc != null) {
            try {
                synchronized (this.zzb) {
                    this.zzb.zzaY(zzc.zzaV(), zzgvu.zza());
                }
                return null;
            } catch (zzgwz | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
