package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NioByteString.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class e0 extends ByteString.h {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f15416a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        this.f15416a = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private ByteBuffer c(int i10, int i11) {
        if (i10 >= this.f15416a.position() && i11 <= this.f15416a.limit() && i10 <= i11) {
            ByteBuffer slice = this.f15416a.slice();
            slice.position(i10 - this.f15416a.position());
            slice.limit(i11 - this.f15416a.position());
            return slice;
        }
        throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.ByteString.h
    public boolean a(ByteString byteString, int i10, int i11) {
        return substring(0, i11).equals(byteString.substring(i10, i11 + i10));
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.f15416a.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i10) {
        try {
            return this.f15416a.get(i10);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw e8;
        } catch (IndexOutOfBoundsException e10) {
            throw new ArrayIndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f15416a.slice());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer slice = this.f15416a.slice();
        slice.position(i10);
        slice.get(bArr, i11, i12);
    }

    @Override // com.google.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (size() != byteString.size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof e0) {
                return this.f15416a.equals(((e0) obj).f15416a);
            }
            if (obj instanceof l0) {
                return obj.equals(this);
            }
            return this.f15416a.equals(byteString.asReadOnlyByteBuffer());
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString
    public byte internalByteAt(int i10) {
        return byteAt(i10);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        return u0.s(this.f15416a);
    }

    @Override // com.google.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.f15416a, true);
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public int partialHash(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f15416a.get(i13);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public int partialIsValidUtf8(int i10, int i11, int i12) {
        return u0.v(i10, this.f15416a, i11, i12 + i11);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.f15416a.remaining();
    }

    @Override // com.google.protobuf.ByteString
    public ByteString substring(int i10, int i11) {
        try {
            return new e0(c(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw e8;
        } catch (IndexOutOfBoundsException e10) {
            throw new ArrayIndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    protected String toStringInternal(Charset charset) {
        byte[] byteArray;
        int i10;
        int length;
        if (this.f15416a.hasArray()) {
            byteArray = this.f15416a.array();
            i10 = this.f15416a.arrayOffset() + this.f15416a.position();
            length = this.f15416a.remaining();
        } else {
            byteArray = toByteArray();
            i10 = 0;
            length = byteArray.length;
        }
        return new String(byteArray, i10, length, charset);
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
        if (this.f15416a.hasArray()) {
            outputStream.write(this.f15416a.array(), this.f15416a.arrayOffset() + this.f15416a.position() + i10, i11);
            return;
        }
        e.g(c(i10, i11 + i10), outputStream);
    }

    /* compiled from: NioByteString.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f15417a;

        a() {
            this.f15417a = e0.this.f15416a.slice();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f15417a.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            ByteBuffer byteBuffer = (ByteBuffer) this.f15417a.mark();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f15417a.hasRemaining()) {
                return this.f15417a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                ByteBuffer byteBuffer = (ByteBuffer) this.f15417a.reset();
            } catch (InvalidMarkException e8) {
                throw new IOException(e8);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            if (this.f15417a.hasRemaining()) {
                int min = Math.min(i11, this.f15417a.remaining());
                this.f15417a.get(bArr, i10, min);
                return min;
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.ByteString
    public void writeTo(ByteOutput byteOutput) throws IOException {
        byteOutput.writeLazy(this.f15416a.slice());
    }
}
