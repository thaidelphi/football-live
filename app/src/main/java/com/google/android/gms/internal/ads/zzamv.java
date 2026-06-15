package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzamv implements zzamn {
    final /* synthetic */ zzamw zza;
    private final zzdw zzb = new zzdw(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzamv(zzamw zzamwVar, int i10) {
        this.zza = zzamwVar;
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzamn
    public final void zza(zzdx zzdxVar) {
        List list;
        SparseArray sparseArray;
        int i10;
        zzacm zzacmVar;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        zzee zzeeVar;
        zzacm zzacmVar2;
        SparseArray sparseArray2;
        SparseBooleanArray sparseBooleanArray3;
        zzamz zzamzVar;
        zzee zzeeVar2;
        int i11;
        if (zzdxVar.zzm() != 2) {
            return;
        }
        list = this.zza.zzb;
        int i12 = 0;
        zzee zzeeVar3 = (zzee) list.get(0);
        if ((zzdxVar.zzm() & 128) != 0) {
            zzdxVar.zzM(1);
            int zzq = zzdxVar.zzq();
            int i13 = 3;
            zzdxVar.zzM(3);
            zzdxVar.zzG(this.zzb, 2);
            this.zzb.zzn(3);
            int i14 = 13;
            this.zza.zzr = this.zzb.zzd(13);
            zzdxVar.zzG(this.zzb, 2);
            this.zzb.zzn(4);
            int i15 = 12;
            zzdxVar.zzM(this.zzb.zzd(12));
            this.zzc.clear();
            this.zzd.clear();
            int zzb = zzdxVar.zzb();
            while (zzb > 0) {
                int i16 = 5;
                zzdxVar.zzG(this.zzb, 5);
                zzdw zzdwVar = this.zzb;
                int zzd = zzdwVar.zzd(8);
                zzdwVar.zzn(i13);
                int zzd2 = this.zzb.zzd(i14);
                this.zzb.zzn(4);
                int zzd3 = this.zzb.zzd(i15);
                int zzd4 = zzdxVar.zzd();
                int i17 = zzd4 + zzd3;
                int i18 = i12;
                int i19 = -1;
                String str = null;
                ArrayList arrayList = null;
                while (zzdxVar.zzd() < i17) {
                    int zzm = zzdxVar.zzm();
                    int zzd5 = zzdxVar.zzd() + zzdxVar.zzm();
                    if (zzd5 > i17) {
                        break;
                    }
                    if (zzm == i16) {
                        long zzu = zzdxVar.zzu();
                        if (zzu != 1094921523) {
                            if (zzu != 1161904947) {
                                if (zzu != 1094921524) {
                                    if (zzu == 1212503619) {
                                        i11 = 36;
                                        zzeeVar2 = zzeeVar3;
                                        i19 = i11;
                                    }
                                    zzeeVar2 = zzeeVar3;
                                }
                                zzeeVar2 = zzeeVar3;
                                i19 = 172;
                            }
                            zzeeVar2 = zzeeVar3;
                            i19 = 135;
                        }
                        zzeeVar2 = zzeeVar3;
                        i19 = 129;
                    } else {
                        if (zzm != 106) {
                            if (zzm != 122) {
                                if (zzm == 127) {
                                    int zzm2 = zzdxVar.zzm();
                                    if (zzm2 != 21) {
                                        if (zzm2 == 14) {
                                            i11 = 136;
                                        } else {
                                            if (zzm2 == 33) {
                                                i11 = 139;
                                            }
                                            zzeeVar2 = zzeeVar3;
                                        }
                                    }
                                    zzeeVar2 = zzeeVar3;
                                    i19 = 172;
                                } else if (zzm == 123) {
                                    i11 = 138;
                                } else if (zzm == 10) {
                                    String trim = zzdxVar.zzB(i13, StandardCharsets.UTF_8).trim();
                                    i18 = zzdxVar.zzm();
                                    zzeeVar2 = zzeeVar3;
                                    str = trim;
                                } else if (zzm == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (zzdxVar.zzd() < zzd5) {
                                        String trim2 = zzdxVar.zzB(i13, StandardCharsets.UTF_8).trim();
                                        int zzm3 = zzdxVar.zzm();
                                        byte[] bArr = new byte[4];
                                        zzdxVar.zzH(bArr, 0, 4);
                                        arrayList2.add(new zzamx(trim2, zzm3, bArr));
                                        zzeeVar3 = zzeeVar3;
                                        i13 = 3;
                                    }
                                    zzeeVar2 = zzeeVar3;
                                    arrayList = arrayList2;
                                    i19 = 89;
                                } else {
                                    zzeeVar2 = zzeeVar3;
                                    if (zzm == 111) {
                                        i19 = 257;
                                    }
                                }
                                zzeeVar2 = zzeeVar3;
                                i19 = i11;
                            }
                            zzeeVar2 = zzeeVar3;
                            i19 = 135;
                        }
                        zzeeVar2 = zzeeVar3;
                        i19 = 129;
                    }
                    zzdxVar.zzM(zzd5 - zzdxVar.zzd());
                    zzeeVar3 = zzeeVar2;
                    i13 = 3;
                    i16 = 5;
                }
                zzee zzeeVar4 = zzeeVar3;
                zzdxVar.zzL(i17);
                zzamy zzamyVar = new zzamy(i19, str, i18, arrayList, Arrays.copyOfRange(zzdxVar.zzN(), zzd4, i17));
                if (zzd == 6 || zzd == 5) {
                    zzd = zzamyVar.zza;
                }
                zzb -= zzd3 + 5;
                sparseBooleanArray3 = this.zza.zzh;
                if (!sparseBooleanArray3.get(zzd2)) {
                    zzamzVar = this.zza.zze;
                    zzanb zzb2 = zzamzVar.zzb(zzd, zzamyVar);
                    this.zzd.put(zzd2, zzd2);
                    this.zzc.put(zzd2, zzb2);
                }
                zzeeVar3 = zzeeVar4;
                i12 = 0;
                i13 = 3;
                i15 = 12;
                i14 = 13;
            }
            zzee zzeeVar5 = zzeeVar3;
            int size = this.zzd.size();
            int i20 = 0;
            while (i20 < size) {
                SparseIntArray sparseIntArray = this.zzd;
                zzamw zzamwVar = this.zza;
                int keyAt = sparseIntArray.keyAt(i20);
                int valueAt = sparseIntArray.valueAt(i20);
                sparseBooleanArray = zzamwVar.zzh;
                sparseBooleanArray.put(keyAt, true);
                sparseBooleanArray2 = this.zza.zzi;
                sparseBooleanArray2.put(valueAt, true);
                zzanb zzanbVar = (zzanb) this.zzc.valueAt(i20);
                if (zzanbVar != null) {
                    zzacmVar2 = this.zza.zzl;
                    zzana zzanaVar = new zzana(zzq, keyAt, 8192);
                    zzeeVar = zzeeVar5;
                    zzanbVar.zzb(zzeeVar, zzacmVar2, zzanaVar);
                    sparseArray2 = this.zza.zzg;
                    sparseArray2.put(valueAt, zzanbVar);
                } else {
                    zzeeVar = zzeeVar5;
                }
                i20++;
                zzeeVar5 = zzeeVar;
            }
            zzamw zzamwVar2 = this.zza;
            int i21 = this.zze;
            sparseArray = zzamwVar2.zzg;
            sparseArray.remove(i21);
            this.zza.zzm = 0;
            zzamw zzamwVar3 = this.zza;
            i10 = zzamwVar3.zzm;
            if (i10 == 0) {
                zzacmVar = zzamwVar3.zzl;
                zzacmVar.zzG();
                this.zza.zzn = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamn
    public final void zzb(zzee zzeeVar, zzacm zzacmVar, zzana zzanaVar) {
    }
}
