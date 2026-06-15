package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfpq extends zzfzf {
    Object zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpq(Object obj, Runnable runnable) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfzf
    public final String zza() {
        Object obj = this.zza;
        return obj == null ? "" : obj.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfzf
    protected final void zzb() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfzf
    public final boolean zzc(Object obj) {
        return super.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfzf
    public final boolean zzd(Throwable th) {
        return super.zzd(th);
    }
}
