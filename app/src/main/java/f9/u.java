package f9;

import i8.w;
/* compiled from: Channel.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface u<E> {

    /* compiled from: Channel.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        public static /* synthetic */ boolean a(u uVar, Throwable th, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th = null;
                }
                return uVar.q(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    void c(t8.l<? super Throwable, w> lVar);

    Object i(E e8, m8.d<? super w> dVar);

    Object l(E e8);

    boolean q(Throwable th);

    boolean s();
}
