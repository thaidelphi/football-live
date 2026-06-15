package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzesw implements zzerw {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbxw zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzesw(zzbxw zzbxwVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z10, boolean z11) {
        this.zzg = zzbxwVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i10;
        this.zze = z10;
        this.zzf = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        r1 = com.google.android.gms.internal.ads.zzfpm.zzj(r7.zza);
        java.util.Objects.requireNonNull(r8);
        r2 = r8.getId();
        java.util.Objects.requireNonNull(r2);
        r0 = r1.zzi(r2, r7.zza.getPackageName(), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbbm.zzdq)).longValue(), r7.zzf);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
        com.google.android.gms.ads.internal.zzv.zzp().zzw(r7, "AdIdInfoSignalSource.getPaidV1");
        r0 = new com.google.android.gms.internal.ads.zzfpi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbbm.zzdk)).booleanValue() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbbm.zzdl)).booleanValue() != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.google.android.gms.internal.ads.zzesx zzc(com.google.android.gms.internal.ads.zzesw r7, com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
        /*
            com.google.android.gms.internal.ads.zzfpi r0 = new com.google.android.gms.internal.ads.zzfpi
            r0.<init>()
            boolean r1 = r7.zze
            if (r1 != 0) goto L1b
            com.google.android.gms.internal.ads.zzbbd r1 = com.google.android.gms.internal.ads.zzbbm.zzdk
            com.google.android.gms.internal.ads.zzbbk r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L31
        L1b:
            boolean r1 = r7.zze
            if (r1 == 0) goto L6f
            com.google.android.gms.internal.ads.zzbbd r1 = com.google.android.gms.internal.ads.zzbbm.zzdl
            com.google.android.gms.internal.ads.zzbbk r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6f
        L31:
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzfpm r1 = com.google.android.gms.internal.ads.zzfpm.zzj(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r2 = r8.getId()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzbbd r0 = com.google.android.gms.internal.ads.zzbbm.zzdq     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzbbk r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Object r0 = r4.zzb(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            boolean r6 = r7.zzf     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzfpi r0 = r1.zzi(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            goto L6f
        L5e:
            r7 = move-exception
            goto L61
        L60:
            r7 = move-exception
        L61:
            com.google.android.gms.internal.ads.zzbyf r0 = com.google.android.gms.ads.internal.zzv.zzp()
            java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
            r0.zzw(r7, r1)
            com.google.android.gms.internal.ads.zzfpi r0 = new com.google.android.gms.internal.ads.zzfpi
            r0.<init>()
        L6f:
            com.google.android.gms.internal.ads.zzesx r7 = new com.google.android.gms.internal.ads.zzesx
            r1 = 0
            r7.<init>(r8, r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesw.zzc(com.google.android.gms.internal.ads.zzesw, com.google.android.gms.ads.identifier.AdvertisingIdClient$Info):com.google.android.gms.internal.ads.zzesx");
    }

    public static /* synthetic */ zzesx zzd(zzesw zzeswVar, Throwable th) {
        com.google.android.gms.ads.internal.client.zzbb.zzb();
        ContentResolver contentResolver = zzeswVar.zza.getContentResolver();
        return new zzesx(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzfpi());
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return (zzgag) zzgap.zze((zzgag) zzgap.zzo((zzgag) zzgap.zzm(zzgag.zzu(this.zzg.zza(this.zza, this.zzd)), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzesu
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return zzesw.zzc(zzesw.this, (AdvertisingIdClient.Info) obj);
            }
        }, this.zzc), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbe)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzesv
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return zzesw.zzd(zzesw.this, (Throwable) obj);
            }
        }, this.zzc);
    }
}
