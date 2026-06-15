package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
/* compiled from: CutoutDrawable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class c extends u5.g {
    private final RectF A;

    /* renamed from: z  reason: collision with root package name */
    private final Paint f14600z;

    c() {
        this(null);
    }

    private void n0() {
        this.f14600z.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f14600z.setColor(-1);
        this.f14600z.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j0() {
        return !this.A.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k0() {
        l0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void l0(float f10, float f11, float f12, float f13) {
        RectF rectF = this.A;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m0(RectF rectF) {
        l0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u5.g
    public void r(Canvas canvas) {
        if (this.A.isEmpty()) {
            super.r(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.A);
        } else {
            canvas.clipRect(this.A, Region.Op.DIFFERENCE);
        }
        super.r(canvas);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(u5.k kVar) {
        super(kVar == null ? new u5.k() : kVar);
        this.f14600z = new Paint(1);
        n0();
        this.A = new RectF();
    }
}
