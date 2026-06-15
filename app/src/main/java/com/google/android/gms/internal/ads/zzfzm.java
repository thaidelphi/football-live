package com.google.android.gms.internal.ads;

import com.ironsource.b9;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzfzm extends zzgaf implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    b6.a zza;
    Object zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzm(b6.a aVar, Object obj) {
        Objects.requireNonNull(aVar);
        this.zza = aVar;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b6.a aVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (aVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (!aVar.isCancelled()) {
            try {
                try {
                    Object zze = zze(obj, zzgap.zzp(aVar));
                    this.zzb = null;
                    zzf(zze);
                    return;
                } catch (Throwable th) {
                    try {
                        zzgbi.zza(th);
                        zzd(th);
                        return;
                    } finally {
                        this.zzb = null;
                    }
                }
            } catch (Error e8) {
                zzd(e8);
                return;
            } catch (CancellationException unused) {
                cancel(false);
                return;
            } catch (ExecutionException e10) {
                zzd(e10.getCause());
                return;
            } catch (Exception e11) {
                zzd(e11);
                return;
            }
        }
        zzs(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfzf
    public final String zza() {
        String str;
        b6.a aVar = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (aVar != null) {
            str = "inputFuture=[" + aVar.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (zza != null) {
                return str.concat(zza);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + b9.i.f16698e;
    }

    @Override // com.google.android.gms.internal.ads.zzfzf
    protected final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    abstract Object zze(Object obj, Object obj2) throws Exception;

    abstract void zzf(Object obj);
}
