package h9;

import g9.j0;
import h9.d;
import i8.o;
import java.util.Arrays;
/* compiled from: AbstractSharedFlow.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class b<S extends d<?>> {

    /* renamed from: a  reason: collision with root package name */
    private S[] f26268a;

    /* renamed from: b  reason: collision with root package name */
    private int f26269b;

    /* renamed from: c  reason: collision with root package name */
    private int f26270c;

    /* renamed from: d  reason: collision with root package name */
    private y f26271d;

    public static final /* synthetic */ int b(b bVar) {
        return bVar.f26269b;
    }

    public static final /* synthetic */ d[] d(b bVar) {
        return bVar.f26268a;
    }

    public final j0<Integer> e() {
        y yVar;
        synchronized (this) {
            yVar = this.f26271d;
            if (yVar == null) {
                yVar = new y(this.f26269b);
                this.f26271d = yVar;
            }
        }
        return yVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final S f() {
        S s10;
        y yVar;
        synchronized (this) {
            S[] sArr = this.f26268a;
            if (sArr == null) {
                sArr = h(2);
                this.f26268a = sArr;
            } else if (this.f26269b >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                kotlin.jvm.internal.n.e(copyOf, "copyOf(this, newSize)");
                this.f26268a = (S[]) ((d[]) copyOf);
                sArr = (S[]) ((d[]) copyOf);
            }
            int i10 = this.f26270c;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = g();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
                kotlin.jvm.internal.n.d(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s10.a(this));
            this.f26270c = i10;
            this.f26269b++;
            yVar = this.f26271d;
        }
        if (yVar != null) {
            yVar.Z(1);
        }
        return s10;
    }

    protected abstract S g();

    protected abstract S[] h(int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(S s10) {
        y yVar;
        int i10;
        m8.d<i8.w>[] b10;
        synchronized (this) {
            int i11 = this.f26269b - 1;
            this.f26269b = i11;
            yVar = this.f26271d;
            if (i11 == 0) {
                this.f26270c = 0;
            }
            kotlin.jvm.internal.n.d(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            b10 = s10.b(this);
        }
        for (m8.d<i8.w> dVar : b10) {
            if (dVar != null) {
                o.a aVar = i8.o.f26626b;
                dVar.resumeWith(i8.o.b(i8.w.f26638a));
            }
        }
        if (yVar != null) {
            yVar.Z(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int l() {
        return this.f26269b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final S[] m() {
        return this.f26268a;
    }
}
