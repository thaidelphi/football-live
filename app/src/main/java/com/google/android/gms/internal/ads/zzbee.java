package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbee {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbec zza() {
        return (zzbec) zza.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbed zzb() {
        return (zzbed) zzb.get();
    }

    public static void zzc(zzbec zzbecVar) {
        zza.set(zzbecVar);
    }
}
