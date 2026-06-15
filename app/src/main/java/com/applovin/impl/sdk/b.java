package com.applovin.impl.sdk;

import com.applovin.impl.m1;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.a;
import com.applovin.impl.y6;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final j f8787a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f8788b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference f8789c;

    /* renamed from: d  reason: collision with root package name */
    private y6 f8790d;

    private b(m1 m1Var, a.InterfaceC0134a interfaceC0134a, j jVar) {
        this.f8788b = new WeakReference(m1Var);
        this.f8789c = new WeakReference(interfaceC0134a);
        this.f8787a = jVar;
    }

    public static b a(m1 m1Var, a.InterfaceC0134a interfaceC0134a, j jVar) {
        b bVar = new b(m1Var, interfaceC0134a, jVar);
        bVar.a(m1Var.getTimeToLiveMillis());
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.f8787a.f().a(this);
    }

    public m1 b() {
        return (m1) this.f8788b.get();
    }

    public void d() {
        a();
        m1 b10 = b();
        if (b10 == null) {
            return;
        }
        b10.setExpired();
        a.InterfaceC0134a interfaceC0134a = (a.InterfaceC0134a) this.f8789c.get();
        if (interfaceC0134a == null) {
            return;
        }
        interfaceC0134a.onAdExpired(b10);
    }

    public void a(long j10) {
        a();
        if (((Boolean) this.f8787a.a(o4.f8076b1)).booleanValue() || !this.f8787a.e0().isApplicationPaused()) {
            this.f8790d = y6.a(j10, this.f8787a, new Runnable() { // from class: com.applovin.impl.sdk.a0
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.c();
                }
            });
        }
    }

    public void a() {
        y6 y6Var = this.f8790d;
        if (y6Var != null) {
            y6Var.a();
            this.f8790d = null;
        }
    }
}
