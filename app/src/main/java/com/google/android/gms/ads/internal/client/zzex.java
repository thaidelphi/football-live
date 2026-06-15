package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzex {

    /* renamed from: a  reason: collision with root package name */
    private final String f11277a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f11278b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11279c;

    public zzex(String str, Bundle bundle, String str2) {
        this.f11277a = str;
        this.f11278b = bundle;
        this.f11279c = str2;
    }

    public final Bundle zza() {
        return this.f11278b;
    }

    public final String zzb() {
        return this.f11277a;
    }

    public final String zzc() {
        if (!TextUtils.isEmpty(this.f11279c)) {
            try {
                return new JSONObject(this.f11279c).optString("request_id", "");
            } catch (JSONException unused) {
                return "";
            }
        }
        return "";
    }
}
