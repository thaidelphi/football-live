package b0;

import androidx.recyclerview.widget.RecyclerView;
import i8.w;
import java.util.List;
import t8.p;
/* compiled from: DataMigrationInitializer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4847a = new a(null);

    /* compiled from: DataMigrationInitializer.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* compiled from: DataMigrationInitializer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
        /* renamed from: b0.e$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        static final class C0092a extends kotlin.coroutines.jvm.internal.l implements p<i<T>, m8.d<? super w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f4848a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f4849b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List<d<T>> f4850c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0092a(List<? extends d<T>> list, m8.d<? super C0092a> dVar) {
                super(2, dVar);
                this.f4850c = list;
            }

            @Override // t8.p
            /* renamed from: a */
            public final Object invoke(i<T> iVar, m8.d<? super w> dVar) {
                return ((C0092a) create(iVar, dVar)).invokeSuspend(w.f26638a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final m8.d<w> create(Object obj, m8.d<?> dVar) {
                C0092a c0092a = new C0092a(this.f4850c, dVar);
                c0092a.f4849b = obj;
                return c0092a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = n8.d.c();
                int i10 = this.f4848a;
                if (i10 == 0) {
                    i8.p.b(obj);
                    a aVar = e.f4847a;
                    List<d<T>> list = this.f4850c;
                    this.f4848a = 1;
                    if (aVar.c(list, (i) this.f4849b, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i8.p.b(obj);
                }
                return w.f26638a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DataMigrationInitializer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class b<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f4851a;

            /* renamed from: b  reason: collision with root package name */
            Object f4852b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f4853c;

            /* renamed from: e  reason: collision with root package name */
            int f4855e;

            b(m8.d<? super b> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f4853c = obj;
                this.f4855e |= RecyclerView.UNDEFINED_DURATION;
                return a.this.c(null, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DataMigrationInitializer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements p<T, m8.d<? super T>, Object> {

            /* renamed from: a  reason: collision with root package name */
            Object f4856a;

            /* renamed from: b  reason: collision with root package name */
            Object f4857b;

            /* renamed from: c  reason: collision with root package name */
            Object f4858c;

            /* renamed from: d  reason: collision with root package name */
            int f4859d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f4860e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ List<d<T>> f4861f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ List<t8.l<m8.d<? super w>, Object>> f4862g;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: DataMigrationInitializer.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
            /* renamed from: b0.e$a$c$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
            public static final class C0093a extends kotlin.coroutines.jvm.internal.l implements t8.l<m8.d<? super w>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f4863a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ d<T> f4864b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0093a(d<T> dVar, m8.d<? super C0093a> dVar2) {
                    super(1, dVar2);
                    this.f4864b = dVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final m8.d<w> create(m8.d<?> dVar) {
                    return new C0093a(this.f4864b, dVar);
                }

                @Override // t8.l
                public final Object invoke(m8.d<? super w> dVar) {
                    return ((C0093a) create(dVar)).invokeSuspend(w.f26638a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object c10;
                    c10 = n8.d.c();
                    int i10 = this.f4863a;
                    if (i10 == 0) {
                        i8.p.b(obj);
                        d<T> dVar = this.f4864b;
                        this.f4863a = 1;
                        if (dVar.cleanUp(this) == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        i8.p.b(obj);
                    }
                    return w.f26638a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(List<? extends d<T>> list, List<t8.l<m8.d<? super w>, Object>> list2, m8.d<? super c> dVar) {
                super(2, dVar);
                this.f4861f = list;
                this.f4862g = list2;
            }

            @Override // t8.p
            /* renamed from: a */
            public final Object invoke(T t10, m8.d<? super T> dVar) {
                return ((c) create(t10, dVar)).invokeSuspend(w.f26638a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final m8.d<w> create(Object obj, m8.d<?> dVar) {
                c cVar = new c(this.f4861f, this.f4862g, dVar);
                cVar.f4860e = obj;
                return cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0091 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008f -> B:22:0x008c). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = n8.b.c()
                    int r1 = r10.f4859d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L3a
                    if (r1 == r3) goto L24
                    if (r1 != r2) goto L1c
                    java.lang.Object r1 = r10.f4856a
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r10.f4860e
                    java.util.List r4 = (java.util.List) r4
                    i8.p.b(r11)
                    r7 = r10
                    goto L8c
                L1c:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L24:
                    java.lang.Object r1 = r10.f4858c
                    java.lang.Object r4 = r10.f4857b
                    b0.d r4 = (b0.d) r4
                    java.lang.Object r5 = r10.f4856a
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r10.f4860e
                    java.util.List r6 = (java.util.List) r6
                    i8.p.b(r11)
                    r7 = r10
                    r9 = r6
                    r6 = r4
                    r4 = r9
                    goto L6a
                L3a:
                    i8.p.b(r11)
                    java.lang.Object r11 = r10.f4860e
                    java.util.List<b0.d<T>> r1 = r10.f4861f
                    java.util.List<t8.l<m8.d<? super i8.w>, java.lang.Object>> r4 = r10.f4862g
                    java.util.Iterator r1 = r1.iterator()
                    r5 = r10
                L48:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L91
                    java.lang.Object r6 = r1.next()
                    b0.d r6 = (b0.d) r6
                    r5.f4860e = r4
                    r5.f4856a = r1
                    r5.f4857b = r6
                    r5.f4858c = r11
                    r5.f4859d = r3
                    java.lang.Object r7 = r6.shouldMigrate(r11, r5)
                    if (r7 != r0) goto L65
                    return r0
                L65:
                    r9 = r1
                    r1 = r11
                    r11 = r7
                    r7 = r5
                    r5 = r9
                L6a:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L8e
                    b0.e$a$c$a r11 = new b0.e$a$c$a
                    r8 = 0
                    r11.<init>(r6, r8)
                    r4.add(r11)
                    r7.f4860e = r4
                    r7.f4856a = r5
                    r7.f4857b = r8
                    r7.f4858c = r8
                    r7.f4859d = r2
                    java.lang.Object r11 = r6.migrate(r1, r7)
                    if (r11 != r0) goto L8f
                    return r0
                L8c:
                    r5 = r7
                    goto L48
                L8e:
                    r11 = r1
                L8f:
                    r1 = r5
                    goto L8c
                L91:
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: b0.e.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Throwable, T] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0069). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0069). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object c(java.util.List<? extends b0.d<T>> r7, b0.i<T> r8, m8.d<? super i8.w> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof b0.e.a.b
                if (r0 == 0) goto L13
                r0 = r9
                b0.e$a$b r0 = (b0.e.a.b) r0
                int r1 = r0.f4855e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f4855e = r1
                goto L18
            L13:
                b0.e$a$b r0 = new b0.e$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f4853c
                java.lang.Object r1 = n8.b.c()
                int r2 = r0.f4855e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f4852b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f4851a
                kotlin.jvm.internal.a0 r8 = (kotlin.jvm.internal.a0) r8
                i8.p.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L69
            L34:
                r9 = move-exception
                goto L82
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f4851a
                java.util.List r7 = (java.util.List) r7
                i8.p.b(r9)
                goto L60
            L46:
                i8.p.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                b0.e$a$c r2 = new b0.e$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f4851a = r9
                r0.f4855e = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                return r1
            L5f:
                r7 = r9
            L60:
                kotlin.jvm.internal.a0 r8 = new kotlin.jvm.internal.a0
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L69:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L94
                java.lang.Object r9 = r7.next()
                t8.l r9 = (t8.l) r9
                r0.f4851a = r8     // Catch: java.lang.Throwable -> L34
                r0.f4852b = r7     // Catch: java.lang.Throwable -> L34
                r0.f4855e = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L69
                return r1
            L82:
                T r2 = r8.f27364a
                if (r2 != 0) goto L89
                r8.f27364a = r9
                goto L69
            L89:
                kotlin.jvm.internal.n.c(r2)
                T r2 = r8.f27364a
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                i8.a.a(r2, r9)
                goto L69
            L94:
                T r7 = r8.f27364a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9d
                i8.w r7 = i8.w.f26638a
                return r7
            L9d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: b0.e.a.c(java.util.List, b0.i, m8.d):java.lang.Object");
        }

        public final <T> p<i<T>, m8.d<? super w>, Object> b(List<? extends d<T>> migrations) {
            kotlin.jvm.internal.n.f(migrations, "migrations");
            return new C0092a(migrations, null);
        }
    }
}
