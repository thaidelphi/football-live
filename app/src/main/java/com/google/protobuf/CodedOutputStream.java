package com.google.protobuf;

import com.google.protobuf.u0;
import com.ironsource.b9;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    com.google.protobuf.g wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = t0.J();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super(MESSAGE);
        }

        OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        OutOfSpaceException(Throwable th) {
            super(MESSAGE, th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class b extends CodedOutputStream {

        /* renamed from: a  reason: collision with root package name */
        final byte[] f15278a;

        /* renamed from: b  reason: collision with root package name */
        final int f15279b;

        /* renamed from: c  reason: collision with root package name */
        int f15280c;

        /* renamed from: d  reason: collision with root package name */
        int f15281d;

        b(int i10) {
            super();
            if (i10 >= 0) {
                byte[] bArr = new byte[Math.max(i10, 20)];
                this.f15278a = bArr;
                this.f15279b = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        final void a(byte b10) {
            byte[] bArr = this.f15278a;
            int i10 = this.f15280c;
            this.f15280c = i10 + 1;
            bArr[i10] = b10;
            this.f15281d++;
        }

        final void b(int i10) {
            byte[] bArr = this.f15278a;
            int i11 = this.f15280c;
            int i12 = i11 + 1;
            this.f15280c = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.f15280c = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.f15280c = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f15280c = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f15281d += 4;
        }

        final void c(long j10) {
            byte[] bArr = this.f15278a;
            int i10 = this.f15280c;
            int i11 = i10 + 1;
            this.f15280c = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i11 + 1;
            this.f15280c = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i12 + 1;
            this.f15280c = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i13 + 1;
            this.f15280c = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i14 + 1;
            this.f15280c = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            this.f15280c = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            this.f15280c = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f15280c = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f15281d += 8;
        }

        final void d(int i10) {
            if (i10 >= 0) {
                f(i10);
            } else {
                g(i10);
            }
        }

        final void e(int i10, int i11) {
            f(WireFormat.makeTag(i10, i11));
        }

        final void f(int i10) {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j10 = this.f15280c;
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f15278a;
                    int i11 = this.f15280c;
                    this.f15280c = i11 + 1;
                    t0.R(bArr, i11, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f15278a;
                int i12 = this.f15280c;
                this.f15280c = i12 + 1;
                t0.R(bArr2, i12, (byte) i10);
                this.f15281d += (int) (this.f15280c - j10);
                return;
            }
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f15278a;
                int i13 = this.f15280c;
                this.f15280c = i13 + 1;
                bArr3[i13] = (byte) ((i10 & 127) | 128);
                this.f15281d++;
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f15278a;
            int i14 = this.f15280c;
            this.f15280c = i14 + 1;
            bArr4[i14] = (byte) i10;
            this.f15281d++;
        }

        final void g(long j10) {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j11 = this.f15280c;
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f15278a;
                    int i10 = this.f15280c;
                    this.f15280c = i10 + 1;
                    t0.R(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f15278a;
                int i11 = this.f15280c;
                this.f15280c = i11 + 1;
                t0.R(bArr2, i11, (byte) j10);
                this.f15281d += (int) (this.f15280c - j11);
                return;
            }
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f15278a;
                int i12 = this.f15280c;
                this.f15280c = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                this.f15281d++;
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f15278a;
            int i13 = this.f15280c;
            this.f15280c = i13 + 1;
            bArr4[i13] = (byte) j10;
            this.f15281d++;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.f15281d;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class c extends CodedOutputStream {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f15282a;

        /* renamed from: b  reason: collision with root package name */
        private final int f15283b;

        /* renamed from: c  reason: collision with root package name */
        private final int f15284c;

        /* renamed from: d  reason: collision with root package name */
        private int f15285d;

        c(byte[] bArr, int i10, int i11) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) >= 0) {
                this.f15282a = bArr;
                this.f15283b = i10;
                this.f15285d = i10;
                this.f15284c = i12;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.f15285d - this.f15283b;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.f15284c - this.f15285d;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(byte b10) throws IOException {
            try {
                byte[] bArr = this.f15282a;
                int i10 = this.f15285d;
                this.f15285d = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15285d), Integer.valueOf(this.f15284c), 1), e8);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBool(int i10, boolean z10) throws IOException {
            writeTag(i10, 0);
            write(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytes(int i10, ByteString byteString) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32(int i10, int i11) throws IOException {
            writeTag(i10, 5);
            writeFixed32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i10) throws IOException {
            try {
                byte[] bArr = this.f15282a;
                int i11 = this.f15285d;
                int i12 = i11 + 1;
                this.f15285d = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                this.f15285d = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                this.f15285d = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f15285d = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15285d), Integer.valueOf(this.f15284c), 1), e8);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64(int i10, long j10) throws IOException {
            writeTag(i10, 1);
            writeFixed64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j10) throws IOException {
            try {
                byte[] bArr = this.f15282a;
                int i10 = this.f15285d;
                int i11 = i10 + 1;
                this.f15285d = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                this.f15285d = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                this.f15285d = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                this.f15285d = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                this.f15285d = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                this.f15285d = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                this.f15285d = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f15285d = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15285d), Integer.valueOf(this.f15284c), 1), e8);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessage(int i10, MessageLite messageLite) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            ByteBuffer byteBuffer2 = (ByteBuffer) duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) throws IOException {
            int i10 = this.f15285d;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int i11 = i10 + computeUInt32SizeNoTag2;
                    this.f15285d = i11;
                    int i12 = u0.i(str, this.f15282a, i11, spaceLeft());
                    this.f15285d = i10;
                    writeUInt32NoTag((i12 - i10) - computeUInt32SizeNoTag2);
                    this.f15285d = i12;
                } else {
                    writeUInt32NoTag(u0.k(str));
                    this.f15285d = u0.i(str, this.f15282a, this.f15285d, spaceLeft());
                }
            } catch (u0.d e8) {
                this.f15285d = i10;
                inefficientWriteStringNoTag(str, e8);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeUInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i10) throws IOException {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f15282a;
                    int i11 = this.f15285d;
                    this.f15285d = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15285d), Integer.valueOf(this.f15284c), 1), e8);
                }
            }
            byte[] bArr2 = this.f15282a;
            int i12 = this.f15285d;
            this.f15285d = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64(int i10, long j10) throws IOException {
            writeTag(i10, 0);
            writeUInt64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j10) throws IOException {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS && spaceLeft() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f15282a;
                    int i10 = this.f15285d;
                    this.f15285d = i10 + 1;
                    t0.R(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f15282a;
                int i11 = this.f15285d;
                this.f15285d = i11 + 1;
                t0.R(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f15282a;
                    int i12 = this.f15285d;
                    this.f15285d = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15285d), Integer.valueOf(this.f15284c), 1), e8);
                }
            }
            byte[] bArr4 = this.f15282a;
            int i13 = this.f15285d;
            this.f15285d = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        final void writeMessage(int i10, MessageLite messageLite, m0 m0Var) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(m0Var));
            m0Var.b(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream
        final void writeMessageNoTag(MessageLite messageLite, m0 m0Var) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(m0Var));
            m0Var.b(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f15282a, this.f15285d, i11);
                this.f15285d += i11;
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15285d), Integer.valueOf(this.f15284c), Integer.valueOf(i11)), e8);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f15282a, this.f15285d, remaining);
                this.f15285d += remaining;
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15285d), Integer.valueOf(this.f15284c), Integer.valueOf(remaining)), e8);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class d extends b {

        /* renamed from: e  reason: collision with root package name */
        private final ByteOutput f15286e;

        d(ByteOutput byteOutput, int i10) {
            super(i10);
            Objects.requireNonNull(byteOutput, "out");
            this.f15286e = byteOutput;
        }

        private void h() throws IOException {
            this.f15286e.write(this.f15278a, 0, this.f15280c);
            this.f15280c = 0;
        }

        private void i(int i10) throws IOException {
            if (this.f15279b - this.f15280c < i10) {
                h();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.f15280c > 0) {
                h();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b10) throws IOException {
            if (this.f15280c == this.f15279b) {
                h();
            }
            a(b10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i10, boolean z10) throws IOException {
            i(11);
            e(i10, 0);
            a(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i10, ByteString byteString) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i10, int i11) throws IOException {
            i(14);
            e(i10, 5);
            b(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i10) throws IOException {
            i(4);
            b(i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i10, long j10) throws IOException {
            i(18);
            e(i10, 1);
            c(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j10) throws IOException {
            i(8);
            c(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i10, int i11) throws IOException {
            i(20);
            e(i10, 0);
            d(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            flush();
            this.f15286e.writeLazy(bArr, i10, i11);
            this.f15281d += i11;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i10, MessageLite messageLite) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            ByteBuffer byteBuffer2 = (ByteBuffer) duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int length = str.length() * 3;
            int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i10 = computeUInt32SizeNoTag + length;
            int i11 = this.f15279b;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int i12 = u0.i(str, bArr, 0, length);
                writeUInt32NoTag(i12);
                writeLazy(bArr, 0, i12);
                return;
            }
            if (i10 > i11 - this.f15280c) {
                h();
            }
            int i13 = this.f15280c;
            try {
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int i14 = i13 + computeUInt32SizeNoTag2;
                    this.f15280c = i14;
                    int i15 = u0.i(str, this.f15278a, i14, this.f15279b - i14);
                    this.f15280c = i13;
                    int i16 = (i15 - i13) - computeUInt32SizeNoTag2;
                    f(i16);
                    this.f15280c = i15;
                    this.f15281d += i16;
                } else {
                    int k10 = u0.k(str);
                    f(k10);
                    this.f15280c = u0.i(str, this.f15278a, this.f15280c, k10);
                    this.f15281d += k10;
                }
            } catch (u0.d e8) {
                this.f15281d -= this.f15280c - i13;
                this.f15280c = i13;
                inefficientWriteStringNoTag(str, e8);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i10, int i11) throws IOException {
            i(20);
            e(i10, 0);
            f(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i10) throws IOException {
            i(5);
            f(i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i10, long j10) throws IOException {
            i(20);
            e(i10, 0);
            g(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j10) throws IOException {
            i(10);
            g(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i10, MessageLite messageLite, m0 m0Var) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite, m0Var);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, m0 m0Var) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(m0Var));
            m0Var.b(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            flush();
            this.f15286e.write(bArr, i10, i11);
            this.f15281d += i11;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            flush();
            int remaining = byteBuffer.remaining();
            this.f15286e.writeLazy(byteBuffer);
            this.f15281d += remaining;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            flush();
            int remaining = byteBuffer.remaining();
            this.f15286e.write(byteBuffer);
            this.f15281d += remaining;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class e extends c {

        /* renamed from: e  reason: collision with root package name */
        private final ByteBuffer f15287e;

        /* renamed from: f  reason: collision with root package name */
        private int f15288f;

        e(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f15287e = byteBuffer;
            this.f15288f = byteBuffer.position();
        }

        @Override // com.google.protobuf.CodedOutputStream.c, com.google.protobuf.CodedOutputStream
        public void flush() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f15287e.position(this.f15288f + getTotalBytesWritten());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class f extends b {

        /* renamed from: e  reason: collision with root package name */
        private final OutputStream f15289e;

        f(OutputStream outputStream, int i10) {
            super(i10);
            Objects.requireNonNull(outputStream, "out");
            this.f15289e = outputStream;
        }

        private void h() throws IOException {
            this.f15289e.write(this.f15278a, 0, this.f15280c);
            this.f15280c = 0;
        }

        private void i(int i10) throws IOException {
            if (this.f15279b - this.f15280c < i10) {
                h();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.f15280c > 0) {
                h();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b10) throws IOException {
            if (this.f15280c == this.f15279b) {
                h();
            }
            a(b10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i10, boolean z10) throws IOException {
            i(11);
            e(i10, 0);
            a(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i10, ByteString byteString) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i10, int i11) throws IOException {
            i(14);
            e(i10, 5);
            b(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i10) throws IOException {
            i(4);
            b(i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i10, long j10) throws IOException {
            i(18);
            e(i10, 1);
            c(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j10) throws IOException {
            i(8);
            c(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i10, int i11) throws IOException {
            i(20);
            e(i10, 0);
            d(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i10, MessageLite messageLite) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            ByteBuffer byteBuffer2 = (ByteBuffer) duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int k10;
            try {
                int length = str.length() * 3;
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i10 = computeUInt32SizeNoTag + length;
                int i11 = this.f15279b;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int i12 = u0.i(str, bArr, 0, length);
                    writeUInt32NoTag(i12);
                    writeLazy(bArr, 0, i12);
                    return;
                }
                if (i10 > i11 - this.f15280c) {
                    h();
                }
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i13 = this.f15280c;
                try {
                    if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                        int i14 = i13 + computeUInt32SizeNoTag2;
                        this.f15280c = i14;
                        int i15 = u0.i(str, this.f15278a, i14, this.f15279b - i14);
                        this.f15280c = i13;
                        k10 = (i15 - i13) - computeUInt32SizeNoTag2;
                        f(k10);
                        this.f15280c = i15;
                    } else {
                        k10 = u0.k(str);
                        f(k10);
                        this.f15280c = u0.i(str, this.f15278a, this.f15280c, k10);
                    }
                    this.f15281d += k10;
                } catch (u0.d e8) {
                    this.f15281d -= this.f15280c - i13;
                    this.f15280c = i13;
                    throw e8;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(e10);
                }
            } catch (u0.d e11) {
                inefficientWriteStringNoTag(str, e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i10, int i11) throws IOException {
            i(20);
            e(i10, 0);
            f(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i10) throws IOException {
            i(5);
            f(i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i10, long j10) throws IOException {
            i(20);
            e(i10, 0);
            g(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j10) throws IOException {
            i(10);
            g(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i10, MessageLite messageLite, m0 m0Var) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite, m0Var);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, m0 m0Var) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(m0Var));
            m0Var.b(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f15279b;
            int i13 = this.f15280c;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f15278a, i13, i11);
                this.f15280c += i11;
                this.f15281d += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f15278a, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f15280c = this.f15279b;
            this.f15281d += i14;
            h();
            if (i16 <= this.f15279b) {
                System.arraycopy(bArr, i15, this.f15278a, 0, i16);
                this.f15280c = i16;
            } else {
                this.f15289e.write(bArr, i15, i16);
            }
            this.f15281d += i16;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            int i10 = this.f15279b;
            int i11 = this.f15280c;
            if (i10 - i11 >= remaining) {
                byteBuffer.get(this.f15278a, i11, remaining);
                this.f15280c += remaining;
                this.f15281d += remaining;
                return;
            }
            int i12 = i10 - i11;
            byteBuffer.get(this.f15278a, i11, i12);
            int i13 = remaining - i12;
            this.f15280c = this.f15279b;
            this.f15281d += i12;
            h();
            while (true) {
                int i14 = this.f15279b;
                if (i13 > i14) {
                    byteBuffer.get(this.f15278a, 0, i14);
                    this.f15289e.write(this.f15278a, 0, this.f15279b);
                    int i15 = this.f15279b;
                    i13 -= i15;
                    this.f15281d += i15;
                } else {
                    byteBuffer.get(this.f15278a, 0, i13);
                    this.f15280c = i13;
                    this.f15281d += i13;
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class g extends CodedOutputStream {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f15290a;

        /* renamed from: b  reason: collision with root package name */
        private final ByteBuffer f15291b;

        /* renamed from: c  reason: collision with root package name */
        private final int f15292c;

        g(ByteBuffer byteBuffer) {
            super();
            this.f15290a = byteBuffer;
            this.f15291b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f15292c = byteBuffer.position();
        }

        private void a(String str) throws IOException {
            try {
                u0.j(str, this.f15291b);
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(e8);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f15290a.position(this.f15291b.position());
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.f15291b.position() - this.f15292c;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.f15291b.remaining();
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b10) throws IOException {
            try {
                this.f15291b.put(b10);
            } catch (BufferOverflowException e8) {
                throw new OutOfSpaceException(e8);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i10, boolean z10) throws IOException {
            writeTag(i10, 0);
            write(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i10, ByteString byteString) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i10, int i11) throws IOException {
            writeTag(i10, 5);
            writeFixed32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i10) throws IOException {
            try {
                this.f15291b.putInt(i10);
            } catch (BufferOverflowException e8) {
                throw new OutOfSpaceException(e8);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i10, long j10) throws IOException {
            writeTag(i10, 1);
            writeFixed64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j10) throws IOException {
            try {
                this.f15291b.putLong(j10);
            } catch (BufferOverflowException e8) {
                throw new OutOfSpaceException(e8);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i10, MessageLite messageLite) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            ByteBuffer byteBuffer2 = (ByteBuffer) duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int position = this.f15291b.position();
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int position2 = this.f15291b.position() + computeUInt32SizeNoTag2;
                    ByteBuffer byteBuffer = (ByteBuffer) this.f15291b.position(position2);
                    a(str);
                    int position3 = this.f15291b.position();
                    ByteBuffer byteBuffer2 = (ByteBuffer) this.f15291b.position(position);
                    writeUInt32NoTag(position3 - position2);
                    ByteBuffer byteBuffer3 = (ByteBuffer) this.f15291b.position(position3);
                } else {
                    writeUInt32NoTag(u0.k(str));
                    a(str);
                }
            } catch (u0.d e8) {
                ByteBuffer byteBuffer4 = (ByteBuffer) this.f15291b.position(position);
                inefficientWriteStringNoTag(str, e8);
            } catch (IllegalArgumentException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeUInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i10) throws IOException {
            while ((i10 & (-128)) != 0) {
                try {
                    this.f15291b.put((byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                } catch (BufferOverflowException e8) {
                    throw new OutOfSpaceException(e8);
                }
            }
            this.f15291b.put((byte) i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i10, long j10) throws IOException {
            writeTag(i10, 0);
            writeUInt64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j10) throws IOException {
            while (((-128) & j10) != 0) {
                try {
                    this.f15291b.put((byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                } catch (BufferOverflowException e8) {
                    throw new OutOfSpaceException(e8);
                }
            }
            this.f15291b.put((byte) j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            try {
                this.f15291b.put(bArr, i10, i11);
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(e8);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i10, MessageLite messageLite, m0 m0Var) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite, m0Var);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, m0 m0Var) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(m0Var));
            m0Var.b(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                this.f15291b.put(byteBuffer);
            } catch (BufferOverflowException e8) {
                throw new OutOfSpaceException(e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class h extends CodedOutputStream {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f15293a;

        /* renamed from: b  reason: collision with root package name */
        private final ByteBuffer f15294b;

        /* renamed from: c  reason: collision with root package name */
        private final long f15295c;

        /* renamed from: d  reason: collision with root package name */
        private final long f15296d;

        /* renamed from: e  reason: collision with root package name */
        private final long f15297e;

        /* renamed from: f  reason: collision with root package name */
        private final long f15298f;

        /* renamed from: g  reason: collision with root package name */
        private long f15299g;

        h(ByteBuffer byteBuffer) {
            super();
            this.f15293a = byteBuffer;
            this.f15294b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long k10 = t0.k(byteBuffer);
            this.f15295c = k10;
            long position = byteBuffer.position() + k10;
            this.f15296d = position;
            long limit = k10 + byteBuffer.limit();
            this.f15297e = limit;
            this.f15298f = limit - 10;
            this.f15299g = position;
        }

        private int a(long j10) {
            return (int) (j10 - this.f15295c);
        }

        static boolean b() {
            return t0.K();
        }

        private void c(long j10) {
            ByteBuffer byteBuffer = (ByteBuffer) this.f15294b.position(a(j10));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f15293a.position(a(this.f15299g));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.f15299g - this.f15296d);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.f15297e - this.f15299g);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b10) throws IOException {
            long j10 = this.f15299g;
            if (j10 < this.f15297e) {
                this.f15299g = 1 + j10;
                t0.Q(j10, b10);
                return;
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f15299g), Long.valueOf(this.f15297e), 1));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i10, boolean z10) throws IOException {
            writeTag(i10, 0);
            write(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i10, ByteString byteString) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i10, int i11) throws IOException {
            writeTag(i10, 5);
            writeFixed32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i10) throws IOException {
            this.f15294b.putInt(a(this.f15299g), i10);
            this.f15299g += 4;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i10, long j10) throws IOException {
            writeTag(i10, 1);
            writeFixed64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j10) throws IOException {
            this.f15294b.putLong(a(this.f15299g), j10);
            this.f15299g += 8;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i10, MessageLite messageLite) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            ByteBuffer byteBuffer2 = (ByteBuffer) duplicate.clear();
            write(duplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            long j10 = this.f15299g;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int a10 = a(this.f15299g) + computeUInt32SizeNoTag2;
                    ByteBuffer byteBuffer = (ByteBuffer) this.f15294b.position(a10);
                    u0.j(str, this.f15294b);
                    int position = this.f15294b.position() - a10;
                    writeUInt32NoTag(position);
                    this.f15299g += position;
                } else {
                    int k10 = u0.k(str);
                    writeUInt32NoTag(k10);
                    c(this.f15299g);
                    u0.j(str, this.f15294b);
                    this.f15299g += k10;
                }
            } catch (u0.d e8) {
                this.f15299g = j10;
                c(j10);
                inefficientWriteStringNoTag(str, e8);
            } catch (IllegalArgumentException e10) {
                throw new OutOfSpaceException(e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeUInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i10) throws IOException {
            if (this.f15299g <= this.f15298f) {
                while ((i10 & (-128)) != 0) {
                    long j10 = this.f15299g;
                    this.f15299g = j10 + 1;
                    t0.Q(j10, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                long j11 = this.f15299g;
                this.f15299g = 1 + j11;
                t0.Q(j11, (byte) i10);
                return;
            }
            while (true) {
                long j12 = this.f15299g;
                if (j12 >= this.f15297e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f15299g), Long.valueOf(this.f15297e), 1));
                }
                if ((i10 & (-128)) == 0) {
                    this.f15299g = 1 + j12;
                    t0.Q(j12, (byte) i10);
                    return;
                }
                this.f15299g = j12 + 1;
                t0.Q(j12, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i10, long j10) throws IOException {
            writeTag(i10, 0);
            writeUInt64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j10) throws IOException {
            if (this.f15299g <= this.f15298f) {
                while ((j10 & (-128)) != 0) {
                    long j11 = this.f15299g;
                    this.f15299g = j11 + 1;
                    t0.Q(j11, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                long j12 = this.f15299g;
                this.f15299g = 1 + j12;
                t0.Q(j12, (byte) j10);
                return;
            }
            while (true) {
                long j13 = this.f15299g;
                if (j13 >= this.f15297e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f15299g), Long.valueOf(this.f15297e), 1));
                }
                if ((j10 & (-128)) == 0) {
                    this.f15299g = 1 + j13;
                    t0.Q(j13, (byte) j10);
                    return;
                }
                this.f15299g = j13 + 1;
                t0.Q(j13, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i10, MessageLite messageLite, m0 m0Var) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite, m0Var);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, m0 m0Var) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(m0Var));
            m0Var.b(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            if (bArr != null && i10 >= 0 && i11 >= 0 && bArr.length - i11 >= i10) {
                long j10 = i11;
                long j11 = this.f15299g;
                if (this.f15297e - j10 >= j11) {
                    t0.q(bArr, i10, j11, j10);
                    this.f15299g += j10;
                    return;
                }
            }
            Objects.requireNonNull(bArr, b9.h.X);
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f15299g), Long.valueOf(this.f15297e), Integer.valueOf(i11)));
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                int remaining = byteBuffer.remaining();
                c(this.f15299g);
                this.f15294b.put(byteBuffer);
                this.f15299g += remaining;
            } catch (BufferOverflowException e8) {
                throw new OutOfSpaceException(e8);
            }
        }
    }

    public static int computeBoolSize(int i10, boolean z10) {
        return computeTagSize(i10) + computeBoolSizeNoTag(z10);
    }

    public static int computeBoolSizeNoTag(boolean z10) {
        return 1;
    }

    public static int computeByteArraySize(int i10, byte[] bArr) {
        return computeTagSize(i10) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i10, ByteBuffer byteBuffer) {
        return computeTagSize(i10) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i10, ByteString byteString) {
        return computeTagSize(i10) + computeBytesSizeNoTag(byteString);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeDoubleSize(int i10, double d10) {
        return computeTagSize(i10) + computeDoubleSizeNoTag(d10);
    }

    public static int computeDoubleSizeNoTag(double d10) {
        return 8;
    }

    public static int computeEnumSize(int i10, int i11) {
        return computeTagSize(i10) + computeEnumSizeNoTag(i11);
    }

    public static int computeEnumSizeNoTag(int i10) {
        return computeInt32SizeNoTag(i10);
    }

    public static int computeFixed32Size(int i10, int i11) {
        return computeTagSize(i10) + computeFixed32SizeNoTag(i11);
    }

    public static int computeFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeFixed64Size(int i10, long j10) {
        return computeTagSize(i10) + computeFixed64SizeNoTag(j10);
    }

    public static int computeFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeFloatSize(int i10, float f10) {
        return computeTagSize(i10) + computeFloatSizeNoTag(f10);
    }

    public static int computeFloatSizeNoTag(float f10) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i10, MessageLite messageLite) {
        return (computeTagSize(i10) * 2) + messageLite.getSerializedSize();
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i10, int i11) {
        return computeTagSize(i10) + computeInt32SizeNoTag(i11);
    }

    public static int computeInt32SizeNoTag(int i10) {
        if (i10 >= 0) {
            return computeUInt32SizeNoTag(i10);
        }
        return 10;
    }

    public static int computeInt64Size(int i10, long j10) {
        return computeTagSize(i10) + computeInt64SizeNoTag(j10);
    }

    public static int computeInt64SizeNoTag(long j10) {
        return computeUInt64SizeNoTag(j10);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i10, LazyFieldLite lazyFieldLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i10) + computeLazyFieldSize(3, lazyFieldLite);
    }

    public static int computeLazyFieldSize(int i10, LazyFieldLite lazyFieldLite) {
        return computeTagSize(i10) + computeLazyFieldSizeNoTag(lazyFieldLite);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeLengthDelimitedFieldSize(int i10) {
        return computeUInt32SizeNoTag(i10) + i10;
    }

    public static int computeMessageSetExtensionSize(int i10, MessageLite messageLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i10) + computeMessageSize(3, messageLite);
    }

    public static int computeMessageSize(int i10, MessageLite messageLite) {
        return computeTagSize(i10) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computePreferredBufferSize(int i10) {
        return i10 > 4096 ? DEFAULT_BUFFER_SIZE : i10;
    }

    public static int computeRawMessageSetExtensionSize(int i10, ByteString byteString) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i10) + computeBytesSize(3, byteString);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i10) {
        return computeUInt32SizeNoTag(i10);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j10) {
        return computeUInt64SizeNoTag(j10);
    }

    public static int computeSFixed32Size(int i10, int i11) {
        return computeTagSize(i10) + computeSFixed32SizeNoTag(i11);
    }

    public static int computeSFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeSFixed64Size(int i10, long j10) {
        return computeTagSize(i10) + computeSFixed64SizeNoTag(j10);
    }

    public static int computeSFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeSInt32Size(int i10, int i11) {
        return computeTagSize(i10) + computeSInt32SizeNoTag(i11);
    }

    public static int computeSInt32SizeNoTag(int i10) {
        return computeUInt32SizeNoTag(encodeZigZag32(i10));
    }

    public static int computeSInt64Size(int i10, long j10) {
        return computeTagSize(i10) + computeSInt64SizeNoTag(j10);
    }

    public static int computeSInt64SizeNoTag(long j10) {
        return computeUInt64SizeNoTag(encodeZigZag64(j10));
    }

    public static int computeStringSize(int i10, String str) {
        return computeTagSize(i10) + computeStringSizeNoTag(str);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = u0.k(str);
        } catch (u0.d unused) {
            length = str.getBytes(Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i10) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(i10, 0));
    }

    public static int computeUInt32Size(int i10, int i11) {
        return computeTagSize(i10) + computeUInt32SizeNoTag(i11);
    }

    public static int computeUInt32SizeNoTag(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i10, long j10) {
        return computeTagSize(i10) + computeUInt64SizeNoTag(j10);
    }

    public static int computeUInt64SizeNoTag(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int encodeZigZag32(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long encodeZigZag64(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, (int) DEFAULT_BUFFER_SIZE);
    }

    static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new g(byteBuffer);
    }

    static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new h(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    final void inefficientWriteStringNoTag(String str, u0.d dVar) throws IOException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e8) {
            throw new OutOfSpaceException(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte b10) throws IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeBool(int i10, boolean z10) throws IOException;

    public final void writeBoolNoTag(boolean z10) throws IOException {
        write(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i10, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    abstract void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i10, ByteString byteString) throws IOException;

    public abstract void writeBytesNoTag(ByteString byteString) throws IOException;

    public final void writeDouble(int i10, double d10) throws IOException {
        writeFixed64(i10, Double.doubleToRawLongBits(d10));
    }

    public final void writeDoubleNoTag(double d10) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d10));
    }

    public final void writeEnum(int i10, int i11) throws IOException {
        writeInt32(i10, i11);
    }

    public final void writeEnumNoTag(int i10) throws IOException {
        writeInt32NoTag(i10);
    }

    public abstract void writeFixed32(int i10, int i11) throws IOException;

    public abstract void writeFixed32NoTag(int i10) throws IOException;

    public abstract void writeFixed64(int i10, long j10) throws IOException;

    public abstract void writeFixed64NoTag(long j10) throws IOException;

    public final void writeFloat(int i10, float f10) throws IOException {
        writeFixed32(i10, Float.floatToRawIntBits(f10));
    }

    public final void writeFloatNoTag(float f10) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void writeGroup(int i10, MessageLite messageLite) throws IOException {
        writeTag(i10, 3);
        writeGroupNoTag(messageLite);
        writeTag(i10, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    public abstract void writeInt32(int i10, int i11) throws IOException;

    public abstract void writeInt32NoTag(int i10) throws IOException;

    public final void writeInt64(int i10, long j10) throws IOException {
        writeUInt64(i10, j10);
    }

    public final void writeInt64NoTag(long j10) throws IOException {
        writeUInt64NoTag(j10);
    }

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeMessage(int i10, MessageLite messageLite) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void writeMessage(int i10, MessageLite messageLite, m0 m0Var) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite) throws IOException;

    abstract void writeMessageNoTag(MessageLite messageLite, m0 m0Var) throws IOException;

    public abstract void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException;

    public final void writeRawByte(byte b10) throws IOException {
        write(b10);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i10) throws IOException {
        writeFixed32NoTag(i10);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j10) throws IOException {
        writeFixed64NoTag(j10);
    }

    public abstract void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException;

    @Deprecated
    public final void writeRawVarint32(int i10) throws IOException {
        writeUInt32NoTag(i10);
    }

    @Deprecated
    public final void writeRawVarint64(long j10) throws IOException {
        writeUInt64NoTag(j10);
    }

    public final void writeSFixed32(int i10, int i11) throws IOException {
        writeFixed32(i10, i11);
    }

    public final void writeSFixed32NoTag(int i10) throws IOException {
        writeFixed32NoTag(i10);
    }

    public final void writeSFixed64(int i10, long j10) throws IOException {
        writeFixed64(i10, j10);
    }

    public final void writeSFixed64NoTag(long j10) throws IOException {
        writeFixed64NoTag(j10);
    }

    public final void writeSInt32(int i10, int i11) throws IOException {
        writeUInt32(i10, encodeZigZag32(i11));
    }

    public final void writeSInt32NoTag(int i10) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i10));
    }

    public final void writeSInt64(int i10, long j10) throws IOException {
        writeUInt64(i10, encodeZigZag64(j10));
    }

    public final void writeSInt64NoTag(long j10) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j10));
    }

    public abstract void writeString(int i10, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i10, int i11) throws IOException;

    public abstract void writeUInt32(int i10, int i11) throws IOException;

    public abstract void writeUInt32NoTag(int i10) throws IOException;

    public abstract void writeUInt64(int i10, long j10) throws IOException;

    public abstract void writeUInt64NoTag(long j10) throws IOException;

    private CodedOutputStream() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int computeGroupSize(int i10, MessageLite messageLite, m0 m0Var) {
        return (computeTagSize(i10) * 2) + computeGroupSizeNoTag(messageLite, m0Var);
    }

    @Deprecated
    static int computeGroupSizeNoTag(MessageLite messageLite, m0 m0Var) {
        return ((AbstractMessageLite) messageLite).getSerializedSize(m0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeMessageSize(int i10, MessageLite messageLite, m0 m0Var) {
        return computeTagSize(i10) + computeMessageSizeNoTag(messageLite, m0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeMessageSizeNoTag(MessageLite messageLite, m0 m0Var) {
        return computeLengthDelimitedFieldSize(((AbstractMessageLite) messageLite).getSerializedSize(m0Var));
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i10) {
        return new f(outputStream, i10);
    }

    @Deprecated
    final void writeGroupNoTag(MessageLite messageLite, m0 m0Var) throws IOException {
        m0Var.b(messageLite, this.wrapper);
    }

    public final void writeRawByte(int i10) throws IOException {
        write((byte) i10);
    }

    public final void writeRawBytes(byte[] bArr, int i10, int i11) throws IOException {
        write(bArr, i10, i11);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(ByteString byteString) throws IOException {
        byteString.writeTo(this);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final void writeGroup(int i10, MessageLite messageLite, m0 m0Var) throws IOException {
        writeTag(i10, 3);
        writeGroupNoTag(messageLite, m0Var);
        writeTag(i10, 4);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new e(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (h.b()) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i10) {
        return newInstance(byteBuffer);
    }

    static CodedOutputStream newInstance(ByteOutput byteOutput, int i10) {
        if (i10 >= 0) {
            return new d(byteOutput, i10);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
