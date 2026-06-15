package a1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.b9;
import java.util.Map;
/* compiled from: ChangeBounds.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c extends m {
    private static final String[] N = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> O = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> P = new C0004c(PointF.class, "topLeft");
    private static final Property<k, PointF> Q = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> R = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> S = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> T = new g(PointF.class, b9.h.L);
    private static a1.k U = new a1.k();
    private int[] K = new int[2];
    private boolean L = false;
    private boolean M = false;

    /* compiled from: ChangeBounds.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f47a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f48b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f49c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f50d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f47a = viewGroup;
            this.f48b = bitmapDrawable;
            this.f49c = view;
            this.f50d = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.b(this.f47a).b(this.f48b);
            c0.g(this.f49c, this.f50d);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class b extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f52a;

        b(Class cls, String str) {
            super(cls, str);
            this.f52a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f52a);
            Rect rect = this.f52a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f52a);
            this.f52a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f52a);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: a1.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class C0004c extends Property<k, PointF> {
        C0004c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            c0.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            c0.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            c0.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f53a;
        private k mViewBounds;

        h(k kVar) {
            this.f53a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f55a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f56b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f57c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f58d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f59e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f60f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f61g;

        i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f56b = view;
            this.f57c = rect;
            this.f58d = i10;
            this.f59e = i11;
            this.f60f = i12;
            this.f61g = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f55a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f55a) {
                return;
            }
            androidx.core.view.a0.x0(this.f56b, this.f57c);
            c0.f(this.f56b, this.f58d, this.f59e, this.f60f, this.f61g);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class j extends n {

        /* renamed from: a  reason: collision with root package name */
        boolean f63a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f64b;

        j(ViewGroup viewGroup) {
            this.f64b = viewGroup;
        }

        @Override // a1.n, a1.m.f
        public void a(m mVar) {
            x.c(this.f64b, true);
        }

        @Override // a1.n, a1.m.f
        public void b(m mVar) {
            x.c(this.f64b, false);
            this.f63a = true;
        }

        @Override // a1.m.f
        public void d(m mVar) {
            if (!this.f63a) {
                x.c(this.f64b, false);
            }
            mVar.R(this);
        }

        @Override // a1.n, a1.m.f
        public void e(m mVar) {
            x.c(this.f64b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChangeBounds.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        private int f66a;

        /* renamed from: b  reason: collision with root package name */
        private int f67b;

        /* renamed from: c  reason: collision with root package name */
        private int f68c;

        /* renamed from: d  reason: collision with root package name */
        private int f69d;

        /* renamed from: e  reason: collision with root package name */
        private View f70e;

        /* renamed from: f  reason: collision with root package name */
        private int f71f;

        /* renamed from: g  reason: collision with root package name */
        private int f72g;

        k(View view) {
            this.f70e = view;
        }

        private void b() {
            c0.f(this.f70e, this.f66a, this.f67b, this.f68c, this.f69d);
            this.f71f = 0;
            this.f72g = 0;
        }

        void a(PointF pointF) {
            this.f68c = Math.round(pointF.x);
            this.f69d = Math.round(pointF.y);
            int i10 = this.f72g + 1;
            this.f72g = i10;
            if (this.f71f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f66a = Math.round(pointF.x);
            this.f67b = Math.round(pointF.y);
            int i10 = this.f71f + 1;
            this.f71f = i10;
            if (i10 == this.f72g) {
                b();
            }
        }
    }

    private void e0(s sVar) {
        View view = sVar.f182b;
        if (!androidx.core.view.a0.U(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.f181a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.f181a.put("android:changeBounds:parent", sVar.f182b.getParent());
        if (this.M) {
            sVar.f182b.getLocationInWindow(this.K);
            sVar.f181a.put("android:changeBounds:windowX", Integer.valueOf(this.K[0]));
            sVar.f181a.put("android:changeBounds:windowY", Integer.valueOf(this.K[1]));
        }
        if (this.L) {
            sVar.f181a.put("android:changeBounds:clip", androidx.core.view.a0.w(view));
        }
    }

    private boolean f0(View view, View view2) {
        if (this.M) {
            s v10 = v(view, true);
            if (v10 == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == v10.f182b) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // a1.m
    public String[] F() {
        return N;
    }

    @Override // a1.m
    public void i(s sVar) {
        e0(sVar);
    }

    @Override // a1.m
    public void l(s sVar) {
        e0(sVar);
    }

    @Override // a1.m
    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        int i10;
        View view;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator c10;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map<String, Object> map = sVar.f181a;
        Map<String, Object> map2 = sVar2.f181a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f182b;
        if (f0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar.f181a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar2.f181a.get("android:changeBounds:bounds");
            int i12 = rect2.left;
            int i13 = rect3.left;
            int i14 = rect2.top;
            int i15 = rect3.top;
            int i16 = rect2.right;
            int i17 = rect3.right;
            int i18 = rect2.bottom;
            int i19 = rect3.bottom;
            int i20 = i16 - i12;
            int i21 = i18 - i14;
            int i22 = i17 - i13;
            int i23 = i19 - i15;
            Rect rect4 = (Rect) sVar.f181a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar2.f181a.get("android:changeBounds:clip");
            if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
                i10 = 0;
            } else {
                i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
                if (i16 != i17 || i18 != i19) {
                    i10++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i10++;
            }
            if (i10 > 0) {
                if (!this.L) {
                    view = view2;
                    c0.f(view, i12, i14, i16, i18);
                    if (i10 == 2) {
                        if (i20 == i22 && i21 == i23) {
                            c10 = a1.f.a(view, T, x().a(i12, i14, i13, i15));
                        } else {
                            k kVar = new k(view);
                            ObjectAnimator a10 = a1.f.a(kVar, P, x().a(i12, i14, i13, i15));
                            ObjectAnimator a11 = a1.f.a(kVar, Q, x().a(i16, i18, i17, i19));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(a10, a11);
                            animatorSet.addListener(new h(kVar));
                            c10 = animatorSet;
                        }
                    } else if (i12 == i13 && i14 == i15) {
                        c10 = a1.f.a(view, R, x().a(i16, i18, i17, i19));
                    } else {
                        c10 = a1.f.a(view, S, x().a(i12, i14, i13, i15));
                    }
                } else {
                    view = view2;
                    c0.f(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
                    ObjectAnimator a12 = (i12 == i13 && i14 == i15) ? null : a1.f.a(view, T, x().a(i12, i14, i13, i15));
                    if (rect4 == null) {
                        i11 = 0;
                        rect = new Rect(0, 0, i20, i21);
                    } else {
                        i11 = 0;
                        rect = rect4;
                    }
                    Rect rect6 = rect5 == null ? new Rect(i11, i11, i22, i23) : rect5;
                    if (rect.equals(rect6)) {
                        objectAnimator = null;
                    } else {
                        androidx.core.view.a0.x0(view, rect);
                        a1.k kVar2 = U;
                        Object[] objArr = new Object[2];
                        objArr[i11] = rect;
                        objArr[1] = rect6;
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                        ofObject.addListener(new i(view, rect5, i13, i15, i17, i19));
                        objectAnimator = ofObject;
                    }
                    c10 = r.c(a12, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    x.c(viewGroup4, true);
                    c(new j(viewGroup4));
                }
                return c10;
            }
            return null;
        }
        int intValue = ((Integer) sVar.f181a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar.f181a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar2.f181a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar2.f181a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.K);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c11 = c0.c(view2);
        c0.g(view2, 0.0f);
        c0.b(viewGroup).a(bitmapDrawable);
        a1.g x10 = x();
        int[] iArr = this.K;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, a1.i.a(O, x10.a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
        ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c11));
        return ofPropertyValuesHolder;
    }
}
