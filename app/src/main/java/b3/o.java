package b3;

import android.util.Base64;
import b3.d;
import com.google.auto.value.AutoValue;
/* compiled from: TransportContext.java */
@AutoValue
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class o {

    /* compiled from: TransportContext.java */
    @AutoValue.Builder
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class a {
        public abstract o a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(z2.d dVar);
    }

    public static a a() {
        return new d.b().d(z2.d.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract z2.d d();

    public boolean e() {
        return c() != null;
    }

    public o f(z2.d dVar) {
        return a().b(b()).d(dVar).c(c()).a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
