package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzek extends zzen {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzek(int i10, long j10) {
        super(i10, null);
        this.zza = j10;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzen
    public final String toString() {
        List list = this.zzb;
        String zze = zzen.zze(this.zzd);
        String arrays = Arrays.toString(list.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        return zze + " leaves: " + arrays + " containers: " + arrays2;
    }

    public final zzek zza(int i10) {
        int size = this.zzc.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzek zzekVar = (zzek) this.zzc.get(i11);
            if (zzekVar.zzd == i10) {
                return zzekVar;
            }
        }
        return null;
    }

    public final zzel zzb(int i10) {
        int size = this.zzb.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzel zzelVar = (zzel) this.zzb.get(i11);
            if (zzelVar.zzd == i10) {
                return zzelVar;
            }
        }
        return null;
    }

    public final void zzc(zzek zzekVar) {
        this.zzc.add(zzekVar);
    }

    public final void zzd(zzel zzelVar) {
        this.zzb.add(zzelVar);
    }
}
