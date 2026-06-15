package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzakq {
    private int zzf;
    private int zzh;
    private float zzn;
    private String zza = "";
    private String zzb = "";
    private Set zzc = Collections.emptySet();
    private String zzd = "";
    private String zze = null;
    private boolean zzg = false;
    private boolean zzi = false;
    private int zzj = -1;
    private int zzk = -1;
    private int zzl = -1;
    private int zzm = -1;
    private int zzo = -1;
    private boolean zzp = false;

    private static int zzA(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public final float zza() {
        return this.zzn;
    }

    public final int zzb() {
        if (this.zzi) {
            return this.zzh;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final int zzc() {
        if (this.zzg) {
            return this.zzf;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final int zzd() {
        return this.zzm;
    }

    public final int zze() {
        return this.zzo;
    }

    public final int zzf(String str, String str2, Set set, String str3) {
        if (this.zza.isEmpty() && this.zzb.isEmpty() && this.zzc.isEmpty() && this.zzd.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int zzA = zzA(zzA(zzA(0, this.zza, str, 1073741824), this.zzb, str2, 2), this.zzd, str3, 4);
        if (zzA == -1 || !set.containsAll(this.zzc)) {
            return 0;
        }
        return zzA + (this.zzc.size() * 4);
    }

    public final int zzg() {
        int i10 = this.zzk;
        if (i10 == -1 && this.zzl == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.zzl == 1 ? 2 : 0);
    }

    public final zzakq zzh(int i10) {
        this.zzh = i10;
        this.zzi = true;
        return this;
    }

    public final zzakq zzi(boolean z10) {
        this.zzk = 1;
        return this;
    }

    public final zzakq zzj(boolean z10) {
        this.zzp = z10;
        return this;
    }

    public final zzakq zzk(int i10) {
        this.zzf = i10;
        this.zzg = true;
        return this;
    }

    public final zzakq zzl(String str) {
        this.zze = zzfsb.zza(str);
        return this;
    }

    public final zzakq zzm(float f10) {
        this.zzn = f10;
        return this;
    }

    public final zzakq zzn(int i10) {
        this.zzm = i10;
        return this;
    }

    public final zzakq zzo(boolean z10) {
        this.zzl = 1;
        return this;
    }

    public final zzakq zzp(int i10) {
        this.zzo = i10;
        return this;
    }

    public final zzakq zzq(boolean z10) {
        this.zzj = 1;
        return this;
    }

    public final String zzr() {
        return this.zze;
    }

    public final void zzs(String[] strArr) {
        this.zzc = new HashSet(Arrays.asList(strArr));
    }

    public final void zzt(String str) {
        this.zza = str;
    }

    public final void zzu(String str) {
        this.zzb = str;
    }

    public final void zzv(String str) {
        this.zzd = str;
    }

    public final boolean zzw() {
        return this.zzp;
    }

    public final boolean zzx() {
        return this.zzi;
    }

    public final boolean zzy() {
        return this.zzg;
    }

    public final boolean zzz() {
        return this.zzj == 1;
    }
}
