package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzatw {
    protected volatile Boolean zzb;
    private final zzavf zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    protected static volatile zzfnq zza = null;
    private static volatile Random zzd = null;

    public zzatw(zzavf zzavfVar) {
        this.zze = zzavfVar;
        zzavfVar.zzj().execute(new zzatv(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zzd == null) {
                synchronized (zzatw.class) {
                    if (zzd == null) {
                        zzd = new Random();
                    }
                }
            }
            return zzd.nextInt();
        }
    }

    public final void zzc(int i10, int i11, long j10, String str, Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzaql zza2 = zzaqp.zza();
            zza2.zza(this.zze.zza.getPackageName());
            zza2.zze(j10);
            if (str != null) {
                zza2.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zza2.zzf(stringWriter.toString());
                zza2.zzd(exc.getClass().getName());
            }
            zzfno zza3 = zza.zza(((zzaqp) zza2.zzbr()).zzaV());
            zza3.zza(i10);
            if (i11 != -1) {
                zza3.zzb(i11);
            }
            zza3.zzc();
        } catch (Exception unused) {
        }
    }
}
