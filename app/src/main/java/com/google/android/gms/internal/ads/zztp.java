package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zztp {
    private static final AtomicLong zza = new AtomicLong();

    public zztp(long j10, zzfw zzfwVar, long j11) {
        Uri uri = zzfwVar.zza;
        Collections.emptyMap();
    }

    public zztp(long j10, zzfw zzfwVar, Uri uri, Map map, long j11, long j12, long j13) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }
}
