package a1;

import a1.m;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FragmentTransitionSupport.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e extends androidx.fragment.app.t {

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends m.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f81a;

        a(Rect rect) {
            this.f81a = rect;
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements m.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f83a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f84b;

        b(View view, ArrayList arrayList) {
            this.f83a = view;
            this.f84b = arrayList;
        }

        @Override // a1.m.f
        public void a(m mVar) {
        }

        @Override // a1.m.f
        public void b(m mVar) {
        }

        @Override // a1.m.f
        public void c(m mVar) {
        }

        @Override // a1.m.f
        public void d(m mVar) {
            mVar.R(this);
            this.f83a.setVisibility(8);
            int size = this.f84b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f84b.get(i10)).setVisibility(0);
            }
        }

        @Override // a1.m.f
        public void e(m mVar) {
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f86a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f87b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f88c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f89d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f90e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f91f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f86a = obj;
            this.f87b = arrayList;
            this.f88c = obj2;
            this.f89d = arrayList2;
            this.f90e = obj3;
            this.f91f = arrayList3;
        }

        @Override // a1.n, a1.m.f
        public void c(m mVar) {
            Object obj = this.f86a;
            if (obj != null) {
                e.this.q(obj, this.f87b, null);
            }
            Object obj2 = this.f88c;
            if (obj2 != null) {
                e.this.q(obj2, this.f89d, null);
            }
            Object obj3 = this.f90e;
            if (obj3 != null) {
                e.this.q(obj3, this.f91f, null);
            }
        }

        @Override // a1.m.f
        public void d(m mVar) {
            mVar.R(this);
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class d extends m.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f93a;

        d(Rect rect) {
            this.f93a = rect;
        }
    }

    private static boolean C(m mVar) {
        return (androidx.fragment.app.t.l(mVar.B()) && androidx.fragment.app.t.l(mVar.C()) && androidx.fragment.app.t.l(mVar.D())) ? false : true;
    }

    @Override // androidx.fragment.app.t
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        if (qVar != null) {
            qVar.E().clear();
            qVar.E().addAll(arrayList2);
            q(qVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.t
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = new q();
        qVar.g0((m) obj);
        return qVar;
    }

    @Override // androidx.fragment.app.t
    public void a(Object obj, View view) {
        if (obj != null) {
            ((m) obj).d(view);
        }
    }

    @Override // androidx.fragment.app.t
    public void b(Object obj, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        if (mVar == null) {
            return;
        }
        int i10 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int j02 = qVar.j0();
            while (i10 < j02) {
                b(qVar.i0(i10), arrayList);
                i10++;
            }
        } else if (C(mVar) || !androidx.fragment.app.t.l(mVar.E())) {
        } else {
            int size = arrayList.size();
            while (i10 < size) {
                mVar.d(arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.t
    public void c(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (m) obj);
    }

    @Override // androidx.fragment.app.t
    public boolean e(Object obj) {
        return obj instanceof m;
    }

    @Override // androidx.fragment.app.t
    public Object g(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.t
    public Object m(Object obj, Object obj2, Object obj3) {
        m mVar = (m) obj;
        m mVar2 = (m) obj2;
        m mVar3 = (m) obj3;
        if (mVar != null && mVar2 != null) {
            mVar = new q().g0(mVar).g0(mVar2).o0(1);
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 != null) {
            q qVar = new q();
            if (mVar != null) {
                qVar.g0(mVar);
            }
            qVar.g0(mVar3);
            return qVar;
        }
        return mVar;
    }

    @Override // androidx.fragment.app.t
    public Object n(Object obj, Object obj2, Object obj3) {
        q qVar = new q();
        if (obj != null) {
            qVar.g0((m) obj);
        }
        if (obj2 != null) {
            qVar.g0((m) obj2);
        }
        if (obj3 != null) {
            qVar.g0((m) obj3);
        }
        return qVar;
    }

    @Override // androidx.fragment.app.t
    public void p(Object obj, View view) {
        if (obj != null) {
            ((m) obj).S(view);
        }
    }

    @Override // androidx.fragment.app.t
    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        m mVar = (m) obj;
        int i10 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int j02 = qVar.j0();
            while (i10 < j02) {
                q(qVar.i0(i10), arrayList, arrayList2);
                i10++;
            }
        } else if (!C(mVar)) {
            List<View> E = mVar.E();
            if (E.size() == arrayList.size() && E.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i10 < size) {
                    mVar.d(arrayList2.get(i10));
                    i10++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    mVar.S(arrayList.get(size2));
                }
            }
        }
    }

    @Override // androidx.fragment.app.t
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((m) obj).c(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.t
    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((m) obj).c(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.t
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((m) obj).X(new d(rect));
        }
    }

    @Override // androidx.fragment.app.t
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((m) obj).X(new a(rect));
        }
    }

    @Override // androidx.fragment.app.t
    public void z(Object obj, View view, ArrayList<View> arrayList) {
        q qVar = (q) obj;
        List<View> E = qVar.E();
        E.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.t.d(E, arrayList.get(i10));
        }
        E.add(view);
        arrayList.add(view);
        b(qVar, arrayList);
    }
}
