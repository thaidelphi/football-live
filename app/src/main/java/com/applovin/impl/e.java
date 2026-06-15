package com.applovin.impl;

import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f6841a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6842b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f6843c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f6844d;

    public e(String str, String str2) {
        this(str, str2, null, false);
    }

    public String a() {
        return this.f6842b;
    }

    public Map b() {
        return this.f6843c;
    }

    public String c() {
        return this.f6841a;
    }

    public boolean d() {
        return this.f6844d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f6841a + "', backupUrl='" + this.f6842b + "', headers='" + this.f6843c + "', shouldFireInWebView='" + this.f6844d + "'}";
    }

    public e(String str, String str2, Map map, boolean z10) {
        this.f6841a = str;
        this.f6842b = str2;
        this.f6843c = map;
        this.f6844d = z10;
    }
}
