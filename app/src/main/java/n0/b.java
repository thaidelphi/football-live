package n0;

import androidx.concurrent.futures.c;
import d9.w0;
import i8.w;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import t8.l;
/* compiled from: CoroutineAdapter.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {

    /* compiled from: CoroutineAdapter.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a extends o implements l<Throwable, w> {

        /* renamed from: a */
        final /* synthetic */ c.a<T> f27836a;

        /* renamed from: b */
        final /* synthetic */ w0<T> f27837b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c.a<T> aVar, w0<? extends T> w0Var) {
            super(1);
            this.f27836a = aVar;
            this.f27837b = w0Var;
        }

        @Override // t8.l
        public /* bridge */ /* synthetic */ w invoke(Throwable th) {
            invoke2(th);
            return w.f26638a;
        }

        /* renamed from: invoke */
        public final void invoke2(Throwable th) {
            if (th != null) {
                if (th instanceof CancellationException) {
                    this.f27836a.c();
                    return;
                } else {
                    this.f27836a.e(th);
                    return;
                }
            }
            this.f27836a.b(this.f27837b.j());
        }
    }

    public static final <T> b6.a<T> b(final w0<? extends T> w0Var, final Object obj) {
        n.f(w0Var, "<this>");
        b6.a<T> a10 = c.a(new c.InterfaceC0031c() { // from class: n0.a
            @Override // androidx.concurrent.futures.c.InterfaceC0031c
            public final Object a(c.a aVar) {
                Object d10;
                d10 = b.d(w0.this, obj, aVar);
                return d10;
            }
        });
        n.e(a10, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a10;
    }

    public static /* synthetic */ b6.a c(w0 w0Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(w0Var, obj);
    }

    public static final Object d(w0 this_asListenableFuture, Object obj, c.a completer) {
        n.f(this_asListenableFuture, "$this_asListenableFuture");
        n.f(completer, "completer");
        this_asListenableFuture.K(new a(completer, this_asListenableFuture));
        return obj;
    }
}
