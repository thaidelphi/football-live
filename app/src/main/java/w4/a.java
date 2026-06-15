package w4;

import a5.c0;
import a5.p0;
import java.util.ArrayList;
import java.util.Collections;
import n4.b;
/* compiled from: Mp4WebvttDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends n4.g {

    /* renamed from: o  reason: collision with root package name */
    private final c0 f32310o;

    public a() {
        super("Mp4WebvttDecoder");
        this.f32310o = new c0();
    }

    private static n4.b B(c0 c0Var, int i10) throws n4.j {
        CharSequence charSequence = null;
        b.C0322b c0322b = null;
        while (i10 > 0) {
            if (i10 >= 8) {
                int n10 = c0Var.n();
                int n11 = c0Var.n();
                int i11 = n10 - 8;
                String D = p0.D(c0Var.d(), c0Var.e(), i11);
                c0Var.L(i11);
                i10 = (i10 - 8) - i11;
                if (n11 == 1937011815) {
                    c0322b = f.o(D);
                } else if (n11 == 1885436268) {
                    charSequence = f.q(null, D.trim(), Collections.emptyList());
                }
            } else {
                throw new n4.j("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (c0322b != null) {
            return c0322b.o(charSequence).a();
        }
        return f.l(charSequence);
    }

    @Override // n4.g
    protected n4.h z(byte[] bArr, int i10, boolean z10) throws n4.j {
        this.f32310o.I(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f32310o.a() > 0) {
            if (this.f32310o.a() >= 8) {
                int n10 = this.f32310o.n();
                if (this.f32310o.n() == 1987343459) {
                    arrayList.add(B(this.f32310o, n10 - 8));
                } else {
                    this.f32310o.L(n10 - 8);
                }
            } else {
                throw new n4.j("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new b(arrayList);
    }
}
