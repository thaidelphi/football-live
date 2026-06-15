package d9;

import d9.l1;
import java.util.concurrent.locks.LockSupport;
/* compiled from: EventLoop.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class m1 extends k1 {
    protected abstract Thread W0();

    /* JADX INFO: Access modifiers changed from: protected */
    public void X0(long j10, l1.c cVar) {
        u0.f24520h.h1(j10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Y0() {
        Thread W0 = W0();
        if (Thread.currentThread() != W0) {
            c.a();
            LockSupport.unpark(W0);
        }
    }
}
