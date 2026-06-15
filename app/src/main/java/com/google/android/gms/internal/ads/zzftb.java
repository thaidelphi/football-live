package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzftb extends zzfti {
    final /* synthetic */ zzfsg zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzftb(zzftc zzftcVar, zzftk zzftkVar, CharSequence charSequence, zzfsg zzfsgVar) {
        super(zzftkVar, charSequence);
        this.zza = zzfsgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    final int zzc(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    final int zzd(int i10) {
        CharSequence charSequence = ((zzfti) this).zzb;
        int length = charSequence.length();
        zzfsv.zzb(i10, length, "index");
        while (i10 < length) {
            if (this.zza.zzb(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
