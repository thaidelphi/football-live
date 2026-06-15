package y5;

import java.util.NoSuchElementException;
/* compiled from: AbstractIterator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class b<T> extends s0<T> {

    /* renamed from: a  reason: collision with root package name */
    private EnumC0386b f33158a = EnumC0386b.NOT_READY;

    /* renamed from: b  reason: collision with root package name */
    private T f33159b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractIterator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f33160a;

        static {
            int[] iArr = new int[EnumC0386b.values().length];
            f33160a = iArr;
            try {
                iArr[EnumC0386b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33160a[EnumC0386b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractIterator.java */
    /* renamed from: y5.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum EnumC0386b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean c() {
        this.f33158a = EnumC0386b.FAILED;
        this.f33159b = a();
        if (this.f33158a != EnumC0386b.DONE) {
            this.f33158a = EnumC0386b.READY;
            return true;
        }
        return false;
    }

    protected abstract T a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final T b() {
        this.f33158a = EnumC0386b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        x5.g.n(this.f33158a != EnumC0386b.FAILED);
        int i10 = a.f33160a[this.f33158a.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return c();
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f33158a = EnumC0386b.NOT_READY;
            T t10 = (T) f0.a(this.f33159b);
            this.f33159b = null;
            return t10;
        }
        throw new NoSuchElementException();
    }
}
