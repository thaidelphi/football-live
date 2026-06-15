package com.ironsource;

import android.text.TextUtils;
import java.util.HashSet;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class e4 {

    /* renamed from: c  reason: collision with root package name */
    private String f17186c;

    /* renamed from: d  reason: collision with root package name */
    private String f17187d;

    /* renamed from: f  reason: collision with root package name */
    private int f17189f;

    /* renamed from: b  reason: collision with root package name */
    private HashSet<String> f17185b = new HashSet<>();

    /* renamed from: a  reason: collision with root package name */
    private boolean f17184a = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f17188e = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f17190g = true;

    public int a() {
        return this.f17189f;
    }

    public void a(int i10) {
        this.f17189f = i10;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f17185b.add(str);
    }

    public void a(boolean z10) {
        this.f17184a = z10;
    }

    public HashSet<String> b() {
        return this.f17185b;
    }

    public void b(String str) {
        this.f17187d = str;
    }

    public void b(boolean z10) {
        this.f17190g = z10;
    }

    public String c() {
        return this.f17187d;
    }

    public void c(String str) {
        this.f17186c = str;
    }

    public void c(boolean z10) {
        this.f17188e = z10;
    }

    public String d() {
        return this.f17186c;
    }

    public boolean e() {
        return this.f17188e;
    }

    public boolean f() {
        return this.f17184a;
    }

    public boolean g() {
        return this.f17190g;
    }
}
