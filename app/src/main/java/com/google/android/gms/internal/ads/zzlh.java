package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzlh {
    private final zzib zza;

    @Deprecated
    public zzlh(Context context, zzccw zzccwVar) {
        this.zza = new zzib(context, zzccwVar);
    }

    @Deprecated
    public final zzlh zza(final zzjx zzjxVar) {
        zzib zzibVar = this.zza;
        zzcv.zzf(!zzibVar.zzr);
        Objects.requireNonNull(zzjxVar);
        zzibVar.zzf = new zzftn() { // from class: com.google.android.gms.internal.ads.zzht
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                return zzjx.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlh zzb(final zzxv zzxvVar) {
        zzib zzibVar = this.zza;
        zzcv.zzf(!zzibVar.zzr);
        Objects.requireNonNull(zzxvVar);
        zzibVar.zze = new zzftn() { // from class: com.google.android.gms.internal.ads.zzia
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                return zzxv.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzli zzc() {
        zzib zzibVar = this.zza;
        zzcv.zzf(!zzibVar.zzr);
        zzibVar.zzr = true;
        return new zzli(zzibVar);
    }
}
