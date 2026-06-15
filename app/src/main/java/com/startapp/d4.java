package com.startapp;

import android.content.SharedPreferences;
import java.util.UUID;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d4 {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f21872a;

    /* renamed from: b  reason: collision with root package name */
    public volatile String f21873b;

    public d4(com.startapp.sdk.adsbase.e eVar) {
        this.f21872a = eVar;
    }

    public final String a() {
        String str = this.f21873b;
        if (str == null) {
            synchronized (this) {
                str = this.f21873b;
                if (str == null) {
                    str = this.f21872a.getString("e695c6d894060903", null);
                    if (str == null) {
                        str = UUID.randomUUID().toString();
                        if (!this.f21872a.edit().putString("e695c6d894060903", str).commit()) {
                            str = "00000000-0000-0000-0000-000000000000";
                        }
                    }
                    this.f21873b = str;
                }
            }
        }
        return str;
    }
}
