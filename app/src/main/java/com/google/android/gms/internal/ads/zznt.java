package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zznt implements zznx {
    public static final zzftn zza = new zzftn() { // from class: com.google.android.gms.internal.ads.zznr
        @Override // com.google.android.gms.internal.ads.zzftn
        public final Object zza() {
            String zzn;
            zzn = zznt.zzn();
            return zzn;
        }
    };
    private static final Random zzb = new Random();
    private final zzbm zzc;
    private final zzbl zzd;
    private final HashMap zze;
    private zznw zzf;
    private zzbn zzg;
    private String zzh;
    private long zzi;

    public zznt() {
        throw null;
    }

    public zznt(zzftn zzftnVar) {
        this.zzc = new zzbm();
        this.zzd = new zzbl();
        this.zze = new HashMap();
        this.zzg = zzbn.zza;
        this.zzi = -1L;
    }

    public final long zzl() {
        long j10;
        long j11;
        zzns zznsVar = (zzns) this.zze.get(this.zzh);
        if (zznsVar != null) {
            j10 = zznsVar.zzd;
            if (j10 != -1) {
                j11 = zznsVar.zzd;
                return j11;
            }
        }
        return this.zzi + 1;
    }

    private final zzns zzm(int i10, zzty zztyVar) {
        long j10;
        int i11;
        zzty zztyVar2;
        zzty zztyVar3;
        long j11 = Long.MAX_VALUE;
        zzns zznsVar = null;
        for (zzns zznsVar2 : this.zze.values()) {
            zznsVar2.zzg(i10, zztyVar);
            if (zznsVar2.zzj(i10, zztyVar)) {
                j10 = zznsVar2.zzd;
                if (j10 == -1 || j10 < j11) {
                    zznsVar = zznsVar2;
                    j11 = j10;
                } else if (i11 == 0) {
                    int i12 = zzeh.zza;
                    zztyVar2 = zznsVar.zze;
                    if (zztyVar2 != null) {
                        zztyVar3 = zznsVar2.zze;
                        if (zztyVar3 != null) {
                            zznsVar = zznsVar2;
                        }
                    }
                }
            }
        }
        if (zznsVar == null) {
            String zzn = zzn();
            zzns zznsVar3 = new zzns(this, zzn, i10, zztyVar);
            this.zze.put(zzn, zznsVar3);
            return zznsVar3;
        }
        return zznsVar;
    }

    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzns zznsVar) {
        long j10;
        long j11;
        j10 = zznsVar.zzd;
        if (j10 != -1) {
            j11 = zznsVar.zzd;
            this.zzi = j11;
        }
        this.zzh = null;
    }

    private final void zzp(zzln zzlnVar) {
        String str;
        long j10;
        zzty zztyVar;
        zzty zztyVar2;
        zzty zztyVar3;
        String unused;
        String unused2;
        if (zzlnVar.zzb.zzo()) {
            String str2 = this.zzh;
            if (str2 != null) {
                zzns zznsVar = (zzns) this.zze.get(str2);
                Objects.requireNonNull(zznsVar);
                zzo(zznsVar);
                return;
            }
            return;
        }
        zzns zznsVar2 = (zzns) this.zze.get(this.zzh);
        zzns zzm = zzm(zzlnVar.zzc, zzlnVar.zzd);
        str = zzm.zzb;
        this.zzh = str;
        zzi(zzlnVar);
        zzty zztyVar4 = zzlnVar.zzd;
        if (zztyVar4 == null || !zztyVar4.zzb()) {
            return;
        }
        if (zznsVar2 != null) {
            long j11 = zztyVar4.zzd;
            j10 = zznsVar2.zzd;
            if (j10 == j11) {
                zztyVar = zznsVar2.zze;
                if (zztyVar != null) {
                    zztyVar2 = zznsVar2.zze;
                    if (zztyVar2.zzb == zzlnVar.zzd.zzb) {
                        zztyVar3 = zznsVar2.zze;
                        if (zztyVar3.zzc == zzlnVar.zzd.zzc) {
                            return;
                        }
                    }
                }
            }
        }
        zzty zztyVar5 = zzlnVar.zzd;
        unused = zzm(zzlnVar.zzc, new zzty(zztyVar5.zza, zztyVar5.zzd)).zzb;
        unused2 = zzm.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final synchronized String zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final synchronized String zzf(zzbn zzbnVar, zzty zztyVar) {
        String str;
        str = zzm(zzbnVar.zzn(zztyVar.zza, this.zzd).zzc, zztyVar).zzb;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final synchronized void zzg(zzln zzlnVar) {
        boolean z10;
        zznw zznwVar;
        String str;
        String str2 = this.zzh;
        if (str2 != null) {
            zzns zznsVar = (zzns) this.zze.get(str2);
            Objects.requireNonNull(zznsVar);
            zzo(zznsVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzns zznsVar2 = (zzns) it.next();
            it.remove();
            z10 = zznsVar2.zzf;
            if (z10 && (zznwVar = this.zzf) != null) {
                str = zznsVar2.zzb;
                zznwVar.zzd(zzlnVar, str, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final void zzh(zznw zznwVar) {
        this.zzf = zznwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x003a, code lost:
        if (r0 == r10.zzc) goto L21;
     */
    @Override // com.google.android.gms.internal.ads.zznx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzi(com.google.android.gms.internal.ads.zzln r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zznw r0 = r9.zzf     // Catch: java.lang.Throwable -> Lc6
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzbn r0 = r10.zzb     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.zzo()     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L10
            goto Lc4
        L10:
            com.google.android.gms.internal.ads.zzty r0 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L3c
            long r1 = r9.zzl()     // Catch: java.lang.Throwable -> Lc6
            long r3 = r0.zzd     // Catch: java.lang.Throwable -> Lc6
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Lc4
            java.util.HashMap r0 = r9.zze     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r9.zzh     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzns r0 = (com.google.android.gms.internal.ads.zzns) r0     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L3c
            long r1 = com.google.android.gms.internal.ads.zzns.zzb(r0)     // Catch: java.lang.Throwable -> Lc6
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L3c
            int r0 = com.google.android.gms.internal.ads.zzns.zza(r0)     // Catch: java.lang.Throwable -> Lc6
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            if (r0 != r1) goto Lc4
        L3c:
            int r0 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzty r1 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzns r0 = r9.zzm(r0, r1)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r9.zzh     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto L4e
            java.lang.String r1 = com.google.android.gms.internal.ads.zzns.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            r9.zzh = r1     // Catch: java.lang.Throwable -> Lc6
        L4e:
            com.google.android.gms.internal.ads.zzty r1 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            r2 = 1
            if (r1 == 0) goto L98
            boolean r3 = r1.zzb()     // Catch: java.lang.Throwable -> Lc6
            if (r3 == 0) goto L98
            java.lang.Object r3 = r1.zza     // Catch: java.lang.Throwable -> Lc6
            long r4 = r1.zzd     // Catch: java.lang.Throwable -> Lc6
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzty r6 = new com.google.android.gms.internal.ads.zzty     // Catch: java.lang.Throwable -> Lc6
            r6.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> Lc6
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzns r1 = r9.zzm(r1, r6)     // Catch: java.lang.Throwable -> Lc6
            boolean r3 = com.google.android.gms.internal.ads.zzns.zzi(r1)     // Catch: java.lang.Throwable -> Lc6
            if (r3 != 0) goto L98
            com.google.android.gms.internal.ads.zzns.zzf(r1, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzbn r3 = r10.zzb     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzty r4 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzbl r5 = r9.zzd     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r4 = r4.zza     // Catch: java.lang.Throwable -> Lc6
            r3.zzn(r4, r5)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzbl r3 = r9.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzty r4 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            int r4 = r4.zzb     // Catch: java.lang.Throwable -> Lc6
            r3.zzg(r4)     // Catch: java.lang.Throwable -> Lc6
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzeh.zzv(r3)     // Catch: java.lang.Throwable -> Lc6
            long r7 = com.google.android.gms.internal.ads.zzeh.zzv(r3)     // Catch: java.lang.Throwable -> Lc6
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzns.zzd(r1)     // Catch: java.lang.Throwable -> Lc6
        L98:
            boolean r1 = com.google.android.gms.internal.ads.zzns.zzi(r0)     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto La4
            com.google.android.gms.internal.ads.zzns.zzf(r0, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzns.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
        La4:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzns.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r3 = r9.zzh     // Catch: java.lang.Throwable -> Lc6
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lc6
            if (r1 == 0) goto Lc4
            boolean r1 = com.google.android.gms.internal.ads.zzns.zzh(r0)     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto Lc4
            com.google.android.gms.internal.ads.zzns.zze(r0, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zznw r1 = r9.zzf     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = com.google.android.gms.internal.ads.zzns.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            r1.zzc(r10, r0)     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r9)
            return
        Lc4:
            monitor-exit(r9)
            return
        Lc6:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznt.zzi(com.google.android.gms.internal.ads.zzln):void");
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final synchronized void zzj(zzln zzlnVar, int i10) {
        boolean z10;
        String str;
        String str2;
        boolean z11;
        Objects.requireNonNull(this.zzf);
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzns zznsVar = (zzns) it.next();
            if (zznsVar.zzk(zzlnVar)) {
                it.remove();
                z10 = zznsVar.zzf;
                if (z10) {
                    str = zznsVar.zzb;
                    boolean equals = str.equals(this.zzh);
                    boolean z12 = false;
                    if (i10 == 0 && equals) {
                        z11 = zznsVar.zzg;
                        if (z11) {
                            z12 = true;
                        }
                    }
                    if (equals) {
                        zzo(zznsVar);
                    }
                    zznw zznwVar = this.zzf;
                    str2 = zznsVar.zzb;
                    zznwVar.zzd(zzlnVar, str2, z12);
                }
            }
        }
        zzp(zzlnVar);
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final synchronized void zzk(zzln zzlnVar) {
        boolean z10;
        String str;
        String str2;
        Objects.requireNonNull(this.zzf);
        zzbn zzbnVar = this.zzg;
        this.zzg = zzlnVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzns zznsVar = (zzns) it.next();
            if (!zznsVar.zzl(zzbnVar, this.zzg) || zznsVar.zzk(zzlnVar)) {
                it.remove();
                z10 = zznsVar.zzf;
                if (z10) {
                    str = zznsVar.zzb;
                    if (str.equals(this.zzh)) {
                        zzo(zznsVar);
                    }
                    zznw zznwVar = this.zzf;
                    str2 = zznsVar.zzb;
                    zznwVar.zzd(zzlnVar, str2, false);
                }
            }
        }
        zzp(zzlnVar);
    }
}
