package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzzq extends zzsg implements zzaaf {
    private static final int[] zzb = {1920, IronSourceConstants.RV_OPERATIONAL_LOAD_AD, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private int zzB;
    private long zzC;
    private zzcc zzD;
    private zzcc zzE;
    private int zzF;
    private int zzG;
    private zzaad zzH;
    private long zzI;
    private long zzJ;
    private boolean zzK;
    private final Context zze;
    private final boolean zzf;
    private final zzaaw zzg;
    private final boolean zzh;
    private final zzaag zzi;
    private final zzaae zzj;
    private zzzp zzk;
    private boolean zzl;
    private boolean zzm;
    private zzabc zzn;
    private boolean zzo;
    private List zzp;
    private Surface zzq;
    private zzzt zzr;
    private zzdy zzs;
    private boolean zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    public zzzq(Context context, zzru zzruVar, zzsi zzsiVar, long j10, boolean z10, Handler handler, zzaax zzaaxVar, int i10, float f10) {
        super(2, zzruVar, zzsiVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzn = null;
        this.zzg = new zzaaw(handler, zzaaxVar);
        this.zzf = true;
        this.zzi = new zzaag(applicationContext, this, 0L);
        this.zzj = new zzaae();
        this.zzh = "NVIDIA".equals(zzeh.zzc);
        this.zzs = zzdy.zza;
        this.zzu = 1;
        this.zzv = 0;
        this.zzD = zzcc.zza;
        this.zzG = 0;
        this.zzE = null;
        this.zzF = -1000;
        this.zzI = -9223372036854775807L;
        this.zzJ = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04bf, code lost:
        if (r0.equals("deb") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x079d, code lost:
        if (r10 != 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static final boolean zzaV(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzq.zzaV(java.lang.String):boolean");
    }

    protected static final boolean zzaW(zzrz zzrzVar) {
        return zzeh.zza >= 35 && zzrzVar.zzh;
    }

    private final Surface zzaX(zzrz zzrzVar) {
        zzabc zzabcVar = this.zzn;
        if (zzabcVar != null) {
            return zzabcVar.zzb();
        }
        Surface surface = this.zzq;
        if (surface != null) {
            return surface;
        }
        if (zzaW(zzrzVar)) {
            return null;
        }
        zzcv.zzf(zzbe(zzrzVar));
        zzzt zzztVar = this.zzr;
        if (zzztVar != null) {
            if (zzztVar.zza != zzrzVar.zzf) {
                zzbb();
            }
        }
        if (this.zzr == null) {
            this.zzr = zzzt.zza(this.zze, zzrzVar.zzf);
        }
        return this.zzr;
    }

    private static List zzaY(Context context, zzsi zzsiVar, zzz zzzVar, boolean z10, boolean z11) throws zzsn {
        String str = zzzVar.zzo;
        if (str == null) {
            return zzfvv.zzn();
        }
        if (zzeh.zza >= 26 && "video/dolby-vision".equals(str) && !zzzo.zza(context)) {
            List zzc2 = zzst.zzc(zzsiVar, zzzVar, z10, z11);
            if (!zzc2.isEmpty()) {
                return zzc2;
            }
        }
        return zzst.zze(zzsiVar, zzzVar, z10, z11);
    }

    private final void zzaZ() {
        zzcc zzccVar = this.zzE;
        if (zzccVar != null) {
            this.zzg.zzt(zzccVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
        if (r3.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzad(com.google.android.gms.internal.ads.zzrz r11, com.google.android.gms.internal.ads.zzz r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzq.zzad(com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zzz):int");
    }

    protected static int zzae(zzrz zzrzVar, zzz zzzVar) {
        if (zzzVar.zzp != -1) {
            int size = zzzVar.zzr.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += ((byte[]) zzzVar.zzr.get(i11)).length;
            }
            return zzzVar.zzp + i10;
        }
        return zzad(zzrzVar, zzzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzba() {
        this.zzg.zzq(this.zzq);
        this.zzt = true;
    }

    private final void zzbb() {
        zzzt zzztVar = this.zzr;
        if (zzztVar != null) {
            zzztVar.release();
            this.zzr = null;
        }
    }

    private final void zzbc(Object obj) throws zzhs {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzq == surface) {
            if (surface != null) {
                zzaZ();
                Surface surface2 = this.zzq;
                if (surface2 == null || !this.zzt) {
                    return;
                }
                this.zzg.zzq(surface2);
                return;
            }
            return;
        }
        this.zzq = surface;
        if (this.zzn == null) {
            this.zzi.zzm(surface);
        }
        this.zzt = false;
        int zzcT = zzcT();
        zzrw zzaz = zzaz();
        if (zzaz != null && this.zzn == null) {
            zzrz zzaB = zzaB();
            Objects.requireNonNull(zzaB);
            boolean zzbd = zzbd(zzaB);
            int i10 = zzeh.zza;
            if (zzbd && !this.zzl) {
                Surface zzaX = zzaX(zzaB);
                if (zzaX != null) {
                    zzaz.zzp(zzaX);
                } else if (i10 >= 35) {
                    zzaz.zzi();
                } else {
                    throw new IllegalStateException();
                }
            } else {
                zzaG();
                zzaC();
            }
        }
        if (surface == null) {
            this.zzE = null;
            zzabc zzabcVar = this.zzn;
            if (zzabcVar != null) {
                zzabcVar.zzh();
                return;
            }
            return;
        }
        zzaZ();
        if (zzcT == 2) {
            zzabc zzabcVar2 = this.zzn;
            if (zzabcVar2 != null) {
                zzabcVar2.zzk(true);
            } else {
                this.zzi.zzc(true);
            }
        }
    }

    private final boolean zzbd(zzrz zzrzVar) {
        if (this.zzn == null) {
            Surface surface = this.zzq;
            return (surface != null && surface.isValid()) || zzaW(zzrzVar) || zzbe(zzrzVar);
        }
        return true;
    }

    private final boolean zzbe(zzrz zzrzVar) {
        int i10 = zzeh.zza;
        return !zzaV(zzrzVar.zza) && (!zzrzVar.zzf || zzzt.zzb(this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    protected final void zzA() {
        zzabc zzabcVar = this.zzn;
        if (zzabcVar == null || !this.zzf) {
            return;
        }
        zzabcVar.zzq();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzhi
    public final void zzC() {
        try {
            super.zzC();
        } finally {
            this.zzo = false;
            this.zzI = -9223372036854775807L;
            zzbb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    protected final void zzD() {
        this.zzx = 0;
        this.zzw = zzi().zzb();
        this.zzA = 0L;
        this.zzB = 0;
        zzabc zzabcVar = this.zzn;
        if (zzabcVar != null) {
            zzabcVar.zzo();
        } else {
            this.zzi.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    protected final void zzE() {
        if (this.zzx > 0) {
            long zzb2 = zzi().zzb();
            this.zzg.zzn(this.zzx, zzb2 - this.zzw);
            this.zzx = 0;
            this.zzw = zzb2;
        }
        int i10 = this.zzB;
        if (i10 != 0) {
            this.zzg.zzr(this.zzA, i10);
            this.zzA = 0L;
            this.zzB = 0;
        }
        zzabc zzabcVar = this.zzn;
        if (zzabcVar != null) {
            zzabcVar.zzp();
        } else {
            this.zzi.zzh();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzhi
    public final void zzF(zzz[] zzzVarArr, long j10, long j11, zzty zztyVar) throws zzhs {
        super.zzF(zzzVarArr, j10, j11, zztyVar);
        if (this.zzI == -9223372036854775807L) {
            this.zzI = j10;
        }
        zzbn zzh = zzh();
        if (zzh.zzo()) {
            this.zzJ = -9223372036854775807L;
        } else {
            this.zzJ = zzh.zzn(zztyVar.zza, new zzbl()).zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzhi, com.google.android.gms.internal.ads.zzla
    public final void zzM(float f10, float f11) throws zzhs {
        super.zzM(f10, f11);
        zzabc zzabcVar = this.zzn;
        if (zzabcVar != null) {
            zzabcVar.zzv(f10);
        } else {
            this.zzi.zzn(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzla, com.google.android.gms.internal.ads.zzld
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzla
    public final void zzV(long j10, long j11) throws zzhs {
        zzabc zzabcVar = this.zzn;
        if (zzabcVar != null) {
            try {
                zzabcVar.zzr(j10, j11);
            } catch (zzabb e8) {
                throw zzcW(e8, e8.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        super.zzV(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzla
    public final boolean zzW() {
        zzabc zzabcVar;
        return super.zzW() && ((zzabcVar = this.zzn) == null || zzabcVar.zzD());
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzla
    public final boolean zzX() {
        boolean zzX = super.zzX();
        zzabc zzabcVar = this.zzn;
        if (zzabcVar != null) {
            return zzabcVar.zzF(zzX);
        }
        if (zzX && (zzaz() == null || this.zzq == null)) {
            return true;
        }
        return this.zzi.zzo(zzX);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final float zzZ(float f10, zzz zzzVar, zzz[] zzzVarArr) {
        float f11 = -1.0f;
        for (zzz zzzVar2 : zzzVarArr) {
            float f12 = zzzVar2.zzx;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final zzry zzaA(Throwable th, zzrz zzrzVar) {
        return new zzzl(th, zzrzVar, this.zzq);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzaD(long j10) {
        super.zzaD(j10);
        this.zzz--;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final void zzaE(zzha zzhaVar) throws zzhs {
        this.zzz++;
        int i10 = zzeh.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final void zzaF(zzkz zzkzVar) {
        zzabc zzabcVar = this.zzn;
        if (zzabcVar != null) {
            zzabcVar.zzz(zzkzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzaH() {
        super.zzaH();
        this.zzz = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final boolean zzaN(zzz zzzVar) throws zzhs {
        zzabc zzabcVar = this.zzn;
        if (zzabcVar == null || zzabcVar.zzE()) {
            return true;
        }
        try {
            return zzabcVar.zzC(zzzVar);
        } catch (zzabb e8) {
            throw zzcW(e8, zzzVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final boolean zzaO(zzrz zzrzVar) {
        return zzbd(zzrzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final boolean zzaP(zzha zzhaVar) {
        if (zzhaVar.zzi() && !zzQ() && !zzhaVar.zzh() && this.zzJ != -9223372036854775807L) {
            if (this.zzJ - (zzhaVar.zze - zzav()) > 100000 && !zzhaVar.zzl() && zzhaVar.zze < zzf()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzaR(zzrw zzrwVar, int i10, long j10) {
        Trace.beginSection("skipVideoBuffer");
        zzrwVar.zzo(i10, false);
        Trace.endSection();
        ((zzsg) this).zza.zzf++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzaS(int i10, int i11) {
        zzhj zzhjVar = ((zzsg) this).zza;
        zzhjVar.zzh += i10;
        int i12 = i10 + i11;
        zzhjVar.zzg += i12;
        this.zzx += i12;
        int i13 = this.zzy + i12;
        this.zzy = i13;
        zzhjVar.zzi = Math.max(i13, zzhjVar.zzi);
    }

    protected final void zzaT(long j10) {
        zzhj zzhjVar = ((zzsg) this).zza;
        zzhjVar.zzk += j10;
        zzhjVar.zzl++;
        this.zzA += j10;
        this.zzB++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaU(long j10, boolean z10) throws zzhs {
        int zzd2 = zzd(j10);
        if (zzd2 == 0) {
            return false;
        }
        if (z10) {
            zzhj zzhjVar = ((zzsg) this).zza;
            zzhjVar.zzd += zzd2;
            zzhjVar.zzf += this.zzz;
        } else {
            ((zzsg) this).zza.zzj++;
            zzaS(zzd2, this.zzz);
        }
        zzaJ();
        zzabc zzabcVar = this.zzn;
        if (zzabcVar != null) {
            zzabcVar.zzj(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final int zzaa(zzsi zzsiVar, zzz zzzVar) throws zzsn {
        boolean z10;
        if (zzay.zzj(zzzVar.zzo)) {
            Context context = this.zze;
            int i10 = 0;
            boolean z11 = zzzVar.zzs != null;
            List zzaY = zzaY(context, zzsiVar, zzzVar, z11, false);
            if (z11 && zzaY.isEmpty()) {
                zzaY = zzaY(context, zzsiVar, zzzVar, false, false);
            }
            if (zzaY.isEmpty()) {
                return 129;
            }
            if (zzsg.zzaQ(zzzVar)) {
                zzrz zzrzVar = (zzrz) zzaY.get(0);
                boolean zze = zzrzVar.zze(zzzVar);
                if (!zze) {
                    for (int i11 = 1; i11 < zzaY.size(); i11++) {
                        zzrz zzrzVar2 = (zzrz) zzaY.get(i11);
                        if (zzrzVar2.zze(zzzVar)) {
                            zze = true;
                            z10 = false;
                            zzrzVar = zzrzVar2;
                            break;
                        }
                    }
                }
                z10 = true;
                int i12 = true != zze ? 3 : 4;
                int i13 = true != zzrzVar.zzf(zzzVar) ? 8 : 16;
                int i14 = true != zzrzVar.zzg ? 0 : 64;
                int i15 = true != z10 ? 0 : 128;
                if (zzeh.zza >= 26 && "video/dolby-vision".equals(zzzVar.zzo) && !zzzo.zza(context)) {
                    i15 = 256;
                }
                if (zze) {
                    List zzaY2 = zzaY(context, zzsiVar, zzzVar, z11, true);
                    if (!zzaY2.isEmpty()) {
                        zzrz zzrzVar3 = (zzrz) zzst.zzf(zzaY2, zzzVar).get(0);
                        if (zzrzVar3.zze(zzzVar) && zzrzVar3.zzf(zzzVar)) {
                            i10 = 32;
                        }
                    }
                }
                return i15 | i12 | i13 | i10 | i14;
            }
            return 130;
        }
        return 128;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final zzhk zzab(zzrz zzrzVar, zzz zzzVar, zzz zzzVar2) {
        int i10;
        int i11;
        zzhk zzb2 = zzrzVar.zzb(zzzVar, zzzVar2);
        int i12 = zzb2.zze;
        zzzp zzzpVar = this.zzk;
        Objects.requireNonNull(zzzpVar);
        if (zzzVar2.zzv > zzzpVar.zza || zzzVar2.zzw > zzzpVar.zzb) {
            i12 |= 256;
        }
        if (zzae(zzrzVar, zzzVar2) > zzzpVar.zzc) {
            i12 |= 64;
        }
        String str = zzrzVar.zza;
        if (i12 != 0) {
            i11 = i12;
            i10 = 0;
        } else {
            i10 = zzb2.zzd;
            i11 = 0;
        }
        return new zzhk(str, zzzVar, zzzVar2, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsg
    public final zzhk zzac(zzjv zzjvVar) throws zzhs {
        zzhk zzac = super.zzac(zzjvVar);
        zzz zzzVar = zzjvVar.zza;
        Objects.requireNonNull(zzzVar);
        this.zzg.zzp(zzzVar, zzac);
        return zzac;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final zzrt zzaf(zzrz zzrzVar, zzz zzzVar, MediaCrypto mediaCrypto, float f10) {
        Point point;
        int i10;
        int i11;
        boolean z10;
        int zzad;
        zzz[] zzT = zzT();
        int length = zzT.length;
        int zzae = zzae(zzrzVar, zzzVar);
        int i12 = zzzVar.zzv;
        int i13 = zzzVar.zzw;
        if (length != 1) {
            boolean z11 = false;
            for (int i14 = 0; i14 < length; i14++) {
                zzz zzzVar2 = zzT[i14];
                if (zzzVar.zzC != null && zzzVar2.zzC == null) {
                    zzx zzb2 = zzzVar2.zzb();
                    zzb2.zzD(zzzVar.zzC);
                    zzzVar2 = zzb2.zzaj();
                }
                if (zzrzVar.zzb(zzzVar, zzzVar2).zzd != 0) {
                    int i15 = zzzVar2.zzv;
                    z11 |= i15 == -1 || zzzVar2.zzw == -1;
                    i12 = Math.max(i12, i15);
                    i13 = Math.max(i13, zzzVar2.zzw);
                    zzae = Math.max(zzae, zzae(zzrzVar, zzzVar2));
                }
            }
            if (z11) {
                zzdn.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i12 + "x" + i13);
                int i16 = zzzVar.zzw;
                int i17 = zzzVar.zzv;
                boolean z12 = i16 > i17;
                int i18 = z12 ? i16 : i17;
                if (true == z12) {
                    i16 = i17;
                }
                int[] iArr = zzb;
                int i19 = 0;
                while (i19 < 9) {
                    float f11 = i16;
                    float f12 = i18;
                    int i20 = iArr[i19];
                    int[] iArr2 = iArr;
                    float f13 = i20;
                    if (i20 <= i18 || (i10 = (int) (f13 * (f11 / f12))) <= i16) {
                        break;
                    }
                    int i21 = true != z12 ? i20 : i10;
                    if (true != z12) {
                        i20 = i10;
                    }
                    point = zzrzVar.zza(i21, i20);
                    float f14 = zzzVar.zzx;
                    if (point != null) {
                        z10 = z12;
                        i11 = i16;
                        if (zzrzVar.zzg(point.x, point.y, f14)) {
                            break;
                        }
                    } else {
                        i11 = i16;
                        z10 = z12;
                    }
                    i19++;
                    z12 = z10;
                    iArr = iArr2;
                    i16 = i11;
                }
                point = null;
                if (point != null) {
                    i12 = Math.max(i12, point.x);
                    i13 = Math.max(i13, point.y);
                    zzx zzb3 = zzzVar.zzb();
                    zzb3.zzai(i12);
                    zzb3.zzM(i13);
                    zzae = Math.max(zzae, zzad(zzrzVar, zzb3.zzaj()));
                    zzdn.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i12 + "x" + i13);
                }
            }
        } else if (zzae != -1 && (zzad = zzad(zzrzVar, zzzVar)) != -1) {
            zzae = Math.min((int) (zzae * 1.5f), zzad);
        }
        String str = zzrzVar.zzc;
        zzzp zzzpVar = new zzzp(i12, i13, zzae);
        this.zzk = zzzpVar;
        boolean z13 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzzVar.zzv);
        mediaFormat.setInteger("height", zzzVar.zzw);
        zzdq.zzb(mediaFormat, zzzVar.zzr);
        float f15 = zzzVar.zzx;
        if (f15 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f15);
        }
        zzdq.zza(mediaFormat, "rotation-degrees", zzzVar.zzy);
        zzk zzkVar = zzzVar.zzC;
        if (zzkVar != null) {
            zzdq.zza(mediaFormat, "color-transfer", zzkVar.zzd);
            zzdq.zza(mediaFormat, "color-standard", zzkVar.zzb);
            zzdq.zza(mediaFormat, "color-range", zzkVar.zzc);
            byte[] bArr = zzkVar.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzzVar.zzo)) {
            int i22 = zzst.zza;
            Pair zza = zzcx.zza(zzzVar);
            if (zza != null) {
                zzdq.zza(mediaFormat, "profile", ((Integer) zza.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzzpVar.zza);
        mediaFormat.setInteger("max-height", zzzpVar.zzb);
        zzdq.zza(mediaFormat, "max-input-size", zzzpVar.zzc);
        int i23 = zzeh.zza;
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (z13) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i23 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzF));
        }
        Surface zzaX = zzaX(zzrzVar);
        if (this.zzn != null && !zzeh.zzK(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzrt.zzb(zzrzVar, mediaFormat, zzzVar, zzaX, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final List zzag(zzsi zzsiVar, zzz zzzVar, boolean z10) throws zzsn {
        return zzst.zzf(zzaY(this.zze, zzsiVar, zzzVar, false, false), zzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    @TargetApi(29)
    protected final void zzaj(zzha zzhaVar) throws zzhs {
        if (this.zzm) {
            ByteBuffer byteBuffer = zzhaVar.zzf;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzrw zzaz = zzaz();
                        Objects.requireNonNull(zzaz);
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzaz.zzq(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final void zzak(Exception exc) {
        zzdn.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final void zzal(String str, zzrt zzrtVar, long j10, long j11) {
        this.zzg.zzk(str, j10, j11);
        this.zzl = zzaV(str);
        zzrz zzaB = zzaB();
        Objects.requireNonNull(zzaB);
        boolean z10 = false;
        if (zzeh.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzaB.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzh = zzaB.zzh();
            int length = zzh.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (zzh[i10].profile == 16384) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.zzm = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final void zzam(String str) {
        this.zzg.zzl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final void zzan(zzz zzzVar, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        zzrw zzaz = zzaz();
        if (zzaz != null) {
            zzaz.zzr(this.zzu);
        }
        Objects.requireNonNull(mediaFormat);
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z10) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        if (z10) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        float f10 = zzzVar.zzz;
        int i10 = zzzVar.zzy;
        if (i10 == 90 || i10 == 270) {
            f10 = 1.0f / f10;
            int i11 = integer2;
            integer2 = integer;
            integer = i11;
        }
        this.zzD = new zzcc(integer, integer2, f10);
        zzabc zzabcVar = this.zzn;
        if (zzabcVar != null && this.zzK) {
            zzx zzb2 = zzzVar.zzb();
            zzb2.zzai(integer);
            zzb2.zzM(integer2);
            zzb2.zzZ(f10);
            zzz zzaj = zzb2.zzaj();
            List list = this.zzp;
            if (list == null) {
                list = zzfvv.zzn();
            }
            zzabcVar.zzl(1, zzaj, list);
        } else {
            this.zzi.zzl(zzzVar.zzx);
        }
        this.zzK = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzao(zzrw zzrwVar, int i10, long j10, long j11) {
        Trace.beginSection("releaseOutputBuffer");
        zzrwVar.zzn(i10, j11);
        Trace.endSection();
        ((zzsg) this).zza.zze++;
        this.zzy = 0;
        if (this.zzn == null) {
            zzcc zzccVar = this.zzD;
            if (!zzccVar.equals(zzcc.zza) && !zzccVar.equals(this.zzE)) {
                this.zzE = zzccVar;
                this.zzg.zzt(zzccVar);
            }
            if (!this.zzi.zzp() || this.zzq == null) {
                return;
            }
            zzba();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final void zzap() {
        zzabc zzabcVar = this.zzn;
        if (zzabcVar != null) {
            zzabcVar.zzA();
            this.zzn.zzw(zzaw(), -this.zzI, zzf());
        } else {
            this.zzi.zzf();
        }
        this.zzK = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final void zzaq() {
        zzabc zzabcVar = this.zzn;
        if (zzabcVar != null) {
            zzabcVar.zzA();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final boolean zzar(long j10, long j11, zzrw zzrwVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzz zzzVar) throws zzhs {
        Objects.requireNonNull(zzrwVar);
        long zzav = j12 - zzav();
        zzabc zzabcVar = this.zzn;
        if (zzabcVar != null) {
            return zzabcVar.zzB(j12 + (-this.zzI), z11, new zzzn(this, zzrwVar, i10, zzav));
        }
        int zza = this.zzi.zza(j12, j10, j11, zzaw(), z11, this.zzj);
        if (zza != 4) {
            if (z10 && !z11) {
                zzaR(zzrwVar, i10, zzav);
                return true;
            } else if (this.zzq == null) {
                if (this.zzj.zzc() < 0 || (this.zzj.zzc() < 30000 && zza != 5)) {
                    zzaR(zzrwVar, i10, zzav);
                    zzaT(this.zzj.zzc());
                    return true;
                }
            } else if (zza == 0) {
                zzao(zzrwVar, i10, zzav, zzi().zzc());
                zzaT(this.zzj.zzc());
                return true;
            } else if (zza == 1) {
                zzaae zzaaeVar = this.zzj;
                long zzd2 = zzaaeVar.zzd();
                long zzc2 = zzaaeVar.zzc();
                if (zzd2 == this.zzC) {
                    zzaR(zzrwVar, i10, zzav);
                } else {
                    zzao(zzrwVar, i10, zzav, zzd2);
                }
                zzaT(zzc2);
                this.zzC = zzd2;
                return true;
            } else if (zza == 2) {
                Trace.beginSection("dropVideoBuffer");
                zzrwVar.zzo(i10, false);
                Trace.endSection();
                zzaS(0, 1);
                zzaT(this.zzj.zzc());
                return true;
            } else if (zza == 3) {
                zzaR(zzrwVar, i10, zzav);
                zzaT(this.zzj.zzc());
                return true;
            } else if (zza != 5) {
                throw new IllegalStateException(String.valueOf(zza));
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final int zzau(zzha zzhaVar) {
        int i10 = zzeh.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhi, com.google.android.gms.internal.ads.zzla
    public final void zzt() {
        zzabc zzabcVar = this.zzn;
        if (zzabcVar != null) {
            zzabcVar.zzi();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzhi, com.google.android.gms.internal.ads.zzkv
    public final void zzu(int i10, Object obj) throws zzhs {
        if (i10 == 1) {
            zzbc(obj);
        } else if (i10 == 7) {
            Objects.requireNonNull(obj);
            zzaad zzaadVar = (zzaad) obj;
            this.zzH = zzaadVar;
            zzabc zzabcVar = this.zzn;
            if (zzabcVar != null) {
                zzabcVar.zzy(zzaadVar);
            }
        } else if (i10 == 10) {
            Objects.requireNonNull(obj);
            int intValue = ((Integer) obj).intValue();
            if (this.zzG != intValue) {
                this.zzG = intValue;
            }
        } else if (i10 == 4) {
            Objects.requireNonNull(obj);
            int intValue2 = ((Integer) obj).intValue();
            this.zzu = intValue2;
            zzrw zzaz = zzaz();
            if (zzaz != null) {
                zzaz.zzr(intValue2);
            }
        } else if (i10 == 5) {
            Objects.requireNonNull(obj);
            int intValue3 = ((Integer) obj).intValue();
            this.zzv = intValue3;
            zzabc zzabcVar2 = this.zzn;
            if (zzabcVar2 != null) {
                zzabcVar2.zzs(intValue3);
            } else {
                this.zzi.zzj(intValue3);
            }
        } else if (i10 == 13) {
            Objects.requireNonNull(obj);
            List list = (List) obj;
            this.zzp = list;
            zzabc zzabcVar3 = this.zzn;
            if (zzabcVar3 != null) {
                zzabcVar3.zzx(list);
            }
        } else if (i10 == 14) {
            Objects.requireNonNull(obj);
            zzdy zzdyVar = (zzdy) obj;
            if (zzdyVar.zzb() == 0 || zzdyVar.zza() == 0) {
                return;
            }
            this.zzs = zzdyVar;
            zzabc zzabcVar4 = this.zzn;
            if (zzabcVar4 != null) {
                Surface surface = this.zzq;
                zzcv.zzb(surface);
                zzabcVar4.zzu(surface, zzdyVar);
            }
        } else if (i10 != 16) {
            if (i10 != 17) {
                super.zzu(i10, obj);
                return;
            }
            Surface surface2 = this.zzq;
            zzbc(null);
            Objects.requireNonNull(obj);
            ((zzzq) obj).zzu(1, surface2);
        } else {
            Objects.requireNonNull(obj);
            this.zzF = ((Integer) obj).intValue();
            zzrw zzaz2 = zzaz();
            if (zzaz2 == null || zzeh.zza < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzF));
            zzaz2.zzq(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzhi
    public final void zzx() {
        this.zzE = null;
        this.zzJ = -9223372036854775807L;
        zzabc zzabcVar = this.zzn;
        if (zzabcVar != null) {
            zzabcVar.zzm();
        } else {
            this.zzi.zzd();
        }
        this.zzt = false;
        try {
            super.zzx();
        } finally {
            this.zzg.zzm(((zzsg) this).zza);
            this.zzg.zzt(zzcc.zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzhi
    public final void zzy(boolean z10, boolean z11) throws zzhs {
        super.zzy(z10, z11);
        zzn();
        this.zzg.zzo(((zzsg) this).zza);
        if (!this.zzo) {
            if (this.zzp != null && this.zzn == null) {
                zzzw zzzwVar = new zzzw(this.zze, this.zzi);
                zzzwVar.zze(zzi());
                zzaac zzf = zzzwVar.zzf();
                zzf.zzs(1);
                this.zzn = zzf.zzg(0);
            }
            this.zzo = true;
        }
        zzabc zzabcVar = this.zzn;
        if (zzabcVar != null) {
            zzabcVar.zzt(new zzzm(this), zzgbh.zzc());
            zzaad zzaadVar = this.zzH;
            if (zzaadVar != null) {
                this.zzn.zzy(zzaadVar);
            }
            if (this.zzq != null && !this.zzs.equals(zzdy.zza)) {
                this.zzn.zzu(this.zzq, this.zzs);
            }
            this.zzn.zzs(this.zzv);
            this.zzn.zzv(zzat());
            List list = this.zzp;
            if (list != null) {
                this.zzn.zzx(list);
            }
            this.zzn.zzn(z11);
            zzkz zzay = zzay();
            if (zzay != null) {
                this.zzn.zzz(zzay);
                return;
            }
            return;
        }
        this.zzi.zzk(zzi());
        this.zzi.zze(z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzhi
    public final void zzz(long j10, boolean z10) throws zzhs {
        zzabc zzabcVar = this.zzn;
        if (zzabcVar != null) {
            if (!z10) {
                zzabcVar.zzj(true);
            }
            this.zzn.zzw(zzaw(), -this.zzI, zzf());
            this.zzK = true;
        }
        super.zzz(j10, z10);
        if (this.zzn == null) {
            this.zzi.zzi();
        }
        if (z10) {
            zzabc zzabcVar2 = this.zzn;
            if (zzabcVar2 != null) {
                zzabcVar2.zzk(false);
            } else {
                this.zzi.zzc(false);
            }
        }
        this.zzy = 0;
    }
}
