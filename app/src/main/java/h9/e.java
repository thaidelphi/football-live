package h9;

import com.google.android.gms.common.api.Api;
import d9.o0;
import d9.p0;
import d9.q0;
import d9.s0;
import d9.t0;
import java.util.ArrayList;
/* compiled from: ChannelFlow.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class e<T> implements p<T> {

    /* renamed from: a  reason: collision with root package name */
    public final m8.g f26273a;

    /* renamed from: b  reason: collision with root package name */
    public final int f26274b;

    /* renamed from: c  reason: collision with root package name */
    public final f9.a f26275c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements t8.p<o0, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f26276a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f26277b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g9.f<T> f26278c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e<T> f26279d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(g9.f<? super T> fVar, e<T> eVar, m8.d<? super a> dVar) {
            super(2, dVar);
            this.f26278c = fVar;
            this.f26279d = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            a aVar = new a(this.f26278c, this.f26279d, dVar);
            aVar.f26277b = obj;
            return aVar;
        }

        @Override // t8.p
        public final Object invoke(o0 o0Var, m8.d<? super i8.w> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.f26276a;
            if (i10 == 0) {
                i8.p.b(obj);
                g9.f<T> fVar = this.f26278c;
                f9.t<T> m7 = this.f26279d.m((o0) this.f26277b);
                this.f26276a = 1;
                if (g9.g.n(fVar, m7, this) == c10) {
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
    /* compiled from: ChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements t8.p<f9.r<? super T>, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f26280a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f26281b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e<T> f26282c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e<T> eVar, m8.d<? super b> dVar) {
            super(2, dVar);
            this.f26282c = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            b bVar = new b(this.f26282c, dVar);
            bVar.f26281b = obj;
            return bVar;
        }

        public final Object invoke(f9.r<? super T> rVar, m8.d<? super i8.w> dVar) {
            return ((b) create(rVar, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, m8.d<? super i8.w> dVar) {
            return invoke((f9.r) ((f9.r) obj), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.f26280a;
            if (i10 == 0) {
                i8.p.b(obj);
                e<T> eVar = this.f26282c;
                this.f26280a = 1;
                if (eVar.f((f9.r) this.f26281b, this) == c10) {
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

    public e(m8.g gVar, int i10, f9.a aVar) {
        this.f26273a = gVar;
        this.f26274b = i10;
        this.f26275c = aVar;
        if (s0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
    }

    static /* synthetic */ <T> Object d(e<T> eVar, g9.f<? super T> fVar, m8.d<? super i8.w> dVar) {
        Object c10;
        Object e8 = p0.e(new a(fVar, eVar, null), dVar);
        c10 = n8.d.c();
        return e8 == c10 ? e8 : i8.w.f26638a;
    }

    @Override // h9.p
    public g9.e<T> a(m8.g gVar, int i10, f9.a aVar) {
        if (s0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        m8.g plus = gVar.plus(this.f26273a);
        if (aVar == f9.a.SUSPEND) {
            int i11 = this.f26274b;
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 != -2) {
                            if (s0.a()) {
                                if (!(this.f26274b >= 0)) {
                                    throw new AssertionError();
                                }
                            }
                            if (s0.a()) {
                                if (!(i10 >= 0)) {
                                    throw new AssertionError();
                                }
                            }
                            i11 = this.f26274b + i10;
                            if (i11 < 0) {
                                i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                            }
                        }
                    }
                }
                i10 = i11;
            }
            aVar = this.f26275c;
        }
        return (kotlin.jvm.internal.n.a(plus, this.f26273a) && i10 == this.f26274b && aVar == this.f26275c) ? this : g(plus, i10, aVar);
    }

    protected String b() {
        return null;
    }

    @Override // g9.e
    public Object collect(g9.f<? super T> fVar, m8.d<? super i8.w> dVar) {
        return d(this, fVar, dVar);
    }

    protected abstract Object f(f9.r<? super T> rVar, m8.d<? super i8.w> dVar);

    protected abstract e<T> g(m8.g gVar, int i10, f9.a aVar);

    public g9.e<T> h() {
        return null;
    }

    public final t8.p<f9.r<? super T>, m8.d<? super i8.w>, Object> k() {
        return new b(this, null);
    }

    public final int l() {
        int i10 = this.f26274b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public f9.t<T> m(o0 o0Var) {
        return f9.p.d(o0Var, this.f26273a, l(), this.f26275c, q0.ATOMIC, null, k(), 16, null);
    }

    public String toString() {
        String A;
        ArrayList arrayList = new ArrayList(4);
        String b10 = b();
        if (b10 != null) {
            arrayList.add(b10);
        }
        if (this.f26273a != m8.h.f27797a) {
            arrayList.add("context=" + this.f26273a);
        }
        if (this.f26274b != -3) {
            arrayList.add("capacity=" + this.f26274b);
        }
        if (this.f26275c != f9.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f26275c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(t0.a(this));
        sb.append('[');
        A = j8.y.A(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb.append(A);
        sb.append(']');
        return sb.toString();
    }
}
