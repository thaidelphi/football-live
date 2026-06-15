package h9;
/* compiled from: ChannelFlow.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface p<T> extends g9.e<T> {

    /* compiled from: ChannelFlow.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        public static /* synthetic */ g9.e a(p pVar, m8.g gVar, int i10, f9.a aVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    gVar = m8.h.f27797a;
                }
                if ((i11 & 2) != 0) {
                    i10 = -3;
                }
                if ((i11 & 4) != 0) {
                    aVar = f9.a.SUSPEND;
                }
                return pVar.a(gVar, i10, aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    g9.e<T> a(m8.g gVar, int i10, f9.a aVar);
}
