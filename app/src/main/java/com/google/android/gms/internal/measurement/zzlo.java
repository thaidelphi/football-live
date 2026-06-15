package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzlo<T> implements zzlw<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmx.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzll zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkz zzm;
    private final zzmn zzn;
    private final zzjr zzo;
    private final zzlq zzp;
    private final zzlg zzq;

    private zzlo(int[] iArr, Object[] objArr, int i10, int i11, zzll zzllVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzlq zzlqVar, zzkz zzkzVar, zzmn zzmnVar, zzjr zzjrVar, zzlg zzlgVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = z10;
        boolean z12 = false;
        if (zzjrVar != null && zzjrVar.zzc(zzllVar)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzp = zzlqVar;
        this.zzm = zzkzVar;
        this.zzn = zzmnVar;
        this.zzo = zzjrVar;
        this.zzg = zzllVar;
        this.zzq = zzlgVar;
    }

    private static int zzA(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzB(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzC(Object obj, long j10) {
        return ((Long) zzmx.zzf(obj, j10)).longValue();
    }

    private final zzki zzD(int i10) {
        int i11 = i10 / 3;
        return (zzki) this.zzd[i11 + i11 + 1];
    }

    private final zzlw zzE(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzlw zzlwVar = (zzlw) this.zzd[i12];
        if (zzlwVar != null) {
            return zzlwVar;
        }
        zzlw zzb2 = zzlt.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private static Field zzG(Class cls, String str) {
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

    private final void zzH(Object obj, Object obj2, int i10) {
        long zzB = zzB(i10) & 1048575;
        if (zzO(obj2, i10)) {
            Object zzf = zzmx.zzf(obj, zzB);
            Object zzf2 = zzmx.zzf(obj2, zzB);
            if (zzf != null && zzf2 != null) {
                zzmx.zzs(obj, zzB, zzkm.zzg(zzf, zzf2));
                zzJ(obj, i10);
            } else if (zzf2 != null) {
                zzmx.zzs(obj, zzB, zzf2);
                zzJ(obj, i10);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i10) {
        int zzB = zzB(i10);
        int i11 = this.zzc[i10];
        long j10 = zzB & 1048575;
        if (zzR(obj2, i11, i10)) {
            Object zzf = zzR(obj, i11, i10) ? zzmx.zzf(obj, j10) : null;
            Object zzf2 = zzmx.zzf(obj2, j10);
            if (zzf != null && zzf2 != null) {
                zzmx.zzs(obj, j10, zzkm.zzg(zzf, zzf2));
                zzK(obj, i11, i10);
            } else if (zzf2 != null) {
                zzmx.zzs(obj, j10, zzf2);
                zzK(obj, i11, i10);
            }
        }
    }

    private final void zzJ(Object obj, int i10) {
        int zzy = zzy(i10);
        long j10 = 1048575 & zzy;
        if (j10 == 1048575) {
            return;
        }
        zzmx.zzq(obj, j10, (1 << (zzy >>> 20)) | zzmx.zzc(obj, j10));
    }

    private final void zzK(Object obj, int i10, int i11) {
        zzmx.zzq(obj, zzy(i11) & 1048575, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzL(Object obj, zznf zznfVar) throws IOException {
        int i10;
        boolean z10;
        if (!this.zzh) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i11 = 1048575;
            int i12 = 1048575;
            int i13 = 0;
            int i14 = 0;
            while (i13 < length) {
                int zzB = zzB(i13);
                int[] iArr = this.zzc;
                int i15 = iArr[i13];
                int zzA = zzA(zzB);
                if (zzA <= 17) {
                    int i16 = iArr[i13 + 2];
                    int i17 = i16 & i11;
                    if (i17 != i12) {
                        i14 = unsafe.getInt(obj, i17);
                        i12 = i17;
                    }
                    i10 = 1 << (i16 >>> 20);
                } else {
                    i10 = 0;
                }
                long j10 = zzB & i11;
                switch (zzA) {
                    case 0:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zznfVar.zzf(i15, zzmx.zza(obj, j10));
                            break;
                        }
                    case 1:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zznfVar.zzo(i15, zzmx.zzb(obj, j10));
                            break;
                        }
                    case 2:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zznfVar.zzt(i15, unsafe.getLong(obj, j10));
                            break;
                        }
                    case 3:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zznfVar.zzJ(i15, unsafe.getLong(obj, j10));
                            break;
                        }
                    case 4:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zznfVar.zzr(i15, unsafe.getInt(obj, j10));
                            break;
                        }
                    case 5:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zznfVar.zzm(i15, unsafe.getLong(obj, j10));
                            break;
                        }
                    case 6:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zznfVar.zzk(i15, unsafe.getInt(obj, j10));
                            break;
                        }
                    case 7:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zznfVar.zzb(i15, zzmx.zzw(obj, j10));
                            break;
                        }
                    case 8:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zzT(i15, unsafe.getObject(obj, j10), zznfVar);
                            break;
                        }
                    case 9:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zznfVar.zzv(i15, unsafe.getObject(obj, j10), zzE(i13));
                            break;
                        }
                    case 10:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zznfVar.zzd(i15, (zzjd) unsafe.getObject(obj, j10));
                            break;
                        }
                    case 11:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zznfVar.zzH(i15, unsafe.getInt(obj, j10));
                            break;
                        }
                    case 12:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zznfVar.zzi(i15, unsafe.getInt(obj, j10));
                            break;
                        }
                    case 13:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zznfVar.zzw(i15, unsafe.getInt(obj, j10));
                            break;
                        }
                    case 14:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zznfVar.zzy(i15, unsafe.getLong(obj, j10));
                            break;
                        }
                    case 15:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zznfVar.zzA(i15, unsafe.getInt(obj, j10));
                            break;
                        }
                    case 16:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zznfVar.zzC(i15, unsafe.getLong(obj, j10));
                            break;
                        }
                    case 17:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            zznfVar.zzq(i15, unsafe.getObject(obj, j10), zzE(i13));
                            break;
                        }
                    case 18:
                        zzly.zzJ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                        break;
                    case 19:
                        zzly.zzN(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                        break;
                    case 20:
                        zzly.zzQ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                        break;
                    case 21:
                        zzly.zzY(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                        break;
                    case 22:
                        zzly.zzP(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                        break;
                    case 23:
                        zzly.zzM(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                        break;
                    case 24:
                        zzly.zzL(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                        break;
                    case 25:
                        zzly.zzH(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                        break;
                    case 26:
                        zzly.zzW(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar);
                        break;
                    case 27:
                        zzly.zzR(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, zzE(i13));
                        break;
                    case 28:
                        zzly.zzI(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar);
                        break;
                    case 29:
                        z10 = false;
                        zzly.zzX(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                        break;
                    case 30:
                        z10 = false;
                        zzly.zzK(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                        break;
                    case 31:
                        z10 = false;
                        zzly.zzS(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                        break;
                    case 32:
                        z10 = false;
                        zzly.zzT(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                        break;
                    case 33:
                        z10 = false;
                        zzly.zzU(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                        break;
                    case 34:
                        z10 = false;
                        zzly.zzV(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                        break;
                    case 35:
                        zzly.zzJ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                        break;
                    case 36:
                        zzly.zzN(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                        break;
                    case 37:
                        zzly.zzQ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                        break;
                    case 38:
                        zzly.zzY(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                        break;
                    case 39:
                        zzly.zzP(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                        break;
                    case 40:
                        zzly.zzM(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                        break;
                    case 41:
                        zzly.zzL(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                        break;
                    case 42:
                        zzly.zzH(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                        break;
                    case 43:
                        zzly.zzX(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                        break;
                    case 44:
                        zzly.zzK(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                        break;
                    case 45:
                        zzly.zzS(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                        break;
                    case 46:
                        zzly.zzT(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                        break;
                    case 47:
                        zzly.zzU(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                        break;
                    case 48:
                        zzly.zzV(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                        break;
                    case 49:
                        zzly.zzO(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, zzE(i13));
                        break;
                    case 50:
                        zzM(zznfVar, i15, unsafe.getObject(obj, j10), i13);
                        break;
                    case 51:
                        if (zzR(obj, i15, i13)) {
                            zznfVar.zzf(i15, zzn(obj, j10));
                        }
                        break;
                    case 52:
                        if (zzR(obj, i15, i13)) {
                            zznfVar.zzo(i15, zzo(obj, j10));
                        }
                        break;
                    case 53:
                        if (zzR(obj, i15, i13)) {
                            zznfVar.zzt(i15, zzC(obj, j10));
                        }
                        break;
                    case 54:
                        if (zzR(obj, i15, i13)) {
                            zznfVar.zzJ(i15, zzC(obj, j10));
                        }
                        break;
                    case 55:
                        if (zzR(obj, i15, i13)) {
                            zznfVar.zzr(i15, zzr(obj, j10));
                        }
                        break;
                    case 56:
                        if (zzR(obj, i15, i13)) {
                            zznfVar.zzm(i15, zzC(obj, j10));
                        }
                        break;
                    case 57:
                        if (zzR(obj, i15, i13)) {
                            zznfVar.zzk(i15, zzr(obj, j10));
                        }
                        break;
                    case 58:
                        if (zzR(obj, i15, i13)) {
                            zznfVar.zzb(i15, zzS(obj, j10));
                        }
                        break;
                    case 59:
                        if (zzR(obj, i15, i13)) {
                            zzT(i15, unsafe.getObject(obj, j10), zznfVar);
                        }
                        break;
                    case 60:
                        if (zzR(obj, i15, i13)) {
                            zznfVar.zzv(i15, unsafe.getObject(obj, j10), zzE(i13));
                        }
                        break;
                    case 61:
                        if (zzR(obj, i15, i13)) {
                            zznfVar.zzd(i15, (zzjd) unsafe.getObject(obj, j10));
                        }
                        break;
                    case 62:
                        if (zzR(obj, i15, i13)) {
                            zznfVar.zzH(i15, zzr(obj, j10));
                        }
                        break;
                    case 63:
                        if (zzR(obj, i15, i13)) {
                            zznfVar.zzi(i15, zzr(obj, j10));
                        }
                        break;
                    case 64:
                        if (zzR(obj, i15, i13)) {
                            zznfVar.zzw(i15, zzr(obj, j10));
                        }
                        break;
                    case 65:
                        if (zzR(obj, i15, i13)) {
                            zznfVar.zzy(i15, zzC(obj, j10));
                        }
                        break;
                    case 66:
                        if (zzR(obj, i15, i13)) {
                            zznfVar.zzA(i15, zzr(obj, j10));
                        }
                        break;
                    case 67:
                        if (zzR(obj, i15, i13)) {
                            zznfVar.zzC(i15, zzC(obj, j10));
                        }
                        break;
                    case 68:
                        if (zzR(obj, i15, i13)) {
                            zznfVar.zzq(i15, unsafe.getObject(obj, j10), zzE(i13));
                        }
                        break;
                }
                i13 += 3;
                i11 = 1048575;
            }
            zzmn zzmnVar = this.zzn;
            zzmnVar.zzi(zzmnVar.zzc(obj), zznfVar);
            return;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final void zzM(zznf zznfVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        zzle zzleVar = (zzle) zzF(i11);
        throw null;
    }

    private final boolean zzN(Object obj, Object obj2, int i10) {
        return zzO(obj, i10) == zzO(obj2, i10);
    }

    private final boolean zzO(Object obj, int i10) {
        int zzy = zzy(i10);
        long j10 = zzy & 1048575;
        if (j10 != 1048575) {
            return (zzmx.zzc(obj, j10) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i10);
        long j11 = zzB & 1048575;
        switch (zzA(zzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmx.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmx.zzb(obj, j11)) != 0;
            case 2:
                return zzmx.zzd(obj, j11) != 0;
            case 3:
                return zzmx.zzd(obj, j11) != 0;
            case 4:
                return zzmx.zzc(obj, j11) != 0;
            case 5:
                return zzmx.zzd(obj, j11) != 0;
            case 6:
                return zzmx.zzc(obj, j11) != 0;
            case 7:
                return zzmx.zzw(obj, j11);
            case 8:
                Object zzf = zzmx.zzf(obj, j11);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzjd) {
                    return !zzjd.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzmx.zzf(obj, j11) != null;
            case 10:
                return !zzjd.zzb.equals(zzmx.zzf(obj, j11));
            case 11:
                return zzmx.zzc(obj, j11) != 0;
            case 12:
                return zzmx.zzc(obj, j11) != 0;
            case 13:
                return zzmx.zzc(obj, j11) != 0;
            case 14:
                return zzmx.zzd(obj, j11) != 0;
            case 15:
                return zzmx.zzc(obj, j11) != 0;
            case 16:
                return zzmx.zzd(obj, j11) != 0;
            case 17:
                return zzmx.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzO(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzQ(Object obj, int i10, zzlw zzlwVar) {
        return zzlwVar.zzk(zzmx.zzf(obj, i10 & 1048575));
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzmx.zzc(obj, (long) (zzy(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzmx.zzf(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zznf zznfVar) throws IOException {
        if (obj instanceof String) {
            zznfVar.zzF(i10, (String) obj);
        } else {
            zznfVar.zzd(i10, (zzjd) obj);
        }
    }

    static zzmo zzd(Object obj) {
        zzke zzkeVar = (zzke) obj;
        zzmo zzmoVar = zzkeVar.zzc;
        if (zzmoVar == zzmo.zzc()) {
            zzmo zze = zzmo.zze();
            zzkeVar.zzc = zze;
            return zze;
        }
        return zzmoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlo zzl(Class cls, zzli zzliVar, zzlq zzlqVar, zzkz zzkzVar, zzmn zzmnVar, zzjr zzjrVar, zzlg zzlgVar) {
        if (zzliVar instanceof zzlv) {
            return zzm((zzlv) zzliVar, zzlqVar, zzkzVar, zzmnVar, zzjrVar, zzlgVar);
        }
        zzmk zzmkVar = (zzmk) zzliVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.measurement.zzlo zzm(com.google.android.gms.internal.measurement.zzlv r34, com.google.android.gms.internal.measurement.zzlq r35, com.google.android.gms.internal.measurement.zzkz r36, com.google.android.gms.internal.measurement.zzmn r37, com.google.android.gms.internal.measurement.zzjr r38, com.google.android.gms.internal.measurement.zzlg r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlo.zzm(com.google.android.gms.internal.measurement.zzlv, com.google.android.gms.internal.measurement.zzlq, com.google.android.gms.internal.measurement.zzkz, com.google.android.gms.internal.measurement.zzmn, com.google.android.gms.internal.measurement.zzjr, com.google.android.gms.internal.measurement.zzlg):com.google.android.gms.internal.measurement.zzlo");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzmx.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzmx.zzf(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i10;
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int i11;
        int zzu;
        boolean z10;
        int zzd2;
        int zzi;
        int zzz;
        int zzA8;
        int i12;
        int zzA9;
        int zzA10;
        int zzA11;
        int zzB2;
        int zzA12;
        int zzd3;
        int zzA13;
        int i13;
        Unsafe unsafe = zzb;
        int i14 = 1048575;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < this.zzc.length) {
            int zzB3 = zzB(i16);
            int[] iArr = this.zzc;
            int i19 = iArr[i16];
            int zzA14 = zzA(zzB3);
            if (zzA14 <= 17) {
                int i20 = iArr[i16 + 2];
                int i21 = i20 & i14;
                i10 = 1 << (i20 >>> 20);
                if (i21 != i15) {
                    i18 = unsafe.getInt(obj, i21);
                    i15 = i21;
                }
            } else {
                i10 = 0;
            }
            long j10 = zzB3 & i14;
            switch (zzA14) {
                case 0:
                    if ((i18 & i10) == 0) {
                        break;
                    } else {
                        zzA = zzjl.zzA(i19 << 3);
                        zzA5 = zzA + 8;
                        i17 += zzA5;
                        break;
                    }
                case 1:
                    if ((i18 & i10) == 0) {
                        break;
                    } else {
                        zzA2 = zzjl.zzA(i19 << 3);
                        zzA5 = zzA2 + 4;
                        i17 += zzA5;
                        break;
                    }
                case 2:
                    if ((i18 & i10) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(obj, j10);
                        zzA3 = zzjl.zzA(i19 << 3);
                        zzB = zzjl.zzB(j11);
                        i17 += zzA3 + zzB;
                        break;
                    }
                case 3:
                    if ((i18 & i10) == 0) {
                        break;
                    } else {
                        long j12 = unsafe.getLong(obj, j10);
                        zzA3 = zzjl.zzA(i19 << 3);
                        zzB = zzjl.zzB(j12);
                        i17 += zzA3 + zzB;
                        break;
                    }
                case 4:
                    if ((i18 & i10) == 0) {
                        break;
                    } else {
                        int i22 = unsafe.getInt(obj, j10);
                        zzA4 = zzjl.zzA(i19 << 3);
                        zzv = zzjl.zzv(i22);
                        i11 = zzA4 + zzv;
                        i17 += i11;
                        break;
                    }
                case 5:
                    if ((i18 & i10) == 0) {
                        break;
                    } else {
                        zzA = zzjl.zzA(i19 << 3);
                        zzA5 = zzA + 8;
                        i17 += zzA5;
                        break;
                    }
                case 6:
                    if ((i18 & i10) == 0) {
                        break;
                    } else {
                        zzA2 = zzjl.zzA(i19 << 3);
                        zzA5 = zzA2 + 4;
                        i17 += zzA5;
                        break;
                    }
                case 7:
                    if ((i18 & i10) == 0) {
                        break;
                    } else {
                        zzA5 = zzjl.zzA(i19 << 3) + 1;
                        i17 += zzA5;
                        break;
                    }
                case 8:
                    if ((i18 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzjd) {
                            zzA6 = zzjl.zzA(i19 << 3);
                            zzd = ((zzjd) object).zzd();
                            zzA7 = zzjl.zzA(zzd);
                            i11 = zzA6 + zzA7 + zzd;
                            i17 += i11;
                            break;
                        } else {
                            zzA4 = zzjl.zzA(i19 << 3);
                            zzv = zzjl.zzy((String) object);
                            i11 = zzA4 + zzv;
                            i17 += i11;
                        }
                    }
                case 9:
                    if ((i18 & i10) == 0) {
                        break;
                    } else {
                        zzA5 = zzly.zzo(i19, unsafe.getObject(obj, j10), zzE(i16));
                        i17 += zzA5;
                        break;
                    }
                case 10:
                    if ((i18 & i10) == 0) {
                        break;
                    } else {
                        zzA6 = zzjl.zzA(i19 << 3);
                        zzd = ((zzjd) unsafe.getObject(obj, j10)).zzd();
                        zzA7 = zzjl.zzA(zzd);
                        i11 = zzA6 + zzA7 + zzd;
                        i17 += i11;
                        break;
                    }
                case 11:
                    if ((i18 & i10) == 0) {
                        break;
                    } else {
                        int i23 = unsafe.getInt(obj, j10);
                        zzA4 = zzjl.zzA(i19 << 3);
                        zzv = zzjl.zzA(i23);
                        i11 = zzA4 + zzv;
                        i17 += i11;
                        break;
                    }
                case 12:
                    if ((i18 & i10) == 0) {
                        break;
                    } else {
                        int i24 = unsafe.getInt(obj, j10);
                        zzA4 = zzjl.zzA(i19 << 3);
                        zzv = zzjl.zzv(i24);
                        i11 = zzA4 + zzv;
                        i17 += i11;
                        break;
                    }
                case 13:
                    if ((i18 & i10) == 0) {
                        break;
                    } else {
                        zzA2 = zzjl.zzA(i19 << 3);
                        zzA5 = zzA2 + 4;
                        i17 += zzA5;
                        break;
                    }
                case 14:
                    if ((i18 & i10) == 0) {
                        break;
                    } else {
                        zzA = zzjl.zzA(i19 << 3);
                        zzA5 = zzA + 8;
                        i17 += zzA5;
                        break;
                    }
                case 15:
                    if ((i18 & i10) == 0) {
                        break;
                    } else {
                        int i25 = unsafe.getInt(obj, j10);
                        zzA4 = zzjl.zzA(i19 << 3);
                        zzv = zzjl.zzA((i25 >> 31) ^ (i25 + i25));
                        i11 = zzA4 + zzv;
                        i17 += i11;
                        break;
                    }
                case 16:
                    if ((i10 & i18) == 0) {
                        break;
                    } else {
                        long j13 = unsafe.getLong(obj, j10);
                        i17 += zzjl.zzA(i19 << 3) + zzjl.zzB((j13 >> 63) ^ (j13 + j13));
                        break;
                    }
                case 17:
                    if ((i18 & i10) == 0) {
                        break;
                    } else {
                        zzA5 = zzjl.zzu(i19, (zzll) unsafe.getObject(obj, j10), zzE(i16));
                        i17 += zzA5;
                        break;
                    }
                case 18:
                    zzA5 = zzly.zzh(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += zzA5;
                    break;
                case 19:
                    zzA5 = zzly.zzf(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += zzA5;
                    break;
                case 20:
                    zzA5 = zzly.zzm(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += zzA5;
                    break;
                case 21:
                    zzA5 = zzly.zzx(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += zzA5;
                    break;
                case 22:
                    zzA5 = zzly.zzk(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += zzA5;
                    break;
                case 23:
                    zzA5 = zzly.zzh(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += zzA5;
                    break;
                case 24:
                    zzA5 = zzly.zzf(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += zzA5;
                    break;
                case 25:
                    zzA5 = zzly.zza(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += zzA5;
                    break;
                case 26:
                    zzu = zzly.zzu(i19, (List) unsafe.getObject(obj, j10));
                    i17 += zzu;
                    break;
                case 27:
                    zzu = zzly.zzp(i19, (List) unsafe.getObject(obj, j10), zzE(i16));
                    i17 += zzu;
                    break;
                case 28:
                    zzu = zzly.zzc(i19, (List) unsafe.getObject(obj, j10));
                    i17 += zzu;
                    break;
                case 29:
                    zzu = zzly.zzv(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += zzu;
                    break;
                case 30:
                    z10 = false;
                    zzd2 = zzly.zzd(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += zzd2;
                    break;
                case 31:
                    z10 = false;
                    zzd2 = zzly.zzf(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += zzd2;
                    break;
                case 32:
                    z10 = false;
                    zzd2 = zzly.zzh(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += zzd2;
                    break;
                case 33:
                    z10 = false;
                    zzd2 = zzly.zzq(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += zzd2;
                    break;
                case 34:
                    z10 = false;
                    zzd2 = zzly.zzs(i19, (List) unsafe.getObject(obj, j10), false);
                    i17 += zzd2;
                    break;
                case 35:
                    zzi = zzly.zzi((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjl.zzz(i19);
                        zzA8 = zzjl.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 36:
                    zzi = zzly.zzg((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjl.zzz(i19);
                        zzA8 = zzjl.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 37:
                    zzi = zzly.zzn((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjl.zzz(i19);
                        zzA8 = zzjl.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 38:
                    zzi = zzly.zzy((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjl.zzz(i19);
                        zzA8 = zzjl.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 39:
                    zzi = zzly.zzl((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjl.zzz(i19);
                        zzA8 = zzjl.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 40:
                    zzi = zzly.zzi((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjl.zzz(i19);
                        zzA8 = zzjl.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 41:
                    zzi = zzly.zzg((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjl.zzz(i19);
                        zzA8 = zzjl.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 42:
                    zzi = zzly.zzb((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjl.zzz(i19);
                        zzA8 = zzjl.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 43:
                    zzi = zzly.zzw((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjl.zzz(i19);
                        zzA8 = zzjl.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 44:
                    zzi = zzly.zze((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjl.zzz(i19);
                        zzA8 = zzjl.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 45:
                    zzi = zzly.zzg((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjl.zzz(i19);
                        zzA8 = zzjl.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 46:
                    zzi = zzly.zzi((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjl.zzz(i19);
                        zzA8 = zzjl.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 47:
                    zzi = zzly.zzr((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjl.zzz(i19);
                        zzA8 = zzjl.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 48:
                    zzi = zzly.zzt((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjl.zzz(i19);
                        zzA8 = zzjl.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 49:
                    zzu = zzly.zzj(i19, (List) unsafe.getObject(obj, j10), zzE(i16));
                    i17 += zzu;
                    break;
                case 50:
                    zzlg.zza(i19, unsafe.getObject(obj, j10), zzF(i16));
                    break;
                case 51:
                    if (zzR(obj, i19, i16)) {
                        zzA9 = zzjl.zzA(i19 << 3);
                        zzu = zzA9 + 8;
                        i17 += zzu;
                    }
                    break;
                case 52:
                    if (zzR(obj, i19, i16)) {
                        zzA10 = zzjl.zzA(i19 << 3);
                        zzu = zzA10 + 4;
                        i17 += zzu;
                    }
                    break;
                case 53:
                    if (zzR(obj, i19, i16)) {
                        long zzC = zzC(obj, j10);
                        zzA11 = zzjl.zzA(i19 << 3);
                        zzB2 = zzjl.zzB(zzC);
                        i17 += zzA11 + zzB2;
                    }
                    break;
                case 54:
                    if (zzR(obj, i19, i16)) {
                        long zzC2 = zzC(obj, j10);
                        zzA11 = zzjl.zzA(i19 << 3);
                        zzB2 = zzjl.zzB(zzC2);
                        i17 += zzA11 + zzB2;
                    }
                    break;
                case 55:
                    if (zzR(obj, i19, i16)) {
                        int zzr = zzr(obj, j10);
                        i12 = zzjl.zzA(i19 << 3);
                        zzi = zzjl.zzv(zzr);
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 56:
                    if (zzR(obj, i19, i16)) {
                        zzA9 = zzjl.zzA(i19 << 3);
                        zzu = zzA9 + 8;
                        i17 += zzu;
                    }
                    break;
                case 57:
                    if (zzR(obj, i19, i16)) {
                        zzA10 = zzjl.zzA(i19 << 3);
                        zzu = zzA10 + 4;
                        i17 += zzu;
                    }
                    break;
                case 58:
                    if (zzR(obj, i19, i16)) {
                        zzu = zzjl.zzA(i19 << 3) + 1;
                        i17 += zzu;
                    }
                    break;
                case 59:
                    if (zzR(obj, i19, i16)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzjd) {
                            zzA12 = zzjl.zzA(i19 << 3);
                            zzd3 = ((zzjd) object2).zzd();
                            zzA13 = zzjl.zzA(zzd3);
                            i13 = zzA12 + zzA13 + zzd3;
                            i17 += i13;
                        } else {
                            i12 = zzjl.zzA(i19 << 3);
                            zzi = zzjl.zzy((String) object2);
                            i13 = i12 + zzi;
                            i17 += i13;
                        }
                    }
                    break;
                case 60:
                    if (zzR(obj, i19, i16)) {
                        zzu = zzly.zzo(i19, unsafe.getObject(obj, j10), zzE(i16));
                        i17 += zzu;
                    }
                    break;
                case 61:
                    if (zzR(obj, i19, i16)) {
                        zzA12 = zzjl.zzA(i19 << 3);
                        zzd3 = ((zzjd) unsafe.getObject(obj, j10)).zzd();
                        zzA13 = zzjl.zzA(zzd3);
                        i13 = zzA12 + zzA13 + zzd3;
                        i17 += i13;
                    }
                    break;
                case 62:
                    if (zzR(obj, i19, i16)) {
                        int zzr2 = zzr(obj, j10);
                        i12 = zzjl.zzA(i19 << 3);
                        zzi = zzjl.zzA(zzr2);
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 63:
                    if (zzR(obj, i19, i16)) {
                        int zzr3 = zzr(obj, j10);
                        i12 = zzjl.zzA(i19 << 3);
                        zzi = zzjl.zzv(zzr3);
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 64:
                    if (zzR(obj, i19, i16)) {
                        zzA10 = zzjl.zzA(i19 << 3);
                        zzu = zzA10 + 4;
                        i17 += zzu;
                    }
                    break;
                case 65:
                    if (zzR(obj, i19, i16)) {
                        zzA9 = zzjl.zzA(i19 << 3);
                        zzu = zzA9 + 8;
                        i17 += zzu;
                    }
                    break;
                case 66:
                    if (zzR(obj, i19, i16)) {
                        int zzr4 = zzr(obj, j10);
                        i12 = zzjl.zzA(i19 << 3);
                        zzi = zzjl.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        i13 = i12 + zzi;
                        i17 += i13;
                    }
                    break;
                case 67:
                    if (zzR(obj, i19, i16)) {
                        long zzC3 = zzC(obj, j10);
                        i17 += zzjl.zzA(i19 << 3) + zzjl.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                    }
                    break;
                case 68:
                    if (zzR(obj, i19, i16)) {
                        zzu = zzjl.zzu(i19, (zzll) unsafe.getObject(obj, j10), zzE(i16));
                        i17 += zzu;
                    }
                    break;
            }
            i16 += 3;
            i14 = 1048575;
        }
        zzmn zzmnVar = this.zzn;
        int zza2 = i17 + zzmnVar.zza(zzmnVar.zzc(obj));
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return zza2;
    }

    private final int zzq(Object obj) {
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int zzo;
        int zzz;
        int zzA8;
        int i10;
        Unsafe unsafe = zzb;
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzc.length; i12 += 3) {
            int zzB2 = zzB(i12);
            int zzA9 = zzA(zzB2);
            int i13 = this.zzc[i12];
            long j10 = zzB2 & 1048575;
            if (zzA9 >= zzjw.zzJ.zza() && zzA9 <= zzjw.zzW.zza()) {
                int i14 = this.zzc[i12 + 2];
            }
            switch (zzA9) {
                case 0:
                    if (zzO(obj, i12)) {
                        zzA = zzjl.zzA(i13 << 3);
                        zzo = zzA + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i12)) {
                        zzA2 = zzjl.zzA(i13 << 3);
                        zzo = zzA2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i12)) {
                        long zzd2 = zzmx.zzd(obj, j10);
                        zzA3 = zzjl.zzA(i13 << 3);
                        zzB = zzjl.zzB(zzd2);
                        i11 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i12)) {
                        long zzd3 = zzmx.zzd(obj, j10);
                        zzA3 = zzjl.zzA(i13 << 3);
                        zzB = zzjl.zzB(zzd3);
                        i11 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i12)) {
                        int zzc = zzmx.zzc(obj, j10);
                        zzA4 = zzjl.zzA(i13 << 3);
                        zzv = zzjl.zzv(zzc);
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i12)) {
                        zzA = zzjl.zzA(i13 << 3);
                        zzo = zzA + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i12)) {
                        zzA2 = zzjl.zzA(i13 << 3);
                        zzo = zzA2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i12)) {
                        zzA5 = zzjl.zzA(i13 << 3);
                        zzo = zzA5 + 1;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzO(obj, i12)) {
                        break;
                    } else {
                        Object zzf = zzmx.zzf(obj, j10);
                        if (zzf instanceof zzjd) {
                            zzA6 = zzjl.zzA(i13 << 3);
                            zzd = ((zzjd) zzf).zzd();
                            zzA7 = zzjl.zzA(zzd);
                            i10 = zzA6 + zzA7 + zzd;
                            i11 += i10;
                            break;
                        } else {
                            zzA4 = zzjl.zzA(i13 << 3);
                            zzv = zzjl.zzy((String) zzf);
                            i10 = zzA4 + zzv;
                            i11 += i10;
                        }
                    }
                case 9:
                    if (zzO(obj, i12)) {
                        zzo = zzly.zzo(i13, zzmx.zzf(obj, j10), zzE(i12));
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i12)) {
                        zzA6 = zzjl.zzA(i13 << 3);
                        zzd = ((zzjd) zzmx.zzf(obj, j10)).zzd();
                        zzA7 = zzjl.zzA(zzd);
                        i10 = zzA6 + zzA7 + zzd;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i12)) {
                        int zzc2 = zzmx.zzc(obj, j10);
                        zzA4 = zzjl.zzA(i13 << 3);
                        zzv = zzjl.zzA(zzc2);
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i12)) {
                        int zzc3 = zzmx.zzc(obj, j10);
                        zzA4 = zzjl.zzA(i13 << 3);
                        zzv = zzjl.zzv(zzc3);
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i12)) {
                        zzA2 = zzjl.zzA(i13 << 3);
                        zzo = zzA2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i12)) {
                        zzA = zzjl.zzA(i13 << 3);
                        zzo = zzA + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i12)) {
                        int zzc4 = zzmx.zzc(obj, j10);
                        zzA4 = zzjl.zzA(i13 << 3);
                        zzv = zzjl.zzA((zzc4 >> 31) ^ (zzc4 + zzc4));
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i12)) {
                        long zzd4 = zzmx.zzd(obj, j10);
                        zzA4 = zzjl.zzA(i13 << 3);
                        zzv = zzjl.zzB((zzd4 >> 63) ^ (zzd4 + zzd4));
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i12)) {
                        zzo = zzjl.zzu(i13, (zzll) zzmx.zzf(obj, j10), zzE(i12));
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzly.zzh(i13, (List) zzmx.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 19:
                    zzo = zzly.zzf(i13, (List) zzmx.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 20:
                    zzo = zzly.zzm(i13, (List) zzmx.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 21:
                    zzo = zzly.zzx(i13, (List) zzmx.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 22:
                    zzo = zzly.zzk(i13, (List) zzmx.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 23:
                    zzo = zzly.zzh(i13, (List) zzmx.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 24:
                    zzo = zzly.zzf(i13, (List) zzmx.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 25:
                    zzo = zzly.zza(i13, (List) zzmx.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 26:
                    zzo = zzly.zzu(i13, (List) zzmx.zzf(obj, j10));
                    i11 += zzo;
                    break;
                case 27:
                    zzo = zzly.zzp(i13, (List) zzmx.zzf(obj, j10), zzE(i12));
                    i11 += zzo;
                    break;
                case 28:
                    zzo = zzly.zzc(i13, (List) zzmx.zzf(obj, j10));
                    i11 += zzo;
                    break;
                case 29:
                    zzo = zzly.zzv(i13, (List) zzmx.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 30:
                    zzo = zzly.zzd(i13, (List) zzmx.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 31:
                    zzo = zzly.zzf(i13, (List) zzmx.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 32:
                    zzo = zzly.zzh(i13, (List) zzmx.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 33:
                    zzo = zzly.zzq(i13, (List) zzmx.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 34:
                    zzo = zzly.zzs(i13, (List) zzmx.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 35:
                    zzv = zzly.zzi((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i13);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzv = zzly.zzg((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i13);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzv = zzly.zzn((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i13);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzv = zzly.zzy((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i13);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzv = zzly.zzl((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i13);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzv = zzly.zzi((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i13);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzv = zzly.zzg((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i13);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzv = zzly.zzb((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i13);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzv = zzly.zzw((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i13);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzv = zzly.zze((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i13);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzv = zzly.zzg((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i13);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzv = zzly.zzi((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i13);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzv = zzly.zzr((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i13);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzv = zzly.zzt((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i13);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzly.zzj(i13, (List) zzmx.zzf(obj, j10), zzE(i12));
                    i11 += zzo;
                    break;
                case 50:
                    zzlg.zza(i13, zzmx.zzf(obj, j10), zzF(i12));
                    break;
                case 51:
                    if (zzR(obj, i13, i12)) {
                        zzA = zzjl.zzA(i13 << 3);
                        zzo = zzA + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i13, i12)) {
                        zzA2 = zzjl.zzA(i13 << 3);
                        zzo = zzA2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i13, i12)) {
                        long zzC = zzC(obj, j10);
                        zzA3 = zzjl.zzA(i13 << 3);
                        zzB = zzjl.zzB(zzC);
                        i11 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i13, i12)) {
                        long zzC2 = zzC(obj, j10);
                        zzA3 = zzjl.zzA(i13 << 3);
                        zzB = zzjl.zzB(zzC2);
                        i11 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i13, i12)) {
                        int zzr = zzr(obj, j10);
                        zzA4 = zzjl.zzA(i13 << 3);
                        zzv = zzjl.zzv(zzr);
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i13, i12)) {
                        zzA = zzjl.zzA(i13 << 3);
                        zzo = zzA + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i13, i12)) {
                        zzA2 = zzjl.zzA(i13 << 3);
                        zzo = zzA2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i13, i12)) {
                        zzA5 = zzjl.zzA(i13 << 3);
                        zzo = zzA5 + 1;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzR(obj, i13, i12)) {
                        break;
                    } else {
                        Object zzf2 = zzmx.zzf(obj, j10);
                        if (zzf2 instanceof zzjd) {
                            zzA6 = zzjl.zzA(i13 << 3);
                            zzd = ((zzjd) zzf2).zzd();
                            zzA7 = zzjl.zzA(zzd);
                            i10 = zzA6 + zzA7 + zzd;
                            i11 += i10;
                            break;
                        } else {
                            zzA4 = zzjl.zzA(i13 << 3);
                            zzv = zzjl.zzy((String) zzf2);
                            i10 = zzA4 + zzv;
                            i11 += i10;
                        }
                    }
                case 60:
                    if (zzR(obj, i13, i12)) {
                        zzo = zzly.zzo(i13, zzmx.zzf(obj, j10), zzE(i12));
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i13, i12)) {
                        zzA6 = zzjl.zzA(i13 << 3);
                        zzd = ((zzjd) zzmx.zzf(obj, j10)).zzd();
                        zzA7 = zzjl.zzA(zzd);
                        i10 = zzA6 + zzA7 + zzd;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i13, i12)) {
                        int zzr2 = zzr(obj, j10);
                        zzA4 = zzjl.zzA(i13 << 3);
                        zzv = zzjl.zzA(zzr2);
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i13, i12)) {
                        int zzr3 = zzr(obj, j10);
                        zzA4 = zzjl.zzA(i13 << 3);
                        zzv = zzjl.zzv(zzr3);
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i13, i12)) {
                        zzA2 = zzjl.zzA(i13 << 3);
                        zzo = zzA2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i13, i12)) {
                        zzA = zzjl.zzA(i13 << 3);
                        zzo = zzA + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i13, i12)) {
                        int zzr4 = zzr(obj, j10);
                        zzA4 = zzjl.zzA(i13 << 3);
                        zzv = zzjl.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i13, i12)) {
                        long zzC3 = zzC(obj, j10);
                        zzA4 = zzjl.zzA(i13 << 3);
                        zzv = zzjl.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i13, i12)) {
                        zzo = zzjl.zzu(i13, (zzll) zzmx.zzf(obj, j10), zzE(i12));
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzmn zzmnVar = this.zzn;
        return i11 + zzmnVar.zza(zzmnVar.zzc(obj));
    }

    private static int zzr(Object obj, long j10) {
        return ((Integer) zzmx.zzf(obj, j10)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zziq zziqVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzlf) object).zze()) {
            zzlf zzb2 = zzlf.zza().zzb();
            zzlg.zzb(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        zzle zzleVar = (zzle) zzF;
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zziq zziqVar) throws IOException {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzir.zzn(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzir.zzb(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int zzm = zzir.zzm(bArr, i10, zziqVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zziqVar.zzb));
                    unsafe.putInt(obj, j11, i13);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int zzj = zzir.zzj(bArr, i10, zziqVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zziqVar.zza));
                    unsafe.putInt(obj, j11, i13);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(zzir.zzn(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(zzir.zzb(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int zzm2 = zzir.zzm(bArr, i10, zziqVar);
                    unsafe.putObject(obj, j10, Boolean.valueOf(zziqVar.zzb != 0));
                    unsafe.putInt(obj, j11, i13);
                    return zzm2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int zzj2 = zzir.zzj(bArr, i10, zziqVar);
                    int i18 = zziqVar.zza;
                    if (i18 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else if ((i15 & 536870912) != 0 && !zznc.zzf(bArr, zzj2, zzj2 + i18)) {
                        throw zzko.zzc();
                    } else {
                        unsafe.putObject(obj, j10, new String(bArr, zzj2, i18, zzkm.zzb));
                        zzj2 += i18;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzj2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    int zzd = zzir.zzd(zzE(i17), bArr, i10, i11, zziqVar);
                    Object object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j10, zziqVar.zzc);
                    } else {
                        unsafe.putObject(obj, j10, zzkm.zzg(object, zziqVar.zzc));
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzd;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int zza2 = zzir.zza(bArr, i10, zziqVar);
                    unsafe.putObject(obj, j10, zziqVar.zzc);
                    unsafe.putInt(obj, j11, i13);
                    return zza2;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int zzj3 = zzir.zzj(bArr, i10, zziqVar);
                    int i19 = zziqVar.zza;
                    zzki zzD = zzD(i17);
                    if (zzD != null && !zzD.zza(i19)) {
                        zzd(obj).zzh(i12, Long.valueOf(i19));
                    } else {
                        unsafe.putObject(obj, j10, Integer.valueOf(i19));
                        unsafe.putInt(obj, j11, i13);
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int zzj4 = zzir.zzj(bArr, i10, zziqVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzjh.zzb(zziqVar.zza)));
                    unsafe.putInt(obj, j11, i13);
                    return zzj4;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int zzm3 = zzir.zzm(bArr, i10, zziqVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzjh.zzc(zziqVar.zzb)));
                    unsafe.putInt(obj, j11, i13);
                    return zzm3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    int zzc = zzir.zzc(zzE(i17), bArr, i10, i11, (i12 & (-8)) | 4, zziqVar);
                    Object object2 = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j10, zziqVar.zzc);
                    } else {
                        unsafe.putObject(obj, j10, zzkm.zzg(object2, zziqVar.zzc));
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzc;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02d9, code lost:
        if (r0 != r5) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02db, code lost:
        r15 = r31;
        r14 = r32;
        r12 = r33;
        r13 = r35;
        r11 = r36;
        r10 = r19;
        r1 = r20;
        r2 = r23;
        r6 = r26;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02f1, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0322, code lost:
        if (r0 != r15) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0345, code lost:
        if (r0 != r15) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzu(java.lang.Object r32, byte[] r33, int r34, int r35, com.google.android.gms.internal.measurement.zziq r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlo.zzu(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zziq):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021a -> B:120:0x021b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014f -> B:67:0x0150). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01cc -> B:100:0x01cd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzv(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.zziq r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlo.zzv(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zziq):int");
    }

    private final int zzw(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, 0);
    }

    private final int zzx(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, i11);
    }

    private final int zzy(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzz(int i10, int i11) {
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

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final int zzb(Object obj) {
        int i10;
        int zzc;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int zzB = zzB(i12);
            int i13 = this.zzc[i12];
            long j10 = 1048575 & zzB;
            int i14 = 37;
            switch (zzA(zzB)) {
                case 0:
                    i10 = i11 * 53;
                    zzc = zzkm.zzc(Double.doubleToLongBits(zzmx.zza(obj, j10)));
                    i11 = i10 + zzc;
                    break;
                case 1:
                    i10 = i11 * 53;
                    zzc = Float.floatToIntBits(zzmx.zzb(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 2:
                    i10 = i11 * 53;
                    zzc = zzkm.zzc(zzmx.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 3:
                    i10 = i11 * 53;
                    zzc = zzkm.zzc(zzmx.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 4:
                    i10 = i11 * 53;
                    zzc = zzmx.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 5:
                    i10 = i11 * 53;
                    zzc = zzkm.zzc(zzmx.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 6:
                    i10 = i11 * 53;
                    zzc = zzmx.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 7:
                    i10 = i11 * 53;
                    zzc = zzkm.zza(zzmx.zzw(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 8:
                    i10 = i11 * 53;
                    zzc = ((String) zzmx.zzf(obj, j10)).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 9:
                    Object zzf = zzmx.zzf(obj, j10);
                    if (zzf != null) {
                        i14 = zzf.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i10 = i11 * 53;
                    zzc = zzmx.zzf(obj, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 11:
                    i10 = i11 * 53;
                    zzc = zzmx.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 12:
                    i10 = i11 * 53;
                    zzc = zzmx.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 13:
                    i10 = i11 * 53;
                    zzc = zzmx.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 14:
                    i10 = i11 * 53;
                    zzc = zzkm.zzc(zzmx.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 15:
                    i10 = i11 * 53;
                    zzc = zzmx.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 16:
                    i10 = i11 * 53;
                    zzc = zzkm.zzc(zzmx.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 17:
                    Object zzf2 = zzmx.zzf(obj, j10);
                    if (zzf2 != null) {
                        i14 = zzf2.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
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
                    i10 = i11 * 53;
                    zzc = zzmx.zzf(obj, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 50:
                    i10 = i11 * 53;
                    zzc = zzmx.zzf(obj, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 51:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzkm.zzc(Double.doubleToLongBits(zzn(obj, j10)));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = Float.floatToIntBits(zzo(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzkm.zzc(zzC(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzkm.zzc(zzC(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzr(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzkm.zzc(zzC(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzr(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzkm.zza(zzS(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = ((String) zzmx.zzf(obj, j10)).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzmx.zzf(obj, j10).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzmx.zzf(obj, j10).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzr(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzr(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzr(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzkm.zzc(zzC(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzr(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzkm.zzc(zzC(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzmx.zzf(obj, j10).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.zzn.zzc(obj).hashCode();
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return hashCode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzc(Object obj, byte[] bArr, int i10, int i11, int i12, zziq zziqVar) throws IOException {
        Unsafe unsafe;
        int i13;
        Object obj2;
        zzlo<T> zzloVar;
        byte b10;
        int zzw;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Object obj3;
        int i19;
        zziq zziqVar2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        zzlo<T> zzloVar2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i30 = i11;
        int i31 = i12;
        zziq zziqVar3 = zziqVar;
        Unsafe unsafe2 = zzb;
        int i32 = i10;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = -1;
        int i37 = 1048575;
        while (true) {
            if (i32 < i30) {
                int i38 = i32 + 1;
                byte b11 = bArr2[i32];
                if (b11 < 0) {
                    int zzk = zzir.zzk(b11, bArr2, i38, zziqVar3);
                    b10 = zziqVar3.zza;
                    i38 = zzk;
                } else {
                    b10 = b11;
                }
                int i39 = b10 >>> 3;
                int i40 = b10 & 7;
                if (i39 > i36) {
                    zzw = zzloVar2.zzx(i39, i34 / 3);
                } else {
                    zzw = zzloVar2.zzw(i39);
                }
                if (zzw == -1) {
                    i14 = i39;
                    i15 = i38;
                    i16 = b10;
                    i17 = i35;
                    unsafe = unsafe2;
                    i13 = i31;
                    i18 = 0;
                } else {
                    int[] iArr = zzloVar2.zzc;
                    int i41 = iArr[zzw + 1];
                    int zzA = zzA(i41);
                    int i42 = i38;
                    long j10 = i41 & 1048575;
                    if (zzA <= 17) {
                        int i43 = iArr[zzw + 2];
                        int i44 = 1 << (i43 >>> 20);
                        int i45 = i43 & 1048575;
                        if (i45 != i37) {
                            i20 = b10;
                            if (i37 != 1048575) {
                                unsafe2.putInt(obj4, i37, i35);
                            }
                            i35 = unsafe2.getInt(obj4, i45);
                            i21 = i45;
                        } else {
                            i20 = b10;
                            i21 = i37;
                        }
                        int i46 = i35;
                        switch (zzA) {
                            case 0:
                                i22 = zzw;
                                i14 = i39;
                                i23 = i42;
                                if (i40 == 1) {
                                    zzmx.zzo(obj4, j10, Double.longBitsToDouble(zzir.zzn(bArr2, i23)));
                                    i32 = i23 + 8;
                                    i35 = i46 | i44;
                                    i36 = i14;
                                    i31 = i12;
                                    i34 = i22;
                                    i33 = i20;
                                    i37 = i21;
                                    i30 = i11;
                                    break;
                                } else {
                                    i42 = i23;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 1:
                                i22 = zzw;
                                i14 = i39;
                                i23 = i42;
                                if (i40 == 5) {
                                    zzmx.zzp(obj4, j10, Float.intBitsToFloat(zzir.zzb(bArr2, i23)));
                                    i32 = i23 + 4;
                                    i35 = i46 | i44;
                                    i36 = i14;
                                    i31 = i12;
                                    i34 = i22;
                                    i33 = i20;
                                    i37 = i21;
                                    i30 = i11;
                                    break;
                                } else {
                                    i42 = i23;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 2:
                            case 3:
                                i22 = zzw;
                                i14 = i39;
                                i23 = i42;
                                if (i40 == 0) {
                                    int zzm = zzir.zzm(bArr2, i23, zziqVar3);
                                    unsafe2.putLong(obj, j10, zziqVar3.zzb);
                                    i35 = i46 | i44;
                                    i36 = i14;
                                    i31 = i12;
                                    i32 = zzm;
                                    i34 = i22;
                                    i33 = i20;
                                    i37 = i21;
                                    i30 = i11;
                                    break;
                                } else {
                                    i42 = i23;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 4:
                            case 11:
                                i22 = zzw;
                                i14 = i39;
                                i23 = i42;
                                if (i40 == 0) {
                                    i32 = zzir.zzj(bArr2, i23, zziqVar3);
                                    unsafe2.putInt(obj4, j10, zziqVar3.zza);
                                    i35 = i46 | i44;
                                    i36 = i14;
                                    i31 = i12;
                                    i34 = i22;
                                    i33 = i20;
                                    i37 = i21;
                                    i30 = i11;
                                    break;
                                } else {
                                    i42 = i23;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 5:
                            case 14:
                                int i47 = i20;
                                i14 = i39;
                                if (i40 == 1) {
                                    i22 = zzw;
                                    i20 = i47;
                                    i23 = i42;
                                    unsafe2.putLong(obj, j10, zzir.zzn(bArr2, i42));
                                    i32 = i23 + 8;
                                    i35 = i46 | i44;
                                    i36 = i14;
                                    i31 = i12;
                                    i34 = i22;
                                    i33 = i20;
                                    i37 = i21;
                                    i30 = i11;
                                    break;
                                } else {
                                    i22 = zzw;
                                    i20 = i47;
                                    i42 = i42;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 6:
                            case 13:
                                i24 = i20;
                                i14 = i39;
                                i25 = i42;
                                if (i40 == 5) {
                                    unsafe2.putInt(obj4, j10, zzir.zzb(bArr2, i25));
                                    i32 = i25 + 4;
                                    i35 = i46 | i44;
                                    i34 = zzw;
                                    i33 = i24;
                                    i37 = i21;
                                    i36 = i14;
                                    i31 = i12;
                                    break;
                                } else {
                                    i22 = zzw;
                                    i42 = i25;
                                    i20 = i24;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 7:
                                i24 = i20;
                                i14 = i39;
                                i25 = i42;
                                if (i40 == 0) {
                                    i32 = zzir.zzm(bArr2, i25, zziqVar3);
                                    zzmx.zzm(obj4, j10, zziqVar3.zzb != 0);
                                    i35 = i46 | i44;
                                    i34 = zzw;
                                    i33 = i24;
                                    i37 = i21;
                                    i36 = i14;
                                    i31 = i12;
                                    break;
                                } else {
                                    i22 = zzw;
                                    i42 = i25;
                                    i20 = i24;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 8:
                                i24 = i20;
                                i14 = i39;
                                i25 = i42;
                                if (i40 == 2) {
                                    if ((536870912 & i41) == 0) {
                                        i32 = zzir.zzg(bArr2, i25, zziqVar3);
                                    } else {
                                        i32 = zzir.zzh(bArr2, i25, zziqVar3);
                                    }
                                    unsafe2.putObject(obj4, j10, zziqVar3.zzc);
                                    i35 = i46 | i44;
                                    i34 = zzw;
                                    i33 = i24;
                                    i37 = i21;
                                    i36 = i14;
                                    i31 = i12;
                                    break;
                                } else {
                                    i22 = zzw;
                                    i42 = i25;
                                    i20 = i24;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 9:
                                i26 = zzw;
                                i24 = i20;
                                i14 = i39;
                                i27 = i42;
                                if (i40 == 2) {
                                    i32 = zzir.zzd(zzloVar2.zzE(i26), bArr2, i27, i30, zziqVar3);
                                    if ((i46 & i44) == 0) {
                                        unsafe2.putObject(obj4, j10, zziqVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j10, zzkm.zzg(unsafe2.getObject(obj4, j10), zziqVar3.zzc));
                                    }
                                    i35 = i46 | i44;
                                    i36 = i14;
                                    i34 = i26;
                                    i33 = i24;
                                    i37 = i21;
                                    i31 = i12;
                                    break;
                                } else {
                                    i42 = i27;
                                    i22 = i26;
                                    i20 = i24;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 10:
                                i26 = zzw;
                                i24 = i20;
                                i14 = i39;
                                i27 = i42;
                                if (i40 == 2) {
                                    i32 = zzir.zza(bArr2, i27, zziqVar3);
                                    unsafe2.putObject(obj4, j10, zziqVar3.zzc);
                                    i35 = i46 | i44;
                                    i36 = i14;
                                    i34 = i26;
                                    i33 = i24;
                                    i37 = i21;
                                    i31 = i12;
                                    break;
                                } else {
                                    i42 = i27;
                                    i22 = i26;
                                    i20 = i24;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 12:
                                i26 = zzw;
                                i24 = i20;
                                i14 = i39;
                                i27 = i42;
                                if (i40 == 0) {
                                    i32 = zzir.zzj(bArr2, i27, zziqVar3);
                                    int i48 = zziqVar3.zza;
                                    zzki zzD = zzloVar2.zzD(i26);
                                    if (zzD != null && !zzD.zza(i48)) {
                                        zzd(obj).zzh(i24, Long.valueOf(i48));
                                        i36 = i14;
                                        i35 = i46;
                                        i34 = i26;
                                        i33 = i24;
                                        i37 = i21;
                                        i31 = i12;
                                    } else {
                                        unsafe2.putInt(obj4, j10, i48);
                                        i35 = i46 | i44;
                                        i36 = i14;
                                        i34 = i26;
                                        i33 = i24;
                                        i37 = i21;
                                        i31 = i12;
                                        break;
                                    }
                                } else {
                                    i42 = i27;
                                    i22 = i26;
                                    i20 = i24;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                                break;
                            case 15:
                                i26 = zzw;
                                i24 = i20;
                                i14 = i39;
                                i27 = i42;
                                if (i40 == 0) {
                                    i32 = zzir.zzj(bArr2, i27, zziqVar3);
                                    unsafe2.putInt(obj4, j10, zzjh.zzb(zziqVar3.zza));
                                    i35 = i46 | i44;
                                    i36 = i14;
                                    i34 = i26;
                                    i33 = i24;
                                    i37 = i21;
                                    i31 = i12;
                                    break;
                                } else {
                                    i42 = i27;
                                    i22 = i26;
                                    i20 = i24;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 16:
                                if (i40 == 0) {
                                    int zzm2 = zzir.zzm(bArr2, i42, zziqVar3);
                                    i26 = zzw;
                                    i24 = i20;
                                    unsafe2.putLong(obj, j10, zzjh.zzc(zziqVar3.zzb));
                                    i35 = i46 | i44;
                                    i36 = i39;
                                    i32 = zzm2;
                                    i34 = i26;
                                    i33 = i24;
                                    i37 = i21;
                                    i31 = i12;
                                    break;
                                } else {
                                    i14 = i39;
                                    i22 = zzw;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            default:
                                i22 = zzw;
                                i14 = i39;
                                i23 = i42;
                                if (i40 == 3) {
                                    i32 = zzir.zzc(zzloVar2.zzE(i22), bArr, i23, i11, (i14 << 3) | 4, zziqVar);
                                    if ((i46 & i44) == 0) {
                                        unsafe2.putObject(obj4, j10, zziqVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j10, zzkm.zzg(unsafe2.getObject(obj4, j10), zziqVar3.zzc));
                                    }
                                    i35 = i46 | i44;
                                    bArr2 = bArr;
                                    i36 = i14;
                                    i31 = i12;
                                    i34 = i22;
                                    i33 = i20;
                                    i37 = i21;
                                    i30 = i11;
                                    break;
                                } else {
                                    i42 = i23;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                        }
                    } else {
                        int i49 = zzw;
                        int i50 = b10;
                        if (zzA != 27) {
                            i17 = i35;
                            i28 = i37;
                            if (zzA <= 49) {
                                i14 = i39;
                                unsafe = unsafe2;
                                i18 = i49;
                                i32 = zzv(obj, bArr, i42, i11, i50, i39, i40, i49, i41, zzA, j10, zziqVar);
                                if (i32 != i42) {
                                    zzloVar2 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i36 = i14;
                                    i30 = i11;
                                    i31 = i12;
                                    zziqVar3 = zziqVar;
                                    i33 = i50;
                                    i34 = i18;
                                    i35 = i17;
                                    i37 = i28;
                                    unsafe2 = unsafe;
                                } else {
                                    i13 = i12;
                                    i15 = i32;
                                    i16 = i50;
                                    i37 = i28;
                                }
                            } else {
                                i14 = i39;
                                unsafe = unsafe2;
                                i29 = i42;
                                i18 = i49;
                                if (zzA != 50) {
                                    i32 = zzt(obj, bArr, i29, i11, i50, i14, i40, i41, zzA, j10, i18, zziqVar);
                                    if (i32 != i29) {
                                        zzloVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i36 = i14;
                                        i30 = i11;
                                        i31 = i12;
                                        zziqVar3 = zziqVar;
                                        i33 = i50;
                                        i34 = i18;
                                        i35 = i17;
                                        i37 = i28;
                                        unsafe2 = unsafe;
                                    } else {
                                        i13 = i12;
                                        i15 = i32;
                                        i16 = i50;
                                        i37 = i28;
                                    }
                                } else if (i40 == 2) {
                                    i32 = zzs(obj, bArr, i29, i11, i18, j10, zziqVar);
                                    if (i32 != i29) {
                                        zzloVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i36 = i14;
                                        i30 = i11;
                                        i31 = i12;
                                        zziqVar3 = zziqVar;
                                        i33 = i50;
                                        i34 = i18;
                                        i35 = i17;
                                        i37 = i28;
                                        unsafe2 = unsafe;
                                    } else {
                                        i13 = i12;
                                        i15 = i32;
                                        i16 = i50;
                                        i37 = i28;
                                    }
                                }
                            }
                        } else if (i40 == 2) {
                            zzkl zzklVar = (zzkl) unsafe2.getObject(obj4, j10);
                            if (!zzklVar.zzc()) {
                                int size = zzklVar.size();
                                zzklVar = zzklVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j10, zzklVar);
                            }
                            i33 = i50;
                            i21 = i37;
                            i32 = zzir.zze(zzloVar2.zzE(i49), i33, bArr, i42, i11, zzklVar, zziqVar);
                            bArr2 = bArr;
                            i31 = i12;
                            i36 = i39;
                            i34 = i49;
                            i35 = i35;
                            i37 = i21;
                            i30 = i11;
                        } else {
                            i17 = i35;
                            i28 = i37;
                            i14 = i39;
                            unsafe = unsafe2;
                            i29 = i42;
                            i18 = i49;
                        }
                        i13 = i12;
                        i15 = i29;
                        i16 = i50;
                        i37 = i28;
                    }
                }
                if (i16 != i13 || i13 == 0) {
                    if (this.zzh) {
                        zziqVar2 = zziqVar;
                        zzjq zzjqVar = zziqVar2.zzd;
                        if (zzjqVar != zzjq.zza) {
                            i19 = i14;
                            if (zzjqVar.zzb(this.zzg, i19) == null) {
                                i32 = zzir.zzi(i16, bArr, i15, i11, zzd(obj), zziqVar);
                                obj3 = obj;
                                i30 = i11;
                                i33 = i16;
                                zzloVar2 = this;
                                zziqVar3 = zziqVar2;
                                i36 = i19;
                                obj4 = obj3;
                                i34 = i18;
                                i35 = i17;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i31 = i13;
                            } else {
                                zzkb zzkbVar = (zzkb) obj;
                                throw null;
                            }
                        } else {
                            obj3 = obj;
                            i19 = i14;
                        }
                    } else {
                        obj3 = obj;
                        i19 = i14;
                        zziqVar2 = zziqVar;
                    }
                    i32 = zzir.zzi(i16, bArr, i15, i11, zzd(obj), zziqVar);
                    i30 = i11;
                    i33 = i16;
                    zzloVar2 = this;
                    zziqVar3 = zziqVar2;
                    i36 = i19;
                    obj4 = obj3;
                    i34 = i18;
                    i35 = i17;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i31 = i13;
                } else {
                    zzloVar = this;
                    obj2 = obj;
                    i32 = i15;
                    i33 = i16;
                    i35 = i17;
                }
            } else {
                unsafe = unsafe2;
                i13 = i31;
                obj2 = obj4;
                zzloVar = zzloVar2;
            }
        }
        if (i37 != 1048575) {
            unsafe.putInt(obj2, i37, i35);
        }
        for (int i51 = zzloVar.zzk; i51 < zzloVar.zzl; i51++) {
            int i52 = zzloVar.zzj[i51];
            int i53 = zzloVar.zzc[i52];
            Object zzf = zzmx.zzf(obj2, zzloVar.zzB(i52) & 1048575);
            if (zzf != null && zzloVar.zzD(i52) != null) {
                zzlf zzlfVar = (zzlf) zzf;
                zzle zzleVar = (zzle) zzloVar.zzF(i52);
                throw null;
            }
        }
        if (i13 == 0) {
            if (i32 != i11) {
                throw zzko.zze();
            }
        } else if (i32 > i11 || i33 != i13) {
            throw zzko.zze();
        }
        return i32;
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final Object zze() {
        return ((zzke) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzf(Object obj) {
        int i10;
        int i11 = this.zzk;
        while (true) {
            i10 = this.zzl;
            if (i11 >= i10) {
                break;
            }
            long zzB = zzB(this.zzj[i11]) & 1048575;
            Object zzf = zzmx.zzf(obj, zzB);
            if (zzf != null) {
                ((zzlf) zzf).zzc();
                zzmx.zzs(obj, zzB, zzf);
            }
            i11++;
        }
        int length = this.zzj.length;
        while (i10 < length) {
            this.zzm.zza(obj, this.zzj[i10]);
            i10++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzg(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzB = zzB(i10);
            long j10 = 1048575 & zzB;
            int i11 = this.zzc[i10];
            switch (zzA(zzB)) {
                case 0:
                    if (zzO(obj2, i10)) {
                        zzmx.zzo(obj, j10, zzmx.zza(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj2, i10)) {
                        zzmx.zzp(obj, j10, zzmx.zzb(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj2, i10)) {
                        zzmx.zzr(obj, j10, zzmx.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj2, i10)) {
                        zzmx.zzr(obj, j10, zzmx.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj2, i10)) {
                        zzmx.zzq(obj, j10, zzmx.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj2, i10)) {
                        zzmx.zzr(obj, j10, zzmx.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj2, i10)) {
                        zzmx.zzq(obj, j10, zzmx.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj2, i10)) {
                        zzmx.zzm(obj, j10, zzmx.zzw(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj2, i10)) {
                        zzmx.zzs(obj, j10, zzmx.zzf(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i10);
                    break;
                case 10:
                    if (zzO(obj2, i10)) {
                        zzmx.zzs(obj, j10, zzmx.zzf(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj2, i10)) {
                        zzmx.zzq(obj, j10, zzmx.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj2, i10)) {
                        zzmx.zzq(obj, j10, zzmx.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj2, i10)) {
                        zzmx.zzq(obj, j10, zzmx.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj2, i10)) {
                        zzmx.zzr(obj, j10, zzmx.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj2, i10)) {
                        zzmx.zzq(obj, j10, zzmx.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj2, i10)) {
                        zzmx.zzr(obj, j10, zzmx.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i10);
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
                    this.zzm.zzb(obj, obj2, j10);
                    break;
                case 50:
                    zzly.zzaa(this.zzq, obj, obj2, j10);
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
                    if (zzR(obj2, i11, i10)) {
                        zzmx.zzs(obj, j10, zzmx.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i11, i10)) {
                        zzmx.zzs(obj, j10, zzmx.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i10);
                    break;
            }
        }
        zzly.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzly.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zziq zziqVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i10, i11, zziqVar);
        } else {
            zzc(obj, bArr, i10, i11, 0, zziqVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzi(Object obj, zznf zznfVar) throws IOException {
        if (!this.zzi) {
            zzL(obj, zznfVar);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int zzB = zzB(i10);
                int i11 = this.zzc[i10];
                switch (zzA(zzB)) {
                    case 0:
                        if (zzO(obj, i10)) {
                            zznfVar.zzf(i11, zzmx.zza(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzO(obj, i10)) {
                            zznfVar.zzo(i11, zzmx.zzb(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzO(obj, i10)) {
                            zznfVar.zzt(i11, zzmx.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzO(obj, i10)) {
                            zznfVar.zzJ(i11, zzmx.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzO(obj, i10)) {
                            zznfVar.zzr(i11, zzmx.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzO(obj, i10)) {
                            zznfVar.zzm(i11, zzmx.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzO(obj, i10)) {
                            zznfVar.zzk(i11, zzmx.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzO(obj, i10)) {
                            zznfVar.zzb(i11, zzmx.zzw(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzO(obj, i10)) {
                            zzT(i11, zzmx.zzf(obj, zzB & 1048575), zznfVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzO(obj, i10)) {
                            zznfVar.zzv(i11, zzmx.zzf(obj, zzB & 1048575), zzE(i10));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzO(obj, i10)) {
                            zznfVar.zzd(i11, (zzjd) zzmx.zzf(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzO(obj, i10)) {
                            zznfVar.zzH(i11, zzmx.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzO(obj, i10)) {
                            zznfVar.zzi(i11, zzmx.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzO(obj, i10)) {
                            zznfVar.zzw(i11, zzmx.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzO(obj, i10)) {
                            zznfVar.zzy(i11, zzmx.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzO(obj, i10)) {
                            zznfVar.zzA(i11, zzmx.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzO(obj, i10)) {
                            zznfVar.zzC(i11, zzmx.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzO(obj, i10)) {
                            zznfVar.zzq(i11, zzmx.zzf(obj, zzB & 1048575), zzE(i10));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzly.zzJ(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, false);
                        break;
                    case 19:
                        zzly.zzN(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, false);
                        break;
                    case 20:
                        zzly.zzQ(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, false);
                        break;
                    case 21:
                        zzly.zzY(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, false);
                        break;
                    case 22:
                        zzly.zzP(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, false);
                        break;
                    case 23:
                        zzly.zzM(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, false);
                        break;
                    case 24:
                        zzly.zzL(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, false);
                        break;
                    case 25:
                        zzly.zzH(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, false);
                        break;
                    case 26:
                        zzly.zzW(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar);
                        break;
                    case 27:
                        zzly.zzR(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, zzE(i10));
                        break;
                    case 28:
                        zzly.zzI(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar);
                        break;
                    case 29:
                        zzly.zzX(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, false);
                        break;
                    case 30:
                        zzly.zzK(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, false);
                        break;
                    case 31:
                        zzly.zzS(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, false);
                        break;
                    case 32:
                        zzly.zzT(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, false);
                        break;
                    case 33:
                        zzly.zzU(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, false);
                        break;
                    case 34:
                        zzly.zzV(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, false);
                        break;
                    case 35:
                        zzly.zzJ(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, true);
                        break;
                    case 36:
                        zzly.zzN(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, true);
                        break;
                    case 37:
                        zzly.zzQ(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, true);
                        break;
                    case 38:
                        zzly.zzY(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, true);
                        break;
                    case 39:
                        zzly.zzP(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, true);
                        break;
                    case 40:
                        zzly.zzM(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, true);
                        break;
                    case 41:
                        zzly.zzL(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, true);
                        break;
                    case 42:
                        zzly.zzH(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, true);
                        break;
                    case 43:
                        zzly.zzX(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, true);
                        break;
                    case 44:
                        zzly.zzK(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, true);
                        break;
                    case 45:
                        zzly.zzS(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, true);
                        break;
                    case 46:
                        zzly.zzT(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, true);
                        break;
                    case 47:
                        zzly.zzU(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, true);
                        break;
                    case 48:
                        zzly.zzV(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, true);
                        break;
                    case 49:
                        zzly.zzO(i11, (List) zzmx.zzf(obj, zzB & 1048575), zznfVar, zzE(i10));
                        break;
                    case 50:
                        zzM(zznfVar, i11, zzmx.zzf(obj, zzB & 1048575), i10);
                        break;
                    case 51:
                        if (zzR(obj, i11, i10)) {
                            zznfVar.zzf(i11, zzn(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzR(obj, i11, i10)) {
                            zznfVar.zzo(i11, zzo(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzR(obj, i11, i10)) {
                            zznfVar.zzt(i11, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzR(obj, i11, i10)) {
                            zznfVar.zzJ(i11, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzR(obj, i11, i10)) {
                            zznfVar.zzr(i11, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzR(obj, i11, i10)) {
                            zznfVar.zzm(i11, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzR(obj, i11, i10)) {
                            zznfVar.zzk(i11, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzR(obj, i11, i10)) {
                            zznfVar.zzb(i11, zzS(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzR(obj, i11, i10)) {
                            zzT(i11, zzmx.zzf(obj, zzB & 1048575), zznfVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzR(obj, i11, i10)) {
                            zznfVar.zzv(i11, zzmx.zzf(obj, zzB & 1048575), zzE(i10));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzR(obj, i11, i10)) {
                            zznfVar.zzd(i11, (zzjd) zzmx.zzf(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzR(obj, i11, i10)) {
                            zznfVar.zzH(i11, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzR(obj, i11, i10)) {
                            zznfVar.zzi(i11, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzR(obj, i11, i10)) {
                            zznfVar.zzw(i11, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzR(obj, i11, i10)) {
                            zznfVar.zzy(i11, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzR(obj, i11, i10)) {
                            zznfVar.zzA(i11, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzR(obj, i11, i10)) {
                            zznfVar.zzC(i11, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzR(obj, i11, i10)) {
                            zznfVar.zzq(i11, zzmx.zzf(obj, zzB & 1048575), zzE(i10));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzmn zzmnVar = this.zzn;
            zzmnVar.zzi(zzmnVar.zzc(obj), zznfVar);
        } else {
            this.zzo.zza(obj);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzZ;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzB = zzB(i10);
            long j10 = zzB & 1048575;
            switch (zzA(zzB)) {
                case 0:
                    if (zzN(obj, obj2, i10) && Double.doubleToLongBits(zzmx.zza(obj, j10)) == Double.doubleToLongBits(zzmx.zza(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzN(obj, obj2, i10) && Float.floatToIntBits(zzmx.zzb(obj, j10)) == Float.floatToIntBits(zzmx.zzb(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzN(obj, obj2, i10) && zzmx.zzd(obj, j10) == zzmx.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzN(obj, obj2, i10) && zzmx.zzd(obj, j10) == zzmx.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzN(obj, obj2, i10) && zzmx.zzc(obj, j10) == zzmx.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzN(obj, obj2, i10) && zzmx.zzd(obj, j10) == zzmx.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzN(obj, obj2, i10) && zzmx.zzc(obj, j10) == zzmx.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzN(obj, obj2, i10) && zzmx.zzw(obj, j10) == zzmx.zzw(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzN(obj, obj2, i10) && zzly.zzZ(zzmx.zzf(obj, j10), zzmx.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzN(obj, obj2, i10) && zzly.zzZ(zzmx.zzf(obj, j10), zzmx.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzN(obj, obj2, i10) && zzly.zzZ(zzmx.zzf(obj, j10), zzmx.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzN(obj, obj2, i10) && zzmx.zzc(obj, j10) == zzmx.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzN(obj, obj2, i10) && zzmx.zzc(obj, j10) == zzmx.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzN(obj, obj2, i10) && zzmx.zzc(obj, j10) == zzmx.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzN(obj, obj2, i10) && zzmx.zzd(obj, j10) == zzmx.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzN(obj, obj2, i10) && zzmx.zzc(obj, j10) == zzmx.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzN(obj, obj2, i10) && zzmx.zzd(obj, j10) == zzmx.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzN(obj, obj2, i10) && zzly.zzZ(zzmx.zzf(obj, j10), zzmx.zzf(obj2, j10))) {
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
                    zzZ = zzly.zzZ(zzmx.zzf(obj, j10), zzmx.zzf(obj2, j10));
                    break;
                case 50:
                    zzZ = zzly.zzZ(zzmx.zzf(obj, j10), zzmx.zzf(obj2, j10));
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
                    long zzy = zzy(i10) & 1048575;
                    if (zzmx.zzc(obj, zzy) == zzmx.zzc(obj2, zzy) && zzly.zzZ(zzmx.zzf(obj, j10), zzmx.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzZ) {
                return false;
            }
        }
        if (this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            if (this.zzh) {
                this.zzo.zza(obj);
                this.zzo.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzk) {
            int i15 = this.zzj[i14];
            int i16 = this.zzc[i15];
            int zzB = zzB(i15);
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
            if ((268435456 & zzB) != 0 && !zzP(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzR(obj, i16, i15) && !zzQ(obj, zzB, zzE(i15))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzlf) zzmx.zzf(obj, zzB & 1048575)).isEmpty()) {
                            zzle zzleVar = (zzle) zzF(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) zzmx.zzf(obj, zzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlw zzE = zzE(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzE.zzk(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzP(obj, i15, i10, i11, i19) && !zzQ(obj, zzB, zzE(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return true;
    }
}
