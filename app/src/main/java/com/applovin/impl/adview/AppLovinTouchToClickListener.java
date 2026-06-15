package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.l0;
import com.applovin.impl.o4;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final long f6532a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6533b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6534c;

    /* renamed from: d  reason: collision with root package name */
    private final ClickRecognitionState f6535d;

    /* renamed from: e  reason: collision with root package name */
    private long f6536e;

    /* renamed from: f  reason: collision with root package name */
    private PointF f6537f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6538g;

    /* renamed from: h  reason: collision with root package name */
    private final Context f6539h;

    /* renamed from: i  reason: collision with root package name */
    private final OnClickListener f6540i;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.j jVar, o4 o4Var, Context context, OnClickListener onClickListener) {
        this.f6532a = ((Long) jVar.a(o4.f8139j0)).longValue();
        this.f6533b = ((Integer) jVar.a(o4.f8147k0)).intValue();
        this.f6534c = AppLovinSdkUtils.dpToPx(context, ((Integer) jVar.a(o4.f8187p0)).intValue());
        this.f6535d = ClickRecognitionState.values()[((Integer) jVar.a(o4Var)).intValue()];
        this.f6539h = context;
        this.f6540i = onClickListener;
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f6540i.onClick(view, motionEvent);
        this.f6538g = true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f6538g && this.f6535d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.f6538g && this.f6535d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.f6535d == ClickRecognitionState.DISABLED) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f6536e;
                float a10 = a(this.f6537f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f6538g) {
                    long j10 = this.f6532a;
                    if ((j10 < 0 || elapsedRealtime < j10) && ((i10 = this.f6533b) < 0 || a10 < i10)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.f6535d == ClickRecognitionState.ACTION_DOWN) {
            if (a(motionEvent)) {
                a(view, motionEvent);
            }
        } else {
            this.f6536e = SystemClock.elapsedRealtime();
            this.f6537f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f6538g = false;
        }
        return true;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f10 = pointF.x - pointF2.x;
        float f11 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f10 * f10) + (f11 * f11)));
    }

    private float a(float f10) {
        return f10 / this.f6539h.getResources().getDisplayMetrics().density;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f6534c <= 0) {
            return true;
        }
        Point b10 = l0.b(this.f6539h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i10 = this.f6534c;
        float f10 = i10;
        return rawX >= f10 && rawY >= f10 && rawX <= ((float) (b10.x - i10)) && rawY <= ((float) (b10.y - i10));
    }
}
