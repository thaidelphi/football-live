package a1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: Transition.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class m implements Cloneable {
    private static final int[] H = {2, 1, 3, 4};
    private static final g I = new a();
    private static ThreadLocal<androidx.collection.a<Animator, d>> J = new ThreadLocal<>();
    p D;
    private e E;
    private androidx.collection.a<String, String> F;

    /* renamed from: t  reason: collision with root package name */
    private ArrayList<s> f153t;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<s> f154u;

    /* renamed from: a  reason: collision with root package name */
    private String f134a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    private long f135b = -1;

    /* renamed from: c  reason: collision with root package name */
    long f136c = -1;

    /* renamed from: d  reason: collision with root package name */
    private TimeInterpolator f137d = null;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<Integer> f138e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    ArrayList<View> f139f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<String> f140g = null;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<Class<?>> f141h = null;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<Integer> f142i = null;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<View> f143j = null;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<Class<?>> f144k = null;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<String> f145l = null;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<Integer> f146m = null;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList<View> f147n = null;

    /* renamed from: o  reason: collision with root package name */
    private ArrayList<Class<?>> f148o = null;

    /* renamed from: p  reason: collision with root package name */
    private t f149p = new t();

    /* renamed from: q  reason: collision with root package name */
    private t f150q = new t();

    /* renamed from: r  reason: collision with root package name */
    q f151r = null;

    /* renamed from: s  reason: collision with root package name */
    private int[] f152s = H;

    /* renamed from: v  reason: collision with root package name */
    private ViewGroup f155v = null;

    /* renamed from: w  reason: collision with root package name */
    boolean f156w = false;

    /* renamed from: x  reason: collision with root package name */
    ArrayList<Animator> f157x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    private int f158y = 0;

    /* renamed from: z  reason: collision with root package name */
    private boolean f159z = false;
    private boolean A = false;
    private ArrayList<f> B = null;
    private ArrayList<Animator> C = new ArrayList<>();
    private g G = I;

    /* compiled from: Transition.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a extends g {
        a() {
        }

        @Override // a1.g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f160a;

        b(androidx.collection.a aVar) {
            this.f160a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f160a.remove(animator);
            m.this.f157x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m.this.f157x.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m.this.r();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Transition.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        View f163a;

        /* renamed from: b  reason: collision with root package name */
        String f164b;

        /* renamed from: c  reason: collision with root package name */
        s f165c;

        /* renamed from: d  reason: collision with root package name */
        m0 f166d;

        /* renamed from: e  reason: collision with root package name */
        m f167e;

        d(View view, String str, m mVar, m0 m0Var, s sVar) {
            this.f163a = view;
            this.f164b = str;
            this.f165c = sVar;
            this.f166d = m0Var;
            this.f167e = mVar;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class e {
    }

    /* compiled from: Transition.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface f {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);

        void e(m mVar);
    }

    private static boolean J(s sVar, s sVar2, String str) {
        Object obj = sVar.f181a.get(str);
        Object obj2 = sVar2.f181a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void K(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View valueAt = sparseArray.valueAt(i10);
            if (valueAt != null && I(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && I(view)) {
                s sVar = aVar.get(valueAt);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f153t.add(sVar);
                    this.f154u.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void L(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2) {
        s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View i10 = aVar.i(size);
            if (i10 != null && I(i10) && (remove = aVar2.remove(i10)) != null && I(remove.f182b)) {
                this.f153t.add(aVar.k(size));
                this.f154u.add(remove);
            }
        }
    }

    private void M(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, androidx.collection.e<View> eVar, androidx.collection.e<View> eVar2) {
        View g10;
        int n10 = eVar.n();
        for (int i10 = 0; i10 < n10; i10++) {
            View o10 = eVar.o(i10);
            if (o10 != null && I(o10) && (g10 = eVar2.g(eVar.j(i10))) != null && I(g10)) {
                s sVar = aVar.get(o10);
                s sVar2 = aVar2.get(g10);
                if (sVar != null && sVar2 != null) {
                    this.f153t.add(sVar);
                    this.f154u.add(sVar2);
                    aVar.remove(o10);
                    aVar2.remove(g10);
                }
            }
        }
    }

    private void N(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, androidx.collection.a<String, View> aVar3, androidx.collection.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View m7 = aVar3.m(i10);
            if (m7 != null && I(m7) && (view = aVar4.get(aVar3.i(i10))) != null && I(view)) {
                s sVar = aVar.get(m7);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f153t.add(sVar);
                    this.f154u.add(sVar2);
                    aVar.remove(m7);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void O(t tVar, t tVar2) {
        androidx.collection.a<View, s> aVar = new androidx.collection.a<>(tVar.f184a);
        androidx.collection.a<View, s> aVar2 = new androidx.collection.a<>(tVar2.f184a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f152s;
            if (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 == 1) {
                    L(aVar, aVar2);
                } else if (i11 == 2) {
                    N(aVar, aVar2, tVar.f187d, tVar2.f187d);
                } else if (i11 == 3) {
                    K(aVar, aVar2, tVar.f185b, tVar2.f185b);
                } else if (i11 == 4) {
                    M(aVar, aVar2, tVar.f186c, tVar2.f186c);
                }
                i10++;
            } else {
                e(aVar, aVar2);
                return;
            }
        }
    }

    private void U(Animator animator, androidx.collection.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            g(animator);
        }
    }

    private void e(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            s m7 = aVar.m(i10);
            if (I(m7.f182b)) {
                this.f153t.add(m7);
                this.f154u.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            s m10 = aVar2.m(i11);
            if (I(m10.f182b)) {
                this.f154u.add(m10);
                this.f153t.add(null);
            }
        }
    }

    private static void f(t tVar, View view, s sVar) {
        tVar.f184a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f185b.indexOfKey(id) >= 0) {
                tVar.f185b.put(id, null);
            } else {
                tVar.f185b.put(id, view);
            }
        }
        String M = androidx.core.view.a0.M(view);
        if (M != null) {
            if (tVar.f187d.containsKey(M)) {
                tVar.f187d.put(M, null);
            } else {
                tVar.f187d.put(M, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f186c.i(itemIdAtPosition) >= 0) {
                    View g10 = tVar.f186c.g(itemIdAtPosition);
                    if (g10 != null) {
                        androidx.core.view.a0.z0(g10, false);
                        tVar.f186c.k(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                androidx.core.view.a0.z0(view, true);
                tVar.f186c.k(itemIdAtPosition, view);
            }
        }
    }

    private void j(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f142i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.f143j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f144k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f144k.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z10) {
                        l(sVar);
                    } else {
                        i(sVar);
                    }
                    sVar.f183c.add(this);
                    k(sVar);
                    if (z10) {
                        f(this.f149p, view, sVar);
                    } else {
                        f(this.f150q, view, sVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f146m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.f147n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f148o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.f148o.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                j(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    private static androidx.collection.a<Animator, d> z() {
        androidx.collection.a<Animator, d> aVar = J.get();
        if (aVar == null) {
            androidx.collection.a<Animator, d> aVar2 = new androidx.collection.a<>();
            J.set(aVar2);
            return aVar2;
        }
        return aVar;
    }

    public long A() {
        return this.f135b;
    }

    public List<Integer> B() {
        return this.f138e;
    }

    public List<String> C() {
        return this.f140g;
    }

    public List<Class<?>> D() {
        return this.f141h;
    }

    public List<View> E() {
        return this.f139f;
    }

    public String[] F() {
        return null;
    }

    public s G(View view, boolean z10) {
        q qVar = this.f151r;
        if (qVar != null) {
            return qVar.G(view, z10);
        }
        return (z10 ? this.f149p : this.f150q).f184a.get(view);
    }

    public boolean H(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] F = F();
        if (F != null) {
            for (String str : F) {
                if (!J(sVar, sVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : sVar.f181a.keySet()) {
            if (J(sVar, sVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean I(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f142i;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList4 = this.f143j;
            if (arrayList4 == null || !arrayList4.contains(view)) {
                ArrayList<Class<?>> arrayList5 = this.f144k;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f144k.get(i10).isInstance(view)) {
                            return false;
                        }
                    }
                }
                if (this.f145l == null || androidx.core.view.a0.M(view) == null || !this.f145l.contains(androidx.core.view.a0.M(view))) {
                    if ((this.f138e.size() == 0 && this.f139f.size() == 0 && (((arrayList = this.f141h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f140g) == null || arrayList2.isEmpty()))) || this.f138e.contains(Integer.valueOf(id)) || this.f139f.contains(view)) {
                        return true;
                    }
                    ArrayList<String> arrayList6 = this.f140g;
                    if (arrayList6 == null || !arrayList6.contains(androidx.core.view.a0.M(view))) {
                        if (this.f141h != null) {
                            for (int i11 = 0; i11 < this.f141h.size(); i11++) {
                                if (this.f141h.get(i11).isInstance(view)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void P(View view) {
        if (this.A) {
            return;
        }
        androidx.collection.a<Animator, d> z10 = z();
        int size = z10.size();
        m0 d10 = c0.d(view);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            d m7 = z10.m(i10);
            if (m7.f163a != null && d10.equals(m7.f166d)) {
                a1.a.b(z10.i(i10));
            }
        }
        ArrayList<f> arrayList = this.B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.B.clone();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((f) arrayList2.get(i11)).e(this);
            }
        }
        this.f159z = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(ViewGroup viewGroup) {
        d dVar;
        this.f153t = new ArrayList<>();
        this.f154u = new ArrayList<>();
        O(this.f149p, this.f150q);
        androidx.collection.a<Animator, d> z10 = z();
        int size = z10.size();
        m0 d10 = c0.d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator i11 = z10.i(i10);
            if (i11 != null && (dVar = z10.get(i11)) != null && dVar.f163a != null && d10.equals(dVar.f166d)) {
                s sVar = dVar.f165c;
                View view = dVar.f163a;
                s G = G(view, true);
                s v10 = v(view, true);
                if (G == null && v10 == null) {
                    v10 = this.f150q.f184a.get(view);
                }
                if (!(G == null && v10 == null) && dVar.f167e.H(sVar, v10)) {
                    if (!i11.isRunning() && !i11.isStarted()) {
                        z10.remove(i11);
                    } else {
                        i11.cancel();
                    }
                }
            }
        }
        q(viewGroup, this.f149p, this.f150q, this.f153t, this.f154u);
        V();
    }

    public m R(f fVar) {
        ArrayList<f> arrayList = this.B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.B.size() == 0) {
            this.B = null;
        }
        return this;
    }

    public m S(View view) {
        this.f139f.remove(view);
        return this;
    }

    public void T(View view) {
        if (this.f159z) {
            if (!this.A) {
                androidx.collection.a<Animator, d> z10 = z();
                int size = z10.size();
                m0 d10 = c0.d(view);
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    d m7 = z10.m(i10);
                    if (m7.f163a != null && d10.equals(m7.f166d)) {
                        a1.a.c(z10.i(i10));
                    }
                }
                ArrayList<f> arrayList = this.B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.B.clone();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((f) arrayList2.get(i11)).a(this);
                    }
                }
            }
            this.f159z = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void V() {
        c0();
        androidx.collection.a<Animator, d> z10 = z();
        Iterator<Animator> it = this.C.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (z10.containsKey(next)) {
                c0();
                U(next, z10);
            }
        }
        this.C.clear();
        r();
    }

    public m W(long j10) {
        this.f136c = j10;
        return this;
    }

    public void X(e eVar) {
        this.E = eVar;
    }

    public m Y(TimeInterpolator timeInterpolator) {
        this.f137d = timeInterpolator;
        return this;
    }

    public void Z(g gVar) {
        if (gVar == null) {
            this.G = I;
        } else {
            this.G = gVar;
        }
    }

    public void a0(p pVar) {
    }

    public m b0(long j10) {
        this.f135b = j10;
        return this;
    }

    public m c(f fVar) {
        if (this.B == null) {
            this.B = new ArrayList<>();
        }
        this.B.add(fVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c0() {
        if (this.f158y == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).c(this);
                }
            }
            this.A = false;
        }
        this.f158y++;
    }

    public m d(View view) {
        this.f139f.add(view);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f136c != -1) {
            str2 = str2 + "dur(" + this.f136c + ") ";
        }
        if (this.f135b != -1) {
            str2 = str2 + "dly(" + this.f135b + ") ";
        }
        if (this.f137d != null) {
            str2 = str2 + "interp(" + this.f137d + ") ";
        }
        if (this.f138e.size() > 0 || this.f139f.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.f138e.size() > 0) {
                for (int i10 = 0; i10 < this.f138e.size(); i10++) {
                    if (i10 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f138e.get(i10);
                }
            }
            if (this.f139f.size() > 0) {
                for (int i11 = 0; i11 < this.f139f.size(); i11++) {
                    if (i11 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f139f.get(i11);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    protected void g(Animator animator) {
        if (animator == null) {
            r();
            return;
        }
        if (s() >= 0) {
            animator.setDuration(s());
        }
        if (A() >= 0) {
            animator.setStartDelay(A() + animator.getStartDelay());
        }
        if (u() != null) {
            animator.setInterpolator(u());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h() {
        for (int size = this.f157x.size() - 1; size >= 0; size--) {
            this.f157x.get(size).cancel();
        }
        ArrayList<f> arrayList = this.B;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.B.clone();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((f) arrayList2.get(i10)).b(this);
        }
    }

    public abstract void i(s sVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(s sVar) {
    }

    public abstract void l(s sVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        androidx.collection.a<String, String> aVar;
        n(z10);
        if ((this.f138e.size() <= 0 && this.f139f.size() <= 0) || (((arrayList = this.f140g) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f141h) != null && !arrayList2.isEmpty()))) {
            j(viewGroup, z10);
        } else {
            for (int i10 = 0; i10 < this.f138e.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.f138e.get(i10).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z10) {
                        l(sVar);
                    } else {
                        i(sVar);
                    }
                    sVar.f183c.add(this);
                    k(sVar);
                    if (z10) {
                        f(this.f149p, findViewById, sVar);
                    } else {
                        f(this.f150q, findViewById, sVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f139f.size(); i11++) {
                View view = this.f139f.get(i11);
                s sVar2 = new s(view);
                if (z10) {
                    l(sVar2);
                } else {
                    i(sVar2);
                }
                sVar2.f183c.add(this);
                k(sVar2);
                if (z10) {
                    f(this.f149p, view, sVar2);
                } else {
                    f(this.f150q, view, sVar2);
                }
            }
        }
        if (z10 || (aVar = this.F) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.f149p.f187d.remove(this.F.i(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f149p.f187d.put(this.F.m(i13), view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(boolean z10) {
        if (z10) {
            this.f149p.f184a.clear();
            this.f149p.f185b.clear();
            this.f149p.f186c.d();
            return;
        }
        this.f150q.f184a.clear();
        this.f150q.f185b.clear();
        this.f150q.f186c.d();
    }

    @Override // 
    /* renamed from: o */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.C = new ArrayList<>();
            mVar.f149p = new t();
            mVar.f150q = new t();
            mVar.f153t = null;
            mVar.f154u = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        int i10;
        View view;
        Animator animator;
        s sVar;
        Animator animator2;
        s sVar2;
        androidx.collection.a<Animator, d> z10 = z();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            s sVar3 = arrayList.get(i11);
            s sVar4 = arrayList2.get(i11);
            if (sVar3 != null && !sVar3.f183c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f183c.contains(this)) {
                sVar4 = null;
            }
            if (sVar3 != null || sVar4 != null) {
                if (sVar3 == null || sVar4 == null || H(sVar3, sVar4)) {
                    Animator p10 = p(viewGroup, sVar3, sVar4);
                    if (p10 != null) {
                        if (sVar4 != null) {
                            View view2 = sVar4.f182b;
                            String[] F = F();
                            if (F != null && F.length > 0) {
                                sVar2 = new s(view2);
                                s sVar5 = tVar2.f184a.get(view2);
                                if (sVar5 != null) {
                                    int i12 = 0;
                                    while (i12 < F.length) {
                                        sVar2.f181a.put(F[i12], sVar5.f181a.get(F[i12]));
                                        i12++;
                                        p10 = p10;
                                        size = size;
                                        sVar5 = sVar5;
                                    }
                                }
                                Animator animator3 = p10;
                                i10 = size;
                                int size2 = z10.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    d dVar = z10.get(z10.i(i13));
                                    if (dVar.f165c != null && dVar.f163a == view2 && dVar.f164b.equals(w()) && dVar.f165c.equals(sVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i13++;
                                }
                            } else {
                                i10 = size;
                                animator2 = p10;
                                sVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            i10 = size;
                            view = sVar3.f182b;
                            animator = p10;
                            sVar = null;
                        }
                        if (animator != null) {
                            z10.put(animator, new d(view, w(), this, c0.d(viewGroup), sVar));
                            this.C.add(animator);
                        }
                        i11++;
                        size = i10;
                    }
                    i10 = size;
                    i11++;
                    size = i10;
                }
            }
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator4 = this.C.get(sparseIntArray.keyAt(i14));
                animator4.setStartDelay((sparseIntArray.valueAt(i14) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r() {
        int i10 = this.f158y - 1;
        this.f158y = i10;
        if (i10 == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).d(this);
                }
            }
            for (int i12 = 0; i12 < this.f149p.f186c.n(); i12++) {
                View o10 = this.f149p.f186c.o(i12);
                if (o10 != null) {
                    androidx.core.view.a0.z0(o10, false);
                }
            }
            for (int i13 = 0; i13 < this.f150q.f186c.n(); i13++) {
                View o11 = this.f150q.f186c.o(i13);
                if (o11 != null) {
                    androidx.core.view.a0.z0(o11, false);
                }
            }
            this.A = true;
        }
    }

    public long s() {
        return this.f136c;
    }

    public e t() {
        return this.E;
    }

    public String toString() {
        return d0("");
    }

    public TimeInterpolator u() {
        return this.f137d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s v(View view, boolean z10) {
        q qVar = this.f151r;
        if (qVar != null) {
            return qVar.v(view, z10);
        }
        ArrayList<s> arrayList = z10 ? this.f153t : this.f154u;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            s sVar = arrayList.get(i11);
            if (sVar == null) {
                return null;
            }
            if (sVar.f182b == view) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 >= 0) {
            return (z10 ? this.f154u : this.f153t).get(i10);
        }
        return null;
    }

    public String w() {
        return this.f134a;
    }

    public g x() {
        return this.G;
    }

    public p y() {
        return this.D;
    }
}
