package s3;

import a5.c0;
/* compiled from: CeaUtil.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {
    public static void a(long j10, c0 c0Var, t[] tVarArr) {
        while (true) {
            if (c0Var.a() <= 1) {
                return;
            }
            int c10 = c(c0Var);
            int c11 = c(c0Var);
            int e8 = c0Var.e() + c11;
            if (c11 == -1 || c11 > c0Var.a()) {
                a5.t.i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                e8 = c0Var.f();
            } else if (c10 == 4 && c11 >= 8) {
                int z10 = c0Var.z();
                int F = c0Var.F();
                int n10 = F == 49 ? c0Var.n() : 0;
                int z11 = c0Var.z();
                if (F == 47) {
                    c0Var.L(1);
                }
                boolean z12 = z10 == 181 && (F == 49 || F == 47) && z11 == 3;
                if (F == 49) {
                    z12 &= n10 == 1195456820;
                }
                if (z12) {
                    b(j10, c0Var, tVarArr);
                }
            }
            c0Var.K(e8);
        }
    }

    public static void b(long j10, c0 c0Var, t[] tVarArr) {
        int z10 = c0Var.z();
        if ((z10 & 64) != 0) {
            c0Var.L(1);
            int i10 = (z10 & 31) * 3;
            int e8 = c0Var.e();
            for (t tVar : tVarArr) {
                c0Var.K(e8);
                tVar.d(c0Var, i10);
                if (j10 != -9223372036854775807L) {
                    tVar.e(j10, 1, i10, 0, null);
                }
            }
        }
    }

    private static int c(c0 c0Var) {
        int i10 = 0;
        while (c0Var.a() != 0) {
            int z10 = c0Var.z();
            i10 += z10;
            if (z10 != 255) {
                return i10;
            }
        }
        return -1;
    }
}
