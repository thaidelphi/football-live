package x6;

import com.google.firebase.messaging.g0;
import m6.d;
/* compiled from: MessagingClientEventExtension.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final b f32803b = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final x6.a f32804a;

    /* compiled from: MessagingClientEventExtension.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private x6.a f32805a = null;

        a() {
        }

        public b a() {
            return new b(this.f32805a);
        }

        public a b(x6.a aVar) {
            this.f32805a = aVar;
            return this;
        }
    }

    b(x6.a aVar) {
        this.f32804a = aVar;
    }

    public static a b() {
        return new a();
    }

    @d(tag = 1)
    public x6.a a() {
        return this.f32804a;
    }

    public byte[] c() {
        return g0.a(this);
    }
}
