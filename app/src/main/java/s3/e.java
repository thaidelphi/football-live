package s3;

import a5.p0;
import com.google.protobuf.CodedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import n3.j1;
/* compiled from: DefaultExtractorInput.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e implements j {

    /* renamed from: b  reason: collision with root package name */
    private final z4.i f30699b;

    /* renamed from: c  reason: collision with root package name */
    private final long f30700c;

    /* renamed from: d  reason: collision with root package name */
    private long f30701d;

    /* renamed from: f  reason: collision with root package name */
    private int f30703f;

    /* renamed from: g  reason: collision with root package name */
    private int f30704g;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f30702e = new byte[65536];

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f30698a = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];

    static {
        j1.a("goog.exo.extractor");
    }

    public e(z4.i iVar, long j10, long j11) {
        this.f30699b = iVar;
        this.f30701d = j10;
        this.f30700c = j11;
    }

    private void o(int i10) {
        if (i10 != -1) {
            this.f30701d += i10;
        }
    }

    private void p(int i10) {
        int i11 = this.f30703f + i10;
        byte[] bArr = this.f30702e;
        if (i11 > bArr.length) {
            this.f30702e = Arrays.copyOf(this.f30702e, p0.q(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    private int q(byte[] bArr, int i10, int i11) {
        int i12 = this.f30704g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f30702e, 0, bArr, i10, min);
        u(min);
        return min;
    }

    private int r(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int b10 = this.f30699b.b(bArr, i10 + i12, i11 - i12);
            if (b10 == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + b10;
        }
        throw new InterruptedIOException();
    }

    private int s(int i10) {
        int min = Math.min(this.f30704g, i10);
        u(min);
        return min;
    }

    private void u(int i10) {
        int i11 = this.f30704g - i10;
        this.f30704g = i11;
        this.f30703f = 0;
        byte[] bArr = this.f30702e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f30702e = bArr2;
    }

    @Override // s3.j
    public long a() {
        return this.f30700c;
    }

    @Override // s3.j, z4.i
    public int b(byte[] bArr, int i10, int i11) throws IOException {
        int q10 = q(bArr, i10, i11);
        if (q10 == 0) {
            q10 = r(bArr, i10, i11, 0, true);
        }
        o(q10);
        return q10;
    }

    @Override // s3.j
    public boolean c(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (k(i11, z10)) {
            System.arraycopy(this.f30702e, this.f30703f - i11, bArr, i10, i11);
            return true;
        }
        return false;
    }

    @Override // s3.j
    public void e() {
        this.f30703f = 0;
    }

    @Override // s3.j
    public boolean f(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int q10 = q(bArr, i10, i11);
        while (q10 < i11 && q10 != -1) {
            q10 = r(bArr, i10, i11, q10, z10);
        }
        o(q10);
        return q10 != -1;
    }

    @Override // s3.j
    public long g() {
        return this.f30701d + this.f30703f;
    }

    @Override // s3.j
    public long getPosition() {
        return this.f30701d;
    }

    @Override // s3.j
    public void h(int i10) throws IOException {
        k(i10, false);
    }

    @Override // s3.j
    public void j(int i10) throws IOException {
        t(i10, false);
    }

    @Override // s3.j
    public boolean k(int i10, boolean z10) throws IOException {
        p(i10);
        int i11 = this.f30704g - this.f30703f;
        while (i11 < i10) {
            i11 = r(this.f30702e, this.f30703f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f30704g = this.f30703f + i11;
        }
        this.f30703f += i10;
        return true;
    }

    @Override // s3.j
    public void n(byte[] bArr, int i10, int i11) throws IOException {
        c(bArr, i10, i11, false);
    }

    @Override // s3.j
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        f(bArr, i10, i11, false);
    }

    public boolean t(int i10, boolean z10) throws IOException {
        int s10 = s(i10);
        while (s10 < i10 && s10 != -1) {
            s10 = r(this.f30698a, -s10, Math.min(i10, this.f30698a.length + s10), s10, z10);
        }
        o(s10);
        return s10 != -1;
    }
}
