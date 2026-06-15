package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.LinkedHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeet implements zzgal {
    final /* synthetic */ long zza;
    final /* synthetic */ zzezx zzb;
    final /* synthetic */ zzezu zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfhk zze;
    final /* synthetic */ zzfag zzf;
    final /* synthetic */ zzeev zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeet(zzeev zzeevVar, long j10, zzezx zzezxVar, zzezu zzezuVar, String str, zzfhk zzfhkVar, zzfag zzfagVar) {
        this.zza = j10;
        this.zzb = zzezxVar;
        this.zzc = zzezuVar;
        this.zzd = str;
        this.zze = zzfhkVar;
        this.zzf = zzfagVar;
        this.zzg = zzeevVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.Throwable r17) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeet.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zzb(Object obj) {
        Clock clock;
        boolean z10;
        boolean z11;
        boolean zzq;
        LinkedHashMap linkedHashMap;
        zzebl zzeblVar;
        LinkedHashMap linkedHashMap2;
        zzeex zzeexVar;
        clock = this.zzg.zza;
        long b10 = clock.b() - this.zza;
        synchronized (this.zzg) {
            zzeev zzeevVar = this.zzg;
            z10 = zzeevVar.zze;
            if (z10) {
                zzeexVar = zzeevVar.zzb;
                zzeexVar.zza(this.zzb, this.zzc, 0, null, b10);
            }
            zzeev zzeevVar2 = this.zzg;
            z11 = zzeevVar2.zzg;
            if (z11) {
                return;
            }
            zzq = zzeevVar2.zzq(this.zzc);
            if (zzq) {
                linkedHashMap2 = this.zzg.zzd;
                ((zzeeu) linkedHashMap2.get(this.zzc)).zzd = b10;
            } else {
                linkedHashMap = this.zzg.zzd;
                zzezu zzezuVar = this.zzc;
                linkedHashMap.put(zzezuVar, new zzeeu(this.zzd, zzezuVar.zzaf, 0, b10, null));
            }
            zzeblVar = this.zzg.zzf;
            zzeblVar.zzg(this.zzc, b10, null);
        }
    }
}
