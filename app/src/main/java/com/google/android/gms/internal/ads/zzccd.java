package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzccd extends zzcbx implements zzgr {
    private static final AtomicInteger zzd = new AtomicInteger(0);
    private String zze;
    private final zzcak zzf;
    private boolean zzg;
    private final zzccc zzh;
    private final zzcbh zzi;
    private ByteBuffer zzj;
    private boolean zzk;
    private final Object zzl;
    private final String zzm;
    private final int zzn;
    private boolean zzo;

    public zzccd(zzcal zzcalVar, zzcak zzcakVar) {
        super(zzcalVar);
        this.zzf = zzcakVar;
        this.zzh = new zzccc();
        this.zzi = new zzcbh();
        this.zzl = new Object();
        this.zzm = (String) zzfst.zzd(zzcalVar != null ? zzcalVar.zzr() : null).zzb("");
        this.zzn = zzcalVar != null ? zzcalVar.zzf() : 0;
        zzd.incrementAndGet();
    }

    public static int zzi() {
        return zzd.get();
    }

    protected static final String zzv(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzg(str)));
    }

    private final void zzx() {
        int zza = (int) this.zzh.zza();
        int zza2 = (int) this.zzi.zza(this.zzj);
        int position = this.zzj.position();
        int round = Math.round(zza2 * (position / zza));
        int zzs = zzcac.zzs();
        int zzu = zzcac.zzu();
        String str = this.zze;
        zzn(str, zzv(str), position, zza, round, zza2, round > 0, zzs, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzcbx, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzd.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    public final void zza(zzfr zzfrVar, zzfw zzfwVar, boolean z10, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    public final void zzb(zzfr zzfrVar, zzfw zzfwVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    public final void zzc(zzfr zzfrVar, zzfw zzfwVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    public final void zzd(zzfr zzfrVar, zzfw zzfwVar, boolean z10) {
        if (zzfrVar instanceof zzge) {
            this.zzh.zzb((zzge) zzfrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbx
    public final void zzf() {
        this.zzg = true;
    }

    public final String zzk() {
        return this.zze;
    }

    public final ByteBuffer zzl() {
        synchronized (this.zzl) {
            ByteBuffer byteBuffer = this.zzj;
            if (byteBuffer != null && !this.zzk) {
                byteBuffer.flip();
                this.zzk = true;
            }
            this.zzg = true;
        }
        return this.zzj;
    }

    public final boolean zzm() {
        return this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ae, code lost:
        r21.zzo = true;
        zzj(r22, r4, (int) r21.zzi.zza(r21.zzj));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:? -> B:45:0x0149). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzt(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccd.zzt(java.lang.String):boolean");
    }
}
