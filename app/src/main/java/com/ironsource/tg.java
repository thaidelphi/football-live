package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class tg {

    /* renamed from: a  reason: collision with root package name */
    private int f20840a;

    /* renamed from: b  reason: collision with root package name */
    private int f20841b;

    /* renamed from: c  reason: collision with root package name */
    private String f20842c;

    public tg() {
        this.f20840a = 0;
        this.f20841b = 0;
        this.f20842c = "";
    }

    public tg(int i10, int i11, String str) {
        this.f20840a = i10;
        this.f20841b = i11;
        this.f20842c = str;
    }

    public int a() {
        return this.f20841b;
    }

    public String b() {
        return this.f20842c;
    }

    public int c() {
        return this.f20840a;
    }

    public boolean d() {
        return this.f20841b > 0 && this.f20840a > 0;
    }

    public boolean e() {
        return this.f20841b == 0 && this.f20840a == 0;
    }

    public String toString() {
        return this.f20842c;
    }
}
