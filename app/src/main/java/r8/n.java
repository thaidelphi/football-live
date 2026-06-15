package r8;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReadWrite.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class n implements a9.f<String> {

    /* renamed from: a  reason: collision with root package name */
    private final BufferedReader f30450a;

    /* compiled from: ReadWrite.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a implements Iterator<String> {

        /* renamed from: a  reason: collision with root package name */
        private String f30451a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f30452b;

        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            if (hasNext()) {
                String str = this.f30451a;
                this.f30451a = null;
                kotlin.jvm.internal.n.c(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f30451a == null && !this.f30452b) {
                String readLine = n.this.f30450a.readLine();
                this.f30451a = readLine;
                if (readLine == null) {
                    this.f30452b = true;
                }
            }
            return this.f30451a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n(BufferedReader reader) {
        kotlin.jvm.internal.n.f(reader, "reader");
        this.f30450a = reader;
    }

    @Override // a9.f
    public Iterator<String> iterator() {
        return new a();
    }
}
