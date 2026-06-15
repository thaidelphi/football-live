package com.ironsource;

import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class va {

    /* renamed from: h  reason: collision with root package name */
    public static final int f21117h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final int f21118i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f21119j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static final int f21120k = 3;

    /* renamed from: l  reason: collision with root package name */
    public static final int f21121l = -1;

    /* renamed from: a  reason: collision with root package name */
    private String f21122a;

    /* renamed from: b  reason: collision with root package name */
    private String f21123b;

    /* renamed from: c  reason: collision with root package name */
    private int f21124c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, String> f21125d;

    /* renamed from: e  reason: collision with root package name */
    private int f21126e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f21127f;

    /* renamed from: g  reason: collision with root package name */
    private rj f21128g;

    public va(rj rjVar) {
        this(rjVar.e(), rjVar.g(), rjVar.a(), rjVar.b());
        this.f21128g = rjVar;
    }

    public va(String str, String str2, Map<String, String> map, io ioVar) {
        this.f21124c = -1;
        this.f21123b = str;
        this.f21122a = str2;
        this.f21125d = map;
        this.f21126e = 0;
        this.f21127f = false;
        this.f21128g = null;
    }

    public void a() {
        Map<String, String> map = this.f21125d;
        if (map != null) {
            map.clear();
        }
        this.f21125d = null;
    }

    public void a(boolean z10) {
        this.f21127f = z10;
    }

    public boolean a(int i10) {
        return this.f21124c == i10;
    }

    public Map<String, String> b() {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceId", this.f21123b);
        hashMap.put("demandSourceName", this.f21122a);
        Map<String, String> map = this.f21125d;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public synchronized void b(int i10) {
        this.f21126e = i10;
    }

    public rj c() {
        return this.f21128g;
    }

    public void c(int i10) {
        this.f21124c = i10;
    }

    public boolean d() {
        return this.f21127f;
    }

    public int e() {
        return this.f21126e;
    }

    public String f() {
        return this.f21122a;
    }

    public Map<String, String> g() {
        return this.f21125d;
    }

    public String h() {
        return this.f21123b;
    }

    public io i() {
        if (this.f21128g != null) {
            return c().b();
        }
        return null;
    }

    public int j() {
        return this.f21124c;
    }

    public boolean k() {
        Map<String, String> map = this.f21125d;
        if (map == null || !map.containsKey("rewarded")) {
            return false;
        }
        return Boolean.parseBoolean(this.f21125d.get("rewarded"));
    }
}
