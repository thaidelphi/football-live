package a3;

import a3.e;
import com.google.auto.value.AutoValue;
/* compiled from: ClientInfo.java */
@AutoValue
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class k {

    /* compiled from: ClientInfo.java */
    @AutoValue.Builder
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class a {
        public abstract k a();

        public abstract a b(a3.a aVar);

        public abstract a c(b bVar);
    }

    /* compiled from: ClientInfo.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f339a;

        b(int i10) {
            this.f339a = i10;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract a3.a b();

    public abstract b c();
}
