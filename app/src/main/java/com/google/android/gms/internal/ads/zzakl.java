package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzakl implements zzajg {
    private final zzdx zza = new zzdx();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzakl(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = "sans-serif";
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzeh.zzC(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.zzg = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.zzb = z10;
        if (z10) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            int i16 = i10 & 1;
            int i17 = i10 & 2;
            boolean z10 = true;
            if (i16 == 0) {
                if (i17 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
                }
                z10 = false;
            } else if (i17 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            } else if (i16 != 0 || z10) {
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zza(byte[] bArr, int i10, int i11, zzajf zzajfVar, zzda zzdaVar) {
        String zzB;
        int i12;
        int i13;
        this.zza.zzJ(bArr, i10 + i11);
        this.zza.zzL(i10);
        zzdx zzdxVar = this.zza;
        int i14 = 2;
        int i15 = 1;
        int i16 = 0;
        zzcv.zzd(zzdxVar.zzb() >= 2);
        int zzq = zzdxVar.zzq();
        if (zzq == 0) {
            zzB = "";
        } else {
            int zzd = zzdxVar.zzd();
            Charset zzC = zzdxVar.zzC();
            int zzd2 = zzdxVar.zzd() - zzd;
            if (zzC == null) {
                zzC = StandardCharsets.UTF_8;
            }
            zzB = zzdxVar.zzB(zzq - zzd2, zzC);
        }
        if (zzB.isEmpty()) {
            zzdaVar.zza(new zzaiy(zzfvv.zzn(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zzB);
        zzc(spannableStringBuilder, this.zzc, 0, 0, spannableStringBuilder.length(), 16711680);
        zzb(spannableStringBuilder, this.zzd, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f10 = this.zzf;
        while (true) {
            zzdx zzdxVar2 = this.zza;
            if (zzdxVar2.zzb() >= 8) {
                int zzd3 = zzdxVar2.zzd();
                int zzg = zzdxVar2.zzg();
                int zzg2 = this.zza.zzg();
                if (zzg2 == 1937013100) {
                    zzcv.zzd(this.zza.zzb() >= i14 ? i15 : i16);
                    int zzq2 = this.zza.zzq();
                    int i17 = i16;
                    while (i17 < zzq2) {
                        zzdx zzdxVar3 = this.zza;
                        zzcv.zzd(zzdxVar3.zzb() >= 12 ? i15 : i16);
                        int zzq3 = zzdxVar3.zzq();
                        int zzq4 = zzdxVar3.zzq();
                        zzdxVar3.zzM(i14);
                        int zzm = zzdxVar3.zzm();
                        zzdxVar3.zzM(i15);
                        int zzg3 = zzdxVar3.zzg();
                        if (zzq4 > spannableStringBuilder.length()) {
                            int length2 = spannableStringBuilder.length();
                            StringBuilder sb = new StringBuilder();
                            i12 = zzq2;
                            sb.append("Truncating styl end (");
                            sb.append(zzq4);
                            sb.append(") to cueText.length() (");
                            sb.append(length2);
                            sb.append(").");
                            zzdn.zzf("Tx3gParser", sb.toString());
                            i13 = spannableStringBuilder.length();
                        } else {
                            i12 = zzq2;
                            i13 = zzq4;
                        }
                        if (zzq3 >= i13) {
                            zzdn.zzf("Tx3gParser", "Ignoring styl with start (" + zzq3 + ") >= end (" + i13 + ").");
                        } else {
                            int i18 = i13;
                            zzc(spannableStringBuilder, zzm, this.zzc, zzq3, i18, 0);
                            zzb(spannableStringBuilder, zzg3, this.zzd, zzq3, i18, 0);
                        }
                        i17++;
                        zzq2 = i12;
                        i14 = 2;
                        i15 = 1;
                        i16 = 0;
                    }
                } else if (zzg2 == 1952608120 && this.zzb) {
                    i14 = 2;
                    zzcv.zzd(this.zza.zzb() >= 2);
                    int i19 = this.zzg;
                    int i20 = zzeh.zza;
                    f10 = Math.max(0.0f, Math.min(this.zza.zzq() / i19, 0.95f));
                } else {
                    i14 = 2;
                }
                this.zza.zzL(zzd3 + zzg);
                i15 = 1;
                i16 = 0;
            } else {
                zzcl zzclVar = new zzcl();
                zzclVar.zzl(spannableStringBuilder);
                zzclVar.zze(f10, 0);
                zzclVar.zzf(0);
                zzdaVar.zza(new zzaiy(zzfvv.zzo(zzclVar.zzp()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }
}
