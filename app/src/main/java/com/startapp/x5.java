package com.startapp;

import java.nio.ByteBuffer;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class x5 {
    public static long a(ByteBuffer byteBuffer, int i10, int i11, long j10) {
        long j11;
        long j12 = (j10 & 4294967295L) ^ (i11 * (-4132994306676758123L));
        int i12 = i11 >> 3;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 + (i13 << 3);
            long j13 = ((byteBuffer.get(i14 + 0) & 255) + ((byteBuffer.get(i14 + 1) & 255) << 8) + ((byteBuffer.get(i14 + 2) & 255) << 16) + ((byteBuffer.get(i14 + 3) & 255) << 24) + ((byteBuffer.get(i14 + 4) & 255) << 32) + ((byteBuffer.get(i14 + 5) & 255) << 40) + ((byteBuffer.get(i14 + 6) & 255) << 48) + ((byteBuffer.get(i14 + 7) & 255) << 56)) * (-4132994306676758123L);
            j12 = (j12 ^ ((j13 ^ (j13 >>> 47)) * (-4132994306676758123L))) * (-4132994306676758123L);
        }
        int i15 = i11 & 7;
        switch (i15) {
            case 7:
                j12 ^= byteBuffer.get(((i10 + i11) - i15) + 6) << 48;
            case 6:
                j12 ^= byteBuffer.get(((i10 + i11) - i15) + 5) << 40;
            case 5:
                j12 ^= byteBuffer.get(((i10 + i11) - i15) + 4) << 32;
            case 4:
                j12 ^= byteBuffer.get(((i10 + i11) - i15) + 3) << 24;
            case 3:
                j12 ^= byteBuffer.get(((i10 + i11) - i15) + 2) << 16;
            case 2:
                j12 ^= byteBuffer.get(((i10 + i11) - i15) + 1) << 8;
            case 1:
                j11 = -4132994306676758123L;
                j12 = (byteBuffer.get((i10 + i11) - i15) ^ j12) * (-4132994306676758123L);
                break;
            default:
                j11 = -4132994306676758123L;
                break;
        }
        long j14 = (j12 ^ (j12 >>> 47)) * j11;
        return j14 ^ (j14 >>> 47);
    }
}
