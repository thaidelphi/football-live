package com.startapp;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.e;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.HashSet;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class r6 implements CookieStore {

    /* renamed from: a  reason: collision with root package name */
    public final CookieStore f22468a;

    /* renamed from: b  reason: collision with root package name */
    public final com.startapp.sdk.adsbase.e f22469b;

    public r6(Context context) {
        String[] split;
        HttpCookie httpCookie;
        com.startapp.sdk.adsbase.e eVar = new com.startapp.sdk.adsbase.e(context.getSharedPreferences("com.startapp.android.publish.CookiePrefsFile", 0));
        this.f22469b = eVar;
        this.f22468a = new CookieManager().getCookieStore();
        String string = eVar.getString("names", null);
        if (string != null) {
            for (String str : TextUtils.split(string, ";")) {
                String string2 = this.f22469b.getString("cookie_" + str, null);
                if (string2 != null && (httpCookie = (HttpCookie) m4.a(HttpCookie.class, string2)) != null) {
                    if (httpCookie.hasExpired()) {
                        a(httpCookie);
                        a();
                    } else if (httpCookie.getDomain() != null) {
                        this.f22468a.add(URI.create(httpCookie.getDomain()), httpCookie);
                    }
                }
            }
        }
    }

    public final void a(HttpCookie httpCookie) {
        e.a edit = this.f22469b.edit();
        StringBuilder sb = new StringBuilder("cookie_");
        sb.append(httpCookie.getDomain() + "_" + httpCookie.getName());
        edit.remove(sb.toString());
        edit.apply();
    }

    @Override // java.net.CookieStore
    public final void add(URI uri, HttpCookie httpCookie) {
        this.f22468a.add(uri, httpCookie);
        e.a edit = this.f22469b.edit();
        edit.putString("cookie_" + (httpCookie.getDomain() + "_" + httpCookie.getName()), String.valueOf(m4.b(httpCookie)));
        edit.apply();
        a();
    }

    @Override // java.net.CookieStore
    public final List<HttpCookie> get(URI uri) {
        return this.f22468a.get(uri);
    }

    @Override // java.net.CookieStore
    public final List<HttpCookie> getCookies() {
        return this.f22468a.getCookies();
    }

    @Override // java.net.CookieStore
    public final List<URI> getURIs() {
        return this.f22468a.getURIs();
    }

    @Override // java.net.CookieStore
    public final boolean remove(URI uri, HttpCookie httpCookie) {
        if (this.f22468a.remove(uri, httpCookie)) {
            a(httpCookie);
            a();
            return true;
        }
        return false;
    }

    @Override // java.net.CookieStore
    public final boolean removeAll() {
        if (this.f22468a.removeAll()) {
            e.a edit = this.f22469b.edit();
            edit.clear();
            edit.apply();
            a();
            return true;
        }
        return false;
    }

    public final void a() {
        e.a edit = this.f22469b.edit();
        HashSet hashSet = new HashSet();
        for (HttpCookie httpCookie : this.f22468a.getCookies()) {
            hashSet.add(httpCookie.getDomain() + "_" + httpCookie.getName());
        }
        edit.putString("names", TextUtils.join(";", hashSet));
        edit.apply();
    }
}
