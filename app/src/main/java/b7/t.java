package b7;

import java.io.IOException;
/* compiled from: TypeAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class t<T> {

    /* compiled from: TypeAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends t<T> {
        a() {
        }

        @Override // b7.t
        public T b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            return (T) t.this.b(aVar);
        }

        @Override // b7.t
        public void d(h7.c cVar, T t10) throws IOException {
            if (t10 == null) {
                cVar.K();
            } else {
                t.this.d(cVar, t10);
            }
        }
    }

    public final t<T> a() {
        return new a();
    }

    public abstract T b(h7.a aVar) throws IOException;

    public final j c(T t10) {
        try {
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            d(bVar, t10);
            return bVar.K0();
        } catch (IOException e8) {
            throw new k(e8);
        }
    }

    public abstract void d(h7.c cVar, T t10) throws IOException;
}
