package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcbf implements zzfr {
    private final Context zza;
    private final zzfr zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzazw zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzfw zzl;

    public zzcbf(Context context, zzfr zzfrVar, String str, int i10, zzgr zzgrVar, zzcbe zzcbeVar) {
        this.zza = context;
        this.zzb = zzfrVar;
        this.zzc = str;
        this.zzd = i10;
        new AtomicLong(-1L);
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbY)).booleanValue();
    }

    private final boolean zzg() {
        if (this.zze) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeu)).booleanValue() || this.zzj) {
                return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzev)).booleanValue() && !this.zzk;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (this.zzg) {
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                return inputStream.read(bArr, i10, i11);
            }
            return this.zzb.zza(bArr, i10, i11);
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final long zzb(zzfw zzfwVar) throws IOException {
        Long l10;
        if (!this.zzg) {
            this.zzg = true;
            Uri uri = zzfwVar.zza;
            this.zzh = uri;
            this.zzl = zzfwVar;
            this.zzi = zzazw.zza(uri);
            zzazt zzaztVar = null;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzer)).booleanValue()) {
                if (this.zzi != null) {
                    this.zzi.zzh = zzfwVar.zze;
                    this.zzi.zzi = zzftm.zzc(this.zzc);
                    this.zzi.zzj = this.zzd;
                    zzaztVar = com.google.android.gms.ads.internal.zzv.zzc().zzb(this.zzi);
                }
                if (zzaztVar != null && zzaztVar.zze()) {
                    this.zzj = zzaztVar.zzg();
                    this.zzk = zzaztVar.zzf();
                    if (!zzg()) {
                        this.zzf = zzaztVar.zzc();
                        return -1L;
                    }
                }
            } else if (this.zzi != null) {
                this.zzi.zzh = zzfwVar.zze;
                this.zzi.zzi = zzftm.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                if (this.zzi.zzg) {
                    l10 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzet);
                } else {
                    l10 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzes);
                }
                long longValue = l10.longValue();
                com.google.android.gms.ads.internal.zzv.zzC().b();
                com.google.android.gms.ads.internal.zzv.zzd();
                Future zza = zzbah.zza(this.zza, this.zzi);
                try {
                    try {
                        zzbai zzbaiVar = (zzbai) zza.get(longValue, TimeUnit.MILLISECONDS);
                        zzbaiVar.zzd();
                        this.zzj = zzbaiVar.zzf();
                        this.zzk = zzbaiVar.zze();
                        zzbaiVar.zza();
                        if (!zzg()) {
                            this.zzf = zzbaiVar.zzc();
                        }
                    } catch (InterruptedException unused) {
                        zza.cancel(false);
                        Thread.currentThread().interrupt();
                    } catch (ExecutionException | TimeoutException unused2) {
                        zza.cancel(false);
                    }
                } catch (Throwable unused3) {
                }
                com.google.android.gms.ads.internal.zzv.zzC().b();
                throw null;
            }
            if (this.zzi != null) {
                zzfu zza2 = zzfwVar.zza();
                zza2.zzd(Uri.parse(this.zzi.zza));
                this.zzl = zza2.zze();
            }
            return this.zzb.zzb(this.zzl);
        }
        throw new IOException("Attempt to open an already open CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream != null) {
            IOUtils.a(inputStream);
            this.zzf = null;
            return;
        }
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzfr
    public final void zzf(zzgr zzgrVar) {
    }
}
