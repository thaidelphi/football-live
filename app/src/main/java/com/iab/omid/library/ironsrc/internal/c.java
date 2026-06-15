package com.iab.omid.library.ironsrc.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    private static c f15843c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.ironsrc.adsession.a> f15844a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.ironsrc.adsession.a> f15845b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f15843c;
    }

    public Collection<com.iab.omid.library.ironsrc.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f15845b);
    }

    public void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        this.f15844a.add(aVar);
    }

    public Collection<com.iab.omid.library.ironsrc.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f15844a);
    }

    public void b(com.iab.omid.library.ironsrc.adsession.a aVar) {
        boolean d10 = d();
        this.f15844a.remove(aVar);
        this.f15845b.remove(aVar);
        if (!d10 || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.ironsrc.adsession.a aVar) {
        boolean d10 = d();
        this.f15845b.add(aVar);
        if (d10) {
            return;
        }
        i.c().d();
    }

    public boolean d() {
        return this.f15845b.size() > 0;
    }
}
