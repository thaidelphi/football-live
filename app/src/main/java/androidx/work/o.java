package androidx.work;

import i8.o;
import java.util.concurrent.CancellationException;
/* compiled from: ListenableFuture.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d9.n<Object> f4810a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b6.a<Object> f4811b;

    public o(d9.n<Object> nVar, b6.a<Object> aVar) {
        this.f4810a = nVar;
        this.f4811b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            d9.n<Object> nVar = this.f4810a;
            Object obj = this.f4811b.get();
            o.a aVar = i8.o.f26626b;
            nVar.resumeWith(i8.o.b(obj));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.f4810a.h(cause);
                return;
            }
            d9.n<Object> nVar2 = this.f4810a;
            o.a aVar2 = i8.o.f26626b;
            nVar2.resumeWith(i8.o.b(i8.p.a(cause)));
        }
    }
}
