package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.a0;
import androidx.fragment.app.w;
import androidx.lifecycle.i;
import androidx.lifecycle.p0;
import com.ironsource.b9;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentStateManager.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private final j f3387a;

    /* renamed from: b  reason: collision with root package name */
    private final p f3388b;

    /* renamed from: c  reason: collision with root package name */
    private final Fragment f3389c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3390d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f3391e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentStateManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f3392a;

        a(View view) {
            this.f3392a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f3392a.removeOnAttachStateChangeListener(this);
            a0.n0(this.f3392a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentStateManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3394a;

        static {
            int[] iArr = new int[i.b.values().length];
            f3394a = iArr;
            try {
                iArr[i.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3394a[i.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3394a[i.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3394a[i.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(j jVar, p pVar, Fragment fragment) {
        this.f3387a = jVar;
        this.f3388b = pVar;
        this.f3389c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f3389c.H) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3389c.H) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f3389c.q1(bundle);
        this.f3387a.j(this.f3389c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3389c.H != null) {
            s();
        }
        if (this.f3389c.f3144c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3389c.f3144c);
        }
        if (this.f3389c.f3145d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f3389c.f3145d);
        }
        if (!this.f3389c.J) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3389c.J);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (FragmentManager.F0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3389c);
        }
        Fragment fragment = this.f3389c;
        fragment.W0(fragment.f3143b);
        j jVar = this.f3387a;
        Fragment fragment2 = this.f3389c;
        jVar.a(fragment2, fragment2.f3143b, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        int j10 = this.f3388b.j(this.f3389c);
        Fragment fragment = this.f3389c;
        fragment.G.addView(fragment.H, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (FragmentManager.F0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3389c);
        }
        Fragment fragment = this.f3389c;
        Fragment fragment2 = fragment.f3149h;
        o oVar = null;
        if (fragment2 != null) {
            o m7 = this.f3388b.m(fragment2.f3147f);
            if (m7 != null) {
                Fragment fragment3 = this.f3389c;
                fragment3.f3150i = fragment3.f3149h.f3147f;
                fragment3.f3149h = null;
                oVar = m7;
            } else {
                throw new IllegalStateException("Fragment " + this.f3389c + " declared target fragment " + this.f3389c.f3149h + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.f3150i;
            if (str != null && (oVar = this.f3388b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3389c + " declared target fragment " + this.f3389c.f3150i + " that does not belong to this FragmentManager!");
            }
        }
        if (oVar != null && (FragmentManager.P || oVar.k().f3142a < 1)) {
            oVar.m();
        }
        Fragment fragment4 = this.f3389c;
        fragment4.f3161t = fragment4.f3160s.t0();
        Fragment fragment5 = this.f3389c;
        fragment5.f3163v = fragment5.f3160s.w0();
        this.f3387a.g(this.f3389c, false);
        this.f3389c.X0();
        this.f3387a.b(this.f3389c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f3389c;
        if (fragment2.f3160s == null) {
            return fragment2.f3142a;
        }
        int i10 = this.f3391e;
        int i11 = b.f3394a[fragment2.R.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                i10 = Math.min(i10, 5);
            } else if (i11 == 3) {
                i10 = Math.min(i10, 1);
            } else if (i11 != 4) {
                i10 = Math.min(i10, -1);
            } else {
                i10 = Math.min(i10, 0);
            }
        }
        Fragment fragment3 = this.f3389c;
        if (fragment3.f3155n) {
            if (fragment3.f3156o) {
                i10 = Math.max(this.f3391e, 2);
                View view = this.f3389c.H;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f3391e < 4 ? Math.min(i10, fragment3.f3142a) : Math.min(i10, 1);
            }
        }
        if (!this.f3389c.f3153l) {
            i10 = Math.min(i10, 1);
        }
        w.e.b bVar = null;
        if (FragmentManager.P && (viewGroup = (fragment = this.f3389c).G) != null) {
            bVar = w.n(viewGroup, fragment.E()).l(this);
        }
        if (bVar == w.e.b.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (bVar == w.e.b.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            Fragment fragment4 = this.f3389c;
            if (fragment4.f3154m) {
                if (fragment4.f0()) {
                    i10 = Math.min(i10, 1);
                } else {
                    i10 = Math.min(i10, -1);
                }
            }
        }
        Fragment fragment5 = this.f3389c;
        if (fragment5.I && fragment5.f3142a < 5) {
            i10 = Math.min(i10, 4);
        }
        if (FragmentManager.F0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f3389c);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (FragmentManager.F0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3389c);
        }
        Fragment fragment = this.f3389c;
        if (!fragment.Q) {
            this.f3387a.h(fragment, fragment.f3143b, false);
            Fragment fragment2 = this.f3389c;
            fragment2.a1(fragment2.f3143b);
            j jVar = this.f3387a;
            Fragment fragment3 = this.f3389c;
            jVar.c(fragment3, fragment3.f3143b, false);
            return;
        }
        fragment.y1(fragment.f3143b);
        this.f3389c.f3142a = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        String str;
        if (this.f3389c.f3155n) {
            return;
        }
        if (FragmentManager.F0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3389c);
        }
        Fragment fragment = this.f3389c;
        LayoutInflater g12 = fragment.g1(fragment.f3143b);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f3389c;
        ViewGroup viewGroup2 = fragment2.G;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment2.f3165x;
            if (i10 != 0) {
                if (i10 != -1) {
                    viewGroup = (ViewGroup) fragment2.f3160s.o0().c(this.f3389c.f3165x);
                    if (viewGroup == null) {
                        Fragment fragment3 = this.f3389c;
                        if (!fragment3.f3157p) {
                            try {
                                str = fragment3.K().getResourceName(this.f3389c.f3165x);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3389c.f3165x) + " (" + str + ") for fragment " + this.f3389c);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f3389c + " for a container view with no id");
                }
            }
        }
        Fragment fragment4 = this.f3389c;
        fragment4.G = viewGroup;
        fragment4.c1(g12, viewGroup, fragment4.f3143b);
        View view = this.f3389c.H;
        if (view != null) {
            boolean z10 = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f3389c;
            fragment5.H.setTag(g0.b.f25682a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f3389c;
            if (fragment6.f3167z) {
                fragment6.H.setVisibility(8);
            }
            if (a0.T(this.f3389c.H)) {
                a0.n0(this.f3389c.H);
            } else {
                View view2 = this.f3389c.H;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f3389c.t1();
            j jVar = this.f3387a;
            Fragment fragment7 = this.f3389c;
            jVar.m(fragment7, fragment7.H, fragment7.f3143b, false);
            int visibility = this.f3389c.H.getVisibility();
            float alpha = this.f3389c.H.getAlpha();
            if (FragmentManager.P) {
                this.f3389c.M1(alpha);
                Fragment fragment8 = this.f3389c;
                if (fragment8.G != null && visibility == 0) {
                    View findFocus = fragment8.H.findFocus();
                    if (findFocus != null) {
                        this.f3389c.F1(findFocus);
                        if (FragmentManager.F0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f3389c);
                        }
                    }
                    this.f3389c.H.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f3389c;
                if (visibility == 0 && fragment9.G != null) {
                    z10 = true;
                }
                fragment9.M = z10;
            }
        }
        this.f3389c.f3142a = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        Fragment f10;
        if (FragmentManager.F0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3389c);
        }
        Fragment fragment = this.f3389c;
        boolean z10 = true;
        boolean z11 = fragment.f3154m && !fragment.f0();
        if (z11 || this.f3388b.o().p(this.f3389c)) {
            h<?> hVar = this.f3389c.f3161t;
            if (hVar instanceof p0) {
                z10 = this.f3388b.o().m();
            } else if (hVar.f() instanceof Activity) {
                z10 = true ^ ((Activity) hVar.f()).isChangingConfigurations();
            }
            if (z11 || z10) {
                this.f3388b.o().g(this.f3389c);
            }
            this.f3389c.d1();
            this.f3387a.d(this.f3389c, false);
            for (o oVar : this.f3388b.k()) {
                if (oVar != null) {
                    Fragment k10 = oVar.k();
                    if (this.f3389c.f3147f.equals(k10.f3150i)) {
                        k10.f3149h = this.f3389c;
                        k10.f3150i = null;
                    }
                }
            }
            Fragment fragment2 = this.f3389c;
            String str = fragment2.f3150i;
            if (str != null) {
                fragment2.f3149h = this.f3388b.f(str);
            }
            this.f3388b.q(this);
            return;
        }
        String str2 = this.f3389c.f3150i;
        if (str2 != null && (f10 = this.f3388b.f(str2)) != null && f10.B) {
            this.f3389c.f3149h = f10;
        }
        this.f3389c.f3142a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        View view;
        if (FragmentManager.F0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f3389c);
        }
        Fragment fragment = this.f3389c;
        ViewGroup viewGroup = fragment.G;
        if (viewGroup != null && (view = fragment.H) != null) {
            viewGroup.removeView(view);
        }
        this.f3389c.e1();
        this.f3387a.n(this.f3389c, false);
        Fragment fragment2 = this.f3389c;
        fragment2.G = null;
        fragment2.H = null;
        fragment2.T = null;
        fragment2.U.j(null);
        this.f3389c.f3156o = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        if (FragmentManager.F0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3389c);
        }
        this.f3389c.f1();
        boolean z10 = false;
        this.f3387a.e(this.f3389c, false);
        Fragment fragment = this.f3389c;
        fragment.f3142a = -1;
        fragment.f3161t = null;
        fragment.f3163v = null;
        fragment.f3160s = null;
        if (fragment.f3154m && !fragment.f0()) {
            z10 = true;
        }
        if (z10 || this.f3388b.o().p(this.f3389c)) {
            if (FragmentManager.F0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f3389c);
            }
            this.f3389c.Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        Fragment fragment = this.f3389c;
        if (fragment.f3155n && fragment.f3156o && !fragment.f3158q) {
            if (FragmentManager.F0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3389c);
            }
            Fragment fragment2 = this.f3389c;
            fragment2.c1(fragment2.g1(fragment2.f3143b), null, this.f3389c.f3143b);
            View view = this.f3389c.H;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3389c;
                fragment3.H.setTag(g0.b.f25682a, fragment3);
                Fragment fragment4 = this.f3389c;
                if (fragment4.f3167z) {
                    fragment4.H.setVisibility(8);
                }
                this.f3389c.t1();
                j jVar = this.f3387a;
                Fragment fragment5 = this.f3389c;
                jVar.m(fragment5, fragment5.H, fragment5.f3143b, false);
                this.f3389c.f3142a = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment k() {
        return this.f3389c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f3390d) {
            if (FragmentManager.F0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f3390d = true;
            while (true) {
                int d10 = d();
                Fragment fragment = this.f3389c;
                int i10 = fragment.f3142a;
                if (d10 == i10) {
                    if (FragmentManager.P && fragment.N) {
                        if (fragment.H != null && (viewGroup = fragment.G) != null) {
                            w n10 = w.n(viewGroup, fragment.E());
                            if (this.f3389c.f3167z) {
                                n10.c(this);
                            } else {
                                n10.e(this);
                            }
                        }
                        Fragment fragment2 = this.f3389c;
                        FragmentManager fragmentManager = fragment2.f3160s;
                        if (fragmentManager != null) {
                            fragmentManager.D0(fragment2);
                        }
                        Fragment fragment3 = this.f3389c;
                        fragment3.N = false;
                        fragment3.F0(fragment3.f3167z);
                    }
                    return;
                } else if (d10 > i10) {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            continue;
                        case 1:
                            e();
                            continue;
                        case 2:
                            j();
                            f();
                            continue;
                        case 3:
                            a();
                            continue;
                        case 4:
                            if (fragment.H != null && (viewGroup2 = fragment.G) != null) {
                                w.n(viewGroup2, fragment.E()).b(w.e.c.b(this.f3389c.H.getVisibility()), this);
                            }
                            this.f3389c.f3142a = 4;
                            continue;
                        case 5:
                            u();
                            continue;
                        case 6:
                            fragment.f3142a = 6;
                            continue;
                        case 7:
                            p();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            continue;
                        case 0:
                            g();
                            continue;
                        case 1:
                            h();
                            this.f3389c.f3142a = 1;
                            continue;
                        case 2:
                            fragment.f3156o = false;
                            fragment.f3142a = 2;
                            continue;
                        case 3:
                            if (FragmentManager.F0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3389c);
                            }
                            Fragment fragment4 = this.f3389c;
                            if (fragment4.H != null && fragment4.f3144c == null) {
                                s();
                            }
                            Fragment fragment5 = this.f3389c;
                            if (fragment5.H != null && (viewGroup3 = fragment5.G) != null) {
                                w.n(viewGroup3, fragment5.E()).d(this);
                            }
                            this.f3389c.f3142a = 3;
                            continue;
                        case 4:
                            v();
                            continue;
                        case 5:
                            fragment.f3142a = 5;
                            continue;
                        case 6:
                            n();
                            continue;
                        default:
                            continue;
                    }
                }
            }
        } finally {
            this.f3390d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        if (FragmentManager.F0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3389c);
        }
        this.f3389c.l1();
        this.f3387a.f(this.f3389c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f3389c.f3143b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f3389c;
        fragment.f3144c = fragment.f3143b.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f3389c;
        fragment2.f3145d = fragment2.f3143b.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f3389c;
        fragment3.f3150i = fragment3.f3143b.getString("android:target_state");
        Fragment fragment4 = this.f3389c;
        if (fragment4.f3150i != null) {
            fragment4.f3151j = fragment4.f3143b.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f3389c;
        Boolean bool = fragment5.f3146e;
        if (bool != null) {
            fragment5.J = bool.booleanValue();
            this.f3389c.f3146e = null;
        } else {
            fragment5.J = fragment5.f3143b.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f3389c;
        if (fragment6.J) {
            return;
        }
        fragment6.I = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        if (FragmentManager.F0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3389c);
        }
        View w10 = this.f3389c.w();
        if (w10 != null && l(w10)) {
            boolean requestFocus = w10.requestFocus();
            if (FragmentManager.F0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(w10);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : b9.h.f16676t);
                sb.append(" on Fragment ");
                sb.append(this.f3389c);
                sb.append(" resulting in focused view ");
                sb.append(this.f3389c.H.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f3389c.F1(null);
        this.f3389c.p1();
        this.f3387a.i(this.f3389c, false);
        Fragment fragment = this.f3389c;
        fragment.f3143b = null;
        fragment.f3144c = null;
        fragment.f3145d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentState r() {
        FragmentState fragmentState = new FragmentState(this.f3389c);
        Fragment fragment = this.f3389c;
        if (fragment.f3142a > -1 && fragmentState.f3279m == null) {
            Bundle q10 = q();
            fragmentState.f3279m = q10;
            if (this.f3389c.f3150i != null) {
                if (q10 == null) {
                    fragmentState.f3279m = new Bundle();
                }
                fragmentState.f3279m.putString("android:target_state", this.f3389c.f3150i);
                int i10 = this.f3389c.f3151j;
                if (i10 != 0) {
                    fragmentState.f3279m.putInt("android:target_req_state", i10);
                }
            }
        } else {
            fragmentState.f3279m = fragment.f3143b;
        }
        return fragmentState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s() {
        if (this.f3389c.H == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f3389c.H.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f3389c.f3144c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f3389c.T.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f3389c.f3145d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i10) {
        this.f3391e = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
        if (FragmentManager.F0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3389c);
        }
        this.f3389c.r1();
        this.f3387a.k(this.f3389c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        if (FragmentManager.F0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3389c);
        }
        this.f3389c.s1();
        this.f3387a.l(this.f3389c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(j jVar, p pVar, ClassLoader classLoader, g gVar, FragmentState fragmentState) {
        this.f3387a = jVar;
        this.f3388b = pVar;
        Fragment a10 = gVar.a(classLoader, fragmentState.f3267a);
        this.f3389c = a10;
        Bundle bundle = fragmentState.f3276j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.E1(fragmentState.f3276j);
        a10.f3147f = fragmentState.f3268b;
        a10.f3155n = fragmentState.f3269c;
        a10.f3157p = true;
        a10.f3164w = fragmentState.f3270d;
        a10.f3165x = fragmentState.f3271e;
        a10.f3166y = fragmentState.f3272f;
        a10.B = fragmentState.f3273g;
        a10.f3154m = fragmentState.f3274h;
        a10.A = fragmentState.f3275i;
        a10.f3167z = fragmentState.f3277k;
        a10.R = i.b.values()[fragmentState.f3278l];
        Bundle bundle2 = fragmentState.f3279m;
        if (bundle2 != null) {
            a10.f3143b = bundle2;
        } else {
            a10.f3143b = new Bundle();
        }
        if (FragmentManager.F0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(j jVar, p pVar, Fragment fragment, FragmentState fragmentState) {
        this.f3387a = jVar;
        this.f3388b = pVar;
        this.f3389c = fragment;
        fragment.f3144c = null;
        fragment.f3145d = null;
        fragment.f3159r = 0;
        fragment.f3156o = false;
        fragment.f3153l = false;
        Fragment fragment2 = fragment.f3149h;
        fragment.f3150i = fragment2 != null ? fragment2.f3147f : null;
        fragment.f3149h = null;
        Bundle bundle = fragmentState.f3279m;
        if (bundle != null) {
            fragment.f3143b = bundle;
        } else {
            fragment.f3143b = new Bundle();
        }
    }
}
