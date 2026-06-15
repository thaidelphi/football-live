package v3;

import a5.c0;
import java.io.IOException;
/* compiled from: Sniffer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f31837a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f31837a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(s3.j jVar) throws IOException {
        return c(jVar, true, false);
    }

    private static boolean c(s3.j jVar, boolean z10, boolean z11) throws IOException {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        long a10 = jVar.a();
        long j10 = -1;
        int i10 = (a10 > (-1L) ? 1 : (a10 == (-1L) ? 0 : -1));
        long j11 = 4096;
        if (i10 != 0 && a10 <= 4096) {
            j11 = a10;
        }
        int i11 = (int) j11;
        c0 c0Var = new c0(64);
        boolean z17 = false;
        int i12 = 0;
        boolean z18 = false;
        while (i12 < i11) {
            c0Var.G(8);
            if (!jVar.c(c0Var.d(), z17 ? 1 : 0, 8, true)) {
                break;
            }
            long B = c0Var.B();
            int n10 = c0Var.n();
            int i13 = 16;
            if (B == 1) {
                jVar.n(c0Var.d(), 8, 8);
                c0Var.J(16);
                B = c0Var.t();
            } else {
                if (B == 0) {
                    long a11 = jVar.a();
                    if (a11 != j10) {
                        B = (a11 - jVar.g()) + 8;
                    }
                }
                i13 = 8;
            }
            long j12 = i13;
            if (B < j12) {
                return z17;
            }
            i12 += i13;
            if (n10 == 1836019574) {
                i11 += (int) B;
                if (i10 != 0 && i11 > a10) {
                    i11 = (int) a10;
                }
            } else if (n10 == 1836019558 || n10 == 1836475768) {
                z12 = z17 ? 1 : 0;
                z13 = true;
                z14 = true;
                break;
            } else {
                long j13 = a10;
                if ((i12 + B) - j12 >= i11) {
                    z12 = false;
                    z13 = true;
                    break;
                }
                int i14 = (int) (B - j12);
                i12 += i14;
                if (n10 != 1718909296) {
                    z15 = false;
                    z18 = z18;
                    if (i14 != 0) {
                        jVar.h(i14);
                        z18 = z18;
                    }
                } else if (i14 < 8) {
                    return false;
                } else {
                    c0Var.G(i14);
                    jVar.n(c0Var.d(), 0, i14);
                    int i15 = i14 / 4;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= i15) {
                            z16 = z18;
                            break;
                        }
                        if (i16 == 1) {
                            c0Var.L(4);
                        } else if (a(c0Var.n(), z11)) {
                            z16 = true;
                            break;
                        }
                        i16++;
                    }
                    if (!z16) {
                        return false;
                    }
                    z15 = false;
                    z18 = z16;
                }
                z17 = z15;
                a10 = j13;
            }
            j10 = -1;
            z18 = z18;
        }
        z12 = z17 ? 1 : 0;
        z13 = true;
        z14 = z12;
        return (z18 && z10 == z14) ? z13 : z12;
    }
}
