package s2;
/* compiled from: MultiClassKey.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private Class<?> f30655a;

    /* renamed from: b  reason: collision with root package name */
    private Class<?> f30656b;

    /* renamed from: c  reason: collision with root package name */
    private Class<?> f30657c;

    public i() {
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f30655a = cls;
        this.f30656b = cls2;
        this.f30657c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f30655a.equals(iVar.f30655a) && this.f30656b.equals(iVar.f30656b) && k.c(this.f30657c, iVar.f30657c);
    }

    public int hashCode() {
        int hashCode = ((this.f30655a.hashCode() * 31) + this.f30656b.hashCode()) * 31;
        Class<?> cls = this.f30657c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f30655a + ", second=" + this.f30656b + '}';
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }
}
