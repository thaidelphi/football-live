package b3;

import b3.o;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: AutoValue_TransportContext.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class d extends o {

    /* renamed from: a  reason: collision with root package name */
    private final String f5041a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f5042b;

    /* renamed from: c  reason: collision with root package name */
    private final z2.d f5043c;

    /* compiled from: AutoValue_TransportContext.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private String f5044a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f5045b;

        /* renamed from: c  reason: collision with root package name */
        private z2.d f5046c;

        @Override // b3.o.a
        public o a() {
            String str = "";
            if (this.f5044a == null) {
                str = " backendName";
            }
            if (this.f5046c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f5044a, this.f5045b, this.f5046c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b3.o.a
        public o.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f5044a = str;
            return this;
        }

        @Override // b3.o.a
        public o.a c(byte[] bArr) {
            this.f5045b = bArr;
            return this;
        }

        @Override // b3.o.a
        public o.a d(z2.d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f5046c = dVar;
            return this;
        }
    }

    @Override // b3.o
    public String b() {
        return this.f5041a;
    }

    @Override // b3.o
    public byte[] c() {
        return this.f5042b;
    }

    @Override // b3.o
    public z2.d d() {
        return this.f5043c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f5041a.equals(oVar.b())) {
                if (Arrays.equals(this.f5042b, oVar instanceof d ? ((d) oVar).f5042b : oVar.c()) && this.f5043c.equals(oVar.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f5041a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5042b)) * 1000003) ^ this.f5043c.hashCode();
    }

    private d(String str, byte[] bArr, z2.d dVar) {
        this.f5041a = str;
        this.f5042b = bArr;
        this.f5043c = dVar;
    }
}
