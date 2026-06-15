package g9;

import androidx.recyclerview.widget.RecyclerView;
import d9.g1;
import d9.s0;
import i8.o;
import java.util.Arrays;
/* compiled from: SharedFlow.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class b0<T> extends h9.b<d0> implements v<T>, e, h9.p<T> {

    /* renamed from: e  reason: collision with root package name */
    private final int f25850e;

    /* renamed from: f  reason: collision with root package name */
    private final int f25851f;

    /* renamed from: g  reason: collision with root package name */
    private final f9.a f25852g;

    /* renamed from: h  reason: collision with root package name */
    private Object[] f25853h;

    /* renamed from: i  reason: collision with root package name */
    private long f25854i;

    /* renamed from: j  reason: collision with root package name */
    private long f25855j;

    /* renamed from: k  reason: collision with root package name */
    private int f25856k;

    /* renamed from: l  reason: collision with root package name */
    private int f25857l;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SharedFlow.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a implements g1 {

        /* renamed from: a  reason: collision with root package name */
        public final b0<?> f25858a;

        /* renamed from: b  reason: collision with root package name */
        public long f25859b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f25860c;

        /* renamed from: d  reason: collision with root package name */
        public final m8.d<i8.w> f25861d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(b0<?> b0Var, long j10, Object obj, m8.d<? super i8.w> dVar) {
            this.f25858a = b0Var;
            this.f25859b = j10;
            this.f25860c = obj;
            this.f25861d = dVar;
        }

        @Override // d9.g1
        public void d() {
            this.f25858a.y(this);
        }
    }

    /* compiled from: SharedFlow.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25862a;

        static {
            int[] iArr = new int[f9.a.values().length];
            try {
                iArr[f9.a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f9.a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f9.a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25862a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SharedFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {372, 379, 382}, m = "collect$suspendImpl")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f25863a;

        /* renamed from: b  reason: collision with root package name */
        Object f25864b;

        /* renamed from: c  reason: collision with root package name */
        Object f25865c;

        /* renamed from: d  reason: collision with root package name */
        Object f25866d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f25867e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b0<T> f25868f;

        /* renamed from: g  reason: collision with root package name */
        int f25869g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b0<T> b0Var, m8.d<? super c> dVar) {
            super(dVar);
            this.f25868f = b0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25867e = obj;
            this.f25869g |= RecyclerView.UNDEFINED_DURATION;
            return b0.A(this.f25868f, null, this);
        }
    }

    public b0(int i10, int i11, f9.a aVar) {
        this.f25850e = i10;
        this.f25851f = i11;
        this.f25852g = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ <T> java.lang.Object A(g9.b0<T> r8, g9.f<? super T> r9, m8.d<?> r10) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.b0.A(g9.b0, g9.f, m8.d):java.lang.Object");
    }

    private final void B(long j10) {
        h9.d[] d10;
        if (h9.b.b(this) != 0 && (d10 = h9.b.d(this)) != null) {
            for (h9.d dVar : d10) {
                if (dVar != null) {
                    d0 d0Var = (d0) dVar;
                    long j11 = d0Var.f25881a;
                    if (j11 >= 0 && j11 < j10) {
                        d0Var.f25881a = j10;
                    }
                }
            }
        }
        this.f25855j = j10;
    }

    private final void E() {
        Object[] objArr = this.f25853h;
        kotlin.jvm.internal.n.c(objArr);
        c0.d(objArr, K(), null);
        this.f25856k--;
        long K = K() + 1;
        if (this.f25854i < K) {
            this.f25854i = K;
        }
        if (this.f25855j < K) {
            B(K);
        }
        if (s0.a()) {
            if (!(K() == K)) {
                throw new AssertionError();
            }
        }
    }

    static /* synthetic */ <T> Object F(b0<T> b0Var, T t10, m8.d<? super i8.w> dVar) {
        Object c10;
        if (b0Var.c(t10)) {
            return i8.w.f26638a;
        }
        Object G = b0Var.G(t10, dVar);
        c10 = n8.d.c();
        return G == c10 ? G : i8.w.f26638a;
    }

    private final Object G(T t10, m8.d<? super i8.w> dVar) {
        m8.d b10;
        m8.d<i8.w>[] dVarArr;
        a aVar;
        Object c10;
        Object c11;
        b10 = n8.c.b(dVar);
        d9.o oVar = new d9.o(b10, 1);
        oVar.C();
        m8.d<i8.w>[] dVarArr2 = h9.c.f26272a;
        synchronized (this) {
            if (R(t10)) {
                o.a aVar2 = i8.o.f26626b;
                oVar.resumeWith(i8.o.b(i8.w.f26638a));
                dVarArr = I(dVarArr2);
                aVar = null;
            } else {
                a aVar3 = new a(this, P() + K(), t10, oVar);
                H(aVar3);
                this.f25857l++;
                if (this.f25851f == 0) {
                    dVarArr2 = I(dVarArr2);
                }
                dVarArr = dVarArr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            d9.q.a(oVar, aVar);
        }
        for (m8.d<i8.w> dVar2 : dVarArr) {
            if (dVar2 != null) {
                o.a aVar4 = i8.o.f26626b;
                dVar2.resumeWith(i8.o.b(i8.w.f26638a));
            }
        }
        Object z10 = oVar.z();
        c10 = n8.d.c();
        if (z10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        c11 = n8.d.c();
        return z10 == c11 ? z10 : i8.w.f26638a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(Object obj) {
        int P = P();
        Object[] objArr = this.f25853h;
        if (objArr == null) {
            objArr = Q(null, 0, 2);
        } else if (P >= objArr.length) {
            objArr = Q(objArr, P, objArr.length * 2);
        }
        c0.d(objArr, K() + P, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final m8.d<i8.w>[] I(m8.d<i8.w>[] dVarArr) {
        h9.d[] d10;
        d0 d0Var;
        m8.d<? super i8.w> dVar;
        int length = dVarArr.length;
        if (h9.b.b(this) != 0 && (d10 = h9.b.d(this)) != null) {
            int i10 = 0;
            int length2 = d10.length;
            dVarArr = dVarArr;
            while (i10 < length2) {
                h9.d dVar2 = d10[i10];
                if (dVar2 != null && (dVar = (d0Var = (d0) dVar2).f25882b) != null && T(d0Var) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        kotlin.jvm.internal.n.e(copyOf, "copyOf(this, newSize)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = dVar;
                    d0Var.f25882b = null;
                    length++;
                }
                i10++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    private final long J() {
        return K() + this.f25856k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long K() {
        return Math.min(this.f25855j, this.f25854i);
    }

    private final Object M(long j10) {
        Object[] objArr = this.f25853h;
        kotlin.jvm.internal.n.c(objArr);
        Object c10 = c0.c(objArr, j10);
        return c10 instanceof a ? ((a) c10).f25860c : c10;
    }

    private final long N() {
        return K() + this.f25856k + this.f25857l;
    }

    private final int O() {
        return (int) ((K() + this.f25856k) - this.f25854i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P() {
        return this.f25856k + this.f25857l;
    }

    private final Object[] Q(Object[] objArr, int i10, int i11) {
        if (i11 > 0) {
            Object[] objArr2 = new Object[i11];
            this.f25853h = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long K = K();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = i12 + K;
                c0.d(objArr2, j10, c0.c(objArr, j10));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R(T t10) {
        if (l() == 0) {
            return S(t10);
        }
        if (this.f25856k >= this.f25851f && this.f25855j <= this.f25854i) {
            int i10 = b.f25862a[this.f25852g.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
        }
        H(t10);
        int i11 = this.f25856k + 1;
        this.f25856k = i11;
        if (i11 > this.f25851f) {
            E();
        }
        if (O() > this.f25850e) {
            V(this.f25854i + 1, this.f25855j, J(), N());
        }
        return true;
    }

    private final boolean S(T t10) {
        if (s0.a()) {
            if (!(l() == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f25850e == 0) {
            return true;
        }
        H(t10);
        int i10 = this.f25856k + 1;
        this.f25856k = i10;
        if (i10 > this.f25850e) {
            E();
        }
        this.f25855j = K() + this.f25856k;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long T(d0 d0Var) {
        long j10 = d0Var.f25881a;
        if (j10 < J()) {
            return j10;
        }
        if (this.f25851f <= 0 && j10 <= K() && this.f25857l != 0) {
            return j10;
        }
        return -1L;
    }

    private final Object U(d0 d0Var) {
        Object obj;
        m8.d<i8.w>[] dVarArr = h9.c.f26272a;
        synchronized (this) {
            long T = T(d0Var);
            if (T < 0) {
                obj = c0.f25871a;
            } else {
                long j10 = d0Var.f25881a;
                Object M = M(T);
                d0Var.f25881a = T + 1;
                dVarArr = W(j10);
                obj = M;
            }
        }
        for (m8.d<i8.w> dVar : dVarArr) {
            if (dVar != null) {
                o.a aVar = i8.o.f26626b;
                dVar.resumeWith(i8.o.b(i8.w.f26638a));
            }
        }
        return obj;
    }

    private final void V(long j10, long j11, long j12, long j13) {
        long min = Math.min(j11, j10);
        if (s0.a()) {
            if (!(min >= K())) {
                throw new AssertionError();
            }
        }
        for (long K = K(); K < min; K++) {
            Object[] objArr = this.f25853h;
            kotlin.jvm.internal.n.c(objArr);
            c0.d(objArr, K, null);
        }
        this.f25854i = j10;
        this.f25855j = j11;
        this.f25856k = (int) (j12 - min);
        this.f25857l = (int) (j13 - j12);
        if (s0.a()) {
            if (!(this.f25856k >= 0)) {
                throw new AssertionError();
            }
        }
        if (s0.a()) {
            if (!(this.f25857l >= 0)) {
                throw new AssertionError();
            }
        }
        if (s0.a()) {
            if (!(this.f25854i <= K() + ((long) this.f25856k))) {
                throw new AssertionError();
            }
        }
    }

    private final Object x(d0 d0Var, m8.d<? super i8.w> dVar) {
        m8.d b10;
        i8.w wVar;
        Object c10;
        Object c11;
        b10 = n8.c.b(dVar);
        d9.o oVar = new d9.o(b10, 1);
        oVar.C();
        synchronized (this) {
            if (T(d0Var) < 0) {
                d0Var.f25882b = oVar;
                d0Var.f25882b = oVar;
            } else {
                o.a aVar = i8.o.f26626b;
                oVar.resumeWith(i8.o.b(i8.w.f26638a));
            }
            wVar = i8.w.f26638a;
        }
        Object z10 = oVar.z();
        c10 = n8.d.c();
        if (z10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        c11 = n8.d.c();
        return z10 == c11 ? z10 : wVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(a aVar) {
        synchronized (this) {
            if (aVar.f25859b < K()) {
                return;
            }
            Object[] objArr = this.f25853h;
            kotlin.jvm.internal.n.c(objArr);
            if (c0.c(objArr, aVar.f25859b) != aVar) {
                return;
            }
            c0.d(objArr, aVar.f25859b, c0.f25871a);
            z();
            i8.w wVar = i8.w.f26638a;
        }
    }

    private final void z() {
        if (this.f25851f != 0 || this.f25857l > 1) {
            Object[] objArr = this.f25853h;
            kotlin.jvm.internal.n.c(objArr);
            while (this.f25857l > 0 && c0.c(objArr, (K() + P()) - 1) == c0.f25871a) {
                this.f25857l--;
                c0.d(objArr, K() + P(), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h9.b
    /* renamed from: C */
    public d0 g() {
        return new d0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h9.b
    /* renamed from: D */
    public d0[] h(int i10) {
        return new d0[i10];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T L() {
        Object[] objArr = this.f25853h;
        kotlin.jvm.internal.n.c(objArr);
        return (T) c0.c(objArr, (this.f25854i + O()) - 1);
    }

    public final m8.d<i8.w>[] W(long j10) {
        int i10;
        long j11;
        long j12;
        h9.d[] d10;
        if (s0.a()) {
            if (!(j10 >= this.f25855j)) {
                throw new AssertionError();
            }
        }
        if (j10 > this.f25855j) {
            return h9.c.f26272a;
        }
        long K = K();
        long j13 = this.f25856k + K;
        if (this.f25851f == 0 && this.f25857l > 0) {
            j13++;
        }
        if (h9.b.b(this) != 0 && (d10 = h9.b.d(this)) != null) {
            for (h9.d dVar : d10) {
                if (dVar != null) {
                    long j14 = ((d0) dVar).f25881a;
                    if (j14 >= 0 && j14 < j13) {
                        j13 = j14;
                    }
                }
            }
        }
        if (s0.a()) {
            if (!(j13 >= this.f25855j)) {
                throw new AssertionError();
            }
        }
        if (j13 <= this.f25855j) {
            return h9.c.f26272a;
        }
        long J = J();
        if (l() > 0) {
            i10 = Math.min(this.f25857l, this.f25851f - ((int) (J - j13)));
        } else {
            i10 = this.f25857l;
        }
        m8.d<i8.w>[] dVarArr = h9.c.f26272a;
        long j15 = this.f25857l + J;
        if (i10 > 0) {
            dVarArr = new m8.d[i10];
            Object[] objArr = this.f25853h;
            kotlin.jvm.internal.n.c(objArr);
            long j16 = J;
            int i11 = 0;
            while (true) {
                if (J >= j15) {
                    j11 = j13;
                    break;
                }
                Object c10 = c0.c(objArr, J);
                i9.k0 k0Var = c0.f25871a;
                j11 = j13;
                if (c10 != k0Var) {
                    kotlin.jvm.internal.n.d(c10, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) c10;
                    int i12 = i11 + 1;
                    dVarArr[i11] = aVar.f25861d;
                    c0.d(objArr, J, k0Var);
                    c0.d(objArr, j16, aVar.f25860c);
                    j12 = 1;
                    j16++;
                    if (i12 >= i10) {
                        break;
                    }
                    i11 = i12;
                } else {
                    j12 = 1;
                }
                J += j12;
                j13 = j11;
            }
            J = j16;
        } else {
            j11 = j13;
        }
        int i13 = (int) (J - K);
        long j17 = l() == 0 ? J : j11;
        long max = Math.max(this.f25854i, J - Math.min(this.f25850e, i13));
        if (this.f25851f == 0 && max < j15) {
            Object[] objArr2 = this.f25853h;
            kotlin.jvm.internal.n.c(objArr2);
            if (kotlin.jvm.internal.n.a(c0.c(objArr2, max), c0.f25871a)) {
                J++;
                max++;
            }
        }
        V(max, j17, J, j15);
        z();
        return true ^ (dVarArr.length == 0) ? I(dVarArr) : dVarArr;
    }

    public final long X() {
        long j10 = this.f25854i;
        if (j10 < this.f25855j) {
            this.f25855j = j10;
        }
        return j10;
    }

    @Override // h9.p
    public e<T> a(m8.g gVar, int i10, f9.a aVar) {
        return c0.e(this, gVar, i10, aVar);
    }

    @Override // g9.v
    public boolean c(T t10) {
        int i10;
        boolean z10;
        m8.d<i8.w>[] dVarArr = h9.c.f26272a;
        synchronized (this) {
            if (R(t10)) {
                dVarArr = I(dVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (m8.d<i8.w> dVar : dVarArr) {
            if (dVar != null) {
                o.a aVar = i8.o.f26626b;
                dVar.resumeWith(i8.o.b(i8.w.f26638a));
            }
        }
        return z10;
    }

    @Override // g9.a0, g9.e
    public Object collect(f<? super T> fVar, m8.d<?> dVar) {
        return A(this, fVar, dVar);
    }

    @Override // g9.v, g9.f
    public Object emit(T t10, m8.d<? super i8.w> dVar) {
        return F(this, t10, dVar);
    }

    @Override // g9.v
    public void j() {
        synchronized (this) {
            V(J(), this.f25855j, J(), N());
            i8.w wVar = i8.w.f26638a;
        }
    }
}
