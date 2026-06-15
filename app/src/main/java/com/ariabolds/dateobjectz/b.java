package com.ariabolds.dateobjectz;
/* compiled from: Store.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b {

    /* renamed from: e  reason: collision with root package name */
    private static b f10238e;

    /* renamed from: a  reason: collision with root package name */
    private int f10239a = 1;

    /* renamed from: b  reason: collision with root package name */
    private int f10240b = 1;

    /* renamed from: c  reason: collision with root package name */
    private String f10241c = "";

    /* renamed from: d  reason: collision with root package name */
    String f10242d = "";

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f10238e == null) {
                f10238e = new b();
            }
            bVar = f10238e;
        }
        return bVar;
    }

    public int b() {
        return this.f10239a;
    }

    public void c(int i10) {
        this.f10239a = i10;
    }
}
