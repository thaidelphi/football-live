package i9;
/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class d {

    /* renamed from: a */
    private static final k0 f26651a = new k0("CLOSED");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [i9.e] */
    public static final <N extends e<N>> N b(N n10) {
        while (true) {
            Object f10 = n10.f();
            if (f10 == f26651a) {
                return n10;
            }
            ?? r02 = (e) f10;
            if (r02 != 0) {
                n10 = r02;
            } else if (n10.j()) {
                return n10;
            }
        }
    }

    public static final <S extends h0<S>> Object c(S s10, long j10, t8.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s10.f26659c < j10 || s10.h()) {
                Object f10 = s10.f();
                if (f10 == f26651a) {
                    return i0.a(f26651a);
                }
                S s11 = (S) ((e) f10);
                if (s11 == null) {
                    s11 = pVar.invoke(Long.valueOf(s10.f26659c + 1), s10);
                    if (s10.l(s11)) {
                        if (s10.h()) {
                            s10.k();
                        }
                    }
                }
                s10 = s11;
            } else {
                return i0.a(s10);
            }
        }
    }
}
