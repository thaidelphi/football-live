package b5;

import a5.c0;
import a5.y;
import java.util.ArrayList;
import java.util.List;
import n3.h2;
/* compiled from: AvcConfig.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f5089a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5090b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5091c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5092d;

    /* renamed from: e  reason: collision with root package name */
    public final float f5093e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5094f;

    private a(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f5089a = list;
        this.f5090b = i10;
        this.f5091c = i11;
        this.f5092d = i12;
        this.f5093e = f10;
        this.f5094f = str;
    }

    private static byte[] a(c0 c0Var) {
        int F = c0Var.F();
        int e8 = c0Var.e();
        c0Var.L(F);
        return a5.e.d(c0Var.d(), e8, F);
    }

    public static a b(c0 c0Var) throws h2 {
        float f10;
        String str;
        int i10;
        try {
            c0Var.L(4);
            int z10 = (c0Var.z() & 3) + 1;
            if (z10 != 3) {
                ArrayList arrayList = new ArrayList();
                int z11 = c0Var.z() & 31;
                for (int i11 = 0; i11 < z11; i11++) {
                    arrayList.add(a(c0Var));
                }
                int z12 = c0Var.z();
                for (int i12 = 0; i12 < z12; i12++) {
                    arrayList.add(a(c0Var));
                }
                int i13 = -1;
                if (z11 > 0) {
                    y.c l10 = a5.y.l((byte[]) arrayList.get(0), z10, ((byte[]) arrayList.get(0)).length);
                    int i14 = l10.f548f;
                    int i15 = l10.f549g;
                    float f11 = l10.f550h;
                    str = a5.e.a(l10.f543a, l10.f544b, l10.f545c);
                    i13 = i14;
                    i10 = i15;
                    f10 = f11;
                } else {
                    f10 = 1.0f;
                    str = null;
                    i10 = -1;
                }
                return new a(arrayList, z10, i13, i10, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw h2.a("Error parsing AVC config", e8);
        }
    }
}
