package b3;

import b3.c;
import com.google.auto.value.AutoValue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SendRequest.java */
@AutoValue
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class n {

    /* compiled from: SendRequest.java */
    @AutoValue.Builder
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class a {
        public abstract n a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a b(z2.b bVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a c(z2.c<?> cVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a d(z2.e<?, byte[]> eVar);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract z2.b b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract z2.c<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract z2.e<?, byte[]> e();

    public abstract o f();

    public abstract String g();
}
