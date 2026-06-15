package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.q;
import androidx.fragment.app.r;
import androidx.lifecycle.i;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class FragmentManager {
    private static boolean O = false;
    static boolean P = true;
    private androidx.activity.result.b<IntentSenderRequest> A;
    private androidx.activity.result.b<String[]> B;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private ArrayList<androidx.fragment.app.a> I;
    private ArrayList<Boolean> J;
    private ArrayList<Fragment> K;
    private ArrayList<p> L;
    private androidx.fragment.app.l M;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3207b;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f3209d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Fragment> f3210e;

    /* renamed from: g  reason: collision with root package name */
    private OnBackPressedDispatcher f3212g;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<m> f3217l;

    /* renamed from: r  reason: collision with root package name */
    private androidx.fragment.app.h<?> f3223r;

    /* renamed from: s  reason: collision with root package name */
    private androidx.fragment.app.e f3224s;

    /* renamed from: t  reason: collision with root package name */
    private Fragment f3225t;

    /* renamed from: u  reason: collision with root package name */
    Fragment f3226u;

    /* renamed from: z  reason: collision with root package name */
    private androidx.activity.result.b<Intent> f3231z;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<n> f3206a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final androidx.fragment.app.p f3208c = new androidx.fragment.app.p();

    /* renamed from: f  reason: collision with root package name */
    private final androidx.fragment.app.i f3211f = new androidx.fragment.app.i(this);

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.j f3213h = new c(false);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicInteger f3214i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, Bundle> f3215j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, Object> f3216k = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    private Map<Fragment, HashSet<androidx.core.os.e>> f3218m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n  reason: collision with root package name */
    private final r.g f3219n = new d();

    /* renamed from: o  reason: collision with root package name */
    private final androidx.fragment.app.j f3220o = new androidx.fragment.app.j(this);

    /* renamed from: p  reason: collision with root package name */
    private final CopyOnWriteArrayList<androidx.fragment.app.m> f3221p = new CopyOnWriteArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    int f3222q = -1;

    /* renamed from: v  reason: collision with root package name */
    private androidx.fragment.app.g f3227v = null;

    /* renamed from: w  reason: collision with root package name */
    private androidx.fragment.app.g f3228w = new e();

    /* renamed from: x  reason: collision with root package name */
    private x f3229x = null;

    /* renamed from: y  reason: collision with root package name */
    private x f3230y = new f();
    ArrayDeque<LaunchedFragmentInfo> C = new ArrayDeque<>();
    private Runnable N = new g();

    /* renamed from: androidx.fragment.app.FragmentManager$6  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class AnonymousClass6 implements androidx.lifecycle.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f3232a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.n f3233b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.i f3234c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FragmentManager f3235d;

        @Override // androidx.lifecycle.m
        public void onStateChanged(androidx.lifecycle.p pVar, i.a aVar) {
            Bundle bundle;
            if (aVar == i.a.ON_START && (bundle = (Bundle) this.f3235d.f3215j.get(this.f3232a)) != null) {
                this.f3233b.a(this.f3232a, bundle);
                this.f3235d.r(this.f3232a);
            }
            if (aVar == i.a.ON_DESTROY) {
                this.f3234c.d(this);
                this.f3235d.f3216k.remove(this.f3232a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements androidx.activity.result.a<ActivityResult> {
        a() {
        }

        @Override // androidx.activity.result.a
        /* renamed from: b */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f3236a;
            int i10 = pollFirst.f3237b;
            Fragment i11 = FragmentManager.this.f3208c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i11.q0(i10, activityResult.b(), activityResult.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements androidx.activity.result.a<Map<String, Boolean>> {
        b() {
        }

        @Override // androidx.activity.result.a
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f3236a;
            int i11 = pollFirst.f3237b;
            Fragment i12 = FragmentManager.this.f3208c.i(str);
            if (i12 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i12.P0(i11, strArr, iArr);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c extends androidx.activity.j {
        c(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.j
        public void b() {
            FragmentManager.this.B0();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class d implements r.g {
        d() {
        }

        @Override // androidx.fragment.app.r.g
        public void a(Fragment fragment, androidx.core.os.e eVar) {
            if (eVar.b()) {
                return;
            }
            FragmentManager.this.a1(fragment, eVar);
        }

        @Override // androidx.fragment.app.r.g
        public void b(Fragment fragment, androidx.core.os.e eVar) {
            FragmentManager.this.f(fragment, eVar);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class e extends androidx.fragment.app.g {
        e() {
        }

        @Override // androidx.fragment.app.g
        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.t0().b(FragmentManager.this.t0().f(), str, null);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class f implements x {
        f() {
        }

        @Override // androidx.fragment.app.x
        public w a(ViewGroup viewGroup) {
            return new androidx.fragment.app.b(viewGroup);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.b0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3245a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3246b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f3247c;

        h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f3245a = viewGroup;
            this.f3246b = view;
            this.f3247c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3245a.endViewTransition(this.f3246b);
            animator.removeListener(this);
            Fragment fragment = this.f3247c;
            View view = fragment.H;
            if (view == null || !fragment.f3167z) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i implements androidx.fragment.app.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f3249a;

        i(Fragment fragment) {
            this.f3249a = fragment;
        }

        @Override // androidx.fragment.app.m
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.f3249a.t0(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class j implements androidx.activity.result.a<ActivityResult> {
        j() {
        }

        @Override // androidx.activity.result.a
        /* renamed from: b */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f3236a;
            int i10 = pollFirst.f3237b;
            Fragment i11 = FragmentManager.this.f3208c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i11.q0(i10, activityResult.b(), activityResult.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class k extends d.a<IntentSenderRequest, ActivityResult> {
        k() {
        }

        @Override // d.a
        /* renamed from: d */
        public Intent a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a10 = intentSenderRequest.a();
            if (a10 != null && (bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a10.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.a(intentSenderRequest.d()).b(null).c(intentSenderRequest.c(), intentSenderRequest.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.F0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // d.a
        /* renamed from: e */
        public ActivityResult c(int i10, Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class l {
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface m {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface n {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class o implements n {

        /* renamed from: a  reason: collision with root package name */
        final String f3252a;

        /* renamed from: b  reason: collision with root package name */
        final int f3253b;

        /* renamed from: c  reason: collision with root package name */
        final int f3254c;

        o(String str, int i10, int i11) {
            this.f3252a = str;
            this.f3253b = i10;
            this.f3254c = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f3226u;
            if (fragment == null || this.f3253b >= 0 || this.f3252a != null || !fragment.o().W0()) {
                return FragmentManager.this.Y0(arrayList, arrayList2, this.f3252a, this.f3253b, this.f3254c);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class p implements Fragment.h {

        /* renamed from: a  reason: collision with root package name */
        final boolean f3256a;

        /* renamed from: b  reason: collision with root package name */
        final androidx.fragment.app.a f3257b;

        /* renamed from: c  reason: collision with root package name */
        private int f3258c;

        p(androidx.fragment.app.a aVar, boolean z10) {
            this.f3256a = z10;
            this.f3257b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.h
        public void a() {
            this.f3258c++;
        }

        @Override // androidx.fragment.app.Fragment.h
        public void b() {
            int i10 = this.f3258c - 1;
            this.f3258c = i10;
            if (i10 != 0) {
                return;
            }
            this.f3257b.f3280t.i1();
        }

        void c() {
            androidx.fragment.app.a aVar = this.f3257b;
            aVar.f3280t.u(aVar, this.f3256a, false, false);
        }

        void d() {
            boolean z10 = this.f3258c > 0;
            for (Fragment fragment : this.f3257b.f3280t.s0()) {
                fragment.K1(null);
                if (z10 && fragment.i0()) {
                    fragment.U1();
                }
            }
            androidx.fragment.app.a aVar = this.f3257b;
            aVar.f3280t.u(aVar, this.f3256a, !z10, true);
        }

        public boolean e() {
            return this.f3258c == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean F0(int i10) {
        return O || Log.isLoggable("FragmentManager", i10);
    }

    private boolean G0(Fragment fragment) {
        return (fragment.D && fragment.E) || fragment.f3162u.o();
    }

    private void M(Fragment fragment) {
        if (fragment == null || !fragment.equals(g0(fragment.f3147f))) {
            return;
        }
        fragment.o1();
    }

    private void N0(androidx.collection.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment h10 = bVar.h(i10);
            if (!h10.f3153l) {
                View x12 = h10.x1();
                h10.O = x12.getAlpha();
                x12.setAlpha(0.0f);
            }
        }
    }

    private void T(int i10) {
        try {
            this.f3207b = true;
            this.f3208c.d(i10);
            P0(i10, false);
            if (P) {
                for (w wVar : s()) {
                    wVar.j();
                }
            }
            this.f3207b = false;
            b0(true);
        } catch (Throwable th) {
            this.f3207b = false;
            throw th;
        }
    }

    private void W() {
        if (this.H) {
            this.H = false;
            o1();
        }
    }

    private boolean X0(String str, int i10, int i11) {
        b0(false);
        a0(true);
        Fragment fragment = this.f3226u;
        if (fragment == null || i10 >= 0 || str != null || !fragment.o().W0()) {
            boolean Y0 = Y0(this.I, this.J, str, i10, i11);
            if (Y0) {
                this.f3207b = true;
                try {
                    c1(this.I, this.J);
                } finally {
                    q();
                }
            }
            p1();
            W();
            this.f3208c.b();
            return Y0;
        }
        return true;
    }

    private void Y() {
        if (P) {
            for (w wVar : s()) {
                wVar.j();
            }
        } else if (!this.f3218m.isEmpty()) {
            for (Fragment fragment : this.f3218m.keySet()) {
                n(fragment);
                Q0(fragment);
            }
        }
    }

    private int Z0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, androidx.collection.b<Fragment> bVar) {
        int i12 = i11;
        for (int i13 = i11 - 1; i13 >= i10; i13--) {
            androidx.fragment.app.a aVar = arrayList.get(i13);
            boolean booleanValue = arrayList2.get(i13).booleanValue();
            if (aVar.A() && !aVar.y(arrayList, i13 + 1, i11)) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                p pVar = new p(aVar, booleanValue);
                this.L.add(pVar);
                aVar.C(pVar);
                if (booleanValue) {
                    aVar.t();
                } else {
                    aVar.u(false);
                }
                i12--;
                if (i13 != i12) {
                    arrayList.remove(i13);
                    arrayList.add(i12, aVar);
                }
                d(bVar);
            }
        }
        return i12;
    }

    private void a0(boolean z10) {
        if (!this.f3207b) {
            if (this.f3223r == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f3223r.g().getLooper()) {
                if (!z10) {
                    p();
                }
                if (this.I == null) {
                    this.I = new ArrayList<>();
                    this.J = new ArrayList<>();
                }
                this.f3207b = true;
                try {
                    f0(null, null);
                    return;
                } finally {
                    this.f3207b = false;
                }
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    private void c1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            f0(arrayList, arrayList2);
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                if (!arrayList.get(i10).f3415r) {
                    if (i11 != i10) {
                        e0(arrayList, arrayList2, i11, i10);
                    }
                    i11 = i10 + 1;
                    if (arrayList2.get(i10).booleanValue()) {
                        while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f3415r) {
                            i11++;
                        }
                    }
                    e0(arrayList, arrayList2, i10, i11);
                    i10 = i11 - 1;
                }
                i10++;
            }
            if (i11 != size) {
                e0(arrayList, arrayList2, i11, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    private void d(androidx.collection.b<Fragment> bVar) {
        int i10 = this.f3222q;
        if (i10 < 1) {
            return;
        }
        int min = Math.min(i10, 5);
        for (Fragment fragment : this.f3208c.n()) {
            if (fragment.f3142a < min) {
                R0(fragment, min);
                if (fragment.H != null && !fragment.f3167z && fragment.M) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private static void d0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                aVar.p(-1);
                aVar.u(i10 == i11 + (-1));
            } else {
                aVar.p(1);
                aVar.t();
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01be  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e0(java.util.ArrayList<androidx.fragment.app.a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.e0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private void e1() {
        if (this.f3217l != null) {
            for (int i10 = 0; i10 < this.f3217l.size(); i10++) {
                this.f3217l.get(i10).a();
            }
        }
    }

    private void f0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<p> arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar = this.L.get(i10);
            if (arrayList != null && !pVar.f3256a && (indexOf2 = arrayList.indexOf(pVar.f3257b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.L.remove(i10);
                i10--;
                size--;
                pVar.c();
            } else if (pVar.e() || (arrayList != null && pVar.f3257b.y(arrayList, 0, arrayList.size()))) {
                this.L.remove(i10);
                i10--;
                size--;
                if (arrayList != null && !pVar.f3256a && (indexOf = arrayList.indexOf(pVar.f3257b)) != -1 && arrayList2 != null && arrayList2.get(indexOf).booleanValue()) {
                    pVar.c();
                } else {
                    pVar.d();
                }
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g1(int i10) {
        if (i10 != 4097) {
            if (i10 != 4099) {
                return i10 != 8194 ? 0 : 4097;
            }
            return 4099;
        }
        return 8194;
    }

    private void k0() {
        if (P) {
            for (w wVar : s()) {
                wVar.k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }

    private boolean l0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3206a) {
            if (this.f3206a.isEmpty()) {
                return false;
            }
            int size = this.f3206a.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                z10 |= this.f3206a.get(i10).a(arrayList, arrayList2);
            }
            this.f3206a.clear();
            this.f3223r.g().removeCallbacks(this.N);
            return z10;
        }
    }

    private void m1(Fragment fragment) {
        ViewGroup p02 = p0(fragment);
        if (p02 == null || fragment.q() + fragment.t() + fragment.G() + fragment.H() <= 0) {
            return;
        }
        int i10 = g0.b.f25684c;
        if (p02.getTag(i10) == null) {
            p02.setTag(i10, fragment);
        }
        ((Fragment) p02.getTag(i10)).L1(fragment.F());
    }

    private void n(Fragment fragment) {
        HashSet<androidx.core.os.e> hashSet = this.f3218m.get(fragment);
        if (hashSet != null) {
            Iterator<androidx.core.os.e> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            x(fragment);
            this.f3218m.remove(fragment);
        }
    }

    private androidx.fragment.app.l n0(Fragment fragment) {
        return this.M.i(fragment);
    }

    private void o1() {
        for (androidx.fragment.app.o oVar : this.f3208c.k()) {
            U0(oVar);
        }
    }

    private void p() {
        if (K0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private ViewGroup p0(Fragment fragment) {
        ViewGroup viewGroup = fragment.G;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f3165x > 0 && this.f3224s.d()) {
            View c10 = this.f3224s.c(fragment.f3165x);
            if (c10 instanceof ViewGroup) {
                return (ViewGroup) c10;
            }
        }
        return null;
    }

    private void p1() {
        synchronized (this.f3206a) {
            boolean z10 = true;
            if (!this.f3206a.isEmpty()) {
                this.f3213h.f(true);
            } else {
                this.f3213h.f((m0() <= 0 || !I0(this.f3225t)) ? false : false);
            }
        }
    }

    private void q() {
        this.f3207b = false;
        this.J.clear();
        this.I.clear();
    }

    private Set<w> s() {
        HashSet hashSet = new HashSet();
        for (androidx.fragment.app.o oVar : this.f3208c.k()) {
            ViewGroup viewGroup = oVar.k().G;
            if (viewGroup != null) {
                hashSet.add(w.o(viewGroup, y0()));
            }
        }
        return hashSet;
    }

    private Set<w> t(ArrayList<androidx.fragment.app.a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<q.a> it = arrayList.get(i10).f3400c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f3418b;
                if (fragment != null && (viewGroup = fragment.G) != null) {
                    hashSet.add(w.n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    private void v(Fragment fragment) {
        Animator animator;
        if (fragment.H != null) {
            d.C0059d c10 = androidx.fragment.app.d.c(this.f3223r.f(), fragment, !fragment.f3167z, fragment.F());
            if (c10 != null && (animator = c10.f3359b) != null) {
                animator.setTarget(fragment.H);
                if (fragment.f3167z) {
                    if (fragment.e0()) {
                        fragment.H1(false);
                    } else {
                        ViewGroup viewGroup = fragment.G;
                        View view = fragment.H;
                        viewGroup.startViewTransition(view);
                        c10.f3359b.addListener(new h(viewGroup, view, fragment));
                    }
                } else {
                    fragment.H.setVisibility(0);
                }
                c10.f3359b.start();
            } else {
                if (c10 != null) {
                    fragment.H.startAnimation(c10.f3358a);
                    c10.f3358a.start();
                }
                fragment.H.setVisibility((!fragment.f3167z || fragment.e0()) ? 0 : 8);
                if (fragment.e0()) {
                    fragment.H1(false);
                }
            }
        }
        D0(fragment);
        fragment.N = false;
        fragment.F0(fragment.f3167z);
    }

    private void x(Fragment fragment) {
        fragment.e1();
        this.f3220o.n(fragment, false);
        fragment.G = null;
        fragment.H = null;
        fragment.T = null;
        fragment.U.j(null);
        fragment.f3156o = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Fragment z0(View view) {
        Object tag = view.getTag(g0.b.f25682a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0 A0(Fragment fragment) {
        return this.M.l(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(Configuration configuration) {
        for (Fragment fragment : this.f3208c.n()) {
            if (fragment != null) {
                fragment.Y0(configuration);
            }
        }
    }

    void B0() {
        b0(true);
        if (this.f3213h.c()) {
            W0();
        } else {
            this.f3212g.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean C(MenuItem menuItem) {
        if (this.f3222q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3208c.n()) {
            if (fragment != null && fragment.Z0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C0(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.f3167z) {
            return;
        }
        fragment.f3167z = true;
        fragment.N = true ^ fragment.N;
        m1(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D0(Fragment fragment) {
        if (fragment.f3153l && G0(fragment)) {
            this.D = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean E(Menu menu, MenuInflater menuInflater) {
        if (this.f3222q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f3208c.n()) {
            if (fragment != null && H0(fragment) && fragment.b1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f3210e != null) {
            for (int i10 = 0; i10 < this.f3210e.size(); i10++) {
                Fragment fragment2 = this.f3210e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.B0();
                }
            }
        }
        this.f3210e = arrayList;
        return z10;
    }

    public boolean E0() {
        return this.G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F() {
        this.G = true;
        b0(true);
        Y();
        T(-1);
        this.f3223r = null;
        this.f3224s = null;
        this.f3225t = null;
        if (this.f3212g != null) {
            this.f3213h.d();
            this.f3212g = null;
        }
        androidx.activity.result.b<Intent> bVar = this.f3231z;
        if (bVar != null) {
            bVar.c();
            this.A.c();
            this.B.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G() {
        T(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        for (Fragment fragment : this.f3208c.n()) {
            if (fragment != null) {
                fragment.h1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(boolean z10) {
        for (Fragment fragment : this.f3208c.n()) {
            if (fragment != null) {
                fragment.i1(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean I0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.f3160s;
        return fragment.equals(fragmentManager.x0()) && I0(fragmentManager.f3225t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(Fragment fragment) {
        Iterator<androidx.fragment.app.m> it = this.f3221p.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean J0(int i10) {
        return this.f3222q >= i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean K(MenuItem menuItem) {
        if (this.f3222q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3208c.n()) {
            if (fragment != null && fragment.j1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean K0() {
        return this.E || this.F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(Menu menu) {
        if (this.f3222q < 1) {
            return;
        }
        for (Fragment fragment : this.f3208c.n()) {
            if (fragment != null) {
                fragment.k1(menu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (this.f3231z != null) {
            this.C.addLast(new LaunchedFragmentInfo(fragment.f3147f, i10));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f3231z.a(intent);
            return;
        }
        this.f3223r.k(fragment, intent, i10, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M0(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.A != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (F0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            } else {
                intent2 = intent;
            }
            IntentSenderRequest a10 = new IntentSenderRequest.a(intentSender).b(intent2).c(i12, i11).a();
            this.C.addLast(new LaunchedFragmentInfo(fragment.f3147f, i10));
            if (F0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.A.a(a10);
            return;
        }
        this.f3223r.l(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N() {
        T(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(boolean z10) {
        for (Fragment fragment : this.f3208c.n()) {
            if (fragment != null) {
                fragment.m1(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O0(Fragment fragment) {
        if (!this.f3208c.c(fragment.f3147f)) {
            if (F0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f3222q + "since it is not added to " + this);
                return;
            }
            return;
        }
        Q0(fragment);
        View view = fragment.H;
        if (view != null && fragment.M && fragment.G != null) {
            float f10 = fragment.O;
            if (f10 > 0.0f) {
                view.setAlpha(f10);
            }
            fragment.O = 0.0f;
            fragment.M = false;
            d.C0059d c10 = androidx.fragment.app.d.c(this.f3223r.f(), fragment, true, fragment.F());
            if (c10 != null) {
                Animation animation = c10.f3358a;
                if (animation != null) {
                    fragment.H.startAnimation(animation);
                } else {
                    c10.f3359b.setTarget(fragment.H);
                    c10.f3359b.start();
                }
            }
        }
        if (fragment.N) {
            v(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean P(Menu menu) {
        boolean z10 = false;
        if (this.f3222q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3208c.n()) {
            if (fragment != null && H0(fragment) && fragment.n1(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P0(int i10, boolean z10) {
        androidx.fragment.app.h<?> hVar;
        if (this.f3223r == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f3222q) {
            this.f3222q = i10;
            if (P) {
                this.f3208c.r();
            } else {
                for (Fragment fragment : this.f3208c.n()) {
                    O0(fragment);
                }
                for (androidx.fragment.app.o oVar : this.f3208c.k()) {
                    Fragment k10 = oVar.k();
                    if (!k10.M) {
                        O0(k10);
                    }
                    if (k10.f3154m && !k10.f0()) {
                        this.f3208c.q(oVar);
                    }
                }
            }
            o1();
            if (this.D && (hVar = this.f3223r) != null && this.f3222q == 7) {
                hVar.m();
                this.D = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q() {
        p1();
        M(this.f3226u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q0(Fragment fragment) {
        R0(fragment, this.f3222q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r2 != 5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void R0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.R0(androidx.fragment.app.Fragment, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S0() {
        if (this.f3223r == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.M.o(false);
        for (Fragment fragment : this.f3208c.n()) {
            if (fragment != null) {
                fragment.o0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T0(FragmentContainerView fragmentContainerView) {
        View view;
        for (androidx.fragment.app.o oVar : this.f3208c.k()) {
            Fragment k10 = oVar.k();
            if (k10.f3165x == fragmentContainerView.getId() && (view = k10.H) != null && view.getParent() == null) {
                k10.G = fragmentContainerView;
                oVar.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U() {
        this.F = true;
        this.M.o(true);
        T(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U0(androidx.fragment.app.o oVar) {
        Fragment k10 = oVar.k();
        if (k10.I) {
            if (this.f3207b) {
                this.H = true;
                return;
            }
            k10.I = false;
            if (P) {
                oVar.m();
            } else {
                Q0(k10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V() {
        T(2);
    }

    public void V0(int i10, int i11) {
        if (i10 >= 0) {
            Z(new o(null, i10, i11), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public boolean W0() {
        return X0(null, -1, 0);
    }

    public void X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3208c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f3210e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f3210e.get(i10).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f3209d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                androidx.fragment.app.a aVar = this.f3209d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.r(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3214i.get());
        synchronized (this.f3206a) {
            int size3 = this.f3206a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(this.f3206a.get(i12));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3223r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3224s);
        if (this.f3225t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3225t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3222q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    boolean Y0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int i12;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f3209d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3209d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i10 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f3209d.get(size2);
                    if ((str != null && str.equals(aVar.w())) || (i10 >= 0 && i10 == aVar.f3282v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i11 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f3209d.get(size2);
                        if (str == null || !str.equals(aVar2.w())) {
                            if (i10 < 0 || i10 != aVar2.f3282v) {
                                break;
                            }
                        }
                    }
                }
                i12 = size2;
            } else {
                i12 = -1;
            }
            if (i12 == this.f3209d.size() - 1) {
                return false;
            }
            for (int size3 = this.f3209d.size() - 1; size3 > i12; size3--) {
                arrayList.add(this.f3209d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(n nVar, boolean z10) {
        if (!z10) {
            if (this.f3223r == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            p();
        }
        synchronized (this.f3206a) {
            if (this.f3223r == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f3206a.add(nVar);
            i1();
        }
    }

    void a1(Fragment fragment, androidx.core.os.e eVar) {
        HashSet<androidx.core.os.e> hashSet = this.f3218m.get(fragment);
        if (hashSet != null && hashSet.remove(eVar) && hashSet.isEmpty()) {
            this.f3218m.remove(fragment);
            if (fragment.f3142a < 5) {
                x(fragment);
                Q0(fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b0(boolean z10) {
        a0(z10);
        boolean z11 = false;
        while (l0(this.I, this.J)) {
            this.f3207b = true;
            try {
                c1(this.I, this.J);
                q();
                z11 = true;
            } catch (Throwable th) {
                q();
                throw th;
            }
        }
        p1();
        W();
        this.f3208c.b();
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b1(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f3159r);
        }
        boolean z10 = !fragment.f0();
        if (!fragment.A || z10) {
            this.f3208c.s(fragment);
            if (G0(fragment)) {
                this.D = true;
            }
            fragment.f3154m = true;
            m1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0(n nVar, boolean z10) {
        if (z10 && (this.f3223r == null || this.G)) {
            return;
        }
        a0(z10);
        if (nVar.a(this.I, this.J)) {
            this.f3207b = true;
            try {
                c1(this.I, this.J);
            } finally {
                q();
            }
        }
        p1();
        W();
        this.f3208c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d1(Fragment fragment) {
        this.M.n(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(androidx.fragment.app.a aVar) {
        if (this.f3209d == null) {
            this.f3209d = new ArrayList<>();
        }
        this.f3209d.add(aVar);
    }

    void f(Fragment fragment, androidx.core.os.e eVar) {
        if (this.f3218m.get(fragment) == null) {
            this.f3218m.put(fragment, new HashSet<>());
        }
        this.f3218m.get(fragment).add(eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f1(Parcelable parcelable) {
        androidx.fragment.app.o oVar;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f3259a == null) {
            return;
        }
        this.f3208c.t();
        Iterator<FragmentState> it = fragmentManagerState.f3259a.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            if (next != null) {
                Fragment h10 = this.M.h(next.f3268b);
                if (h10 != null) {
                    if (F0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + h10);
                    }
                    oVar = new androidx.fragment.app.o(this.f3220o, this.f3208c, h10, next);
                } else {
                    oVar = new androidx.fragment.app.o(this.f3220o, this.f3208c, this.f3223r.f().getClassLoader(), q0(), next);
                }
                Fragment k10 = oVar.k();
                k10.f3160s = this;
                if (F0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k10.f3147f + "): " + k10);
                }
                oVar.o(this.f3223r.f().getClassLoader());
                this.f3208c.p(oVar);
                oVar.t(this.f3222q);
            }
        }
        for (Fragment fragment : this.M.k()) {
            if (!this.f3208c.c(fragment.f3147f)) {
                if (F0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f3259a);
                }
                this.M.n(fragment);
                fragment.f3160s = this;
                androidx.fragment.app.o oVar2 = new androidx.fragment.app.o(this.f3220o, this.f3208c, fragment);
                oVar2.t(1);
                oVar2.m();
                fragment.f3154m = true;
                oVar2.m();
            }
        }
        this.f3208c.u(fragmentManagerState.f3260b);
        if (fragmentManagerState.f3261c != null) {
            this.f3209d = new ArrayList<>(fragmentManagerState.f3261c.length);
            int i10 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f3261c;
                if (i10 >= backStackStateArr.length) {
                    break;
                }
                androidx.fragment.app.a a10 = backStackStateArr[i10].a(this);
                if (F0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + a10.f3282v + "): " + a10);
                    PrintWriter printWriter = new PrintWriter(new v("FragmentManager"));
                    a10.s("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3209d.add(a10);
                i10++;
            }
        } else {
            this.f3209d = null;
        }
        this.f3214i.set(fragmentManagerState.f3262d);
        String str = fragmentManagerState.f3263e;
        if (str != null) {
            Fragment g02 = g0(str);
            this.f3226u = g02;
            M(g02);
        }
        ArrayList<String> arrayList = fragmentManagerState.f3264f;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Bundle bundle = fragmentManagerState.f3265g.get(i11);
                bundle.setClassLoader(this.f3223r.f().getClassLoader());
                this.f3215j.put(arrayList.get(i11), bundle);
            }
        }
        this.C = new ArrayDeque<>(fragmentManagerState.f3266h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.o g(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        androidx.fragment.app.o w10 = w(fragment);
        fragment.f3160s = this;
        this.f3208c.p(w10);
        if (!fragment.A) {
            this.f3208c.a(fragment);
            fragment.f3154m = false;
            if (fragment.H == null) {
                fragment.N = false;
            }
            if (G0(fragment)) {
                this.D = true;
            }
        }
        return w10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment g0(String str) {
        return this.f3208c.f(str);
    }

    public void h(androidx.fragment.app.m mVar) {
        this.f3221p.add(mVar);
    }

    public Fragment h0(int i10) {
        return this.f3208c.g(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Parcelable h1() {
        int size;
        k0();
        Y();
        b0(true);
        this.E = true;
        this.M.o(true);
        ArrayList<FragmentState> v10 = this.f3208c.v();
        BackStackState[] backStackStateArr = null;
        if (v10.isEmpty()) {
            if (F0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> w10 = this.f3208c.w();
        ArrayList<androidx.fragment.app.a> arrayList = this.f3209d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i10 = 0; i10 < size; i10++) {
                backStackStateArr[i10] = new BackStackState(this.f3209d.get(i10));
                if (F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f3209d.get(i10));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f3259a = v10;
        fragmentManagerState.f3260b = w10;
        fragmentManagerState.f3261c = backStackStateArr;
        fragmentManagerState.f3262d = this.f3214i.get();
        Fragment fragment = this.f3226u;
        if (fragment != null) {
            fragmentManagerState.f3263e = fragment.f3147f;
        }
        fragmentManagerState.f3264f.addAll(this.f3215j.keySet());
        fragmentManagerState.f3265g.addAll(this.f3215j.values());
        fragmentManagerState.f3266h = new ArrayList<>(this.C);
        return fragmentManagerState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Fragment fragment) {
        this.M.f(fragment);
    }

    public Fragment i0(String str) {
        return this.f3208c.h(str);
    }

    void i1() {
        synchronized (this.f3206a) {
            ArrayList<p> arrayList = this.L;
            boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z11 = this.f3206a.size() == 1;
            if (z10 || z11) {
                this.f3223r.g().removeCallbacks(this.N);
                this.f3223r.g().post(this.N);
                p1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f3214i.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment j0(String str) {
        return this.f3208c.i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j1(Fragment fragment, boolean z10) {
        ViewGroup p02 = p0(fragment);
        if (p02 == null || !(p02 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) p02).setDrawDisappearingViewsLast(!z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"SyntheticAccessor"})
    public void k(androidx.fragment.app.h<?> hVar, androidx.fragment.app.e eVar, Fragment fragment) {
        String str;
        if (this.f3223r == null) {
            this.f3223r = hVar;
            this.f3224s = eVar;
            this.f3225t = fragment;
            if (fragment != null) {
                h(new i(fragment));
            } else if (hVar instanceof androidx.fragment.app.m) {
                h((androidx.fragment.app.m) hVar);
            }
            if (this.f3225t != null) {
                p1();
            }
            if (hVar instanceof androidx.activity.l) {
                androidx.activity.l lVar = (androidx.activity.l) hVar;
                OnBackPressedDispatcher onBackPressedDispatcher = lVar.getOnBackPressedDispatcher();
                this.f3212g = onBackPressedDispatcher;
                androidx.lifecycle.p pVar = lVar;
                if (fragment != null) {
                    pVar = fragment;
                }
                onBackPressedDispatcher.b(pVar, this.f3213h);
            }
            if (fragment != null) {
                this.M = fragment.f3160s.n0(fragment);
            } else if (hVar instanceof p0) {
                this.M = androidx.fragment.app.l.j(((p0) hVar).getViewModelStore());
            } else {
                this.M = new androidx.fragment.app.l(false);
            }
            this.M.o(K0());
            this.f3208c.x(this.M);
            androidx.fragment.app.h<?> hVar2 = this.f3223r;
            if (hVar2 instanceof androidx.activity.result.c) {
                ActivityResultRegistry activityResultRegistry = ((androidx.activity.result.c) hVar2).getActivityResultRegistry();
                if (fragment != null) {
                    str = fragment.f3147f + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.f3231z = activityResultRegistry.j(str2 + "StartActivityForResult", new d.c(), new j());
                this.A = activityResultRegistry.j(str2 + "StartIntentSenderForResult", new k(), new a());
                this.B = activityResultRegistry.j(str2 + "RequestPermissions", new d.b(), new b());
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k1(Fragment fragment, i.b bVar) {
        if (fragment.equals(g0(fragment.f3147f)) && (fragment.f3161t == null || fragment.f3160s == this)) {
            fragment.R = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            if (fragment.f3153l) {
                return;
            }
            this.f3208c.a(fragment);
            if (F0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (G0(fragment)) {
                this.D = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l1(Fragment fragment) {
        if (fragment != null && (!fragment.equals(g0(fragment.f3147f)) || (fragment.f3161t != null && fragment.f3160s != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f3226u;
        this.f3226u = fragment;
        M(fragment2);
        M(this.f3226u);
    }

    public q m() {
        return new androidx.fragment.app.a(this);
    }

    public int m0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f3209d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n1(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f3167z) {
            fragment.f3167z = false;
            fragment.N = !fragment.N;
        }
    }

    boolean o() {
        boolean z10 = false;
        for (Fragment fragment : this.f3208c.l()) {
            if (fragment != null) {
                z10 = G0(fragment);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.e o0() {
        return this.f3224s;
    }

    public androidx.fragment.app.g q0() {
        androidx.fragment.app.g gVar = this.f3227v;
        if (gVar != null) {
            return gVar;
        }
        Fragment fragment = this.f3225t;
        if (fragment != null) {
            return fragment.f3160s.q0();
        }
        return this.f3228w;
    }

    public final void r(String str) {
        this.f3215j.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.p r0() {
        return this.f3208c;
    }

    public List<Fragment> s0() {
        return this.f3208c.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.h<?> t0() {
        return this.f3223r;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3225t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f3225t)));
            sb.append("}");
        } else {
            androidx.fragment.app.h<?> hVar = this.f3223r;
            if (hVar != null) {
                sb.append(hVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f3223r)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    void u(androidx.fragment.app.a aVar, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            aVar.u(z12);
        } else {
            aVar.t();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z10));
        if (z11 && this.f3222q >= 1) {
            r.B(this.f3223r.f(), this.f3224s, arrayList, arrayList2, 0, 1, true, this.f3219n);
        }
        if (z12) {
            P0(this.f3222q, true);
        }
        for (Fragment fragment : this.f3208c.l()) {
            if (fragment != null && fragment.H != null && fragment.M && aVar.x(fragment.f3165x)) {
                float f10 = fragment.O;
                if (f10 > 0.0f) {
                    fragment.H.setAlpha(f10);
                }
                if (z12) {
                    fragment.O = 0.0f;
                } else {
                    fragment.O = -1.0f;
                    fragment.M = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater.Factory2 u0() {
        return this.f3211f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.j v0() {
        return this.f3220o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.o w(Fragment fragment) {
        androidx.fragment.app.o m7 = this.f3208c.m(fragment.f3147f);
        if (m7 != null) {
            return m7;
        }
        androidx.fragment.app.o oVar = new androidx.fragment.app.o(this.f3220o, this.f3208c, fragment);
        oVar.o(this.f3223r.f().getClassLoader());
        oVar.t(this.f3222q);
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment w0() {
        return this.f3225t;
    }

    public Fragment x0() {
        return this.f3226u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.A) {
            return;
        }
        fragment.A = true;
        if (fragment.f3153l) {
            if (F0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f3208c.s(fragment);
            if (G0(fragment)) {
                this.D = true;
            }
            m1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x y0() {
        x xVar = this.f3229x;
        if (xVar != null) {
            return xVar;
        }
        Fragment fragment = this.f3225t;
        if (fragment != null) {
            return fragment.f3160s.y0();
        }
        return this.f3230y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        T(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        String f3236a;

        /* renamed from: b  reason: collision with root package name */
        int f3237b;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        LaunchedFragmentInfo(String str, int i10) {
            this.f3236a = str;
            this.f3237b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f3236a);
            parcel.writeInt(this.f3237b);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.f3236a = parcel.readString();
            this.f3237b = parcel.readInt();
        }
    }
}
