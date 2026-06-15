package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class UE {
    public static byte[] A00;
    public static String[] A01 = {"zOBnVdZEl2L3e4AXnDd9G11vWIOq79KJ", "WoGScMtyZyTkSevv94XXwMvUSUOngUyP", "wcZi00XFnf2p", "EA6oz7f03wgSVcWDu3otuiJxV6VRA", "OucbhJWJlfZaBgKYK86IYzWVq5D6YSLq", "LcwjEa3UpwWSC1hm4hnO4DZsnjIlc", "0X4EiQAcF9Ys", "i3pZtA"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 99);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{109, 75, 79, 123, 90, 71, 66, 10, 50, 48, 41, 41, 48, 55, 62, 121, 43, 60, 52, 56, 48, 55, 61, 60, 43, 121, 54, 63, 121, 52, 56, 53, 63, 54, 43, 52, 60, 61, 121, 10, 28, 16, 121, 23, 24, 21, 121, 44, 55, 48, 45, 119};
    }

    static {
        A02();
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(com.facebook.ads.redexgen.X.C1648fq r3) {
        /*
            r2 = 0
        L1:
            int r0 = r3.A07()
            if (r0 != 0) goto L9
            r0 = -1
            return r0
        L9:
            int r1 = r3.A0I()
            int r2 = r2 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UE.A00(com.facebook.ads.redexgen.X.fq):int");
    }

    public static void A03(long j10, C1648fq c1648fq, InterfaceC1157Uo[] interfaceC1157UoArr) {
        while (true) {
            if (c1648fq.A07() > 1) {
                int A002 = A00(c1648fq);
                int A003 = A00(c1648fq);
                int nextPayloadPosition = c1648fq.A09() + A003;
                if (A003 != -1) {
                    int payloadType = c1648fq.A07();
                    if (A003 <= payloadType) {
                        if (A002 == 4) {
                            String[] strArr = A01;
                            if (strArr[3].length() != strArr[5].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A01;
                            strArr2[6] = "hCWyPMi8Uw97";
                            strArr2[2] = "MFbyJ6GioS0x";
                            if (A003 >= 8) {
                                int userDataTypeCode = c1648fq.A0I();
                                int A0M = c1648fq.A0M();
                                int userIdentifier = 0;
                                if (A0M == 49) {
                                    userIdentifier = c1648fq.A0C();
                                }
                                int A0I = c1648fq.A0I();
                                if (A0M == 47) {
                                    c1648fq.A0g(1);
                                }
                                int i10 = (userDataTypeCode == 181 && (A0M == 49 || A0M == 47) && A0I == 3) ? 1 : 0;
                                if (A0M == 49) {
                                    int countryCode = userIdentifier != 1195456820 ? 0 : 1;
                                    i10 &= countryCode;
                                }
                                if (i10 != 0) {
                                    A04(j10, c1648fq, interfaceC1157UoArr);
                                }
                            }
                        } else {
                            continue;
                        }
                        c1648fq.A0f(nextPayloadPosition);
                    }
                }
                AbstractC1633fb.A07(A01(0, 7, 77), A01(7, 45, 58));
                nextPayloadPosition = c1648fq.A0A();
                c1648fq.A0f(nextPayloadPosition);
            } else {
                return;
            }
        }
    }

    public static void A04(long j10, C1648fq c1648fq, InterfaceC1157Uo[] interfaceC1157UoArr) {
        int firstByte = c1648fq.A0I();
        if (!((firstByte & 64) != 0)) {
            return;
        }
        c1648fq.A0g(1);
        int i10 = (firstByte & 31) * 3;
        int A09 = c1648fq.A09();
        for (InterfaceC1157Uo interfaceC1157Uo : interfaceC1157UoArr) {
            c1648fq.A0f(A09);
            interfaceC1157Uo.AHx(c1648fq, i10);
            if (j10 != -9223372036854775807L) {
                interfaceC1157Uo.AI0(j10, 1, i10, 0, null);
            }
        }
    }
}
