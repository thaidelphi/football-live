package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzawr {
    private final zzavf zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzawr(zzavf zzavfVar, String str, String str2, Class... clsArr) {
        this.zza = zzavfVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzavfVar.zzj().submit(new zzawq(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(zzawr zzawrVar) {
        try {
            zzavf zzavfVar = zzawrVar.zza;
            Class loadClass = zzavfVar.zzh().loadClass(zzawrVar.zzc(zzavfVar.zzs(), zzawrVar.zzb));
            if (loadClass != null) {
                zzawrVar.zzd = loadClass.getMethod(zzawrVar.zzc(zzawrVar.zza.zzs(), zzawrVar.zzc), zzawrVar.zze);
            }
        } catch (zzauj | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            zzawrVar.zzf.countDown();
            throw th;
        }
        zzawrVar.zzf.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzauj, UnsupportedEncodingException {
        return new String(this.zza.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
