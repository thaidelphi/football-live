package com.ironsource;

import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class d4 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16940a;

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<String> f16941b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16942c;

    /* renamed from: d  reason: collision with root package name */
    private final String f16943d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f16944e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16945f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f16946g;

    public d4(JSONObject applicationCrashReporterSettings) {
        kotlin.jvm.internal.n.f(applicationCrashReporterSettings, "applicationCrashReporterSettings");
        this.f16940a = applicationCrashReporterSettings.optBoolean("enabled", false);
        List<String> b10 = mk.b(applicationCrashReporterSettings.optJSONArray(f4.f17370b));
        this.f16941b = b10 != null ? j8.y.L(b10) : null;
        String optString = applicationCrashReporterSettings.optString(f4.f17371c);
        kotlin.jvm.internal.n.e(optString, "applicationCrashReporter…(CRASHREPORTER_URL_FIELD)");
        this.f16942c = optString;
        String optString2 = applicationCrashReporterSettings.optString(f4.f17372d);
        kotlin.jvm.internal.n.e(optString2, "applicationCrashReporter…SHREPORTER_KEYWORD_FIELD)");
        this.f16943d = optString2;
        this.f16944e = applicationCrashReporterSettings.optBoolean(f4.f17373e, false);
        this.f16945f = applicationCrashReporterSettings.optInt("timeout", 5000);
        this.f16946g = applicationCrashReporterSettings.optBoolean(f4.f17375g, false);
    }

    public final int a() {
        return this.f16945f;
    }

    public final HashSet<String> b() {
        return this.f16941b;
    }

    public final String c() {
        return this.f16943d;
    }

    public final String d() {
        return this.f16942c;
    }

    public final boolean e() {
        return this.f16944e;
    }

    public final boolean f() {
        return this.f16940a;
    }

    public final boolean g() {
        return this.f16946g;
    }
}
