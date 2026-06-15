package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzag {
    private Application zza;

    private zzag() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzag(zzaj zzajVar) {
    }

    public final zza zza() {
        zzdm.zzb(this.zza, Application.class);
        return new zzaf(this.zza, null);
    }

    public final zzag zzb(Application application) {
        Objects.requireNonNull(application);
        this.zza = application;
        return this;
    }
}
