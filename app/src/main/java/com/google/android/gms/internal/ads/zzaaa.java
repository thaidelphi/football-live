package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaaa implements zzbi {
    private final zzbz zza;

    public zzaaa(zzbz zzbzVar) {
        this.zza = zzbzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbi
    public final zzbj zza(Context context, zzk zzkVar, zzn zznVar, zzcb zzcbVar, Executor executor, zzbx zzbxVar, List list, long j10) throws zzby {
        Constructor<?> constructor;
        Object[] objArr;
        try {
            constructor = Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(zzbz.class);
            objArr = new Object[1];
        } catch (Exception e8) {
            e = e8;
        }
        try {
            objArr[0] = this.zza;
            return ((zzbi) constructor.newInstance(objArr)).zza(context, zzkVar, zznVar, zzcbVar, executor, zzbxVar, list, 0L);
        } catch (Exception e10) {
            e = e10;
            if (e instanceof zzby) {
                throw ((zzby) e);
            }
            throw new zzby(e, -9223372036854775807L);
        }
    }
}
