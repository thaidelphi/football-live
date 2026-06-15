package p4;

import a5.c0;
import java.util.List;
import n4.g;
import n4.h;
/* compiled from: DvbDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    private final b f29845o;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        c0 c0Var = new c0(list.get(0));
        this.f29845o = new b(c0Var.F(), c0Var.F());
    }

    @Override // n4.g
    protected h z(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f29845o.r();
        }
        return new c(this.f29845o.b(bArr, i10));
    }
}
