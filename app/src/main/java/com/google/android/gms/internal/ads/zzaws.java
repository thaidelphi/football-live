package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzaws implements Callable {
    protected final zzavf zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzarf zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzaws(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11) {
        this.zza = zzavfVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzarfVar;
        this.zzf = i10;
        this.zzg = i11;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        int i10;
        try {
            long nanoTime = System.nanoTime();
            Method zzi = this.zza.zzi(this.zzb, this.zzc);
            this.zze = zzi;
            if (zzi == null) {
                return null;
            }
            zza();
            zzatw zzd = this.zza.zzd();
            if (zzd == null || (i10 = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzd.zzc(this.zzg, i10, (System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;
}
