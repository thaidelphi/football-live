package a2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import s2.k;
import t2.a;
/* compiled from: SafeKeyGenerator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final s2.g<w1.f, String> f231a = new s2.g<>(1000);

    /* renamed from: b  reason: collision with root package name */
    private final androidx.core.util.f<b> f232b = t2.a.d(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements a.d<b> {
        a() {
        }

        @Override // t2.a.d
        /* renamed from: b */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        final MessageDigest f234a;

        /* renamed from: b  reason: collision with root package name */
        private final t2.c f235b = t2.c.a();

        b(MessageDigest messageDigest) {
            this.f234a = messageDigest;
        }

        @Override // t2.a.f
        public t2.c d() {
            return this.f235b;
        }
    }

    private String a(w1.f fVar) {
        b bVar = (b) s2.j.d(this.f232b.b());
        try {
            fVar.b(bVar.f234a);
            return k.w(bVar.f234a.digest());
        } finally {
            this.f232b.a(bVar);
        }
    }

    public String b(w1.f fVar) {
        String g10;
        synchronized (this.f231a) {
            g10 = this.f231a.g(fVar);
        }
        if (g10 == null) {
            g10 = a(fVar);
        }
        synchronized (this.f231a) {
            this.f231a.k(fVar, g10);
        }
        return g10;
    }
}
