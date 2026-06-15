package e3;

import b3.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ClientMetrics.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    private static final a f24927e = new C0271a().b();

    /* renamed from: a  reason: collision with root package name */
    private final f f24928a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f24929b;

    /* renamed from: c  reason: collision with root package name */
    private final b f24930c;

    /* renamed from: d  reason: collision with root package name */
    private final String f24931d;

    /* compiled from: ClientMetrics.java */
    /* renamed from: e3.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0271a {

        /* renamed from: a  reason: collision with root package name */
        private f f24932a = null;

        /* renamed from: b  reason: collision with root package name */
        private List<d> f24933b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private b f24934c = null;

        /* renamed from: d  reason: collision with root package name */
        private String f24935d = "";

        C0271a() {
        }

        public C0271a a(d dVar) {
            this.f24933b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f24932a, Collections.unmodifiableList(this.f24933b), this.f24934c, this.f24935d);
        }

        public C0271a c(String str) {
            this.f24935d = str;
            return this;
        }

        public C0271a d(b bVar) {
            this.f24934c = bVar;
            return this;
        }

        public C0271a e(f fVar) {
            this.f24932a = fVar;
            return this;
        }
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f24928a = fVar;
        this.f24929b = list;
        this.f24930c = bVar;
        this.f24931d = str;
    }

    public static C0271a e() {
        return new C0271a();
    }

    @m6.d(tag = 4)
    public String a() {
        return this.f24931d;
    }

    @m6.d(tag = 3)
    public b b() {
        return this.f24930c;
    }

    @m6.d(tag = 2)
    public List<d> c() {
        return this.f24929b;
    }

    @m6.d(tag = 1)
    public f d() {
        return this.f24928a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
