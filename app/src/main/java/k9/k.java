package k9;

import d9.t0;
/* compiled from: Tasks.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class k extends h {

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f27341c;

    public k(Runnable runnable, long j10, i iVar) {
        super(j10, iVar);
        this.f27341c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f27341c.run();
        } finally {
            this.f27339b.a();
        }
    }

    public String toString() {
        return "Task[" + t0.a(this.f27341c) + '@' + t0.b(this.f27341c) + ", " + this.f27338a + ", " + this.f27339b + ']';
    }
}
