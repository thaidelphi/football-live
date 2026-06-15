package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ironsource.b9;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbjh implements zzbio {
    private final Context zza;

    public zzbjh(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zza(Object obj, Map map) {
        if (!map.containsKey(b9.h.K0) || TextUtils.isEmpty((CharSequence) map.get(b9.h.K0))) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get(b9.h.K0))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get(b9.h.K0));
        if (map.containsKey(b9.h.D0)) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get(b9.h.D0));
        }
        try {
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzT(this.zza, intent);
        } catch (RuntimeException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to open Share Sheet", e8);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
