package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.js  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1891js extends BY {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass85 A01;
    public final /* synthetic */ C8T A02;
    public final /* synthetic */ C06058b A03;
    public final /* synthetic */ String A04;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{115, -97, -64, -67, -48, -62, 123, -66, -51, -68, -50, -61, 123, -67, -64, -66, -68, -48, -50, -64, 123, -50, -96, -55, -47, -60, -51, -54, -55, -56, -64, -55, -49, -97, -68, -49, -68, -85, -51, -54, -47, -60, -65, -64, -51, 123, -55, -54, -49, 123, -60, -55, -59, -64, -66, -49, -64, -65, 113, -121, -116, -119, 62, -121, -111, 62, -116, -109, -118, -118, 63, -109, -106, -106, -101, -90, -101, -95, -96, -109, -98, -111, -101, -96, -104, -95, 116, -119, 116, 124, Byte.MAX_VALUE, 116, 117, Byte.MAX_VALUE, 120, 114, 119, 124, -122, 126, 114, -122, -125, 116, 118, 120, -26, -28, -26, -21, -24, -106, -119, -121, -109, -106, -120, -125, -120, -123, -104, -123, -122, -123, -105, -119, -59, -72, -60, -56, -72, -58, -57, -78, -68, -73, -115, -113, 124, -114, -109, -118, Byte.MAX_VALUE, -104, -102, -121, -103, -98, -107, -118, -124, -120, -108, -119, -118};
    }

    public C1891js(AnonymousClass85 anonymousClass85, String str, int i10, C06058b c06058b, C8T c8t) {
        this.A01 = anonymousClass85;
        this.A04 = str;
        this.A00 = i10;
        this.A03 = c06058b;
        this.A02 = c8t;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        String str;
        Map<String, String> A5Q;
        String A8B;
        AtomicReference atomicReference;
        try {
            if (C8U.A0K(this.A01, this.A04, this.A00, this.A03)) {
                return;
            }
            AI.A08(this.A01, AA.A0A.toString() + A01(0, 1, 50) + this.A04);
            Throwable cause = this.A03.getCause();
            if (cause != null) {
                str = AbstractC0700Cl.A03(this.A01, cause);
            } else if (AbstractC06439o.A0R(this.A01)) {
                AnonymousClass85 anonymousClass85 = this.A01;
                Throwable deLogExceptionCause = this.A03;
                str = AbstractC0700Cl.A03(anonymousClass85, deLogExceptionCause);
            } else {
                str = A01(0, 0, 81) + this.A03.getMessage();
            }
            if (AbstractC06439o.A0V(this.A01)) {
                A5Q = this.A01.A04().A5Q();
            } else if (this.A02 != null) {
                A5Q = this.A02.A7p();
            } else if (C8U.A02) {
                C8U.A0F(new RuntimeException(A01(1, 57, 84), this.A03));
                A5Q = new HashMap<>();
            } else {
                A5Q = this.A01.A04().A5Q();
            }
            A5Q.put(A01(136, 7, 19), this.A04);
            A5Q.put(A01(143, 12, 30), String.valueOf(this.A00));
            JSONObject A03 = this.A03.A03();
            if (A03 != null) {
                A5Q.put(A01(71, 15, 43), A03.toString());
            }
            if ((A01(106, 5, 124).equals(this.A04) || A01(111, 15, 29).equals(this.A04)) && (A8B = this.A01.A04().A8B()) != null) {
                A5Q.put(A01(86, 20, 12), A8B);
            }
            String A0C = this.A01.A0C();
            if (A0C != null && !TextUtils.isEmpty(A0C)) {
                A5Q.put(A01(126, 10, 76), A0C);
            }
            atomicReference = C8U.A0A;
            C8S c8s = (C8S) atomicReference.get();
            if (c8s == null) {
                C8U.A0F(new RuntimeException(A01(58, 13, 23)));
            } else {
                c8s.AKA(str, A5Q, this.A01);
            }
        } catch (Throwable t10) {
            C8U.A0F(t10);
        }
    }
}
