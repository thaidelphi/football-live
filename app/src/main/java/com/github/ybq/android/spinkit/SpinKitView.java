package com.github.ybq.android.spinkit;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import u2.a;
import u2.b;
import u2.c;
import u2.d;
import u2.e;
import x2.f;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SpinKitView extends ProgressBar {

    /* renamed from: a  reason: collision with root package name */
    private e f10397a;

    /* renamed from: b  reason: collision with root package name */
    private int f10398b;

    /* renamed from: c  reason: collision with root package name */
    private f f10399c;

    public SpinKitView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f31315a);
    }

    private void a() {
        f a10 = d.a(this.f10397a);
        a10.u(this.f10398b);
        setIndeterminateDrawable(a10);
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i10) {
        f fVar;
        super.onScreenStateChanged(i10);
        if (i10 != 0 || (fVar = this.f10399c) == null) {
            return;
        }
        fVar.stop();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10 && this.f10399c != null && getVisibility() == 0) {
            this.f10399c.start();
        }
    }

    public void setColor(int i10) {
        this.f10398b = i10;
        f fVar = this.f10399c;
        if (fVar != null) {
            fVar.u(i10);
        }
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof f) {
            setIndeterminateDrawable((f) drawable);
            return;
        }
        throw new IllegalArgumentException("this d must be instanceof Sprite");
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        if (drawable instanceof f) {
            ((f) drawable).stop();
        }
    }

    public SpinKitView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, b.f31316a);
    }

    @Override // android.widget.ProgressBar
    public f getIndeterminateDrawable() {
        return this.f10399c;
    }

    @TargetApi(21)
    public SpinKitView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f31317a, i10, i11);
        this.f10397a = e.values()[obtainStyledAttributes.getInt(c.f31319c, 0)];
        this.f10398b = obtainStyledAttributes.getColor(c.f31318b, -1);
        obtainStyledAttributes.recycle();
        a();
        setIndeterminate(true);
    }

    public void setIndeterminateDrawable(f fVar) {
        super.setIndeterminateDrawable((Drawable) fVar);
        this.f10399c = fVar;
        if (fVar.c() == 0) {
            this.f10399c.u(this.f10398b);
        }
        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
        if (getVisibility() == 0) {
            this.f10399c.start();
        }
    }
}
