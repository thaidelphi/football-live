package com.facebook.ads.redexgen.X;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.nQ  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2107nQ implements InterfaceC04311f {
    public static byte[] A09;
    public static String[] A0A = {"IBjHvdAE4z3hQw4rxwkyNcKQ0ISAyia4", "k6JnbRLATBGW5JMH6xbwPTUsl0iwlrJc", "UfNjo0M2E3JYTqqfEgwKvI", "0cJpOp9GZhTbse6AR0KBqddAOnBBcxYH", "ToL0P04EQWC050ZStPfUW7", "dLQ1hyrIZ6bV252gpMlUXC0bj3", "6aHaE6Igu4j61t8wIMItohij1osEY7A", "YKpEvhrVN9bD9vQDF7gbtGGCU86bcHbh"};
    public final C2105nO A00;
    public final String A01;
    public final AtomicInteger A02;
    public final AtomicInteger A03;
    public final AtomicInteger A04;
    public final AtomicReference<String> A05;
    public final AtomicReference<String> A06;
    public final AtomicReference<String> A07;
    public final AtomicReference<EnumC04431r> A08;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{-87, -89, -69, -71, -85, -91, 119, -71, -70, -91, -87, -82, -89, -76, -76, -85, -78, -33, -35, -15, -17, -31, -37, -33, -21, -23, -20, -24, -31, -16, -31, -32, -34, -14, -16, -30, -36, -19, -34, -14, -16, -30, -43, -31, -32, -27, -26, -45, -32, -26, -47, -40, -34, -25, -27, -38, -47, -42, -37, -27, -45, -44, -34, -41, -42, 18, 30, 29, 34, 35, 16, 29, 35, 14, 21, 27, 36, 34, 23, 14, 20, 29, 16, 17, 27, 20, 19, -57, -38, -47, -63, -46, -50, -61, -37, -57, -44, 8, 23, 16, 16, 7, 14, 1, -6, 9, 2, 2, -7, 0, -13, 7, -7, 5, -64, -72, -73, -68, -76, -78, -61, -65, -76, -52, -72, -59};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A03(JSONObject jSONObject) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            try {
                jSONObject.put(A00(104, 10, 100), this.A04.getAndIncrement());
            } catch (Throwable th) {
                BQ.A00(th, this);
                return;
            }
        } catch (JSONException unused) {
        }
        InterfaceC04381m.A0d.A04(this.A01).A02(jSONObject);
        String str = this.A07.get();
        if (!TextUtils.isEmpty(str)) {
            InterfaceC04381m.A0i.A04(str).A02(jSONObject);
        }
        String str2 = this.A06.get();
        if (!TextUtils.isEmpty(str2)) {
            InterfaceC04381m.A0h.A04(str2).A02(jSONObject);
        }
        String str3 = this.A05.get();
        if (!TextUtils.isEmpty(str3)) {
            InterfaceC04381m.A0g.A04(str3).A02(jSONObject);
        }
        EnumC04431r enumC04431r = this.A08.get();
        if (enumC04431r != null) {
            InterfaceC04381m.A0L.A04(enumC04431r).A02(jSONObject);
        }
        int i10 = this.A02.get();
        String[] strArr = A0A;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A0A[3] = "oDSQlSjNmcpmgzbcJtWHkjHlPwQZcL3R";
        if (i10 != -1) {
            InterfaceC04381m.A0M.A04(Integer.valueOf(i10)).A02(jSONObject);
        }
    }

    static {
        A01();
    }

    public C2107nQ(C2105nO c2105nO) {
        this(c2105nO, UUID.randomUUID().toString());
    }

    public C2107nQ(C2105nO c2105nO, String str) {
        this.A07 = new AtomicReference<>();
        this.A06 = new AtomicReference<>();
        this.A05 = new AtomicReference<>();
        this.A08 = new AtomicReference<>();
        this.A02 = new AtomicInteger(-1);
        this.A03 = new AtomicInteger(0);
        this.A01 = str;
        this.A00 = c2105nO;
        this.A04 = new AtomicInteger(1);
    }

    private void A02(int i10, String str) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(97, 7, 114) + InterfaceC04381m.A0e.getName(), str);
            } catch (JSONException unused) {
            }
            A03(jSONObject);
            this.A00.A00().ABH(i10, jSONObject);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    public final void A04(EnumC04341i type, C04371l... params) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (C04371l c04371l : params) {
                c04371l.A02(jSONObject);
            }
            A03(jSONObject);
            this.A00.A00().AAw(type, jSONObject, this.A03.get());
        } catch (Throwable th) {
            BQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[0].charAt(4) != strArr[7].charAt(4)) {
                throw new RuntimeException();
            }
            A0A[1] = "BGuBBhhr2vfc8YeoHKcuMelBM5cinHSr";
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A33(String str, int reason, String viewType) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0X, InterfaceC04381m.A0R.A04(Integer.valueOf(reason)), InterfaceC04381m.A0Y.A04(viewType));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A34(String objectHash, String viewType) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0Y, InterfaceC04381m.A0X.A04(objectHash), InterfaceC04381m.A0Y.A04(viewType));
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "CnHHOHbzAF39FbZ23oJPbX";
            strArr2[4] = "iCnDYwDfb9KHEDVJBca8IG";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A35(String objectHash, String viewType) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0Z, InterfaceC04381m.A0X.A04(objectHash), InterfaceC04381m.A0Y.A04(viewType));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A36(String objectHash, String viewType) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0a, InterfaceC04381m.A0X.A04(objectHash), InterfaceC04381m.A0Y.A04(viewType));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A37(String objectHash, String viewType) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0b, InterfaceC04381m.A0X.A04(objectHash), InterfaceC04381m.A0Y.A04(viewType));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A38(String objectHash, String viewType) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0c, InterfaceC04381m.A0X.A04(objectHash), InterfaceC04381m.A0Y.A04(viewType));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A39(String objectHash, String viewType) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0d, InterfaceC04381m.A0X.A04(objectHash), InterfaceC04381m.A0Y.A04(viewType));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3A() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0o, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3B() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A11, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3C(boolean listenerSet) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0f, InterfaceC04381m.A01.A04(Boolean.valueOf(listenerSet)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3D(long loadTimeMs, int errorCode, String errorMessage) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A13, InterfaceC04381m.A0N.A04(Integer.valueOf(errorCode)), InterfaceC04381m.A0b.A04(errorMessage), InterfaceC04381m.A0W.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            BQ.A00(th, this);
            if (A0A[1].charAt(12) == 'T') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[0] = "ou1vvyDZqZWINuQgR45WlnH1G6V1u1ma";
            strArr[7] = "sF8Nv0lZkba8MOr3Cm9N7xOdNRIBEokF";
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3E() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A15, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3F() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A14, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "ghPrSTa04AlA3hlhWhKdOq";
            strArr2[4] = "J88k6JeMdFLh46seUcEYlS";
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3G() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A16, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3H(long loadTimeMs) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A17, InterfaceC04381m.A0W.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3I(EnumC04291d reason) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3R, InterfaceC04381m.A00.A04(reason));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3J(String placementType, String placementId) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A06.set(placementType);
            this.A05.set(placementId);
            A04(EnumC04341i.A0g, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3K() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0h, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3L() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0i, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3M(long loadTimeMs, int errorCode, String errorMessage, boolean isPublic) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0j, InterfaceC04381m.A0W.A04(Long.valueOf(loadTimeMs)), InterfaceC04381m.A0N.A04(Integer.valueOf(errorCode)), InterfaceC04381m.A0b.A04(errorMessage), InterfaceC04381m.A0B.A04(Boolean.valueOf(isPublic)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3N(long loadTimeMs, long executionWaitTimeMs) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0k, InterfaceC04381m.A0W.A04(Long.valueOf(loadTimeMs)), InterfaceC04381m.A0V.A04(Long.valueOf(executionWaitTimeMs)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3O(boolean result) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1E, InterfaceC04381m.A0J.A04(Boolean.valueOf(result)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3P() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1F, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3Q(String errorMessage) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1K, InterfaceC04381m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3R() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1L, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3S() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1M, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3T() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1N, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3U(int funnelVideoPauseReason) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1O, InterfaceC04381m.A0R.A04(Integer.valueOf(funnelVideoPauseReason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3V() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1P, new C04371l[0]);
        } catch (Throwable th) {
            if (A0A[1].charAt(12) == 'T') {
                throw new RuntimeException();
            }
            A0A[3] = "xPEMCdF1PT81VKplThmZJ0MgThXZkz9L";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3W() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1S, new C04371l[0]);
        } catch (Throwable th) {
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            A0A[1] = "rEmXoUEysLHPq8FZE3dOJNk5SzTI5ER4";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3X() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1Q, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3Y(int reason) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1R, InterfaceC04381m.A0R.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3Z() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1T, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3a(String uri) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1U, InterfaceC04381m.A0e.A04(uri));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3b() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1V, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3c() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1W, new C04371l[0]);
        } catch (Throwable th) {
            if (A0A[1].charAt(12) == 'T') {
                throw new RuntimeException();
            }
            A0A[3] = "VHKTrZg04X3VOgoin19cBQHxK1SmZkil";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3d() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1X, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3e() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1Y, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3f(int funnelVideoStartReason) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1Z, InterfaceC04381m.A0R.A04(Integer.valueOf(funnelVideoStartReason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[0] = "xMSVvfXgoFGAs8nDBunIn95v3O7z4ovy";
            strArr2[7] = "AGV4v0JDz2tNg1AGql8xEI5p6QAZ0vcQ";
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3g() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1a, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[0] = "8ZQmvOl7hzZw4gnCVFSM7Fjew1MxvIcb";
            strArr[7] = "zdDiv1uwuIXQArBlVybz6cyG0OKYRhqv";
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3h(int reason) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1b, InterfaceC04381m.A0R.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3i() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3T, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3j() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3U, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3k(EnumC04291d reason) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3Q, InterfaceC04381m.A00.A04(reason));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3l(int reason) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3S, InterfaceC04381m.A0S.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A3m() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3V, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A4d(long loadTimeMs) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0m, InterfaceC04381m.A0W.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A4e(long loadTimeMs, int chainedAdIndex) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0m, InterfaceC04381m.A0W.A04(Long.valueOf(loadTimeMs)), InterfaceC04381m.A0M.A04(Integer.valueOf(chainedAdIndex)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A4f(long loadTimeMs) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0n, InterfaceC04381m.A0W.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A4g(long loadTimeMs, int chainedAdIndex) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0n, InterfaceC04381m.A0W.A04(Long.valueOf(loadTimeMs)), InterfaceC04381m.A0M.A04(Integer.valueOf(chainedAdIndex)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A4j(int reason) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0R, InterfaceC04381m.A0R.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A4k() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0S, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A4l(String chainedParamsJson) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0T, InterfaceC04381m.A0a.A04(chainedParamsJson));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A4m() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0U, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A4n() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0V, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A4o(int skipReason) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0W, InterfaceC04381m.A0R.A04(Integer.valueOf(skipReason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A4s() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0p, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A5T() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0q, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A5U() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0u, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A5V(boolean isInvalidated) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0l, InterfaceC04381m.A09.A04(Boolean.valueOf(isInvalidated)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A5W(int errorCode, String errorMessage) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0v, InterfaceC04381m.A0N.A04(Integer.valueOf(errorCode)), InterfaceC04381m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A5X(boolean hasBid) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0t, InterfaceC04381m.A03.A04(Boolean.valueOf(hasBid)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A5Y() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0x, new C04371l[0]);
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "rOShNeNq5fhncN4PBQe40u";
            strArr2[4] = "fkRpVb9hGxGD6wAnOJN4MT";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A5Z() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0y, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A5a() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A0z, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A5b() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A10, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A5u() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1f, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A5v(String message) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1g, InterfaceC04381m.A0e.A04(message));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A5w() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1h, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A5x() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1i, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A5y() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1j, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A5z(String errorMessage) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1k, InterfaceC04381m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A60(String errorMessage) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1l, InterfaceC04381m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A61(String message) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1m, InterfaceC04381m.A0e.A04(message));
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0A[1] = "759deBEUdc0uh8isIDlD9YAtQ7qctZF0";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A62(String errorMessage) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1o, InterfaceC04381m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[0].charAt(4) != strArr[7].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "1zlmhlFzFVwgF9q0xmtSdu50kD";
            strArr2[6] = "2haF4NBMerbrCWfGasmmW9SqeFz7x8G";
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A63() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1p, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A64(String errorMessage) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1q, InterfaceC04381m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A65(long loadTimeMs) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1r, InterfaceC04381m.A0W.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A66(String errorMessage) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1s, InterfaceC04381m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A9l() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1u, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A9m() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1v, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A9n(boolean isDisabledByGK) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1w, InterfaceC04381m.A07.A04(Boolean.valueOf(isDisabledByGK)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A9o() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1x, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A9p(String error) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1y, InterfaceC04381m.A0b.A04(error));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A9q() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1z, new C04371l[0]);
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0A[3] = "15jrFKu6wVZYTCIc5tz6T2aAbAvuKlIC";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A9r() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A20, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void A9s(String exception) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A21, InterfaceC04381m.A0c.A04(exception));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.nQ] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final boolean AAI() {
        if (BQ.A02(this)) {
            return false;
        }
        Object obj = this;
        try {
            obj = obj.A03.get();
            return obj == 1;
        } catch (Throwable th) {
            BQ.A00(th, obj);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AAs(int code, String message) {
        if (BQ.A02(this) || code < 11000 || code > 11099) {
            return;
        }
        try {
            A02(code, message);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AAy(String errorMessage) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1t, InterfaceC04381m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AB4(String provider) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2G, InterfaceC04381m.A0f.A04(provider));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AB5(String provider) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2H, InterfaceC04381m.A0f.A04(provider));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AB6(String provider) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2I, InterfaceC04381m.A0f.A04(provider));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AB7(String provider) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2J, InterfaceC04381m.A0f.A04(provider));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AB8(String provider) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2K, InterfaceC04381m.A0f.A04(provider));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AB9(String provider) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2L, InterfaceC04381m.A0f.A04(provider));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABA() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2M, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABB(String provider) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2N, InterfaceC04381m.A0f.A04(provider));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABP(String errorMessage) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3J, InterfaceC04381m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABQ(int isLeftTopHalf) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3I, InterfaceC04381m.A0O.A04(Integer.valueOf(isLeftTopHalf)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABR(boolean isSplitScreenSupportedInApp, boolean isSplitScreenFlagAdded, boolean supportsMultiWindow, boolean supportsSplitScreenMultiWindow, boolean appResizingSupported) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3K, InterfaceC04381m.A0D.A04(Boolean.valueOf(isSplitScreenSupportedInApp)), InterfaceC04381m.A0C.A04(Boolean.valueOf(isSplitScreenFlagAdded)), InterfaceC04381m.A0I.A04(Boolean.valueOf(supportsMultiWindow)), InterfaceC04381m.A0K.A04(Boolean.valueOf(supportsSplitScreenMultiWindow)), InterfaceC04381m.A0G.A04(Boolean.valueOf(appResizingSupported)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABW() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3W, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABX(boolean isLocked, int reason) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3X, InterfaceC04381m.A0A.A04(Boolean.valueOf(isLocked)), InterfaceC04381m.A0R.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABY() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3Y, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABZ(boolean isLocked, boolean isV2, boolean isChained) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3Z, InterfaceC04381m.A0A.A04(Boolean.valueOf(isLocked)), InterfaceC04381m.A0E.A04(Boolean.valueOf(isV2)), InterfaceC04381m.A08.A04(Boolean.valueOf(isChained)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABa() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3a, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABb() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3b, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABc() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3d, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABd() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3c, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABe(String falseReasonMessage) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3e, InterfaceC04381m.A0k.A04(falseReasonMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABf() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3f, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABg() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3g, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABr(String errorMessage) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A18, InterfaceC04381m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABs(int reason) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A19, InterfaceC04381m.A0S.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABt() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2O, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABu() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2P, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABv() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2Q, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ABy() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1A, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ADd() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A25, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ADe() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A26, new C04371l[0]);
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "SUWuhZot3lbnUwmuNgQZL8cGUh";
            strArr2[6] = "e1ut4vb54s16AZCVtGxdkLVCEm0tRiH";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ADf() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A28, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ADg() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A29, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ADh() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2A, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ADi() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A27, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ADj() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2B, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ADk() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2C, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ADl() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2D, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ADm() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2E, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void ADn() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2F, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AES() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2W, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "LuwYm9Ec4o1R43GcaJtosWaGmO";
            strArr2[6] = "Iv5NEtyRtdj3C1azmehhXo6SWfekvld";
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AFJ(int actionMode) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1G, InterfaceC04381m.A0P.A04(Integer.valueOf(actionMode)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AGh(String errorMessage) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1C, InterfaceC04381m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AGi() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1D, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AGu() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2Z, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AGv(int resultCode) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2a, InterfaceC04381m.A0N.A04(Integer.valueOf(resultCode)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AGw() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2b, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AGx() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2c, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AGy(String errorMessage) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2d, InterfaceC04381m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AGz() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2f, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AH0() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2g, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AH1() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2h, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AH2() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2i, new C04371l[0]);
        } catch (Throwable th) {
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            A0A[1] = "wOU9EU8iwoFyJfRJJkX4aLHDWxmftefK";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AH3(RemoteException e8) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2r, InterfaceC04381m.A0b.A04(e8.toString()));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AH4() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2j, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AH5() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2k, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AH6() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2l, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AH7() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2m, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AH8() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2n, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[0] = "qlMIvHuIl0PpF5kBV9VQgOwtH5MinuqE";
            strArr2[7] = "xBNYvFKh7XBRvzLChNYnaiJhWQppxCKD";
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AH9(int type) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2o, InterfaceC04381m.A0T.A04(Integer.valueOf(type)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHA() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2p, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHB() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2e, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHC() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2s, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHD() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2t, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHE() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2u, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHF() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2v, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHG() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2w, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHH() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2x, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHI() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2z, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHJ() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A30, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHK() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A31, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHL(int type) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A2y, InterfaceC04381m.A0T.A04(Integer.valueOf(type)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHM() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A32, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHN() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A33, new C04371l[0]);
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0A[3] = "ytbGG59mSCQ98v8bmpcCcEmqTnAgI1JB";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHO() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A34, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHP() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A35, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHQ() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A36, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHR(int what) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A37, InterfaceC04381m.A0T.A04(Integer.valueOf(what)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHS() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A38, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHT(int messageTag) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A39, InterfaceC04381m.A0T.A04(Integer.valueOf(messageTag)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHU(String string) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3A, InterfaceC04381m.A0b.A04(string));
        } catch (Throwable th) {
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[2] = "WmDwj21HmLDh2v3oBoiN7t";
            strArr[4] = "aBEcyy5IfSDVAZbtKUqUDd";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AHV() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3B, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AI3() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3H, InterfaceC04381m.A0e.A04(A00(65, 22, 127)));
        } catch (Throwable th) {
            BQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[0].charAt(4) != strArr[7].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "ISt8aVbYkZ1528n3X0AMwO";
            strArr2[4] = "7zAIV0laY8ZUIjQSc0h82I";
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AI4() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3H, InterfaceC04381m.A0e.A04(A00(42, 23, 66)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AI5() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3L, InterfaceC04381m.A0e.A04(A00(87, 10, 50)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AI6() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3C, InterfaceC04381m.A0e.A04(A00(17, 14, 76)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AI7() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3C, InterfaceC04381m.A0e.A04(A00(0, 17, 22)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AI8() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3C, InterfaceC04381m.A0e.A04(A00(31, 11, 77)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AI9() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3L, InterfaceC04381m.A0e.A04(A00(114, 12, 35)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AIR(int index) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A02.set(index);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AIY(boolean value) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (value) {
                this.A03.set(1);
            } else {
                this.A03.set(2);
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AIZ(int seq) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A04.set(seq);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AIq(String str) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A07.set(str);
        } catch (Throwable th) {
            BQ.A00(th, this);
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "yN2ek2pa9UH1g7DDMCyQyyX5rJ";
            strArr[6] = "oQTvUigTVOEtCxa6Wt9cejPgJdPQvss";
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AIz(EnumC04431r viewType) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A08.set(viewType);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AJl() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1I, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AJm() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3M, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AJn(String aspectRatio) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3N, InterfaceC04381m.A0Z.A04(aspectRatio));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AJo(int orientation) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3O, InterfaceC04381m.A0Q.A04(Integer.valueOf(orientation)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AJp(String viewableRatio) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3P, InterfaceC04381m.A0j.A04(viewableRatio));
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[0] = "FEFzvX05qBdVAmKk8G0MI95qKtchV7LJ";
            strArr2[7] = "hT88vpHnpVYqM7dW4oE2C6WdduktsvVi";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AJq() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1c, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AJv() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3h, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AJw(int code, String message) {
        if (BQ.A02(this) || code < 12000 || code > 12099) {
            return;
        }
        try {
            A02(code, message);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AJx() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3i, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AJy() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3j, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AJz() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3k, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AK0(boolean callIgnored) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3l, InterfaceC04381m.A02.A04(Boolean.valueOf(callIgnored)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AK1() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3m, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AK2() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3n, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AK3(int errorCode, String message) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3o, InterfaceC04381m.A0N.A04(Integer.valueOf(errorCode)), InterfaceC04381m.A0b.A04(message));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AK4(boolean hasWebview) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3p, InterfaceC04381m.A06.A04(Boolean.valueOf(hasWebview)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AK5() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3q, new C04371l[0]);
        } catch (Throwable th) {
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "tcZOAQ7ZICgkoIgoP9nUVanYjA";
            strArr[6] = "vX76sPpkkUT44d9ZVg7hUVWC8IWIUnC";
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AK6(String error) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3r, InterfaceC04381m.A0b.A04(error));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AK7(int i10, String error) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3s, InterfaceC04381m.A0b.A04(error));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AK8() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3t, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AK9(int visibility) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A3u, InterfaceC04381m.A0U.A04(Integer.valueOf(visibility)));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AKE(String errorMessage) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1d, InterfaceC04381m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void AKF(String errorMessage) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1e, InterfaceC04381m.A0b.A04(errorMessage));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final String getId() {
        if (BQ.A02(this)) {
            return null;
        }
        try {
            return this.A01;
        } catch (Throwable th) {
            BQ.A00(th, this);
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04311f
    public final void unregisterView() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC04341i.A1H, new C04371l[0]);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
