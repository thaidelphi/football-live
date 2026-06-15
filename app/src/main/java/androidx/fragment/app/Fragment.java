package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.p, p0, androidx.lifecycle.h, u0.d {

    /* renamed from: a0  reason: collision with root package name */
    static final Object f3141a0 = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    private boolean F;
    ViewGroup G;
    View H;
    boolean I;
    e K;
    boolean M;
    boolean N;
    float O;
    LayoutInflater P;
    boolean Q;
    androidx.lifecycle.r S;
    u T;
    l0.b V;
    u0.c W;
    private int X;

    /* renamed from: b  reason: collision with root package name */
    Bundle f3143b;

    /* renamed from: c  reason: collision with root package name */
    SparseArray<Parcelable> f3144c;

    /* renamed from: d  reason: collision with root package name */
    Bundle f3145d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f3146e;

    /* renamed from: g  reason: collision with root package name */
    Bundle f3148g;

    /* renamed from: h  reason: collision with root package name */
    Fragment f3149h;

    /* renamed from: j  reason: collision with root package name */
    int f3151j;

    /* renamed from: l  reason: collision with root package name */
    boolean f3153l;

    /* renamed from: m  reason: collision with root package name */
    boolean f3154m;

    /* renamed from: n  reason: collision with root package name */
    boolean f3155n;

    /* renamed from: o  reason: collision with root package name */
    boolean f3156o;

    /* renamed from: p  reason: collision with root package name */
    boolean f3157p;

    /* renamed from: q  reason: collision with root package name */
    boolean f3158q;

    /* renamed from: r  reason: collision with root package name */
    int f3159r;

    /* renamed from: s  reason: collision with root package name */
    FragmentManager f3160s;

    /* renamed from: t  reason: collision with root package name */
    androidx.fragment.app.h<?> f3161t;

    /* renamed from: v  reason: collision with root package name */
    Fragment f3163v;

    /* renamed from: w  reason: collision with root package name */
    int f3164w;

    /* renamed from: x  reason: collision with root package name */
    int f3165x;

    /* renamed from: y  reason: collision with root package name */
    String f3166y;

    /* renamed from: z  reason: collision with root package name */
    boolean f3167z;

    /* renamed from: a  reason: collision with root package name */
    int f3142a = -1;

    /* renamed from: f  reason: collision with root package name */
    String f3147f = UUID.randomUUID().toString();

    /* renamed from: i  reason: collision with root package name */
    String f3150i = null;

    /* renamed from: k  reason: collision with root package name */
    private Boolean f3152k = null;

    /* renamed from: u  reason: collision with root package name */
    FragmentManager f3162u = new k();
    boolean E = true;
    boolean J = true;
    Runnable L = new a();
    i.b R = i.b.RESUMED;
    androidx.lifecycle.w<androidx.lifecycle.p> U = new androidx.lifecycle.w<>();
    private final AtomicInteger Y = new AtomicInteger();
    private final ArrayList<g> Z = new ArrayList<>();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.U1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.d(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f3171a;

        c(w wVar) {
            this.f3171a = wVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3171a.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d extends androidx.fragment.app.e {
        d() {
        }

        @Override // androidx.fragment.app.e
        public View c(int i10) {
            View view = Fragment.this.H;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.e
        public boolean d() {
            return Fragment.this.H != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        View f3174a;

        /* renamed from: b  reason: collision with root package name */
        Animator f3175b;

        /* renamed from: c  reason: collision with root package name */
        boolean f3176c;

        /* renamed from: d  reason: collision with root package name */
        int f3177d;

        /* renamed from: e  reason: collision with root package name */
        int f3178e;

        /* renamed from: f  reason: collision with root package name */
        int f3179f;

        /* renamed from: g  reason: collision with root package name */
        int f3180g;

        /* renamed from: h  reason: collision with root package name */
        int f3181h;

        /* renamed from: i  reason: collision with root package name */
        ArrayList<String> f3182i;

        /* renamed from: j  reason: collision with root package name */
        ArrayList<String> f3183j;

        /* renamed from: k  reason: collision with root package name */
        Object f3184k = null;

        /* renamed from: l  reason: collision with root package name */
        Object f3185l;

        /* renamed from: m  reason: collision with root package name */
        Object f3186m;

        /* renamed from: n  reason: collision with root package name */
        Object f3187n;

        /* renamed from: o  reason: collision with root package name */
        Object f3188o;

        /* renamed from: p  reason: collision with root package name */
        Object f3189p;

        /* renamed from: q  reason: collision with root package name */
        Boolean f3190q;

        /* renamed from: r  reason: collision with root package name */
        Boolean f3191r;

        /* renamed from: s  reason: collision with root package name */
        androidx.core.app.q f3192s;

        /* renamed from: t  reason: collision with root package name */
        androidx.core.app.q f3193t;

        /* renamed from: u  reason: collision with root package name */
        float f3194u;

        /* renamed from: v  reason: collision with root package name */
        View f3195v;

        /* renamed from: w  reason: collision with root package name */
        boolean f3196w;

        /* renamed from: x  reason: collision with root package name */
        h f3197x;

        /* renamed from: y  reason: collision with root package name */
        boolean f3198y;

        e() {
            Object obj = Fragment.f3141a0;
            this.f3185l = obj;
            this.f3186m = null;
            this.f3187n = obj;
            this.f3188o = null;
            this.f3189p = obj;
            this.f3194u = 1.0f;
            this.f3195v = null;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class f extends RuntimeException {
        public f(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static abstract class g {
        private g() {
        }

        abstract void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface h {
        void a();

        void b();
    }

    public Fragment() {
        Y();
    }

    private int B() {
        i.b bVar = this.R;
        if (bVar != i.b.INITIALIZED && this.f3163v != null) {
            return Math.min(bVar.ordinal(), this.f3163v.B());
        }
        return bVar.ordinal();
    }

    private void Y() {
        this.S = new androidx.lifecycle.r(this);
        this.W = u0.c.a(this);
        this.V = null;
    }

    @Deprecated
    public static Fragment a0(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = androidx.fragment.app.g.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.E1(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e8) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e8);
        } catch (InstantiationException e10) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (NoSuchMethodException e11) {
            throw new f("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e11);
        } catch (InvocationTargetException e12) {
            throw new f("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e12);
        }
    }

    private e g() {
        if (this.K == null) {
            this.K = new e();
        }
        return this.K;
    }

    private void z1() {
        if (FragmentManager.F0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.H != null) {
            A1(this.f3143b);
        }
        this.f3143b = null;
    }

    @Deprecated
    public LayoutInflater A(Bundle bundle) {
        androidx.fragment.app.h<?> hVar = this.f3161t;
        if (hVar != null) {
            LayoutInflater i10 = hVar.i();
            androidx.core.view.g.b(i10, this.f3162u.u0());
            return i10;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void A0() {
        this.F = true;
    }

    final void A1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f3144c;
        if (sparseArray != null) {
            this.H.restoreHierarchyState(sparseArray);
            this.f3144c = null;
        }
        if (this.H != null) {
            this.T.d(this.f3145d);
            this.f3145d = null;
        }
        this.F = false;
        V0(bundle);
        if (this.F) {
            if (this.H != null) {
                this.T.a(i.a.ON_CREATE);
                return;
            }
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    public void B0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B1(View view) {
        g().f3174a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int C() {
        e eVar = this.K;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3181h;
    }

    public void C0() {
        this.F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C1(int i10, int i11, int i12, int i13) {
        if (this.K == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        g().f3177d = i10;
        g().f3178e = i11;
        g().f3179f = i12;
        g().f3180g = i13;
    }

    public final Fragment D() {
        return this.f3163v;
    }

    public void D0() {
        this.F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D1(Animator animator) {
        g().f3175b = animator;
    }

    public final FragmentManager E() {
        FragmentManager fragmentManager = this.f3160s;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public LayoutInflater E0(Bundle bundle) {
        return A(bundle);
    }

    public void E1(Bundle bundle) {
        if (this.f3160s != null && m0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f3148g = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean F() {
        e eVar = this.K;
        if (eVar == null) {
            return false;
        }
        return eVar.f3176c;
    }

    public void F0(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F1(View view) {
        g().f3195v = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int G() {
        e eVar = this.K;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3179f;
    }

    @Deprecated
    public void G0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
    }

    public void G1(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            if (!b0() || d0()) {
                return;
            }
            this.f3161t.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int H() {
        e eVar = this.K;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3180g;
    }

    public void H0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
        androidx.fragment.app.h<?> hVar = this.f3161t;
        Activity e8 = hVar == null ? null : hVar.e();
        if (e8 != null) {
            this.F = false;
            G0(e8, attributeSet, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H1(boolean z10) {
        g().f3198y = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float I() {
        e eVar = this.K;
        if (eVar == null) {
            return 1.0f;
        }
        return eVar.f3194u;
    }

    public void I0(boolean z10) {
    }

    public void I1(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            if (this.D && b0() && !d0()) {
                this.f3161t.m();
            }
        }
    }

    public Object J() {
        e eVar = this.K;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f3187n;
        return obj == f3141a0 ? u() : obj;
    }

    public boolean J0(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J1(int i10) {
        if (this.K == null && i10 == 0) {
            return;
        }
        g();
        this.K.f3181h = i10;
    }

    public final Resources K() {
        return w1().getResources();
    }

    public void K0(Menu menu) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K1(h hVar) {
        g();
        e eVar = this.K;
        h hVar2 = eVar.f3197x;
        if (hVar == hVar2) {
            return;
        }
        if (hVar != null && hVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (eVar.f3196w) {
            eVar.f3197x = hVar;
        }
        if (hVar != null) {
            hVar.a();
        }
    }

    @Deprecated
    public final boolean L() {
        return this.B;
    }

    public void L0() {
        this.F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L1(boolean z10) {
        if (this.K == null) {
            return;
        }
        g().f3176c = z10;
    }

    public Object M() {
        e eVar = this.K;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f3185l;
        return obj == f3141a0 ? r() : obj;
    }

    public void M0(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M1(float f10) {
        g().f3194u = f10;
    }

    public Object N() {
        e eVar = this.K;
        if (eVar == null) {
            return null;
        }
        return eVar.f3188o;
    }

    public void N0(Menu menu) {
    }

    @Deprecated
    public void N1(boolean z10) {
        this.B = z10;
        FragmentManager fragmentManager = this.f3160s;
        if (fragmentManager == null) {
            this.C = true;
        } else if (z10) {
            fragmentManager.i(this);
        } else {
            fragmentManager.d1(this);
        }
    }

    public Object O() {
        e eVar = this.K;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f3189p;
        return obj == f3141a0 ? N() : obj;
    }

    public void O0(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        g();
        e eVar = this.K;
        eVar.f3182i = arrayList;
        eVar.f3183j = arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> P() {
        ArrayList<String> arrayList;
        e eVar = this.K;
        return (eVar == null || (arrayList = eVar.f3182i) == null) ? new ArrayList<>() : arrayList;
    }

    @Deprecated
    public void P0(int i10, String[] strArr, int[] iArr) {
    }

    @Deprecated
    public void P1(boolean z10) {
        if (!this.J && z10 && this.f3142a < 5 && this.f3160s != null && b0() && this.Q) {
            FragmentManager fragmentManager = this.f3160s;
            fragmentManager.U0(fragmentManager.w(this));
        }
        this.J = z10;
        this.I = this.f3142a < 5 && !z10;
        if (this.f3143b != null) {
            this.f3146e = Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> Q() {
        ArrayList<String> arrayList;
        e eVar = this.K;
        return (eVar == null || (arrayList = eVar.f3183j) == null) ? new ArrayList<>() : arrayList;
    }

    public void Q0() {
        this.F = true;
    }

    public void Q1(@SuppressLint({"UnknownNullness"}) Intent intent) {
        R1(intent, null);
    }

    public final String R(int i10) {
        return K().getString(i10);
    }

    public void R0(Bundle bundle) {
    }

    public void R1(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        androidx.fragment.app.h<?> hVar = this.f3161t;
        if (hVar != null) {
            hVar.k(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final String S() {
        return this.f3166y;
    }

    public void S0() {
        this.F = true;
    }

    @Deprecated
    public void S1(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (this.f3161t != null) {
            E().L0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public final Fragment T() {
        String str;
        Fragment fragment = this.f3149h;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.f3160s;
        if (fragmentManager == null || (str = this.f3150i) == null) {
            return null;
        }
        return fragmentManager.g0(str);
    }

    public void T0() {
        this.F = true;
    }

    @Deprecated
    public void T1(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.f3161t != null) {
            if (FragmentManager.F0(2)) {
                Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i10 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
            }
            E().M0(this, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public final int U() {
        return this.f3151j;
    }

    public void U0(View view, Bundle bundle) {
    }

    public void U1() {
        if (this.K == null || !g().f3196w) {
            return;
        }
        if (this.f3161t == null) {
            g().f3196w = false;
        } else if (Looper.myLooper() != this.f3161t.g().getLooper()) {
            this.f3161t.g().postAtFrontOfQueue(new b());
        } else {
            d(true);
        }
    }

    @Deprecated
    public boolean V() {
        return this.J;
    }

    public void V0(Bundle bundle) {
        this.F = true;
    }

    public void V1(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public View W() {
        return this.H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W0(Bundle bundle) {
        this.f3162u.S0();
        this.f3142a = 3;
        this.F = false;
        p0(bundle);
        if (this.F) {
            z1();
            this.f3162u.z();
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public LiveData<androidx.lifecycle.p> X() {
        return this.U;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X0() {
        Iterator<g> it = this.Z.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.Z.clear();
        this.f3162u.k(this.f3161t, e(), this);
        this.f3142a = 0;
        this.F = false;
        s0(this.f3161t.f());
        if (this.F) {
            this.f3160s.J(this);
            this.f3162u.A();
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f3162u.B(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z() {
        Y();
        this.f3147f = UUID.randomUUID().toString();
        this.f3153l = false;
        this.f3154m = false;
        this.f3155n = false;
        this.f3156o = false;
        this.f3157p = false;
        this.f3159r = 0;
        this.f3160s = null;
        this.f3162u = new k();
        this.f3161t = null;
        this.f3164w = 0;
        this.f3165x = 0;
        this.f3166y = null;
        this.f3167z = false;
        this.A = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean Z0(MenuItem menuItem) {
        if (this.f3167z) {
            return false;
        }
        if (u0(menuItem)) {
            return true;
        }
        return this.f3162u.C(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a1(Bundle bundle) {
        this.f3162u.S0();
        this.f3142a = 1;
        this.F = false;
        if (Build.VERSION.SDK_INT >= 19) {
            this.S.a(new androidx.lifecycle.m() { // from class: androidx.fragment.app.Fragment.5
                @Override // androidx.lifecycle.m
                public void onStateChanged(androidx.lifecycle.p pVar, i.a aVar) {
                    View view;
                    if (aVar != i.a.ON_STOP || (view = Fragment.this.H) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
        this.W.d(bundle);
        v0(bundle);
        this.Q = true;
        if (this.F) {
            this.S.i(i.a.ON_CREATE);
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final boolean b0() {
        return this.f3161t != null && this.f3153l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b1(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.f3167z) {
            return false;
        }
        if (this.D && this.E) {
            z10 = true;
            y0(menu, menuInflater);
        }
        return z10 | this.f3162u.E(menu, menuInflater);
    }

    public final boolean c0() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3162u.S0();
        this.f3158q = true;
        this.T = new u(this, getViewModelStore());
        View z02 = z0(layoutInflater, viewGroup, bundle);
        this.H = z02;
        if (z02 != null) {
            this.T.b();
            q0.a(this.H, this.T);
            r0.a(this.H, this.T);
            u0.e.a(this.H, this.T);
            this.U.j(this.T);
        } else if (!this.T.c()) {
            this.T = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    void d(boolean z10) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        e eVar = this.K;
        h hVar = null;
        if (eVar != null) {
            eVar.f3196w = false;
            h hVar2 = eVar.f3197x;
            eVar.f3197x = null;
            hVar = hVar2;
        }
        if (hVar != null) {
            hVar.b();
        } else if (!FragmentManager.P || this.H == null || (viewGroup = this.G) == null || (fragmentManager = this.f3160s) == null) {
        } else {
            w n10 = w.n(viewGroup, fragmentManager);
            n10.p();
            if (z10) {
                this.f3161t.g().post(new c(n10));
            } else {
                n10.g();
            }
        }
    }

    public final boolean d0() {
        return this.f3167z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d1() {
        this.f3162u.F();
        this.S.i(i.a.ON_DESTROY);
        this.f3142a = 0;
        this.F = false;
        this.Q = false;
        A0();
        if (this.F) {
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.e e() {
        return new d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e0() {
        e eVar = this.K;
        if (eVar == null) {
            return false;
        }
        return eVar.f3198y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e1() {
        this.f3162u.G();
        if (this.H != null && this.T.getLifecycle().b().b(i.b.CREATED)) {
            this.T.a(i.a.ON_DESTROY);
        }
        this.f3142a = 1;
        this.F = false;
        C0();
        if (this.F) {
            androidx.loader.app.a.b(this).c();
            this.f3158q = false;
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f3164w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f3165x));
        printWriter.print(" mTag=");
        printWriter.println(this.f3166y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f3142a);
        printWriter.print(" mWho=");
        printWriter.print(this.f3147f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f3159r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f3153l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f3154m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f3155n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f3156o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f3167z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.J);
        if (this.f3160s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f3160s);
        }
        if (this.f3161t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f3161t);
        }
        if (this.f3163v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f3163v);
        }
        if (this.f3148g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f3148g);
        }
        if (this.f3143b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f3143b);
        }
        if (this.f3144c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f3144c);
        }
        if (this.f3145d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f3145d);
        }
        Fragment T = T();
        if (T != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(T);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f3151j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(F());
        if (q() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(q());
        }
        if (t() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(t());
        }
        if (G() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(G());
        }
        if (H() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(H());
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.H);
        }
        if (l() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(l());
        }
        if (p() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f3162u + ":");
        FragmentManager fragmentManager = this.f3162u;
        fragmentManager.X(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f0() {
        return this.f3159r > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f1() {
        this.f3142a = -1;
        this.F = false;
        D0();
        this.P = null;
        if (this.F) {
            if (this.f3162u.E0()) {
                return;
            }
            this.f3162u.F();
            this.f3162u = new k();
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onDetach()");
    }

    public final boolean g0() {
        return this.f3156o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater g1(Bundle bundle) {
        LayoutInflater E0 = E0(bundle);
        this.P = E0;
        return E0;
    }

    @Override // androidx.lifecycle.h
    public /* synthetic */ k0.a getDefaultViewModelCreationExtras() {
        return androidx.lifecycle.g.a(this);
    }

    @Override // androidx.lifecycle.p
    public androidx.lifecycle.i getLifecycle() {
        return this.S;
    }

    @Override // u0.d
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.W.b();
    }

    @Override // androidx.lifecycle.p0
    public o0 getViewModelStore() {
        if (this.f3160s != null) {
            if (B() != i.b.INITIALIZED.ordinal()) {
                return this.f3160s.A0(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment h(String str) {
        return str.equals(this.f3147f) ? this : this.f3162u.j0(str);
    }

    public final boolean h0() {
        FragmentManager fragmentManager;
        return this.E && ((fragmentManager = this.f3160s) == null || fragmentManager.H0(this.f3163v));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h1() {
        onLowMemory();
        this.f3162u.H();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final FragmentActivity i() {
        androidx.fragment.app.h<?> hVar = this.f3161t;
        if (hVar == null) {
            return null;
        }
        return (FragmentActivity) hVar.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i0() {
        e eVar = this.K;
        if (eVar == null) {
            return false;
        }
        return eVar.f3196w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i1(boolean z10) {
        I0(z10);
        this.f3162u.I(z10);
    }

    public boolean j() {
        Boolean bool;
        e eVar = this.K;
        if (eVar == null || (bool = eVar.f3191r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean j0() {
        return this.f3154m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j1(MenuItem menuItem) {
        if (this.f3167z) {
            return false;
        }
        if (this.D && this.E && J0(menuItem)) {
            return true;
        }
        return this.f3162u.K(menuItem);
    }

    public boolean k() {
        Boolean bool;
        e eVar = this.K;
        if (eVar == null || (bool = eVar.f3190q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k0() {
        Fragment D = D();
        return D != null && (D.j0() || D.k0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k1(Menu menu) {
        if (this.f3167z) {
            return;
        }
        if (this.D && this.E) {
            K0(menu);
        }
        this.f3162u.L(menu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View l() {
        e eVar = this.K;
        if (eVar == null) {
            return null;
        }
        return eVar.f3174a;
    }

    public final boolean l0() {
        return this.f3142a >= 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l1() {
        this.f3162u.N();
        if (this.H != null) {
            this.T.a(i.a.ON_PAUSE);
        }
        this.S.i(i.a.ON_PAUSE);
        this.f3142a = 6;
        this.F = false;
        L0();
        if (this.F) {
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onPause()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Animator m() {
        e eVar = this.K;
        if (eVar == null) {
            return null;
        }
        return eVar.f3175b;
    }

    public final boolean m0() {
        FragmentManager fragmentManager = this.f3160s;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.K0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m1(boolean z10) {
        M0(z10);
        this.f3162u.O(z10);
    }

    public final Bundle n() {
        return this.f3148g;
    }

    public final boolean n0() {
        View view;
        return (!b0() || d0() || (view = this.H) == null || view.getWindowToken() == null || this.H.getVisibility() != 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n1(Menu menu) {
        boolean z10 = false;
        if (this.f3167z) {
            return false;
        }
        if (this.D && this.E) {
            z10 = true;
            N0(menu);
        }
        return z10 | this.f3162u.P(menu);
    }

    public final FragmentManager o() {
        if (this.f3161t != null) {
            return this.f3162u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o0() {
        this.f3162u.S0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o1() {
        boolean I0 = this.f3160s.I0(this);
        Boolean bool = this.f3152k;
        if (bool == null || bool.booleanValue() != I0) {
            this.f3152k = Boolean.valueOf(I0);
            O0(I0);
            this.f3162u.Q();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        v1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.F = true;
    }

    public Context p() {
        androidx.fragment.app.h<?> hVar = this.f3161t;
        if (hVar == null) {
            return null;
        }
        return hVar.f();
    }

    @Deprecated
    public void p0(Bundle bundle) {
        this.F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p1() {
        this.f3162u.S0();
        this.f3162u.b0(true);
        this.f3142a = 7;
        this.F = false;
        Q0();
        if (this.F) {
            androidx.lifecycle.r rVar = this.S;
            i.a aVar = i.a.ON_RESUME;
            rVar.i(aVar);
            if (this.H != null) {
                this.T.a(aVar);
            }
            this.f3162u.R();
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onResume()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        e eVar = this.K;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3177d;
    }

    @Deprecated
    public void q0(int i10, int i11, Intent intent) {
        if (FragmentManager.F0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q1(Bundle bundle) {
        R0(bundle);
        this.W.e(bundle);
        Parcelable h12 = this.f3162u.h1();
        if (h12 != null) {
            bundle.putParcelable("android:support:fragments", h12);
        }
    }

    public Object r() {
        e eVar = this.K;
        if (eVar == null) {
            return null;
        }
        return eVar.f3184k;
    }

    @Deprecated
    public void r0(Activity activity) {
        this.F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r1() {
        this.f3162u.S0();
        this.f3162u.b0(true);
        this.f3142a = 5;
        this.F = false;
        S0();
        if (this.F) {
            androidx.lifecycle.r rVar = this.S;
            i.a aVar = i.a.ON_START;
            rVar.i(aVar);
            if (this.H != null) {
                this.T.a(aVar);
            }
            this.f3162u.S();
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onStart()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.core.app.q s() {
        e eVar = this.K;
        if (eVar == null) {
            return null;
        }
        return eVar.f3192s;
    }

    public void s0(Context context) {
        this.F = true;
        androidx.fragment.app.h<?> hVar = this.f3161t;
        Activity e8 = hVar == null ? null : hVar.e();
        if (e8 != null) {
            this.F = false;
            r0(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s1() {
        this.f3162u.U();
        if (this.H != null) {
            this.T.a(i.a.ON_STOP);
        }
        this.S.i(i.a.ON_STOP);
        this.f3142a = 4;
        this.F = false;
        T0();
        if (this.F) {
            return;
        }
        throw new y("Fragment " + this + " did not call through to super.onStop()");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        S1(intent, i10, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int t() {
        e eVar = this.K;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3178e;
    }

    @Deprecated
    public void t0(Fragment fragment) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t1() {
        U0(this.H, this.f3143b);
        this.f3162u.V();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f3147f);
        if (this.f3164w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3164w));
        }
        if (this.f3166y != null) {
            sb.append(" tag=");
            sb.append(this.f3166y);
        }
        sb.append(")");
        return sb.toString();
    }

    public Object u() {
        e eVar = this.K;
        if (eVar == null) {
            return null;
        }
        return eVar.f3186m;
    }

    public boolean u0(MenuItem menuItem) {
        return false;
    }

    public void u1(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.core.app.q v() {
        e eVar = this.K;
        if (eVar == null) {
            return null;
        }
        return eVar.f3193t;
    }

    public void v0(Bundle bundle) {
        this.F = true;
        y1(bundle);
        if (this.f3162u.J0(1)) {
            return;
        }
        this.f3162u.D();
    }

    public final FragmentActivity v1() {
        FragmentActivity i10 = i();
        if (i10 != null) {
            return i10;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View w() {
        e eVar = this.K;
        if (eVar == null) {
            return null;
        }
        return eVar.f3195v;
    }

    public Animation w0(int i10, boolean z10, int i11) {
        return null;
    }

    public final Context w1() {
        Context p10 = p();
        if (p10 != null) {
            return p10;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final FragmentManager x() {
        return this.f3160s;
    }

    public Animator x0(int i10, boolean z10, int i11) {
        return null;
    }

    public final View x1() {
        View W = W();
        if (W != null) {
            return W;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final Object y() {
        androidx.fragment.app.h<?> hVar = this.f3161t;
        if (hVar == null) {
            return null;
        }
        return hVar.h();
    }

    public void y0(Menu menu, MenuInflater menuInflater) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f3162u.f1(parcelable);
        this.f3162u.D();
    }

    public final int z() {
        return this.f3164w;
    }

    public View z0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.X;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }
}
