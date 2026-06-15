package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzql extends zzsg implements zzkb {
    private final Context zzb;
    private final zzox zzc;
    private final zzpf zzd;
    private final zzrs zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzz zzi;
    private zzz zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzql(Context context, zzru zzruVar, zzsi zzsiVar, boolean z10, Handler handler, zzoy zzoyVar, zzpf zzpfVar) {
        super(1, zzruVar, zzsiVar, false, 44100.0f);
        zzrs zzrsVar = zzeh.zza >= 35 ? new zzrs(zzrr.zza) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzpfVar;
        this.zze = zzrsVar;
        this.zzo = -1000;
        this.zzc = new zzox(handler, zzoyVar);
        zzpfVar.zzq(new zzqj(this, null));
    }

    private final int zzaR(zzrz zzrzVar, zzz zzzVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(zzrzVar.zza) || (i10 = zzeh.zza) >= 24 || (i10 == 23 && zzeh.zzM(this.zzb))) {
            return zzzVar.zzp;
        }
        return -1;
    }

    private static List zzaS(zzsi zzsiVar, zzz zzzVar, boolean z10, zzpf zzpfVar) throws zzsn {
        zzrz zza;
        if (zzzVar.zzo == null) {
            return zzfvv.zzn();
        }
        if (zzpfVar.zzA(zzzVar) && (zza = zzst.zza()) != null) {
            return zzfvv.zzo(zza);
        }
        return zzst.zze(zzsiVar, zzzVar, false, false);
    }

    private final void zzaT() {
        long zzb = this.zzd.zzb(zzW());
        if (zzb != Long.MIN_VALUE) {
            if (!this.zzl) {
                zzb = Math.max(this.zzk, zzb);
            }
            this.zzk = zzb;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    protected final void zzA() {
        zzrs zzrsVar;
        this.zzd.zzk();
        if (zzeh.zza < 35 || (zzrsVar = this.zze) == null) {
            return;
        }
        zzrsVar.zzb();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzhi
    public final void zzC() {
        this.zzn = false;
        try {
            super.zzC();
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
        } catch (Throwable th) {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    protected final void zzD() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    protected final void zzE() {
        zzaT();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzla, com.google.android.gms.internal.ads.zzld
    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzla
    public final boolean zzW() {
        return super.zzW() && this.zzd.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzla
    public final boolean zzX() {
        return this.zzd.zzy() || super.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final float zzZ(float f10, zzz zzzVar, zzz[] zzzVarArr) {
        int i10 = -1;
        for (zzz zzzVar2 : zzzVarArr) {
            int i11 = zzzVar2.zzF;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return i10 * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final long zza() {
        if (zzcT() == 2) {
            zzaT();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final int zzaa(zzsi zzsiVar, zzz zzzVar) throws zzsn {
        int i10;
        boolean z10;
        if (zzay.zzh(zzzVar.zzo)) {
            int i11 = zzzVar.zzL;
            boolean zzaQ = zzsg.zzaQ(zzzVar);
            int i12 = 1;
            if (!zzaQ || (i11 != 0 && zzst.zza() == null)) {
                i10 = 0;
            } else {
                zzok zzd = this.zzd.zzd(zzzVar);
                if (zzd.zzb) {
                    i10 = true != zzd.zzc ? AdRequest.MAX_CONTENT_URL_LENGTH : 1536;
                    if (zzd.zzd) {
                        i10 |= com.ironsource.mediationsdk.metadata.a.f18931n;
                    }
                } else {
                    i10 = 0;
                }
                if (this.zzd.zzA(zzzVar)) {
                    return i10 | 172;
                }
            }
            if ((!"audio/raw".equals(zzzVar.zzo) || this.zzd.zzA(zzzVar)) && this.zzd.zzA(zzeh.zzA(2, zzzVar.zzE, zzzVar.zzF))) {
                List zzaS = zzaS(zzsiVar, zzzVar, false, this.zzd);
                if (!zzaS.isEmpty()) {
                    if (zzaQ) {
                        zzrz zzrzVar = (zzrz) zzaS.get(0);
                        boolean zze = zzrzVar.zze(zzzVar);
                        if (!zze) {
                            for (int i13 = 1; i13 < zzaS.size(); i13++) {
                                zzrz zzrzVar2 = (zzrz) zzaS.get(i13);
                                if (zzrzVar2.zze(zzzVar)) {
                                    z10 = false;
                                    zze = true;
                                    zzrzVar = zzrzVar2;
                                    break;
                                }
                            }
                        }
                        z10 = true;
                        int i14 = true != zze ? 3 : 4;
                        int i15 = 8;
                        if (zze && zzrzVar.zzf(zzzVar)) {
                            i15 = 16;
                        }
                        return i14 | i15 | 32 | (true != zzrzVar.zzg ? 0 : 64) | (true != z10 ? 0 : 128) | i10;
                    }
                    i12 = 2;
                }
            }
            return i12 | 128;
        }
        return 128;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final zzhk zzab(zzrz zzrzVar, zzz zzzVar, zzz zzzVar2) {
        int i10;
        int i11;
        zzhk zzb = zzrzVar.zzb(zzzVar, zzzVar2);
        int i12 = zzb.zze;
        if (zzaM(zzzVar2)) {
            i12 |= 32768;
        }
        if (zzaR(zzrzVar, zzzVar2) > this.zzf) {
            i12 |= 64;
        }
        String str = zzrzVar.zza;
        if (i12 != 0) {
            i11 = i12;
            i10 = 0;
        } else {
            i10 = zzb.zzd;
            i11 = 0;
        }
        return new zzhk(str, zzzVar, zzzVar2, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsg
    public final zzhk zzac(zzjv zzjvVar) throws zzhs {
        zzz zzzVar = zzjvVar.zza;
        Objects.requireNonNull(zzzVar);
        this.zzi = zzzVar;
        zzhk zzac = super.zzac(zzjvVar);
        this.zzc.zzu(zzzVar, zzac);
        return zzac;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x00ce, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0110  */
    @Override // com.google.android.gms.internal.ads.zzsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.google.android.gms.internal.ads.zzrt zzaf(com.google.android.gms.internal.ads.zzrz r8, com.google.android.gms.internal.ads.zzz r9, android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzql.zzaf(com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zzz, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzrt");
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final List zzag(zzsi zzsiVar, zzz zzzVar, boolean z10) throws zzsn {
        return zzst.zzf(zzaS(zzsiVar, zzzVar, false, this.zzd), zzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final void zzaj(zzha zzhaVar) {
        zzz zzzVar;
        if (zzeh.zza < 29 || (zzzVar = zzhaVar.zza) == null || !Objects.equals(zzzVar.zzo, "audio/opus") || !zzaL()) {
            return;
        }
        ByteBuffer byteBuffer = zzhaVar.zzf;
        Objects.requireNonNull(byteBuffer);
        zzz zzzVar2 = zzhaVar.zza;
        Objects.requireNonNull(zzzVar2);
        int i10 = zzzVar2.zzH;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzr(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final void zzak(Exception exc) {
        zzdn.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzm(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final void zzal(String str, zzrt zzrtVar, long j10, long j11) {
        this.zzc.zzq(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final void zzam(String str) {
        this.zzc.zzr(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final void zzan(zzz zzzVar, MediaFormat mediaFormat) throws zzhs {
        int zzn;
        int[] iArr;
        int i10;
        zzz zzzVar2 = this.zzj;
        int[] iArr2 = null;
        if (zzzVar2 != null) {
            zzzVar = zzzVar2;
        } else if (zzaz() != null) {
            Objects.requireNonNull(mediaFormat);
            if ("audio/raw".equals(zzzVar.zzo)) {
                zzn = zzzVar.zzG;
            } else if (zzeh.zza >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                zzn = mediaFormat.getInteger("pcm-encoding");
            } else {
                zzn = mediaFormat.containsKey("v-bits-per-sample") ? zzeh.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            zzx zzxVar = new zzx();
            zzxVar.zzad("audio/raw");
            zzxVar.zzX(zzn);
            zzxVar.zzI(zzzVar.zzH);
            zzxVar.zzJ(zzzVar.zzI);
            zzxVar.zzW(zzzVar.zzl);
            zzxVar.zzO(zzzVar.zza);
            zzxVar.zzQ(zzzVar.zzb);
            zzxVar.zzR(zzzVar.zzc);
            zzxVar.zzS(zzzVar.zzd);
            zzxVar.zzaf(zzzVar.zze);
            zzxVar.zzab(zzzVar.zzf);
            zzxVar.zzB(mediaFormat.getInteger("channel-count"));
            zzxVar.zzae(mediaFormat.getInteger("sample-rate"));
            zzz zzaj = zzxVar.zzaj();
            if (this.zzg && zzaj.zzE == 6 && (i10 = zzzVar.zzE) < 6) {
                iArr2 = new int[i10];
                for (int i11 = 0; i11 < zzzVar.zzE; i11++) {
                    iArr2[i11] = i11;
                }
            } else if (this.zzh) {
                int i12 = zzaj.zzE;
                if (i12 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i12 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i12 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i12 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i12 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
                iArr2 = iArr;
            }
            zzzVar = zzaj;
        }
        try {
            int i13 = zzeh.zza;
            if (i13 >= 29) {
                if (zzaL()) {
                    zzn();
                }
                zzcv.zzf(i13 >= 29);
            }
            this.zzd.zze(zzzVar, 0, iArr2);
        } catch (zzpa e8) {
            throw zzcW(e8, e8.zza, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    public final void zzao() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final void zzap() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final void zzaq() throws zzhs {
        try {
            this.zzd.zzj();
        } catch (zzpe e8) {
            throw zzcW(e8, e8.zzc, e8.zzb, true != zzaL() ? IronSourceConstants.errorCode_isReadyException : IronSourceConstants.errorCode_loadInProgress);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final boolean zzar(long j10, long j11, zzrw zzrwVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzz zzzVar) throws zzhs {
        Objects.requireNonNull(byteBuffer);
        if (this.zzj != null && (i11 & 2) != 0) {
            Objects.requireNonNull(zzrwVar);
            zzrwVar.zzo(i10, false);
            return true;
        } else if (z10) {
            if (zzrwVar != null) {
                zzrwVar.zzo(i10, false);
            }
            ((zzsg) this).zza.zzf += i12;
            this.zzd.zzg();
            return true;
        } else {
            try {
                if (this.zzd.zzx(byteBuffer, j12, i12)) {
                    if (zzrwVar != null) {
                        zzrwVar.zzo(i10, false);
                    }
                    ((zzsg) this).zza.zze += i12;
                    return true;
                }
                return false;
            } catch (zzpb e8) {
                zzz zzzVar2 = this.zzi;
                if (zzaL()) {
                    zzn();
                }
                throw zzcW(e8, zzzVar2, e8.zzb, IronSourceConstants.errorCode_biddingDataException);
            } catch (zzpe e10) {
                if (zzaL()) {
                    zzn();
                }
                throw zzcW(e10, zzzVar, e10.zzb, IronSourceConstants.errorCode_isReadyException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    protected final boolean zzas(zzz zzzVar) {
        zzn();
        return this.zzd.zzA(zzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final zzbb zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final void zzg(zzbb zzbbVar) {
        this.zzd.zzs(zzbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final boolean zzj() {
        boolean z10 = this.zzn;
        this.zzn = false;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzhi, com.google.android.gms.internal.ads.zzla
    public final zzkb zzl() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzhi, com.google.android.gms.internal.ads.zzkv
    public final void zzu(int i10, Object obj) throws zzhs {
        zzrs zzrsVar;
        if (i10 == 2) {
            zzpf zzpfVar = this.zzd;
            Objects.requireNonNull(obj);
            zzpfVar.zzw(((Float) obj).floatValue());
        } else if (i10 == 3) {
            zze zzeVar = (zze) obj;
            zzpf zzpfVar2 = this.zzd;
            Objects.requireNonNull(zzeVar);
            zzpfVar2.zzm(zzeVar);
        } else if (i10 == 6) {
            zzf zzfVar = (zzf) obj;
            zzpf zzpfVar3 = this.zzd;
            Objects.requireNonNull(zzfVar);
            zzpfVar3.zzo(zzfVar);
        } else if (i10 == 12) {
            int i11 = zzeh.zza;
            this.zzd.zzu((AudioDeviceInfo) obj);
        } else if (i10 == 16) {
            Objects.requireNonNull(obj);
            this.zzo = ((Integer) obj).intValue();
            zzrw zzaz = zzaz();
            if (zzaz == null || zzeh.zza < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzo));
            zzaz.zzq(bundle);
        } else if (i10 == 9) {
            zzpf zzpfVar4 = this.zzd;
            Objects.requireNonNull(obj);
            zzpfVar4.zzv(((Boolean) obj).booleanValue());
        } else if (i10 != 10) {
            super.zzu(i10, obj);
        } else {
            Objects.requireNonNull(obj);
            int intValue = ((Integer) obj).intValue();
            this.zzd.zzn(intValue);
            if (zzeh.zza < 35 || (zzrsVar = this.zze) == null) {
                return;
            }
            zzrsVar.zzd(intValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzhi
    public final void zzx() {
        this.zzm = true;
        this.zzi = null;
        try {
            this.zzd.zzf();
            super.zzx();
        } finally {
            this.zzc.zzs(((zzsg) this).zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzhi
    public final void zzy(boolean z10, boolean z11) throws zzhs {
        super.zzy(z10, z11);
        this.zzc.zzt(((zzsg) this).zza);
        zzn();
        this.zzd.zzt(zzo());
        this.zzd.zzp(zzi());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzhi
    public final void zzz(long j10, boolean z10) throws zzhs {
        super.zzz(j10, z10);
        this.zzd.zzf();
        this.zzk = j10;
        this.zzn = false;
        this.zzl = true;
    }
}
