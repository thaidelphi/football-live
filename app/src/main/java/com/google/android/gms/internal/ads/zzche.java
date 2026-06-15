package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzche implements zzeuu {
    private final zzcha zza;
    private Context zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzche(zzcha zzchaVar, zzcie zzcieVar) {
        this.zza = zzchaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuu
    public final /* bridge */ /* synthetic */ zzeuu zza(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeuu
    public final /* bridge */ /* synthetic */ zzeuu zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeuu
    public final zzeuv zzc() {
        zzhds.zzc(this.zzb, Context.class);
        zzhds.zzc(this.zzc, String.class);
        return new zzchf(this.zza, this.zzb, this.zzc, null);
    }
}
