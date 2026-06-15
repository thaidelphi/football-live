package w3;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import n3.m1;
import w3.a0;
/* compiled from: DefaultTsPayloadReaderFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g implements a0.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f32060a;

    /* renamed from: b  reason: collision with root package name */
    private final List<m1> f32061b;

    public g(int i10, List<m1> list) {
        this.f32060a = i10;
        this.f32061b = list;
    }

    private w c(a0.b bVar) {
        return new w(e(bVar));
    }

    private c0 d(a0.b bVar) {
        return new c0(e(bVar));
    }

    private List<m1> e(a0.b bVar) {
        String str;
        int i10;
        if (f(32)) {
            return this.f32061b;
        }
        a5.c0 c0Var = new a5.c0(bVar.f31988d);
        List<m1> list = this.f32061b;
        while (c0Var.a() > 0) {
            int z10 = c0Var.z();
            int e8 = c0Var.e() + c0Var.z();
            if (z10 == 134) {
                list = new ArrayList<>();
                int z11 = c0Var.z() & 31;
                for (int i11 = 0; i11 < z11; i11++) {
                    String w10 = c0Var.w(3);
                    int z12 = c0Var.z();
                    boolean z13 = (z12 & 128) != 0;
                    if (z13) {
                        i10 = z12 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte z14 = (byte) c0Var.z();
                    c0Var.L(1);
                    List<byte[]> list2 = null;
                    if (z13) {
                        list2 = a5.e.b((z14 & 64) != 0);
                    }
                    list.add(new m1.b().e0(str).V(w10).F(i10).T(list2).E());
                }
            }
            c0Var.K(e8);
        }
        return list;
    }

    private boolean f(int i10) {
        return (i10 & this.f32060a) != 0;
    }

    @Override // w3.a0.c
    public SparseArray<a0> a() {
        return new SparseArray<>();
    }

    @Override // w3.a0.c
    public a0 b(int i10, a0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new t(new q(bVar.f31986b));
            }
            if (i10 != 21) {
                if (i10 == 27) {
                    if (f(4)) {
                        return null;
                    }
                    return new t(new m(c(bVar), f(1), f(8)));
                } else if (i10 != 36) {
                    if (i10 != 89) {
                        if (i10 != 138) {
                            if (i10 != 172) {
                                if (i10 != 257) {
                                    if (i10 != 134) {
                                        if (i10 != 135) {
                                            switch (i10) {
                                                case 15:
                                                    if (f(2)) {
                                                        return null;
                                                    }
                                                    return new t(new f(false, bVar.f31986b));
                                                case 16:
                                                    return new t(new l(d(bVar)));
                                                case 17:
                                                    if (f(2)) {
                                                        return null;
                                                    }
                                                    return new t(new p(bVar.f31986b));
                                                default:
                                                    switch (i10) {
                                                        case 128:
                                                            break;
                                                        case 129:
                                                            break;
                                                        case 130:
                                                            if (!f(64)) {
                                                                return null;
                                                            }
                                                            break;
                                                        default:
                                                            return null;
                                                    }
                                            }
                                        }
                                        return new t(new b(bVar.f31986b));
                                    } else if (f(16)) {
                                        return null;
                                    } else {
                                        return new v(new s("application/x-scte35"));
                                    }
                                }
                                return new v(new s("application/vnd.dvb.ait"));
                            }
                            return new t(new d(bVar.f31986b));
                        }
                        return new t(new h(bVar.f31986b));
                    }
                    return new t(new i(bVar.f31987c));
                } else {
                    return new t(new n(c(bVar)));
                }
            }
            return new t(new o());
        }
        return new t(new k(d(bVar)));
    }
}
