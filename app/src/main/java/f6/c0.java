package f6;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OptionalProvider.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c0<T> implements q6.b<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final q6.a<Object> f25426c = new q6.a() { // from class: f6.a0
        @Override // q6.a
        public final void a(q6.b bVar) {
            c0.d(bVar);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static final q6.b<Object> f25427d = new q6.b() { // from class: f6.b0
        @Override // q6.b
        public final Object get() {
            Object e8;
            e8 = c0.e();
            return e8;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private q6.a<T> f25428a;

    /* renamed from: b  reason: collision with root package name */
    private volatile q6.b<T> f25429b;

    private c0(q6.a<T> aVar, q6.b<T> bVar) {
        this.f25428a = aVar;
        this.f25429b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> c0<T> c() {
        return new c0<>(f25426c, f25427d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(q6.b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object e() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(q6.b<T> bVar) {
        q6.a<T> aVar;
        if (this.f25429b == f25427d) {
            synchronized (this) {
                aVar = this.f25428a;
                this.f25428a = null;
                this.f25429b = bVar;
            }
            aVar.a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    @Override // q6.b
    public T get() {
        return this.f25429b.get();
    }
}
