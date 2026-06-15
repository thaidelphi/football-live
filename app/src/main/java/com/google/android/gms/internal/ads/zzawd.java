package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzawd extends zzaws {
    private final zzaui zzh;
    private final long zzi;
    private final long zzj;

    public zzawd(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11, zzaui zzauiVar, long j10, long j11) {
        super(zzavfVar, "KjFacdNn5PPWCLQokyVsHYZkpB7lI2vjo8OL1Ig4+GFqroO1kDAlu4WZvBEp2Hv+", "4bybCIkxTAtnHNWCdmL1dmda4M1ht3MZm0TchEEbK5g=", zzarfVar, i10, 11);
        this.zzh = zzauiVar;
        this.zzi = j10;
        this.zzj = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaui zzauiVar = this.zzh;
        if (zzauiVar != null) {
            zzaug zzaugVar = new zzaug((String) this.zze.invoke(null, zzauiVar.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)));
            synchronized (this.zzd) {
                this.zzd.zzx(zzaugVar.zza.longValue());
                if (zzaugVar.zzb.longValue() >= 0) {
                    this.zzd.zzO(zzaugVar.zzb.longValue());
                }
                if (zzaugVar.zzc.longValue() >= 0) {
                    this.zzd.zzf(zzaugVar.zzc.longValue());
                }
            }
        }
    }
}
