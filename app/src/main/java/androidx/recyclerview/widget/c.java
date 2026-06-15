package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.a0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: DefaultItemAnimator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c extends m {

    /* renamed from: s  reason: collision with root package name */
    private static TimeInterpolator f3998s;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<RecyclerView.c0> f3999h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<RecyclerView.c0> f4000i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<j> f4001j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<i> f4002k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.c0>> f4003l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    ArrayList<ArrayList<j>> f4004m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    ArrayList<ArrayList<i>> f4005n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    ArrayList<RecyclerView.c0> f4006o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    ArrayList<RecyclerView.c0> f4007p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    ArrayList<RecyclerView.c0> f4008q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    ArrayList<RecyclerView.c0> f4009r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f4010a;

        a(ArrayList arrayList) {
            this.f4010a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4010a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.S(jVar.f4044a, jVar.f4045b, jVar.f4046c, jVar.f4047d, jVar.f4048e);
            }
            this.f4010a.clear();
            c.this.f4004m.remove(this.f4010a);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f4012a;

        b(ArrayList arrayList) {
            this.f4012a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4012a.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f4012a.clear();
            c.this.f4005n.remove(this.f4012a);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class RunnableC0071c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f4014a;

        RunnableC0071c(ArrayList arrayList) {
            this.f4014a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4014a.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.c0) it.next());
            }
            this.f4014a.clear();
            c.this.f4003l.remove(this.f4014a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.c0 f4016a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4017b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f4018c;

        d(RecyclerView.c0 c0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4016a = c0Var;
            this.f4017b = viewPropertyAnimator;
            this.f4018c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4017b.setListener(null);
            this.f4018c.setAlpha(1.0f);
            c.this.G(this.f4016a);
            c.this.f4008q.remove(this.f4016a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f4016a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.c0 f4020a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f4021b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4022c;

        e(RecyclerView.c0 c0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4020a = c0Var;
            this.f4021b = view;
            this.f4022c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4021b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4022c.setListener(null);
            c.this.A(this.f4020a);
            c.this.f4006o.remove(this.f4020a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f4020a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.c0 f4024a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f4025b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f4026c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f4027d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4028e;

        f(RecyclerView.c0 c0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4024a = c0Var;
            this.f4025b = i10;
            this.f4026c = view;
            this.f4027d = i11;
            this.f4028e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f4025b != 0) {
                this.f4026c.setTranslationX(0.0f);
            }
            if (this.f4027d != 0) {
                this.f4026c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4028e.setListener(null);
            c.this.E(this.f4024a);
            c.this.f4007p.remove(this.f4024a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f4024a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f4030a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4031b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f4032c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4030a = iVar;
            this.f4031b = viewPropertyAnimator;
            this.f4032c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4031b.setListener(null);
            this.f4032c.setAlpha(1.0f);
            this.f4032c.setTranslationX(0.0f);
            this.f4032c.setTranslationY(0.0f);
            c.this.C(this.f4030a.f4038a, true);
            c.this.f4009r.remove(this.f4030a.f4038a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f4030a.f4038a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f4034a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4035b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f4036c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4034a = iVar;
            this.f4035b = viewPropertyAnimator;
            this.f4036c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4035b.setListener(null);
            this.f4036c.setAlpha(1.0f);
            this.f4036c.setTranslationX(0.0f);
            this.f4036c.setTranslationY(0.0f);
            c.this.C(this.f4034a.f4039b, false);
            c.this.f4009r.remove(this.f4034a.f4039b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f4034a.f4039b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.c0 f4044a;

        /* renamed from: b  reason: collision with root package name */
        public int f4045b;

        /* renamed from: c  reason: collision with root package name */
        public int f4046c;

        /* renamed from: d  reason: collision with root package name */
        public int f4047d;

        /* renamed from: e  reason: collision with root package name */
        public int f4048e;

        j(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13) {
            this.f4044a = c0Var;
            this.f4045b = i10;
            this.f4046c = i11;
            this.f4047d = i12;
            this.f4048e = i13;
        }
    }

    private void T(RecyclerView.c0 c0Var) {
        View view = c0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f4008q.add(c0Var);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(c0Var, animate, view)).start();
    }

    private void W(List<i> list, RecyclerView.c0 c0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Y(iVar, c0Var) && iVar.f4038a == null && iVar.f4039b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.c0 c0Var = iVar.f4038a;
        if (c0Var != null) {
            Y(iVar, c0Var);
        }
        RecyclerView.c0 c0Var2 = iVar.f4039b;
        if (c0Var2 != null) {
            Y(iVar, c0Var2);
        }
    }

    private boolean Y(i iVar, RecyclerView.c0 c0Var) {
        boolean z10 = false;
        if (iVar.f4039b == c0Var) {
            iVar.f4039b = null;
        } else if (iVar.f4038a != c0Var) {
            return false;
        } else {
            iVar.f4038a = null;
            z10 = true;
        }
        c0Var.itemView.setAlpha(1.0f);
        c0Var.itemView.setTranslationX(0.0f);
        c0Var.itemView.setTranslationY(0.0f);
        C(c0Var, z10);
        return true;
    }

    private void Z(RecyclerView.c0 c0Var) {
        if (f3998s == null) {
            f3998s = new ValueAnimator().getInterpolator();
        }
        c0Var.itemView.animate().setInterpolator(f3998s);
        j(c0Var);
    }

    void Q(RecyclerView.c0 c0Var) {
        View view = c0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f4006o.add(c0Var);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(c0Var, view, animate)).start();
    }

    void R(i iVar) {
        RecyclerView.c0 c0Var = iVar.f4038a;
        View view = c0Var == null ? null : c0Var.itemView;
        RecyclerView.c0 c0Var2 = iVar.f4039b;
        View view2 = c0Var2 != null ? c0Var2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f4009r.add(iVar.f4038a);
            duration.translationX(iVar.f4042e - iVar.f4040c);
            duration.translationY(iVar.f4043f - iVar.f4041d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f4009r.add(iVar.f4039b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    void S(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13) {
        View view = c0Var.itemView;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f4007p.add(c0Var);
        animate.setDuration(n()).setListener(new f(c0Var, i14, view, i15, animate)).start();
    }

    void U(List<RecyclerView.c0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.c0 c0Var, List<Object> list) {
        return !list.isEmpty() || super.g(c0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(RecyclerView.c0 c0Var) {
        View view = c0Var.itemView;
        view.animate().cancel();
        int size = this.f4001j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f4001j.get(size).f4044a == c0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(c0Var);
                this.f4001j.remove(size);
            }
        }
        W(this.f4002k, c0Var);
        if (this.f3999h.remove(c0Var)) {
            view.setAlpha(1.0f);
            G(c0Var);
        }
        if (this.f4000i.remove(c0Var)) {
            view.setAlpha(1.0f);
            A(c0Var);
        }
        for (int size2 = this.f4005n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f4005n.get(size2);
            W(arrayList, c0Var);
            if (arrayList.isEmpty()) {
                this.f4005n.remove(size2);
            }
        }
        for (int size3 = this.f4004m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f4004m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f4044a == c0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(c0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4004m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4003l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.c0> arrayList3 = this.f4003l.get(size5);
            if (arrayList3.remove(c0Var)) {
                view.setAlpha(1.0f);
                A(c0Var);
                if (arrayList3.isEmpty()) {
                    this.f4003l.remove(size5);
                }
            }
        }
        this.f4008q.remove(c0Var);
        this.f4006o.remove(c0Var);
        this.f4009r.remove(c0Var);
        this.f4007p.remove(c0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.f4001j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f4001j.get(size);
            View view = jVar.f4044a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f4044a);
            this.f4001j.remove(size);
        }
        for (int size2 = this.f3999h.size() - 1; size2 >= 0; size2--) {
            G(this.f3999h.get(size2));
            this.f3999h.remove(size2);
        }
        int size3 = this.f4000i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.c0 c0Var = this.f4000i.get(size3);
            c0Var.itemView.setAlpha(1.0f);
            A(c0Var);
            this.f4000i.remove(size3);
        }
        for (int size4 = this.f4002k.size() - 1; size4 >= 0; size4--) {
            X(this.f4002k.get(size4));
        }
        this.f4002k.clear();
        if (p()) {
            for (int size5 = this.f4004m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f4004m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f4044a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f4044a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f4004m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f4003l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.c0> arrayList2 = this.f4003l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.c0 c0Var2 = arrayList2.get(size8);
                    c0Var2.itemView.setAlpha(1.0f);
                    A(c0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f4003l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f4005n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f4005n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f4005n.remove(arrayList3);
                    }
                }
            }
            U(this.f4008q);
            U(this.f4007p);
            U(this.f4006o);
            U(this.f4009r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.f4000i.isEmpty() && this.f4002k.isEmpty() && this.f4001j.isEmpty() && this.f3999h.isEmpty() && this.f4007p.isEmpty() && this.f4008q.isEmpty() && this.f4006o.isEmpty() && this.f4009r.isEmpty() && this.f4004m.isEmpty() && this.f4003l.isEmpty() && this.f4005n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void u() {
        boolean z10 = !this.f3999h.isEmpty();
        boolean z11 = !this.f4001j.isEmpty();
        boolean z12 = !this.f4002k.isEmpty();
        boolean z13 = !this.f4000i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.c0> it = this.f3999h.iterator();
            while (it.hasNext()) {
                T(it.next());
            }
            this.f3999h.clear();
            if (z11) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f4001j);
                this.f4004m.add(arrayList);
                this.f4001j.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    a0.j0(arrayList.get(0).f4044a.itemView, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f4002k);
                this.f4005n.add(arrayList2);
                this.f4002k.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    a0.j0(arrayList2.get(0).f4038a.itemView, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList<RecyclerView.c0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f4000i);
                this.f4003l.add(arrayList3);
                this.f4000i.clear();
                RunnableC0071c runnableC0071c = new RunnableC0071c(arrayList3);
                if (!z10 && !z11 && !z12) {
                    runnableC0071c.run();
                } else {
                    a0.j0(arrayList3.get(0).itemView, runnableC0071c, (z10 ? o() : 0L) + Math.max(z11 ? n() : 0L, z12 ? m() : 0L));
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.m
    public boolean w(RecyclerView.c0 c0Var) {
        Z(c0Var);
        c0Var.itemView.setAlpha(0.0f);
        this.f4000i.add(c0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean x(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i10, int i11, int i12, int i13) {
        if (c0Var == c0Var2) {
            return y(c0Var, i10, i11, i12, i13);
        }
        float translationX = c0Var.itemView.getTranslationX();
        float translationY = c0Var.itemView.getTranslationY();
        float alpha = c0Var.itemView.getAlpha();
        Z(c0Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        c0Var.itemView.setTranslationX(translationX);
        c0Var.itemView.setTranslationY(translationY);
        c0Var.itemView.setAlpha(alpha);
        if (c0Var2 != null) {
            Z(c0Var2);
            c0Var2.itemView.setTranslationX(-i14);
            c0Var2.itemView.setTranslationY(-i15);
            c0Var2.itemView.setAlpha(0.0f);
        }
        this.f4002k.add(new i(c0Var, c0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean y(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13) {
        View view = c0Var.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) c0Var.itemView.getTranslationY());
        Z(c0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(c0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f4001j.add(new j(c0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean z(RecyclerView.c0 c0Var) {
        Z(c0Var);
        this.f3999h.add(c0Var);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.c0 f4038a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.c0 f4039b;

        /* renamed from: c  reason: collision with root package name */
        public int f4040c;

        /* renamed from: d  reason: collision with root package name */
        public int f4041d;

        /* renamed from: e  reason: collision with root package name */
        public int f4042e;

        /* renamed from: f  reason: collision with root package name */
        public int f4043f;

        private i(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2) {
            this.f4038a = c0Var;
            this.f4039b = c0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f4038a + ", newHolder=" + this.f4039b + ", fromX=" + this.f4040c + ", fromY=" + this.f4041d + ", toX=" + this.f4042e + ", toY=" + this.f4043f + '}';
        }

        i(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i10, int i11, int i12, int i13) {
            this(c0Var, c0Var2);
            this.f4040c = i10;
            this.f4041d = i11;
            this.f4042e = i12;
            this.f4043f = i13;
        }
    }
}
