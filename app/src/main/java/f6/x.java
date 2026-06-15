package f6;
/* compiled from: Lazy.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class x<T> implements q6.b<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f25481c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f25482a = f25481c;

    /* renamed from: b  reason: collision with root package name */
    private volatile q6.b<T> f25483b;

    public x(q6.b<T> bVar) {
        this.f25483b = bVar;
    }

    @Override // q6.b
    public T get() {
        T t10 = (T) this.f25482a;
        Object obj = f25481c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f25482a;
                if (t10 == obj) {
                    t10 = this.f25483b.get();
                    this.f25482a = t10;
                    this.f25483b = null;
                }
            }
        }
        return t10;
    }
}
