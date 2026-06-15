package c5;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import c5.d;
/* compiled from: TouchTracker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* renamed from: c  reason: collision with root package name */
    private final a f5534c;

    /* renamed from: d  reason: collision with root package name */
    private final float f5535d;

    /* renamed from: e  reason: collision with root package name */
    private final GestureDetector f5536e;

    /* renamed from: a  reason: collision with root package name */
    private final PointF f5532a = new PointF();

    /* renamed from: b  reason: collision with root package name */
    private final PointF f5533b = new PointF();

    /* renamed from: f  reason: collision with root package name */
    private volatile float f5537f = 3.1415927f;

    /* compiled from: TouchTracker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void b(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public m(Context context, a aVar, float f10) {
        this.f5534c = aVar;
        this.f5535d = f10;
        this.f5536e = new GestureDetector(context, this);
    }

    @Override // c5.d.a
    public void a(float[] fArr, float f10) {
        this.f5537f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f5532a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f5532a.x) / this.f5535d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f5532a;
        float f12 = (y10 - pointF.y) / this.f5535d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f5537f;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f5533b;
        pointF2.x -= (cos * x10) - (sin * f12);
        float f13 = pointF2.y + (sin * x10) + (cos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f5534c.b(this.f5533b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f5534c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f5536e.onTouchEvent(motionEvent);
    }
}
