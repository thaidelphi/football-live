package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzhi implements zzla, zzld {
    private final int zzb;
    private zzle zzd;
    private int zze;
    private zznz zzf;
    private zzcw zzg;
    private int zzh;
    private zzvs zzi;
    private zzz[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzlc zzq;
    private final Object zza = new Object();
    private final zzjv zzc = new zzjv();
    private long zzm = Long.MIN_VALUE;
    private zzbn zzp = zzbn.zza;

    public zzhi(int i10) {
        this.zzb = i10;
    }

    private final void zzZ(long j10, boolean z10) throws zzhs {
        this.zzn = false;
        this.zzl = j10;
        this.zzm = j10;
        zzz(j10, z10);
    }

    protected void zzA() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzB() {
        zzlc zzlcVar;
        synchronized (this.zza) {
            zzlcVar = this.zzq;
        }
        if (zzlcVar != null) {
            zzlcVar.zza(this);
        }
    }

    protected void zzC() {
    }

    protected void zzD() throws zzhs {
    }

    protected void zzE() {
    }

    protected void zzF(zzz[] zzzVarArr, long j10, long j11, zzty zztyVar) throws zzhs {
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzG() {
        zzcv.zzf(this.zzh == 0);
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzH(zzz[] zzzVarArr, zzvs zzvsVar, long j10, long j11, zzty zztyVar) throws zzhs {
        zzcv.zzf(!this.zzn);
        this.zzi = zzvsVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j10;
        }
        this.zzj = zzzVarArr;
        this.zzk = j11;
        zzF(zzzVarArr, j10, j11, zztyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzI() {
        zzcv.zzf(this.zzh == 0);
        zzjv zzjvVar = this.zzc;
        zzjvVar.zzb = null;
        zzjvVar.zza = null;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzJ(long j10) throws zzhs {
        zzZ(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzK() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public final void zzL(zzlc zzlcVar) {
        synchronized (this.zza) {
            this.zzq = zzlcVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public /* synthetic */ void zzM(float f10, float f11) {
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzN(zzbn zzbnVar) {
        zzbn zzbnVar2 = this.zzp;
        int i10 = zzeh.zza;
        if (Objects.equals(zzbnVar2, zzbnVar)) {
            return;
        }
        this.zzp = zzbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzO() throws zzhs {
        zzcv.zzf(this.zzh == 1);
        this.zzh = 2;
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzP() {
        zzcv.zzf(this.zzh == 2);
        this.zzh = 1;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final boolean zzQ() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final boolean zzR() {
        return this.zzn;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzS() {
        if (zzQ()) {
            return this.zzn;
        }
        zzvs zzvsVar = this.zzi;
        Objects.requireNonNull(zzvsVar);
        return zzvsVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzz[] zzT() {
        zzz[] zzzVarArr = this.zzj;
        Objects.requireNonNull(zzzVarArr);
        return zzzVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzla, com.google.android.gms.internal.ads.zzld
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final int zzcT() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzcU(zzjv zzjvVar, zzha zzhaVar, int i10) {
        zzvs zzvsVar = this.zzi;
        Objects.requireNonNull(zzvsVar);
        int zza = zzvsVar.zza(zzjvVar, zzhaVar, i10);
        if (zza == -4) {
            if (zzhaVar.zzf()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j10 = zzhaVar.zze + this.zzk;
            zzhaVar.zze = j10;
            this.zzm = Math.max(this.zzm, j10);
        } else if (zza == -5) {
            zzz zzzVar = zzjvVar.zza;
            Objects.requireNonNull(zzzVar);
            long j11 = zzzVar.zzt;
            if (j11 != Long.MAX_VALUE) {
                zzx zzb = zzzVar.zzb();
                zzb.zzah(j11 + this.zzk);
                zzjvVar.zza = zzb.zzaj();
                return -5;
            }
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final long zzcV() {
        return this.zzm;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzhs zzcW(Throwable th, zzz zzzVar, boolean z10, int i10) {
        int i11 = 4;
        if (zzzVar != null && !this.zzo) {
            this.zzo = true;
            try {
                i11 = zzY(zzzVar) & 7;
            } catch (zzhs unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzhs.zzb(th, zzU(), this.zze, zzzVar, i11, z10, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzd(long j10) {
        zzvs zzvsVar = this.zzi;
        Objects.requireNonNull(zzvsVar);
        return zzvsVar.zzb(j10 - this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public int zze() throws zzhs {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzf() {
        return this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzbn zzh() {
        return this.zzp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzcw zzi() {
        zzcw zzcwVar = this.zzg;
        Objects.requireNonNull(zzcwVar);
        return zzcwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzjv zzk() {
        zzjv zzjvVar = this.zzc;
        zzjvVar.zzb = null;
        zzjvVar.zza = null;
        return zzjvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public zzkb zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final zzld zzm() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzle zzn() {
        zzle zzleVar = this.zzd;
        Objects.requireNonNull(zzleVar);
        return zzleVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zznz zzo() {
        zznz zznzVar = this.zzf;
        Objects.requireNonNull(zznzVar);
        return zznzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final zzvs zzp() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public final void zzq() {
        synchronized (this.zza) {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzr() {
        zzcv.zzf(this.zzh == 1);
        zzjv zzjvVar = this.zzc;
        zzjvVar.zzb = null;
        zzjvVar.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzs(zzle zzleVar, zzz[] zzzVarArr, zzvs zzvsVar, long j10, boolean z10, boolean z11, long j11, long j12, zzty zztyVar) throws zzhs {
        zzcv.zzf(this.zzh == 0);
        this.zzd = zzleVar;
        this.zzh = 1;
        zzy(z10, z11);
        zzH(zzzVarArr, zzvsVar, j11, j12, zztyVar);
        zzZ(j11, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public /* synthetic */ void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public void zzu(int i10, Object obj) throws zzhs {
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzv(int i10, zznz zznzVar, zzcw zzcwVar) {
        this.zze = i10;
        this.zzf = zznzVar;
        this.zzg = zzcwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void zzw() throws IOException {
        zzvs zzvsVar = this.zzi;
        Objects.requireNonNull(zzvsVar);
        zzvsVar.zzd();
    }

    protected void zzx() {
        throw null;
    }

    protected void zzy(boolean z10, boolean z11) throws zzhs {
    }

    protected void zzz(long j10, boolean z10) throws zzhs {
        throw null;
    }
}
