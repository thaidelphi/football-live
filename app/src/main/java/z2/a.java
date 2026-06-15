package z2;

import java.util.Objects;
/* compiled from: AutoValue_Event.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f33463a;

    /* renamed from: b  reason: collision with root package name */
    private final T f33464b;

    /* renamed from: c  reason: collision with root package name */
    private final d f33465c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Integer num, T t10, d dVar) {
        this.f33463a = num;
        Objects.requireNonNull(t10, "Null payload");
        this.f33464b = t10;
        Objects.requireNonNull(dVar, "Null priority");
        this.f33465c = dVar;
    }

    @Override // z2.c
    public Integer a() {
        return this.f33463a;
    }

    @Override // z2.c
    public T b() {
        return this.f33464b;
    }

    @Override // z2.c
    public d c() {
        return this.f33465c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            Integer num = this.f33463a;
            if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
                if (this.f33464b.equals(cVar.b()) && this.f33465c.equals(cVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f33463a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f33464b.hashCode()) * 1000003) ^ this.f33465c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f33463a + ", payload=" + this.f33464b + ", priority=" + this.f33465c + "}";
    }
}
