package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.a0;
/* compiled from: CircleImageView.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class a extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private Animation.AnimationListener f4409a;

    /* renamed from: b  reason: collision with root package name */
    private int f4410b;

    /* renamed from: c  reason: collision with root package name */
    private int f4411c;

    /* compiled from: CircleImageView.java */
    /* renamed from: androidx.swiperefreshlayout.widget.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class C0078a extends OvalShape {

        /* renamed from: a  reason: collision with root package name */
        private Paint f4412a = new Paint();

        /* renamed from: b  reason: collision with root package name */
        private int f4413b;

        /* renamed from: c  reason: collision with root package name */
        private a f4414c;

        C0078a(a aVar, int i10) {
            this.f4414c = aVar;
            this.f4413b = i10;
            c((int) rect().width());
        }

        private void c(int i10) {
            float f10 = i10 / 2;
            this.f4412a.setShader(new RadialGradient(f10, f10, this.f4413b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width;
            float width2 = this.f4414c.getWidth() / 2;
            float height = this.f4414c.getHeight() / 2;
            canvas.drawCircle(width2, height, width2, this.f4412a);
            canvas.drawCircle(width2, height, width - this.f4413b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            c((int) f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i10 = (int) (1.75f * f10);
        int i11 = (int) (0.0f * f10);
        this.f4410b = (int) (3.5f * f10);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(y0.a.f32824f);
        this.f4411c = obtainStyledAttributes.getColor(y0.a.f32825g, -328966);
        obtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            a0.y0(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0078a(this, this.f4410b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f4410b, i11, i10, 503316480);
            int i12 = this.f4410b;
            setPadding(i12, i12, i12, i12);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f4411c);
        a0.u0(this, shapeDrawable);
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f4409a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f4409a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f4409a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f4410b * 2), getMeasuredHeight() + (this.f4410b * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
            this.f4411c = i10;
        }
    }
}
