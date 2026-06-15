package s5;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import u5.g;
import u5.k;
import u5.n;
/* compiled from: RippleDrawableCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a extends Drawable implements n, androidx.core.graphics.drawable.b {

    /* renamed from: a  reason: collision with root package name */
    private b f30778a;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a */
    public a mutate() {
        this.f30778a = new b(this.f30778a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f30778a;
        if (bVar.f30780b) {
            bVar.f30779a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f30778a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f30778a.f30779a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f30778a.f30779a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f30778a.f30779a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b10 = s5.b.b(iArr);
        b bVar = this.f30778a;
        if (bVar.f30780b != b10) {
            bVar.f30780b = b10;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f30778a.f30779a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f30778a.f30779a.setColorFilter(colorFilter);
    }

    @Override // u5.n
    public void setShapeAppearanceModel(k kVar) {
        this.f30778a.f30779a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i10) {
        this.f30778a.f30779a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f30778a.f30779a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f30778a.f30779a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RippleDrawableCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        g f30779a;

        /* renamed from: b  reason: collision with root package name */
        boolean f30780b;

        public b(g gVar) {
            this.f30779a = gVar;
            this.f30780b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f30779a = (g) bVar.f30779a.getConstantState().newDrawable();
            this.f30780b = bVar.f30780b;
        }
    }

    private a(b bVar) {
        this.f30778a = bVar;
    }
}
