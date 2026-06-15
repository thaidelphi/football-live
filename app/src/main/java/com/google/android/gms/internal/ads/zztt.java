package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zztt extends zzwf {
    private final boolean zzb;
    private final zzbm zzc;
    private final zzbl zzd;
    private zztr zze;
    private zztq zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zztt(zzua zzuaVar, boolean z10) {
        super(zzuaVar);
        boolean z11;
        if (z10) {
            zzuaVar.zzv();
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzb = z11;
        this.zzc = new zzbm();
        this.zzd = new zzbl();
        zzuaVar.zzM();
        this.zze = zztr.zzq(zzuaVar.zzJ());
    }

    private final Object zzK(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.zze.zze;
        if (obj2 == null || !obj.equals(zztr.zzc)) {
            return obj;
        }
        obj3 = this.zze.zze;
        return obj3;
    }

    private final boolean zzL(long j10) {
        zztq zztqVar = this.zzf;
        int zza = this.zze.zza(zztqVar.zza.zza);
        if (zza == -1) {
            return false;
        }
        zztr zztrVar = this.zze;
        zzbl zzblVar = this.zzd;
        zztrVar.zzd(zza, zzblVar, false);
        long j11 = zzblVar.zzd;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        zztqVar.zzs(j10);
        return true;
    }

    public final zzbn zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    protected final zzty zzD(zzty zztyVar) {
        Object obj;
        Object obj2;
        obj = this.zze.zze;
        Object obj3 = zztyVar.zza;
        if (obj != null) {
            obj2 = this.zze.zze;
            if (obj2.equals(obj3)) {
                obj3 = zztr.zzc;
            }
        }
        return zztyVar.zza(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    @Override // com.google.android.gms.internal.ads.zzwf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zzE(com.google.android.gms.internal.ads.zzbn r15) {
        /*
            r14 = this;
            boolean r0 = r14.zzh
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zztr r0 = r14.zze
            com.google.android.gms.internal.ads.zztr r15 = r0.zzp(r15)
            r14.zze = r15
            com.google.android.gms.internal.ads.zztq r15 = r14.zzf
            if (r15 == 0) goto L9e
            long r2 = r15.zzn()
            r14.zzL(r2)
            goto L9e
        L1a:
            boolean r0 = r15.zzo()
            if (r0 == 0) goto L36
            boolean r0 = r14.zzi
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zztr r0 = r14.zze
            com.google.android.gms.internal.ads.zztr r15 = r0.zzp(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbm.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zztr.zzc
            com.google.android.gms.internal.ads.zztr r15 = com.google.android.gms.internal.ads.zztr.zzr(r15, r0, r2)
        L33:
            r14.zze = r15
            goto L9e
        L36:
            com.google.android.gms.internal.ads.zzbm r0 = r14.zzc
            r2 = 0
            r3 = 0
            r15.zze(r2, r0, r3)
            com.google.android.gms.internal.ads.zzbm r0 = r14.zzc
            java.lang.Object r0 = r0.zzb
            com.google.android.gms.internal.ads.zztq r5 = r14.zzf
            if (r5 == 0) goto L62
            long r6 = r5.zzq()
            com.google.android.gms.internal.ads.zztr r8 = r14.zze
            com.google.android.gms.internal.ads.zzbl r9 = r14.zzd
            com.google.android.gms.internal.ads.zzty r5 = r5.zza
            java.lang.Object r5 = r5.zza
            r8.zzn(r5, r9)
            com.google.android.gms.internal.ads.zztr r5 = r14.zze
            com.google.android.gms.internal.ads.zzbm r8 = r14.zzc
            r5.zze(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.zzbm r9 = r14.zzc
            com.google.android.gms.internal.ads.zzbl r10 = r14.zzd
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.zzl(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.zzi
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.zztr r0 = r14.zze
            com.google.android.gms.internal.ads.zztr r15 = r0.zzp(r15)
            goto L86
        L82:
            com.google.android.gms.internal.ads.zztr r15 = com.google.android.gms.internal.ads.zztr.zzr(r15, r0, r3)
        L86:
            r14.zze = r15
            com.google.android.gms.internal.ads.zztq r15 = r14.zzf
            if (r15 == 0) goto L9e
            boolean r0 = r14.zzL(r4)
            if (r0 == 0) goto L9e
            com.google.android.gms.internal.ads.zzty r15 = r15.zza
            java.lang.Object r0 = r15.zza
            java.lang.Object r0 = r14.zzK(r0)
            com.google.android.gms.internal.ads.zzty r1 = r15.zza(r0)
        L9e:
            r15 = 1
            r14.zzi = r15
            r14.zzh = r15
            com.google.android.gms.internal.ads.zztr r15 = r14.zze
            r14.zzo(r15)
            if (r1 == 0) goto Lb2
            com.google.android.gms.internal.ads.zztq r15 = r14.zzf
            java.util.Objects.requireNonNull(r15)
            r15.zzr(r1)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztt.zzE(com.google.android.gms.internal.ads.zzbn):void");
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final void zzF() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzB(null, ((zzwf) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzwf, com.google.android.gms.internal.ads.zzua
    public final void zzG(zztw zztwVar) {
        ((zztq) zztwVar).zzt();
        if (zztwVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwf, com.google.android.gms.internal.ads.zzua
    /* renamed from: zzH */
    public final zztq zzI(zzty zztyVar, zzye zzyeVar, long j10) {
        zztq zztqVar = new zztq(zztyVar, zzyeVar, j10);
        zztqVar.zzu(((zzwf) this).zza);
        if (this.zzh) {
            zztqVar.zzr(zztyVar.zza(zzK(zztyVar.zza)));
        } else {
            this.zzf = zztqVar;
            if (!this.zzg) {
                this.zzg = true;
                zzB(null, ((zzwf) this).zza);
            }
        }
        return zztqVar;
    }

    @Override // com.google.android.gms.internal.ads.zztg, com.google.android.gms.internal.ads.zzsx
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzsx, com.google.android.gms.internal.ads.zzua
    public final void zzt(zzap zzapVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzwb(this.zze.zzb, zzapVar));
        } else {
            this.zze = zztr.zzq(zzapVar);
        }
        ((zzwf) this).zza.zzt(zzapVar);
    }

    @Override // com.google.android.gms.internal.ads.zztg, com.google.android.gms.internal.ads.zzua
    public final void zzz() {
    }
}
