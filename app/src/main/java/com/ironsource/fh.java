package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class fh {

    /* renamed from: c  reason: collision with root package name */
    public static final int f17476c = 1001;

    /* renamed from: a  reason: collision with root package name */
    private String f17477a;

    /* renamed from: b  reason: collision with root package name */
    private int f17478b;

    public fh(int i10, String str) {
        this.f17478b = i10;
        this.f17477a = str == null ? "" : str;
    }

    public int a() {
        return this.f17478b;
    }

    public String b() {
        return this.f17477a;
    }

    public String toString() {
        return "error - code:" + this.f17478b + ", message:" + this.f17477a;
    }
}
