package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzzz implements zzbz {
    public static final /* synthetic */ int zza = 0;

    static {
        zzftr.zza(new zzftn() { // from class: com.google.android.gms.internal.ads.zzzy
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object zza() {
                int i10 = zzzz.zza;
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object invoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                    Objects.requireNonNull(invoke);
                    return (zzbz) invoke;
                } catch (Exception e8) {
                    throw new IllegalStateException(e8);
                }
            }
        });
    }

    private zzzz() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzzz(zzaab zzaabVar) {
    }
}
