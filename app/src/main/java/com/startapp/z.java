package com.startapp;

import android.content.SharedPreferences;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final Object f23646a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f23647b;

    /* renamed from: c  reason: collision with root package name */
    public volatile String f23648c;

    /* renamed from: d  reason: collision with root package name */
    public volatile String f23649d;

    public z(com.startapp.sdk.adsbase.e eVar) {
        this.f23647b = eVar;
    }

    public final String a() {
        String str = this.f23649d;
        if (str == null) {
            synchronized (this.f23646a) {
                str = this.f23649d;
                if (str == null && (str = this.f23647b.getString("2696a7f502faed4b", null)) == null) {
                    str = this.f23647b.getString("31721150b470a3b9", null);
                }
            }
        }
        return str;
    }

    public final boolean b() {
        boolean contains;
        synchronized (this.f23646a) {
            contains = this.f23647b.contains("2696a7f502faed4b");
        }
        return contains;
    }
}
