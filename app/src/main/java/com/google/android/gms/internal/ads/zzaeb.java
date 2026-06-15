package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaeb implements zzacj {
    private final zzdx zza;
    private final zzadz zzb;
    private final boolean zzc;
    private final zzaje zzd;
    private int zze;
    private zzacm zzf;
    private zzaec zzg;
    private long zzh;
    private zzaee[] zzi;
    private long zzj;
    private zzaee zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaeb() {
        this(1, zzaje.zza);
    }

    private final zzaee zzg(int i10) {
        zzaee[] zzaeeVarArr;
        for (zzaee zzaeeVar : this.zzi) {
            if (zzaeeVar.zzf(i10)) {
                return zzaeeVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzacj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzack r17, com.google.android.gms.internal.ads.zzadf r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeb.zzb(com.google.android.gms.internal.ads.zzack, com.google.android.gms.internal.ads.zzadf):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final /* synthetic */ zzacj zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final /* synthetic */ List zzd() {
        return zzfvv.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zze(zzacm zzacmVar) {
        this.zze = 0;
        if (this.zzc) {
            zzacmVar = new zzajh(zzacmVar, this.zzd);
        }
        this.zzf = zzacmVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zzf(long j10, long j11) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzaee zzaeeVar : this.zzi) {
            zzaeeVar.zze(j10);
        }
        if (j10 == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final boolean zzi(zzack zzackVar) throws IOException {
        zzackVar.zzh(this.zza.zzN(), 0, 12);
        this.zza.zzL(0);
        if (this.zza.zzi() != 1179011410) {
            return false;
        }
        this.zza.zzM(4);
        return this.zza.zzi() == 541677121;
    }

    public zzaeb(int i10, zzaje zzajeVar) {
        this.zzd = zzajeVar;
        this.zzc = 1 == (i10 ^ 1);
        this.zza = new zzdx(12);
        this.zzb = new zzadz(null);
        this.zzf = new zzadd();
        this.zzi = new zzaee[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }
}
