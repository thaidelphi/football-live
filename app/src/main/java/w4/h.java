package w4;

import a5.c0;
import android.text.TextUtils;
import java.util.ArrayList;
import n3.h2;
/* compiled from: WebvttDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h extends n4.g {

    /* renamed from: o  reason: collision with root package name */
    private final c0 f32361o;

    /* renamed from: p  reason: collision with root package name */
    private final c f32362p;

    public h() {
        super("WebvttDecoder");
        this.f32361o = new c0();
        this.f32362p = new c();
    }

    private static int B(c0 c0Var) {
        int i10 = 0;
        int i11 = -1;
        while (i11 == -1) {
            i10 = c0Var.e();
            String o10 = c0Var.o();
            if (o10 == null) {
                i11 = 0;
            } else if ("STYLE".equals(o10)) {
                i11 = 2;
            } else {
                i11 = o10.startsWith("NOTE") ? 1 : 3;
            }
        }
        c0Var.K(i10);
        return i11;
    }

    private static void C(c0 c0Var) {
        do {
        } while (!TextUtils.isEmpty(c0Var.o()));
    }

    @Override // n4.g
    protected n4.h z(byte[] bArr, int i10, boolean z10) throws n4.j {
        e m7;
        this.f32361o.I(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            i.e(this.f32361o);
            do {
            } while (!TextUtils.isEmpty(this.f32361o.o()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int B = B(this.f32361o);
                if (B == 0) {
                    return new k(arrayList2);
                }
                if (B == 1) {
                    C(this.f32361o);
                } else if (B == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f32361o.o();
                        arrayList.addAll(this.f32362p.d(this.f32361o));
                    } else {
                        throw new n4.j("A style block was found after the first cue.");
                    }
                } else if (B == 3 && (m7 = f.m(this.f32361o, arrayList)) != null) {
                    arrayList2.add(m7);
                }
            }
        } catch (h2 e8) {
            throw new n4.j(e8);
        }
    }
}
