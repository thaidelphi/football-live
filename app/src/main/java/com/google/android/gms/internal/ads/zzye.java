package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzye {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzxx[] zzd = new zzxx[100];

    public zzye(boolean z10, int i10) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzxx zzb() {
        zzxx zzxxVar;
        this.zzb++;
        int i10 = this.zzc;
        if (i10 > 0) {
            zzxx[] zzxxVarArr = this.zzd;
            int i11 = i10 - 1;
            this.zzc = i11;
            zzxxVar = zzxxVarArr[i11];
            Objects.requireNonNull(zzxxVar);
            zzxxVarArr[i11] = null;
        } else {
            zzxxVar = new zzxx(new byte[65536], 0);
            int i12 = this.zzb;
            zzxx[] zzxxVarArr2 = this.zzd;
            int length = zzxxVarArr2.length;
            if (i12 > length) {
                this.zzd = (zzxx[]) Arrays.copyOf(zzxxVarArr2, length + length);
                return zzxxVar;
            }
        }
        return zzxxVar;
    }

    public final synchronized void zzc(zzxx zzxxVar) {
        zzxx[] zzxxVarArr = this.zzd;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zzxxVarArr[i10] = zzxxVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzxy zzxyVar) {
        while (zzxyVar != null) {
            zzxx[] zzxxVarArr = this.zzd;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            zzxxVarArr[i10] = zzxyVar.zzc();
            this.zzb--;
            zzxyVar = zzxyVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i10) {
        int i11 = this.zza;
        this.zza = i10;
        if (i10 < i11) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i10 = this.zza;
        int i11 = zzeh.zza;
        int max = Math.max(0, ((i10 + 65535) / 65536) - this.zzb);
        int i12 = this.zzc;
        if (max >= i12) {
            return;
        }
        Arrays.fill(this.zzd, max, i12, (Object) null);
        this.zzc = max;
    }
}
