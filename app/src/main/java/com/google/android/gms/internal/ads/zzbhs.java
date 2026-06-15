package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbhs implements zzbio {
    @Override // com.google.android.gms.internal.ads.zzbio
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcdq zzcdqVar = (zzcdq) obj;
        com.google.android.gms.ads.internal.zzv.zzq();
        DisplayMetrics zzu = com.google.android.gms.ads.internal.util.zzs.zzu((WindowManager) zzcdqVar.getContext().getSystemService("window"));
        int i10 = zzu.widthPixels;
        int i11 = zzu.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzcdqVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i10));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i11));
        zzcdqVar.zzd("locationReady", hashMap);
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("GET LOCATION COMPILED");
    }
}
