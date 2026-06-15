package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfjo implements zzfjr {
    private static final zzfjo zza = new zzfjo(new zzfjs());
    private Date zzb;
    private boolean zzc;
    private final zzfjs zzd;
    private boolean zze;

    private zzfjo(zzfjs zzfjsVar) {
        this.zzd = zzfjsVar;
    }

    public static zzfjo zza() {
        return zza;
    }

    public final Date zzb() {
        Date date = this.zzb;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfjr
    public final void zzc(boolean z10) {
        if (!this.zze && z10) {
            Date date = new Date();
            Date date2 = this.zzb;
            if (date2 == null || date.after(date2)) {
                this.zzb = date;
                if (this.zzc) {
                    for (zzfiz zzfizVar : zzfjq.zza().zzb()) {
                        zzfizVar.zzg().zzg(zzb());
                    }
                }
            }
        }
        this.zze = z10;
    }

    public final void zzd(Context context) {
        if (this.zzc) {
            return;
        }
        this.zzd.zzd(context);
        this.zzd.zze(this);
        this.zzd.zzf();
        this.zze = this.zzd.zza;
        this.zzc = true;
    }
}
