package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzbod;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class LiteSdkInfo extends zzcu {
    public LiteSdkInfo(Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public zzbod getAdapterCreator() {
        return new zzbnz();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public zzey getLiteSdkVersion() {
        return new zzey(ModuleDescriptor.MODULE_VERSION, 250505300, "24.0.0");
    }
}
