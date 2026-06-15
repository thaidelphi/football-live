package p2;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s2.j;
/* compiled from: ViewTarget.java */
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class i<T extends View, Z> extends p2.a<Z> {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f29539f;

    /* renamed from: g  reason: collision with root package name */
    private static int f29540g = com.bumptech.glide.h.f10299a;

    /* renamed from: a  reason: collision with root package name */
    protected final T f29541a;

    /* renamed from: b  reason: collision with root package name */
    private final a f29542b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnAttachStateChangeListener f29543c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f29544d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f29545e;

    /* compiled from: ViewTarget.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class a {

        /* renamed from: e  reason: collision with root package name */
        static Integer f29546e;

        /* renamed from: a  reason: collision with root package name */
        private final View f29547a;

        /* renamed from: b  reason: collision with root package name */
        private final List<g> f29548b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        boolean f29549c;

        /* renamed from: d  reason: collision with root package name */
        private ViewTreeObserver$OnPreDrawListenerC0332a f29550d;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ViewTarget.java */
        /* renamed from: p2.i$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC0332a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference<a> f29551a;

            ViewTreeObserver$OnPreDrawListenerC0332a(a aVar) {
                this.f29551a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f29551a.get();
                if (aVar != null) {
                    aVar.a();
                    return true;
                }
                return true;
            }
        }

        a(View view) {
            this.f29547a = view;
        }

        private static int c(Context context) {
            if (f29546e == null) {
                Display defaultDisplay = ((WindowManager) j.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f29546e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f29546e.intValue();
        }

        private int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f29549c && this.f29547a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f29547a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f29547a.getContext());
        }

        private int f() {
            int paddingTop = this.f29547a.getPaddingTop() + this.f29547a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f29547a.getLayoutParams();
            return e(this.f29547a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f29547a.getPaddingLeft() + this.f29547a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f29547a.getLayoutParams();
            return e(this.f29547a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        private boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        private void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f29548b).iterator();
            while (it.hasNext()) {
                ((g) it.next()).d(i10, i11);
            }
        }

        void a() {
            if (this.f29548b.isEmpty()) {
                return;
            }
            int g10 = g();
            int f10 = f();
            if (i(g10, f10)) {
                j(g10, f10);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f29547a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f29550d);
            }
            this.f29550d = null;
            this.f29548b.clear();
        }

        void d(g gVar) {
            int g10 = g();
            int f10 = f();
            if (i(g10, f10)) {
                gVar.d(g10, f10);
                return;
            }
            if (!this.f29548b.contains(gVar)) {
                this.f29548b.add(gVar);
            }
            if (this.f29550d == null) {
                ViewTreeObserver viewTreeObserver = this.f29547a.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC0332a viewTreeObserver$OnPreDrawListenerC0332a = new ViewTreeObserver$OnPreDrawListenerC0332a(this);
                this.f29550d = viewTreeObserver$OnPreDrawListenerC0332a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0332a);
            }
        }

        void k(g gVar) {
            this.f29548b.remove(gVar);
        }
    }

    public i(T t10) {
        this.f29541a = (T) j.d(t10);
        this.f29542b = new a(t10);
    }

    private Object i() {
        return this.f29541a.getTag(f29540g);
    }

    private void j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f29543c;
        if (onAttachStateChangeListener == null || this.f29545e) {
            return;
        }
        this.f29541a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f29545e = true;
    }

    private void k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f29543c;
        if (onAttachStateChangeListener == null || !this.f29545e) {
            return;
        }
        this.f29541a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f29545e = false;
    }

    private void l(Object obj) {
        f29539f = true;
        this.f29541a.setTag(f29540g, obj);
    }

    @Override // p2.h
    public void b(g gVar) {
        this.f29542b.k(gVar);
    }

    @Override // p2.h
    public void c(o2.c cVar) {
        l(cVar);
    }

    @Override // p2.a, p2.h
    public void d(Drawable drawable) {
        super.d(drawable);
        j();
    }

    @Override // p2.h
    public o2.c e() {
        Object i10 = i();
        if (i10 != null) {
            if (i10 instanceof o2.c) {
                return (o2.c) i10;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // p2.a, p2.h
    public void f(Drawable drawable) {
        super.f(drawable);
        this.f29542b.b();
        if (this.f29544d) {
            return;
        }
        k();
    }

    @Override // p2.h
    public void g(g gVar) {
        this.f29542b.d(gVar);
    }

    public String toString() {
        return "Target for: " + this.f29541a;
    }
}
