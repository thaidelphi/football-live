package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzagm implements zzacj {
    private static final byte[] zza = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final UUID zze;
    private static final Map zzf;
    private long zzA;
    private boolean zzB;
    private zzagk zzC;
    private boolean zzD;
    private int zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private long zzJ;
    private zzdo zzK;
    private zzdo zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private long zzP;
    private long zzQ;
    private int zzR;
    private int zzS;
    private int[] zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private long zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private int zzag;
    private byte zzah;
    private boolean zzai;
    private zzacm zzaj;
    private final zzagh zzak;
    private final zzago zzg;
    private final SparseArray zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final zzaje zzk;
    private final zzdx zzl;
    private final zzdx zzm;
    private final zzdx zzn;
    private final zzdx zzo;
    private final zzdx zzp;
    private final zzdx zzq;
    private final zzdx zzr;
    private final zzdx zzs;
    private final zzdx zzt;
    private final zzdx zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i10 = zzeh.zza;
        zzb = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzc = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zzd = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zze = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzf = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public zzagm() {
        this(new zzagh(), 2, zzaje.zza);
    }

    private final int zzp(zzack zzackVar, zzagk zzagkVar, int i10, boolean z10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(zzagkVar.zzc)) {
            zzx(zzackVar, zza, i10);
            int i12 = this.zzab;
            zzw();
            return i12;
        } else if ("S_TEXT/ASS".equals(zzagkVar.zzc)) {
            zzx(zzackVar, zzc, i10);
            int i13 = this.zzab;
            zzw();
            return i13;
        } else if ("S_TEXT/WEBVTT".equals(zzagkVar.zzc)) {
            zzx(zzackVar, zzd, i10);
            int i14 = this.zzab;
            zzw();
            return i14;
        } else {
            zzadp zzadpVar = zzagkVar.zzX;
            if (!this.zzad) {
                if (zzagkVar.zzh) {
                    this.zzW &= -1073741825;
                    if (!this.zzae) {
                        zzackVar.zzi(this.zzn.zzN(), 0, 1);
                        this.zzaa++;
                        if ((this.zzn.zzN()[0] & 128) != 128) {
                            this.zzah = this.zzn.zzN()[0];
                            this.zzae = true;
                        } else {
                            throw zzaz.zza("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b10 = this.zzah;
                    if ((b10 & 1) == 1) {
                        int i15 = b10 & 2;
                        this.zzW |= 1073741824;
                        if (!this.zzai) {
                            zzackVar.zzi(this.zzs.zzN(), 0, 8);
                            this.zzaa += 8;
                            this.zzai = true;
                            this.zzn.zzN()[0] = (byte) ((i15 != 2 ? 0 : 128) | 8);
                            this.zzn.zzL(0);
                            zzadpVar.zzs(this.zzn, 1, 1);
                            this.zzab++;
                            this.zzs.zzL(0);
                            zzadpVar.zzs(this.zzs, 8, 1);
                            this.zzab += 8;
                        }
                        if (i15 == 2) {
                            if (!this.zzaf) {
                                zzackVar.zzi(this.zzn.zzN(), 0, 1);
                                this.zzaa++;
                                this.zzn.zzL(0);
                                this.zzag = this.zzn.zzm();
                                this.zzaf = true;
                            }
                            int i16 = this.zzag * 4;
                            this.zzn.zzI(i16);
                            zzackVar.zzi(this.zzn.zzN(), 0, i16);
                            this.zzaa += i16;
                            int i17 = (this.zzag >> 1) + 1;
                            int i18 = (i17 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzv;
                            if (byteBuffer == null || byteBuffer.capacity() < i18) {
                                this.zzv = ByteBuffer.allocate(i18);
                            }
                            this.zzv.position(0);
                            this.zzv.putShort((short) i17);
                            int i19 = 0;
                            int i20 = 0;
                            while (true) {
                                i11 = this.zzag;
                                if (i19 >= i11) {
                                    break;
                                }
                                int zzp = this.zzn.zzp();
                                int i21 = zzp - i20;
                                if (i19 % 2 == 0) {
                                    this.zzv.putShort((short) i21);
                                } else {
                                    this.zzv.putInt(i21);
                                }
                                i19++;
                                i20 = zzp;
                            }
                            int i22 = (i10 - this.zzaa) - i20;
                            if ((i11 & 1) == 1) {
                                this.zzv.putInt(i22);
                            } else {
                                this.zzv.putShort((short) i22);
                                this.zzv.putInt(0);
                            }
                            this.zzt.zzJ(this.zzv.array(), i18);
                            zzadpVar.zzs(this.zzt, i18, 1);
                            this.zzab += i18;
                        }
                    }
                } else {
                    byte[] bArr = zzagkVar.zzi;
                    if (bArr != null) {
                        this.zzq.zzJ(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(zzagkVar.zzc) ? zzagkVar.zzg > 0 : z10) {
                    this.zzW |= 268435456;
                    this.zzu.zzI(0);
                    int zze2 = (this.zzq.zze() + i10) - this.zzaa;
                    this.zzn.zzI(4);
                    this.zzn.zzN()[0] = (byte) ((zze2 >> 24) & 255);
                    this.zzn.zzN()[1] = (byte) ((zze2 >> 16) & 255);
                    this.zzn.zzN()[2] = (byte) ((zze2 >> 8) & 255);
                    this.zzn.zzN()[3] = (byte) (zze2 & 255);
                    zzadpVar.zzs(this.zzn, 4, 2);
                    this.zzab += 4;
                }
                this.zzad = true;
            }
            int zze3 = i10 + this.zzq.zze();
            if (!"V_MPEG4/ISO/AVC".equals(zzagkVar.zzc) && !"V_MPEGH/ISO/HEVC".equals(zzagkVar.zzc)) {
                if (zzagkVar.zzU != null) {
                    zzcv.zzf(this.zzq.zze() == 0);
                    zzagkVar.zzU.zzd(zzackVar);
                }
                while (true) {
                    int i23 = this.zzaa;
                    if (i23 >= zze3) {
                        break;
                    }
                    int zzq = zzq(zzackVar, zzadpVar, zze3 - i23);
                    this.zzaa += zzq;
                    this.zzab += zzq;
                }
            } else {
                byte[] zzN = this.zzm.zzN();
                zzN[0] = 0;
                zzN[1] = 0;
                zzN[2] = 0;
                int i24 = zzagkVar.zzY;
                int i25 = 4 - i24;
                while (this.zzaa < zze3) {
                    int i26 = this.zzac;
                    if (i26 == 0) {
                        int min = Math.min(i24, this.zzq.zzb());
                        zzackVar.zzi(zzN, i25 + min, i24 - min);
                        if (min > 0) {
                            this.zzq.zzH(zzN, i25, min);
                        }
                        this.zzaa += i24;
                        this.zzm.zzL(0);
                        this.zzac = this.zzm.zzp();
                        this.zzl.zzL(0);
                        zzadpVar.zzr(this.zzl, 4);
                        this.zzab += 4;
                    } else {
                        int zzq2 = zzq(zzackVar, zzadpVar, i26);
                        this.zzaa += zzq2;
                        this.zzab += zzq2;
                        this.zzac -= zzq2;
                    }
                }
            }
            if ("A_VORBIS".equals(zzagkVar.zzc)) {
                this.zzo.zzL(0);
                zzadpVar.zzr(this.zzo, 4);
                this.zzab += 4;
            }
            int i27 = this.zzab;
            zzw();
            return i27;
        }
    }

    private final int zzq(zzack zzackVar, zzadp zzadpVar, int i10) throws IOException {
        int zzb2 = this.zzq.zzb();
        if (zzb2 > 0) {
            int min = Math.min(i10, zzb2);
            zzadpVar.zzr(this.zzq, min);
            return min;
        }
        return zzadpVar.zzf(zzackVar, i10, false);
    }

    private final long zzr(long j10) throws zzaz {
        long j11 = this.zzy;
        if (j11 != -9223372036854775807L) {
            return zzeh.zzu(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw zzaz.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void zzs(int i10) throws zzaz {
        if (this.zzK == null || this.zzL == null) {
            throw zzaz.zza("Element " + i10 + " must be in a Cues", null);
        }
    }

    private final void zzt(int i10) throws zzaz {
        if (this.zzC != null) {
            return;
        }
        throw zzaz.zza("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0 A[EDGE_INSN: B:62:0x00e0->B:51:0x00e0 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzu(com.google.android.gms.internal.ads.zzagk r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagm.zzu(com.google.android.gms.internal.ads.zzagk, long, int, int, int):void");
    }

    private final void zzv(zzack zzackVar, int i10) throws IOException {
        if (this.zzn.zze() >= i10) {
            return;
        }
        if (this.zzn.zzc() < i10) {
            zzdx zzdxVar = this.zzn;
            int zzc2 = zzdxVar.zzc();
            zzdxVar.zzF(Math.max(zzc2 + zzc2, i10));
        }
        zzdx zzdxVar2 = this.zzn;
        zzackVar.zzi(zzdxVar2.zzN(), zzdxVar2.zze(), i10 - zzdxVar2.zze());
        this.zzn.zzK(i10);
    }

    private final void zzw() {
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = 0;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = false;
        this.zzag = 0;
        this.zzah = (byte) 0;
        this.zzai = false;
        this.zzq.zzI(0);
    }

    private final void zzx(zzack zzackVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length;
        int i11 = length + i10;
        if (this.zzr.zzc() < i11) {
            zzdx zzdxVar = this.zzr;
            byte[] copyOf = Arrays.copyOf(bArr, i11 + i10);
            zzdxVar.zzJ(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzN(), 0, length);
        }
        zzackVar.zzi(this.zzr.zzN(), length, i10);
        this.zzr.zzL(0);
        this.zzr.zzK(i11);
    }

    private static byte[] zzy(long j10, String str, long j11) {
        zzcv.zzd(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        int i13 = zzeh.zza;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    private static int[] zzz(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final int zzb(zzack zzackVar, zzadf zzadfVar) throws IOException {
        this.zzN = false;
        while (!this.zzN) {
            if (!this.zzak.zzc(zzackVar)) {
                for (int i10 = 0; i10 < this.zzh.size(); i10++) {
                    zzagk zzagkVar = (zzagk) this.zzh.valueAt(i10);
                    zzagk.zzd(zzagkVar);
                    zzadq zzadqVar = zzagkVar.zzU;
                    if (zzadqVar != null) {
                        zzadqVar.zza(zzagkVar.zzX, zzagkVar.zzj);
                    }
                }
                return -1;
            }
            long zzf2 = zzackVar.zzf();
            if (this.zzG) {
                this.zzI = zzf2;
                zzadfVar.zza = this.zzH;
                this.zzG = false;
                return 1;
            } else if (this.zzD) {
                long j10 = this.zzI;
                if (j10 != -1) {
                    zzadfVar.zza = j10;
                    this.zzI = -1L;
                    return 1;
                }
            }
        }
        return 0;
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
        if (this.zzj) {
            zzacmVar = new zzajh(zzacmVar, this.zzk);
        }
        this.zzaj = zzacmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zzf(long j10, long j11) {
        this.zzJ = -9223372036854775807L;
        this.zzO = 0;
        this.zzak.zzb();
        this.zzg.zze();
        zzw();
        for (int i10 = 0; i10 < this.zzh.size(); i10++) {
            zzadq zzadqVar = ((zzagk) this.zzh.valueAt(i10)).zzU;
            if (zzadqVar != null) {
                zzadqVar.zzb();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzh(int i10, int i11, zzack zzackVar) throws IOException {
        int i12;
        long j10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i10;
        int i18 = 1;
        int i19 = 0;
        if (i17 != 161 && i17 != 163) {
            if (i17 == 165) {
                if (this.zzO != 2) {
                    return;
                }
                zzagk zzagkVar = (zzagk) this.zzh.get(this.zzU);
                if (this.zzX == 4 && "V_VP9".equals(zzagkVar.zzc)) {
                    this.zzu.zzI(i11);
                    zzackVar.zzi(this.zzu.zzN(), 0, i11);
                    return;
                }
                zzackVar.zzk(i11);
                return;
            } else if (i17 == 16877) {
                zzt(i10);
                zzagk zzagkVar2 = this.zzC;
                if (zzagk.zza(zzagkVar2) != 1685485123 && zzagk.zza(zzagkVar2) != 1685480259) {
                    zzackVar.zzk(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                zzagkVar2.zzO = bArr;
                zzackVar.zzi(bArr, 0, i11);
                return;
            } else if (i17 == 16981) {
                zzt(i10);
                byte[] bArr2 = new byte[i11];
                this.zzC.zzi = bArr2;
                zzackVar.zzi(bArr2, 0, i11);
                return;
            } else if (i17 == 18402) {
                byte[] bArr3 = new byte[i11];
                zzackVar.zzi(bArr3, 0, i11);
                zzt(i10);
                this.zzC.zzj = new zzado(1, bArr3, 0, 0);
                return;
            } else if (i17 == 21419) {
                Arrays.fill(this.zzp.zzN(), (byte) 0);
                zzackVar.zzi(this.zzp.zzN(), 4 - i11, i11);
                this.zzp.zzL(0);
                this.zzE = (int) this.zzp.zzu();
                return;
            } else if (i17 == 25506) {
                zzt(i10);
                byte[] bArr4 = new byte[i11];
                this.zzC.zzk = bArr4;
                zzackVar.zzi(bArr4, 0, i11);
                return;
            } else if (i17 == 30322) {
                zzt(i10);
                byte[] bArr5 = new byte[i11];
                this.zzC.zzw = bArr5;
                zzackVar.zzi(bArr5, 0, i11);
                return;
            } else {
                throw zzaz.zza("Unexpected id: " + i17, null);
            }
        }
        int i20 = 8;
        if (this.zzO == 0) {
            this.zzU = (int) this.zzg.zzd(zzackVar, false, true, 8);
            this.zzV = this.zzg.zza();
            this.zzQ = -9223372036854775807L;
            this.zzO = 1;
            this.zzn.zzI(0);
        }
        zzagk zzagkVar3 = (zzagk) this.zzh.get(this.zzU);
        if (zzagkVar3 == null) {
            zzackVar.zzk(i11 - this.zzV);
            this.zzO = 0;
            return;
        }
        zzagk.zzd(zzagkVar3);
        if (this.zzO == 1) {
            zzv(zzackVar, 3);
            int i21 = (this.zzn.zzN()[2] & 6) >> 1;
            if (i21 == 0) {
                this.zzS = 1;
                int[] zzz = zzz(this.zzT, 1);
                this.zzT = zzz;
                zzz[0] = (i11 - this.zzV) - 3;
            } else {
                zzv(zzackVar, 4);
                int i22 = (this.zzn.zzN()[3] & 255) + 1;
                this.zzS = i22;
                int[] zzz2 = zzz(this.zzT, i22);
                this.zzT = zzz2;
                if (i21 == 2) {
                    int i23 = this.zzS;
                    Arrays.fill(zzz2, 0, i23, ((i11 - this.zzV) - 4) / i23);
                } else if (i21 != 1) {
                    if (i21 == 3) {
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 4;
                        while (true) {
                            int i27 = this.zzS - 1;
                            if (i24 < i27) {
                                this.zzT[i24] = i19;
                                i26++;
                                zzv(zzackVar, i26);
                                int i28 = i26 - 1;
                                if (this.zzn.zzN()[i28] == 0) {
                                    throw zzaz.zza("No valid varint length mask found", null);
                                }
                                int i29 = i19;
                                while (true) {
                                    if (i29 >= i20) {
                                        j10 = 0;
                                        break;
                                    }
                                    int i30 = i18 << (7 - i29);
                                    if ((this.zzn.zzN()[i28] & i30) != 0) {
                                        i26 += i29;
                                        zzv(zzackVar, i26);
                                        j10 = (~i30) & this.zzn.zzN()[i28] & 255;
                                        int i31 = i28 + 1;
                                        while (i31 < i26) {
                                            j10 = (j10 << i20) | (this.zzn.zzN()[i31] & 255);
                                            i31++;
                                            i20 = 8;
                                        }
                                        if (i24 > 0) {
                                            j10 -= (1 << ((i29 * 7) + 6)) - 1;
                                        }
                                    } else {
                                        i29++;
                                        i18 = 1;
                                        i20 = 8;
                                    }
                                }
                                if (j10 < -2147483648L || j10 > 2147483647L) {
                                    break;
                                }
                                int[] iArr = this.zzT;
                                int i32 = (int) j10;
                                if (i24 != 0) {
                                    i32 += iArr[i24 - 1];
                                }
                                iArr[i24] = i32;
                                i25 += i32;
                                i24++;
                                i18 = 1;
                                i19 = 0;
                                i20 = 8;
                            } else {
                                this.zzT[i27] = ((i11 - this.zzV) - i26) - i25;
                                break;
                            }
                        }
                        throw zzaz.zza("EBML lacing sample size out of range.", null);
                    }
                    throw zzaz.zza("Unexpected lacing value: 2", null);
                } else {
                    int i33 = 0;
                    int i34 = 0;
                    int i35 = 4;
                    while (true) {
                        i13 = this.zzS - 1;
                        if (i33 >= i13) {
                            break;
                        }
                        this.zzT[i33] = 0;
                        do {
                            i35++;
                            zzv(zzackVar, i35);
                            i14 = this.zzn.zzN()[i35 - 1] & 255;
                            int[] iArr2 = this.zzT;
                            i15 = iArr2[i33] + i14;
                            iArr2[i33] = i15;
                        } while (i14 == 255);
                        i34 += i15;
                        i33++;
                    }
                    this.zzT[i13] = ((i11 - this.zzV) - i35) - i34;
                }
            }
            this.zzP = this.zzJ + zzr((this.zzn.zzN()[0] << 8) | (this.zzn.zzN()[1] & 255));
            if (zzagkVar3.zze != 2) {
                if (i17 == 163) {
                    if ((this.zzn.zzN()[2] & 128) == 128) {
                        i17 = 163;
                    } else {
                        i17 = 163;
                    }
                }
                i16 = 0;
                this.zzW = i16;
                this.zzO = 2;
                this.zzR = 0;
                i12 = 163;
            }
            i16 = 1;
            this.zzW = i16;
            this.zzO = 2;
            this.zzR = 0;
            i12 = 163;
        } else {
            i12 = 163;
        }
        if (i17 == i12) {
            while (true) {
                int i36 = this.zzR;
                if (i36 >= this.zzS) {
                    this.zzO = 0;
                    return;
                }
                zzu(zzagkVar3, ((this.zzR * zzagkVar3.zzf) / 1000) + this.zzP, this.zzW, zzp(zzackVar, zzagkVar3, this.zzT[i36], false), 0);
                this.zzR++;
            }
        } else {
            while (true) {
                int i37 = this.zzR;
                if (i37 >= this.zzS) {
                    return;
                }
                int[] iArr3 = this.zzT;
                iArr3[i37] = zzp(zzackVar, zzagkVar3, iArr3[i37], true);
                this.zzR++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final boolean zzi(zzack zzackVar) throws IOException {
        return new zzagn().zza(zzackVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01db, code lost:
        if (r1.equals("V_MPEGH/ISO/HEVC") != false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(int r19) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagm.zzj(int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzk(int i10, double d10) throws zzaz {
        if (i10 == 181) {
            zzt(i10);
            this.zzC.zzR = (int) d10;
        } else if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    zzt(i10);
                    this.zzC.zzE = (float) d10;
                    return;
                case 21970:
                    zzt(i10);
                    this.zzC.zzF = (float) d10;
                    return;
                case 21971:
                    zzt(i10);
                    this.zzC.zzG = (float) d10;
                    return;
                case 21972:
                    zzt(i10);
                    this.zzC.zzH = (float) d10;
                    return;
                case 21973:
                    zzt(i10);
                    this.zzC.zzI = (float) d10;
                    return;
                case 21974:
                    zzt(i10);
                    this.zzC.zzJ = (float) d10;
                    return;
                case 21975:
                    zzt(i10);
                    this.zzC.zzK = (float) d10;
                    return;
                case 21976:
                    zzt(i10);
                    this.zzC.zzL = (float) d10;
                    return;
                case 21977:
                    zzt(i10);
                    this.zzC.zzM = (float) d10;
                    return;
                case 21978:
                    zzt(i10);
                    this.zzC.zzN = (float) d10;
                    return;
                default:
                    switch (i10) {
                        case 30323:
                            zzt(i10);
                            this.zzC.zzt = (float) d10;
                            return;
                        case 30324:
                            zzt(i10);
                            this.zzC.zzu = (float) d10;
                            return;
                        case 30325:
                            zzt(i10);
                            this.zzC.zzv = (float) d10;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.zzz = (long) d10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzl(int i10, long j10) throws zzaz {
        boolean z10;
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw zzaz.zza("ContentEncodingOrder " + j10 + " not supported", null);
        } else if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw zzaz.zza("ContentEncodingScope " + j10 + " not supported", null);
        } else {
            switch (i10) {
                case 131:
                    zzt(i10);
                    this.zzC.zze = (int) j10;
                    return;
                case 136:
                    z10 = j10 == 1;
                    zzt(i10);
                    this.zzC.zzW = z10;
                    return;
                case 155:
                    this.zzQ = zzr(j10);
                    return;
                case 159:
                    zzt(i10);
                    this.zzC.zzP = (int) j10;
                    return;
                case 176:
                    zzt(i10);
                    this.zzC.zzm = (int) j10;
                    return;
                case 179:
                    zzs(i10);
                    this.zzK.zzc(zzr(j10));
                    return;
                case 186:
                    zzt(i10);
                    this.zzC.zzn = (int) j10;
                    return;
                case 215:
                    zzt(i10);
                    this.zzC.zzd = (int) j10;
                    return;
                case 231:
                    this.zzJ = zzr(j10);
                    return;
                case 238:
                    this.zzX = (int) j10;
                    return;
                case 241:
                    if (this.zzM) {
                        return;
                    }
                    zzs(i10);
                    this.zzL.zzc(j10);
                    this.zzM = true;
                    return;
                case 251:
                    this.zzY = true;
                    return;
                case 16871:
                    zzt(i10);
                    zzagk.zzb(this.zzC, (int) j10);
                    return;
                case 16980:
                    if (j10 == 3) {
                        return;
                    }
                    throw zzaz.zza("ContentCompAlgo " + j10 + " not supported", null);
                case 17029:
                    if (j10 < 1 || j10 > 2) {
                        throw zzaz.zza("DocTypeReadVersion " + j10 + " not supported", null);
                    }
                    return;
                case 17143:
                    if (j10 == 1) {
                        return;
                    }
                    throw zzaz.zza("EBMLReadVersion " + j10 + " not supported", null);
                case 18401:
                    if (j10 == 5) {
                        return;
                    }
                    throw zzaz.zza("ContentEncAlgo " + j10 + " not supported", null);
                case 18408:
                    if (j10 == 1) {
                        return;
                    }
                    throw zzaz.zza("AESSettingsCipherMode " + j10 + " not supported", null);
                case 21420:
                    this.zzF = j10 + this.zzx;
                    return;
                case 21432:
                    int i11 = (int) j10;
                    zzt(i10);
                    if (i11 == 0) {
                        this.zzC.zzx = 0;
                        return;
                    } else if (i11 == 1) {
                        this.zzC.zzx = 2;
                        return;
                    } else if (i11 == 3) {
                        this.zzC.zzx = 1;
                        return;
                    } else if (i11 != 15) {
                        return;
                    } else {
                        this.zzC.zzx = 3;
                        return;
                    }
                case 21680:
                    zzt(i10);
                    this.zzC.zzp = (int) j10;
                    return;
                case 21682:
                    zzt(i10);
                    this.zzC.zzr = (int) j10;
                    return;
                case 21690:
                    zzt(i10);
                    this.zzC.zzq = (int) j10;
                    return;
                case 21930:
                    z10 = j10 == 1;
                    zzt(i10);
                    this.zzC.zzV = z10;
                    return;
                case 21938:
                    zzt(i10);
                    zzagk zzagkVar = this.zzC;
                    zzagkVar.zzy = true;
                    zzagkVar.zzo = (int) j10;
                    return;
                case 21998:
                    zzt(i10);
                    this.zzC.zzg = (int) j10;
                    return;
                case 22186:
                    zzt(i10);
                    this.zzC.zzS = j10;
                    return;
                case 22203:
                    zzt(i10);
                    this.zzC.zzT = j10;
                    return;
                case 25188:
                    zzt(i10);
                    this.zzC.zzQ = (int) j10;
                    return;
                case 30114:
                    this.zzZ = j10;
                    return;
                case 30321:
                    int i12 = (int) j10;
                    zzt(i10);
                    if (i12 == 0) {
                        this.zzC.zzs = 0;
                        return;
                    } else if (i12 == 1) {
                        this.zzC.zzs = 1;
                        return;
                    } else if (i12 == 2) {
                        this.zzC.zzs = 2;
                        return;
                    } else if (i12 != 3) {
                        return;
                    } else {
                        this.zzC.zzs = 3;
                        return;
                    }
                case 2352003:
                    zzt(i10);
                    this.zzC.zzf = (int) j10;
                    return;
                case 2807729:
                    this.zzy = j10;
                    return;
                default:
                    switch (i10) {
                        case 21945:
                            int i13 = (int) j10;
                            zzt(i10);
                            if (i13 == 1) {
                                this.zzC.zzB = 2;
                                return;
                            } else if (i13 != 2) {
                                return;
                            } else {
                                this.zzC.zzB = 1;
                                return;
                            }
                        case 21946:
                            zzt(i10);
                            int zzb2 = zzk.zzb((int) j10);
                            if (zzb2 != -1) {
                                this.zzC.zzA = zzb2;
                                return;
                            }
                            return;
                        case 21947:
                            zzt(i10);
                            this.zzC.zzy = true;
                            int zza2 = zzk.zza((int) j10);
                            if (zza2 != -1) {
                                this.zzC.zzz = zza2;
                                return;
                            }
                            return;
                        case 21948:
                            zzt(i10);
                            this.zzC.zzC = (int) j10;
                            return;
                        case 21949:
                            zzt(i10);
                            this.zzC.zzD = (int) j10;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzm(int i10, long j10, long j11) throws zzaz {
        zzcv.zzb(this.zzaj);
        if (i10 == 160) {
            this.zzY = false;
            this.zzZ = 0L;
        } else if (i10 == 174) {
            zzagk zzagkVar = new zzagk();
            this.zzC = zzagkVar;
            zzagkVar.zza = this.zzB;
        } else if (i10 == 187) {
            this.zzM = false;
        } else if (i10 == 19899) {
            this.zzE = -1;
            this.zzF = -1L;
        } else if (i10 == 20533) {
            zzt(i10);
            this.zzC.zzh = true;
        } else if (i10 == 21968) {
            zzt(i10);
            this.zzC.zzy = true;
        } else if (i10 == 408125543) {
            long j12 = this.zzx;
            if (j12 != -1 && j12 != j10) {
                throw zzaz.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j10;
            this.zzw = j11;
        } else if (i10 != 475249515) {
            if (i10 == 524531317 && !this.zzD) {
                if (this.zzi && this.zzH != -1) {
                    this.zzG = true;
                    return;
                }
                this.zzaj.zzP(new zzadh(this.zzA, 0L));
                this.zzD = true;
            }
        } else {
            this.zzK = new zzdo(32);
            this.zzL = new zzdo(32);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzn(int i10, String str) throws zzaz {
        if (i10 == 134) {
            zzt(i10);
            this.zzC.zzc = str;
        } else if (i10 != 17026) {
            if (i10 == 21358) {
                zzt(i10);
                this.zzC.zzb = str;
            } else if (i10 != 2274716) {
            } else {
                zzt(i10);
                zzagk.zzc(this.zzC, str);
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw zzaz.zza("DocType " + str + " not supported", null);
        } else {
            this.zzB = Objects.equals(str, "webm");
        }
    }

    zzagm(zzagh zzaghVar, int i10, zzaje zzajeVar) {
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzH = -1L;
        this.zzI = -1L;
        this.zzJ = -9223372036854775807L;
        this.zzak = zzaghVar;
        zzaghVar.zza(new zzagj(this, null));
        this.zzk = zzajeVar;
        this.zzi = 1 == ((i10 & 1) ^ 1);
        this.zzj = (i10 & 2) == 0;
        this.zzg = new zzago();
        this.zzh = new SparseArray();
        this.zzn = new zzdx(4);
        this.zzo = new zzdx(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzdx(4);
        this.zzl = new zzdx(zzfd.zza);
        this.zzm = new zzdx(4);
        this.zzq = new zzdx();
        this.zzr = new zzdx();
        this.zzs = new zzdx(8);
        this.zzt = new zzdx();
        this.zzu = new zzdx();
        this.zzT = new int[1];
    }

    public zzagm(zzaje zzajeVar, int i10) {
        this(new zzagh(), 0, zzajeVar);
    }
}
