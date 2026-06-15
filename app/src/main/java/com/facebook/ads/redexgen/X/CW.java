package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class CW extends XP {
    public static final int A00 = Float.floatToIntBits(Float.NaN);

    public static void A00(int i10, ByteBuffer byteBuffer) {
        float pcm32BitFloat = (float) (i10 * 4.656612875245797E-10d);
        int floatBits = Float.floatToIntBits(pcm32BitFloat);
        if (floatBits == A00) {
            floatBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatBits);
    }

    @Override // com.facebook.ads.redexgen.X.XP
    public final RT A09(RT rt) throws RU {
        int i10 = rt.A02;
        if (AbstractC1672gE.A14(i10)) {
            if (i10 != 4) {
                return new RT(rt.A03, rt.A01, 4);
            }
            return RT.A05;
        }
        throw new RU(rt);
    }

    @Override // com.facebook.ads.redexgen.X.RV
    public final void AGP(ByteBuffer byteBuffer) {
        ByteBuffer A002;
        int i10 = byteBuffer.position();
        int limit = byteBuffer.limit();
        int limit2 = limit - i10;
        int position = this.A05.A02;
        switch (position) {
            case 536870912:
                int position2 = limit2 / 3;
                A002 = A00(position2 * 4);
                while (i10 < limit) {
                    int position3 = byteBuffer.get(i10);
                    int limit3 = (position3 & 255) << 8;
                    int position4 = i10 + 1;
                    int limit4 = limit3 | ((byteBuffer.get(position4) & 255) << 16);
                    int position5 = i10 + 2;
                    A00(limit4 | ((byteBuffer.get(position5) & 255) << 24), A002);
                    i10 += 3;
                }
                break;
            case 805306368:
                A002 = A00(limit2);
                while (i10 < limit) {
                    int position6 = byteBuffer.get(i10);
                    int limit5 = position6 & 255;
                    int position7 = i10 + 1;
                    int limit6 = limit5 | ((byteBuffer.get(position7) & 255) << 8);
                    int position8 = i10 + 2;
                    int limit7 = limit6 | ((byteBuffer.get(position8) & 255) << 16);
                    int position9 = i10 + 3;
                    A00(limit7 | ((byteBuffer.get(position9) & 255) << 24), A002);
                    i10 += 4;
                }
                break;
            default:
                throw new IllegalStateException();
        }
        int position10 = byteBuffer.limit();
        byteBuffer.position(position10);
        A002.flip();
    }
}
