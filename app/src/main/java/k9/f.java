package k9;

import d9.q1;
import java.util.concurrent.Executor;
/* compiled from: Dispatcher.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class f extends q1 {

    /* renamed from: c  reason: collision with root package name */
    private final int f27333c;

    /* renamed from: d  reason: collision with root package name */
    private final int f27334d;

    /* renamed from: e  reason: collision with root package name */
    private final long f27335e;

    /* renamed from: f  reason: collision with root package name */
    private final String f27336f;

    /* renamed from: g  reason: collision with root package name */
    private a f27337g = L0();

    public f(int i10, int i11, long j10, String str) {
        this.f27333c = i10;
        this.f27334d = i11;
        this.f27335e = j10;
        this.f27336f = str;
    }

    private final a L0() {
        return new a(this.f27333c, this.f27334d, this.f27335e, this.f27336f);
    }

    @Override // d9.j0
    public void G0(m8.g gVar, Runnable runnable) {
        a.z(this.f27337g, runnable, null, false, 6, null);
    }

    @Override // d9.j0
    public void H0(m8.g gVar, Runnable runnable) {
        a.z(this.f27337g, runnable, null, true, 2, null);
    }

    @Override // d9.q1
    public Executor K0() {
        return this.f27337g;
    }

    public final void M0(Runnable runnable, i iVar, boolean z10) {
        this.f27337g.w(runnable, iVar, z10);
    }
}
