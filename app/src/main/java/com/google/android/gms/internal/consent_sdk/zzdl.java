package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdl implements zzdk {
    private final Object zza;

    private zzdl(Object obj) {
        this.zza = obj;
    }

    public static zzdk zzb(Object obj) {
        Objects.requireNonNull(obj, "instance cannot be null");
        return new zzdl(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdp, com.google.android.gms.internal.consent_sdk.zzdo
    public final Object zza() {
        return this.zza;
    }
}
