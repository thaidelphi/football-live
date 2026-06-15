package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
/* compiled from: WindowInsetsCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l0 {

    /* renamed from: b  reason: collision with root package name */
    public static final l0 f2908b;

    /* renamed from: a  reason: collision with root package name */
    private final l f2909a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WindowInsetsCompat.java */
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Field f2910a;

        /* renamed from: b  reason: collision with root package name */
        private static Field f2911b;

        /* renamed from: c  reason: collision with root package name */
        private static Field f2912c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f2913d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2910a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2911b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2912c = declaredField3;
                declaredField3.setAccessible(true);
                f2913d = true;
            } catch (ReflectiveOperationException e8) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e8.getMessage(), e8);
            }
        }

        public static l0 a(View view) {
            if (f2913d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2910a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2911b.get(obj);
                        Rect rect2 = (Rect) f2912c.get(obj);
                        if (rect != null && rect2 != null) {
                            l0 a10 = new b().b(androidx.core.graphics.b.c(rect)).c(androidx.core.graphics.b.c(rect2)).a();
                            a10.r(a10);
                            a10.d(view.getRootView());
                            return a10;
                        }
                    }
                } catch (IllegalAccessException e8) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e8.getMessage(), e8);
                }
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class e extends d {
        e() {
        }

        e(l0 l0Var) {
            super(l0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private final l0 f2922a;

        /* renamed from: b  reason: collision with root package name */
        androidx.core.graphics.b[] f2923b;

        f() {
            this(new l0((l0) null));
        }

        protected final void a() {
            androidx.core.graphics.b[] bVarArr = this.f2923b;
            if (bVarArr != null) {
                androidx.core.graphics.b bVar = bVarArr[m.a(1)];
                androidx.core.graphics.b bVar2 = this.f2923b[m.a(2)];
                if (bVar2 == null) {
                    bVar2 = this.f2922a.f(2);
                }
                if (bVar == null) {
                    bVar = this.f2922a.f(1);
                }
                f(androidx.core.graphics.b.a(bVar, bVar2));
                androidx.core.graphics.b bVar3 = this.f2923b[m.a(16)];
                if (bVar3 != null) {
                    e(bVar3);
                }
                androidx.core.graphics.b bVar4 = this.f2923b[m.a(32)];
                if (bVar4 != null) {
                    c(bVar4);
                }
                androidx.core.graphics.b bVar5 = this.f2923b[m.a(64)];
                if (bVar5 != null) {
                    g(bVar5);
                }
            }
        }

        l0 b() {
            a();
            return this.f2922a;
        }

        void c(androidx.core.graphics.b bVar) {
        }

        void d(androidx.core.graphics.b bVar) {
        }

        void e(androidx.core.graphics.b bVar) {
        }

        void f(androidx.core.graphics.b bVar) {
        }

        void g(androidx.core.graphics.b bVar) {
        }

        f(l0 l0Var) {
            this.f2922a = l0Var;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class i extends h {
        i(l0 l0Var, WindowInsets windowInsets) {
            super(l0Var, windowInsets);
        }

        @Override // androidx.core.view.l0.l
        l0 a() {
            return l0.u(this.f2929c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.l0.g, androidx.core.view.l0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return Objects.equals(this.f2929c, iVar.f2929c) && Objects.equals(this.f2933g, iVar.f2933g);
            }
            return false;
        }

        @Override // androidx.core.view.l0.l
        androidx.core.view.d f() {
            return androidx.core.view.d.e(this.f2929c.getDisplayCutout());
        }

        @Override // androidx.core.view.l0.l
        public int hashCode() {
            return this.f2929c.hashCode();
        }

        i(l0 l0Var, i iVar) {
            super(l0Var, iVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class k extends j {

        /* renamed from: q  reason: collision with root package name */
        static final l0 f2938q = l0.u(WindowInsets.CONSUMED);

        k(l0 l0Var, WindowInsets windowInsets) {
            super(l0Var, windowInsets);
        }

        @Override // androidx.core.view.l0.g, androidx.core.view.l0.l
        final void d(View view) {
        }

        @Override // androidx.core.view.l0.g, androidx.core.view.l0.l
        public androidx.core.graphics.b g(int i10) {
            return androidx.core.graphics.b.d(this.f2929c.getInsets(n.a(i10)));
        }

        k(l0 l0Var, k kVar) {
            super(l0Var, kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class l {

        /* renamed from: b  reason: collision with root package name */
        static final l0 f2939b = new b().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        final l0 f2940a;

        l(l0 l0Var) {
            this.f2940a = l0Var;
        }

        l0 a() {
            return this.f2940a;
        }

        l0 b() {
            return this.f2940a;
        }

        l0 c() {
            return this.f2940a;
        }

        void d(View view) {
        }

        void e(l0 l0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return o() == lVar.o() && n() == lVar.n() && androidx.core.util.d.a(k(), lVar.k()) && androidx.core.util.d.a(i(), lVar.i()) && androidx.core.util.d.a(f(), lVar.f());
            }
            return false;
        }

        androidx.core.view.d f() {
            return null;
        }

        androidx.core.graphics.b g(int i10) {
            return androidx.core.graphics.b.f2610e;
        }

        androidx.core.graphics.b h() {
            return k();
        }

        public int hashCode() {
            return androidx.core.util.d.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        androidx.core.graphics.b i() {
            return androidx.core.graphics.b.f2610e;
        }

        androidx.core.graphics.b j() {
            return k();
        }

        androidx.core.graphics.b k() {
            return androidx.core.graphics.b.f2610e;
        }

        androidx.core.graphics.b l() {
            return k();
        }

        l0 m(int i10, int i11, int i12, int i13) {
            return f2939b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        public void p(androidx.core.graphics.b[] bVarArr) {
        }

        void q(androidx.core.graphics.b bVar) {
        }

        void r(l0 l0Var) {
        }

        public void s(androidx.core.graphics.b bVar) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class m {
        static int a(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 8) {
                            if (i10 != 16) {
                                if (i10 != 32) {
                                    if (i10 != 64) {
                                        if (i10 != 128) {
                                            if (i10 == 256) {
                                                return 8;
                                            }
                                            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }

        public static int b() {
            return 32;
        }

        public static int c() {
            return 7;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class n {
        static int a(int i10) {
            int statusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= statusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2908b = k.f2938q;
        } else {
            f2908b = l.f2939b;
        }
    }

    private l0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f2909a = new k(this, windowInsets);
        } else if (i10 >= 29) {
            this.f2909a = new j(this, windowInsets);
        } else if (i10 >= 28) {
            this.f2909a = new i(this, windowInsets);
        } else if (i10 >= 21) {
            this.f2909a = new h(this, windowInsets);
        } else if (i10 >= 20) {
            this.f2909a = new g(this, windowInsets);
        } else {
            this.f2909a = new l(this);
        }
    }

    static androidx.core.graphics.b m(androidx.core.graphics.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f2611a - i10);
        int max2 = Math.max(0, bVar.f2612b - i11);
        int max3 = Math.max(0, bVar.f2613c - i12);
        int max4 = Math.max(0, bVar.f2614d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? bVar : androidx.core.graphics.b.b(max, max2, max3, max4);
    }

    public static l0 u(WindowInsets windowInsets) {
        return v(windowInsets, null);
    }

    public static l0 v(WindowInsets windowInsets, View view) {
        l0 l0Var = new l0((WindowInsets) androidx.core.util.i.f(windowInsets));
        if (view != null && a0.T(view)) {
            l0Var.r(a0.K(view));
            l0Var.d(view.getRootView());
        }
        return l0Var;
    }

    @Deprecated
    public l0 a() {
        return this.f2909a.a();
    }

    @Deprecated
    public l0 b() {
        return this.f2909a.b();
    }

    @Deprecated
    public l0 c() {
        return this.f2909a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(View view) {
        this.f2909a.d(view);
    }

    public androidx.core.view.d e() {
        return this.f2909a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            return androidx.core.util.d.a(this.f2909a, ((l0) obj).f2909a);
        }
        return false;
    }

    public androidx.core.graphics.b f(int i10) {
        return this.f2909a.g(i10);
    }

    @Deprecated
    public androidx.core.graphics.b g() {
        return this.f2909a.i();
    }

    @Deprecated
    public int h() {
        return this.f2909a.k().f2614d;
    }

    public int hashCode() {
        l lVar = this.f2909a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f2909a.k().f2611a;
    }

    @Deprecated
    public int j() {
        return this.f2909a.k().f2613c;
    }

    @Deprecated
    public int k() {
        return this.f2909a.k().f2612b;
    }

    public l0 l(int i10, int i11, int i12, int i13) {
        return this.f2909a.m(i10, i11, i12, i13);
    }

    public boolean n() {
        return this.f2909a.n();
    }

    @Deprecated
    public l0 o(int i10, int i11, int i12, int i13) {
        return new b(this).c(androidx.core.graphics.b.b(i10, i11, i12, i13)).a();
    }

    void p(androidx.core.graphics.b[] bVarArr) {
        this.f2909a.p(bVarArr);
    }

    void q(androidx.core.graphics.b bVar) {
        this.f2909a.q(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(l0 l0Var) {
        this.f2909a.r(l0Var);
    }

    void s(androidx.core.graphics.b bVar) {
        this.f2909a.s(bVar);
    }

    public WindowInsets t() {
        l lVar = this.f2909a;
        if (lVar instanceof g) {
            return ((g) lVar).f2929c;
        }
        return null;
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private static Field f2915e = null;

        /* renamed from: f  reason: collision with root package name */
        private static boolean f2916f = false;

        /* renamed from: g  reason: collision with root package name */
        private static Constructor<WindowInsets> f2917g = null;

        /* renamed from: h  reason: collision with root package name */
        private static boolean f2918h = false;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsets f2919c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.b f2920d;

        c() {
            this.f2919c = h();
        }

        private static WindowInsets h() {
            if (!f2916f) {
                try {
                    f2915e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e8) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e8);
                }
                f2916f = true;
            }
            Field field = f2915e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
                }
            }
            if (!f2918h) {
                try {
                    f2917g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
                }
                f2918h = true;
            }
            Constructor<WindowInsets> constructor = f2917g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
                }
            }
            return null;
        }

        @Override // androidx.core.view.l0.f
        l0 b() {
            a();
            l0 u10 = l0.u(this.f2919c);
            u10.p(this.f2923b);
            u10.s(this.f2920d);
            return u10;
        }

        @Override // androidx.core.view.l0.f
        void d(androidx.core.graphics.b bVar) {
            this.f2920d = bVar;
        }

        @Override // androidx.core.view.l0.f
        void f(androidx.core.graphics.b bVar) {
            WindowInsets windowInsets = this.f2919c;
            if (windowInsets != null) {
                this.f2919c = windowInsets.replaceSystemWindowInsets(bVar.f2611a, bVar.f2612b, bVar.f2613c, bVar.f2614d);
            }
        }

        c(l0 l0Var) {
            super(l0Var);
            this.f2919c = l0Var.t();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class d extends f {

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets.Builder f2921c;

        d() {
            this.f2921c = new WindowInsets.Builder();
        }

        @Override // androidx.core.view.l0.f
        l0 b() {
            a();
            l0 u10 = l0.u(this.f2921c.build());
            u10.p(this.f2923b);
            return u10;
        }

        @Override // androidx.core.view.l0.f
        void c(androidx.core.graphics.b bVar) {
            this.f2921c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.l0.f
        void d(androidx.core.graphics.b bVar) {
            this.f2921c.setStableInsets(bVar.e());
        }

        @Override // androidx.core.view.l0.f
        void e(androidx.core.graphics.b bVar) {
            this.f2921c.setSystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.l0.f
        void f(androidx.core.graphics.b bVar) {
            this.f2921c.setSystemWindowInsets(bVar.e());
        }

        @Override // androidx.core.view.l0.f
        void g(androidx.core.graphics.b bVar) {
            this.f2921c.setTappableElementInsets(bVar.e());
        }

        d(l0 l0Var) {
            super(l0Var);
            WindowInsets.Builder builder;
            WindowInsets t10 = l0Var.t();
            if (t10 != null) {
                builder = new WindowInsets.Builder(t10);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f2921c = builder;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class h extends g {

        /* renamed from: m  reason: collision with root package name */
        private androidx.core.graphics.b f2934m;

        h(l0 l0Var, WindowInsets windowInsets) {
            super(l0Var, windowInsets);
            this.f2934m = null;
        }

        @Override // androidx.core.view.l0.l
        l0 b() {
            return l0.u(this.f2929c.consumeStableInsets());
        }

        @Override // androidx.core.view.l0.l
        l0 c() {
            return l0.u(this.f2929c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.l0.l
        final androidx.core.graphics.b i() {
            if (this.f2934m == null) {
                this.f2934m = androidx.core.graphics.b.b(this.f2929c.getStableInsetLeft(), this.f2929c.getStableInsetTop(), this.f2929c.getStableInsetRight(), this.f2929c.getStableInsetBottom());
            }
            return this.f2934m;
        }

        @Override // androidx.core.view.l0.l
        boolean n() {
            return this.f2929c.isConsumed();
        }

        @Override // androidx.core.view.l0.l
        public void s(androidx.core.graphics.b bVar) {
            this.f2934m = bVar;
        }

        h(l0 l0Var, h hVar) {
            super(l0Var, hVar);
            this.f2934m = null;
            this.f2934m = hVar.f2934m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        private static boolean f2924h = false;

        /* renamed from: i  reason: collision with root package name */
        private static Method f2925i;

        /* renamed from: j  reason: collision with root package name */
        private static Class<?> f2926j;

        /* renamed from: k  reason: collision with root package name */
        private static Field f2927k;

        /* renamed from: l  reason: collision with root package name */
        private static Field f2928l;

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets f2929c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.b[] f2930d;

        /* renamed from: e  reason: collision with root package name */
        private androidx.core.graphics.b f2931e;

        /* renamed from: f  reason: collision with root package name */
        private l0 f2932f;

        /* renamed from: g  reason: collision with root package name */
        androidx.core.graphics.b f2933g;

        g(l0 l0Var, WindowInsets windowInsets) {
            super(l0Var);
            this.f2931e = null;
            this.f2929c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.b t(int i10, boolean z10) {
            androidx.core.graphics.b bVar = androidx.core.graphics.b.f2610e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVar = androidx.core.graphics.b.a(bVar, u(i11, z10));
                }
            }
            return bVar;
        }

        private androidx.core.graphics.b v() {
            l0 l0Var = this.f2932f;
            if (l0Var != null) {
                return l0Var.g();
            }
            return androidx.core.graphics.b.f2610e;
        }

        private androidx.core.graphics.b w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f2924h) {
                    x();
                }
                Method method = f2925i;
                if (method != null && f2926j != null && f2927k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f2927k.get(f2928l.get(invoke));
                        if (rect != null) {
                            return androidx.core.graphics.b.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e8) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                f2925i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2926j = cls;
                f2927k = cls.getDeclaredField("mVisibleInsets");
                f2928l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2927k.setAccessible(true);
                f2928l.setAccessible(true);
            } catch (ReflectiveOperationException e8) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
            }
            f2924h = true;
        }

        @Override // androidx.core.view.l0.l
        void d(View view) {
            androidx.core.graphics.b w10 = w(view);
            if (w10 == null) {
                w10 = androidx.core.graphics.b.f2610e;
            }
            q(w10);
        }

        @Override // androidx.core.view.l0.l
        void e(l0 l0Var) {
            l0Var.r(this.f2932f);
            l0Var.q(this.f2933g);
        }

        @Override // androidx.core.view.l0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f2933g, ((g) obj).f2933g);
            }
            return false;
        }

        @Override // androidx.core.view.l0.l
        public androidx.core.graphics.b g(int i10) {
            return t(i10, false);
        }

        @Override // androidx.core.view.l0.l
        final androidx.core.graphics.b k() {
            if (this.f2931e == null) {
                this.f2931e = androidx.core.graphics.b.b(this.f2929c.getSystemWindowInsetLeft(), this.f2929c.getSystemWindowInsetTop(), this.f2929c.getSystemWindowInsetRight(), this.f2929c.getSystemWindowInsetBottom());
            }
            return this.f2931e;
        }

        @Override // androidx.core.view.l0.l
        l0 m(int i10, int i11, int i12, int i13) {
            b bVar = new b(l0.u(this.f2929c));
            bVar.c(l0.m(k(), i10, i11, i12, i13));
            bVar.b(l0.m(i(), i10, i11, i12, i13));
            return bVar.a();
        }

        @Override // androidx.core.view.l0.l
        boolean o() {
            return this.f2929c.isRound();
        }

        @Override // androidx.core.view.l0.l
        public void p(androidx.core.graphics.b[] bVarArr) {
            this.f2930d = bVarArr;
        }

        @Override // androidx.core.view.l0.l
        void q(androidx.core.graphics.b bVar) {
            this.f2933g = bVar;
        }

        @Override // androidx.core.view.l0.l
        void r(l0 l0Var) {
            this.f2932f = l0Var;
        }

        protected androidx.core.graphics.b u(int i10, boolean z10) {
            androidx.core.graphics.b g10;
            int i11;
            androidx.core.view.d f10;
            if (i10 == 1) {
                if (z10) {
                    return androidx.core.graphics.b.b(0, Math.max(v().f2612b, k().f2612b), 0, 0);
                }
                return androidx.core.graphics.b.b(0, k().f2612b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    androidx.core.graphics.b v10 = v();
                    androidx.core.graphics.b i12 = i();
                    return androidx.core.graphics.b.b(Math.max(v10.f2611a, i12.f2611a), 0, Math.max(v10.f2613c, i12.f2613c), Math.max(v10.f2614d, i12.f2614d));
                }
                androidx.core.graphics.b k10 = k();
                l0 l0Var = this.f2932f;
                g10 = l0Var != null ? l0Var.g() : null;
                int i13 = k10.f2614d;
                if (g10 != null) {
                    i13 = Math.min(i13, g10.f2614d);
                }
                return androidx.core.graphics.b.b(k10.f2611a, 0, k10.f2613c, i13);
            } else if (i10 != 8) {
                if (i10 != 16) {
                    if (i10 != 32) {
                        if (i10 != 64) {
                            if (i10 != 128) {
                                return androidx.core.graphics.b.f2610e;
                            }
                            l0 l0Var2 = this.f2932f;
                            if (l0Var2 != null) {
                                f10 = l0Var2.e();
                            } else {
                                f10 = f();
                            }
                            if (f10 != null) {
                                return androidx.core.graphics.b.b(f10.b(), f10.d(), f10.c(), f10.a());
                            }
                            return androidx.core.graphics.b.f2610e;
                        }
                        return l();
                    }
                    return h();
                }
                return j();
            } else {
                androidx.core.graphics.b[] bVarArr = this.f2930d;
                g10 = bVarArr != null ? bVarArr[m.a(8)] : null;
                if (g10 != null) {
                    return g10;
                }
                androidx.core.graphics.b k11 = k();
                androidx.core.graphics.b v11 = v();
                int i14 = k11.f2614d;
                if (i14 > v11.f2614d) {
                    return androidx.core.graphics.b.b(0, 0, 0, i14);
                }
                androidx.core.graphics.b bVar = this.f2933g;
                if (bVar != null && !bVar.equals(androidx.core.graphics.b.f2610e) && (i11 = this.f2933g.f2614d) > v11.f2614d) {
                    return androidx.core.graphics.b.b(0, 0, 0, i11);
                }
                return androidx.core.graphics.b.f2610e;
            }
        }

        g(l0 l0Var, g gVar) {
            this(l0Var, new WindowInsets(gVar.f2929c));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class j extends i {

        /* renamed from: n  reason: collision with root package name */
        private androidx.core.graphics.b f2935n;

        /* renamed from: o  reason: collision with root package name */
        private androidx.core.graphics.b f2936o;

        /* renamed from: p  reason: collision with root package name */
        private androidx.core.graphics.b f2937p;

        j(l0 l0Var, WindowInsets windowInsets) {
            super(l0Var, windowInsets);
            this.f2935n = null;
            this.f2936o = null;
            this.f2937p = null;
        }

        @Override // androidx.core.view.l0.l
        androidx.core.graphics.b h() {
            if (this.f2936o == null) {
                this.f2936o = androidx.core.graphics.b.d(this.f2929c.getMandatorySystemGestureInsets());
            }
            return this.f2936o;
        }

        @Override // androidx.core.view.l0.l
        androidx.core.graphics.b j() {
            if (this.f2935n == null) {
                this.f2935n = androidx.core.graphics.b.d(this.f2929c.getSystemGestureInsets());
            }
            return this.f2935n;
        }

        @Override // androidx.core.view.l0.l
        androidx.core.graphics.b l() {
            if (this.f2937p == null) {
                this.f2937p = androidx.core.graphics.b.d(this.f2929c.getTappableElementInsets());
            }
            return this.f2937p;
        }

        @Override // androidx.core.view.l0.g, androidx.core.view.l0.l
        l0 m(int i10, int i11, int i12, int i13) {
            return l0.u(this.f2929c.inset(i10, i11, i12, i13));
        }

        @Override // androidx.core.view.l0.h, androidx.core.view.l0.l
        public void s(androidx.core.graphics.b bVar) {
        }

        j(l0 l0Var, j jVar) {
            super(l0Var, jVar);
            this.f2935n = null;
            this.f2936o = null;
            this.f2937p = null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final f f2914a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f2914a = new e();
            } else if (i10 >= 29) {
                this.f2914a = new d();
            } else if (i10 >= 20) {
                this.f2914a = new c();
            } else {
                this.f2914a = new f();
            }
        }

        public l0 a() {
            return this.f2914a.b();
        }

        @Deprecated
        public b b(androidx.core.graphics.b bVar) {
            this.f2914a.d(bVar);
            return this;
        }

        @Deprecated
        public b c(androidx.core.graphics.b bVar) {
            this.f2914a.f(bVar);
            return this;
        }

        public b(l0 l0Var) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f2914a = new e(l0Var);
            } else if (i10 >= 29) {
                this.f2914a = new d(l0Var);
            } else if (i10 >= 20) {
                this.f2914a = new c(l0Var);
            } else {
                this.f2914a = new f(l0Var);
            }
        }
    }

    public l0(l0 l0Var) {
        if (l0Var != null) {
            l lVar = l0Var.f2909a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (lVar instanceof k)) {
                this.f2909a = new k(this, (k) lVar);
            } else if (i10 >= 29 && (lVar instanceof j)) {
                this.f2909a = new j(this, (j) lVar);
            } else if (i10 >= 28 && (lVar instanceof i)) {
                this.f2909a = new i(this, (i) lVar);
            } else if (i10 >= 21 && (lVar instanceof h)) {
                this.f2909a = new h(this, (h) lVar);
            } else if (i10 >= 20 && (lVar instanceof g)) {
                this.f2909a = new g(this, (g) lVar);
            } else {
                this.f2909a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f2909a = new l(this);
    }
}
