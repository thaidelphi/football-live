package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Pl  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1033Pl extends C1512dc {
    public static byte[] A02;
    public final int A00;
    public final C1519dj A01;

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 105);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{89, 86, 95, 91, 72, 78, 95, 66, 78, 20, 16, 84, 85, 78, 26, 74, 95, 72, 87, 83, 78, 78, 95, 94, 20, 16};
    }

    public C1033Pl(C1519dj c1519dj, int i10, int i11) {
        super(A02(i10, i11));
        this.A01 = c1519dj;
        this.A00 = i11;
    }

    public C1033Pl(IOException iOException, C1519dj c1519dj, int i10, int i11) {
        super(iOException, A02(i10, i11));
        this.A01 = c1519dj;
        this.A00 = i11;
    }

    public C1033Pl(String str, C1519dj c1519dj, int i10, int i11) {
        super(str, A02(i10, i11));
        this.A01 = c1519dj;
        this.A00 = i11;
    }

    public C1033Pl(String str, IOException iOException, C1519dj c1519dj, int i10, int i11) {
        super(str, iOException, A02(i10, i11));
        this.A01 = c1519dj;
        this.A00 = i11;
    }

    public static int A02(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static C1033Pl A03(final IOException iOException, final C1519dj c1519dj, int i10) {
        int errorCode;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            errorCode = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            errorCode = 1004;
        } else {
            if (message != null) {
                String A01 = AbstractC1756hb.A01(message);
                String message2 = A04(0, 26, 83);
                if (A01.matches(message2)) {
                    errorCode = 2007;
                }
            }
            errorCode = 2001;
        }
        if (errorCode == 2007) {
            return new C1033Pl(iOException, c1519dj) { // from class: com.facebook.ads.redexgen.X.5I
                public static byte[] A00;
                public static String[] A01 = {"KrwfVMSgvCQX", "BfVUnDqiTjAVH1l7WNLrOWBTdTYUY8Vd", "25KSknXY8I3RCSTlZ635HZ3", "f", "GH3uc6uK5DCSDvSKR9hVp8", "PzMPeAMXXBB0dqHPCeJ9rhlrdeNKRBU6", "l8327jWuoRezG2rflUO9eNRMch", "5OPWiZVRhyLyfXWov1NOhWiMzSyGn6fy"};

                public static String A00(int i11, int i12, int i13) {
                    byte[] copyOfRange = Arrays.copyOfRange(A00, i11, i11 + i12);
                    int i14 = 0;
                    while (true) {
                        int length = copyOfRange.length;
                        if (A01[1].charAt(12) != 'H') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A01;
                        strArr[3] = "c";
                        strArr[2] = "wimjw4CnGDi7wlGPQ6PoCsS";
                        if (i14 >= length) {
                            return new String(copyOfRange);
                        }
                        copyOfRange[i14] = (byte) ((copyOfRange[i14] - i13) - 120);
                        i14++;
                    }
                }

                public static void A01() {
                    A00 = new byte[]{3, 44, 37, 33, 50, 52, 37, 56, 52, -32, 8, 20, 20, 16, -32, 52, 50, 33, 38, 38, 41, 35, -32, 46, 47, 52, -32, 48, 37, 50, 45, 41, 52, 52, 37, 36, -18, -32, 19, 37, 37, -32, 40, 52, 52, 48, 51, -6, -17, -17, 36, 37, 54, 37, 44, 47, 48, 37, 50, -18, 33, 46, 36, 50, 47, 41, 36, -18, 35, 47, 45, -17, 39, 53, 41, 36, 37, -17, 52, 47, 48, 41, 35, 51, -17, 45, 37, 36, 41, 33, -17, 41, 51, 51, 53, 37, 51, -17, 35, 44, 37, 33, 50, 52, 37, 56, 52, -19, 46, 47, 52, -19, 48, 37, 50, 45, 41, 52, 52, 37, 36};
                }

                static {
                    A01();
                }

                {
                    String A002 = A00(0, 121, 72);
                }
            };
        }
        return new C1033Pl(iOException, c1519dj, errorCode, i10);
    }
}
