package u6;

import com.google.auto.value.AutoValue;
import u6.b;
/* compiled from: TokenResult.java */
@AutoValue
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class f {

    /* compiled from: TokenResult.java */
    @AutoValue.Builder
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class a {
        public abstract f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j10);
    }

    /* compiled from: TokenResult.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new b.C0364b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
