package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzak {
    public final Uri zza;
    public final String zzb;
    public final zzah zzc;
    public final zzac zzd;
    public final List zze;
    public final String zzf;
    public final zzfvv zzg;
    public final Object zzh;
    public final long zzi;

    static {
        int i10 = zzeh.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzak(Uri uri, String str, zzah zzahVar, zzac zzacVar, List list, String str2, zzfvv zzfvvVar, Object obj, long j10, zzao zzaoVar) {
        this.zza = uri;
        int i10 = zzay.zza;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzfvvVar;
        int i11 = zzfvv.zzd;
        zzfvs zzfvsVar = new zzfvs();
        if (zzfvvVar.size() <= 0) {
            zzfvsVar.zzi();
            this.zzh = null;
            this.zzi = -9223372036854775807L;
            return;
        }
        zzan zzanVar = (zzan) zzfvvVar.get(0);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzak) {
            zzak zzakVar = (zzak) obj;
            if (this.zza.equals(zzakVar.zza)) {
                int i10 = zzeh.zza;
                if (this.zze.equals(zzakVar.zze) && this.zzg.equals(zzakVar.zzg) && Objects.equals(-9223372036854775807L, -9223372036854775807L)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (int) (((((((this.zza.hashCode() * 923521) + this.zze.hashCode()) * 961) + this.zzg.hashCode()) * 31) * 31) - Long.MAX_VALUE);
    }
}
