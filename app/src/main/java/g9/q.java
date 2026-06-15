package g9;

import com.google.android.gms.common.api.Api;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Merge.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final /* synthetic */ class q {

    /* renamed from: a  reason: collision with root package name */
    private static final int f26034a = i9.l0.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Api.BaseClientBuilder.API_PRIORITY_OTHER);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {217, 217}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a<R, T> extends kotlin.coroutines.jvm.internal.l implements t8.q<f<? super R>, T, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f26035a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f26036b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f26037c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t8.p<T, m8.d<? super R>, Object> f26038d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(t8.p<? super T, ? super m8.d<? super R>, ? extends Object> pVar, m8.d<? super a> dVar) {
            super(3, dVar);
            this.f26038d = pVar;
        }

        @Override // t8.q
        /* renamed from: a */
        public final Object invoke(f<? super R> fVar, T t10, m8.d<? super i8.w> dVar) {
            a aVar = new a(this.f26038d, dVar);
            aVar.f26036b = fVar;
            aVar.f26037c = t10;
            return aVar.invokeSuspend(i8.w.f26638a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            f fVar;
            c10 = n8.d.c();
            int i10 = this.f26035a;
            if (i10 == 0) {
                i8.p.b(obj);
                f fVar2 = (f) this.f26036b;
                Object obj2 = this.f26037c;
                this.f26036b = fVar2;
                this.f26035a = 1;
                obj = this.f26038d.invoke(obj2, this);
                fVar = fVar2;
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
                i8.p.b(obj);
                fVar = (f) this.f26036b;
            }
            this.f26036b = null;
            this.f26035a = 2;
            if (fVar.emit(obj, this) == c10) {
                return c10;
            }
            return i8.w.f26638a;
        }
    }

    public static final <T, R> e<R> a(e<? extends T> eVar, t8.p<? super T, ? super m8.d<? super R>, ? extends Object> pVar) {
        return g.F(eVar, new a(pVar, null));
    }

    public static final <T, R> e<R> b(e<? extends T> eVar, t8.q<? super f<? super R>, ? super T, ? super m8.d<? super i8.w>, ? extends Object> qVar) {
        return new h9.i(qVar, eVar, null, 0, null, 28, null);
    }
}
