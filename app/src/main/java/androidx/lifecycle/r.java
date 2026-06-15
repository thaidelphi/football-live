package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* compiled from: LifecycleRegistry.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class r extends i {

    /* renamed from: j  reason: collision with root package name */
    public static final a f3669j = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3670b;

    /* renamed from: c  reason: collision with root package name */
    private l.a<o, b> f3671c;

    /* renamed from: d  reason: collision with root package name */
    private i.b f3672d;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference<p> f3673e;

    /* renamed from: f  reason: collision with root package name */
    private int f3674f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3675g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3676h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<i.b> f3677i;

    /* compiled from: LifecycleRegistry.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final i.b a(i.b state1, i.b bVar) {
            kotlin.jvm.internal.n.f(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }
    }

    /* compiled from: LifecycleRegistry.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private i.b f3678a;

        /* renamed from: b  reason: collision with root package name */
        private m f3679b;

        public b(o oVar, i.b initialState) {
            kotlin.jvm.internal.n.f(initialState, "initialState");
            kotlin.jvm.internal.n.c(oVar);
            this.f3679b = u.f(oVar);
            this.f3678a = initialState;
        }

        public final void a(p pVar, i.a event) {
            kotlin.jvm.internal.n.f(event, "event");
            i.b c10 = event.c();
            this.f3678a = r.f3669j.a(this.f3678a, c10);
            m mVar = this.f3679b;
            kotlin.jvm.internal.n.c(pVar);
            mVar.onStateChanged(pVar, event);
            this.f3678a = c10;
        }

        public final i.b b() {
            return this.f3678a;
        }
    }

    private r(p pVar, boolean z10) {
        this.f3670b = z10;
        this.f3671c = new l.a<>();
        this.f3672d = i.b.INITIALIZED;
        this.f3677i = new ArrayList<>();
        this.f3673e = new WeakReference<>(pVar);
    }

    private final void e(p pVar) {
        Iterator<Map.Entry<o, b>> descendingIterator = this.f3671c.descendingIterator();
        kotlin.jvm.internal.n.e(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f3676h) {
            Map.Entry<o, b> next = descendingIterator.next();
            kotlin.jvm.internal.n.e(next, "next()");
            o key = next.getKey();
            b value = next.getValue();
            while (value.b().compareTo(this.f3672d) > 0 && !this.f3676h && this.f3671c.contains(key)) {
                i.a a10 = i.a.Companion.a(value.b());
                if (a10 != null) {
                    n(a10.c());
                    value.a(pVar, a10);
                    m();
                } else {
                    throw new IllegalStateException("no event down from " + value.b());
                }
            }
        }
    }

    private final i.b f(o oVar) {
        b value;
        Map.Entry<o, b> h10 = this.f3671c.h(oVar);
        i.b bVar = null;
        i.b b10 = (h10 == null || (value = h10.getValue()) == null) ? null : value.b();
        if (!this.f3677i.isEmpty()) {
            ArrayList<i.b> arrayList = this.f3677i;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        a aVar = f3669j;
        return aVar.a(aVar.a(this.f3672d, b10), bVar);
    }

    @SuppressLint({"RestrictedApi"})
    private final void g(String str) {
        if (!this.f3670b || k.c.g().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void h(p pVar) {
        l.b<o, b>.d c10 = this.f3671c.c();
        kotlin.jvm.internal.n.e(c10, "observerMap.iteratorWithAdditions()");
        while (c10.hasNext() && !this.f3676h) {
            Map.Entry next = c10.next();
            o oVar = (o) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.b().compareTo(this.f3672d) < 0 && !this.f3676h && this.f3671c.contains(oVar)) {
                n(bVar.b());
                i.a b10 = i.a.Companion.b(bVar.b());
                if (b10 != null) {
                    bVar.a(pVar, b10);
                    m();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
            }
        }
    }

    private final boolean j() {
        if (this.f3671c.size() == 0) {
            return true;
        }
        Map.Entry<o, b> a10 = this.f3671c.a();
        kotlin.jvm.internal.n.c(a10);
        i.b b10 = a10.getValue().b();
        Map.Entry<o, b> d10 = this.f3671c.d();
        kotlin.jvm.internal.n.c(d10);
        i.b b11 = d10.getValue().b();
        return b10 == b11 && this.f3672d == b11;
    }

    private final void l(i.b bVar) {
        i.b bVar2 = this.f3672d;
        if (bVar2 == bVar) {
            return;
        }
        if ((bVar2 == i.b.INITIALIZED && bVar == i.b.DESTROYED) ? false : true) {
            this.f3672d = bVar;
            if (!this.f3675g && this.f3674f == 0) {
                this.f3675g = true;
                p();
                this.f3675g = false;
                if (this.f3672d == i.b.DESTROYED) {
                    this.f3671c = new l.a<>();
                    return;
                }
                return;
            }
            this.f3676h = true;
            return;
        }
        throw new IllegalStateException(("no event down from " + this.f3672d + " in component " + this.f3673e.get()).toString());
    }

    private final void m() {
        ArrayList<i.b> arrayList = this.f3677i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void n(i.b bVar) {
        this.f3677i.add(bVar);
    }

    private final void p() {
        p pVar = this.f3673e.get();
        if (pVar != null) {
            while (!j()) {
                this.f3676h = false;
                i.b bVar = this.f3672d;
                Map.Entry<o, b> a10 = this.f3671c.a();
                kotlin.jvm.internal.n.c(a10);
                if (bVar.compareTo(a10.getValue().b()) < 0) {
                    e(pVar);
                }
                Map.Entry<o, b> d10 = this.f3671c.d();
                if (!this.f3676h && d10 != null && this.f3672d.compareTo(d10.getValue().b()) > 0) {
                    h(pVar);
                }
            }
            this.f3676h = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    @Override // androidx.lifecycle.i
    public void a(o observer) {
        p pVar;
        kotlin.jvm.internal.n.f(observer, "observer");
        g("addObserver");
        i.b bVar = this.f3672d;
        i.b bVar2 = i.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = i.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (this.f3671c.f(observer, bVar3) == null && (pVar = this.f3673e.get()) != null) {
            boolean z10 = this.f3674f != 0 || this.f3675g;
            i.b f10 = f(observer);
            this.f3674f++;
            while (bVar3.b().compareTo(f10) < 0 && this.f3671c.contains(observer)) {
                n(bVar3.b());
                i.a b10 = i.a.Companion.b(bVar3.b());
                if (b10 != null) {
                    bVar3.a(pVar, b10);
                    m();
                    f10 = f(observer);
                } else {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
            }
            if (!z10) {
                p();
            }
            this.f3674f--;
        }
    }

    @Override // androidx.lifecycle.i
    public i.b b() {
        return this.f3672d;
    }

    @Override // androidx.lifecycle.i
    public void d(o observer) {
        kotlin.jvm.internal.n.f(observer, "observer");
        g("removeObserver");
        this.f3671c.g(observer);
    }

    public void i(i.a event) {
        kotlin.jvm.internal.n.f(event, "event");
        g("handleLifecycleEvent");
        l(event.c());
    }

    public void k(i.b state) {
        kotlin.jvm.internal.n.f(state, "state");
        g("markState");
        o(state);
    }

    public void o(i.b state) {
        kotlin.jvm.internal.n.f(state, "state");
        g("setCurrentState");
        l(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(p provider) {
        this(provider, true);
        kotlin.jvm.internal.n.f(provider, "provider");
    }
}
