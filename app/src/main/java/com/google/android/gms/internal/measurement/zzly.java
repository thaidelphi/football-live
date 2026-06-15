package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzly {
    private static final Class zza;
    private static final zzmn zzb;
    private static final zzmn zzc;
    private static final zzmn zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzmp();
    }

    public static zzmn zzA() {
        return zzc;
    }

    public static zzmn zzB() {
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzC(int i10, List list, zzki zzkiVar, Object obj, zzmn zzmnVar) {
        if (zzkiVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (zzkiVar.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj = zzD(i10, intValue, obj, zzmnVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzkiVar.zza(intValue2)) {
                    obj = zzD(i10, intValue2, obj, zzmnVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    static Object zzD(int i10, int i11, Object obj, zzmn zzmnVar) {
        if (obj == null) {
            obj = zzmnVar.zze();
        }
        zzmnVar.zzf(obj, i10, i11);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzE(zzjr zzjrVar, Object obj, Object obj2) {
        zzjrVar.zza(obj2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzF(zzmn zzmnVar, Object obj, Object obj2) {
        zzmnVar.zzh(obj, zzmnVar.zzd(zzmnVar.zzc(obj), zzmnVar.zzc(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzke.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzH(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzc(i10, list, z10);
    }

    public static void zzI(int i10, List list, zznf zznfVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zze(i10, list);
    }

    public static void zzJ(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzg(i10, list, z10);
    }

    public static void zzK(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzj(i10, list, z10);
    }

    public static void zzL(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzl(i10, list, z10);
    }

    public static void zzM(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzn(i10, list, z10);
    }

    public static void zzN(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzp(i10, list, z10);
    }

    public static void zzO(int i10, List list, zznf zznfVar, zzlw zzlwVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzjm) zznfVar).zzq(i10, list.get(i11), zzlwVar);
        }
    }

    public static void zzP(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzs(i10, list, z10);
    }

    public static void zzQ(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzu(i10, list, z10);
    }

    public static void zzR(int i10, List list, zznf zznfVar, zzlw zzlwVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzjm) zznfVar).zzv(i10, list.get(i11), zzlwVar);
        }
    }

    public static void zzS(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzx(i10, list, z10);
    }

    public static void zzT(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzz(i10, list, z10);
    }

    public static void zzU(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzB(i10, list, z10);
    }

    public static void zzV(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzD(i10, list, z10);
    }

    public static void zzW(int i10, List list, zznf zznfVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzG(i10, list);
    }

    public static void zzX(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzI(i10, list, z10);
    }

    public static void zzY(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzK(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzZ(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjl.zzA(i10 << 3) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzaa(zzlg zzlgVar, Object obj, Object obj2, long j10) {
        zzmx.zzs(obj, j10, zzlg.zzb(zzmx.zzf(obj, j10), zzmx.zzf(obj2, j10)));
    }

    private static zzmn zzab(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzmn) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = size * zzjl.zzz(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzz += zzjl.zzt((zzjd) list.get(i11));
        }
        return zzz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzjl.zzz(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkf) {
            zzkf zzkfVar = (zzkf) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjl.zzv(zzkfVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjl.zzv(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjl.zzA(i10 << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjl.zzA(i10 << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i10, List list, zzlw zzlwVar) {
        int size = list.size();
        if (size != 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += zzjl.zzu(i10, (zzll) list.get(i12), zzlwVar);
            }
            return i11;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzjl.zzz(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkf) {
            zzkf zzkfVar = (zzkf) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjl.zzv(zzkfVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjl.zzv(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzjl.zzz(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzla) {
            zzla zzlaVar = (zzla) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjl.zzB(zzlaVar.zza(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjl.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i10, Object obj, zzlw zzlwVar) {
        if (obj instanceof zzkr) {
            int zzA = zzjl.zzA(i10 << 3);
            int zza2 = ((zzkr) obj).zza();
            return zzA + zzjl.zzA(zza2) + zza2;
        }
        return zzjl.zzA(i10 << 3) + zzjl.zzx((zzll) obj, zzlwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i10, List list, zzlw zzlwVar) {
        int zzx;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzjl.zzz(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzkr) {
                zzx = zzjl.zzw((zzkr) obj);
            } else {
                zzx = zzjl.zzx((zzll) obj, zzlwVar);
            }
            zzz += zzx;
        }
        return zzz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzjl.zzz(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkf) {
            zzkf zzkfVar = (zzkf) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zzkfVar.zze(i11);
                i10 += zzjl.zzA((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += zzjl.zzA((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzs(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzjl.zzz(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzla) {
            zzla zzlaVar = (zzla) list;
            i10 = 0;
            while (i11 < size) {
                long zza2 = zzlaVar.zza(i11);
                i10 += zzjl.zzB((zza2 >> 63) ^ (zza2 + zza2));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += zzjl.zzB((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(int i10, List list) {
        int zzy;
        int zzy2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int zzz = zzjl.zzz(i10) * size;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            while (i11 < size) {
                Object zzf = zzktVar.zzf(i11);
                if (zzf instanceof zzjd) {
                    zzy2 = zzjl.zzt((zzjd) zzf);
                } else {
                    zzy2 = zzjl.zzy((String) zzf);
                }
                zzz += zzy2;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzjd) {
                    zzy = zzjl.zzt((zzjd) obj);
                } else {
                    zzy = zzjl.zzy((String) obj);
                }
                zzz += zzy;
                i11++;
            }
        }
        return zzz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzjl.zzz(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkf) {
            zzkf zzkfVar = (zzkf) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjl.zzA(zzkfVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjl.zzA(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzjl.zzz(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzy(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzla) {
            zzla zzlaVar = (zzla) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjl.zzB(zzlaVar.zza(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjl.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzmn zzz() {
        return zzb;
    }
}
