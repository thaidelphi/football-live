package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentTransition.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f3425a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    static final t f3426b;

    /* renamed from: c  reason: collision with root package name */
    static final t f3427c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f3428a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f3429b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f3430c;

        a(g gVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f3428a = gVar;
            this.f3429b = fragment;
            this.f3430c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3428a.a(this.f3429b, this.f3430c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f3431a;

        b(ArrayList arrayList) {
            this.f3431a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.A(this.f3431a, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f3432a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f3433b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f3434c;

        c(g gVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f3432a = gVar;
            this.f3433b = fragment;
            this.f3434c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3432a.a(this.f3433b, this.f3434c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f3435a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f3436b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f3437c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Fragment f3438d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f3439e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f3440f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f3441g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Object f3442h;

        d(Object obj, t tVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f3435a = obj;
            this.f3436b = tVar;
            this.f3437c = view;
            this.f3438d = fragment;
            this.f3439e = arrayList;
            this.f3440f = arrayList2;
            this.f3441g = arrayList3;
            this.f3442h = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f3435a;
            if (obj != null) {
                this.f3436b.p(obj, this.f3437c);
                this.f3440f.addAll(r.k(this.f3436b, this.f3435a, this.f3438d, this.f3439e, this.f3437c));
            }
            if (this.f3441g != null) {
                if (this.f3442h != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f3437c);
                    this.f3436b.q(this.f3442h, this.f3441g, arrayList);
                }
                this.f3441g.clear();
                this.f3441g.add(this.f3437c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f3443a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f3444b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f3445c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f3446d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f3447e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t f3448f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Rect f3449g;

        e(Fragment fragment, Fragment fragment2, boolean z10, androidx.collection.a aVar, View view, t tVar, Rect rect) {
            this.f3443a = fragment;
            this.f3444b = fragment2;
            this.f3445c = z10;
            this.f3446d = aVar;
            this.f3447e = view;
            this.f3448f = tVar;
            this.f3449g = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.f(this.f3443a, this.f3444b, this.f3445c, this.f3446d, false);
            View view = this.f3447e;
            if (view != null) {
                this.f3448f.k(view, this.f3449g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f3450a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f3451b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f3452c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f3453d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f3454e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f3455f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Fragment f3456g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f3457h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f3458i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ArrayList f3459j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Object f3460k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Rect f3461l;

        f(t tVar, androidx.collection.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z10, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f3450a = tVar;
            this.f3451b = aVar;
            this.f3452c = obj;
            this.f3453d = hVar;
            this.f3454e = arrayList;
            this.f3455f = view;
            this.f3456g = fragment;
            this.f3457h = fragment2;
            this.f3458i = z10;
            this.f3459j = arrayList2;
            this.f3460k = obj2;
            this.f3461l = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.collection.a<String, View> h10 = r.h(this.f3450a, this.f3451b, this.f3452c, this.f3453d);
            if (h10 != null) {
                this.f3454e.addAll(h10.values());
                this.f3454e.add(this.f3455f);
            }
            r.f(this.f3456g, this.f3457h, this.f3458i, h10, false);
            Object obj = this.f3452c;
            if (obj != null) {
                this.f3450a.A(obj, this.f3459j, this.f3454e);
                View s10 = r.s(h10, this.f3453d, this.f3460k, this.f3458i);
                if (s10 != null) {
                    this.f3450a.k(s10, this.f3461l);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface g {
        void a(Fragment fragment, androidx.core.os.e eVar);

        void b(Fragment fragment, androidx.core.os.e eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f3462a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3463b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.fragment.app.a f3464c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f3465d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3466e;

        /* renamed from: f  reason: collision with root package name */
        public androidx.fragment.app.a f3467f;

        h() {
        }
    }

    static {
        f3426b = Build.VERSION.SDK_INT >= 21 ? new s() : null;
        f3427c = w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void A(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void B(Context context, androidx.fragment.app.e eVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, boolean z10, g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = arrayList.get(i12);
            if (arrayList2.get(i12).booleanValue()) {
                e(aVar, sparseArray, z10);
            } else {
                c(aVar, sparseArray, z10);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = sparseArray.keyAt(i13);
                androidx.collection.a<String, String> d10 = d(keyAt, arrayList, arrayList2, i10, i11);
                h hVar = (h) sparseArray.valueAt(i13);
                if (eVar.d() && (viewGroup = (ViewGroup) eVar.c(keyAt)) != null) {
                    if (z10) {
                        o(viewGroup, hVar, view, d10, gVar);
                    } else {
                        n(viewGroup, hVar, view, d10, gVar);
                    }
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, androidx.collection.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m7 = aVar.m(size);
            if (collection.contains(a0.M(m7))) {
                arrayList.add(m7);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0039, code lost:
        if (r0.f3153l != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x006f, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x008b, code lost:
        if (r0.f3167z == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008d, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(androidx.fragment.app.a r8, androidx.fragment.app.q.a r9, android.util.SparseArray<androidx.fragment.app.r.h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r.b(androidx.fragment.app.a, androidx.fragment.app.q$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z10) {
        int size = aVar.f3400c.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(aVar, aVar.f3400c.get(i10), sparseArray, false, z10);
        }
    }

    private static androidx.collection.a<String, String> d(int i10, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i11, int i12) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        androidx.collection.a<String, String> aVar = new androidx.collection.a<>();
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i13);
            if (aVar2.x(i10)) {
                boolean booleanValue = arrayList2.get(i13).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f3413p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f3413p;
                        arrayList4 = aVar2.f3414q;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f3413p;
                        arrayList3 = aVar2.f3414q;
                        arrayList4 = arrayList6;
                    }
                    for (int i14 = 0; i14 < size; i14++) {
                        String str = arrayList4.get(i14);
                        String str2 = arrayList3.get(i14);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z10) {
        if (aVar.f3280t.o0().d()) {
            for (int size = aVar.f3400c.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f3400c.get(size), sparseArray, true, z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Fragment fragment, Fragment fragment2, boolean z10, androidx.collection.a<String, View> aVar, boolean z11) {
        if (z10) {
            fragment2.s();
        } else {
            fragment.s();
        }
    }

    private static boolean g(t tVar, List<Object> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!tVar.e(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static androidx.collection.a<String, View> h(t tVar, androidx.collection.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f3462a;
        View W = fragment.W();
        if (!aVar.isEmpty() && obj != null && W != null) {
            androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
            tVar.j(aVar2, W);
            androidx.fragment.app.a aVar3 = hVar.f3464c;
            if (hVar.f3463b) {
                fragment.v();
                arrayList = aVar3.f3413p;
            } else {
                fragment.s();
                arrayList = aVar3.f3414q;
            }
            if (arrayList != null) {
                aVar2.o(arrayList);
                aVar2.o(aVar.values());
            }
            x(aVar, aVar2);
            return aVar2;
        }
        aVar.clear();
        return null;
    }

    private static androidx.collection.a<String, View> i(t tVar, androidx.collection.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        if (!aVar.isEmpty() && obj != null) {
            Fragment fragment = hVar.f3465d;
            androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
            tVar.j(aVar2, fragment.x1());
            androidx.fragment.app.a aVar3 = hVar.f3467f;
            if (hVar.f3466e) {
                fragment.s();
                arrayList = aVar3.f3414q;
            } else {
                fragment.v();
                arrayList = aVar3.f3413p;
            }
            if (arrayList != null) {
                aVar2.o(arrayList);
            }
            aVar.o(aVar2.keySet());
            return aVar2;
        }
        aVar.clear();
        return null;
    }

    private static t j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object u10 = fragment.u();
            if (u10 != null) {
                arrayList.add(u10);
            }
            Object M = fragment.M();
            if (M != null) {
                arrayList.add(M);
            }
            Object O = fragment.O();
            if (O != null) {
                arrayList.add(O);
            }
        }
        if (fragment2 != null) {
            Object r10 = fragment2.r();
            if (r10 != null) {
                arrayList.add(r10);
            }
            Object J = fragment2.J();
            if (J != null) {
                arrayList.add(J);
            }
            Object N = fragment2.N();
            if (N != null) {
                arrayList.add(N);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        t tVar = f3426b;
        if (tVar == null || !g(tVar, arrayList)) {
            t tVar2 = f3427c;
            if (tVar2 == null || !g(tVar2, arrayList)) {
                if (tVar == null && tVar2 == null) {
                    return null;
                }
                throw new IllegalArgumentException("Invalid Transition types");
            }
            return tVar2;
        }
        return tVar;
    }

    static ArrayList<View> k(t tVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View W = fragment.W();
            if (W != null) {
                tVar.f(arrayList2, W);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            tVar.b(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    private static Object l(t tVar, ViewGroup viewGroup, View view, androidx.collection.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object t10;
        androidx.collection.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.f3462a;
        Fragment fragment2 = hVar.f3465d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f3463b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            t10 = null;
        } else {
            t10 = t(tVar, fragment, fragment2, z10);
            aVar2 = aVar;
        }
        androidx.collection.a<String, View> i10 = i(tVar, aVar2, t10, hVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(i10.values());
            obj3 = t10;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z10, i10, true);
        if (obj3 != null) {
            rect = new Rect();
            tVar.z(obj3, view, arrayList);
            z(tVar, obj3, obj2, i10, hVar.f3466e, hVar.f3467f);
            if (obj != null) {
                tVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        androidx.core.view.x.a(viewGroup, new f(tVar, aVar, obj3, hVar, arrayList2, view, fragment, fragment2, z10, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(t tVar, ViewGroup viewGroup, View view, androidx.collection.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f3462a;
        Fragment fragment2 = hVar.f3465d;
        if (fragment != null) {
            fragment.x1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f3463b;
        Object t10 = aVar.isEmpty() ? null : t(tVar, fragment, fragment2, z10);
        androidx.collection.a<String, View> i10 = i(tVar, aVar, t10, hVar);
        androidx.collection.a<String, View> h10 = h(tVar, aVar, t10, hVar);
        if (aVar.isEmpty()) {
            if (i10 != null) {
                i10.clear();
            }
            if (h10 != null) {
                h10.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, i10, aVar.keySet());
            a(arrayList2, h10, aVar.values());
            obj3 = t10;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z10, i10, true);
        if (obj3 != null) {
            arrayList2.add(view);
            tVar.z(obj3, view, arrayList);
            z(tVar, obj3, obj2, i10, hVar.f3466e, hVar.f3467f);
            Rect rect2 = new Rect();
            View s10 = s(h10, hVar, obj, z10);
            if (s10 != null) {
                tVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = s10;
        } else {
            view2 = null;
            rect = null;
        }
        androidx.core.view.x.a(viewGroup, new e(fragment, fragment2, z10, h10, view2, tVar, rect));
        return obj3;
    }

    private static void n(ViewGroup viewGroup, h hVar, View view, androidx.collection.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f3462a;
        Fragment fragment2 = hVar.f3465d;
        t j10 = j(fragment2, fragment);
        if (j10 == null) {
            return;
        }
        boolean z10 = hVar.f3463b;
        boolean z11 = hVar.f3466e;
        Object q10 = q(j10, fragment, z10);
        Object r10 = r(j10, fragment2, z11);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object l10 = l(j10, viewGroup, view, aVar, hVar, arrayList, arrayList2, q10, r10);
        if (q10 == null && l10 == null) {
            obj = r10;
            if (obj == null) {
                return;
            }
        } else {
            obj = r10;
        }
        ArrayList<View> k10 = k(j10, obj, fragment2, arrayList, view);
        Object obj2 = (k10 == null || k10.isEmpty()) ? null : null;
        j10.a(q10, view);
        Object u10 = u(j10, q10, obj2, l10, fragment, hVar.f3463b);
        if (fragment2 != null && k10 != null && (k10.size() > 0 || arrayList.size() > 0)) {
            androidx.core.os.e eVar = new androidx.core.os.e();
            gVar.b(fragment2, eVar);
            j10.w(fragment2, u10, eVar, new c(gVar, fragment2, eVar));
        }
        if (u10 != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            j10.t(u10, q10, arrayList3, obj2, k10, l10, arrayList2);
            y(j10, viewGroup, fragment, view, arrayList2, q10, arrayList3, obj2, k10);
            j10.x(viewGroup, arrayList2, aVar);
            j10.c(viewGroup, u10);
            j10.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(ViewGroup viewGroup, h hVar, View view, androidx.collection.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f3462a;
        Fragment fragment2 = hVar.f3465d;
        t j10 = j(fragment2, fragment);
        if (j10 == null) {
            return;
        }
        boolean z10 = hVar.f3463b;
        boolean z11 = hVar.f3466e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object q10 = q(j10, fragment, z10);
        Object r10 = r(j10, fragment2, z11);
        Object m7 = m(j10, viewGroup, view, aVar, hVar, arrayList2, arrayList, q10, r10);
        if (q10 == null && m7 == null) {
            obj = r10;
            if (obj == null) {
                return;
            }
        } else {
            obj = r10;
        }
        ArrayList<View> k10 = k(j10, obj, fragment2, arrayList2, view);
        ArrayList<View> k11 = k(j10, q10, fragment, arrayList, view);
        A(k11, 4);
        Object u10 = u(j10, q10, obj, m7, fragment, z10);
        if (fragment2 != null && k10 != null && (k10.size() > 0 || arrayList2.size() > 0)) {
            androidx.core.os.e eVar = new androidx.core.os.e();
            gVar.b(fragment2, eVar);
            j10.w(fragment2, u10, eVar, new a(gVar, fragment2, eVar));
        }
        if (u10 != null) {
            v(j10, obj, fragment2, k10);
            ArrayList<String> o10 = j10.o(arrayList);
            j10.t(u10, q10, k11, obj, k10, m7, arrayList);
            j10.c(viewGroup, u10);
            j10.y(viewGroup, arrayList2, arrayList, o10, aVar);
            A(k11, 0);
            j10.A(m7, arrayList2, arrayList);
        }
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i10) {
        if (hVar == null) {
            h hVar2 = new h();
            sparseArray.put(i10, hVar2);
            return hVar2;
        }
        return hVar;
    }

    private static Object q(t tVar, Fragment fragment, boolean z10) {
        Object r10;
        if (fragment == null) {
            return null;
        }
        if (z10) {
            r10 = fragment.J();
        } else {
            r10 = fragment.r();
        }
        return tVar.g(r10);
    }

    private static Object r(t tVar, Fragment fragment, boolean z10) {
        Object u10;
        if (fragment == null) {
            return null;
        }
        if (z10) {
            u10 = fragment.M();
        } else {
            u10 = fragment.u();
        }
        return tVar.g(u10);
    }

    static View s(androidx.collection.a<String, View> aVar, h hVar, Object obj, boolean z10) {
        ArrayList<String> arrayList;
        String str;
        androidx.fragment.app.a aVar2 = hVar.f3464c;
        if (obj == null || aVar == null || (arrayList = aVar2.f3413p) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z10) {
            str = aVar2.f3413p.get(0);
        } else {
            str = aVar2.f3414q.get(0);
        }
        return aVar.get(str);
    }

    private static Object t(t tVar, Fragment fragment, Fragment fragment2, boolean z10) {
        Object N;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z10) {
            N = fragment2.O();
        } else {
            N = fragment.N();
        }
        return tVar.B(tVar.g(N));
    }

    private static Object u(t tVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z10) {
        boolean z11;
        if (obj == null || obj2 == null || fragment == null) {
            z11 = true;
        } else if (z10) {
            z11 = fragment.k();
        } else {
            z11 = fragment.j();
        }
        if (z11) {
            return tVar.n(obj2, obj, obj3);
        }
        return tVar.m(obj2, obj, obj3);
    }

    private static void v(t tVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f3153l && fragment.f3167z && fragment.N) {
            fragment.H1(true);
            tVar.r(obj, fragment.W(), arrayList);
            androidx.core.view.x.a(fragment.G, new b(arrayList));
        }
    }

    private static t w() {
        try {
            return (t) a1.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void x(androidx.collection.a<String, String> aVar, androidx.collection.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    private static void y(t tVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        androidx.core.view.x.a(viewGroup, new d(obj, tVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(t tVar, Object obj, Object obj2, androidx.collection.a<String, View> aVar, boolean z10, androidx.fragment.app.a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.f3413p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (z10) {
            str = aVar2.f3414q.get(0);
        } else {
            str = aVar2.f3413p.get(0);
        }
        View view = aVar.get(str);
        tVar.v(obj, view);
        if (obj2 != null) {
            tVar.v(obj2, view);
        }
    }
}
