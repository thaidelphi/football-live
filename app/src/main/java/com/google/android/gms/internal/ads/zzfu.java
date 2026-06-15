package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfu {
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public zzfu() {
        this.zzb = Collections.emptyMap();
        this.zzd = -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfu(zzfw zzfwVar, zzfv zzfvVar) {
        this.zza = zzfwVar.zza;
        this.zzb = zzfwVar.zzd;
        this.zzc = zzfwVar.zze;
        this.zzd = zzfwVar.zzf;
        this.zze = zzfwVar.zzg;
    }

    public final zzfu zza(int i10) {
        this.zze = 6;
        return this;
    }

    public final zzfu zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzfu zzc(long j10) {
        this.zzc = j10;
        return this;
    }

    public final zzfu zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzfw zze() {
        if (this.zza != null) {
            return new zzfw(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
