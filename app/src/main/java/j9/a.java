package j9;

import i8.o;
import i8.p;
import i8.w;
import i9.l;
import m8.d;
import n8.c;
/* compiled from: Cancellable.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class a {
    private static final void a(d<?> dVar, Throwable th) {
        o.a aVar = o.f26626b;
        dVar.resumeWith(o.b(p.a(th)));
        throw th;
    }

    public static final void b(d<? super w> dVar, d<?> dVar2) {
        d b10;
        try {
            b10 = c.b(dVar);
            o.a aVar = o.f26626b;
            l.c(b10, o.b(w.f26638a), null, 2, null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    public static final <R, T> void c(t8.p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar, t8.l<? super Throwable, w> lVar) {
        d a10;
        d b10;
        try {
            a10 = c.a(pVar, r10, dVar);
            b10 = c.b(a10);
            o.a aVar = o.f26626b;
            l.b(b10, o.b(w.f26638a), lVar);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static /* synthetic */ void d(t8.p pVar, Object obj, d dVar, t8.l lVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        c(pVar, obj, dVar, lVar);
    }
}
