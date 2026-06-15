package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgxy<T> implements zzgyo<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgzh.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgxv zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzgza zzm;
    private final zzgvv zzn;

    private zzgxy(int[] iArr, Object[] objArr, int i10, int i11, zzgxv zzgxvVar, boolean z10, int[] iArr2, int i12, int i13, zzgyb zzgybVar, zzgxi zzgxiVar, zzgza zzgzaVar, zzgvv zzgvvVar, zzgxq zzgxqVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzgxvVar instanceof zzgwk;
        boolean z11 = false;
        if (zzgvvVar != null && (zzgxvVar instanceof zzgwg)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zzgzaVar;
        this.zzn = zzgvvVar;
        this.zzg = zzgxvVar;
    }

    private final Object zzA(Object obj, int i10) {
        zzgyo zzx = zzx(i10);
        int zzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i10, int i11) {
        zzgyo zzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i10) {
        if (zzN(obj2, i10)) {
            Unsafe unsafe = zzb;
            long zzu = zzu(i10) & 1048575;
            Object object = unsafe.getObject(obj2, zzu);
            if (object != null) {
                zzgyo zzx = zzx(i10);
                if (!zzN(obj, i10)) {
                    if (!zzQ(object)) {
                        unsafe.putObject(obj, zzu, object);
                    } else {
                        Object zze = zzx.zze();
                        zzx.zzg(zze, object);
                        unsafe.putObject(obj, zzu, zze);
                    }
                    zzH(obj, i10);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzu);
                if (!zzQ(object2)) {
                    Object zze2 = zzx.zze();
                    zzx.zzg(zze2, object2);
                    unsafe.putObject(obj, zzu, zze2);
                    object2 = zze2;
                }
                zzx.zzg(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
        }
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzR(obj2, i11, i10)) {
            Unsafe unsafe = zzb;
            long zzu = zzu(i10) & 1048575;
            Object object = unsafe.getObject(obj2, zzu);
            if (object != null) {
                zzgyo zzx = zzx(i10);
                if (!zzR(obj, i11, i10)) {
                    if (!zzQ(object)) {
                        unsafe.putObject(obj, zzu, object);
                    } else {
                        Object zze = zzx.zze();
                        zzx.zzg(zze, object);
                        unsafe.putObject(obj, zzu, zze);
                    }
                    zzI(obj, i11, i10);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzu);
                if (!zzQ(object2)) {
                    Object zze2 = zzx.zze();
                    zzx.zzg(zze2, object2);
                    unsafe.putObject(obj, zzu, zze2);
                    object2 = zze2;
                }
                zzx.zzg(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
        }
    }

    private final void zzG(Object obj, int i10, zzgyi zzgyiVar) throws IOException {
        long j10 = i10 & 1048575;
        if (zzM(i10)) {
            zzgzh.zzv(obj, j10, zzgyiVar.zzs());
        } else if (this.zzi) {
            zzgzh.zzv(obj, j10, zzgyiVar.zzr());
        } else {
            zzgzh.zzv(obj, j10, zzgyiVar.zzp());
        }
    }

    private final void zzH(Object obj, int i10) {
        int zzr = zzr(i10);
        long j10 = 1048575 & zzr;
        if (j10 == 1048575) {
            return;
        }
        zzgzh.zzt(obj, j10, (1 << (zzr >>> 20)) | zzgzh.zzd(obj, j10));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzgzh.zzt(obj, zzr(i11) & 1048575, i10);
    }

    private final void zzJ(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzH(obj, i10);
    }

    private final void zzK(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzI(obj, i10, i11);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzN(obj, i10) == zzN(obj2, i10);
    }

    private static boolean zzM(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i10) {
        int zzr = zzr(i10);
        long j10 = zzr & 1048575;
        if (j10 != 1048575) {
            return (zzgzh.zzd(obj, j10) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i10);
        long j11 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzgzh.zzb(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgzh.zzc(obj, j11)) != 0;
            case 2:
                return zzgzh.zzf(obj, j11) != 0;
            case 3:
                return zzgzh.zzf(obj, j11) != 0;
            case 4:
                return zzgzh.zzd(obj, j11) != 0;
            case 5:
                return zzgzh.zzf(obj, j11) != 0;
            case 6:
                return zzgzh.zzd(obj, j11) != 0;
            case 7:
                return zzgzh.zzz(obj, j11);
            case 8:
                Object zzh = zzgzh.zzh(obj, j11);
                if (zzh instanceof String) {
                    return !((String) zzh).isEmpty();
                } else if (zzh instanceof zzgvc) {
                    return !zzgvc.zzb.equals(zzh);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzgzh.zzh(obj, j11) != null;
            case 10:
                return !zzgvc.zzb.equals(zzgzh.zzh(obj, j11));
            case 11:
                return zzgzh.zzd(obj, j11) != 0;
            case 12:
                return zzgzh.zzd(obj, j11) != 0;
            case 13:
                return zzgzh.zzd(obj, j11) != 0;
            case 14:
                return zzgzh.zzf(obj, j11) != 0;
            case 15:
                return zzgzh.zzd(obj, j11) != 0;
            case 16:
                return zzgzh.zzf(obj, j11) != 0;
            case 17:
                return zzgzh.zzh(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzN(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzP(Object obj, int i10, zzgyo zzgyoVar) {
        return zzgyoVar.zzl(zzgzh.zzh(obj, i10 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgwk) {
            return ((zzgwk) obj).zzcd();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzgzh.zzd(obj, (long) (zzr(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzgzh.zzh(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zzgzp zzgzpVar) throws IOException {
        if (obj instanceof String) {
            zzgzpVar.zzG(i10, (String) obj);
        } else {
            zzgzpVar.zzd(i10, (zzgvc) obj);
        }
    }

    static zzgzb zzd(Object obj) {
        zzgwk zzgwkVar = (zzgwk) obj;
        zzgzb zzgzbVar = zzgwkVar.zzt;
        if (zzgzbVar == zzgzb.zzc()) {
            zzgzb zzf = zzgzb.zzf();
            zzgwkVar.zzt = zzf;
            return zzf;
        }
        return zzgzbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzgxy zzm(java.lang.Class r34, com.google.android.gms.internal.ads.zzgxs r35, com.google.android.gms.internal.ads.zzgyb r36, com.google.android.gms.internal.ads.zzgxi r37, com.google.android.gms.internal.ads.zzgza r38, com.google.android.gms.internal.ads.zzgvv r39, com.google.android.gms.internal.ads.zzgxq r40) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgxy.zzm(java.lang.Class, com.google.android.gms.internal.ads.zzgxs, com.google.android.gms.internal.ads.zzgyb, com.google.android.gms.internal.ads.zzgxi, com.google.android.gms.internal.ads.zzgza, com.google.android.gms.internal.ads.zzgvv, com.google.android.gms.internal.ads.zzgxq):com.google.android.gms.internal.ads.zzgxy");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzgzh.zzh(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzgzh.zzh(obj, j10)).floatValue();
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzgzh.zzh(obj, j10)).intValue();
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzs(i10, 0);
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzs(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzv(Object obj, long j10) {
        return ((Long) zzgzh.zzh(obj, j10)).longValue();
    }

    private final zzgwq zzw(int i10) {
        int i11 = i10 / 3;
        return (zzgwq) this.zzd[i11 + i11 + 1];
    }

    private final zzgyo zzx(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgyo zzgyoVar = (zzgyo) objArr[i12];
        if (zzgyoVar != null) {
            return zzgyoVar;
        }
        zzgyo zzb2 = zzgyf.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zzgza zzgzaVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object zzh = zzgzh.zzh(obj, zzu(i10) & 1048575);
        if (zzh == null || zzw(i10) == null) {
            return obj2;
        }
        zzgxp zzgxpVar = (zzgxp) zzh;
        zzgxo zzgxoVar = (zzgxo) zzz(i10);
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgyo
    public final int zza(Object obj) {
        int i10;
        int i11;
        int i12;
        int zzD;
        int zzD2;
        int zzD3;
        int zzE;
        int zzD4;
        int zzD5;
        int zzd;
        int zzD6;
        int zzg;
        int size;
        int zzD7;
        int zzD8;
        int zzD9;
        int i13;
        int zze;
        int zzD10;
        int zzD11;
        int i14;
        Unsafe unsafe = zzb;
        int i15 = 1048575;
        boolean z10 = false;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i18 < this.zzc.length) {
            int zzu = zzu(i18);
            int zzt = zzt(zzu);
            int[] iArr = this.zzc;
            int i20 = iArr[i18];
            int i21 = iArr[i18 + 2];
            int i22 = i21 & i15;
            if (zzt <= 17) {
                if (i22 != i16) {
                    i17 = i22 == i15 ? z10 : unsafe.getInt(obj, i22);
                    i16 = i22;
                }
                i10 = i16;
                i11 = i17;
                i12 = 1 << (i21 >>> 20);
            } else {
                i10 = i16;
                i11 = i17;
                i12 = z10;
            }
            int i23 = zzu & i15;
            if (zzt >= zzgwa.zzJ.zza()) {
                zzgwa.zzW.zza();
            }
            long j10 = i23;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i18, i10, i11, i12)) {
                        zzD = zzgvp.zzD(i20 << 3);
                        i13 = zzD + 8;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i18, i10, i11, i12)) {
                        zzD2 = zzgvp.zzD(i20 << 3);
                        i13 = zzD2 + 4;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i18, i10, i11, i12)) {
                        long j11 = unsafe.getLong(obj, j10);
                        zzD3 = zzgvp.zzD(i20 << 3);
                        zzE = zzgvp.zzE(j11);
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i18, i10, i11, i12)) {
                        long j12 = unsafe.getLong(obj, j10);
                        zzD3 = zzgvp.zzD(i20 << 3);
                        zzE = zzgvp.zzE(j12);
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i18, i10, i11, i12)) {
                        zzD3 = zzgvp.zzD(i20 << 3);
                        zzE = zzgvp.zzE(unsafe.getInt(obj, j10));
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i18, i10, i11, i12)) {
                        zzD = zzgvp.zzD(i20 << 3);
                        i13 = zzD + 8;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i18, i10, i11, i12)) {
                        zzD2 = zzgvp.zzD(i20 << 3);
                        i13 = zzD2 + 4;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i18, i10, i11, i12)) {
                        zzD4 = zzgvp.zzD(i20 << 3);
                        i13 = zzD4 + 1;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzO(obj, i18, i10, i11, i12)) {
                        break;
                    } else {
                        int i24 = i20 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzgvc) {
                            zzD5 = zzgvp.zzD(i24);
                            zzd = ((zzgvc) object).zzd();
                            zzD6 = zzgvp.zzD(zzd);
                            i13 = zzD5 + zzD6 + zzd;
                            i19 += i13;
                            break;
                        } else {
                            zzD3 = zzgvp.zzD(i24);
                            zzE = zzgvp.zzC((String) object);
                            i13 = zzD3 + zzE;
                            i19 += i13;
                        }
                    }
                case 9:
                    if (zzO(obj, i18, i10, i11, i12)) {
                        i13 = zzgyq.zzh(i20, unsafe.getObject(obj, j10), zzx(i18));
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i18, i10, i11, i12)) {
                        zzD5 = zzgvp.zzD(i20 << 3);
                        zzd = ((zzgvc) unsafe.getObject(obj, j10)).zzd();
                        zzD6 = zzgvp.zzD(zzd);
                        i13 = zzD5 + zzD6 + zzd;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i18, i10, i11, i12)) {
                        int i25 = unsafe.getInt(obj, j10);
                        zzD3 = zzgvp.zzD(i20 << 3);
                        zzE = zzgvp.zzD(i25);
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i18, i10, i11, i12)) {
                        zzD3 = zzgvp.zzD(i20 << 3);
                        zzE = zzgvp.zzE(unsafe.getInt(obj, j10));
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i18, i10, i11, i12)) {
                        zzD2 = zzgvp.zzD(i20 << 3);
                        i13 = zzD2 + 4;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i18, i10, i11, i12)) {
                        zzD = zzgvp.zzD(i20 << 3);
                        i13 = zzD + 8;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i18, i10, i11, i12)) {
                        int i26 = unsafe.getInt(obj, j10);
                        zzD3 = zzgvp.zzD(i20 << 3);
                        zzE = zzgvp.zzD((i26 >> 31) ^ (i26 + i26));
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i18, i10, i11, i12)) {
                        long j13 = unsafe.getLong(obj, j10);
                        zzD3 = zzgvp.zzD(i20 << 3);
                        zzE = zzgvp.zzE((j13 >> 63) ^ (j13 + j13));
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i18, i10, i11, i12)) {
                        i13 = zzgvp.zzy(i20, (zzgxv) unsafe.getObject(obj, j10), zzx(i18));
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i13 = zzgyq.zzd(i20, (List) unsafe.getObject(obj, j10), z10);
                    i19 += i13;
                    break;
                case 19:
                    i13 = zzgyq.zzb(i20, (List) unsafe.getObject(obj, j10), z10);
                    i19 += i13;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i27 = zzgyq.zza;
                    if (list.size() != 0) {
                        zzg = zzgyq.zzg(list) + (list.size() * zzgvp.zzD(i20 << 3));
                        i19 += zzg;
                        break;
                    }
                    zzg = z10;
                    i19 += zzg;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i28 = zzgyq.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzD3 = zzgyq.zzl(list2);
                        zzD7 = zzgvp.zzD(i20 << 3);
                        zzE = size * zzD7;
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    }
                    i13 = z10;
                    i19 += i13;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i29 = zzgyq.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzD3 = zzgyq.zzf(list3);
                        zzD7 = zzgvp.zzD(i20 << 3);
                        zzE = size * zzD7;
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    }
                    i13 = z10;
                    i19 += i13;
                case 23:
                    i13 = zzgyq.zzd(i20, (List) unsafe.getObject(obj, j10), z10);
                    i19 += i13;
                    break;
                case 24:
                    i13 = zzgyq.zzb(i20, (List) unsafe.getObject(obj, j10), z10);
                    i19 += i13;
                    break;
                case 25:
                    int i30 = zzgyq.zza;
                    int size2 = ((List) unsafe.getObject(obj, j10)).size();
                    if (size2 != 0) {
                        i13 = size2 * (zzgvp.zzD(i20 << 3) + 1);
                        i19 += i13;
                        break;
                    }
                    i13 = z10;
                    i19 += i13;
                case 26:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i31 = zzgyq.zza;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        zzg = zzgvp.zzD(i20 << 3) * size3;
                        if (list4 instanceof zzgxh) {
                            zzgxh zzgxhVar = (zzgxh) list4;
                            for (int i32 = z10; i32 < size3; i32++) {
                                Object zzc = zzgxhVar.zzc();
                                if (zzc instanceof zzgvc) {
                                    int zzd2 = ((zzgvc) zzc).zzd();
                                    zzg += zzgvp.zzD(zzd2) + zzd2;
                                } else {
                                    zzg += zzgvp.zzC((String) zzc);
                                }
                            }
                        } else {
                            for (int i33 = z10; i33 < size3; i33++) {
                                Object obj2 = list4.get(i33);
                                if (obj2 instanceof zzgvc) {
                                    int zzd3 = ((zzgvc) obj2).zzd();
                                    zzg += zzgvp.zzD(zzd3) + zzd3;
                                } else {
                                    zzg += zzgvp.zzC((String) obj2);
                                }
                            }
                        }
                        i19 += zzg;
                        break;
                    }
                    zzg = z10;
                    i19 += zzg;
                case 27:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    zzgyo zzx = zzx(i18);
                    int i34 = zzgyq.zza;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        zzD8 = z10;
                    } else {
                        zzD8 = zzgvp.zzD(i20 << 3) * size4;
                        for (int i35 = z10; i35 < size4; i35++) {
                            Object obj3 = list5.get(i35);
                            if (obj3 instanceof zzgxg) {
                                int zza2 = ((zzgxg) obj3).zza();
                                zzD8 += zzgvp.zzD(zza2) + zza2;
                            } else {
                                zzD8 += zzgvp.zzA((zzgxv) obj3, zzx);
                            }
                        }
                    }
                    i19 += zzD8;
                    break;
                case 28:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    int i36 = zzgyq.zza;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        zzD9 = z10;
                    } else {
                        zzD9 = size5 * zzgvp.zzD(i20 << 3);
                        for (int i37 = z10; i37 < list6.size(); i37++) {
                            int zzd4 = ((zzgvc) list6.get(i37)).zzd();
                            zzD9 += zzgvp.zzD(zzd4) + zzd4;
                        }
                    }
                    i19 += zzD9;
                    break;
                case 29:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i38 = zzgyq.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzD3 = zzgyq.zzk(list7);
                        zzD7 = zzgvp.zzD(i20 << 3);
                        zzE = size * zzD7;
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    }
                    i13 = z10;
                    i19 += i13;
                case 30:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i39 = zzgyq.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzD3 = zzgyq.zza(list8);
                        zzD7 = zzgvp.zzD(i20 << 3);
                        zzE = size * zzD7;
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    }
                    i13 = z10;
                    i19 += i13;
                case 31:
                    i13 = zzgyq.zzb(i20, (List) unsafe.getObject(obj, j10), z10);
                    i19 += i13;
                    break;
                case 32:
                    i13 = zzgyq.zzd(i20, (List) unsafe.getObject(obj, j10), z10);
                    i19 += i13;
                    break;
                case 33:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i40 = zzgyq.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzD3 = zzgyq.zzi(list9);
                        zzD7 = zzgvp.zzD(i20 << 3);
                        zzE = size * zzD7;
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    }
                    i13 = z10;
                    i19 += i13;
                case 34:
                    List list10 = (List) unsafe.getObject(obj, j10);
                    int i41 = zzgyq.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzD3 = zzgyq.zzj(list10);
                        zzD7 = zzgvp.zzD(i20 << 3);
                        zzE = size * zzD7;
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    }
                    i13 = z10;
                    i19 += i13;
                case 35:
                    zze = zzgyq.zze((List) unsafe.getObject(obj, j10));
                    if (zze > 0) {
                        zzD10 = zzgvp.zzD(i20 << 3);
                        zzD11 = zzgvp.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i19 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zze = zzgyq.zzc((List) unsafe.getObject(obj, j10));
                    if (zze > 0) {
                        zzD10 = zzgvp.zzD(i20 << 3);
                        zzD11 = zzgvp.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i19 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zze = zzgyq.zzg((List) unsafe.getObject(obj, j10));
                    if (zze > 0) {
                        zzD10 = zzgvp.zzD(i20 << 3);
                        zzD11 = zzgvp.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i19 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zze = zzgyq.zzl((List) unsafe.getObject(obj, j10));
                    if (zze > 0) {
                        zzD10 = zzgvp.zzD(i20 << 3);
                        zzD11 = zzgvp.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i19 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zze = zzgyq.zzf((List) unsafe.getObject(obj, j10));
                    if (zze > 0) {
                        zzD10 = zzgvp.zzD(i20 << 3);
                        zzD11 = zzgvp.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i19 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zze = zzgyq.zze((List) unsafe.getObject(obj, j10));
                    if (zze > 0) {
                        zzD10 = zzgvp.zzD(i20 << 3);
                        zzD11 = zzgvp.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i19 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zze = zzgyq.zzc((List) unsafe.getObject(obj, j10));
                    if (zze > 0) {
                        zzD10 = zzgvp.zzD(i20 << 3);
                        zzD11 = zzgvp.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i19 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int i42 = zzgyq.zza;
                    zze = ((List) unsafe.getObject(obj, j10)).size();
                    if (zze > 0) {
                        zzD10 = zzgvp.zzD(i20 << 3);
                        zzD11 = zzgvp.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i19 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zze = zzgyq.zzk((List) unsafe.getObject(obj, j10));
                    if (zze > 0) {
                        zzD10 = zzgvp.zzD(i20 << 3);
                        zzD11 = zzgvp.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i19 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zze = zzgyq.zza((List) unsafe.getObject(obj, j10));
                    if (zze > 0) {
                        zzD10 = zzgvp.zzD(i20 << 3);
                        zzD11 = zzgvp.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i19 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zze = zzgyq.zzc((List) unsafe.getObject(obj, j10));
                    if (zze > 0) {
                        zzD10 = zzgvp.zzD(i20 << 3);
                        zzD11 = zzgvp.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i19 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zze = zzgyq.zze((List) unsafe.getObject(obj, j10));
                    if (zze > 0) {
                        zzD10 = zzgvp.zzD(i20 << 3);
                        zzD11 = zzgvp.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i19 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zze = zzgyq.zzi((List) unsafe.getObject(obj, j10));
                    if (zze > 0) {
                        zzD10 = zzgvp.zzD(i20 << 3);
                        zzD11 = zzgvp.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i19 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zze = zzgyq.zzj((List) unsafe.getObject(obj, j10));
                    if (zze > 0) {
                        zzD10 = zzgvp.zzD(i20 << 3);
                        zzD11 = zzgvp.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i19 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list11 = (List) unsafe.getObject(obj, j10);
                    zzgyo zzx2 = zzx(i18);
                    int i43 = zzgyq.zza;
                    int size6 = list11.size();
                    if (size6 == 0) {
                        i14 = z10;
                    } else {
                        int i44 = z10;
                        i14 = i44;
                        for (int i45 = i44; i45 < size6; i45++) {
                            i14 += zzgvp.zzy(i20, (zzgxv) list11.get(i45), zzx2);
                        }
                    }
                    i19 += i14;
                    break;
                case 50:
                    zzgxp zzgxpVar = (zzgxp) unsafe.getObject(obj, j10);
                    zzgxo zzgxoVar = (zzgxo) zzz(i18);
                    if (zzgxpVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzgxpVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                        break;
                    }
                case 51:
                    if (zzR(obj, i20, i18)) {
                        zzD = zzgvp.zzD(i20 << 3);
                        i13 = zzD + 8;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i20, i18)) {
                        zzD2 = zzgvp.zzD(i20 << 3);
                        i13 = zzD2 + 4;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i20, i18)) {
                        long zzv = zzv(obj, j10);
                        zzD3 = zzgvp.zzD(i20 << 3);
                        zzE = zzgvp.zzE(zzv);
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i20, i18)) {
                        long zzv2 = zzv(obj, j10);
                        zzD3 = zzgvp.zzD(i20 << 3);
                        zzE = zzgvp.zzE(zzv2);
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i20, i18)) {
                        zzD3 = zzgvp.zzD(i20 << 3);
                        zzE = zzgvp.zzE(zzp(obj, j10));
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i20, i18)) {
                        zzD = zzgvp.zzD(i20 << 3);
                        i13 = zzD + 8;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i20, i18)) {
                        zzD2 = zzgvp.zzD(i20 << 3);
                        i13 = zzD2 + 4;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i20, i18)) {
                        zzD4 = zzgvp.zzD(i20 << 3);
                        i13 = zzD4 + 1;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzR(obj, i20, i18)) {
                        break;
                    } else {
                        int i46 = i20 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzgvc) {
                            zzD5 = zzgvp.zzD(i46);
                            zzd = ((zzgvc) object2).zzd();
                            zzD6 = zzgvp.zzD(zzd);
                            i13 = zzD5 + zzD6 + zzd;
                            i19 += i13;
                            break;
                        } else {
                            zzD3 = zzgvp.zzD(i46);
                            zzE = zzgvp.zzC((String) object2);
                            i13 = zzD3 + zzE;
                            i19 += i13;
                        }
                    }
                case 60:
                    if (zzR(obj, i20, i18)) {
                        i13 = zzgyq.zzh(i20, unsafe.getObject(obj, j10), zzx(i18));
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i20, i18)) {
                        zzD5 = zzgvp.zzD(i20 << 3);
                        zzd = ((zzgvc) unsafe.getObject(obj, j10)).zzd();
                        zzD6 = zzgvp.zzD(zzd);
                        i13 = zzD5 + zzD6 + zzd;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i20, i18)) {
                        int zzp = zzp(obj, j10);
                        zzD3 = zzgvp.zzD(i20 << 3);
                        zzE = zzgvp.zzD(zzp);
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i20, i18)) {
                        zzD3 = zzgvp.zzD(i20 << 3);
                        zzE = zzgvp.zzE(zzp(obj, j10));
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i20, i18)) {
                        zzD2 = zzgvp.zzD(i20 << 3);
                        i13 = zzD2 + 4;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i20, i18)) {
                        zzD = zzgvp.zzD(i20 << 3);
                        i13 = zzD + 8;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i20, i18)) {
                        int zzp2 = zzp(obj, j10);
                        zzD3 = zzgvp.zzD(i20 << 3);
                        zzE = zzgvp.zzD((zzp2 >> 31) ^ (zzp2 + zzp2));
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i20, i18)) {
                        long zzv3 = zzv(obj, j10);
                        zzD3 = zzgvp.zzD(i20 << 3);
                        zzE = zzgvp.zzE((zzv3 >> 63) ^ (zzv3 + zzv3));
                        i13 = zzD3 + zzE;
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i20, i18)) {
                        i13 = zzgvp.zzy(i20, (zzgxv) unsafe.getObject(obj, j10), zzx(i18));
                        i19 += i13;
                        break;
                    } else {
                        break;
                    }
            }
            i18 += 3;
            i16 = i10;
            i17 = i11;
            i15 = 1048575;
            z10 = false;
        }
        int zza3 = i19 + ((zzgwk) obj).zzt.zza();
        if (this.zzh) {
            zzgvz zzgvzVar = ((zzgwg) obj).zza;
            int zzc2 = zzgvzVar.zza.zzc();
            int i47 = 0;
            for (int i48 = 0; i48 < zzc2; i48++) {
                Map.Entry zzg2 = zzgvzVar.zza.zzg(i48);
                i47 += zzgvz.zzc((zzgvy) ((zzgys) zzg2).zza(), zzg2.getValue());
            }
            for (Map.Entry entry2 : zzgvzVar.zza.zzd()) {
                i47 += zzgvz.zzc((zzgvy) entry2.getKey(), entry2.getValue());
            }
            return zza3 + i47;
        }
        return zza3;
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final int zzb(Object obj) {
        int i10;
        long doubleToLongBits;
        int floatToIntBits;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int zzu = zzu(i13);
            int[] iArr = this.zzc;
            int i14 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i15 = iArr[i13];
            long j10 = i14;
            int i16 = 37;
            switch (zzt) {
                case 0:
                    i10 = i12 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzgzh.zzb(obj, j10));
                    byte[] bArr = zzgwx.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 1:
                    i10 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(zzgzh.zzc(obj, j10));
                    i12 = i10 + floatToIntBits;
                    break;
                case 2:
                    i10 = i12 * 53;
                    doubleToLongBits = zzgzh.zzf(obj, j10);
                    byte[] bArr2 = zzgwx.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 3:
                    i10 = i12 * 53;
                    doubleToLongBits = zzgzh.zzf(obj, j10);
                    byte[] bArr3 = zzgwx.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 4:
                    i10 = i12 * 53;
                    floatToIntBits = zzgzh.zzd(obj, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 5:
                    i10 = i12 * 53;
                    doubleToLongBits = zzgzh.zzf(obj, j10);
                    byte[] bArr4 = zzgwx.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 6:
                    i10 = i12 * 53;
                    floatToIntBits = zzgzh.zzd(obj, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 7:
                    i10 = i12 * 53;
                    floatToIntBits = zzgwx.zza(zzgzh.zzz(obj, j10));
                    i12 = i10 + floatToIntBits;
                    break;
                case 8:
                    i10 = i12 * 53;
                    floatToIntBits = ((String) zzgzh.zzh(obj, j10)).hashCode();
                    i12 = i10 + floatToIntBits;
                    break;
                case 9:
                    i11 = i12 * 53;
                    Object zzh = zzgzh.zzh(obj, j10);
                    if (zzh != null) {
                        i16 = zzh.hashCode();
                    }
                    i12 = i11 + i16;
                    break;
                case 10:
                    i10 = i12 * 53;
                    floatToIntBits = zzgzh.zzh(obj, j10).hashCode();
                    i12 = i10 + floatToIntBits;
                    break;
                case 11:
                    i10 = i12 * 53;
                    floatToIntBits = zzgzh.zzd(obj, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 12:
                    i10 = i12 * 53;
                    floatToIntBits = zzgzh.zzd(obj, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 13:
                    i10 = i12 * 53;
                    floatToIntBits = zzgzh.zzd(obj, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 14:
                    i10 = i12 * 53;
                    doubleToLongBits = zzgzh.zzf(obj, j10);
                    byte[] bArr5 = zzgwx.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 15:
                    i10 = i12 * 53;
                    floatToIntBits = zzgzh.zzd(obj, j10);
                    i12 = i10 + floatToIntBits;
                    break;
                case 16:
                    i10 = i12 * 53;
                    doubleToLongBits = zzgzh.zzf(obj, j10);
                    byte[] bArr6 = zzgwx.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i10 + floatToIntBits;
                    break;
                case 17:
                    i11 = i12 * 53;
                    Object zzh2 = zzgzh.zzh(obj, j10);
                    if (zzh2 != null) {
                        i16 = zzh2.hashCode();
                    }
                    i12 = i11 + i16;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i12 * 53;
                    floatToIntBits = zzgzh.zzh(obj, j10).hashCode();
                    i12 = i10 + floatToIntBits;
                    break;
                case 50:
                    i10 = i12 * 53;
                    floatToIntBits = zzgzh.zzh(obj, j10).hashCode();
                    i12 = i10 + floatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j10));
                        byte[] bArr7 = zzgwx.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j10));
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr8 = zzgwx.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr9 = zzgwx.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr10 = zzgwx.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzgwx.zza(zzS(obj, j10));
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = ((String) zzgzh.zzh(obj, j10)).hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzgzh.zzh(obj, j10).hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzgzh.zzh(obj, j10).hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr11 = zzgwx.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzp(obj, j10);
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = zzv(obj, j10);
                        byte[] bArr12 = zzgwx.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzgzh.zzh(obj, j10).hashCode();
                        i12 = i10 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i12 * 53) + ((zzgwk) obj).zzt.hashCode();
        return this.zzh ? (hashCode * 53) + ((zzgwg) obj).zza.zza.hashCode() : hashCode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0c12, code lost:
        if (r5 == 1048575) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0c14, code lost:
        r13.putInt(r7, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0c18, code lost:
        r10 = r6.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0c1d, code lost:
        if (r10 >= r6.zzl) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0c1f, code lost:
        zzy(r33, r6.zzj[r10], null, r6.zzm, r33);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0c34, code lost:
        if (r9 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0c36, code lost:
        if (r8 != r14) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0c3e, code lost:
        throw new com.google.android.gms.internal.ads.zzgwz("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0c3f, code lost:
        if (r8 > r14) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0c41, code lost:
        if (r11 != r9) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0c43, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0c49, code lost:
        throw new com.google.android.gms.internal.ads.zzgwz("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0571  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:184:0x04cb -> B:185:0x04cc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:218:0x056e -> B:219:0x056f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.ads.zzguq r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgxy.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzguq):int");
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final Object zze() {
        return ((zzgwk) this.zzg).zzbj();
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzgwk) {
                zzgwk zzgwkVar = (zzgwk) obj;
                zzgwkVar.zzbT();
                zzgwkVar.zzbS();
                zzgwkVar.zzbV();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int zzu = zzu(i10);
                int i11 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j10 = i11;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzgww) zzgzh.zzh(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzgxp) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i10], i10)) {
                        zzx(i10).zzf(zzb.getObject(obj, j10));
                    }
                }
                if (zzN(obj, i10)) {
                    zzx(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzu = zzu(i10);
            int i11 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i10)) {
                        zzgzh.zzr(obj, j10, zzgzh.zzb(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i10)) {
                        zzgzh.zzs(obj, j10, zzgzh.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i10)) {
                        zzgzh.zzu(obj, j10, zzgzh.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i10)) {
                        zzgzh.zzu(obj, j10, zzgzh.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i10)) {
                        zzgzh.zzt(obj, j10, zzgzh.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i10)) {
                        zzgzh.zzu(obj, j10, zzgzh.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i10)) {
                        zzgzh.zzt(obj, j10, zzgzh.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i10)) {
                        zzgzh.zzp(obj, j10, zzgzh.zzz(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i10)) {
                        zzgzh.zzv(obj, j10, zzgzh.zzh(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i10);
                    break;
                case 10:
                    if (zzN(obj2, i10)) {
                        zzgzh.zzv(obj, j10, zzgzh.zzh(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i10)) {
                        zzgzh.zzt(obj, j10, zzgzh.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i10)) {
                        zzgzh.zzt(obj, j10, zzgzh.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i10)) {
                        zzgzh.zzt(obj, j10, zzgzh.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i10)) {
                        zzgzh.zzu(obj, j10, zzgzh.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i10)) {
                        zzgzh.zzt(obj, j10, zzgzh.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i10)) {
                        zzgzh.zzu(obj, j10, zzgzh.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzgww zzgwwVar = (zzgww) zzgzh.zzh(obj, j10);
                    zzgww zzgwwVar2 = (zzgww) zzgzh.zzh(obj2, j10);
                    int size = zzgwwVar.size();
                    int size2 = zzgwwVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzgwwVar.zzc()) {
                            zzgwwVar = zzgwwVar.zzf(size2 + size);
                        }
                        zzgwwVar.addAll(zzgwwVar2);
                    }
                    if (size > 0) {
                        zzgwwVar2 = zzgwwVar;
                    }
                    zzgzh.zzv(obj, j10, zzgwwVar2);
                    break;
                case 50:
                    int i13 = zzgyq.zza;
                    zzgzh.zzv(obj, j10, zzgxq.zzb(zzgzh.zzh(obj, j10), zzgzh.zzh(obj2, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i12, i10)) {
                        zzgzh.zzv(obj, j10, zzgzh.zzh(obj2, j10));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i12, i10)) {
                        zzgzh.zzv(obj, j10, zzgzh.zzh(obj2, j10));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i10);
                    break;
            }
        }
        zzgyq.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzgyq.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x051a A[LOOP:5: B:144:0x0516->B:146:0x051a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x052b  */
    @Override // com.google.android.gms.internal.ads.zzgyo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r11, com.google.android.gms.internal.ads.zzgyi r12, com.google.android.gms.internal.ads.zzgvu r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgxy.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzgyi, com.google.android.gms.internal.ads.zzgvu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzguq zzguqVar) throws IOException {
        zzc(obj, bArr, i10, i11, 0, zzguqVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0683  */
    @Override // com.google.android.gms.internal.ads.zzgyo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(java.lang.Object r24, com.google.android.gms.internal.ads.zzgzp r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgxy.zzj(java.lang.Object, com.google.android.gms.internal.ads.zzgzp):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzJ;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzu = zzu(i10);
            long j10 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i10) && Double.doubleToLongBits(zzgzh.zzb(obj, j10)) == Double.doubleToLongBits(zzgzh.zzb(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i10) && Float.floatToIntBits(zzgzh.zzc(obj, j10)) == Float.floatToIntBits(zzgzh.zzc(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i10) && zzgzh.zzf(obj, j10) == zzgzh.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i10) && zzgzh.zzf(obj, j10) == zzgzh.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i10) && zzgzh.zzd(obj, j10) == zzgzh.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i10) && zzgzh.zzf(obj, j10) == zzgzh.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i10) && zzgzh.zzd(obj, j10) == zzgzh.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i10) && zzgzh.zzz(obj, j10) == zzgzh.zzz(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i10) && zzgyq.zzJ(zzgzh.zzh(obj, j10), zzgzh.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i10) && zzgyq.zzJ(zzgzh.zzh(obj, j10), zzgzh.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i10) && zzgyq.zzJ(zzgzh.zzh(obj, j10), zzgzh.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i10) && zzgzh.zzd(obj, j10) == zzgzh.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i10) && zzgzh.zzd(obj, j10) == zzgzh.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i10) && zzgzh.zzd(obj, j10) == zzgzh.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i10) && zzgzh.zzf(obj, j10) == zzgzh.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i10) && zzgzh.zzd(obj, j10) == zzgzh.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i10) && zzgzh.zzf(obj, j10) == zzgzh.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i10) && zzgyq.zzJ(zzgzh.zzh(obj, j10), zzgzh.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzJ = zzgyq.zzJ(zzgzh.zzh(obj, j10), zzgzh.zzh(obj2, j10));
                    break;
                case 50:
                    zzJ = zzgyq.zzJ(zzgzh.zzh(obj, j10), zzgzh.zzh(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzr = zzr(i10) & 1048575;
                    if (zzgzh.zzd(obj, zzr) == zzgzh.zzd(obj2, zzr) && zzgyq.zzJ(zzgzh.zzh(obj, j10), zzgzh.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzJ) {
                return false;
            }
        }
        if (((zzgwk) obj).zzt.equals(((zzgwk) obj2).zzt)) {
            if (this.zzh) {
                return ((zzgwg) obj).zza.equals(((zzgwg) obj2).zza);
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final boolean zzl(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i15 = iArr[i14];
            int i16 = iArr2[i15];
            int zzu = zzu(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i16, i15) && !zzP(obj, zzu, zzx(i15))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzgxp) zzgzh.zzh(obj, zzu & 1048575)).isEmpty()) {
                            zzgxo zzgxoVar = (zzgxo) zzz(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) zzgzh.zzh(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgyo zzx = zzx(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzx.zzl(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzO(obj, i15, i10, i11, i19) && !zzP(obj, zzu, zzx(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.zzh || ((zzgwg) obj).zza.zzi();
    }
}
