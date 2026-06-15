package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.e;
import androidx.core.view.a0;
import androidx.core.view.d0;
import androidx.fragment.app.d;
import androidx.fragment.app.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class b extends w {

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3283a;

        static {
            int[] iArr = new int[w.e.c.values().length];
            f3283a = iArr;
            try {
                iArr[w.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3283a[w.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3283a[w.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3283a[w.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class RunnableC0057b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f3284a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w.e f3285b;

        RunnableC0057b(List list, w.e eVar) {
            this.f3284a = list;
            this.f3285b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3284a.contains(this.f3285b)) {
                this.f3284a.remove(this.f3285b);
                b.this.s(this.f3285b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3287a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3288b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f3289c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ w.e f3290d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f3291e;

        c(ViewGroup viewGroup, View view, boolean z10, w.e eVar, k kVar) {
            this.f3287a = viewGroup;
            this.f3288b = view;
            this.f3289c = z10;
            this.f3290d = eVar;
            this.f3291e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3287a.endViewTransition(this.f3288b);
            if (this.f3289c) {
                this.f3290d.e().a(this.f3288b);
            }
            this.f3291e.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Animator f3293a;

        d(Animator animator) {
            this.f3293a = animator;
        }

        @Override // androidx.core.os.e.b
        public void a() {
            this.f3293a.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3296b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f3297c;

        /* compiled from: DefaultSpecialEffectsController.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f3295a.endViewTransition(eVar.f3296b);
                e.this.f3297c.a();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f3295a = viewGroup;
            this.f3296b = view;
            this.f3297c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f3295a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f3300a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3301b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f3302c;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f3300a = view;
            this.f3301b = viewGroup;
            this.f3302c = kVar;
        }

        @Override // androidx.core.os.e.b
        public void a() {
            this.f3300a.clearAnimation();
            this.f3301b.endViewTransition(this.f3300a);
            this.f3302c.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w.e f3304a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w.e f3305b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f3306c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f3307d;

        g(w.e eVar, w.e eVar2, boolean z10, androidx.collection.a aVar) {
            this.f3304a = eVar;
            this.f3305b = eVar2;
            this.f3306c = z10;
            this.f3307d = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.f(this.f3304a.f(), this.f3305b.f(), this.f3306c, this.f3307d, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f3309a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3310b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f3311c;

        h(t tVar, View view, Rect rect) {
            this.f3309a = tVar;
            this.f3310b = view;
            this.f3311c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3309a.k(this.f3310b, this.f3311c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f3313a;

        i(ArrayList arrayList) {
            this.f3313a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.A(this.f3313a, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f3315a;

        j(m mVar) {
            this.f3315a = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3315a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class k extends l {

        /* renamed from: c  reason: collision with root package name */
        private boolean f3317c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3318d;

        /* renamed from: e  reason: collision with root package name */
        private d.C0059d f3319e;

        k(w.e eVar, androidx.core.os.e eVar2, boolean z10) {
            super(eVar, eVar2);
            this.f3318d = false;
            this.f3317c = z10;
        }

        d.C0059d e(Context context) {
            if (this.f3318d) {
                return this.f3319e;
            }
            d.C0059d c10 = androidx.fragment.app.d.c(context, b().f(), b().e() == w.e.c.VISIBLE, this.f3317c);
            this.f3319e = c10;
            this.f3318d = true;
            return c10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        private final w.e f3320a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.os.e f3321b;

        l(w.e eVar, androidx.core.os.e eVar2) {
            this.f3320a = eVar;
            this.f3321b = eVar2;
        }

        void a() {
            this.f3320a.d(this.f3321b);
        }

        w.e b() {
            return this.f3320a;
        }

        androidx.core.os.e c() {
            return this.f3321b;
        }

        boolean d() {
            w.e.c cVar;
            w.e.c c10 = w.e.c.c(this.f3320a.f().H);
            w.e.c e8 = this.f3320a.e();
            return c10 == e8 || !(c10 == (cVar = w.e.c.VISIBLE) || e8 == cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class m extends l {

        /* renamed from: c  reason: collision with root package name */
        private final Object f3322c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f3323d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f3324e;

        m(w.e eVar, androidx.core.os.e eVar2, boolean z10, boolean z11) {
            super(eVar, eVar2);
            Object u10;
            Object r10;
            boolean j10;
            if (eVar.e() == w.e.c.VISIBLE) {
                if (z10) {
                    r10 = eVar.f().J();
                } else {
                    r10 = eVar.f().r();
                }
                this.f3322c = r10;
                if (z10) {
                    j10 = eVar.f().k();
                } else {
                    j10 = eVar.f().j();
                }
                this.f3323d = j10;
            } else {
                if (z10) {
                    u10 = eVar.f().M();
                } else {
                    u10 = eVar.f().u();
                }
                this.f3322c = u10;
                this.f3323d = true;
            }
            if (!z11) {
                this.f3324e = null;
            } else if (z10) {
                this.f3324e = eVar.f().O();
            } else {
                this.f3324e = eVar.f().N();
            }
        }

        private t f(Object obj) {
            if (obj == null) {
                return null;
            }
            t tVar = r.f3426b;
            if (tVar == null || !tVar.e(obj)) {
                t tVar2 = r.f3427c;
                if (tVar2 == null || !tVar2.e(obj)) {
                    throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
                }
                return tVar2;
            }
            return tVar;
        }

        t e() {
            t f10 = f(this.f3322c);
            t f11 = f(this.f3324e);
            if (f10 == null || f11 == null || f10 == f11) {
                return f10 != null ? f10 : f11;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f3322c + " which uses a different Transition  type than its shared element transition " + this.f3324e);
        }

        public Object g() {
            return this.f3324e;
        }

        Object h() {
            return this.f3322c;
        }

        public boolean i() {
            return this.f3324e != null;
        }

        boolean j() {
            return this.f3323d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> list, List<w.e> list2, boolean z10, Map<w.e, Boolean> map) {
        ViewGroup m7 = m();
        Context context = m7.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (k kVar : list) {
            if (kVar.d()) {
                kVar.a();
            } else {
                d.C0059d e8 = kVar.e(context);
                if (e8 == null) {
                    kVar.a();
                } else {
                    Animator animator = e8.f3359b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        w.e b10 = kVar.b();
                        Fragment f10 = b10.f();
                        if (Boolean.TRUE.equals(map.get(b10))) {
                            if (FragmentManager.F0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + f10 + " as this Fragment was involved in a Transition.");
                            }
                            kVar.a();
                        } else {
                            boolean z12 = b10.e() == w.e.c.GONE;
                            if (z12) {
                                list2.remove(b10);
                            }
                            View view = f10.H;
                            m7.startViewTransition(view);
                            animator.addListener(new c(m7, view, z12, b10, kVar));
                            animator.setTarget(view);
                            animator.start();
                            kVar.c().c(new d(animator));
                            z11 = true;
                        }
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            w.e b11 = kVar2.b();
            Fragment f11 = b11.f();
            if (z10) {
                if (FragmentManager.F0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f11 + " as Animations cannot run alongside Transitions.");
                }
                kVar2.a();
            } else if (z11) {
                if (FragmentManager.F0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f11 + " as Animations cannot run alongside Animators.");
                }
                kVar2.a();
            } else {
                View view2 = f11.H;
                Animation animation = (Animation) androidx.core.util.i.f(((d.C0059d) androidx.core.util.i.f(kVar2.e(context))).f3358a);
                if (b11.e() != w.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.a();
                } else {
                    m7.startViewTransition(view2);
                    d.e eVar = new d.e(animation, m7, view2);
                    eVar.setAnimationListener(new e(m7, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.c().c(new f(view2, m7, kVar2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Map<w.e, Boolean> x(List<m> list, List<w.e> list2, boolean z10, w.e eVar, w.e eVar2) {
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        w.e eVar3;
        w.e eVar4;
        View view2;
        Object n10;
        androidx.collection.a aVar;
        ArrayList<View> arrayList3;
        w.e eVar5;
        ArrayList<View> arrayList4;
        Rect rect;
        View view3;
        t tVar;
        w.e eVar6;
        View view4;
        boolean z11 = z10;
        w.e eVar7 = eVar;
        w.e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        t tVar2 = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                t e8 = mVar.e();
                if (tVar2 == null) {
                    tVar2 = e8;
                } else if (e8 != null && tVar2 != e8) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (tVar2 == null) {
            for (m mVar2 : list) {
                hashMap.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return hashMap;
        }
        View view5 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        androidx.collection.a aVar2 = new androidx.collection.a();
        Object obj3 = null;
        View view6 = null;
        boolean z12 = false;
        for (m mVar3 : list) {
            if (!mVar3.i() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                arrayList3 = arrayList6;
                eVar5 = eVar7;
                arrayList4 = arrayList5;
                rect = rect2;
                view3 = view5;
                tVar = tVar2;
                eVar6 = eVar8;
                view6 = view6;
            } else {
                Object B = tVar2.B(tVar2.g(mVar3.g()));
                ArrayList<String> P = eVar2.f().P();
                ArrayList<String> P2 = eVar.f().P();
                ArrayList<String> Q = eVar.f().Q();
                View view7 = view6;
                int i10 = 0;
                while (i10 < Q.size()) {
                    int indexOf = P.indexOf(Q.get(i10));
                    ArrayList<String> arrayList7 = Q;
                    if (indexOf != -1) {
                        P.set(indexOf, P2.get(i10));
                    }
                    i10++;
                    Q = arrayList7;
                }
                ArrayList<String> Q2 = eVar2.f().Q();
                if (!z11) {
                    eVar.f().v();
                    eVar2.f().s();
                } else {
                    eVar.f().s();
                    eVar2.f().v();
                }
                int i11 = 0;
                for (int size = P.size(); i11 < size; size = size) {
                    aVar2.put(P.get(i11), Q2.get(i11));
                    i11++;
                }
                androidx.collection.a<String, View> aVar3 = new androidx.collection.a<>();
                u(aVar3, eVar.f().H);
                aVar3.o(P);
                aVar2.o(aVar3.keySet());
                androidx.collection.a<String, View> aVar4 = new androidx.collection.a<>();
                u(aVar4, eVar2.f().H);
                aVar4.o(Q2);
                aVar4.o(aVar2.values());
                r.x(aVar2, aVar4);
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList3 = arrayList6;
                    eVar5 = eVar7;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    tVar = tVar2;
                    view6 = view7;
                    obj3 = null;
                    eVar6 = eVar8;
                } else {
                    r.f(eVar2.f(), eVar.f(), z11, aVar3, true);
                    aVar = aVar2;
                    ArrayList<View> arrayList8 = arrayList6;
                    androidx.core.view.x.a(m(), new g(eVar2, eVar, z10, aVar4));
                    arrayList5.addAll(aVar3.values());
                    if (P.isEmpty()) {
                        view6 = view7;
                    } else {
                        View view8 = aVar3.get(P.get(0));
                        tVar2.v(B, view8);
                        view6 = view8;
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(aVar4.values());
                    if (!Q2.isEmpty() && (view4 = aVar4.get(Q2.get(0))) != null) {
                        androidx.core.view.x.a(m(), new h(tVar2, view4, rect2));
                        z12 = true;
                    }
                    tVar2.z(B, view5, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    tVar = tVar2;
                    tVar2.t(B, null, null, null, null, B, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    hashMap.put(eVar5, bool);
                    eVar6 = eVar2;
                    hashMap.put(eVar6, bool);
                    obj3 = B;
                }
            }
            eVar7 = eVar5;
            arrayList5 = arrayList4;
            rect2 = rect;
            view5 = view3;
            eVar8 = eVar6;
            aVar2 = aVar;
            z11 = z10;
            arrayList6 = arrayList3;
            tVar2 = tVar;
        }
        View view9 = view6;
        androidx.collection.a aVar5 = aVar2;
        Collection<?> collection = arrayList6;
        w.e eVar9 = eVar7;
        Collection<?> collection2 = arrayList5;
        Rect rect3 = rect2;
        View view10 = view5;
        t tVar3 = tVar2;
        boolean z13 = false;
        w.e eVar10 = eVar8;
        ArrayList arrayList9 = new ArrayList();
        Object obj4 = null;
        Object obj5 = null;
        for (m mVar4 : list) {
            if (mVar4.d()) {
                hashMap.put(mVar4.b(), Boolean.FALSE);
                mVar4.a();
            } else {
                Object g10 = tVar3.g(mVar4.h());
                w.e b10 = mVar4.b();
                boolean z14 = (obj3 == null || !(b10 == eVar9 || b10 == eVar10)) ? z13 : true;
                if (g10 == null) {
                    if (!z14) {
                        hashMap.put(b10, Boolean.FALSE);
                        mVar4.a();
                    }
                    arrayList2 = collection;
                    arrayList = collection2;
                    view = view10;
                    n10 = obj4;
                    eVar3 = eVar10;
                    view2 = view9;
                } else {
                    ArrayList<View> arrayList10 = new ArrayList<>();
                    Object obj6 = obj4;
                    t(arrayList10, b10.f().H);
                    if (z14) {
                        if (b10 == eVar9) {
                            arrayList10.removeAll(collection2);
                        } else {
                            arrayList10.removeAll(collection);
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        tVar3.a(g10, view10);
                        arrayList2 = collection;
                        arrayList = collection2;
                        view = view10;
                        eVar4 = b10;
                        obj2 = obj5;
                        eVar3 = eVar10;
                        obj = obj6;
                    } else {
                        tVar3.b(g10, arrayList10);
                        view = view10;
                        obj = obj6;
                        arrayList = collection2;
                        obj2 = obj5;
                        arrayList2 = collection;
                        eVar3 = eVar10;
                        tVar3.t(g10, g10, arrayList10, null, null, null, null);
                        if (b10.e() == w.e.c.GONE) {
                            eVar4 = b10;
                            list2.remove(eVar4);
                            ArrayList<View> arrayList11 = new ArrayList<>(arrayList10);
                            arrayList11.remove(eVar4.f().H);
                            tVar3.r(g10, eVar4.f().H, arrayList11);
                            androidx.core.view.x.a(m(), new i(arrayList10));
                        } else {
                            eVar4 = b10;
                        }
                    }
                    if (eVar4.e() == w.e.c.VISIBLE) {
                        arrayList9.addAll(arrayList10);
                        if (z12) {
                            tVar3.u(g10, rect3);
                        }
                        view2 = view9;
                    } else {
                        view2 = view9;
                        tVar3.v(g10, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (mVar4.j()) {
                        obj5 = tVar3.n(obj2, g10, null);
                        n10 = obj;
                    } else {
                        n10 = tVar3.n(obj, g10, null);
                        obj5 = obj2;
                    }
                }
                eVar10 = eVar3;
                obj4 = n10;
                view9 = view2;
                view10 = view;
                collection2 = arrayList;
                collection = arrayList2;
                z13 = false;
            }
        }
        ArrayList<View> arrayList12 = collection;
        ArrayList<View> arrayList13 = collection2;
        w.e eVar11 = eVar10;
        Object m7 = tVar3.m(obj5, obj4, obj3);
        for (m mVar5 : list) {
            if (!mVar5.d()) {
                Object h10 = mVar5.h();
                w.e b11 = mVar5.b();
                boolean z15 = obj3 != null && (b11 == eVar9 || b11 == eVar11);
                if (h10 != null || z15) {
                    if (!a0.U(m())) {
                        if (FragmentManager.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + b11);
                        }
                        mVar5.a();
                    } else {
                        tVar3.w(mVar5.b().f(), m7, mVar5.c(), new j(mVar5));
                    }
                }
            }
        }
        if (a0.U(m())) {
            r.A(arrayList9, 4);
            ArrayList<String> o10 = tVar3.o(arrayList12);
            tVar3.c(m(), m7);
            tVar3.y(m(), arrayList13, arrayList12, o10, aVar5);
            r.A(arrayList9, 0);
            tVar3.A(obj3, arrayList13, arrayList12);
            return hashMap;
        }
        return hashMap;
    }

    @Override // androidx.fragment.app.w
    void f(List<w.e> list, boolean z10) {
        w.e eVar = null;
        w.e eVar2 = null;
        for (w.e eVar3 : list) {
            w.e.c c10 = w.e.c.c(eVar3.f().H);
            int i10 = a.f3283a[eVar3.e().ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                if (i10 == 4 && c10 != w.e.c.VISIBLE) {
                    eVar2 = eVar3;
                }
            } else if (c10 == w.e.c.VISIBLE && eVar == null) {
                eVar = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<w.e> arrayList3 = new ArrayList(list);
        for (w.e eVar4 : list) {
            androidx.core.os.e eVar5 = new androidx.core.os.e();
            eVar4.j(eVar5);
            arrayList.add(new k(eVar4, eVar5, z10));
            androidx.core.os.e eVar6 = new androidx.core.os.e();
            eVar4.j(eVar6);
            boolean z11 = false;
            if (z10) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, eVar6, z10, z11));
                    eVar4.a(new RunnableC0057b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, eVar6, z10, z11));
                eVar4.a(new RunnableC0057b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, eVar6, z10, z11));
                    eVar4.a(new RunnableC0057b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, eVar6, z10, z11));
                eVar4.a(new RunnableC0057b(arrayList3, eVar4));
            }
        }
        Map<w.e, Boolean> x10 = x(arrayList2, arrayList3, z10, eVar, eVar2);
        w(arrayList, arrayList3, x10.containsValue(Boolean.TRUE), x10);
        for (w.e eVar7 : arrayList3) {
            s(eVar7);
        }
        arrayList3.clear();
    }

    void s(w.e eVar) {
        eVar.e().a(eVar.f().H);
    }

    void t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (d0.a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    t(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    void u(Map<String, View> map, View view) {
        String M = a0.M(view);
        if (M != null) {
            map.put(M, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(androidx.collection.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(a0.M(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
