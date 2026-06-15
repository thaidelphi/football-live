package h9;

import androidx.recyclerview.widget.RecyclerView;
import d9.o0;
import d9.p0;
import d9.s0;
import d9.z1;
import kotlin.jvm.internal.a0;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Merge.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class i<T, R> extends g<T, R> {

    /* renamed from: e  reason: collision with root package name */
    private final t8.q<g9.f<? super R>, T, m8.d<? super i8.w>, Object> f26287e;

    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {27}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements t8.p<o0, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f26288a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f26289b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i<T, R> f26290c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g9.f<R> f26291d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Merge.kt */
        /* renamed from: h9.i$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class C0297a<T> implements g9.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a0<z1> f26292a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ o0 f26293b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ i<T, R> f26294c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ g9.f<R> f26295d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Merge.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {34}, m = "invokeSuspend")
            /* renamed from: h9.i$a$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
            public static final class C0298a extends kotlin.coroutines.jvm.internal.l implements t8.p<o0, m8.d<? super i8.w>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f26296a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ i<T, R> f26297b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ g9.f<R> f26298c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ T f26299d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0298a(i<T, R> iVar, g9.f<? super R> fVar, T t10, m8.d<? super C0298a> dVar) {
                    super(2, dVar);
                    this.f26297b = iVar;
                    this.f26298c = fVar;
                    this.f26299d = t10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
                    return new C0298a(this.f26297b, this.f26298c, this.f26299d, dVar);
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(o0 o0Var, m8.d<? super i8.w> dVar) {
                    return ((C0298a) create(o0Var, dVar)).invokeSuspend(i8.w.f26638a);
                }

                @Override // t8.p
                public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, m8.d<? super i8.w> dVar) {
                    return invoke2(o0Var, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object c10;
                    c10 = n8.d.c();
                    int i10 = this.f26296a;
                    if (i10 == 0) {
                        i8.p.b(obj);
                        t8.q qVar = ((i) this.f26297b).f26287e;
                        g9.f<R> fVar = this.f26298c;
                        T t10 = this.f26299d;
                        this.f26296a = 1;
                        if (qVar.invoke(fVar, t10, this) == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        i8.p.b(obj);
                    }
                    return i8.w.f26638a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Merge.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {30}, m = "emit")
            /* renamed from: h9.i$a$a$b */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                Object f26300a;

                /* renamed from: b  reason: collision with root package name */
                Object f26301b;

                /* renamed from: c  reason: collision with root package name */
                Object f26302c;

                /* renamed from: d  reason: collision with root package name */
                /* synthetic */ Object f26303d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C0297a<T> f26304e;

                /* renamed from: f  reason: collision with root package name */
                int f26305f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C0297a<? super T> c0297a, m8.d<? super b> dVar) {
                    super(dVar);
                    this.f26304e = c0297a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f26303d = obj;
                    this.f26305f |= RecyclerView.UNDEFINED_DURATION;
                    return this.f26304e.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0297a(a0<z1> a0Var, o0 o0Var, i<T, R> iVar, g9.f<? super R> fVar) {
                this.f26292a = a0Var;
                this.f26293b = o0Var;
                this.f26294c = iVar;
                this.f26295d = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
            @Override // g9.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, m8.d<? super i8.w> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof h9.i.a.C0297a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    h9.i$a$a$b r0 = (h9.i.a.C0297a.b) r0
                    int r1 = r0.f26305f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f26305f = r1
                    goto L18
                L13:
                    h9.i$a$a$b r0 = new h9.i$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f26303d
                    java.lang.Object r1 = n8.b.c()
                    int r2 = r0.f26305f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f26302c
                    d9.z1 r8 = (d9.z1) r8
                    java.lang.Object r8 = r0.f26301b
                    java.lang.Object r0 = r0.f26300a
                    h9.i$a$a r0 = (h9.i.a.C0297a) r0
                    i8.p.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    i8.p.b(r9)
                    kotlin.jvm.internal.a0<d9.z1> r9 = r7.f26292a
                    T r9 = r9.f27364a
                    d9.z1 r9 = (d9.z1) r9
                    if (r9 == 0) goto L5d
                    h9.j r2 = new h9.j
                    r2.<init>()
                    r9.a(r2)
                    r0.f26300a = r7
                    r0.f26301b = r8
                    r0.f26302c = r9
                    r0.f26305f = r3
                    java.lang.Object r9 = r9.n0(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.a0<d9.z1> r9 = r0.f26292a
                    d9.o0 r1 = r0.f26293b
                    r2 = 0
                    d9.q0 r3 = d9.q0.UNDISPATCHED
                    h9.i$a$a$a r4 = new h9.i$a$a$a
                    h9.i<T, R> r5 = r0.f26294c
                    g9.f<R> r0 = r0.f26295d
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    d9.z1 r8 = d9.i.d(r1, r2, r3, r4, r5, r6)
                    r9.f27364a = r8
                    i8.w r8 = i8.w.f26638a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: h9.i.a.C0297a.emit(java.lang.Object, m8.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(i<T, R> iVar, g9.f<? super R> fVar, m8.d<? super a> dVar) {
            super(2, dVar);
            this.f26290c = iVar;
            this.f26291d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            a aVar = new a(this.f26290c, this.f26291d, dVar);
            aVar.f26289b = obj;
            return aVar;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(o0 o0Var, m8.d<? super i8.w> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, m8.d<? super i8.w> dVar) {
            return invoke2(o0Var, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.f26288a;
            if (i10 == 0) {
                i8.p.b(obj);
                a0 a0Var = new a0();
                i<T, R> iVar = this.f26290c;
                g9.e<S> eVar = iVar.f26283d;
                C0297a c0297a = new C0297a(a0Var, (o0) this.f26289b, iVar, this.f26291d);
                this.f26288a = 1;
                if (eVar.collect(c0297a, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i8.p.b(obj);
            }
            return i8.w.f26638a;
        }
    }

    public /* synthetic */ i(t8.q qVar, g9.e eVar, m8.g gVar, int i10, f9.a aVar, int i11, kotlin.jvm.internal.h hVar) {
        this(qVar, eVar, (i11 & 4) != 0 ? m8.h.f27797a : gVar, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? f9.a.SUSPEND : aVar);
    }

    @Override // h9.e
    protected e<R> g(m8.g gVar, int i10, f9.a aVar) {
        return new i(this.f26287e, this.f26283d, gVar, i10, aVar);
    }

    @Override // h9.g
    protected Object q(g9.f<? super R> fVar, m8.d<? super i8.w> dVar) {
        Object c10;
        if (!s0.a() || (fVar instanceof w)) {
            Object e8 = p0.e(new a(this, fVar, null), dVar);
            c10 = n8.d.c();
            return e8 == c10 ? e8 : i8.w.f26638a;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(t8.q<? super g9.f<? super R>, ? super T, ? super m8.d<? super i8.w>, ? extends Object> qVar, g9.e<? extends T> eVar, m8.g gVar, int i10, f9.a aVar) {
        super(eVar, gVar, i10, aVar);
        this.f26287e = qVar;
    }
}
