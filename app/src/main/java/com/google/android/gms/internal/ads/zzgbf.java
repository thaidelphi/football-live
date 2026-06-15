package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzf;
import com.ironsource.b9;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgbf extends zzfzf.zzi implements Runnable {
    private final Runnable zza;

    public zzgbf(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzd(th);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfzf
    public final String zza() {
        String obj = this.zza.toString();
        return "task=[" + obj + b9.i.f16698e;
    }
}
