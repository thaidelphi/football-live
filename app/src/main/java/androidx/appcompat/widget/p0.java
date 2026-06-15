package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ResourceManagerInternal.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class p0 {

    /* renamed from: i  reason: collision with root package name */
    private static p0 f1701i;

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<Context, androidx.collection.i<ColorStateList>> f1703a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.collection.h<String, e> f1704b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.collection.i<String> f1705c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<Context, androidx.collection.e<WeakReference<Drawable.ConstantState>>> f1706d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f1707e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1708f;

    /* renamed from: g  reason: collision with root package name */
    private f f1709g;

    /* renamed from: h  reason: collision with root package name */
    private static final PorterDuff.Mode f1700h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    private static final c f1702j = new c(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.p0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return g.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e8) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e8);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.p0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.c.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e8) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e8);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c extends androidx.collection.f<Integer, PorterDuffColorFilter> {
        public c(int i10) {
            super(i10);
        }

        private static int a(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter b(int i10, PorterDuff.Mode mode) {
            return get(Integer.valueOf(a(i10, mode)));
        }

        PorterDuffColorFilter c(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(a(i10, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.p0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        h.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e8) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e8);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface f {
        Drawable a(p0 p0Var, Context context, int i10);

        ColorStateList b(Context context, int i10);

        boolean c(Context context, int i10, Drawable drawable);

        PorterDuff.Mode d(int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.p0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.i.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e8) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e8);
                return null;
            }
        }
    }

    private void a(String str, e eVar) {
        if (this.f1704b == null) {
            this.f1704b = new androidx.collection.h<>();
        }
        this.f1704b.put(str, eVar);
    }

    private synchronized boolean b(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            androidx.collection.e<WeakReference<Drawable.ConstantState>> eVar = this.f1706d.get(context);
            if (eVar == null) {
                eVar = new androidx.collection.e<>();
                this.f1706d.put(context, eVar);
            }
            eVar.k(j10, new WeakReference<>(constantState));
            return true;
        }
        return false;
    }

    private void c(Context context, int i10, ColorStateList colorStateList) {
        if (this.f1703a == null) {
            this.f1703a = new WeakHashMap<>();
        }
        androidx.collection.i<ColorStateList> iVar = this.f1703a.get(context);
        if (iVar == null) {
            iVar = new androidx.collection.i<>();
            this.f1703a.put(context, iVar);
        }
        iVar.c(i10, colorStateList);
    }

    private void d(Context context) {
        if (this.f1708f) {
            return;
        }
        this.f1708f = true;
        Drawable j10 = j(context, h.d.f26153a);
        if (j10 == null || !q(j10)) {
            this.f1708f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i10) {
        if (this.f1707e == null) {
            this.f1707e = new TypedValue();
        }
        TypedValue typedValue = this.f1707e;
        context.getResources().getValue(i10, typedValue, true);
        long e8 = e(typedValue);
        Drawable i11 = i(context, e8);
        if (i11 != null) {
            return i11;
        }
        f fVar = this.f1709g;
        Drawable a10 = fVar == null ? null : fVar.a(this, context, i10);
        if (a10 != null) {
            a10.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e8, a10);
        }
        return a10;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized p0 h() {
        p0 p0Var;
        synchronized (p0.class) {
            if (f1701i == null) {
                p0 p0Var2 = new p0();
                f1701i = p0Var2;
                p(p0Var2);
            }
            p0Var = f1701i;
        }
        return p0Var;
    }

    private synchronized Drawable i(Context context, long j10) {
        androidx.collection.e<WeakReference<Drawable.ConstantState>> eVar = this.f1706d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> g10 = eVar.g(j10);
        if (g10 != null) {
            Drawable.ConstantState constantState = g10.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            eVar.l(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter b10;
        synchronized (p0.class) {
            c cVar = f1702j;
            b10 = cVar.b(i10, mode);
            if (b10 == null) {
                b10 = new PorterDuffColorFilter(i10, mode);
                cVar.c(i10, mode, b10);
            }
        }
        return b10;
    }

    private ColorStateList n(Context context, int i10) {
        androidx.collection.i<ColorStateList> iVar;
        WeakHashMap<Context, androidx.collection.i<ColorStateList>> weakHashMap = this.f1703a;
        if (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return iVar.g(i10);
    }

    private static void p(p0 p0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            p0Var.a("vector", new g());
            p0Var.a("animated-vector", new b());
            p0Var.a("animated-selector", new a());
            p0Var.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i10) {
        int next;
        androidx.collection.h<String, e> hVar = this.f1704b;
        if (hVar == null || hVar.isEmpty()) {
            return null;
        }
        androidx.collection.i<String> iVar = this.f1705c;
        if (iVar != null) {
            String g10 = iVar.g(i10);
            if ("appcompat_skip_skip".equals(g10) || (g10 != null && this.f1704b.get(g10) == null)) {
                return null;
            }
        } else {
            this.f1705c = new androidx.collection.i<>();
        }
        if (this.f1707e == null) {
            this.f1707e = new TypedValue();
        }
        TypedValue typedValue = this.f1707e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long e8 = e(typedValue);
        Drawable i11 = i(context, e8);
        if (i11 != null) {
            return i11;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.f1705c.c(i10, name);
                    e eVar = this.f1704b.get(name);
                    if (eVar != null) {
                        i11 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (i11 != null) {
                        i11.setChangingConfigurations(typedValue.changingConfigurations);
                        b(context, e8, i11);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (i11 == null) {
            this.f1705c.c(i10, "appcompat_skip_skip");
        }
        return i11;
    }

    private Drawable v(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList m7 = m(context, i10);
        if (m7 != null) {
            if (h0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r10 = androidx.core.graphics.drawable.a.r(drawable);
            androidx.core.graphics.drawable.a.o(r10, m7);
            PorterDuff.Mode o10 = o(i10);
            if (o10 != null) {
                androidx.core.graphics.drawable.a.p(r10, o10);
                return r10;
            }
            return r10;
        }
        f fVar = this.f1709g;
        if ((fVar == null || !fVar.e(context, i10, drawable)) && !x(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(Drawable drawable, x0 x0Var, int[] iArr) {
        if (h0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z10 = x0Var.f1797d;
        if (!z10 && !x0Var.f1796c) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(g(z10 ? x0Var.f1794a : null, x0Var.f1796c ? x0Var.f1795b : f1700h, iArr));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i10) {
        return k(context, i10, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable k(Context context, int i10, boolean z10) {
        Drawable r10;
        d(context);
        r10 = r(context, i10);
        if (r10 == null) {
            r10 = f(context, i10);
        }
        if (r10 == null) {
            r10 = androidx.core.content.a.f(context, i10);
        }
        if (r10 != null) {
            r10 = v(context, i10, z10, r10);
        }
        if (r10 != null) {
            h0.b(r10);
        }
        return r10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList m(Context context, int i10) {
        ColorStateList n10;
        n10 = n(context, i10);
        if (n10 == null) {
            f fVar = this.f1709g;
            n10 = fVar == null ? null : fVar.b(context, i10);
            if (n10 != null) {
                c(context, i10, n10);
            }
        }
        return n10;
    }

    PorterDuff.Mode o(int i10) {
        f fVar = this.f1709g;
        if (fVar == null) {
            return null;
        }
        return fVar.d(i10);
    }

    public synchronized void s(Context context) {
        androidx.collection.e<WeakReference<Drawable.ConstantState>> eVar = this.f1706d.get(context);
        if (eVar != null) {
            eVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable t(Context context, f1 f1Var, int i10) {
        Drawable r10 = r(context, i10);
        if (r10 == null) {
            r10 = f1Var.a(i10);
        }
        if (r10 != null) {
            return v(context, i10, false, r10);
        }
        return null;
    }

    public synchronized void u(f fVar) {
        this.f1709g = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x(Context context, int i10, Drawable drawable) {
        f fVar = this.f1709g;
        return fVar != null && fVar.c(context, i10, drawable);
    }
}
