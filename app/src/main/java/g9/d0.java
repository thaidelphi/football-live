package g9;

import d9.s0;
/* compiled from: SharedFlow.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class d0 extends h9.d<b0<?>> {

    /* renamed from: a  reason: collision with root package name */
    public long f25881a = -1;

    /* renamed from: b  reason: collision with root package name */
    public m8.d<? super i8.w> f25882b;

    @Override // h9.d
    /* renamed from: c */
    public boolean a(b0<?> b0Var) {
        if (this.f25881a >= 0) {
            return false;
        }
        this.f25881a = b0Var.X();
        return true;
    }

    @Override // h9.d
    /* renamed from: d */
    public m8.d<i8.w>[] b(b0<?> b0Var) {
        if (s0.a()) {
            if (!(this.f25881a >= 0)) {
                throw new AssertionError();
            }
        }
        long j10 = this.f25881a;
        this.f25881a = -1L;
        this.f25882b = null;
        return b0Var.W(j10);
    }
}
