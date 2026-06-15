package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzavz extends zzaws {
    private final Map zzh;
    private final View zzi;
    private final Context zzj;

    public zzavz(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11, Map map, View view, Context context) {
        super(zzavfVar, "W0Fet8GxcnKamBNZPK56yKE5tlEUkRkhJrfykhnxCthEGE3dgE5YcOONa3GOhJDD", "RFqgxDe56AlBv7LhYOQj7p8AeiYxusgi8LK0zEO/OSM=", zzarfVar, i10, 85);
        this.zzh = map;
        this.zzi = view;
        this.zzj = context;
    }

    private final long zzb(int i10) {
        Map map = this.zzh;
        Integer valueOf = Integer.valueOf(i10);
        if (map.containsKey(valueOf)) {
            return ((Long) this.zzh.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {zzb(1), zzb(2)};
        Context context = this.zzj;
        if (context == null) {
            context = this.zza.zzb();
        }
        long[] jArr2 = (long[]) this.zze.invoke(null, jArr, context, this.zzi);
        long j10 = jArr2[0];
        this.zzh.put(1, Long.valueOf(jArr2[1]));
        long j11 = jArr2[2];
        this.zzh.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.zzd) {
            this.zzd.zzt(j10);
            this.zzd.zzs(j11);
        }
    }
}
