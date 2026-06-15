package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzje implements zzkg {
    private final Object zza;
    private zzbn zzb;

    public zzje(Object obj, zztt zzttVar) {
        this.zza = obj;
        this.zzb = zzttVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final zzbn zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final Object zzb() {
        return this.zza;
    }

    public final void zzc(zzbn zzbnVar) {
        this.zzb = zzbnVar;
    }
}
