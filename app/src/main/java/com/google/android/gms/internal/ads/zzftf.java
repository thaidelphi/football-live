package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzftf extends zzfti {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzftf(zzftg zzftgVar, zzftk zzftkVar, CharSequence charSequence, int i10) {
        super(zzftkVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    public final int zzc(int i10) {
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    public final int zzd(int i10) {
        int i11 = i10 + 4000;
        if (i11 < ((zzfti) this).zzb.length()) {
            return i11;
        }
        return -1;
    }
}
