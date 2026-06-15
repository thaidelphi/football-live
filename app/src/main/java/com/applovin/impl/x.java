package com.applovin.impl;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private final String f9557a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9558b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9559c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9560d;

    /* renamed from: e  reason: collision with root package name */
    private final String f9561e;

    /* renamed from: f  reason: collision with root package name */
    private final int f9562f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f9563g;

    public x(String str, int i10) {
        this.f9561e = str;
        this.f9562f = i10;
        String[] split = str.split(",");
        boolean z10 = split.length == 3 || split.length == 4;
        this.f9563g = z10;
        if (z10) {
            this.f9557a = a(split[0]);
            this.f9558b = a(split[1]);
            this.f9559c = a(split[2]);
            this.f9560d = split.length == 4 ? a(split[3]) : "";
            return;
        }
        this.f9557a = "";
        this.f9558b = "";
        this.f9559c = "";
        this.f9560d = "";
    }

    protected boolean a(Object obj) {
        return obj instanceof x;
    }

    public String b() {
        return this.f9557a;
    }

    public String c() {
        return this.f9558b;
    }

    public String d() {
        return this.f9561e;
    }

    public String e() {
        return this.f9559c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (xVar.a(this)) {
                String b10 = b();
                String b11 = xVar.b();
                if (b10 != null ? b10.equals(b11) : b11 == null) {
                    String c10 = c();
                    String c11 = xVar.c();
                    if (c10 != null ? c10.equals(c11) : c11 == null) {
                        String e8 = e();
                        String e10 = xVar.e();
                        if (e8 != null ? e8.equals(e10) : e10 == null) {
                            String a10 = a();
                            String a11 = xVar.a();
                            return a10 != null ? a10.equals(a11) : a11 == null;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int f() {
        return this.f9562f;
    }

    public boolean g() {
        return this.f9557a.equals("applovin.com");
    }

    public boolean h() {
        return this.f9563g;
    }

    public int hashCode() {
        String b10 = b();
        int hashCode = b10 == null ? 43 : b10.hashCode();
        String c10 = c();
        int hashCode2 = ((hashCode + 59) * 59) + (c10 == null ? 43 : c10.hashCode());
        String e8 = e();
        int hashCode3 = (hashCode2 * 59) + (e8 == null ? 43 : e8.hashCode());
        String a10 = a();
        return (hashCode3 * 59) + (a10 != null ? a10.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + ")";
    }

    public String a() {
        return this.f9560d;
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }

    public x(String str) {
        this(str, -1);
    }
}
