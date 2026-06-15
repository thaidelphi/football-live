package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzacn {
    public static int zza(zzack zzackVar, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int zzb = zzackVar.zzb(bArr, i10 + i12, i11 - i12);
            if (zzb == -1) {
                break;
            }
            i12 += zzb;
        }
        return i12;
    }

    public static void zzb(boolean z10, String str) throws zzaz {
        if (!z10) {
            throw zzaz.zza(str, null);
        }
    }

    public static boolean zzc(zzack zzackVar, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return zzackVar.zzm(bArr, 0, i11, z10);
        } catch (EOFException e8) {
            if (z10) {
                return false;
            }
            throw e8;
        }
    }

    public static boolean zzd(zzack zzackVar, byte[] bArr, int i10, int i11) throws IOException {
        try {
            zzackVar.zzi(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzack zzackVar, int i10) throws IOException {
        try {
            zzackVar.zzk(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
