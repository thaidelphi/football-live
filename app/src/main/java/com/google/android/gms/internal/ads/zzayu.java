package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzayu {
    static long zza(long j10, int i10) {
        if (i10 == 1) {
            return j10;
        }
        int i11 = i10 >> 1;
        long j11 = (j10 * j10) % 1073807359;
        return ((i10 & 1) == 0 ? zza(j11, i11) : j10 * (zza(j11, i11) % 1073807359)) % 1073807359;
    }

    static String zzb(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i14 = i12 - 1;
            if (i10 < i14) {
                sb.append(strArr[i10]);
                sb.append(' ');
                i10++;
            } else {
                sb.append(strArr[i14]);
                return sb.toString();
            }
        }
    }

    public static void zzc(String[] strArr, int i10, int i11, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzd(i10, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr, 0, 6);
        zzd(i10, zze, zzb(strArr, 0, 6), 6, priorityQueue);
        int i12 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i12 >= length2 - 5) {
                return;
            }
            String zzb = zzb(strArr, i12, 6);
            zze = ((((((zze + 1073807359) - ((zza(16785407L, 5) * ((zzayq.zza(strArr[i12 - 1]) + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((zzayq.zza(strArr[i12 + 5]) + 2147483647L) % 1073807359)) % 1073807359;
            zzd(i10, zze, zzb, length2, priorityQueue);
            i12++;
        }
    }

    static void zzd(int i10, long j10, String str, int i11, PriorityQueue priorityQueue) {
        zzayt zzaytVar = new zzayt(j10, str, i11);
        if ((priorityQueue.size() != i10 || (((zzayt) priorityQueue.peek()).zzc <= zzaytVar.zzc && ((zzayt) priorityQueue.peek()).zza <= zzaytVar.zza)) && !priorityQueue.contains(zzaytVar)) {
            priorityQueue.add(zzaytVar);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i10, int i11) {
        long zza = (zzayq.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i12 = 1; i12 < i11; i12++) {
            zza = (((zza * 16785407) % 1073807359) + ((zzayq.zza(strArr[i12]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
