package e4;
/* compiled from: CompositeSequenceableLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f implements f0 {

    /* renamed from: a  reason: collision with root package name */
    protected final f0[] f25045a;

    public f(f0[] f0VarArr) {
        this.f25045a = f0VarArr;
    }

    @Override // e4.f0
    public final long b() {
        long j10 = Long.MAX_VALUE;
        for (f0 f0Var : this.f25045a) {
            long b10 = f0Var.b();
            if (b10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, b10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // e4.f0
    public boolean c() {
        for (f0 f0Var : this.f25045a) {
            if (f0Var.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // e4.f0
    public boolean d(long j10) {
        f0[] f0VarArr;
        boolean z10;
        boolean z11 = false;
        do {
            long b10 = b();
            if (b10 == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (f0 f0Var : this.f25045a) {
                long b11 = f0Var.b();
                boolean z12 = b11 != Long.MIN_VALUE && b11 <= j10;
                if (b11 == b10 || z12) {
                    z10 |= f0Var.d(j10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // e4.f0
    public final long g() {
        long j10 = Long.MAX_VALUE;
        for (f0 f0Var : this.f25045a) {
            long g10 = f0Var.g();
            if (g10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, g10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // e4.f0
    public final void h(long j10) {
        for (f0 f0Var : this.f25045a) {
            f0Var.h(j10);
        }
    }
}
