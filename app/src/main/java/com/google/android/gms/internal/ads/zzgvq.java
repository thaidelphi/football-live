package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgvq implements zzgzp {
    private final zzgvp zza;

    private zzgvq(zzgvp zzgvpVar) {
        zzgwx.zzc(zzgvpVar, "output");
        this.zza = zzgvpVar;
        zzgvpVar.zze = this;
    }

    public static zzgvq zza(zzgvp zzgvpVar) {
        zzgvq zzgvqVar = zzgvpVar.zze;
        return zzgvqVar != null ? zzgvqVar : new zzgvq(zzgvpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzA(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgxk)) {
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    i12 += 8;
                }
                this.zza.zzu(i12);
                while (i11 < list.size()) {
                    this.zza.zzk(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzgxk zzgxkVar = (zzgxk) list;
        if (!z10) {
            while (i11 < zzgxkVar.size()) {
                this.zza.zzj(i10, zzgxkVar.zza(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgxkVar.size(); i15++) {
            zzgxkVar.zza(i15);
            i14 += 8;
        }
        this.zza.zzu(i14);
        while (i11 < zzgxkVar.size()) {
            this.zza.zzk(zzgxkVar.zza(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzB(int i10, int i11) throws IOException {
        this.zza.zzt(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzC(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgwl)) {
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = ((Integer) list.get(i13)).intValue();
                    i12 += zzgvp.zzD((intValue >> 31) ^ (intValue + intValue));
                }
                this.zza.zzu(i12);
                while (i11 < list.size()) {
                    zzgvp zzgvpVar = this.zza;
                    int intValue2 = ((Integer) list.get(i11)).intValue();
                    zzgvpVar.zzu((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                zzgvp zzgvpVar2 = this.zza;
                int intValue3 = ((Integer) list.get(i11)).intValue();
                zzgvpVar2.zzt(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i11++;
            }
            return;
        }
        zzgwl zzgwlVar = (zzgwl) list;
        if (!z10) {
            while (i11 < zzgwlVar.size()) {
                zzgvp zzgvpVar3 = this.zza;
                int zzd = zzgwlVar.zzd(i11);
                zzgvpVar3.zzt(i10, (zzd >> 31) ^ (zzd + zzd));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgwlVar.size(); i15++) {
            int zzd2 = zzgwlVar.zzd(i15);
            i14 += zzgvp.zzD((zzd2 >> 31) ^ (zzd2 + zzd2));
        }
        this.zza.zzu(i14);
        while (i11 < zzgwlVar.size()) {
            zzgvp zzgvpVar4 = this.zza;
            int zzd3 = zzgwlVar.zzd(i11);
            zzgvpVar4.zzu((zzd3 >> 31) ^ (zzd3 + zzd3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzD(int i10, long j10) throws IOException {
        this.zza.zzv(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzE(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgxk)) {
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = ((Long) list.get(i13)).longValue();
                    i12 += zzgvp.zzE((longValue >> 63) ^ (longValue + longValue));
                }
                this.zza.zzu(i12);
                while (i11 < list.size()) {
                    zzgvp zzgvpVar = this.zza;
                    long longValue2 = ((Long) list.get(i11)).longValue();
                    zzgvpVar.zzw((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                zzgvp zzgvpVar2 = this.zza;
                long longValue3 = ((Long) list.get(i11)).longValue();
                zzgvpVar2.zzv(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i11++;
            }
            return;
        }
        zzgxk zzgxkVar = (zzgxk) list;
        if (!z10) {
            while (i11 < zzgxkVar.size()) {
                zzgvp zzgvpVar3 = this.zza;
                long zza = zzgxkVar.zza(i11);
                zzgvpVar3.zzv(i10, (zza >> 63) ^ (zza + zza));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgxkVar.size(); i15++) {
            long zza2 = zzgxkVar.zza(i15);
            i14 += zzgvp.zzE((zza2 >> 63) ^ (zza2 + zza2));
        }
        this.zza.zzu(i14);
        while (i11 < zzgxkVar.size()) {
            zzgvp zzgvpVar4 = this.zza;
            long zza3 = zzgxkVar.zza(i11);
            zzgvpVar4.zzw((zza3 >> 63) ^ (zza3 + zza3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    @Deprecated
    public final void zzF(int i10) throws IOException {
        this.zza.zzs(i10, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzG(int i10, String str) throws IOException {
        this.zza.zzq(i10, str);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzH(int i10, List list) throws IOException {
        int i11 = 0;
        if (list instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) list;
            while (i11 < list.size()) {
                Object zzc = zzgxhVar.zzc();
                if (zzc instanceof String) {
                    this.zza.zzq(i10, (String) zzc);
                } else {
                    this.zza.zzN(i10, (zzgvc) zzc);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzq(i10, (String) list.get(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzI(int i10, int i11) throws IOException {
        this.zza.zzt(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzJ(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgwl)) {
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += zzgvp.zzD(((Integer) list.get(i13)).intValue());
                }
                this.zza.zzu(i12);
                while (i11 < list.size()) {
                    this.zza.zzu(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zzt(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgwl zzgwlVar = (zzgwl) list;
        if (!z10) {
            while (i11 < zzgwlVar.size()) {
                this.zza.zzt(i10, zzgwlVar.zzd(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgwlVar.size(); i15++) {
            i14 += zzgvp.zzD(zzgwlVar.zzd(i15));
        }
        this.zza.zzu(i14);
        while (i11 < zzgwlVar.size()) {
            this.zza.zzu(zzgwlVar.zzd(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzK(int i10, long j10) throws IOException {
        this.zza.zzv(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzL(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgxk)) {
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += zzgvp.zzE(((Long) list.get(i13)).longValue());
                }
                this.zza.zzu(i12);
                while (i11 < list.size()) {
                    this.zza.zzw(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zzv(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzgxk zzgxkVar = (zzgxk) list;
        if (!z10) {
            while (i11 < zzgxkVar.size()) {
                this.zza.zzv(i10, zzgxkVar.zza(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgxkVar.size(); i15++) {
            i14 += zzgvp.zzE(zzgxkVar.zza(i15));
        }
        this.zza.zzu(i14);
        while (i11 < zzgxkVar.size()) {
            this.zza.zzw(zzgxkVar.zza(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzb(int i10, boolean z10) throws IOException {
        this.zza.zzM(i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzc(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgus)) {
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Boolean) list.get(i13)).booleanValue();
                    i12++;
                }
                this.zza.zzu(i12);
                while (i11 < list.size()) {
                    this.zza.zzL(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zzM(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        zzgus zzgusVar = (zzgus) list;
        if (!z10) {
            while (i11 < zzgusVar.size()) {
                this.zza.zzM(i10, zzgusVar.zzh(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgusVar.size(); i15++) {
            zzgusVar.zzh(i15);
            i14++;
        }
        this.zza.zzu(i14);
        while (i11 < zzgusVar.size()) {
            this.zza.zzL(zzgusVar.zzh(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzd(int i10, zzgvc zzgvcVar) throws IOException {
        this.zza.zzN(i10, zzgvcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zze(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzN(i10, (zzgvc) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzj(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzg(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgvr)) {
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Double) list.get(i13)).doubleValue();
                    i12 += 8;
                }
                this.zza.zzu(i12);
                while (i11 < list.size()) {
                    this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zzj(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zzgvr zzgvrVar = (zzgvr) list;
        if (!z10) {
            while (i11 < zzgvrVar.size()) {
                this.zza.zzj(i10, Double.doubleToRawLongBits(zzgvrVar.zzd(i11)));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgvrVar.size(); i15++) {
            zzgvrVar.zzd(i15);
            i14 += 8;
        }
        this.zza.zzu(i14);
        while (i11 < zzgvrVar.size()) {
            this.zza.zzk(Double.doubleToRawLongBits(zzgvrVar.zzd(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    @Deprecated
    public final void zzh(int i10) throws IOException {
        this.zza.zzs(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzj(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgwl)) {
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += zzgvp.zzE(((Integer) list.get(i13)).intValue());
                }
                this.zza.zzu(i12);
                while (i11 < list.size()) {
                    this.zza.zzm(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgwl zzgwlVar = (zzgwl) list;
        if (!z10) {
            while (i11 < zzgwlVar.size()) {
                this.zza.zzl(i10, zzgwlVar.zzd(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgwlVar.size(); i15++) {
            i14 += zzgvp.zzE(zzgwlVar.zzd(i15));
        }
        this.zza.zzu(i14);
        while (i11 < zzgwlVar.size()) {
            this.zza.zzm(zzgwlVar.zzd(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzl(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgwl)) {
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    i12 += 4;
                }
                this.zza.zzu(i12);
                while (i11 < list.size()) {
                    this.zza.zzi(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgwl zzgwlVar = (zzgwl) list;
        if (!z10) {
            while (i11 < zzgwlVar.size()) {
                this.zza.zzh(i10, zzgwlVar.zzd(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgwlVar.size(); i15++) {
            zzgwlVar.zzd(i15);
            i14 += 4;
        }
        this.zza.zzu(i14);
        while (i11 < zzgwlVar.size()) {
            this.zza.zzi(zzgwlVar.zzd(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzm(int i10, long j10) throws IOException {
        this.zza.zzj(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzn(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgxk)) {
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    i12 += 8;
                }
                this.zza.zzu(i12);
                while (i11 < list.size()) {
                    this.zza.zzk(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zzj(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzgxk zzgxkVar = (zzgxk) list;
        if (!z10) {
            while (i11 < zzgxkVar.size()) {
                this.zza.zzj(i10, zzgxkVar.zza(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgxkVar.size(); i15++) {
            zzgxkVar.zza(i15);
            i14 += 8;
        }
        this.zza.zzu(i14);
        while (i11 < zzgxkVar.size()) {
            this.zza.zzk(zzgxkVar.zza(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzo(int i10, float f10) throws IOException {
        this.zza.zzh(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzp(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgwb)) {
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Float) list.get(i13)).floatValue();
                    i12 += 4;
                }
                this.zza.zzu(i12);
                while (i11 < list.size()) {
                    this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zzh(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzgwb zzgwbVar = (zzgwb) list;
        if (!z10) {
            while (i11 < zzgwbVar.size()) {
                this.zza.zzh(i10, Float.floatToRawIntBits(zzgwbVar.zzd(i11)));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgwbVar.size(); i15++) {
            zzgwbVar.zzd(i15);
            i14 += 4;
        }
        this.zza.zzu(i14);
        while (i11 < zzgwbVar.size()) {
            this.zza.zzi(Float.floatToRawIntBits(zzgwbVar.zzd(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzq(int i10, Object obj, zzgyo zzgyoVar) throws IOException {
        zzgvp zzgvpVar = this.zza;
        zzgvpVar.zzs(i10, 3);
        zzgyoVar.zzj((zzgxv) obj, zzgvpVar.zze);
        zzgvpVar.zzs(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzr(int i10, int i11) throws IOException {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzs(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgwl)) {
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += zzgvp.zzE(((Integer) list.get(i13)).intValue());
                }
                this.zza.zzu(i12);
                while (i11 < list.size()) {
                    this.zza.zzm(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zzl(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgwl zzgwlVar = (zzgwl) list;
        if (!z10) {
            while (i11 < zzgwlVar.size()) {
                this.zza.zzl(i10, zzgwlVar.zzd(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgwlVar.size(); i15++) {
            i14 += zzgvp.zzE(zzgwlVar.zzd(i15));
        }
        this.zza.zzu(i14);
        while (i11 < zzgwlVar.size()) {
            this.zza.zzm(zzgwlVar.zzd(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzt(int i10, long j10) throws IOException {
        this.zza.zzv(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzu(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgxk)) {
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += zzgvp.zzE(((Long) list.get(i13)).longValue());
                }
                this.zza.zzu(i12);
                while (i11 < list.size()) {
                    this.zza.zzw(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zzv(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzgxk zzgxkVar = (zzgxk) list;
        if (!z10) {
            while (i11 < zzgxkVar.size()) {
                this.zza.zzv(i10, zzgxkVar.zza(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgxkVar.size(); i15++) {
            i14 += zzgvp.zzE(zzgxkVar.zza(i15));
        }
        this.zza.zzu(i14);
        while (i11 < zzgxkVar.size()) {
            this.zza.zzw(zzgxkVar.zza(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzv(int i10, Object obj, zzgyo zzgyoVar) throws IOException {
        this.zza.zzn(i10, (zzgxv) obj, zzgyoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzw(int i10, Object obj) throws IOException {
        if (obj instanceof zzgvc) {
            this.zza.zzp(i10, (zzgvc) obj);
        } else {
            this.zza.zzo(i10, (zzgxv) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzx(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzy(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzgwl)) {
            if (z10) {
                this.zza.zzs(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    i12 += 4;
                }
                this.zza.zzu(i12);
                while (i11 < list.size()) {
                    this.zza.zzi(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zzh(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzgwl zzgwlVar = (zzgwl) list;
        if (!z10) {
            while (i11 < zzgwlVar.size()) {
                this.zza.zzh(i10, zzgwlVar.zzd(i11));
                i11++;
            }
            return;
        }
        this.zza.zzs(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzgwlVar.size(); i15++) {
            zzgwlVar.zzd(i15);
            i14 += 4;
        }
        this.zza.zzu(i14);
        while (i11 < zzgwlVar.size()) {
            this.zza.zzi(zzgwlVar.zzd(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzz(int i10, long j10) throws IOException {
        this.zza.zzj(i10, j10);
    }
}
