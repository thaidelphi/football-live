package com.ironsource;

import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class q8 {

    /* renamed from: a  reason: collision with root package name */
    private a f19878a = a.NOT_READY;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList f19879b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private String f19880c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    enum a {
        NOT_READY,
        READY
    }

    public q8(String str) {
        this.f19880c = str;
    }

    public synchronized void a() {
        Object[] array = this.f19879b.toArray();
        for (int i10 = 0; i10 < array.length; i10++) {
            ((Runnable) array[i10]).run();
            array[i10] = null;
        }
        this.f19879b.clear();
    }

    public synchronized void a(Runnable runnable) {
        if (this.f19878a != a.READY) {
            this.f19879b.add(runnable);
        } else {
            runnable.run();
        }
    }

    public synchronized void b() {
        this.f19878a = a.NOT_READY;
    }

    public synchronized void c() {
        this.f19878a = a.READY;
    }
}
