package l2;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: RequestTracker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final Set<o2.c> f27512a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private final List<o2.c> f27513b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f27514c;

    public boolean a(o2.c cVar) {
        boolean z10 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = this.f27512a.remove(cVar);
        if (!this.f27513b.remove(cVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            cVar.clear();
        }
        return z10;
    }

    public void b() {
        for (o2.c cVar : s2.k.i(this.f27512a)) {
            a(cVar);
        }
        this.f27513b.clear();
    }

    public void c() {
        this.f27514c = true;
        for (o2.c cVar : s2.k.i(this.f27512a)) {
            if (cVar.isRunning() || cVar.h()) {
                cVar.clear();
                this.f27513b.add(cVar);
            }
        }
    }

    public void d() {
        this.f27514c = true;
        for (o2.c cVar : s2.k.i(this.f27512a)) {
            if (cVar.isRunning()) {
                cVar.pause();
                this.f27513b.add(cVar);
            }
        }
    }

    public void e() {
        for (o2.c cVar : s2.k.i(this.f27512a)) {
            if (!cVar.h() && !cVar.e()) {
                cVar.clear();
                if (!this.f27514c) {
                    cVar.j();
                } else {
                    this.f27513b.add(cVar);
                }
            }
        }
    }

    public void f() {
        this.f27514c = false;
        for (o2.c cVar : s2.k.i(this.f27512a)) {
            if (!cVar.h() && !cVar.isRunning()) {
                cVar.j();
            }
        }
        this.f27513b.clear();
    }

    public void g(o2.c cVar) {
        this.f27512a.add(cVar);
        if (!this.f27514c) {
            cVar.j();
            return;
        }
        cVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f27513b.add(cVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f27512a.size() + ", isPaused=" + this.f27514c + "}";
    }
}
