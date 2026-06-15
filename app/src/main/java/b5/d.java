package b5;

import a5.c0;
/* compiled from: DolbyVisionConfig.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f5109a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5110b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5111c;

    private d(int i10, int i11, String str) {
        this.f5109a = i10;
        this.f5110b = i11;
        this.f5111c = str;
    }

    public static d a(c0 c0Var) {
        String str;
        c0Var.L(2);
        int z10 = c0Var.z();
        int i10 = z10 >> 1;
        int z11 = ((c0Var.z() >> 3) & 31) | ((z10 & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else if (i10 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i10);
        sb.append(z11 >= 10 ? "." : ".0");
        sb.append(z11);
        return new d(i10, z11, sb.toString());
    }
}
