package f9;

import d9.p1;
import java.util.concurrent.CancellationException;
/* compiled from: Channels.common.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final /* synthetic */ class l {
    public static final void a(t<?> tVar, Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = p1.a("Channel was consumed, consumer had failed", th);
            }
        }
        tVar.a(r0);
    }
}
