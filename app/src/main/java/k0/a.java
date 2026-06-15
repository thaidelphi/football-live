package k0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.n;
/* compiled from: CreationExtras.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<b<?>, Object> f27115a = new LinkedHashMap();

    /* compiled from: CreationExtras.kt */
    /* renamed from: k0.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0305a extends a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0305a f27116b = new C0305a();

        private C0305a() {
        }

        @Override // k0.a
        public <T> T a(b<T> key) {
            n.f(key, "key");
            return null;
        }
    }

    /* compiled from: CreationExtras.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b<T> {
    }

    public abstract <T> T a(b<T> bVar);

    public final Map<b<?>, Object> b() {
        return this.f27115a;
    }
}
