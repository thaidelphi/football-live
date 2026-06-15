package n3;

import android.os.Bundle;
import n3.h;
/* compiled from: Rating.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class w2 implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final h.a<w2> f28482a = new h.a() { // from class: n3.v2
        @Override // n3.h.a
        public final h a(Bundle bundle) {
            w2 b10;
            b10 = w2.b(bundle);
            return b10;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static w2 b(Bundle bundle) {
        int i10 = bundle.getInt(c(0), -1);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return j3.f28099d.a(bundle);
                    }
                    throw new IllegalArgumentException("Unknown RatingType: " + i10);
                }
                return f3.f27958d.a(bundle);
            }
            return j2.f28097c.a(bundle);
        }
        return p1.f28270d.a(bundle);
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }
}
