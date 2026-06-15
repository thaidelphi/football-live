package com.google.android.gms.internal.measurement;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzdu extends zzch {
    private final com.google.android.gms.measurement.internal.zzgy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdu(com.google.android.gms.measurement.internal.zzgy zzgyVar) {
        this.zza = zzgyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j10) {
        this.zza.a(str, str2, bundle, j10);
    }
}
