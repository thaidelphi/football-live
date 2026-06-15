package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzayp {
    private final int zza;
    private final zzaym zzb = new zzayr();

    public zzayp(int i10) {
        this.zza = i10;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzayo zzayoVar = new zzayo();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzayn(this));
        for (String str : split) {
            String[] zzb = zzayq.zzb(str, false);
            if (zzb.length != 0) {
                zzayu.zzc(zzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzayoVar.zzb.write(this.zzb.zzb(((zzayt) it.next()).zzb));
            } catch (IOException e8) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error while writing hash to byteStream", e8);
            }
        }
        return zzayoVar.toString();
    }
}
