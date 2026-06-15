package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.b9;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaoh {
    private final String zza;
    private final String zzb;

    public zzaoh(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaoh.class == obj.getClass()) {
            zzaoh zzaohVar = (zzaoh) obj;
            if (TextUtils.equals(this.zza, zzaohVar.zza) && TextUtils.equals(this.zzb, zzaohVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.zza + ",value=" + this.zzb + b9.i.f16698e;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
