package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class UM {
    public static int A00(WJ wj, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int totalBytesPeeked = i11 - i12;
            int bytesPeeked = wj.AG0(bArr, i10 + i12, totalBytesPeeked);
            if (bytesPeeked == -1) {
                break;
            }
            i12 += bytesPeeked;
        }
        return i12;
    }

    @Pure
    public static void A01(boolean z10, String str) throws Q6 {
        if (z10) {
            return;
        }
        throw Q6.A01(str, null);
    }

    public static boolean A02(WJ wj, int i10) throws IOException {
        try {
            wj.AJ9(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean A03(WJ wj, byte[] bArr, int i10, int i11) throws IOException {
        try {
            wj.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean A04(WJ wj, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return wj.AG2(bArr, i10, i11, z10);
        } catch (EOFException e8) {
            if (z10) {
                return false;
            }
            throw e8;
        }
    }
}
