package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzccl extends zzfk {
    private final Context zza;
    private final zzfr zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzazw zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private b6.a zzo;
    private final AtomicLong zzp;
    private final zzccv zzq;

    public zzccl(Context context, zzfr zzfrVar, String str, int i10, zzgr zzgrVar, zzccv zzccvVar) {
        super(false);
        this.zza = context;
        this.zzb = zzfrVar;
        this.zzq = zzccvVar;
        this.zzc = str;
        this.zzd = i10;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        this.zzp = new AtomicLong(-1L);
        this.zzo = null;
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbY)).booleanValue();
        zzf(zzgrVar);
    }

    private final boolean zzr() {
        if (this.zze) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeu)).booleanValue() || this.zzl) {
                return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzev)).booleanValue() && !this.zzm;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int zza;
        if (this.zzg) {
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                zza = inputStream.read(bArr, i10, i11);
            } else {
                zza = this.zzb.zza(bArr, i10, i11);
            }
            if (!this.zze || this.zzf != null) {
                zzg(zza);
            }
            return zza;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e8  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzfr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzfw r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccl.zzb(com.google.android.gms.internal.ads.zzfw):long");
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        boolean z10 = false;
        this.zzg = false;
        this.zzh = null;
        if (!this.zze || this.zzf != null) {
            z10 = true;
        }
        InputStream inputStream = this.zzf;
        if (inputStream != null) {
            IOUtils.a(inputStream);
            this.zzf = null;
        } else {
            this.zzb.zzd();
        }
        if (z10) {
            zzh();
        }
    }

    public final long zzk() {
        return this.zzn;
    }

    public final long zzl() {
        if (this.zzi != null) {
            if (this.zzp.get() != -1) {
                return this.zzp.get();
            }
            synchronized (this) {
                if (this.zzo == null) {
                    this.zzo = zzbyp.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcck
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Long valueOf;
                            valueOf = Long.valueOf(com.google.android.gms.ads.internal.zzv.zzc().zza(zzccl.this.zzi));
                            return valueOf;
                        }
                    });
                }
            }
            if (this.zzo.isDone()) {
                try {
                    this.zzp.compareAndSet(-1L, ((Long) this.zzo.get()).longValue());
                    return this.zzp.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}
