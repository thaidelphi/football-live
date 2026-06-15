package m8;

import i8.o;
import i8.w;
import kotlin.jvm.internal.n;
import t8.p;
/* compiled from: Continuation.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class f {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> completion) {
        d a10;
        d b10;
        n.f(pVar, "<this>");
        n.f(completion, "completion");
        a10 = n8.c.a(pVar, r10, completion);
        b10 = n8.c.b(a10);
        o.a aVar = o.f26626b;
        b10.resumeWith(o.b(w.f26638a));
    }
}
