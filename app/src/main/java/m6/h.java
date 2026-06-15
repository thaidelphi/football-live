package m6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import m6.h;
/* compiled from: ProtobufEncoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, j6.d<?>> f27778a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, j6.f<?>> f27779b;

    /* renamed from: c  reason: collision with root package name */
    private final j6.d<Object> f27780c;

    /* compiled from: ProtobufEncoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements k6.b<a> {

        /* renamed from: d  reason: collision with root package name */
        private static final j6.d<Object> f27781d = new j6.d() { // from class: m6.g
            @Override // j6.d
            public final void a(Object obj, Object obj2) {
                h.a.e(obj, (j6.e) obj2);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class<?>, j6.d<?>> f27782a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<Class<?>, j6.f<?>> f27783b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private j6.d<Object> f27784c = f27781d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, j6.e eVar) throws IOException {
            throw new j6.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f27782a), new HashMap(this.f27783b), this.f27784c);
        }

        public a d(k6.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // k6.b
        /* renamed from: f */
        public <U> a a(Class<U> cls, j6.d<? super U> dVar) {
            this.f27782a.put(cls, dVar);
            this.f27783b.remove(cls);
            return this;
        }
    }

    h(Map<Class<?>, j6.d<?>> map, Map<Class<?>, j6.f<?>> map2, j6.d<Object> dVar) {
        this.f27778a = map;
        this.f27779b = map2;
        this.f27780c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) throws IOException {
        new f(outputStream, this.f27778a, this.f27779b, this.f27780c).q(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
