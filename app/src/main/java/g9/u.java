package g9;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Zip.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final /* synthetic */ class u {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a<R> implements e<R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f26087a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f26088b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t8.q f26089c;

        public a(e eVar, e eVar2, t8.q qVar) {
            this.f26087a = eVar;
            this.f26088b = eVar2;
            this.f26089c = qVar;
        }

        @Override // g9.e
        public Object collect(f<? super R> fVar, m8.d<? super i8.w> dVar) {
            Object c10;
            Object a10 = h9.k.a(fVar, new e[]{this.f26087a, this.f26088b}, u.a(), new b(this.f26089c, null), dVar);
            c10 = n8.d.c();
            return a10 == c10 ? a10 : i8.w.f26638a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {33, 33}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class b<R> extends kotlin.coroutines.jvm.internal.l implements t8.q<f<? super R>, Object[], m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f26090a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f26091b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f26092c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t8.q<T1, T2, m8.d<? super R>, Object> f26093d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(t8.q<? super T1, ? super T2, ? super m8.d<? super R>, ? extends Object> qVar, m8.d<? super b> dVar) {
            super(3, dVar);
            this.f26093d = qVar;
        }

        @Override // t8.q
        /* renamed from: a */
        public final Object invoke(f<? super R> fVar, Object[] objArr, m8.d<? super i8.w> dVar) {
            b bVar = new b(this.f26093d, dVar);
            bVar.f26091b = fVar;
            bVar.f26092c = objArr;
            return bVar.invokeSuspend(i8.w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            f fVar;
            c10 = n8.d.c();
            int i10 = this.f26090a;
            if (i10 == 0) {
                i8.p.b(obj);
                fVar = (f) this.f26091b;
                Object[] objArr = (Object[]) this.f26092c;
                t8.q<T1, T2, m8.d<? super R>, Object> qVar = this.f26093d;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f26091b = fVar;
                this.f26090a = 1;
                obj = qVar.invoke(obj2, obj3, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    i8.p.b(obj);
                    return i8.w.f26638a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                fVar = (f) this.f26091b;
                i8.p.b(obj);
            }
            this.f26091b = null;
            this.f26090a = 2;
            if (fVar.emit(obj, this) == c10) {
                return c10;
            }
            return i8.w.f26638a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Zip.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class c extends kotlin.jvm.internal.o implements t8.a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f26094a = new c();

        c() {
            super(0);
        }

        @Override // t8.a
        /* renamed from: b */
        public final Void invoke() {
            return null;
        }
    }

    public static final /* synthetic */ t8.a a() {
        return c();
    }

    public static final <T1, T2, R> e<R> b(e<? extends T1> eVar, e<? extends T2> eVar2, t8.q<? super T1, ? super T2, ? super m8.d<? super R>, ? extends Object> qVar) {
        return new a(eVar, eVar2, qVar);
    }

    private static final <T> t8.a<T[]> c() {
        return c.f26094a;
    }
}
