package b0;
/* compiled from: SingleProcessDataStore.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class c<T> extends n<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f4845a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4846b;

    public c(T t10, int i10) {
        super(null);
        this.f4845a = t10;
        this.f4846b = i10;
    }

    public final void a() {
        T t10 = this.f4845a;
        if (!((t10 != null ? t10.hashCode() : 0) == this.f4846b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    public final T b() {
        return this.f4845a;
    }
}
