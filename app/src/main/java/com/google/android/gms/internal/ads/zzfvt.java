package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfvt extends zzftv {
    private final zzfvv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvt(zzfvv zzfvvVar, int i10) {
        super(zzfvvVar.size(), i10);
        this.zza = zzfvvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftv
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
