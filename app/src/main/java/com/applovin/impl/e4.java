package com.applovin.impl;

import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e4 {

    /* renamed from: a  reason: collision with root package name */
    private final String f6869a;

    /* renamed from: b  reason: collision with root package name */
    private Map f6870b;

    private e4(String str, Map map) {
        this.f6869a = str;
        this.f6870b = map;
    }

    public static e4 a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.f6869a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f6869a + "'params='" + this.f6870b + "'}";
    }

    public static e4 a(String str, Map map) {
        return new e4(str, map);
    }

    public Map a() {
        return this.f6870b;
    }
}
