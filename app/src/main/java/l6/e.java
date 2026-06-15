package l6;

import android.util.Base64;
import android.util.JsonWriter;
import j6.f;
import j6.g;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
/* compiled from: JsonValueObjectEncoderContext.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class e implements j6.e, g {

    /* renamed from: a  reason: collision with root package name */
    private e f27539a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f27540b = true;

    /* renamed from: c  reason: collision with root package name */
    private final JsonWriter f27541c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, j6.d<?>> f27542d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, f<?>> f27543e;

    /* renamed from: f  reason: collision with root package name */
    private final j6.d<Object> f27544f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f27545g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Writer writer, Map<Class<?>, j6.d<?>> map, Map<Class<?>, f<?>> map2, j6.d<Object> dVar, boolean z10) {
        this.f27541c = new JsonWriter(writer);
        this.f27542d = map;
        this.f27543e = map2;
        this.f27544f = dVar;
        this.f27545g = z10;
    }

    private boolean o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e r(String str, Object obj) throws IOException, j6.b {
        t();
        this.f27541c.name(str);
        if (obj == null) {
            this.f27541c.nullValue();
            return this;
        }
        return h(obj, false);
    }

    private e s(String str, Object obj) throws IOException, j6.b {
        if (obj == null) {
            return this;
        }
        t();
        this.f27541c.name(str);
        return h(obj, false);
    }

    private void t() throws IOException {
        if (this.f27540b) {
            e eVar = this.f27539a;
            if (eVar != null) {
                eVar.t();
                this.f27539a.f27540b = false;
                this.f27539a = null;
                this.f27541c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // j6.e
    public j6.e a(j6.c cVar, int i10) throws IOException {
        return j(cVar.b(), i10);
    }

    @Override // j6.e
    public j6.e b(j6.c cVar, long j10) throws IOException {
        return k(cVar.b(), j10);
    }

    @Override // j6.e
    public j6.e d(j6.c cVar, Object obj) throws IOException {
        return l(cVar.b(), obj);
    }

    public e f(int i10) throws IOException {
        t();
        this.f27541c.value(i10);
        return this;
    }

    public e g(long j10) throws IOException {
        t();
        this.f27541c.value(j10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e h(Object obj, boolean z10) throws IOException {
        int[] iArr;
        int i10 = 0;
        if (z10 && o(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new j6.b(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f27541c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f27541c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return n((byte[]) obj);
            }
            this.f27541c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i10 < length) {
                    this.f27541c.value(iArr[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    g(jArr[i10]);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    this.f27541c.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    this.f27541c.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    h(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    h(obj2, false);
                }
            }
            this.f27541c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f27541c.beginArray();
            for (Object obj3 : (Collection) obj) {
                h(obj3, false);
            }
            this.f27541c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f27541c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    l((String) key, entry.getValue());
                } catch (ClassCastException e8) {
                    throw new j6.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e8);
                }
            }
            this.f27541c.endObject();
            return this;
        } else {
            j6.d<?> dVar = this.f27542d.get(obj.getClass());
            if (dVar != null) {
                return q(dVar, obj, z10);
            }
            f<?> fVar = this.f27543e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                c(((Enum) obj).name());
                return this;
            } else {
                return q(this.f27544f, obj, z10);
            }
        }
    }

    @Override // j6.g
    /* renamed from: i */
    public e c(String str) throws IOException {
        t();
        this.f27541c.value(str);
        return this;
    }

    public e j(String str, int i10) throws IOException {
        t();
        this.f27541c.name(str);
        return f(i10);
    }

    public e k(String str, long j10) throws IOException {
        t();
        this.f27541c.name(str);
        return g(j10);
    }

    public e l(String str, Object obj) throws IOException {
        if (this.f27545g) {
            return s(str, obj);
        }
        return r(str, obj);
    }

    @Override // j6.g
    /* renamed from: m */
    public e e(boolean z10) throws IOException {
        t();
        this.f27541c.value(z10);
        return this;
    }

    public e n(byte[] bArr) throws IOException {
        t();
        if (bArr == null) {
            this.f27541c.nullValue();
        } else {
            this.f27541c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() throws IOException {
        t();
        this.f27541c.flush();
    }

    e q(j6.d<Object> dVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f27541c.beginObject();
        }
        dVar.a(obj, this);
        if (!z10) {
            this.f27541c.endObject();
        }
        return this;
    }
}
