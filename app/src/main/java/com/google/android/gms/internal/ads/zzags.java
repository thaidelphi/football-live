package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzags implements zzacj {
    private final zzdx zza;
    private final zzadb zzb;
    private final zzacx zzc;
    private final zzacz zzd;
    private final zzadp zze;
    private zzacm zzf;
    private zzadp zzg;
    private zzadp zzh;
    private int zzi;
    private zzav zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private zzagu zzp;
    private boolean zzq;

    public zzags() {
        throw null;
    }

    public zzags(int i10) {
        this.zza = new zzdx(10);
        this.zzb = new zzadb();
        this.zzc = new zzacx();
        this.zzk = -9223372036854775807L;
        this.zzd = new zzacz();
        zzace zzaceVar = new zzace();
        this.zze = zzaceVar;
        this.zzh = zzaceVar;
        this.zzn = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzg(com.google.android.gms.internal.ads.zzack r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzags.zzg(com.google.android.gms.internal.ads.zzack):int");
    }

    private final long zzh(long j10) {
        return this.zzk + ((j10 * 1000000) / this.zzb.zzd);
    }

    private final void zzj() {
        zzagu zzaguVar = this.zzp;
        if ((zzaguVar instanceof zzagp) && zzaguVar.zzh()) {
            long j10 = this.zzn;
            if (j10 == -1 || j10 == this.zzp.zzd()) {
                return;
            }
            zzagp zzf = ((zzagp) this.zzp).zzf(this.zzn);
            this.zzp = zzf;
            zzacm zzacmVar = this.zzf;
            Objects.requireNonNull(zzacmVar);
            zzacmVar.zzP(zzf);
            Objects.requireNonNull(this.zzg);
            this.zzp.zza();
        }
    }

    private static boolean zzk(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    private final boolean zzl(zzack zzackVar) throws IOException {
        zzagu zzaguVar = this.zzp;
        if (zzaguVar != null) {
            long zzd = zzaguVar.zzd();
            if (zzd != -1 && zzackVar.zze() > zzd - 4) {
                return true;
            }
        }
        try {
            return !zzackVar.zzm(this.zza.zzN(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzm(zzack zzackVar, boolean z10) throws IOException {
        int i10;
        int i11;
        int zzb;
        zzackVar.zzj();
        if (zzackVar.zzf() == 0) {
            zzav zza = this.zzd.zza(zzackVar, null);
            this.zzj = zza;
            if (zza != null) {
                this.zzc.zzb(zza);
            }
            i10 = (int) zzackVar.zze();
            if (!z10) {
                zzackVar.zzk(i10);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i12 = i11;
        int i13 = i12;
        while (true) {
            if (!zzl(zzackVar)) {
                this.zza.zzL(0);
                int zzg = this.zza.zzg();
                if ((i11 == 0 || zzk(zzg, i11)) && (zzb = zzadc.zzb(zzg)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.zzb.zza(zzg);
                        i11 = zzg;
                    }
                    zzackVar.zzg(zzb - 4);
                } else {
                    int i14 = i13 + 1;
                    if (i13 == (true != z10 ? 131072 : 32768)) {
                        if (z10) {
                            return false;
                        }
                        zzj();
                        throw new EOFException();
                    }
                    if (z10) {
                        zzackVar.zzj();
                        zzackVar.zzg(i10 + i14);
                    } else {
                        zzackVar.zzk(1);
                    }
                    i11 = 0;
                    i13 = i14;
                    i12 = 0;
                }
            } else if (i12 <= 0) {
                zzj();
                throw new EOFException();
            }
        }
        if (z10) {
            zzackVar.zzk(i10 + i13);
        } else {
            zzackVar.zzj();
        }
        this.zzi = i11;
        return true;
    }

    public final void zza() {
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final int zzb(zzack zzackVar, zzadf zzadfVar) throws IOException {
        zzcv.zzb(this.zzg);
        int i10 = zzeh.zza;
        int zzg = zzg(zzackVar);
        if (zzg == -1 && (this.zzp instanceof zzagq)) {
            if (this.zzp.zza() != zzh(this.zzl)) {
                zzagq zzagqVar = (zzagq) this.zzp;
                throw null;
            }
        }
        return zzg;
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
        this.zzf = zzacmVar;
        zzadp zzw = zzacmVar.zzw(0, 1);
        this.zzg = zzw;
        this.zzh = zzw;
        this.zzf.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zzf(long j10, long j11) {
        this.zzi = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = 0L;
        this.zzo = 0;
        zzagu zzaguVar = this.zzp;
        if (zzaguVar instanceof zzagq) {
            zzagq zzagqVar = (zzagq) zzaguVar;
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final boolean zzi(zzack zzackVar) throws IOException {
        return zzm(zzackVar, true);
    }
}
