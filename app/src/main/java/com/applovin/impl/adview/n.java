package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.e;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n extends e {

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f6643c = new Paint(1);

    /* renamed from: d  reason: collision with root package name */
    private static final Paint f6644d = new Paint(1);

    /* renamed from: e  reason: collision with root package name */
    private static final Paint f6645e = new Paint(1);

    public n(Context context) {
        super(context);
        f6643c.setColor(-1);
        f6644d.setColor(-16777216);
        Paint paint = f6645e;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getCrossOffset() {
        return this.f6612a * 10.0f;
    }

    protected float getInnerCircleOffset() {
        return this.f6612a * 2.0f;
    }

    protected float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    protected float getStrokeWidth() {
        return this.f6612a * 3.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f6643c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f6644d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f6645e;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
