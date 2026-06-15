package com.startapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static final f f21919d = new f();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f21920a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f21921b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f21922c = new HashMap();

    public static f a() {
        return f21919d;
    }

    public final int b() {
        return this.f21920a.size();
    }

    public final synchronized void a(e eVar) {
        this.f21920a.add(0, eVar);
        List list = (List) this.f21921b.get(eVar.f21898b);
        if (list == null) {
            list = new ArrayList();
            this.f21921b.put(eVar.f21898b, list);
        }
        list.add(0, eVar);
        List list2 = (List) this.f21922c.get(eVar.f21899c);
        if (list2 == null) {
            list2 = new ArrayList();
            this.f21922c.put(eVar.f21899c, list2);
        }
        list2.add(0, eVar);
    }
}
