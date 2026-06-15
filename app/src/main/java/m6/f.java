package m6;

import com.ironsource.b9;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import m6.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProtobufDataEncoderContext.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class f implements j6.e {

    /* renamed from: f  reason: collision with root package name */
    private static final Charset f27767f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    private static final j6.c f27768g = j6.c.a(b9.h.W).b(m6.a.b().c(1).a()).a();

    /* renamed from: h  reason: collision with root package name */
    private static final j6.c f27769h = j6.c.a(b9.h.X).b(m6.a.b().c(2).a()).a();

    /* renamed from: i  reason: collision with root package name */
    private static final j6.d<Map.Entry<Object, Object>> f27770i = new j6.d() { // from class: m6.e
        @Override // j6.d
        public final void a(Object obj, Object obj2) {
            f.t((Map.Entry) obj, (j6.e) obj2);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private OutputStream f27771a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, j6.d<?>> f27772b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, j6.f<?>> f27773c;

    /* renamed from: d  reason: collision with root package name */
    private final j6.d<Object> f27774d;

    /* renamed from: e  reason: collision with root package name */
    private final i f27775e = new i(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProtobufDataEncoderContext.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27776a;

        static {
            int[] iArr = new int[d.a.values().length];
            f27776a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27776a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27776a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(OutputStream outputStream, Map<Class<?>, j6.d<?>> map, Map<Class<?>, j6.f<?>> map2, j6.d<Object> dVar) {
        this.f27771a = outputStream;
        this.f27772b = map;
        this.f27773c = map2;
        this.f27774d = dVar;
    }

    private static ByteBuffer m(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long n(j6.d<T> dVar, T t10) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f27771a;
            this.f27771a = bVar;
            dVar.a(t10, this);
            this.f27771a = outputStream;
            long a10 = bVar.a();
            bVar.close();
            return a10;
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private <T> f o(j6.d<T> dVar, j6.c cVar, T t10, boolean z10) throws IOException {
        long n10 = n(dVar, t10);
        if (z10 && n10 == 0) {
            return this;
        }
        u((s(cVar) << 3) | 2);
        v(n10);
        dVar.a(t10, this);
        return this;
    }

    private <T> f p(j6.f<T> fVar, j6.c cVar, T t10, boolean z10) throws IOException {
        this.f27775e.b(cVar, z10);
        fVar.a(t10, this.f27775e);
        return this;
    }

    private static d r(j6.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new j6.b("Field has no @Protobuf config");
    }

    private static int s(j6.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new j6.b("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(Map.Entry entry, j6.e eVar) throws IOException {
        eVar.d(f27768g, entry.getKey());
        eVar.d(f27769h, entry.getValue());
    }

    private void u(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f27771a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f27771a.write(i10 & 127);
    }

    private void v(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f27771a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f27771a.write(((int) j10) & 127);
    }

    @Override // j6.e
    public j6.e d(j6.c cVar, Object obj) throws IOException {
        return g(cVar, obj, true);
    }

    j6.e e(j6.c cVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        u((s(cVar) << 3) | 1);
        this.f27771a.write(m(8).putDouble(d10).array());
        return this;
    }

    j6.e f(j6.c cVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        u((s(cVar) << 3) | 5);
        this.f27771a.write(m(4).putFloat(f10).array());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j6.e g(j6.c cVar, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            u((s(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f27767f);
            u(bytes.length);
            this.f27771a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                g(cVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                o(f27770i, cVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return e(cVar, ((Double) obj).doubleValue(), z10);
        } else {
            if (obj instanceof Float) {
                return f(cVar, ((Float) obj).floatValue(), z10);
            }
            if (obj instanceof Number) {
                return k(cVar, ((Number) obj).longValue(), z10);
            }
            if (obj instanceof Boolean) {
                return l(cVar, ((Boolean) obj).booleanValue(), z10);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z10 && bArr.length == 0) {
                    return this;
                }
                u((s(cVar) << 3) | 2);
                u(bArr.length);
                this.f27771a.write(bArr);
                return this;
            }
            j6.d<?> dVar = this.f27772b.get(obj.getClass());
            if (dVar != null) {
                return o(dVar, cVar, obj, z10);
            }
            j6.f<?> fVar = this.f27773c.get(obj.getClass());
            if (fVar != null) {
                return p(fVar, cVar, obj, z10);
            }
            if (obj instanceof c) {
                return a(cVar, ((c) obj).getNumber());
            }
            if (obj instanceof Enum) {
                return a(cVar, ((Enum) obj).ordinal());
            }
            return o(this.f27774d, cVar, obj, z10);
        }
    }

    @Override // j6.e
    /* renamed from: h */
    public f a(j6.c cVar, int i10) throws IOException {
        return i(cVar, i10, true);
    }

    f i(j6.c cVar, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return this;
        }
        d r10 = r(cVar);
        int i11 = a.f27776a[r10.intEncoding().ordinal()];
        if (i11 == 1) {
            u(r10.tag() << 3);
            u(i10);
        } else if (i11 == 2) {
            u(r10.tag() << 3);
            u((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            u((r10.tag() << 3) | 5);
            this.f27771a.write(m(4).putInt(i10).array());
        }
        return this;
    }

    @Override // j6.e
    /* renamed from: j */
    public f b(j6.c cVar, long j10) throws IOException {
        return k(cVar, j10, true);
    }

    f k(j6.c cVar, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return this;
        }
        d r10 = r(cVar);
        int i10 = a.f27776a[r10.intEncoding().ordinal()];
        if (i10 == 1) {
            u(r10.tag() << 3);
            v(j10);
        } else if (i10 == 2) {
            u(r10.tag() << 3);
            v((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            u((r10.tag() << 3) | 1);
            this.f27771a.write(m(8).putLong(j10).array());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f l(j6.c cVar, boolean z10, boolean z11) throws IOException {
        return i(cVar, z10 ? 1 : 0, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f q(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        j6.d<?> dVar = this.f27772b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new j6.b("No encoder for " + obj.getClass());
    }
}
