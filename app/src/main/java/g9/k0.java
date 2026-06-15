package g9;

import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.j3;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StateFlow.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class k0<T> extends h9.b<m0> implements w<T>, e, h9.p<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f25912f = AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: e  reason: collision with root package name */
    private int f25913e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StateFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {384, 396, j3.a.b.f17897b}, m = "collect")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f25914a;

        /* renamed from: b  reason: collision with root package name */
        Object f25915b;

        /* renamed from: c  reason: collision with root package name */
        Object f25916c;

        /* renamed from: d  reason: collision with root package name */
        Object f25917d;

        /* renamed from: e  reason: collision with root package name */
        Object f25918e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f25919f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ k0<T> f25920g;

        /* renamed from: h  reason: collision with root package name */
        int f25921h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k0<T> k0Var, m8.d<? super a> dVar) {
            super(dVar);
            this.f25920g = k0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25919f = obj;
            this.f25921h |= RecyclerView.UNDEFINED_DURATION;
            return this.f25920g.collect(null, this);
        }
    }

    public k0(Object obj) {
        this._state = obj;
    }

    private final boolean p(Object obj, Object obj2) {
        int i10;
        m0[] m7;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25912f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.n.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.n.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f25913e;
            if ((i11 & 1) == 0) {
                int i12 = i11 + 1;
                this.f25913e = i12;
                m0[] m10 = m();
                i8.w wVar = i8.w.f26638a;
                while (true) {
                    m0[] m0VarArr = m10;
                    if (m0VarArr != null) {
                        for (m0 m0Var : m0VarArr) {
                            if (m0Var != null) {
                                m0Var.g();
                            }
                        }
                    }
                    synchronized (this) {
                        i10 = this.f25913e;
                        if (i10 == i12) {
                            this.f25913e = i12 + 1;
                            return true;
                        }
                        m7 = m();
                        i8.w wVar2 = i8.w.f26638a;
                    }
                    m10 = m7;
                    i12 = i10;
                }
            } else {
                this.f25913e = i11 + 2;
                return true;
            }
        }
    }

    @Override // h9.p
    public e<T> a(m8.g gVar, int i10, f9.a aVar) {
        return l0.d(this, gVar, i10, aVar);
    }

    @Override // g9.v
    public boolean c(T t10) {
        setValue(t10);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
        if (kotlin.jvm.internal.n.a(r11, r12) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00ae, B:38:0x00b3, B:48:0x00d4, B:50:0x00da, B:40:0x00b9, B:44:0x00c0, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00ae, B:38:0x00b3, B:48:0x00d4, B:50:0x00da, B:40:0x00b9, B:44:0x00c0, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00ae, B:38:0x00b3, B:48:0x00d4, B:50:0x00da, B:40:0x00b9, B:44:0x00c0, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [h9.d] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d8 -> B:34:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ea -> B:34:0x00a6). Please submit an issue!!! */
    @Override // g9.a0, g9.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(g9.f<? super T> r11, m8.d<?> r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.k0.collect(g9.f, m8.d):java.lang.Object");
    }

    @Override // g9.v, g9.f
    public Object emit(T t10, m8.d<? super i8.w> dVar) {
        setValue(t10);
        return i8.w.f26638a;
    }

    @Override // g9.w, g9.j0
    public T getValue() {
        i9.k0 k0Var = h9.s.f26336a;
        T t10 = (T) f25912f.get(this);
        if (t10 == k0Var) {
            return null;
        }
        return t10;
    }

    @Override // g9.w
    public boolean i(T t10, T t11) {
        if (t10 == null) {
            t10 = (T) h9.s.f26336a;
        }
        if (t11 == null) {
            t11 = (T) h9.s.f26336a;
        }
        return p(t10, t11);
    }

    @Override // g9.v
    public void j() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h9.b
    /* renamed from: n */
    public m0 g() {
        return new m0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h9.b
    /* renamed from: o */
    public m0[] h(int i10) {
        return new m0[i10];
    }

    @Override // g9.w
    public void setValue(T t10) {
        if (t10 == null) {
            t10 = (T) h9.s.f26336a;
        }
        p(null, t10);
    }
}
