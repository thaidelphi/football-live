package com.applovin.impl;

import android.text.TextUtils;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.HashSet;
import java.util.Set;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class v1 {

    /* renamed from: b  reason: collision with root package name */
    private static final Set f9428b = new HashSet(32);

    /* renamed from: c  reason: collision with root package name */
    private static final Set f9429c = new HashSet(16);

    /* renamed from: d  reason: collision with root package name */
    public static final v1 f9430d = a(ServiceProvider.NAMED_AD_REQ);

    /* renamed from: e  reason: collision with root package name */
    public static final v1 f9431e = a("ad_imp");

    /* renamed from: f  reason: collision with root package name */
    public static final v1 f9432f = a("max_ad_imp");

    /* renamed from: g  reason: collision with root package name */
    public static final v1 f9433g = a("ad_session_start");

    /* renamed from: h  reason: collision with root package name */
    public static final v1 f9434h = a("ad_imp_session");

    /* renamed from: i  reason: collision with root package name */
    public static final v1 f9435i = a("max_ad_imp_session");

    /* renamed from: j  reason: collision with root package name */
    public static final v1 f9436j = a("cached_files_expired");

    /* renamed from: k  reason: collision with root package name */
    public static final v1 f9437k = a("cache_drop_count");

    /* renamed from: l  reason: collision with root package name */
    public static final v1 f9438l = a("sdk_reset_state_count", true);

    /* renamed from: m  reason: collision with root package name */
    public static final v1 f9439m = a("ad_response_process_failures", true);

    /* renamed from: n  reason: collision with root package name */
    public static final v1 f9440n = a("response_process_failures", true);

    /* renamed from: o  reason: collision with root package name */
    public static final v1 f9441o = a("incent_failed_to_display_count", true);

    /* renamed from: p  reason: collision with root package name */
    public static final v1 f9442p = a("app_paused_and_resumed");

    /* renamed from: q  reason: collision with root package name */
    public static final v1 f9443q = a("ad_rendered_with_mismatched_sdk_key", true);

    /* renamed from: r  reason: collision with root package name */
    public static final v1 f9444r = a("ad_shown_outside_app_count");

    /* renamed from: s  reason: collision with root package name */
    public static final v1 f9445s = a("med_ad_req");

    /* renamed from: t  reason: collision with root package name */
    public static final v1 f9446t = a("med_ad_response_process_failures", true);

    /* renamed from: u  reason: collision with root package name */
    public static final v1 f9447u = a("med_waterfall_ad_no_fill", true);

    /* renamed from: v  reason: collision with root package name */
    public static final v1 f9448v = a("med_waterfall_ad_adapter_load_failed", true);

    /* renamed from: w  reason: collision with root package name */
    public static final v1 f9449w = a("med_waterfall_ad_invalid_response", true);

    /* renamed from: a  reason: collision with root package name */
    private final String f9450a;

    static {
        a("fullscreen_ad_nil_vc_count");
        a("applovin_bundle_missing");
    }

    private v1(String str) {
        this.f9450a = str;
    }

    private static v1 a(String str) {
        return a(str, false);
    }

    public String b() {
        return this.f9450a;
    }

    private static v1 a(String str, boolean z10) {
        if (!TextUtils.isEmpty(str)) {
            Set set = f9428b;
            if (!set.contains(str)) {
                set.add(str);
                v1 v1Var = new v1(str);
                if (z10) {
                    f9429c.add(v1Var);
                }
                return v1Var;
            }
            throw new IllegalArgumentException("Key has already been used: " + str);
        }
        throw new IllegalArgumentException("No key name specified");
    }

    public static Set a() {
        return f9429c;
    }
}
