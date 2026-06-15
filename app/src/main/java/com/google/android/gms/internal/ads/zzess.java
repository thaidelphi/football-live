package com.google.android.gms.internal.ads;

import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzess implements zzerv {
    final String zza;
    final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzess(String str, int i10, zzesr zzesrVar) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcth zzcthVar = (zzcth) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkp)).booleanValue()) {
            if (!TextUtils.isEmpty(this.zza)) {
                zzcthVar.zza.putString("topics", this.zza);
            }
            int i10 = this.zzb;
            if (i10 != -1) {
                zzcthVar.zza.putInt("atps", i10);
            }
        }
    }
}
