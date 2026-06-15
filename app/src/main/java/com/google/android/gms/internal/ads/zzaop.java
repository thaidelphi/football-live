package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzaop implements Comparable {
    private final zzapa zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzaot zzf;
    private Integer zzg;
    private zzaos zzh;
    private boolean zzi;
    private zzany zzj;
    private zzaoo zzk;
    private final zzaod zzl;

    public zzaop(int i10, String str, zzaot zzaotVar) {
        Uri parse;
        String host;
        this.zza = zzapa.zza ? new zzapa() : null;
        this.zze = new Object();
        int i11 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i10;
        this.zzc = str;
        this.zzf = zzaotVar;
        this.zzl = new zzaod();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i11 = host.hashCode();
        }
        this.zzd = i11;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzaop) obj).zzg.intValue();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        Integer num = this.zzg;
        return "[ ] " + this.zzc + " " + "0x".concat(valueOf) + " NORMAL " + num;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzany zzd() {
        return this.zzj;
    }

    public final zzaop zze(zzany zzanyVar) {
        this.zzj = zzanyVar;
        return this;
    }

    public final zzaop zzf(zzaos zzaosVar) {
        this.zzh = zzaosVar;
        return this;
    }

    public final zzaop zzg(int i10) {
        this.zzg = Integer.valueOf(i10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract zzaov zzh(zzaol zzaolVar);

    public final String zzj() {
        int i10 = this.zzb;
        String str = this.zzc;
        if (i10 != 0) {
            String num = Integer.toString(1);
            return num + "-" + str;
        }
        return str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzanx {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzapa.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzaoy zzaoyVar) {
        zzaot zzaotVar;
        synchronized (this.zze) {
            zzaotVar = this.zzf;
        }
        zzaotVar.zza(zzaoyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zzo(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzp(String str) {
        zzaos zzaosVar = this.zzh;
        if (zzaosVar != null) {
            zzaosVar.zzb(this);
        }
        if (zzapa.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzaon(this, str, id));
                return;
            }
            this.zza.zza(str, id);
            this.zza.zzb(toString());
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzr() {
        zzaoo zzaooVar;
        synchronized (this.zze) {
            zzaooVar = this.zzk;
        }
        if (zzaooVar != null) {
            zzaooVar.zza(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzs(zzaov zzaovVar) {
        zzaoo zzaooVar;
        synchronized (this.zze) {
            zzaooVar = this.zzk;
        }
        if (zzaooVar != null) {
            zzaooVar.zzb(this, zzaovVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzt(int i10) {
        zzaos zzaosVar = this.zzh;
        if (zzaosVar != null) {
            zzaosVar.zzc(this, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzu(zzaoo zzaooVar) {
        synchronized (this.zze) {
            this.zzk = zzaooVar;
        }
    }

    public final boolean zzv() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzi;
        }
        return z10;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzanx {
        return null;
    }

    public final zzaod zzy() {
        return this.zzl;
    }
}
