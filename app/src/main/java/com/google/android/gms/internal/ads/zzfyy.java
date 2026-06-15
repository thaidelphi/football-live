package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfyy extends zzfyz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ int zza(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int zzb(long j10) {
        int i10 = (int) j10;
        zzfsv.zzh(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int zzc(int i10, int i11, int i12) {
        zzfsv.zzj(true, "min (%s) must be less than or equal to max (%s)", i11, 1073741823);
        return Math.min(Math.max(i10, i11), 1073741823);
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        zzfsv.zzj(length >= 4, "array too small: %s < %s", length, 4);
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static int zze(long j10) {
        return j10 > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : j10 < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j10;
    }

    public static Integer zzf(String str, int i10) {
        Long valueOf;
        Objects.requireNonNull(str);
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            int i11 = charAt == '-' ? 1 : 0;
            if (i11 != str.length()) {
                int i12 = i11 + 1;
                int zza = zzfza.zza(str.charAt(i11));
                if (zza >= 0 && zza < 10) {
                    long j10 = -zza;
                    while (true) {
                        if (i12 < str.length()) {
                            int i13 = i12 + 1;
                            int zza2 = zzfza.zza(str.charAt(i12));
                            if (zza2 < 0 || zza2 >= 10 || j10 < -922337203685477580L) {
                                break;
                            }
                            long j11 = j10 * 10;
                            long j12 = zza2;
                            if (j11 < Long.MIN_VALUE + j12) {
                                break;
                            }
                            j10 = j11 - j12;
                            i12 = i13;
                        } else if (charAt == '-') {
                            valueOf = Long.valueOf(j10);
                        } else if (j10 != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j10);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    public static List zzg(int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new zzfyx(iArr, 0, length);
    }

    public static int[] zzh(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            Objects.requireNonNull(obj);
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
