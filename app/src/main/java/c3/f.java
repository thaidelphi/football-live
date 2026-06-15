package c3;

import c3.a;
import com.google.auto.value.AutoValue;
/* compiled from: BackendRequest.java */
@AutoValue
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class f {

    /* compiled from: BackendRequest.java */
    @AutoValue.Builder
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class a {
        public abstract f a();

        public abstract a b(Iterable<b3.i> iterable);

        public abstract a c(byte[] bArr);
    }

    public static a a() {
        return new a.b();
    }

    public abstract Iterable<b3.i> b();

    public abstract byte[] c();
}
