package b3;

import java.util.Arrays;
import java.util.Objects;
/* compiled from: EncodedPayload.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final z2.b f5061a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f5062b;

    public h(z2.b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f5061a = bVar;
        this.f5062b = bArr;
    }

    public byte[] a() {
        return this.f5062b;
    }

    public z2.b b() {
        return this.f5061a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f5061a.equals(hVar.f5061a)) {
                return Arrays.equals(this.f5062b, hVar.f5062b);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5061a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5062b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f5061a + ", bytes=[...]}";
    }
}
