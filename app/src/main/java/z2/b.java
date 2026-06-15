package z2;

import java.util.Objects;
/* compiled from: Encoding.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f33466a;

    private b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f33466a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f33466a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f33466a.equals(((b) obj).f33466a);
        }
        return false;
    }

    public int hashCode() {
        return this.f33466a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f33466a + "\"}";
    }
}
