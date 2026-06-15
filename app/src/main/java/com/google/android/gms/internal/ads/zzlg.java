package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzlg {
    public static final zzlg zza;
    public static final zzlg zzb;
    public final long zzc;
    public final long zzd;

    static {
        zzlg zzlgVar = new zzlg(0L, 0L);
        zza = zzlgVar;
        new zzlg(Long.MAX_VALUE, Long.MAX_VALUE);
        new zzlg(Long.MAX_VALUE, 0L);
        new zzlg(0L, Long.MAX_VALUE);
        zzb = zzlgVar;
    }

    public zzlg(long j10, long j11) {
        zzcv.zzd(j10 >= 0);
        zzcv.zzd(j11 >= 0);
        this.zzc = j10;
        this.zzd = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlg.class == obj.getClass()) {
            zzlg zzlgVar = (zzlg) obj;
            if (this.zzc == zzlgVar.zzc && this.zzd == zzlgVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzc) * 31) + ((int) this.zzd);
    }
}
