package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class gm {

    /* renamed from: a  reason: collision with root package name */
    private final int f17596a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17597b;

    /* renamed from: c  reason: collision with root package name */
    private final int f17598c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f17599d;

    public gm(JSONObject applicationLogger) {
        kotlin.jvm.internal.n.f(applicationLogger, "applicationLogger");
        this.f17596a = applicationLogger.optInt(hm.f17686a, 3);
        this.f17597b = applicationLogger.optInt(hm.f17687b, 3);
        this.f17598c = applicationLogger.optInt("console", 3);
        this.f17599d = applicationLogger.optBoolean(hm.f17689d, false);
    }

    public final int a() {
        return this.f17598c;
    }

    public final int b() {
        return this.f17597b;
    }

    public final int c() {
        return this.f17596a;
    }

    public final boolean d() {
        return this.f17599d;
    }
}
