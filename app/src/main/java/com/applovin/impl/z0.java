package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class z0 extends k2 {

    /* renamed from: e  reason: collision with root package name */
    private com.applovin.impl.sdk.j f9802e;

    /* renamed from: f  reason: collision with root package name */
    private List f9803f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f9804g;

    /* renamed from: h  reason: collision with root package name */
    private List f9805h;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        RECENT_ADS,
        COUNT
    }

    public z0(Context context) {
        super(context);
        this.f9804g = new AtomicBoolean();
        this.f9805h = new ArrayList();
    }

    public void a(List list, com.applovin.impl.sdk.j jVar) {
        Activity m02;
        this.f9802e = jVar;
        this.f9803f = list;
        if (!(this.f7386a instanceof Activity) && (m02 = jVar.m0()) != null) {
            this.f7386a = m02;
        }
        if (list != null && this.f9804g.compareAndSet(false, true)) {
            this.f9805h = a(this.f9803f);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.tf
            @Override // java.lang.Runnable
            public final void run() {
                z0.this.notifyDataSetChanged();
            }
        });
    }

    @Override // com.applovin.impl.k2
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.k2
    protected List c(int i10) {
        return this.f9805h;
    }

    public List d() {
        return this.f9803f;
    }

    public com.applovin.impl.sdk.j e() {
        return this.f9802e;
    }

    public boolean f() {
        return this.f9805h.size() == 0;
    }

    public void g() {
        this.f9804g.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f9804g.get() + "}";
    }

    @Override // com.applovin.impl.k2
    protected int d(int i10) {
        return this.f9805h.size();
    }

    @Override // com.applovin.impl.k2
    protected j2 e(int i10) {
        return new m4("RECENT ADS");
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new j1((k1) it.next(), this.f7386a));
        }
        return arrayList;
    }
}
