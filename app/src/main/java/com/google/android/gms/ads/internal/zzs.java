package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbcy;
import com.ironsource.b9;
import java.util.Map;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzs {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11550a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11551b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f11552c = new TreeMap();

    /* renamed from: d  reason: collision with root package name */
    private String f11553d;

    /* renamed from: e  reason: collision with root package name */
    private String f11554e;

    /* renamed from: f  reason: collision with root package name */
    private final String f11555f;

    public zzs(Context context, String str) {
        String concat;
        this.f11550a = context.getApplicationContext();
        this.f11551b = str;
        String packageName = context.getPackageName();
        try {
            concat = packageName + "-" + Wrappers.a(context).f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get package version name for reporting", e8);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f11555f = concat;
    }

    public final String zza() {
        return this.f11555f;
    }

    public final String zzb() {
        return this.f11554e;
    }

    public final String zzc() {
        return this.f11551b;
    }

    public final String zzd() {
        return this.f11553d;
    }

    public final Map zze() {
        return this.f11552c;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, VersionInfoParcel versionInfoParcel) {
        this.f11553d = zzmVar.zzj.zza;
        Bundle bundle = zzmVar.zzm;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) zzbcy.zzc.zze();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.f11554e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.f11552c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.f11552c.put(b9.i.f16722q, versionInfoParcel.afmaVersion);
        if (((Boolean) zzbcy.zza.zze()).booleanValue()) {
            Bundle zzb = zzad.zzb(this.f11550a, (String) zzbcy.zzb.zze());
            for (String str3 : zzb.keySet()) {
                this.f11552c.put(str3, zzb.get(str3).toString());
            }
        }
    }
}
