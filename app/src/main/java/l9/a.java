package l9;

import d9.z0;
import i8.w;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.n;
import t8.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnTimeout.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final long f27571a;

    /* compiled from: Runnable.kt */
    /* renamed from: l9.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class RunnableC0310a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f27572a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f27573b;

        public RunnableC0310a(j jVar, a aVar) {
            this.f27572a = jVar;
            this.f27573b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27572a.f(this.f27573b, w.f26638a);
        }
    }

    /* compiled from: OnTimeout.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    /* synthetic */ class b extends kotlin.jvm.internal.l implements q<a, j<?>, Object, w> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f27574a = new b();

        b() {
            super(3, a.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(a aVar, j<?> jVar, Object obj) {
            aVar.c(jVar, obj);
        }

        @Override // t8.q
        public /* bridge */ /* synthetic */ w invoke(a aVar, j<?> jVar, Object obj) {
            a(aVar, jVar, obj);
            return w.f26638a;
        }
    }

    public a(long j10) {
        this.f27571a = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(j<?> jVar, Object obj) {
        if (this.f27571a <= 0) {
            jVar.c(w.f26638a);
            return;
        }
        RunnableC0310a runnableC0310a = new RunnableC0310a(jVar, this);
        n.d(jVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        i iVar = (i) jVar;
        m8.g context = jVar.getContext();
        jVar.d(z0.b(context).X(this.f27571a, runnableC0310a, context));
    }

    public final d b() {
        b bVar = b.f27574a;
        n.d(bVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new e(this, (q) e0.a(bVar, 3), null, 4, null);
    }
}
