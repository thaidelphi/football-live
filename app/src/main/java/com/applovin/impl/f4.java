package com.applovin.impl;

import android.content.Context;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f4 {

    /* renamed from: a  reason: collision with root package name */
    private final String f6983a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6984b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6985c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f4(String str, String str2, Context context) {
        this.f6983a = str.replace("android.permission.", "");
        this.f6984b = str2;
        this.f6985c = l0.a(str, context);
    }

    public String a() {
        return this.f6984b;
    }

    public String b() {
        return this.f6983a;
    }

    public boolean c() {
        return this.f6985c;
    }
}
