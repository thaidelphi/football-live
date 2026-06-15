package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class WX {
    public static String[] A00 = {"XaMN", "FvE9pjm3324a0xJnMynMkwOLQFBnA7VY", "bTXZinmnfbB6B0d8sTeuEdBC4iIH8UVK", "N9t7nxkL15CeL8BHnhp6HN26QOqkPbFY", "ebn6LH928MPI84NEPNpnK67pXTtamLRv", "SLORTYF7QadC3HEUSy6dvDOwwkjkN61c", "", "QvlqdgkREF9PaCWTAu28pJgIsiwfnHXC"};
    public static final int[] A01 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean A00(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        int[] iArr = A01;
        String[] strArr = A00;
        if (strArr[5].charAt(27) != strArr[3].charAt(27)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A00;
        strArr2[2] = "j5mRnpVXmsF9fFWvjjsgRXifTOGS2Czx";
        strArr2[4] = "T5lCDrnpy2Bb3DWu2FSAH2boF1NW8f68";
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean A01(WJ wj) throws IOException {
        return A03(wj, true, false);
    }

    public static boolean A02(WJ wj, boolean z10) throws IOException {
        return A03(wj, false, z10);
    }

    public static boolean A03(WJ wj, boolean z10, boolean z11) throws IOException {
        long A8E = wj.A8E();
        long inputLength = 4096;
        if (A8E != -1 && A8E <= 4096) {
            inputLength = A8E;
        }
        int i10 = (int) inputLength;
        C1648fq c1648fq = new C1648fq(64);
        int i11 = 0;
        boolean z12 = false;
        boolean z13 = false;
        while (i11 < i10) {
            int i12 = 8;
            c1648fq.A0d(8);
            if (!wj.AG2(c1648fq.A0l(), 0, 8, true)) {
                break;
            }
            long A0Q = c1648fq.A0Q();
            int headerSize = c1648fq.A0C();
            if (A0Q == 1) {
                i12 = 16;
                wj.AG1(c1648fq.A0l(), 8, 8);
                c1648fq.A0e(16);
                A0Q = c1648fq.A0P();
            } else if (A0Q == 0) {
                long A8E2 = wj.A8E();
                if (A8E2 != -1) {
                    A0Q = (A8E2 - wj.A8Y()) + 8;
                }
            }
            if (A0Q < i12) {
                return false;
            }
            i11 += i12;
            if (headerSize == 1836019574) {
                i10 += (int) A0Q;
                if (A8E != -1 && i10 > A8E) {
                    i10 = (int) A8E;
                }
            } else if (headerSize == 1836019558 || headerSize == 1836475768) {
                z13 = true;
                break;
            } else if ((i11 + A0Q) - i12 >= i10) {
                break;
            } else {
                int atomDataSize = (int) (A0Q - i12);
                i11 += atomDataSize;
                if (headerSize == 1718909296) {
                    if (atomDataSize >= 8) {
                        c1648fq.A0d(atomDataSize);
                        wj.AG1(c1648fq.A0l(), 0, atomDataSize);
                        int atomDataSize2 = atomDataSize / 4;
                        int brandsCount = 0;
                        while (true) {
                            if (brandsCount >= atomDataSize2) {
                                break;
                            }
                            if (brandsCount == 1) {
                                c1648fq.A0g(4);
                            } else if (A00(c1648fq.A0C(), z11)) {
                                z12 = true;
                                break;
                            }
                            brandsCount++;
                        }
                        if (!z12) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else if (atomDataSize != 0) {
                    wj.A3x(atomDataSize);
                }
            }
        }
        if (z12) {
            String[] strArr = A00;
            if (strArr[2].charAt(29) == strArr[4].charAt(29)) {
                throw new RuntimeException();
            }
            A00[7] = "pFKvHkJSq3K8vNTui4Mcu8lysNSmnddC";
            if (z10 == z13) {
                return true;
            }
        }
        return false;
    }
}
