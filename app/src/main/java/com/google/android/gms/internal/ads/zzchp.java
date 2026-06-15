package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzchp implements zzdrp {
    private final zzcha zza;
    private Context zzb;
    private zzbjn zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzchp(zzcha zzchaVar, zzcie zzcieVar) {
        this.zza = zzchaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdrp
    public final /* bridge */ /* synthetic */ zzdrp zza(zzbjn zzbjnVar) {
        Objects.requireNonNull(zzbjnVar);
        this.zzc = zzbjnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdrp
    public final /* bridge */ /* synthetic */ zzdrp zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdrp
    public final zzdrq zzc() {
        zzhds.zzc(this.zzb, Context.class);
        zzhds.zzc(this.zzc, zzbjn.class);
        return new zzchq(this.zza, this.zzb, this.zzc, null);
    }
}
