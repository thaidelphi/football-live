package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.7X  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class C7X {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{61, 53, 56, 79, 64, 74, 92, 65, 71, 74, 71, 74, Byte.MAX_VALUE, 115, 114, 104, 121, 114, 104, 38, 51, 51, Byte.MAX_VALUE, 115, 113, 50, 122, 125, Byte.MAX_VALUE, 121, 126, 115, 115, 119, 50, 119, 125, 104, 125, 114, 125, 50, 108, 110, 115, 106, 117, 120, 121, 110, 50, 93, 104, 104, 110, 117, 126, 105, 104, 117, 115, 114, 85, 120, 76, 110, 115, 106, 117, 120, 121, 110, 18, 23, 19, 23, 10, 33, 10, 12, 31, 29, 21, 23, 16, 25};
    }

    public static C7W A00(ContentResolver contentResolver) {
        String A01 = A01(72, 14, 113);
        String A012 = A01(3, 9, 33);
        String A013 = A01(0, 3, 83);
        Cursor c10 = null;
        try {
            c10 = contentResolver.query(C5.A00(A01(12, 60, 19)), new String[]{A013, A012, A01}, null, null, null);
            if (c10 == null || !c10.moveToFirst()) {
                return new C7W(null, null, false);
            }
            String string = c10.getString(c10.getColumnIndex(A013));
            String attributionId = c10.getString(c10.getColumnIndex(A012));
            C7W c7w = new C7W(string, attributionId, Boolean.valueOf(c10.getString(c10.getColumnIndex(A01))).booleanValue());
            if (c10 != null) {
                c10.close();
            }
            return c7w;
        } finally {
            if (c10 != null) {
                c10.close();
            }
        }
    }
}
