package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzelu implements zzerw {
    private final zzgba zza;
    private final VersionInfoParcel zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzelu(VersionInfoParcel versionInfoParcel, zzgba zzgbaVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzgbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzelt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzelv zzc;
                zzc = zzelv.zzc(zzelu.this.zzb);
                return zzc;
            }
        });
    }
}
