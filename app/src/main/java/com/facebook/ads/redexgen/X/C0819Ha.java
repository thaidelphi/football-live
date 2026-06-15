package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* renamed from: com.facebook.ads.redexgen.X.Ha  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0819Ha extends RelativeLayout {
    public final Paint A00;
    public final RectF A01;

    public C0819Ha(C1900k1 c1900k1, String str) {
        super(c1900k1);
        float f10 = c1900k1.getResources().getDisplayMetrics().density;
        TextView textView = new TextView(c1900k1);
        textView.setTextColor(-16777216);
        textView.setTextSize(16.0f);
        textView.setText(str);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        float density = 6.0f * f10;
        int i10 = (int) density;
        textView.setPadding(i10, i10, i10, i10);
        addView(textView);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        this.A00.setColor(-1);
        this.A01 = new RectF();
        D3.A0K(this, 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10 = getContext().getResources().getDisplayMetrics().density;
        this.A01.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(this.A01, f10 * 10.0f, 10.0f * f10, this.A00);
        super.onDraw(canvas);
    }
}
