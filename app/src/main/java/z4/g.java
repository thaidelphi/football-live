package z4;

import java.util.ArrayList;
import java.util.Map;
/* compiled from: BaseDataSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class g implements l {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f33495a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<s0> f33496b = new ArrayList<>(1);

    /* renamed from: c  reason: collision with root package name */
    private int f33497c;

    /* renamed from: d  reason: collision with root package name */
    private p f33498d;

    /* JADX INFO: Access modifiers changed from: protected */
    public g(boolean z10) {
        this.f33495a = z10;
    }

    @Override // z4.l
    public /* synthetic */ Map d() {
        return k.a(this);
    }

    @Override // z4.l
    public final void i(s0 s0Var) {
        a5.a.e(s0Var);
        if (this.f33496b.contains(s0Var)) {
            return;
        }
        this.f33496b.add(s0Var);
        this.f33497c++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(int i10) {
        p pVar = (p) a5.p0.j(this.f33498d);
        for (int i11 = 0; i11 < this.f33497c; i11++) {
            this.f33496b.get(i11).e(this, pVar, this.f33495a, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p() {
        p pVar = (p) a5.p0.j(this.f33498d);
        for (int i10 = 0; i10 < this.f33497c; i10++) {
            this.f33496b.get(i10).g(this, pVar, this.f33495a);
        }
        this.f33498d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(p pVar) {
        for (int i10 = 0; i10 < this.f33497c; i10++) {
            this.f33496b.get(i10).h(this, pVar, this.f33495a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(p pVar) {
        this.f33498d = pVar;
        for (int i10 = 0; i10 < this.f33497c; i10++) {
            this.f33496b.get(i10).c(this, pVar, this.f33495a);
        }
    }
}
