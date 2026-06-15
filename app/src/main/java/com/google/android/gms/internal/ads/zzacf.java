package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzacf {
    public final String zza;

    private zzacf(int i10, int i11, String str) {
        this.zza = str;
    }

    public static zzacf zza(zzdx zzdxVar) {
        String str;
        zzdxVar.zzM(2);
        int zzm = zzdxVar.zzm();
        int i10 = zzm >> 1;
        int i11 = zzm & 1;
        int zzm2 = zzdxVar.zzm() >> 3;
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else if (i10 != 10) {
            return null;
        } else {
            str = "dav1";
        }
        int i12 = zzm2 | (i11 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i10 < 10 ? ".0" : ".");
        sb.append(i10);
        sb.append(i12 >= 10 ? "." : ".0");
        sb.append(i12);
        return new zzacf(i10, i12, sb.toString());
    }
}
