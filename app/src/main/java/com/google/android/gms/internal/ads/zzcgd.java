package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import com.ironsource.dp;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcgd implements zzhdk {
    public zzcgd(zzcft zzcftVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* synthetic */ Object zzb() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(dp.f17077b);
        intent.setData(Uri.parse("https://play.google.com/d"));
        return intent;
    }
}
