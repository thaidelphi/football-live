package l6;

import j6.f;
import j6.g;
import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* compiled from: JsonDataEncoderBuilder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class d implements k6.b<d> {

    /* renamed from: e  reason: collision with root package name */
    private static final j6.d<Object> f27529e = new j6.d() { // from class: l6.a
        @Override // j6.d
        public final void a(Object obj, Object obj2) {
            d.l(obj, (j6.e) obj2);
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private static final f<String> f27530f = new f() { // from class: l6.c
        @Override // j6.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).c((String) obj);
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private static final f<Boolean> f27531g = new f() { // from class: l6.b
        @Override // j6.f
        public final void a(Object obj, Object obj2) {
            d.n((Boolean) obj, (g) obj2);
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private static final b f27532h = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, j6.d<?>> f27533a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, f<?>> f27534b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private j6.d<Object> f27535c = f27529e;

    /* renamed from: d  reason: collision with root package name */
    private boolean f27536d = false;

    /* compiled from: JsonDataEncoderBuilder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements j6.a {
        a() {
        }

        @Override // j6.a
        public void a(Object obj, Writer writer) throws IOException {
            e eVar = new e(writer, d.this.f27533a, d.this.f27534b, d.this.f27535c, d.this.f27536d);
            eVar.h(obj, false);
            eVar.p();
        }
    }

    /* compiled from: JsonDataEncoderBuilder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class b implements f<Date> {

        /* renamed from: a  reason: collision with root package name */
        private static final DateFormat f27538a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f27538a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // j6.f
        /* renamed from: b */
        public void a(Date date, g gVar) throws IOException {
            gVar.c(f27538a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        p(String.class, f27530f);
        p(Boolean.class, f27531g);
        p(Date.class, f27532h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, j6.e eVar) throws IOException {
        throw new j6.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, g gVar) throws IOException {
        gVar.e(bool.booleanValue());
    }

    public j6.a i() {
        return new a();
    }

    public d j(k6.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z10) {
        this.f27536d = z10;
        return this;
    }

    @Override // k6.b
    /* renamed from: o */
    public <T> d a(Class<T> cls, j6.d<? super T> dVar) {
        this.f27533a.put(cls, dVar);
        this.f27534b.remove(cls);
        return this;
    }

    public <T> d p(Class<T> cls, f<? super T> fVar) {
        this.f27534b.put(cls, fVar);
        this.f27533a.remove(cls);
        return this;
    }
}
