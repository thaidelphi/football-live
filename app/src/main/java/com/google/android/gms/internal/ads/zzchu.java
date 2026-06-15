package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzchu implements zzexz {
    private final zzcha zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzr zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzchu(zzcha zzchaVar, zzcie zzcieVar) {
        this.zza = zzchaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexz
    public final /* bridge */ /* synthetic */ zzexz zza(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Objects.requireNonNull(zzrVar);
        this.zzd = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexz
    public final /* bridge */ /* synthetic */ zzexz zzb(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexz
    public final /* bridge */ /* synthetic */ zzexz zzc(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexz
    public final zzeya zzd() {
        zzhds.zzc(this.zzb, Context.class);
        zzhds.zzc(this.zzc, String.class);
        zzhds.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzr.class);
        return new zzchv(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
