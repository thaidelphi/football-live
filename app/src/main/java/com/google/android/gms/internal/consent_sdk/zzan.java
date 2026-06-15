package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzan implements zzdk {
    private final zzdp zza;

    public zzan(zzdp zzdpVar) {
        this.zza = zzdpVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdp, com.google.android.gms.internal.consent_sdk.zzdo
    public final /* bridge */ /* synthetic */ Object zza() {
        return new zzam((Application) this.zza.zza());
    }
}
