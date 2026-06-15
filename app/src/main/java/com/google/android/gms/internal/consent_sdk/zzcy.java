package com.google.android.gms.internal.consent_sdk;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcy extends zzcv {
    private final zzda zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcy(zzda zzdaVar, int i10) {
        super(zzdaVar.size(), i10);
        this.zza = zzdaVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcv
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
