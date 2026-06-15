package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzdlb implements zzbem {
    final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ zzdlc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdlb(zzdlc zzdlcVar, String str) {
        this.zzb = zzdlcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final void zzc() {
        zzdgm zzdgmVar;
        zzdgm zzdgmVar2;
        zzdlc zzdlcVar = this.zzb;
        zzdgmVar = zzdlcVar.zzd;
        if (zzdgmVar != null) {
            String str = this.zza;
            zzdgmVar2 = zzdlcVar.zzd;
            zzdgmVar2.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final void zzd(MotionEvent motionEvent) {
    }
}
