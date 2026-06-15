package com.iab.omid.library.startio.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    private static c f15979c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.startio.adsession.a> f15980a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.startio.adsession.a> f15981b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f15979c;
    }

    public Collection<com.iab.omid.library.startio.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f15981b);
    }

    public void a(com.iab.omid.library.startio.adsession.a aVar) {
        this.f15980a.add(aVar);
    }

    public Collection<com.iab.omid.library.startio.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f15980a);
    }

    public void b(com.iab.omid.library.startio.adsession.a aVar) {
        boolean d10 = d();
        this.f15980a.remove(aVar);
        this.f15981b.remove(aVar);
        if (!d10 || d()) {
            return;
        }
        h.c().e();
    }

    public void c(com.iab.omid.library.startio.adsession.a aVar) {
        boolean d10 = d();
        this.f15981b.add(aVar);
        if (d10) {
            return;
        }
        h.c().d();
    }

    public boolean d() {
        return this.f15981b.size() > 0;
    }
}
