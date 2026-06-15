package b5;

import a5.c0;
import a5.y;
import java.util.Collections;
import java.util.List;
import n3.h2;
/* compiled from: HevcConfig.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f5126a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5127b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5128c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5129d;

    /* renamed from: e  reason: collision with root package name */
    public final float f5130e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5131f;

    private f(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f5126a = list;
        this.f5127b = i10;
        this.f5128c = i11;
        this.f5129d = i12;
        this.f5130e = f10;
        this.f5131f = str;
    }

    public static f a(c0 c0Var) throws h2 {
        int i10;
        int i11;
        try {
            c0Var.L(21);
            int z10 = c0Var.z() & 3;
            int z11 = c0Var.z();
            int e8 = c0Var.e();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < z11; i14++) {
                c0Var.L(1);
                int F = c0Var.F();
                for (int i15 = 0; i15 < F; i15++) {
                    int F2 = c0Var.F();
                    i13 += F2 + 4;
                    c0Var.L(F2);
                }
            }
            c0Var.K(e8);
            byte[] bArr = new byte[i13];
            float f10 = 1.0f;
            String str = null;
            int i16 = -1;
            int i17 = -1;
            int i18 = 0;
            int i19 = 0;
            while (i18 < z11) {
                int z12 = c0Var.z() & 63;
                int F3 = c0Var.F();
                int i20 = i12;
                while (i20 < F3) {
                    int F4 = c0Var.F();
                    byte[] bArr2 = a5.y.f526a;
                    int i21 = z11;
                    System.arraycopy(bArr2, i12, bArr, i19, bArr2.length);
                    int length = i19 + bArr2.length;
                    System.arraycopy(c0Var.d(), c0Var.e(), bArr, length, F4);
                    if (z12 == 33 && i20 == 0) {
                        y.a h10 = a5.y.h(bArr, length, length + F4);
                        int i22 = h10.f537h;
                        i17 = h10.f538i;
                        f10 = h10.f539j;
                        i10 = z12;
                        i11 = F3;
                        i16 = i22;
                        str = a5.e.c(h10.f530a, h10.f531b, h10.f532c, h10.f533d, h10.f534e, h10.f535f);
                    } else {
                        i10 = z12;
                        i11 = F3;
                    }
                    i19 = length + F4;
                    c0Var.L(F4);
                    i20++;
                    z11 = i21;
                    z12 = i10;
                    F3 = i11;
                    i12 = 0;
                }
                i18++;
                i12 = 0;
            }
            return new f(i13 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), z10 + 1, i16, i17, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw h2.a("Error parsing HEVC config", e10);
        }
    }
}
