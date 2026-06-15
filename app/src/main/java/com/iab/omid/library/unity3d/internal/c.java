package com.iab.omid.library.unity3d.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    private static c f16107c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.unity3d.adsession.a> f16108a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.unity3d.adsession.a> f16109b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f16107c;
    }

    public Collection<com.iab.omid.library.unity3d.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f16109b);
    }

    public void a(com.iab.omid.library.unity3d.adsession.a aVar) {
        this.f16108a.add(aVar);
    }

    public Collection<com.iab.omid.library.unity3d.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f16108a);
    }

    public void b(com.iab.omid.library.unity3d.adsession.a aVar) {
        boolean d10 = d();
        this.f16108a.remove(aVar);
        this.f16109b.remove(aVar);
        if (!d10 || d()) {
            return;
        }
        h.c().e();
    }

    public void c(com.iab.omid.library.unity3d.adsession.a aVar) {
        boolean d10 = d();
        this.f16109b.add(aVar);
        if (d10) {
            return;
        }
        h.c().d();
    }

    public boolean d() {
        return this.f16109b.size() > 0;
    }
}
