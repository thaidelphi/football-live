package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzwd {
    public static final zzwd zza = new zzwd(new zzbo[0]);
    public final int zzb;
    private final zzfvv zzc;
    private int zzd;

    static {
        int i10 = zzeh.zza;
        Integer.toString(0, 36);
    }

    public zzwd(zzbo... zzboVarArr) {
        this.zzc = zzfvv.zzm(zzboVarArr);
        this.zzb = zzboVarArr.length;
        int i10 = 0;
        while (i10 < this.zzc.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.zzc.size(); i12++) {
                if (((zzbo) this.zzc.get(i10)).equals(this.zzc.get(i12))) {
                    zzdn.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzwd.class == obj.getClass()) {
            zzwd zzwdVar = (zzwd) obj;
            if (this.zzb == zzwdVar.zzb && this.zzc.equals(zzwdVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 == 0) {
            int hashCode = this.zzc.hashCode();
            this.zzd = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final int zza(zzbo zzboVar) {
        int indexOf = this.zzc.indexOf(zzboVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final zzbo zzb(int i10) {
        return (zzbo) this.zzc.get(i10);
    }

    public final zzfvv zzc() {
        return zzfvv.zzl(zzfwl.zzb(this.zzc, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzwc
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                zzwd zzwdVar = zzwd.zza;
                return Integer.valueOf(((zzbo) obj).zzc);
            }
        }));
    }
}
