package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
abstract class zzfti extends zzfsa {
    final CharSequence zzb;
    int zzc = 0;
    int zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfti(zzftk zzftkVar, CharSequence charSequence) {
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    protected final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i10 = this.zzc;
        while (true) {
            int i11 = this.zzc;
            if (i11 == -1) {
                zzb();
                return null;
            }
            int zzd = zzd(i11);
            if (zzd == -1) {
                zzd = this.zzb.length();
                this.zzc = -1;
                zzc = -1;
            } else {
                zzc = zzc(zzd);
                this.zzc = zzc;
            }
            if (zzc == i10) {
                int i12 = zzc + 1;
                this.zzc = i12;
                if (i12 > this.zzb.length()) {
                    this.zzc = -1;
                }
            } else {
                if (i10 < zzd) {
                    this.zzb.charAt(i10);
                }
                if (i10 < zzd) {
                    this.zzb.charAt(zzd - 1);
                }
                int i13 = this.zzd;
                if (i13 == 1) {
                    zzd = this.zzb.length();
                    this.zzc = -1;
                    if (zzd > i10) {
                        this.zzb.charAt(zzd - 1);
                    }
                } else {
                    this.zzd = i13 - 1;
                }
                return this.zzb.subSequence(i10, zzd).toString();
            }
        }
    }

    abstract int zzc(int i10);

    abstract int zzd(int i10);
}
