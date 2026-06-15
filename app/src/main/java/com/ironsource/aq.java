package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class aq {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<String> f16396a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<String> f16397b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<String> f16398c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<String> f16399d = new ArrayList<>();

    public ArrayList<String> a() {
        return this.f16398c;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f16398c.add(str);
    }

    public ArrayList<String> b() {
        return this.f16397b;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f16397b.add(str);
    }

    public ArrayList<String> c() {
        return this.f16399d;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f16399d.add(str);
    }

    public ArrayList<String> d() {
        return this.f16396a;
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f16396a.add(str);
    }
}
