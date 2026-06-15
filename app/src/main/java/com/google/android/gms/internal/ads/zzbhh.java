package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.b9;
import com.ironsource.da;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbhh implements zzbio {
    @Override // com.google.android.gms.internal.ads.zzbio
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcdq zzcdqVar = (zzcdq) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get(da.a.f16995d);
            if (TextUtils.isEmpty(str2)) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("No timestamp given for CSI tick.");
            } else {
                try {
                    long b10 = com.google.android.gms.ads.internal.zzv.zzC().b() + (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzv.zzC().a());
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzcdqVar.zzl().zzc(str2, str3, b10);
                } catch (NumberFormatException e8) {
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Malformed timestamp for CSI tick.", e8);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get(b9.h.X);
            if (TextUtils.isEmpty(str5)) {
                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("No value given for CSI experiment.");
                return;
            }
            zzcdqVar.zzl().zza().zzd("e", str5);
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get(b9.h.X);
            if (TextUtils.isEmpty(str7)) {
                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("No name given for CSI extra.");
            } else {
                zzcdqVar.zzl().zza().zzd(str6, str7);
            }
        }
    }
}
