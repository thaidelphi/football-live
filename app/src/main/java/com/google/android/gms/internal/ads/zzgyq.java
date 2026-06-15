package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgyq {
    public static final /* synthetic */ int zza = 0;
    private static final zzgza zzb;

    static {
        int i10 = zzgyf.zza;
        zzb = new zzgzc();
    }

    public static void zzA(int i10, List list, zzgzp zzgzpVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzpVar.zzu(i10, list, z10);
    }

    public static void zzB(int i10, List list, zzgzp zzgzpVar, zzgyo zzgyoVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzgvq) zzgzpVar).zzv(i10, list.get(i11), zzgyoVar);
        }
    }

    public static void zzC(int i10, List list, zzgzp zzgzpVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzpVar.zzy(i10, list, z10);
    }

    public static void zzD(int i10, List list, zzgzp zzgzpVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzpVar.zzA(i10, list, z10);
    }

    public static void zzE(int i10, List list, zzgzp zzgzpVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzpVar.zzC(i10, list, z10);
    }

    public static void zzF(int i10, List list, zzgzp zzgzpVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzpVar.zzE(i10, list, z10);
    }

    public static void zzG(int i10, List list, zzgzp zzgzpVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzpVar.zzH(i10, list);
    }

    public static void zzH(int i10, List list, zzgzp zzgzpVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzpVar.zzJ(i10, list, z10);
    }

    public static void zzI(int i10, List list, zzgzp zzgzpVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzpVar.zzL(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzJ(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgwl) {
            zzgwl zzgwlVar = (zzgwl) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgvp.zzE(zzgwlVar.zzd(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgvp.zzE(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgvp.zzD(i10 << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgvp.zzD(i10 << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgwl) {
            zzgwl zzgwlVar = (zzgwl) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgvp.zzE(zzgwlVar.zzd(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgvp.zzE(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxk) {
            zzgxk zzgxkVar = (zzgxk) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgvp.zzE(zzgxkVar.zza(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgvp.zzE(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i10, Object obj, zzgyo zzgyoVar) {
        int i11 = i10 << 3;
        if (obj instanceof zzgxg) {
            int zzD = zzgvp.zzD(i11);
            int zza2 = ((zzgxg) obj).zza();
            return zzD + zzgvp.zzD(zza2) + zza2;
        }
        return zzgvp.zzD(i11) + zzgvp.zzA((zzgxv) obj, zzgyoVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgwl) {
            zzgwl zzgwlVar = (zzgwl) list;
            i10 = 0;
            while (i11 < size) {
                int zzd = zzgwlVar.zzd(i11);
                i10 += zzgvp.zzD((zzd >> 31) ^ (zzd + zzd));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += zzgvp.zzD((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxk) {
            zzgxk zzgxkVar = (zzgxk) list;
            i10 = 0;
            while (i11 < size) {
                long zza2 = zzgxkVar.zza(i11);
                i10 += zzgvp.zzE((zza2 >> 63) ^ (zza2 + zza2));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += zzgvp.zzE((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgwl) {
            zzgwl zzgwlVar = (zzgwl) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgvp.zzD(zzgwlVar.zzd(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgvp.zzD(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxk) {
            zzgxk zzgxkVar = (zzgxk) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgvp.zzE(zzgxkVar.zza(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgvp.zzE(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzgza zzm() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzn(Object obj, int i10, List list, zzgwq zzgwqVar, Object obj2, zzgza zzgzaVar) {
        if (zzgwqVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (zzgwqVar.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj2 = zzo(obj, i10, intValue, obj2, zzgzaVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgwqVar.zza(intValue2)) {
                    obj2 = zzo(obj, i10, intValue2, obj2, zzgzaVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzo(Object obj, int i10, int i11, Object obj2, zzgza zzgzaVar) {
        if (obj2 == null) {
            obj2 = zzgzaVar.zza(obj);
        }
        zzgzaVar.zzh(obj2, i10, i11);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzp(zzgvv zzgvvVar, Object obj, Object obj2) {
        if (((zzgwg) obj2).zza.zza.isEmpty()) {
            return;
        }
        zzgwg zzgwgVar = (zzgwg) obj;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzq(zzgza zzgzaVar, Object obj, Object obj2) {
        zzgwk zzgwkVar = (zzgwk) obj;
        zzgzb zzgzbVar = zzgwkVar.zzt;
        zzgzb zzgzbVar2 = ((zzgwk) obj2).zzt;
        if (!zzgzb.zzc().equals(zzgzbVar2)) {
            if (zzgzb.zzc().equals(zzgzbVar)) {
                zzgzbVar = zzgzb.zze(zzgzbVar, zzgzbVar2);
            } else {
                zzgzbVar.zzd(zzgzbVar2);
            }
        }
        zzgwkVar.zzt = zzgzbVar;
    }

    public static void zzr(int i10, List list, zzgzp zzgzpVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzpVar.zzc(i10, list, z10);
    }

    public static void zzs(int i10, List list, zzgzp zzgzpVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzpVar.zze(i10, list);
    }

    public static void zzt(int i10, List list, zzgzp zzgzpVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzpVar.zzg(i10, list, z10);
    }

    public static void zzu(int i10, List list, zzgzp zzgzpVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzpVar.zzj(i10, list, z10);
    }

    public static void zzv(int i10, List list, zzgzp zzgzpVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzpVar.zzl(i10, list, z10);
    }

    public static void zzw(int i10, List list, zzgzp zzgzpVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzpVar.zzn(i10, list, z10);
    }

    public static void zzx(int i10, List list, zzgzp zzgzpVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzpVar.zzp(i10, list, z10);
    }

    public static void zzy(int i10, List list, zzgzp zzgzpVar, zzgyo zzgyoVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzgvq) zzgzpVar).zzq(i10, list.get(i11), zzgyoVar);
        }
    }

    public static void zzz(int i10, List list, zzgzp zzgzpVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgzpVar.zzs(i10, list, z10);
    }
}
