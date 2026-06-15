package c3;

import c3.f;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: AutoValue_BackendRequest.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Iterable<b3.i> f5415a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f5416b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_BackendRequest.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private Iterable<b3.i> f5417a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f5418b;

        @Override // c3.f.a
        public f a() {
            String str = "";
            if (this.f5417a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f5417a, this.f5418b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c3.f.a
        public f.a b(Iterable<b3.i> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f5417a = iterable;
            return this;
        }

        @Override // c3.f.a
        public f.a c(byte[] bArr) {
            this.f5418b = bArr;
            return this;
        }
    }

    @Override // c3.f
    public Iterable<b3.i> b() {
        return this.f5415a;
    }

    @Override // c3.f
    public byte[] c() {
        return this.f5416b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f5415a.equals(fVar.b())) {
                if (Arrays.equals(this.f5416b, fVar instanceof a ? ((a) fVar).f5416b : fVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5415a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5416b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f5415a + ", extras=" + Arrays.toString(this.f5416b) + "}";
    }

    private a(Iterable<b3.i> iterable, byte[] bArr) {
        this.f5415a = iterable;
        this.f5416b = bArr;
    }
}
