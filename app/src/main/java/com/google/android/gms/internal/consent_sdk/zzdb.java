package com.google.android.gms.internal.consent_sdk;

import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzdb extends zzcx implements Set {
    private transient zzda zza;

    static int zzf(int i10) {
        int max = Math.max(i10, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzdb zzi() {
        return zzde.zza;
    }

    public static zzdb zzj(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzl(4, AndroidTcfDataSource.TCF_TCSTRING_KEY, "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    private static zzdb zzl(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int zzf = zzf(i10);
                Object[] objArr2 = new Object[zzf];
                int i11 = zzf - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int zza = zzcw.zza(hashCode);
                        while (true) {
                            int i15 = zza & i11;
                            Object obj2 = objArr2[i15];
                            if (obj2 == null) {
                                objArr[i13] = obj;
                                objArr2[i15] = obj;
                                i12 += hashCode;
                                i13++;
                                break;
                            } else if (!obj2.equals(obj)) {
                                zza++;
                            }
                        }
                    } else {
                        throw new NullPointerException("at index " + i14);
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new zzdf(obj3);
                }
                if (zzf(i13) >= zzf / 2) {
                    if (i13 < 3) {
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    return new zzde(objArr, i12, objArr2, i11, i13);
                }
                return zzl(i13, objArr);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzdf(obj4);
        }
        return zzde.zza;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdb) && zzk() && ((zzdb) obj).zzk() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzdg iterator();

    public final zzda zzg() {
        zzda zzdaVar = this.zza;
        if (zzdaVar == null) {
            zzda zzh = zzh();
            this.zza = zzh;
            return zzh;
        }
        return zzdaVar;
    }

    zzda zzh() {
        Object[] array = toArray();
        int i10 = zzda.zzd;
        return zzda.zzg(array, array.length);
    }

    boolean zzk() {
        return false;
    }
}
