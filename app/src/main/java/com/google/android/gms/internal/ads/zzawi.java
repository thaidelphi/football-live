package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzawi extends zzaws {
    private List zzh;
    private final Context zzi;

    public zzawi(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11, Context context) {
        super(zzavfVar, "bG+XqwiSuuiSQqDJYzFySEsAbIA1H8uMEv4Fq5XreeaHTwzYlb/A5xSXvgG7+Sns", "APVOkq0Gz4B2bIz+C2PxrsnZ7/n2oTnYdV7sM1bdTS4=", zzarfVar, i10, 31);
        this.zzh = null;
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzU(-1L);
        this.zzd.zzQ(-1L);
        Context context = this.zzi;
        if (context == null) {
            context = this.zza.zzb();
        }
        if (this.zzh == null) {
            this.zzh = (List) this.zze.invoke(null, context);
        }
        List list = this.zzh;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zzd) {
            this.zzd.zzU(((Long) this.zzh.get(0)).longValue());
            this.zzd.zzQ(((Long) this.zzh.get(1)).longValue());
        }
    }
}
