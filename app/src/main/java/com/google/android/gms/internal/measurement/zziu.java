package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zziu extends zziw {
    final /* synthetic */ zzjd zza;
    private int zzb = 0;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziu(zzjd zzjdVar) {
        this.zza = zzjdVar;
        this.zzc = zzjdVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 < this.zzc) {
            this.zzb = i10 + 1;
            return this.zza.zzb(i10);
        }
        throw new NoSuchElementException();
    }
}
