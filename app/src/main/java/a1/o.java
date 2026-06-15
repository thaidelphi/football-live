package a1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: TransitionManager.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private static m f168a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<m>>>> f169b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList<ViewGroup> f170c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransitionManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        m f171a;

        /* renamed from: b  reason: collision with root package name */
        ViewGroup f172b;

        /* compiled from: TransitionManager.java */
        /* renamed from: a1.o$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0005a extends n {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.collection.a f173a;

            C0005a(androidx.collection.a aVar) {
                this.f173a = aVar;
            }

            @Override // a1.m.f
            public void d(m mVar) {
                ((ArrayList) this.f173a.get(a.this.f172b)).remove(mVar);
                mVar.R(this);
            }
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f171a = mVar;
            this.f172b = viewGroup;
        }

        private void a() {
            this.f172b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f172b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (o.f170c.remove(this.f172b)) {
                androidx.collection.a<ViewGroup, ArrayList<m>> b10 = o.b();
                ArrayList<m> arrayList = b10.get(this.f172b);
                ArrayList arrayList2 = null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    b10.put(this.f172b, arrayList);
                } else if (arrayList.size() > 0) {
                    arrayList2 = new ArrayList(arrayList);
                }
                arrayList.add(this.f171a);
                this.f171a.c(new C0005a(b10));
                this.f171a.m(this.f172b, false);
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((m) it.next()).T(this.f172b);
                    }
                }
                this.f171a.Q(this.f172b);
                return true;
            }
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            o.f170c.remove(this.f172b);
            ArrayList<m> arrayList = o.b().get(this.f172b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().T(this.f172b);
                }
            }
            this.f171a.n(true);
        }
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (f170c.contains(viewGroup) || !androidx.core.view.a0.U(viewGroup)) {
            return;
        }
        f170c.add(viewGroup);
        if (mVar == null) {
            mVar = f168a;
        }
        m clone = mVar.clone();
        d(viewGroup, clone);
        l.c(viewGroup, null);
        c(viewGroup, clone);
    }

    static androidx.collection.a<ViewGroup, ArrayList<m>> b() {
        androidx.collection.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference<androidx.collection.a<ViewGroup, ArrayList<m>>> weakReference = f169b.get();
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            androidx.collection.a<ViewGroup, ArrayList<m>> aVar2 = new androidx.collection.a<>();
            f169b.set(new WeakReference<>(aVar2));
            return aVar2;
        }
        return aVar;
    }

    private static void c(ViewGroup viewGroup, m mVar) {
        if (mVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(mVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, m mVar) {
        ArrayList<m> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().P(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.m(viewGroup, true);
        }
        l b10 = l.b(viewGroup);
        if (b10 != null) {
            b10.a();
        }
    }
}
