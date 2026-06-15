package z3;

import a5.b0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import x5.b;
import y3.d;
import y3.f;
/* compiled from: AppInfoTableDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends f {
    private static Metadata c(b0 b0Var) {
        b0Var.q(12);
        int d10 = (b0Var.d() + b0Var.h(12)) - 4;
        b0Var.q(44);
        b0Var.r(b0Var.h(12));
        b0Var.q(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (b0Var.d() >= d10) {
                break;
            }
            b0Var.q(48);
            int h10 = b0Var.h(8);
            b0Var.q(4);
            int d11 = b0Var.d() + b0Var.h(12);
            String str2 = null;
            while (b0Var.d() < d11) {
                int h11 = b0Var.h(8);
                int h12 = b0Var.h(8);
                int d12 = b0Var.d() + h12;
                if (h11 == 2) {
                    int h13 = b0Var.h(16);
                    b0Var.q(8);
                    if (h13 != 3) {
                    }
                    while (b0Var.d() < d12) {
                        str = b0Var.k(b0Var.h(8), b.f32748a);
                        int h14 = b0Var.h(8);
                        for (int i10 = 0; i10 < h14; i10++) {
                            b0Var.r(b0Var.h(8));
                        }
                    }
                } else if (h11 == 21) {
                    str2 = b0Var.k(h12, b.f32748a);
                }
                b0Var.o(d12 * 8);
            }
            b0Var.o(d11 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new AppInfoTable(h10, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Override // y3.f
    protected Metadata b(d dVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new b0(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
