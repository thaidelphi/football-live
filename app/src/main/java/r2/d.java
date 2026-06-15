package r2;

import java.security.MessageDigest;
import s2.j;
import w1.f;
/* compiled from: ObjectKey.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d implements f {

    /* renamed from: b  reason: collision with root package name */
    private final Object f30350b;

    public d(Object obj) {
        this.f30350b = j.d(obj);
    }

    @Override // w1.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(this.f30350b.toString().getBytes(f.f31964a));
    }

    @Override // w1.f
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f30350b.equals(((d) obj).f30350b);
        }
        return false;
    }

    @Override // w1.f
    public int hashCode() {
        return this.f30350b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f30350b + '}';
    }
}
