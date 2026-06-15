package g4;

import java.util.NoSuchElementException;
/* compiled from: MediaChunkIterator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f25787a = new a();

    /* compiled from: MediaChunkIterator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements o {
        a() {
        }

        @Override // g4.o
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // g4.o
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // g4.o
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
