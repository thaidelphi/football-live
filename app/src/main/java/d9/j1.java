package d9;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class j1 implements u1 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f24471a;

    public j1(boolean z10) {
        this.f24471a = z10;
    }

    @Override // d9.u1
    public l2 b() {
        return null;
    }

    @Override // d9.u1
    public boolean isActive() {
        return this.f24471a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
