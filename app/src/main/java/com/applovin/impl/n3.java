package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n3 {

    /* renamed from: a  reason: collision with root package name */
    private final List f8010a = Collections.synchronizedList(new ArrayList());

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(u2 u2Var);
    }

    public void a(a aVar) {
        this.f8010a.add(aVar);
    }

    public void b(a aVar) {
        this.f8010a.remove(aVar);
    }

    public void a(u2 u2Var) {
        Iterator it = new ArrayList(this.f8010a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(u2Var);
        }
    }
}
