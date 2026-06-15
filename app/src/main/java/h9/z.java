package h9;

import i9.o0;
/* compiled from: ChannelFlow.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class z<T> implements g9.f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final m8.g f26351a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f26352b;

    /* renamed from: c  reason: collision with root package name */
    private final t8.p<T, m8.d<? super i8.w>, Object> f26353c;

    /* compiled from: ChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements t8.p<T, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f26354a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f26355b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g9.f<T> f26356c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(g9.f<? super T> fVar, m8.d<? super a> dVar) {
            super(2, dVar);
            this.f26356c = fVar;
        }

        @Override // t8.p
        /* renamed from: a */
        public final Object invoke(T t10, m8.d<? super i8.w> dVar) {
            return ((a) create(t10, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            a aVar = new a(this.f26356c, dVar);
            aVar.f26355b = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.f26354a;
            if (i10 == 0) {
                i8.p.b(obj);
                Object obj2 = this.f26355b;
                this.f26354a = 1;
                if (this.f26356c.emit(obj2, this) == c10) {
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

    public z(g9.f<? super T> fVar, m8.g gVar) {
        this.f26351a = gVar;
        this.f26352b = o0.b(gVar);
        this.f26353c = new a(fVar, null);
    }

    @Override // g9.f
    public Object emit(T t10, m8.d<? super i8.w> dVar) {
        Object c10;
        Object b10 = f.b(this.f26351a, t10, this.f26352b, this.f26353c, dVar);
        c10 = n8.d.c();
        return b10 == c10 ? b10 : i8.w.f26638a;
    }
}
