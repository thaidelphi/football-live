package d7;

import b7.l;
import b7.n;
import b7.r;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
/* compiled from: Streams.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class j {
    public static b7.j a(h7.a aVar) throws n {
        boolean z10;
        try {
            try {
                aVar.C0();
                z10 = false;
            } catch (EOFException e8) {
                e = e8;
                z10 = true;
            }
            try {
                return TypeAdapters.X.b(aVar);
            } catch (EOFException e10) {
                e = e10;
                if (z10) {
                    return l.f5273a;
                }
                throw new r(e);
            }
        } catch (h7.d e11) {
            throw new r(e11);
        } catch (IOException e12) {
            throw new b7.k(e12);
        } catch (NumberFormatException e13) {
            throw new r(e13);
        }
    }

    public static void b(b7.j jVar, h7.c cVar) throws IOException {
        TypeAdapters.X.d(cVar, jVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* compiled from: Streams.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class a extends Writer {

        /* renamed from: a  reason: collision with root package name */
        private final Appendable f24392a;

        /* renamed from: b  reason: collision with root package name */
        private final C0265a f24393b = new C0265a();

        /* compiled from: Streams.java */
        /* renamed from: d7.j$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        static class C0265a implements CharSequence {

            /* renamed from: a  reason: collision with root package name */
            char[] f24394a;

            C0265a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f24394a[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f24394a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f24394a, i10, i11 - i10);
            }
        }

        a(Appendable appendable) {
            this.f24392a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            C0265a c0265a = this.f24393b;
            c0265a.f24394a = cArr;
            this.f24392a.append(c0265a, i10, i11 + i10);
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f24392a.append((char) i10);
        }
    }
}
