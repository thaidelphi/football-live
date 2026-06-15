package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzkx extends zzkz {
    private zzkx() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkx(zzkw zzkwVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkz
    public final void zza(Object obj, long j10) {
        ((zzkl) zzmx.zzf(obj, j10)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkz
    public final void zzb(Object obj, Object obj2, long j10) {
        zzkl zzklVar = (zzkl) zzmx.zzf(obj, j10);
        zzkl zzklVar2 = (zzkl) zzmx.zzf(obj2, j10);
        int size = zzklVar.size();
        int size2 = zzklVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzklVar.zzc()) {
                zzklVar = zzklVar.zzd(size2 + size);
            }
            zzklVar.addAll(zzklVar2);
        }
        if (size > 0) {
            zzklVar2 = zzklVar;
        }
        zzmx.zzs(obj, j10, zzklVar2);
    }
}
