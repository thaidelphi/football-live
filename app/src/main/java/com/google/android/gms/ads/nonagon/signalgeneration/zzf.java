package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbav;
import com.google.android.gms.internal.ads.zzbbm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzf {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11791a;

    /* renamed from: b  reason: collision with root package name */
    private final ApplicationInfo f11792b;

    /* renamed from: c  reason: collision with root package name */
    private final List f11793c;

    /* renamed from: d  reason: collision with root package name */
    private final VersionInfoParcel f11794d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f11795e = new JSONObject();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f11796f = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf(Context context, zzbav zzbavVar, List list, VersionInfoParcel versionInfoParcel) {
        this.f11791a = context;
        this.f11792b = context.getApplicationInfo();
        this.f11793c = list;
        this.f11794d = versionInfoParcel;
    }

    public final JSONObject zza() {
        if (!this.f11796f.get()) {
            zzb();
        }
        return this.f11795e;
    }

    public final void zzb() {
        String[] split;
        if (this.f11796f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfo = null;
        try {
            if (this.f11792b != null) {
                packageInfo = Wrappers.a(this.f11791a).f(this.f11792b.packageName, 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo != null) {
            try {
                this.f11795e.put("vc", packageInfo.versionCode);
                this.f11795e.put("vnm", packageInfo.versionName);
            } catch (JSONException e8) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "PawAppSignalGenerator.initialize");
                return;
            }
        }
        ApplicationInfo applicationInfo = this.f11792b;
        if (applicationInfo != null) {
            this.f11795e.put("pn", applicationInfo.packageName);
        }
        JSONObject jSONObject = this.f11795e;
        List list = this.f11793c;
        ArrayList arrayList = new ArrayList();
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjJ)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject.put("eid", arrayList);
        this.f11795e.put("js", this.f11794d.afmaVersion);
        Iterator<String> keys = this.f11795e.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = this.f11795e.get(next);
            if (obj != null) {
                this.f11795e.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
    }
}
