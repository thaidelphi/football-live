package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class YU {
    public static String[] A00 = {"raiZexzcSLu8VHzyF5Yi5A1wS78BH1RV", "3kGwY1fDjldhWGY5QDheot1YUsS7C4AJ", com.ironsource.fe.f17456u0, "UP6X7ZW0a1WAuLd47Sb6F2quoJi2hMLB", "AHmqvYHp8NMO9gAMYhoRSwwJevbU4zLW", "xfQKS4uejnobZBIBLIZBjpbf8", "sol5eQAp3mMREoTYVQWWtSEUthqSxsOz", "7zCpV0a32XoMO1MJWSobGmDxrbcYEpc"};

    public static int A00(byte[] bArr, int i10, int i11) {
        while (i10 < i11) {
            byte b10 = bArr[i10];
            if (A00[2].length() == 2) {
                String[] strArr = A00;
                strArr[4] = "bHHeJRwgrIMVMuWCUa5g4wjcHkmCzccT";
                strArr[6] = "yQr04RBpOSMMpODEgR4tEhGOq1fgkNXy";
                if (b10 == 71) {
                    break;
                }
                i10++;
            } else {
                throw new RuntimeException();
            }
        }
        return i10;
    }

    public static long A01(C1648fq c1648fq, int i10, int i11) {
        c1648fq.A0f(i10);
        if (c1648fq.A07() < 5) {
            return -9223372036854775807L;
        }
        int pid = c1648fq.A0C();
        int tsPacketHeader = 8388608 & pid;
        if (tsPacketHeader != 0) {
            return -9223372036854775807L;
        }
        int tsPacketHeader2 = 2096896 & pid;
        if ((tsPacketHeader2 >> 8) != i11) {
            return -9223372036854775807L;
        }
        int tsPacketHeader3 = pid & 32;
        int tsPacketHeader4 = tsPacketHeader3 != 0 ? 1 : 0;
        if (tsPacketHeader4 == 0) {
            return -9223372036854775807L;
        }
        int tsPacketHeader5 = c1648fq.A0I();
        if (tsPacketHeader5 >= 7) {
            int tsPacketHeader6 = c1648fq.A07();
            if (tsPacketHeader6 >= 7) {
                int tsPacketHeader7 = c1648fq.A0I();
                if ((tsPacketHeader7 & 16) == 16) {
                    byte[] bArr = new byte[6];
                    int tsPacketHeader8 = bArr.length;
                    c1648fq.A0k(bArr, 0, tsPacketHeader8);
                    return A02(bArr);
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long A02(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }

    public static boolean A03(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (int currentPosition = -4; currentPosition <= 4; currentPosition++) {
            int consecutiveSyncByteCount = (currentPosition * 188) + i12;
            if (consecutiveSyncByteCount >= i10 && consecutiveSyncByteCount < i11) {
                int i14 = bArr[consecutiveSyncByteCount];
                if (i14 == 71) {
                    i13++;
                    if (i13 == 5) {
                        return true;
                    }
                }
            }
            i13 = 0;
        }
        return false;
    }
}
