package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.ironsource.b9;
import com.ironsource.in;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfw {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzaq.zzb("media3.datasource");
    }

    private zzfw(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        boolean z10 = false;
        boolean z11 = j11 >= 0;
        zzcv.zzd(z11);
        zzcv.zzd(z11);
        if (j12 <= 0) {
            j12 = j12 == -1 ? -1L : j12;
            zzcv.zzd(z10);
            Objects.requireNonNull(uri);
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zze = j11;
            this.zzf = j12;
            this.zzg = i11;
        }
        z10 = true;
        zzcv.zzd(z10);
        Objects.requireNonNull(uri);
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j11;
        this.zzf = j12;
        this.zzg = i11;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "DataSpec[" + in.f17848a + " " + obj + ", " + this.zze + ", " + this.zzf + ", null, " + this.zzg + b9.i.f16698e;
    }

    public final zzfu zza() {
        return new zzfu(this, null);
    }

    public final boolean zzb(int i10) {
        return (this.zzg & i10) == i10;
    }

    @Deprecated
    public zzfw(Uri uri, long j10, long j11, String str) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, null, 0, null);
    }
}
