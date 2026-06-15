package d9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: CompletionState.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class b0 {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f24412b = AtomicIntegerFieldUpdater.newUpdater(b0.class, "_handled");
    private volatile int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f24413a;

    public b0(Throwable th, boolean z10) {
        this.f24413a = th;
        this._handled = z10 ? 1 : 0;
    }

    public final boolean a() {
        return f24412b.get(this) != 0;
    }

    public final boolean b() {
        return f24412b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return t0.a(this) + '[' + this.f24413a + ']';
    }

    public /* synthetic */ b0(Throwable th, boolean z10, int i10, kotlin.jvm.internal.h hVar) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }
}
