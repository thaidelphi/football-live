package g9;

import d9.q0;
import d9.z1;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final /* synthetic */ class s {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Share.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {214, 218, 219, 225}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements t8.p<d9.o0, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f26060a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0 f26061b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e<T> f26062c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v<T> f26063d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ T f26064e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Share.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
        /* renamed from: g9.s$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class C0289a extends kotlin.coroutines.jvm.internal.l implements t8.p<Integer, m8.d<? super Boolean>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f26065a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ int f26066b;

            C0289a(m8.d<? super C0289a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
                C0289a c0289a = new C0289a(dVar);
                c0289a.f26066b = ((Number) obj).intValue();
                return c0289a;
            }

            public final Object invoke(int i10, m8.d<? super Boolean> dVar) {
                return ((C0289a) create(Integer.valueOf(i10), dVar)).invokeSuspend(i8.w.f26638a);
            }

            @Override // t8.p
            public /* bridge */ /* synthetic */ Object invoke(Integer num, m8.d<? super Boolean> dVar) {
                return invoke(num.intValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                n8.d.c();
                if (this.f26065a == 0) {
                    i8.p.b(obj);
                    return kotlin.coroutines.jvm.internal.b.a(this.f26066b > 0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Share.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {227}, m = "invokeSuspend")
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements t8.p<e0, m8.d<? super i8.w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f26067a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f26068b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e<T> f26069c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ v<T> f26070d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ T f26071e;

            /* compiled from: Share.kt */
            /* renamed from: g9.s$a$b$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
            public /* synthetic */ class C0290a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f26072a;

                static {
                    int[] iArr = new int[e0.values().length];
                    try {
                        iArr[e0.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[e0.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[e0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f26072a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(e<? extends T> eVar, v<T> vVar, T t10, m8.d<? super b> dVar) {
                super(2, dVar);
                this.f26069c = eVar;
                this.f26070d = vVar;
                this.f26071e = t10;
            }

            public final Object a(e0 e0Var, m8.d<? super i8.w> dVar) {
                return ((b) create(e0Var, dVar)).invokeSuspend(i8.w.f26638a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
                b bVar = new b(this.f26069c, this.f26070d, this.f26071e, dVar);
                bVar.f26068b = obj;
                return bVar;
            }

            @Override // t8.p
            public /* bridge */ /* synthetic */ Object invoke(e0 e0Var, m8.d<? super i8.w> dVar) {
                return a(e0Var, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = n8.d.c();
                int i10 = this.f26067a;
                if (i10 == 0) {
                    i8.p.b(obj);
                    int i11 = C0290a.f26072a[((e0) this.f26068b).ordinal()];
                    if (i11 == 1) {
                        e<T> eVar = this.f26069c;
                        f fVar = this.f26070d;
                        this.f26067a = 1;
                        if (eVar.collect(fVar, this) == c10) {
                            return c10;
                        }
                    } else if (i11 == 3) {
                        T t10 = this.f26071e;
                        if (t10 == c0.f25871a) {
                            this.f26070d.j();
                        } else {
                            this.f26070d.c(t10);
                        }
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i8.p.b(obj);
                }
                return i8.w.f26638a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(g0 g0Var, e<? extends T> eVar, v<T> vVar, T t10, m8.d<? super a> dVar) {
            super(2, dVar);
            this.f26061b = g0Var;
            this.f26062c = eVar;
            this.f26063d = vVar;
            this.f26064e = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            return new a(this.f26061b, this.f26062c, this.f26063d, this.f26064e, dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(d9.o0 o0Var, m8.d<? super i8.w> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ Object invoke(d9.o0 o0Var, m8.d<? super i8.w> dVar) {
            return invoke2(o0Var, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = n8.b.c()
                int r1 = r7.f26060a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                i8.p.b(r8)
                goto L5c
            L21:
                i8.p.b(r8)
                goto L8d
            L25:
                i8.p.b(r8)
                g9.g0 r8 = r7.f26061b
                g9.g0$a r1 = g9.g0.f25891a
                g9.g0 r6 = r1.a()
                if (r8 != r6) goto L3f
                g9.e<T> r8 = r7.f26062c
                g9.v<T> r1 = r7.f26063d
                r7.f26060a = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3f:
                g9.g0 r8 = r7.f26061b
                g9.g0 r1 = r1.b()
                r5 = 0
                if (r8 != r1) goto L69
                g9.v<T> r8 = r7.f26063d
                g9.j0 r8 = r8.e()
                g9.s$a$a r1 = new g9.s$a$a
                r1.<init>(r5)
                r7.f26060a = r4
                java.lang.Object r8 = g9.g.s(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                g9.e<T> r8 = r7.f26062c
                g9.v<T> r1 = r7.f26063d
                r7.f26060a = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                g9.g0 r8 = r7.f26061b
                g9.v<T> r1 = r7.f26063d
                g9.j0 r1 = r1.e()
                g9.e r8 = r8.a(r1)
                g9.e r8 = g9.g.l(r8)
                g9.s$a$b r1 = new g9.s$a$b
                g9.e<T> r3 = r7.f26062c
                g9.v<T> r4 = r7.f26063d
                T r6 = r7.f26064e
                r1.<init>(r3, r4, r6, r5)
                r7.f26060a = r2
                java.lang.Object r8 = g9.g.j(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                i8.w r8 = i8.w.f26638a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: g9.s.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T> a0<T> a(v<T> vVar) {
        return new x(vVar, null);
    }

    public static final <T> j0<T> b(w<T> wVar) {
        return new y(wVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
        if (r9 == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <T> g9.f0<T> c(g9.e<? extends T> r8, int r9) {
        /*
            boolean r0 = d9.s0.a()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            if (r9 < 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L10
            goto L16
        L10:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L16:
            f9.d$a r0 = f9.d.f25549u0
            int r0 = r0.a()
            int r0 = y8.g.a(r9, r0)
            int r0 = r0 - r9
            boolean r3 = r8 instanceof h9.e
            if (r3 == 0) goto L53
            r3 = r8
            h9.e r3 = (h9.e) r3
            g9.e r4 = r3.h()
            if (r4 == 0) goto L53
            g9.f0 r8 = new g9.f0
            int r5 = r3.f26274b
            r6 = -3
            if (r5 == r6) goto L3c
            r6 = -2
            if (r5 == r6) goto L3c
            if (r5 == 0) goto L3c
            r1 = r5
            goto L4b
        L3c:
            f9.a r6 = r3.f26275c
            f9.a r7 = f9.a.SUSPEND
            if (r6 != r7) goto L47
            if (r5 != 0) goto L45
            goto L4a
        L45:
            r1 = r0
            goto L4b
        L47:
            if (r9 != 0) goto L4a
            goto L4b
        L4a:
            r1 = r2
        L4b:
            f9.a r9 = r3.f26275c
            m8.g r0 = r3.f26273a
            r8.<init>(r4, r1, r9, r0)
            return r8
        L53:
            g9.f0 r9 = new g9.f0
            f9.a r1 = f9.a.SUSPEND
            m8.h r2 = m8.h.f27797a
            r9.<init>(r8, r0, r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.s.c(g9.e, int):g9.f0");
    }

    private static final <T> z1 d(d9.o0 o0Var, m8.g gVar, e<? extends T> eVar, v<T> vVar, g0 g0Var, T t10) {
        return d9.i.c(o0Var, gVar, kotlin.jvm.internal.n.a(g0Var, g0.f25891a.a()) ? q0.DEFAULT : q0.UNDISPATCHED, new a(g0Var, eVar, vVar, t10, null));
    }

    public static final <T> a0<T> e(a0<? extends T> a0Var, t8.p<? super f<? super T>, ? super m8.d<? super i8.w>, ? extends Object> pVar) {
        return new o0(a0Var, pVar);
    }

    public static final <T> a0<T> f(e<? extends T> eVar, d9.o0 o0Var, g0 g0Var, int i10) {
        f0 c10 = c(eVar, i10);
        v a10 = c0.a(i10, c10.f25888b, c10.f25889c);
        return new x(a10, d(o0Var, c10.f25890d, c10.f25887a, a10, g0Var, c0.f25871a));
    }
}
