package g;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.p0;
import androidx.collection.i;
import androidx.core.content.res.k;
import g.b;
import g.d;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: AnimatedStateListDrawableCompat.java */
@SuppressLint({"RestrictedAPI"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a extends g.d implements androidx.core.graphics.drawable.b {

    /* renamed from: t  reason: collision with root package name */
    private static final String f25620t = a.class.getSimpleName();

    /* renamed from: o  reason: collision with root package name */
    private c f25621o;

    /* renamed from: p  reason: collision with root package name */
    private g f25622p;

    /* renamed from: q  reason: collision with root package name */
    private int f25623q;

    /* renamed from: r  reason: collision with root package name */
    private int f25624r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f25625s;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private final Animatable f25626a;

        b(Animatable animatable) {
            super();
            this.f25626a = animatable;
        }

        @Override // g.a.g
        public void c() {
            this.f25626a.start();
        }

        @Override // g.a.g
        public void d() {
            this.f25626a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c extends d.a {
        androidx.collection.e<Long> K;
        i<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new androidx.collection.e<>();
            this.L = new i<>();
        }

        private static long D(int i10, int i11) {
            return i11 | (i10 << 32);
        }

        int B(int[] iArr, Drawable drawable, int i10) {
            int z10 = super.z(iArr, drawable);
            this.L.k(z10, Integer.valueOf(i10));
            return z10;
        }

        int C(int i10, int i11, Drawable drawable, boolean z10) {
            int a10 = super.a(drawable);
            long D = D(i10, i11);
            long j10 = z10 ? 8589934592L : 0L;
            long j11 = a10;
            this.K.c(D, Long.valueOf(j11 | j10));
            if (z10) {
                this.K.c(D(i11, i10), Long.valueOf(4294967296L | j11 | j10));
            }
            return a10;
        }

        int E(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return this.L.h(i10, 0).intValue();
        }

        int F(int[] iArr) {
            int A = super.A(iArr);
            return A >= 0 ? A : super.A(StateSet.WILD_CARD);
        }

        int G(int i10, int i11) {
            return (int) this.K.h(D(i10, i11), -1L).longValue();
        }

        boolean H(int i10, int i11) {
            return (this.K.h(D(i10, i11), -1L).longValue() & 4294967296L) != 0;
        }

        boolean I(int i10, int i11) {
            return (this.K.h(D(i10, i11), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // g.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // g.d.a, g.b.d
        void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // g.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.c f25627a;

        d(androidx.vectordrawable.graphics.drawable.c cVar) {
            super();
            this.f25627a = cVar;
        }

        @Override // g.a.g
        public void c() {
            this.f25627a.start();
        }

        @Override // g.a.g
        public void d() {
            this.f25627a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        private final ObjectAnimator f25628a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f25629b;

        e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            if (Build.VERSION.SDK_INT >= 18) {
                h.b.a(ofInt, true);
            }
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.f25629b = z11;
            this.f25628a = ofInt;
        }

        @Override // g.a.g
        public boolean a() {
            return this.f25629b;
        }

        @Override // g.a.g
        public void b() {
            this.f25628a.reverse();
        }

        @Override // g.a.g
        public void c() {
            this.f25628a.start();
        }

        @Override // g.a.g
        public void d() {
            this.f25628a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        private int[] f25630a;

        /* renamed from: b  reason: collision with root package name */
        private int f25631b;

        /* renamed from: c  reason: collision with root package name */
        private int f25632c;

        f(AnimationDrawable animationDrawable, boolean z10) {
            b(animationDrawable, z10);
        }

        int a() {
            return this.f25632c;
        }

        int b(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f25631b = numberOfFrames;
            int[] iArr = this.f25630a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f25630a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f25630a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f25632c = i10;
            return i10;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            int i10 = (int) ((f10 * this.f25632c) + 0.5f);
            int i11 = this.f25631b;
            int[] iArr = this.f25630a;
            int i12 = 0;
            while (i12 < i11 && i10 >= iArr[i12]) {
                i10 -= iArr[i12];
                i12++;
            }
            return (i12 / i11) + (i12 < i11 ? i10 / this.f25632c : 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k10 = k.k(resources, theme, attributeSet, h.e.f26161h);
        int resourceId = k10.getResourceId(h.e.f26162i, 0);
        int resourceId2 = k10.getResourceId(h.e.f26163j, -1);
        Drawable j10 = resourceId2 > 0 ? p0.h().j(context, resourceId2) : null;
        k10.recycle();
        int[] k11 = k(attributeSet);
        if (j10 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("vector")) {
                    j10 = androidx.vectordrawable.graphics.drawable.i.c(resources, xmlPullParser, attributeSet, theme);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    j10 = h.c.a(resources, xmlPullParser, attributeSet, theme);
                } else {
                    j10 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j10 != null) {
            return this.f25621o.B(k11, j10, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k10 = k.k(resources, theme, attributeSet, h.e.f26164k);
        int resourceId = k10.getResourceId(h.e.f26167n, -1);
        int resourceId2 = k10.getResourceId(h.e.f26166m, -1);
        int resourceId3 = k10.getResourceId(h.e.f26165l, -1);
        Drawable j10 = resourceId3 > 0 ? p0.h().j(context, resourceId3) : null;
        boolean z10 = k10.getBoolean(h.e.f26168o, false);
        k10.recycle();
        if (j10 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("animated-vector")) {
                    j10 = androidx.vectordrawable.graphics.drawable.c.a(context, resources, xmlPullParser, attributeSet, theme);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    j10 = h.c.a(resources, xmlPullParser, attributeSet, theme);
                } else {
                    j10 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j10 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f25621o.C(resourceId, resourceId2, j10, z10);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    private boolean s(int i10) {
        int c10;
        int G;
        g bVar;
        g gVar = this.f25622p;
        if (gVar != null) {
            if (i10 == this.f25623q) {
                return true;
            }
            if (i10 == this.f25624r && gVar.a()) {
                gVar.b();
                this.f25623q = this.f25624r;
                this.f25624r = i10;
                return true;
            }
            c10 = this.f25623q;
            gVar.d();
        } else {
            c10 = c();
        }
        this.f25622p = null;
        this.f25624r = -1;
        this.f25623q = -1;
        c cVar = this.f25621o;
        int E = cVar.E(c10);
        int E2 = cVar.E(i10);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else if (current instanceof androidx.vectordrawable.graphics.drawable.c) {
            bVar = new d((androidx.vectordrawable.graphics.drawable.c) current);
        } else {
            if (current instanceof Animatable) {
                bVar = new b((Animatable) current);
            }
            return false;
        }
        bVar.c();
        this.f25622p = bVar;
        this.f25624r = c10;
        this.f25623q = i10;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.f25621o;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f25650d |= h.c.b(typedArray);
        }
        cVar.x(typedArray.getBoolean(h.e.f26157d, cVar.f25655i));
        cVar.t(typedArray.getBoolean(h.e.f26158e, cVar.f25658l));
        cVar.u(typedArray.getInt(h.e.f26159f, cVar.A));
        cVar.v(typedArray.getInt(h.e.f26160g, cVar.B));
        setDither(typedArray.getBoolean(h.e.f26155b, cVar.f25670x));
    }

    @Override // g.d, g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g.d, g.b
    public void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.f25621o = (c) dVar;
        }
    }

    @Override // g.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // g.d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f25622p;
        if (gVar != null) {
            gVar.d();
            this.f25622p = null;
            g(this.f25623q);
            this.f25623q = -1;
            this.f25624r = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g.d
    /* renamed from: l */
    public c j() {
        return new c(this.f25621o, this, null);
    }

    @Override // g.d, g.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f25625s && super.mutate() == this) {
            this.f25621o.r();
            this.f25625s = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray k10 = k.k(resources, theme, attributeSet, h.e.f26154a);
        setVisible(k10.getBoolean(h.e.f26156c, true), true);
        t(k10);
        i(resources);
        k10.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i10) {
        return super.onLayoutDirectionChanged(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g.d, g.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int F = this.f25621o.F(iArr);
        boolean z10 = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z10 | current.setState(iArr) : z10;
    }

    @Override // g.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        super.scheduleDrawable(drawable, runnable, j10);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z10) {
        super.setAutoMirrored(z10);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z10) {
        super.setDither(z10);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // g.b, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // g.b, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.f25622p;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // g.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    a(c cVar, Resources resources) {
        super(null);
        this.f25623q = -1;
        this.f25624r = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
