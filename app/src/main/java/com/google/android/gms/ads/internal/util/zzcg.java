package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.SharedPreferencesUtils;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzcg {

    /* renamed from: b  reason: collision with root package name */
    private static zzcg f11466b;

    /* renamed from: a  reason: collision with root package name */
    String f11467a;

    private zzcg() {
    }

    public static zzcg zza() {
        if (f11466b == null) {
            f11466b = new zzcg();
        }
        return f11466b;
    }

    public final void zzb(Context context) {
        zze.zza("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.f11467a)) {
            Context e8 = GooglePlayServicesUtilLight.e(context);
            if (!ClientLibraryUtils.a()) {
                if (e8 == null) {
                    e8 = null;
                }
                this.f11467a = defaultUserAgent;
            }
            SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
            if (e8 == null) {
                putString.apply();
            } else {
                SharedPreferencesUtils.a(context, putString, "admob_user_agent");
            }
            this.f11467a = defaultUserAgent;
        }
        zze.zza("User agent is updated.");
    }
}
