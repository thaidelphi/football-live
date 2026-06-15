package com.applovin.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.applovin.sdk.AppLovinMediationProvider;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f0 extends View {

    /* renamed from: w  reason: collision with root package name */
    private static final int f6940w = Color.rgb(66, 145, 241);

    /* renamed from: x  reason: collision with root package name */
    private static final int f6941x = Color.rgb(66, 145, 241);

    /* renamed from: y  reason: collision with root package name */
    private static final int f6942y = Color.rgb(66, 145, 241);

    /* renamed from: a  reason: collision with root package name */
    private Paint f6943a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f6944b;

    /* renamed from: c  reason: collision with root package name */
    protected Paint f6945c;

    /* renamed from: d  reason: collision with root package name */
    protected Paint f6946d;

    /* renamed from: e  reason: collision with root package name */
    private RectF f6947e;

    /* renamed from: f  reason: collision with root package name */
    private float f6948f;

    /* renamed from: g  reason: collision with root package name */
    private int f6949g;

    /* renamed from: h  reason: collision with root package name */
    private int f6950h;

    /* renamed from: i  reason: collision with root package name */
    private int f6951i;

    /* renamed from: j  reason: collision with root package name */
    private int f6952j;

    /* renamed from: k  reason: collision with root package name */
    private int f6953k;

    /* renamed from: l  reason: collision with root package name */
    private float f6954l;

    /* renamed from: m  reason: collision with root package name */
    private int f6955m;

    /* renamed from: n  reason: collision with root package name */
    private String f6956n;

    /* renamed from: o  reason: collision with root package name */
    private String f6957o;

    /* renamed from: p  reason: collision with root package name */
    private float f6958p;

    /* renamed from: q  reason: collision with root package name */
    private String f6959q;

    /* renamed from: r  reason: collision with root package name */
    private float f6960r;

    /* renamed from: s  reason: collision with root package name */
    private final float f6961s;

    /* renamed from: t  reason: collision with root package name */
    private final float f6962t;

    /* renamed from: u  reason: collision with root package name */
    private final float f6963u;

    /* renamed from: v  reason: collision with root package name */
    private final int f6964v;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(Resources resources, float f10) {
            return (f10 * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(Resources resources, float f10) {
            return f10 * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public f0(Context context) {
        this(context, null);
    }

    private float getProgressAngle() {
        return (getProgress() / this.f6952j) * 360.0f;
    }

    protected void a() {
        this.f6953k = f6940w;
        this.f6949g = f6941x;
        this.f6948f = this.f6962t;
        setMax(100);
        setProgress(0);
        this.f6954l = this.f6961s;
        this.f6955m = 0;
        this.f6958p = this.f6963u;
        this.f6950h = f6942y;
    }

    protected void b() {
        TextPaint textPaint = new TextPaint();
        this.f6945c = textPaint;
        textPaint.setColor(this.f6949g);
        this.f6945c.setTextSize(this.f6948f);
        this.f6945c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f6946d = textPaint2;
        textPaint2.setColor(this.f6950h);
        this.f6946d.setTextSize(this.f6958p);
        this.f6946d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f6943a = paint;
        paint.setColor(this.f6953k);
        this.f6943a.setStyle(Paint.Style.STROKE);
        this.f6943a.setAntiAlias(true);
        this.f6943a.setStrokeWidth(this.f6954l);
        Paint paint2 = new Paint();
        this.f6944b = paint2;
        paint2.setColor(this.f6955m);
        this.f6944b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.f6953k;
    }

    public float getFinishedStrokeWidth() {
        return this.f6954l;
    }

    public int getInnerBackgroundColor() {
        return this.f6955m;
    }

    public String getInnerBottomText() {
        return this.f6959q;
    }

    public int getInnerBottomTextColor() {
        return this.f6950h;
    }

    public float getInnerBottomTextSize() {
        return this.f6958p;
    }

    public int getMax() {
        return this.f6952j;
    }

    public String getPrefixText() {
        return this.f6956n;
    }

    public int getProgress() {
        return this.f6951i;
    }

    public String getSuffixText() {
        return this.f6957o;
    }

    public int getTextColor() {
        return this.f6949g;
    }

    public float getTextSize() {
        return this.f6948f;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f6954l;
        this.f6947e.set(f10, f10, getWidth() - f10, getHeight() - f10);
        float f11 = this.f6954l;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((getWidth() - f11) + f11) / 2.0f, this.f6944b);
        canvas.drawArc(this.f6947e, 270.0f, -getProgressAngle(), false, this.f6943a);
        String str = this.f6956n + this.f6951i + this.f6957o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f6945c.measureText(str)) / 2.0f, (getWidth() - (this.f6945c.descent() + this.f6945c.ascent())) / 2.0f, this.f6945c);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.f6946d.setTextSize(this.f6958p);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.f6946d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f6960r) - ((this.f6945c.descent() + this.f6945c.ascent()) / 2.0f), this.f6946d);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(a(i10), a(i11));
        this.f6960r = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f6949g = bundle.getInt("text_color");
            this.f6948f = bundle.getFloat("text_size");
            this.f6958p = bundle.getFloat("inner_bottom_text_size");
            this.f6959q = bundle.getString("inner_bottom_text");
            this.f6950h = bundle.getInt("inner_bottom_text_color");
            this.f6953k = bundle.getInt("finished_stroke_color");
            this.f6954l = bundle.getFloat("finished_stroke_width");
            this.f6955m = bundle.getInt("inner_background_color");
            b();
            setMax(bundle.getInt(AppLovinMediationProvider.MAX));
            setProgress(bundle.getInt("progress"));
            this.f6956n = bundle.getString("prefix");
            this.f6957o = bundle.getString("suffix");
            super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt(AppLovinMediationProvider.MAX, getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i10) {
        this.f6953k = i10;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f10) {
        this.f6954l = f10;
        invalidate();
    }

    public void setInnerBackgroundColor(int i10) {
        this.f6955m = i10;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f6959q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i10) {
        this.f6950h = i10;
        invalidate();
    }

    public void setInnerBottomTextSize(float f10) {
        this.f6958p = f10;
        invalidate();
    }

    public void setMax(int i10) {
        if (i10 > 0) {
            this.f6952j = i10;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f6956n = str;
        invalidate();
    }

    public void setProgress(int i10) {
        this.f6951i = i10;
        if (i10 > getMax()) {
            this.f6951i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f6957o = str;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f6949g = i10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f6948f = f10;
        invalidate();
    }

    public f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6947e = new RectF();
        this.f6951i = 0;
        this.f6956n = "";
        this.f6957o = "";
        this.f6959q = "";
        this.f6962t = a.d(getResources(), 14.0f);
        this.f6964v = (int) a.c(getResources(), 100.0f);
        this.f6961s = a.c(getResources(), 4.0f);
        this.f6963u = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private int a(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int i11 = this.f6964v;
        return mode == Integer.MIN_VALUE ? Math.min(i11, size) : i11;
    }
}
