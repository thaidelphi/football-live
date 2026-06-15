package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.bT  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1379bT extends ImageView implements IQ {
    public static byte[] A06;
    public static String[] A07 = {"aghB38UhEEJpk0kXnwVgQHJdsNEW", "Z42NiOwJIVHIw0Yvb2zaIIHOyWtQtdjq", "3gFse8uXyFGORzgMyq8kaPi65dxCnZzv", "Jw8apcEAXkOZ3AQdkmgk3jwFJH7gSyWz", "3SkqDykKznuf11rk6OObVQ9S0DbCfrGf", "LUP6WVZdZh28wzzt0Y5b2oxyslCE6YSF", "OrWA41O07SU0jmvClar47c0fhMdTsOQM", "iv"};
    public static final int A08;
    public static final int A09;
    public C1433cL A00;
    public final Paint A01;
    public final RectF A02;
    public final C1900k1 A03;
    public final AF A04;
    public final AbstractC1396bk A05;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[2].charAt(1) == 'n') {
                throw new RuntimeException();
            }
            A07[4] = "46k42TMmXNLOzm12QaWH4fref2fTAqwO";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 73);
            i13++;
        }
    }

    public static void A06() {
        A06 = new byte[]{44, 20, 21, 4, 65, 32, 5};
    }

    static {
        A06();
        A09 = (int) (CP.A02 * 4.0f);
        A08 = (int) (CP.A02 * 6.0f);
    }

    public C1379bT(C1900k1 c1900k1, AF af) {
        this(c1900k1, af, false);
    }

    public C1379bT(C1900k1 c1900k1, AF af, boolean z10) {
        super(c1900k1);
        this.A05 = new KF(this);
        this.A04 = af;
        this.A03 = c1900k1;
        if (z10) {
            this.A02 = new RectF();
        } else {
            this.A02 = null;
        }
        this.A01 = new Paint();
        this.A01.setColor(-1728053248);
        setColorFilter(-1);
        setPadding(A09, A09, A09, A09);
        setContentDescription(A03(0, 7, 40));
        A05();
        setOnClickListener(new View$OnClickListenerC0852Ih(this));
    }

    private void A04() {
        setImageBitmap(DC.A01(DB.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(DC.A01(DB.SOUND_ON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A07() {
        return this.A00 != null && this.A00.getVolume() == 0.0f;
    }

    public final void A09() {
        if (this.A00 == null) {
            return;
        }
        if (A07()) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.X.IQ
    public final void AAk(C1433cL c1433cL) {
        this.A00 = c1433cL;
        if (this.A00 != null) {
            this.A00.getEventBus().A05(this.A05);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IQ
    public final void AJa(C1433cL c1433cL) {
        if (this.A00 != null) {
            this.A00.getEventBus().A06(this.A05);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int x10 = getHeight();
        int y10 = x10 / 2;
        if (this.A02 != null) {
            RectF rectF = this.A02;
            int x11 = getWidth();
            float f10 = x11;
            int x12 = getHeight();
            rectF.set(0.0f, 0.0f, f10, x12);
            RectF rectF2 = this.A02;
            int x13 = A08;
            float f11 = x13;
            if (A07[3].charAt(1) == 84) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "zT7YbptMnSmKw0M5I4XTvaxbvvVXxWiN";
            strArr[1] = "NI8lQWe2kpQIwBdYvxwMMOMmXOv2vWWW";
            int x14 = A08;
            canvas.drawRoundRect(rectF2, f11, x14, this.A01);
        } else {
            int x15 = Math.min(width, y10);
            canvas.drawCircle(width, y10, x15, this.A01);
        }
        super.onDraw(canvas);
    }

    public void setBackgroundPaintColor(int i10) {
        this.A01.setColor(i10);
    }
}
