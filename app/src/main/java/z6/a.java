package z6;

import java.util.Objects;
/* compiled from: AutoValue_LibraryVersion.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f33713a;

    /* renamed from: b  reason: collision with root package name */
    private final String f33714b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f33713a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f33714b = str2;
    }

    @Override // z6.f
    public String b() {
        return this.f33713a;
    }

    @Override // z6.f
    public String c() {
        return this.f33714b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f33713a.equals(fVar.b()) && this.f33714b.equals(fVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f33713a.hashCode() ^ 1000003) * 1000003) ^ this.f33714b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f33713a + ", version=" + this.f33714b + "}";
    }
}
