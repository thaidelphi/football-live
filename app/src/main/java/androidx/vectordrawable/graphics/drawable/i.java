package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.k;
import androidx.core.graphics.d;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: VectorDrawableCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i extends androidx.vectordrawable.graphics.drawable.h {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f4479k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private h f4480b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuffColorFilter f4481c;

    /* renamed from: d  reason: collision with root package name */
    private ColorFilter f4482d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4483e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4484f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable.ConstantState f4485g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f4486h;

    /* renamed from: i  reason: collision with root package name */
    private final Matrix f4487i;

    /* renamed from: j  reason: collision with root package name */
    private final Rect f4488j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4515b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f4514a = androidx.core.graphics.d.d(string2);
            }
            this.f4516c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.j(xmlPullParser, "pathData")) {
                TypedArray k10 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4452d);
                f(k10, xmlPullParser);
                k10.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f4535a;

        /* renamed from: b  reason: collision with root package name */
        g f4536b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f4537c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f4538d;

        /* renamed from: e  reason: collision with root package name */
        boolean f4539e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f4540f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f4541g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f4542h;

        /* renamed from: i  reason: collision with root package name */
        int f4543i;

        /* renamed from: j  reason: collision with root package name */
        boolean f4544j;

        /* renamed from: k  reason: collision with root package name */
        boolean f4545k;

        /* renamed from: l  reason: collision with root package name */
        Paint f4546l;

        public h(h hVar) {
            this.f4537c = null;
            this.f4538d = i.f4479k;
            if (hVar != null) {
                this.f4535a = hVar.f4535a;
                g gVar = new g(hVar.f4536b);
                this.f4536b = gVar;
                if (hVar.f4536b.f4523e != null) {
                    gVar.f4523e = new Paint(hVar.f4536b.f4523e);
                }
                if (hVar.f4536b.f4522d != null) {
                    this.f4536b.f4522d = new Paint(hVar.f4536b.f4522d);
                }
                this.f4537c = hVar.f4537c;
                this.f4538d = hVar.f4538d;
                this.f4539e = hVar.f4539e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f4540f.getWidth() && i11 == this.f4540f.getHeight();
        }

        public boolean b() {
            return !this.f4545k && this.f4541g == this.f4537c && this.f4542h == this.f4538d && this.f4544j == this.f4539e && this.f4543i == this.f4536b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f4540f == null || !a(i10, i11)) {
                this.f4540f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f4545k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f4540f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (f() || colorFilter != null) {
                if (this.f4546l == null) {
                    Paint paint = new Paint();
                    this.f4546l = paint;
                    paint.setFilterBitmap(true);
                }
                this.f4546l.setAlpha(this.f4536b.getRootAlpha());
                this.f4546l.setColorFilter(colorFilter);
                return this.f4546l;
            }
            return null;
        }

        public boolean f() {
            return this.f4536b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f4536b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4535a;
        }

        public boolean h(int[] iArr) {
            boolean g10 = this.f4536b.g(iArr);
            this.f4545k |= g10;
            return g10;
        }

        public void i() {
            this.f4541g = this.f4537c;
            this.f4542h = this.f4538d;
            this.f4543i = this.f4536b.getRootAlpha();
            this.f4544j = this.f4539e;
            this.f4545k = false;
        }

        public void j(int i10, int i11) {
            this.f4540f.eraseColor(0);
            this.f4536b.b(new Canvas(this.f4540f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }

        public h() {
            this.f4537c = null;
            this.f4538d = i.f4479k;
            this.f4536b = new g();
        }
    }

    i() {
        this.f4484f = true;
        this.f4486h = new float[9];
        this.f4487i = new Matrix();
        this.f4488j = new Rect();
        this.f4480b = new h();
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static i b(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            i iVar = new i();
            iVar.f4478a = androidx.core.content.res.h.e(resources, i10, theme);
            iVar.f4485g = new C0081i(iVar.f4478a.getConstantState());
            return iVar;
        }
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
                return c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e8) {
            Log.e("VectorDrawableCompat", "parser error", e8);
            return null;
        } catch (XmlPullParserException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        }
    }

    public static i c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f4480b;
        g gVar = hVar.f4536b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f4526h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4502b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f4534p.put(cVar.getPathName(), cVar);
                    }
                    z10 = false;
                    hVar.f4535a = cVar.f4517d | hVar.f4535a;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4502b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f4534p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f4535a = bVar.f4517d | hVar.f4535a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4502b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f4534p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f4535a = dVar2.f4511k | hVar.f4535a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    private static PorterDuff.Mode g(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f4480b;
        g gVar = hVar.f4536b;
        hVar.f4538d = g(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c10 = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c10 != null) {
            hVar.f4537c = c10;
        }
        hVar.f4539e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f4539e);
        gVar.f4529k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f4529k);
        float f10 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f4530l);
        gVar.f4530l = f10;
        if (gVar.f4529k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f10 > 0.0f) {
            gVar.f4527i = typedArray.getDimension(3, gVar.f4527i);
            float dimension = typedArray.getDimension(2, gVar.f4528j);
            gVar.f4528j = dimension;
            if (gVar.f4527i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f4532n = string;
                    gVar.f4534p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b(drawable);
            return false;
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f4480b.f4536b.f4534p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f4488j);
        if (this.f4488j.width() <= 0 || this.f4488j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f4482d;
        if (colorFilter == null) {
            colorFilter = this.f4481c;
        }
        canvas.getMatrix(this.f4487i);
        this.f4487i.getValues(this.f4486h);
        float abs = Math.abs(this.f4486h[0]);
        float abs2 = Math.abs(this.f4486h[4]);
        float abs3 = Math.abs(this.f4486h[1]);
        float abs4 = Math.abs(this.f4486h[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min((int) com.ironsource.mediationsdk.metadata.a.f18931n, (int) (this.f4488j.width() * abs));
        int min2 = Math.min((int) com.ironsource.mediationsdk.metadata.a.f18931n, (int) (this.f4488j.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f4488j;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f4488j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f4488j.offsetTo(0, 0);
        this.f4480b.c(min, min2);
        if (!this.f4484f) {
            this.f4480b.j(min, min2);
        } else if (!this.f4480b.b()) {
            this.f4480b.j(min, min2);
            this.f4480b.i();
        }
        this.f4480b.d(canvas, colorFilter, this.f4488j);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f4480b.f4536b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4480b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.f4482d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f4478a != null && Build.VERSION.SDK_INT >= 24) {
            return new C0081i(this.f4478a.getConstantState());
        }
        this.f4480b.f4535a = getChangingConfigurations();
        return this.f4480b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f4480b.f4536b.f4528j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f4480b.f4536b.f4527i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z10) {
        this.f4484f = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.f4480b.f4539e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f4480b) != null && (hVar.g() || ((colorStateList = this.f4480b.f4537c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4483e && super.mutate() == this) {
            this.f4480b = new h(this.f4480b);
            this.f4483e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        h hVar = this.f4480b;
        ColorStateList colorStateList = hVar.f4537c;
        if (colorStateList != null && (mode = hVar.f4538d) != null) {
            this.f4481c = j(this.f4481c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (hVar.g() && hVar.h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f4480b.f4536b.getRootAlpha() != i10) {
            this.f4480b.f4536b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z10);
        } else {
            this.f4480b.f4539e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i10) {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f4480b;
        if (hVar.f4537c != colorStateList) {
            hVar.f4537c = colorStateList;
            this.f4481c = j(this.f4481c, colorStateList, hVar.f4538d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        h hVar = this.f4480b;
        if (hVar.f4538d != mode) {
            hVar.f4538d = mode;
            this.f4481c = j(this.f4481c, hVar.f4537c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.i$i  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class C0081i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f4547a;

        public C0081i(Drawable.ConstantState constantState) {
            this.f4547a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f4547a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4547a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f4478a = (VectorDrawable) this.f4547a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f4478a = (VectorDrawable) this.f4547a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f4478a = (VectorDrawable) this.f4547a.newDrawable(resources, theme);
            return iVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f4482d = colorFilter;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        protected d.b[] f4514a;

        /* renamed from: b  reason: collision with root package name */
        String f4515b;

        /* renamed from: c  reason: collision with root package name */
        int f4516c;

        /* renamed from: d  reason: collision with root package name */
        int f4517d;

        public f() {
            super();
            this.f4514a = null;
            this.f4516c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            d.b[] bVarArr = this.f4514a;
            if (bVarArr != null) {
                d.b.e(bVarArr, path);
            }
        }

        public d.b[] getPathData() {
            return this.f4514a;
        }

        public String getPathName() {
            return this.f4515b;
        }

        public void setPathData(d.b[] bVarArr) {
            if (!androidx.core.graphics.d.b(this.f4514a, bVarArr)) {
                this.f4514a = androidx.core.graphics.d.f(bVarArr);
            } else {
                androidx.core.graphics.d.j(this.f4514a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f4514a = null;
            this.f4516c = 0;
            this.f4515b = fVar.f4515b;
            this.f4517d = fVar.f4517d;
            this.f4514a = androidx.core.graphics.d.f(fVar.f4514a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4478a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f4480b;
        hVar.f4536b = new g();
        TypedArray k10 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4449a);
        i(k10, xmlPullParser, theme);
        k10.recycle();
        hVar.f4535a = getChangingConfigurations();
        hVar.f4545k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f4481c = j(this.f4481c, hVar.f4537c, hVar.f4538d);
    }

    i(h hVar) {
        this.f4484f = true;
        this.f4486h = new float[9];
        this.f4487i = new Matrix();
        this.f4488j = new Rect();
        this.f4480b = hVar;
        this.f4481c = j(this.f4481c, hVar.f4537c, hVar.f4538d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f4489e;

        /* renamed from: f  reason: collision with root package name */
        androidx.core.content.res.d f4490f;

        /* renamed from: g  reason: collision with root package name */
        float f4491g;

        /* renamed from: h  reason: collision with root package name */
        androidx.core.content.res.d f4492h;

        /* renamed from: i  reason: collision with root package name */
        float f4493i;

        /* renamed from: j  reason: collision with root package name */
        float f4494j;

        /* renamed from: k  reason: collision with root package name */
        float f4495k;

        /* renamed from: l  reason: collision with root package name */
        float f4496l;

        /* renamed from: m  reason: collision with root package name */
        float f4497m;

        /* renamed from: n  reason: collision with root package name */
        Paint.Cap f4498n;

        /* renamed from: o  reason: collision with root package name */
        Paint.Join f4499o;

        /* renamed from: p  reason: collision with root package name */
        float f4500p;

        c() {
            this.f4491g = 0.0f;
            this.f4493i = 1.0f;
            this.f4494j = 1.0f;
            this.f4495k = 0.0f;
            this.f4496l = 1.0f;
            this.f4497m = 0.0f;
            this.f4498n = Paint.Cap.BUTT;
            this.f4499o = Paint.Join.MITER;
            this.f4500p = 4.0f;
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return i10 != 2 ? cap : Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return i10 != 2 ? join : Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f4489e = null;
            if (k.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f4515b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f4514a = androidx.core.graphics.d.d(string2);
                }
                this.f4492h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f4494j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f4494j);
                this.f4498n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f4498n);
                this.f4499o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f4499o);
                this.f4500p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f4500p);
                this.f4490f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f4493i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f4493i);
                this.f4491g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f4491g);
                this.f4496l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f4496l);
                this.f4497m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f4497m);
                this.f4495k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f4495k);
                this.f4516c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f4516c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean a() {
            return this.f4492h.i() || this.f4490f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean b(int[] iArr) {
            return this.f4490f.j(iArr) | this.f4492h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4451c);
            h(k10, xmlPullParser, theme);
            k10.recycle();
        }

        float getFillAlpha() {
            return this.f4494j;
        }

        int getFillColor() {
            return this.f4492h.e();
        }

        float getStrokeAlpha() {
            return this.f4493i;
        }

        int getStrokeColor() {
            return this.f4490f.e();
        }

        float getStrokeWidth() {
            return this.f4491g;
        }

        float getTrimPathEnd() {
            return this.f4496l;
        }

        float getTrimPathOffset() {
            return this.f4497m;
        }

        float getTrimPathStart() {
            return this.f4495k;
        }

        void setFillAlpha(float f10) {
            this.f4494j = f10;
        }

        void setFillColor(int i10) {
            this.f4492h.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f4493i = f10;
        }

        void setStrokeColor(int i10) {
            this.f4490f.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f4491g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f4496l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f4497m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f4495k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f4491g = 0.0f;
            this.f4493i = 1.0f;
            this.f4494j = 1.0f;
            this.f4495k = 0.0f;
            this.f4496l = 1.0f;
            this.f4497m = 0.0f;
            this.f4498n = Paint.Cap.BUTT;
            this.f4499o = Paint.Join.MITER;
            this.f4500p = 4.0f;
            this.f4489e = cVar.f4489e;
            this.f4490f = cVar.f4490f;
            this.f4491g = cVar.f4491g;
            this.f4493i = cVar.f4493i;
            this.f4492h = cVar.f4492h;
            this.f4516c = cVar.f4516c;
            this.f4494j = cVar.f4494j;
            this.f4495k = cVar.f4495k;
            this.f4496l = cVar.f4496l;
            this.f4497m = cVar.f4497m;
            this.f4498n = cVar.f4498n;
            this.f4499o = cVar.f4499o;
            this.f4500p = cVar.f4500p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class g {

        /* renamed from: q  reason: collision with root package name */
        private static final Matrix f4518q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f4519a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f4520b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f4521c;

        /* renamed from: d  reason: collision with root package name */
        Paint f4522d;

        /* renamed from: e  reason: collision with root package name */
        Paint f4523e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f4524f;

        /* renamed from: g  reason: collision with root package name */
        private int f4525g;

        /* renamed from: h  reason: collision with root package name */
        final d f4526h;

        /* renamed from: i  reason: collision with root package name */
        float f4527i;

        /* renamed from: j  reason: collision with root package name */
        float f4528j;

        /* renamed from: k  reason: collision with root package name */
        float f4529k;

        /* renamed from: l  reason: collision with root package name */
        float f4530l;

        /* renamed from: m  reason: collision with root package name */
        int f4531m;

        /* renamed from: n  reason: collision with root package name */
        String f4532n;

        /* renamed from: o  reason: collision with root package name */
        Boolean f4533o;

        /* renamed from: p  reason: collision with root package name */
        final androidx.collection.a<String, Object> f4534p;

        public g() {
            this.f4521c = new Matrix();
            this.f4527i = 0.0f;
            this.f4528j = 0.0f;
            this.f4529k = 0.0f;
            this.f4530l = 0.0f;
            this.f4531m = 255;
            this.f4532n = null;
            this.f4533o = null;
            this.f4534p = new androidx.collection.a<>();
            this.f4526h = new d();
            this.f4519a = new Path();
            this.f4520b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f4501a.set(matrix);
            dVar.f4501a.preConcat(dVar.f4510j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f4502b.size(); i12++) {
                e eVar = dVar.f4502b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f4501a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f4529k;
            float f11 = i11 / this.f4530l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f4501a;
            this.f4521c.set(matrix);
            this.f4521c.postScale(f10, f11);
            float e8 = e(matrix);
            if (e8 == 0.0f) {
                return;
            }
            fVar.d(this.f4519a);
            Path path = this.f4519a;
            this.f4520b.reset();
            if (fVar.c()) {
                this.f4520b.setFillType(fVar.f4516c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f4520b.addPath(path, this.f4521c);
                canvas.clipPath(this.f4520b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f4495k;
            if (f12 != 0.0f || cVar.f4496l != 1.0f) {
                float f13 = cVar.f4497m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f4496l + f13) % 1.0f;
                if (this.f4524f == null) {
                    this.f4524f = new PathMeasure();
                }
                this.f4524f.setPath(this.f4519a, false);
                float length = this.f4524f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f4524f.getSegment(f16, length, path, true);
                    this.f4524f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f4524f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f4520b.addPath(path, this.f4521c);
            if (cVar.f4492h.l()) {
                androidx.core.content.res.d dVar2 = cVar.f4492h;
                if (this.f4523e == null) {
                    Paint paint = new Paint(1);
                    this.f4523e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f4523e;
                if (dVar2.h()) {
                    Shader f18 = dVar2.f();
                    f18.setLocalMatrix(this.f4521c);
                    paint2.setShader(f18);
                    paint2.setAlpha(Math.round(cVar.f4494j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(i.a(dVar2.e(), cVar.f4494j));
                }
                paint2.setColorFilter(colorFilter);
                this.f4520b.setFillType(cVar.f4516c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f4520b, paint2);
            }
            if (cVar.f4490f.l()) {
                androidx.core.content.res.d dVar3 = cVar.f4490f;
                if (this.f4522d == null) {
                    Paint paint3 = new Paint(1);
                    this.f4522d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f4522d;
                Paint.Join join = cVar.f4499o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f4498n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f4500p);
                if (dVar3.h()) {
                    Shader f19 = dVar3.f();
                    f19.setLocalMatrix(this.f4521c);
                    paint4.setShader(f19);
                    paint4.setAlpha(Math.round(cVar.f4493i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(i.a(dVar3.e(), cVar.f4493i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f4491g * min * e8);
                canvas.drawPath(this.f4520b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a10 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a10) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f4526h, f4518q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f4533o == null) {
                this.f4533o = Boolean.valueOf(this.f4526h.a());
            }
            return this.f4533o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f4526h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f4531m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f4531m = i10;
        }

        public g(g gVar) {
            this.f4521c = new Matrix();
            this.f4527i = 0.0f;
            this.f4528j = 0.0f;
            this.f4529k = 0.0f;
            this.f4530l = 0.0f;
            this.f4531m = 255;
            this.f4532n = null;
            this.f4533o = null;
            androidx.collection.a<String, Object> aVar = new androidx.collection.a<>();
            this.f4534p = aVar;
            this.f4526h = new d(gVar.f4526h, aVar);
            this.f4519a = new Path(gVar.f4519a);
            this.f4520b = new Path(gVar.f4520b);
            this.f4527i = gVar.f4527i;
            this.f4528j = gVar.f4528j;
            this.f4529k = gVar.f4529k;
            this.f4530l = gVar.f4530l;
            this.f4525g = gVar.f4525g;
            this.f4531m = gVar.f4531m;
            this.f4532n = gVar.f4532n;
            String str = gVar.f4532n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f4533o = gVar.f4533o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f4501a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<e> f4502b;

        /* renamed from: c  reason: collision with root package name */
        float f4503c;

        /* renamed from: d  reason: collision with root package name */
        private float f4504d;

        /* renamed from: e  reason: collision with root package name */
        private float f4505e;

        /* renamed from: f  reason: collision with root package name */
        private float f4506f;

        /* renamed from: g  reason: collision with root package name */
        private float f4507g;

        /* renamed from: h  reason: collision with root package name */
        private float f4508h;

        /* renamed from: i  reason: collision with root package name */
        private float f4509i;

        /* renamed from: j  reason: collision with root package name */
        final Matrix f4510j;

        /* renamed from: k  reason: collision with root package name */
        int f4511k;

        /* renamed from: l  reason: collision with root package name */
        private int[] f4512l;

        /* renamed from: m  reason: collision with root package name */
        private String f4513m;

        public d(d dVar, androidx.collection.a<String, Object> aVar) {
            super();
            f bVar;
            this.f4501a = new Matrix();
            this.f4502b = new ArrayList<>();
            this.f4503c = 0.0f;
            this.f4504d = 0.0f;
            this.f4505e = 0.0f;
            this.f4506f = 1.0f;
            this.f4507g = 1.0f;
            this.f4508h = 0.0f;
            this.f4509i = 0.0f;
            Matrix matrix = new Matrix();
            this.f4510j = matrix;
            this.f4513m = null;
            this.f4503c = dVar.f4503c;
            this.f4504d = dVar.f4504d;
            this.f4505e = dVar.f4505e;
            this.f4506f = dVar.f4506f;
            this.f4507g = dVar.f4507g;
            this.f4508h = dVar.f4508h;
            this.f4509i = dVar.f4509i;
            this.f4512l = dVar.f4512l;
            String str = dVar.f4513m;
            this.f4513m = str;
            this.f4511k = dVar.f4511k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f4510j);
            ArrayList<e> arrayList = dVar.f4502b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f4502b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        bVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f4502b.add(bVar);
                    String str2 = bVar.f4515b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f4510j.reset();
            this.f4510j.postTranslate(-this.f4504d, -this.f4505e);
            this.f4510j.postScale(this.f4506f, this.f4507g);
            this.f4510j.postRotate(this.f4503c, 0.0f, 0.0f);
            this.f4510j.postTranslate(this.f4508h + this.f4504d, this.f4509i + this.f4505e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f4512l = null;
            this.f4503c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f4503c);
            this.f4504d = typedArray.getFloat(1, this.f4504d);
            this.f4505e = typedArray.getFloat(2, this.f4505e);
            this.f4506f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f4506f);
            this.f4507g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f4507g);
            this.f4508h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f4508h);
            this.f4509i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f4509i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4513m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f4502b.size(); i10++) {
                if (this.f4502b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f4502b.size(); i10++) {
                z10 |= this.f4502b.get(i10).b(iArr);
            }
            return z10;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4450b);
            e(k10, xmlPullParser);
            k10.recycle();
        }

        public String getGroupName() {
            return this.f4513m;
        }

        public Matrix getLocalMatrix() {
            return this.f4510j;
        }

        public float getPivotX() {
            return this.f4504d;
        }

        public float getPivotY() {
            return this.f4505e;
        }

        public float getRotation() {
            return this.f4503c;
        }

        public float getScaleX() {
            return this.f4506f;
        }

        public float getScaleY() {
            return this.f4507g;
        }

        public float getTranslateX() {
            return this.f4508h;
        }

        public float getTranslateY() {
            return this.f4509i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f4504d) {
                this.f4504d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f4505e) {
                this.f4505e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f4503c) {
                this.f4503c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f4506f) {
                this.f4506f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f4507g) {
                this.f4507g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f4508h) {
                this.f4508h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f4509i) {
                this.f4509i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f4501a = new Matrix();
            this.f4502b = new ArrayList<>();
            this.f4503c = 0.0f;
            this.f4504d = 0.0f;
            this.f4505e = 0.0f;
            this.f4506f = 1.0f;
            this.f4507g = 1.0f;
            this.f4508h = 0.0f;
            this.f4509i = 0.0f;
            this.f4510j = new Matrix();
            this.f4513m = null;
        }
    }
}
