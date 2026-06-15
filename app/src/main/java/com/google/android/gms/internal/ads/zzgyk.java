package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgyk {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgyk() {
    }

    public static /* bridge */ /* synthetic */ zzgvc zza(zzgyk zzgykVar, zzgvc zzgvcVar, zzgvc zzgvcVar2) {
        zzgykVar.zzb(zzgvcVar);
        zzgykVar.zzb(zzgvcVar2);
        zzgvc zzgvcVar3 = (zzgvc) zzgykVar.zza.pop();
        while (!zzgykVar.zza.isEmpty()) {
            zzgvcVar3 = new zzgyn((zzgvc) zzgykVar.zza.pop(), zzgvcVar3);
        }
        return zzgvcVar3;
    }

    private final void zzb(zzgvc zzgvcVar) {
        zzgvc zzgvcVar2;
        zzgvc zzgvcVar3;
        if (zzgvcVar.zzh()) {
            int zzc = zzc(zzgvcVar.zzd());
            ArrayDeque arrayDeque = this.zza;
            int zzc2 = zzgyn.zzc(zzc + 1);
            if (!arrayDeque.isEmpty() && ((zzgvc) this.zza.peek()).zzd() < zzc2) {
                int zzc3 = zzgyn.zzc(zzc);
                zzgvc zzgvcVar4 = (zzgvc) this.zza.pop();
                while (!this.zza.isEmpty() && ((zzgvc) this.zza.peek()).zzd() < zzc3) {
                    zzgvcVar4 = new zzgyn((zzgvc) this.zza.pop(), zzgvcVar4);
                }
                zzgyn zzgynVar = new zzgyn(zzgvcVar4, zzgvcVar);
                while (!this.zza.isEmpty()) {
                    ArrayDeque arrayDeque2 = this.zza;
                    if (((zzgvc) arrayDeque2.peek()).zzd() >= zzgyn.zzc(zzc(zzgynVar.zzd()) + 1)) {
                        break;
                    }
                    zzgynVar = new zzgyn((zzgvc) this.zza.pop(), zzgynVar);
                }
                this.zza.push(zzgynVar);
                return;
            }
            this.zza.push(zzgvcVar);
        } else if (zzgvcVar instanceof zzgyn) {
            zzgyn zzgynVar2 = (zzgyn) zzgvcVar;
            zzgvcVar2 = zzgynVar2.zzd;
            zzb(zzgvcVar2);
            zzgvcVar3 = zzgynVar2.zze;
            zzb(zzgvcVar3);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgvcVar.getClass())));
        }
    }

    private static final int zzc(int i10) {
        int binarySearch = Arrays.binarySearch(zzgyn.zza, i10);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public /* synthetic */ zzgyk(zzgym zzgymVar) {
    }
}
