package com.appnext.ads.fullscreen;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Circle extends View {

    /* renamed from: a  reason: collision with root package name */
    private Paint f10013a;

    /* renamed from: b  reason: collision with root package name */
    private RectF f10014b;

    /* renamed from: c  reason: collision with root package name */
    private float f10015c;

    public Circle(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        try {
            float a10 = com.appnext.core.i.a(context, 5.0f);
            Paint paint = new Paint();
            this.f10013a = paint;
            paint.setAntiAlias(true);
            this.f10013a.setStyle(Paint.Style.STROKE);
            this.f10013a.setStrokeWidth(a10);
            this.f10013a.setColor(-1);
            this.f10013a.setShadowLayer(2.0f, 2.0f, 2.0f, Color.argb(128, 0, 0, 0));
            setLayerType(1, this.f10013a);
            this.f10014b = new RectF(a10, a10, com.appnext.core.i.a(context, 20.0f) + a10, com.appnext.core.i.a(context, 20.0f) + a10);
            this.f10015c = 360.0f;
        } catch (Throwable th) {
            com.appnext.base.a.a("Circle$init", th);
        }
    }

    public float getAngle() {
        return this.f10015c;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            canvas.drawArc(this.f10014b, 180.0f, this.f10015c, false, this.f10013a);
        } catch (Throwable th) {
            com.appnext.base.a.a("Circle$onDraw", th);
        }
    }

    public void setAngle(float f10) {
        this.f10015c = f10;
    }

    public Circle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }
}
