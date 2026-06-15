package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzftm;
import com.ironsource.b9;
import com.ironsource.fe;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class CsiParamDefaults {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11840a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11841b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11842c;

    public CsiParamDefaults(Context context, VersionInfoParcel versionInfoParcel) {
        this.f11840a = context;
        this.f11841b = context.getPackageName();
        this.f11842c = versionInfoParcel.afmaVersion;
    }

    public void set(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put(fe.E, Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzv.zzq();
        map.put(b9.h.G, zzs.zzs());
        map.put("app", this.f11841b);
        zzv.zzq();
        map.put("is_lite_sdk", true != zzs.zzF(this.f11840a) ? "0" : "1");
        zzbbd zzbbdVar = zzbbm.zza;
        List zzb = zzbd.zza().zzb();
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzgJ)).booleanValue()) {
            zzb.addAll(zzv.zzp().zzi().zzg().zzd());
        }
        map.put("e", TextUtils.join(",", zzb));
        map.put("sdkVersion", this.f11842c);
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzll)).booleanValue()) {
            zzv.zzq();
            map.put("is_bstar", true == zzs.zzC(this.f11840a) ? "1" : "0");
        }
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzjq)).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzct)).booleanValue()) {
                map.put(fe.K, zzftm.zzc(zzv.zzp().zzn()));
            }
        }
    }
}
