package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.e;
import androidx.core.view.a0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SpecialEffectsController.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f3502a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<e> f3503b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<e> f3504c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    boolean f3505d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f3506e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f3507a;

        a(d dVar) {
            this.f3507a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (w.this.f3503b.contains(this.f3507a)) {
                this.f3507a.e().a(this.f3507a.f().H);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f3509a;

        b(d dVar) {
            this.f3509a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.f3503b.remove(this.f3509a);
            w.this.f3504c.remove(this.f3509a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3511a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f3512b;

        static {
            int[] iArr = new int[e.b.values().length];
            f3512b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3512b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3512b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f3511a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3511a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3511a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3511a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SpecialEffectsController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d extends e {

        /* renamed from: h  reason: collision with root package name */
        private final o f3513h;

        d(e.c cVar, e.b bVar, o oVar, androidx.core.os.e eVar) {
            super(cVar, bVar, oVar.k(), eVar);
            this.f3513h = oVar;
        }

        @Override // androidx.fragment.app.w.e
        public void c() {
            super.c();
            this.f3513h.m();
        }

        @Override // androidx.fragment.app.w.e
        void l() {
            if (g() == e.b.ADDING) {
                Fragment k10 = this.f3513h.k();
                View findFocus = k10.H.findFocus();
                if (findFocus != null) {
                    k10.F1(findFocus);
                    if (FragmentManager.F0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k10);
                    }
                }
                View x12 = f().x1();
                if (x12.getParent() == null) {
                    this.f3513h.b();
                    x12.setAlpha(0.0f);
                }
                if (x12.getAlpha() == 0.0f && x12.getVisibility() == 0) {
                    x12.setVisibility(4);
                }
                x12.setAlpha(k10.I());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private c f3514a;

        /* renamed from: b  reason: collision with root package name */
        private b f3515b;

        /* renamed from: c  reason: collision with root package name */
        private final Fragment f3516c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Runnable> f3517d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private final HashSet<androidx.core.os.e> f3518e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        private boolean f3519f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f3520g = false;

        /* compiled from: SpecialEffectsController.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements e.b {
            a() {
            }

            @Override // androidx.core.os.e.b
            public void a() {
                e.this.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SpecialEffectsController.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SpecialEffectsController.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX INFO: Access modifiers changed from: package-private */
            public static c b(int i10) {
                if (i10 != 0) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException("Unknown visibility " + i10);
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public static c c(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return b(view.getVisibility());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public void a(View view) {
                int i10 = c.f3511a[ordinal()];
                if (i10 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i10 == 2) {
                    if (FragmentManager.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i10 == 3) {
                    if (FragmentManager.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else if (i10 != 4) {
                } else {
                    if (FragmentManager.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }

        e(c cVar, b bVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f3514a = cVar;
            this.f3515b = bVar;
            this.f3516c = fragment;
            eVar.c(new a());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(Runnable runnable) {
            this.f3517d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f3519f = true;
            if (this.f3518e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f3518e).iterator();
            while (it.hasNext()) {
                ((androidx.core.os.e) it.next()).a();
            }
        }

        public void c() {
            if (this.f3520g) {
                return;
            }
            if (FragmentManager.F0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f3520g = true;
            for (Runnable runnable : this.f3517d) {
                runnable.run();
            }
        }

        public final void d(androidx.core.os.e eVar) {
            if (this.f3518e.remove(eVar) && this.f3518e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f3514a;
        }

        public final Fragment f() {
            return this.f3516c;
        }

        b g() {
            return this.f3515b;
        }

        final boolean h() {
            return this.f3519f;
        }

        final boolean i() {
            return this.f3520g;
        }

        public final void j(androidx.core.os.e eVar) {
            l();
            this.f3518e.add(eVar);
        }

        final void k(c cVar, b bVar) {
            int i10 = c.f3512b[bVar.ordinal()];
            if (i10 == 1) {
                if (this.f3514a == c.REMOVED) {
                    if (FragmentManager.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3516c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f3515b + " to ADDING.");
                    }
                    this.f3514a = c.VISIBLE;
                    this.f3515b = b.ADDING;
                }
            } else if (i10 != 2) {
                if (i10 == 3 && this.f3514a != c.REMOVED) {
                    if (FragmentManager.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3516c + " mFinalState = " + this.f3514a + " -> " + cVar + ". ");
                    }
                    this.f3514a = cVar;
                }
            } else {
                if (FragmentManager.F0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3516c + " mFinalState = " + this.f3514a + " -> REMOVED. mLifecycleImpact  = " + this.f3515b + " to REMOVING.");
                }
                this.f3514a = c.REMOVED;
                this.f3515b = b.REMOVING;
            }
        }

        void l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f3514a + "} {mLifecycleImpact = " + this.f3515b + "} {mFragment = " + this.f3516c + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(ViewGroup viewGroup) {
        this.f3502a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, o oVar) {
        synchronized (this.f3503b) {
            androidx.core.os.e eVar = new androidx.core.os.e();
            e h10 = h(oVar.k());
            if (h10 != null) {
                h10.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, oVar, eVar);
            this.f3503b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    private e h(Fragment fragment) {
        Iterator<e> it = this.f3503b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        Iterator<e> it = this.f3504c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.y0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w o(ViewGroup viewGroup, x xVar) {
        int i10 = g0.b.f25683b;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof w) {
            return (w) tag;
        }
        w a10 = xVar.a(viewGroup);
        viewGroup.setTag(i10, a10);
        return a10;
    }

    private void q() {
        Iterator<e> it = this.f3503b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.b(next.f().x1().getVisibility()), e.b.NONE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(e.c cVar, o oVar) {
        if (FragmentManager.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + oVar.k());
        }
        a(cVar, e.b.ADDING, oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(o oVar) {
        if (FragmentManager.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + oVar.k());
        }
        a(e.c.GONE, e.b.NONE, oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(o oVar) {
        if (FragmentManager.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + oVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(o oVar) {
        if (FragmentManager.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + oVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, oVar);
    }

    abstract void f(List<e> list, boolean z10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (this.f3506e) {
            return;
        }
        if (!a0.T(this.f3502a)) {
            j();
            this.f3505d = false;
            return;
        }
        synchronized (this.f3503b) {
            if (!this.f3503b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f3504c);
                this.f3504c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (FragmentManager.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.f3504c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.f3503b);
                this.f3503b.clear();
                this.f3504c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).l();
                }
                f(arrayList2, this.f3505d);
                this.f3505d = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        String str;
        String str2;
        boolean T = a0.T(this.f3502a);
        synchronized (this.f3503b) {
            q();
            Iterator<e> it = this.f3503b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            Iterator it2 = new ArrayList(this.f3504c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (FragmentManager.F0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (T) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f3502a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.f3503b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (FragmentManager.F0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (T) {
                        str = "";
                    } else {
                        str = "Container " + this.f3502a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        if (this.f3506e) {
            this.f3506e = false;
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e.b l(o oVar) {
        e h10 = h(oVar.k());
        e.b g10 = h10 != null ? h10.g() : null;
        e i10 = i(oVar.k());
        return (i10 == null || !(g10 == null || g10 == e.b.NONE)) ? g10 : i10.g();
    }

    public ViewGroup m() {
        return this.f3502a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        synchronized (this.f3503b) {
            q();
            this.f3506e = false;
            int size = this.f3503b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f3503b.get(size);
                e.c c10 = e.c.c(eVar.f().H);
                e.c e8 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e8 == cVar && c10 != cVar) {
                    this.f3506e = eVar.f().i0();
                    break;
                }
                size--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z10) {
        this.f3505d = z10;
    }
}
