package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.bS  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1378bS extends ImageView implements IQ {
    public static byte[] A05;
    public static String[] A06 = {"4xWU9o1Qdv49zg4k19WdZrOQJ68qlBKJ", "QfpLWsUkij8dLfBb7Aagb5qXzjDoxZj6", "QolGMRpELvSET2", "SiemLW4oVdpf", "uXL2k0aAaj67psTeNQKHhn5IgBi2NdXT", "OArHsnP", "A54GrsZIV89x3qzJRphed5abiMfcDTpl", "7SQmPw6zIXtGY8y4ylHwiNNuEQdMSmlG"};
    public static final int A07;
    public static final int A08;
    public C1433cL A00;
    public final Paint A01;
    public final C1900k1 A02;
    public final AF A03;
    public final AbstractC1396bk A04;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 62);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-100, -60, -61, -76, 111, -112, -77};
    }

    static {
        A06();
        A08 = (int) (CP.A02 * 40.0f);
        A07 = (int) (CP.A02 * 10.0f);
    }

    public C1378bS(C1900k1 c1900k1, AF af) {
        super(c1900k1);
        this.A04 = new KE(this);
        this.A03 = af;
        this.A02 = c1900k1;
        this.A01 = new Paint();
        this.A01.setColor(RecyclerView.UNDEFINED_DURATION);
        setColorFilter(-1);
        setPadding(A07, A07, A07, A07);
        setContentDescription(A03(0, 7, 17));
        A05();
        setOnClickListener(new View$OnClickListenerC0853Ii(this));
    }

    private void A04() {
        setImageBitmap(DC.A01(DB.ICON_MUTE));
    }

    private void A05() {
        setImageBitmap(DC.A01(DB.ICON_UN_MUTE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A07() {
        return this.A00 != null && this.A00.getVolume() == 0.0f;
    }

    public final void A09() {
        if (this.A00 == null) {
            return;
        }
        boolean A072 = A07();
        if (A06[3].length() != 12) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[7] = "aX931uSfPaE8IiOHtPCxhipRkXbTn1t9";
        strArr[4] = "ET7wr0zhj8rUQx1GjBOUHwAZuNFVr5BQ";
        if (A072) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.X.IQ
    public final void AAk(C1433cL c1433cL) {
        this.A00 = c1433cL;
        if (this.A00 != null) {
            this.A00.getEventBus().A05(this.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IQ
    public final void AJa(C1433cL c1433cL) {
        if (this.A00 != null) {
            C9J<C9K, C9I> eventBus = this.A00.getEventBus();
            AbstractC1396bk abstractC1396bk = this.A04;
            String[] strArr = A06;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[6] = "f5V50lgekxKfxPRjN4EQZ5T7YD8zyqkA";
            strArr2[1] = "6bYokHrcutoPgrqwaKTDD5vNcVht1LGT";
            eventBus.A06(abstractC1396bk);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int y10 = getWidth() / 2;
        int x10 = getHeight() / 2;
        canvas.drawCircle(y10, x10, Math.min(y10, x10), this.A01);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int height = A08;
        int width = A08;
        setMeasuredDimension(height, width);
    }
}
