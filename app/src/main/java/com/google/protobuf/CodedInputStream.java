package com.google.protobuf;

import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    f wrapper;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b extends CodedInputStream {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f15235a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f15236b;

        /* renamed from: c  reason: collision with root package name */
        private int f15237c;

        /* renamed from: d  reason: collision with root package name */
        private int f15238d;

        /* renamed from: e  reason: collision with root package name */
        private int f15239e;

        /* renamed from: f  reason: collision with root package name */
        private int f15240f;

        /* renamed from: g  reason: collision with root package name */
        private int f15241g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f15242h;

        /* renamed from: i  reason: collision with root package name */
        private int f15243i;

        private void a() {
            int i10 = this.f15237c + this.f15238d;
            this.f15237c = i10;
            int i11 = i10 - this.f15240f;
            int i12 = this.f15243i;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f15238d = i13;
                this.f15237c = i10 - i13;
                return;
            }
            this.f15238d = 0;
        }

        private void b() throws IOException {
            if (this.f15237c - this.f15239e >= 10) {
                c();
            } else {
                d();
            }
        }

        private void c() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f15235a;
                int i11 = this.f15239e;
                this.f15239e = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void d() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
            if (this.f15241g != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z10) {
            this.f15242h = z10;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i10 = this.f15243i;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.f15241g;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.f15239e - this.f15240f;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return this.f15239e == this.f15237c;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i10) {
            this.f15243i = i10;
            a();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0) {
                int totalBytesRead = i10 + getTotalBytesRead();
                if (totalBytesRead >= 0) {
                    int i11 = this.f15243i;
                    if (totalBytesRead <= i11) {
                        this.f15243i = totalBytesRead;
                        a();
                        return i11;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.parseFailure();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            ByteBuffer wrap;
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i10 = this.f15237c;
                int i11 = this.f15239e;
                if (readRawVarint32 <= i10 - i11) {
                    if (!this.f15236b && this.f15242h) {
                        wrap = ByteBuffer.wrap(this.f15235a, i11, readRawVarint32).slice();
                    } else {
                        wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f15235a, i11, i11 + readRawVarint32));
                    }
                    this.f15239e += readRawVarint32;
                    return wrap;
                }
            }
            if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            ByteString copyFrom;
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i10 = this.f15237c;
                int i11 = this.f15239e;
                if (readRawVarint32 <= i10 - i11) {
                    if (this.f15236b && this.f15242h) {
                        copyFrom = ByteString.wrap(this.f15235a, i11, readRawVarint32);
                    } else {
                        copyFrom = ByteString.copyFrom(this.f15235a, i11, readRawVarint32);
                    }
                    this.f15239e += readRawVarint32;
                    return copyFrom;
                }
            }
            if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            return ByteString.wrap(readRawBytes(readRawVarint32));
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i10, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            int i10 = this.f15239e;
            if (i10 != this.f15237c) {
                byte[] bArr = this.f15235a;
                this.f15239e = i10 + 1;
                return bArr[i10];
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i10) throws IOException {
            if (i10 > 0) {
                int i11 = this.f15237c;
                int i12 = this.f15239e;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f15239e = i13;
                    return Arrays.copyOfRange(this.f15235a, i12, i13);
                }
            }
            if (i10 <= 0) {
                if (i10 == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            int i10 = this.f15239e;
            if (this.f15237c - i10 >= 4) {
                byte[] bArr = this.f15235a;
                this.f15239e = i10 + 4;
                return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            int i10 = this.f15239e;
            if (this.f15237c - i10 >= 8) {
                byte[] bArr = this.f15235a;
                this.f15239e = i10 + 8;
                return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        @Override // com.google.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int readRawVarint32() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f15239e
                int r1 = r5.f15237c
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f15235a
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f15239e = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L70:
                r5.f15239e = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.b.readRawVarint32():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        @Override // com.google.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long readRawVarint64() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.b.readRawVarint64():long");
        }

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte readRawByte = readRawByte();
                j10 |= (readRawByte & Byte.MAX_VALUE) << i10;
                if ((readRawByte & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i10 = this.f15237c;
                int i11 = this.f15239e;
                if (readRawVarint32 <= i10 - i11) {
                    String str = new String(this.f15235a, i11, readRawVarint32, Internal.UTF_8);
                    this.f15239e += readRawVarint32;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i10 = this.f15237c;
                int i11 = this.f15239e;
                if (readRawVarint32 <= i10 - i11) {
                    String h10 = u0.h(this.f15235a, i11, readRawVarint32);
                    this.f15239e += readRawVarint32;
                    return h10;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.f15241g = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.f15241g = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.f15241g;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i10, MessageLite.Builder builder) throws IOException {
            readGroup(i10, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.f15240f = this.f15239e;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i10) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                b();
                return true;
            } else if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            } else if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            } else if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4));
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    skipRawBytes(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage() throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f15237c;
                int i12 = this.f15239e;
                if (i10 <= i11 - i12) {
                    this.f15239e = i12 + i10;
                    return;
                }
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f15243i = Integer.MAX_VALUE;
            this.f15235a = bArr;
            this.f15237c = i11 + i10;
            this.f15239e = i10;
            this.f15240f = i10;
            this.f15236b = z10;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i10, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i10, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i10, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            } else if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            } else if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            } else if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i10);
                skipMessage(codedOutputStream);
                int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeUInt32NoTag(i10);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return parsePartialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c extends CodedInputStream {

        /* renamed from: a  reason: collision with root package name */
        private final Iterable<ByteBuffer> f15244a;

        /* renamed from: b  reason: collision with root package name */
        private final Iterator<ByteBuffer> f15245b;

        /* renamed from: c  reason: collision with root package name */
        private ByteBuffer f15246c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f15247d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f15248e;

        /* renamed from: f  reason: collision with root package name */
        private int f15249f;

        /* renamed from: g  reason: collision with root package name */
        private int f15250g;

        /* renamed from: h  reason: collision with root package name */
        private int f15251h;

        /* renamed from: i  reason: collision with root package name */
        private int f15252i;

        /* renamed from: j  reason: collision with root package name */
        private int f15253j;

        /* renamed from: k  reason: collision with root package name */
        private int f15254k;

        /* renamed from: l  reason: collision with root package name */
        private long f15255l;

        /* renamed from: m  reason: collision with root package name */
        private long f15256m;

        /* renamed from: n  reason: collision with root package name */
        private long f15257n;

        /* renamed from: o  reason: collision with root package name */
        private long f15258o;

        private long a() {
            return this.f15258o - this.f15255l;
        }

        private void b() throws InvalidProtocolBufferException {
            if (this.f15245b.hasNext()) {
                h();
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        private void c(byte[] bArr, int i10, int i11) throws IOException {
            if (i11 < 0 || i11 > e()) {
                if (i11 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i11 != 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i12 = i11;
            while (i12 > 0) {
                if (a() == 0) {
                    b();
                }
                int min = Math.min(i12, (int) a());
                long j10 = min;
                t0.p(this.f15255l, bArr, (i11 - i12) + i10, j10);
                i12 -= min;
                this.f15255l += j10;
            }
        }

        private void d() {
            int i10 = this.f15249f + this.f15250g;
            this.f15249f = i10;
            int i11 = i10 - this.f15254k;
            int i12 = this.f15251h;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f15250g = i13;
                this.f15249f = i10 - i13;
                return;
            }
            this.f15250g = 0;
        }

        private int e() {
            return (int) (((this.f15249f - this.f15253j) - this.f15255l) + this.f15256m);
        }

        private void f() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer g(int i10, int i11) throws IOException {
            int position = this.f15246c.position();
            int limit = this.f15246c.limit();
            ByteBuffer byteBuffer = this.f15246c;
            try {
                try {
                    byteBuffer.position(i10);
                    byteBuffer.limit(i11);
                    return this.f15246c.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        private void h() {
            ByteBuffer next = this.f15245b.next();
            this.f15246c = next;
            this.f15253j += (int) (this.f15255l - this.f15256m);
            long position = next.position();
            this.f15255l = position;
            this.f15256m = position;
            this.f15258o = this.f15246c.limit();
            long k10 = t0.k(this.f15246c);
            this.f15257n = k10;
            this.f15255l += k10;
            this.f15256m += k10;
            this.f15258o += k10;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
            if (this.f15252i != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z10) {
            this.f15248e = z10;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i10 = this.f15251h;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.f15252i;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (((this.f15253j - this.f15254k) + this.f15255l) - this.f15256m);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return (((long) this.f15253j) + this.f15255l) - this.f15256m == ((long) this.f15249f);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i10) {
            this.f15251h = i10;
            d();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0) {
                int totalBytesRead = i10 + getTotalBytesRead();
                int i11 = this.f15251h;
                if (totalBytesRead <= i11) {
                    this.f15251h = totalBytesRead;
                    d();
                    return i11;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j10 = readRawVarint32;
                if (j10 <= a()) {
                    if (!this.f15247d && this.f15248e) {
                        long j11 = this.f15255l + j10;
                        this.f15255l = j11;
                        long j12 = this.f15257n;
                        return g((int) ((j11 - j12) - j10), (int) (j11 - j12));
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    t0.p(this.f15255l, bArr, 0L, j10);
                    this.f15255l += j10;
                    return ByteBuffer.wrap(bArr);
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= e()) {
                byte[] bArr2 = new byte[readRawVarint32];
                c(bArr2, 0, readRawVarint32);
                return ByteBuffer.wrap(bArr2);
            } else if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j10 = readRawVarint32;
                long j11 = this.f15258o;
                long j12 = this.f15255l;
                if (j10 <= j11 - j12) {
                    if (this.f15247d && this.f15248e) {
                        int i10 = (int) (j12 - this.f15257n);
                        ByteString wrap = ByteString.wrap(g(i10, readRawVarint32 + i10));
                        this.f15255l += j10;
                        return wrap;
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    t0.p(j12, bArr, 0L, j10);
                    this.f15255l += j10;
                    return ByteString.wrap(bArr);
                }
            }
            if (readRawVarint32 <= 0 || readRawVarint32 > e()) {
                if (readRawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (this.f15247d && this.f15248e) {
                ArrayList arrayList = new ArrayList();
                while (readRawVarint32 > 0) {
                    if (a() == 0) {
                        b();
                    }
                    int min = Math.min(readRawVarint32, (int) a());
                    int i11 = (int) (this.f15255l - this.f15257n);
                    arrayList.add(ByteString.wrap(g(i11, i11 + min)));
                    readRawVarint32 -= min;
                    this.f15255l += min;
                }
                return ByteString.copyFrom(arrayList);
            } else {
                byte[] bArr2 = new byte[readRawVarint32];
                c(bArr2, 0, readRawVarint32);
                return ByteString.wrap(bArr2);
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i10, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            if (a() == 0) {
                b();
            }
            long j10 = this.f15255l;
            this.f15255l = 1 + j10;
            return t0.x(j10);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i10) throws IOException {
            if (i10 >= 0) {
                long j10 = i10;
                if (j10 <= a()) {
                    byte[] bArr = new byte[i10];
                    t0.p(this.f15255l, bArr, 0L, j10);
                    this.f15255l += j10;
                    return bArr;
                }
            }
            if (i10 >= 0 && i10 <= e()) {
                byte[] bArr2 = new byte[i10];
                c(bArr2, 0, i10);
                return bArr2;
            } else if (i10 <= 0) {
                if (i10 == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            if (a() >= 4) {
                long j10 = this.f15255l;
                this.f15255l = 4 + j10;
                return ((t0.x(j10 + 3) & 255) << 24) | (t0.x(j10) & 255) | ((t0.x(1 + j10) & 255) << 8) | ((t0.x(2 + j10) & 255) << 16);
            }
            return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            long readRawByte;
            byte readRawByte2;
            if (a() >= 8) {
                long j10 = this.f15255l;
                this.f15255l = 8 + j10;
                readRawByte = (t0.x(j10) & 255) | ((t0.x(1 + j10) & 255) << 8) | ((t0.x(2 + j10) & 255) << 16) | ((t0.x(3 + j10) & 255) << 24) | ((t0.x(4 + j10) & 255) << 32) | ((t0.x(5 + j10) & 255) << 40) | ((t0.x(6 + j10) & 255) << 48);
                readRawByte2 = t0.x(j10 + 7);
            } else {
                readRawByte = (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48);
                readRawByte2 = readRawByte();
            }
            return ((readRawByte2 & 255) << 56) | readRawByte;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
            if (com.google.protobuf.t0.x(r4) < 0) goto L34;
         */
        @Override // com.google.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int readRawVarint32() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f15255l
                long r2 = r10.f15258o
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8a
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.t0.x(r0)
                if (r0 < 0) goto L1a
                long r4 = r10.f15255l
                long r4 = r4 + r2
                r10.f15255l = r4
                return r0
            L1a:
                long r6 = r10.f15258o
                long r8 = r10.f15255l
                long r6 = r6 - r8
                r8 = 10
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L26
                goto L8a
            L26:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.t0.x(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L34
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L90
            L34:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.t0.x(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L43
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L41:
                r6 = r4
                goto L90
            L43:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.t0.x(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L53
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L90
            L53:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.t0.x(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.t0.x(r4)
                if (r1 >= 0) goto L90
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.t0.x(r6)
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.t0.x(r4)
                if (r1 >= 0) goto L90
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.t0.x(r6)
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.t0.x(r4)
                if (r1 >= 0) goto L90
            L8a:
                long r0 = r10.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L90:
                r10.f15255l = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.c.readRawVarint32():int");
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
            long x10;
            long j10;
            long j11;
            int i10;
            long j12 = this.f15255l;
            if (this.f15258o != j12) {
                long j13 = j12 + 1;
                byte x11 = t0.x(j12);
                if (x11 >= 0) {
                    this.f15255l++;
                    return x11;
                } else if (this.f15258o - this.f15255l >= 10) {
                    long j14 = j13 + 1;
                    int x12 = x11 ^ (t0.x(j13) << 7);
                    if (x12 >= 0) {
                        long j15 = j14 + 1;
                        int x13 = x12 ^ (t0.x(j14) << 14);
                        if (x13 >= 0) {
                            x10 = x13 ^ 16256;
                        } else {
                            j14 = j15 + 1;
                            int x14 = x13 ^ (t0.x(j15) << 21);
                            if (x14 < 0) {
                                i10 = x14 ^ (-2080896);
                            } else {
                                j15 = j14 + 1;
                                long x15 = x14 ^ (t0.x(j14) << 28);
                                if (x15 < 0) {
                                    long j16 = j15 + 1;
                                    long x16 = x15 ^ (t0.x(j15) << 35);
                                    if (x16 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        j15 = j16 + 1;
                                        x15 = x16 ^ (t0.x(j16) << 42);
                                        if (x15 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            j16 = j15 + 1;
                                            x16 = x15 ^ (t0.x(j15) << 49);
                                            if (x16 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                j15 = j16 + 1;
                                                x10 = (x16 ^ (t0.x(j16) << 56)) ^ 71499008037633920L;
                                                if (x10 < 0) {
                                                    long j17 = 1 + j15;
                                                    if (t0.x(j15) >= 0) {
                                                        j14 = j17;
                                                        this.f15255l = j14;
                                                        return x10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    x10 = x16 ^ j10;
                                    j14 = j16;
                                    this.f15255l = j14;
                                    return x10;
                                }
                                j11 = 266354560;
                                x10 = x15 ^ j11;
                            }
                        }
                        j14 = j15;
                        this.f15255l = j14;
                        return x10;
                    }
                    i10 = x12 ^ (-128);
                    x10 = i10;
                    this.f15255l = j14;
                    return x10;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte readRawByte = readRawByte();
                j10 |= (readRawByte & Byte.MAX_VALUE) << i10;
                if ((readRawByte & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j10 = readRawVarint32;
                long j11 = this.f15258o;
                long j12 = this.f15255l;
                if (j10 <= j11 - j12) {
                    byte[] bArr = new byte[readRawVarint32];
                    t0.p(j12, bArr, 0L, j10);
                    String str = new String(bArr, Internal.UTF_8);
                    this.f15255l += j10;
                    return str;
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= e()) {
                byte[] bArr2 = new byte[readRawVarint32];
                c(bArr2, 0, readRawVarint32);
                return new String(bArr2, Internal.UTF_8);
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j10 = readRawVarint32;
                long j11 = this.f15258o;
                long j12 = this.f15255l;
                if (j10 <= j11 - j12) {
                    String g10 = u0.g(this.f15246c, (int) (j12 - this.f15256m), readRawVarint32);
                    this.f15255l += j10;
                    return g10;
                }
            }
            if (readRawVarint32 >= 0 && readRawVarint32 <= e()) {
                byte[] bArr = new byte[readRawVarint32];
                c(bArr, 0, readRawVarint32);
                return u0.h(bArr, 0, readRawVarint32);
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 <= 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.f15252i = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.f15252i = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.f15252i;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i10, MessageLite.Builder builder) throws IOException {
            readGroup(i10, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.f15254k = (int) ((this.f15253j + this.f15255l) - this.f15256m);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i10) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                f();
                return true;
            } else if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            } else if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            } else if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4));
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    skipRawBytes(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage() throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i10) throws IOException {
            if (i10 < 0 || i10 > ((this.f15249f - this.f15253j) - this.f15255l) + this.f15256m) {
                if (i10 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            while (i10 > 0) {
                if (a() == 0) {
                    b();
                }
                int min = Math.min(i10, (int) a());
                i10 -= min;
                this.f15255l += min;
            }
        }

        private c(Iterable<ByteBuffer> iterable, int i10, boolean z10) {
            super();
            this.f15251h = Integer.MAX_VALUE;
            this.f15249f = i10;
            this.f15244a = iterable;
            this.f15245b = iterable.iterator();
            this.f15247d = z10;
            this.f15253j = 0;
            this.f15254k = 0;
            if (i10 == 0) {
                this.f15246c = Internal.EMPTY_BYTE_BUFFER;
                this.f15255l = 0L;
                this.f15256m = 0L;
                this.f15258o = 0L;
                this.f15257n = 0L;
                return;
            }
            h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i10, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i10, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i10, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            } else if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            } else if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            } else if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i10);
                skipMessage(codedOutputStream);
                int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeUInt32NoTag(i10);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return parsePartialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class d extends CodedInputStream {

        /* renamed from: a  reason: collision with root package name */
        private final InputStream f15259a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f15260b;

        /* renamed from: c  reason: collision with root package name */
        private int f15261c;

        /* renamed from: d  reason: collision with root package name */
        private int f15262d;

        /* renamed from: e  reason: collision with root package name */
        private int f15263e;

        /* renamed from: f  reason: collision with root package name */
        private int f15264f;

        /* renamed from: g  reason: collision with root package name */
        private int f15265g;

        /* renamed from: h  reason: collision with root package name */
        private int f15266h;

        /* renamed from: i  reason: collision with root package name */
        private a f15267i;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public interface a {
            void a();
        }

        private static int a(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e8) {
                e8.setThrownFromInputStream();
                throw e8;
            }
        }

        private static int b(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (InvalidProtocolBufferException e8) {
                e8.setThrownFromInputStream();
                throw e8;
            }
        }

        private ByteString c(int i10) throws IOException {
            byte[] e8 = e(i10);
            if (e8 != null) {
                return ByteString.copyFrom(e8);
            }
            int i11 = this.f15263e;
            int i12 = this.f15261c;
            int i13 = i12 - i11;
            this.f15265g += i12;
            this.f15263e = 0;
            this.f15261c = 0;
            List<byte[]> f10 = f(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f15260b, i11, bArr, 0, i13);
            for (byte[] bArr2 : f10) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        private byte[] d(int i10, boolean z10) throws IOException {
            byte[] e8 = e(i10);
            if (e8 != null) {
                return z10 ? (byte[]) e8.clone() : e8;
            }
            int i11 = this.f15263e;
            int i12 = this.f15261c;
            int i13 = i12 - i11;
            this.f15265g += i12;
            this.f15263e = 0;
            this.f15261c = 0;
            List<byte[]> f10 = f(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f15260b, i11, bArr, 0, i13);
            for (byte[] bArr2 : f10) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        private byte[] e(int i10) throws IOException {
            if (i10 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            if (i10 >= 0) {
                int i11 = this.f15265g;
                int i12 = this.f15263e;
                int i13 = i11 + i12 + i10;
                if (i13 - this.sizeLimit <= 0) {
                    int i14 = this.f15266h;
                    if (i13 <= i14) {
                        int i15 = this.f15261c - i12;
                        int i16 = i10 - i15;
                        if (i16 < 4096 || i16 <= a(this.f15259a)) {
                            byte[] bArr = new byte[i10];
                            System.arraycopy(this.f15260b, this.f15263e, bArr, 0, i15);
                            this.f15265g += this.f15261c;
                            this.f15263e = 0;
                            this.f15261c = 0;
                            while (i15 < i10) {
                                int b10 = b(this.f15259a, bArr, i15, i10 - i15);
                                if (b10 != -1) {
                                    this.f15265g += b10;
                                    i15 += b10;
                                } else {
                                    throw InvalidProtocolBufferException.truncatedMessage();
                                }
                            }
                            return bArr;
                        }
                        return null;
                    }
                    skipRawBytes((i14 - i11) - i12);
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        private List<byte[]> f(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f15259a.read(bArr, i11, min - i11);
                    if (read != -1) {
                        this.f15265g += read;
                        i11 += read;
                    } else {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void g() {
            int i10 = this.f15261c + this.f15262d;
            this.f15261c = i10;
            int i11 = this.f15265g + i10;
            int i12 = this.f15266h;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f15262d = i13;
                this.f15261c = i10 - i13;
                return;
            }
            this.f15262d = 0;
        }

        private void h(int i10) throws IOException {
            if (n(i10)) {
                return;
            }
            if (i10 > (this.sizeLimit - this.f15265g) - this.f15263e) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        private static long i(InputStream inputStream, long j10) throws IOException {
            try {
                return inputStream.skip(j10);
            } catch (InvalidProtocolBufferException e8) {
                e8.setThrownFromInputStream();
                throw e8;
            }
        }

        private void j(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f15265g;
                int i12 = this.f15263e;
                int i13 = i11 + i12 + i10;
                int i14 = this.f15266h;
                if (i13 <= i14) {
                    int i15 = 0;
                    if (this.f15267i == null) {
                        this.f15265g = i11 + i12;
                        this.f15261c = 0;
                        this.f15263e = 0;
                        i15 = this.f15261c - i12;
                        while (i15 < i10) {
                            try {
                                long j10 = i10 - i15;
                                long i16 = i(this.f15259a, j10);
                                int i17 = (i16 > 0L ? 1 : (i16 == 0L ? 0 : -1));
                                if (i17 < 0 || i16 > j10) {
                                    throw new IllegalStateException(this.f15259a.getClass() + "#skip returned invalid result: " + i16 + "\nThe InputStream implementation is buggy.");
                                } else if (i17 == 0) {
                                    break;
                                } else {
                                    i15 += (int) i16;
                                }
                            } finally {
                                this.f15265g += i15;
                                g();
                            }
                        }
                    }
                    if (i15 >= i10) {
                        return;
                    }
                    int i18 = this.f15261c;
                    int i19 = i18 - this.f15263e;
                    this.f15263e = i18;
                    h(1);
                    while (true) {
                        int i20 = i10 - i19;
                        int i21 = this.f15261c;
                        if (i20 > i21) {
                            i19 += i21;
                            this.f15263e = i21;
                            h(1);
                        } else {
                            this.f15263e = i20;
                            return;
                        }
                    }
                } else {
                    skipRawBytes((i14 - i11) - i12);
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        private void k() throws IOException {
            if (this.f15261c - this.f15263e >= 10) {
                l();
            } else {
                m();
            }
        }

        private void l() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f15260b;
                int i11 = this.f15263e;
                this.f15263e = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void m() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private boolean n(int i10) throws IOException {
            int i11 = this.f15263e;
            if (i11 + i10 > this.f15261c) {
                int i12 = this.sizeLimit;
                int i13 = this.f15265g;
                if (i10 <= (i12 - i13) - i11 && i13 + i11 + i10 <= this.f15266h) {
                    a aVar = this.f15267i;
                    if (aVar != null) {
                        aVar.a();
                    }
                    int i14 = this.f15263e;
                    if (i14 > 0) {
                        int i15 = this.f15261c;
                        if (i15 > i14) {
                            byte[] bArr = this.f15260b;
                            System.arraycopy(bArr, i14, bArr, 0, i15 - i14);
                        }
                        this.f15265g += i14;
                        this.f15261c -= i14;
                        this.f15263e = 0;
                    }
                    InputStream inputStream = this.f15259a;
                    byte[] bArr2 = this.f15260b;
                    int i16 = this.f15261c;
                    int b10 = b(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.sizeLimit - this.f15265g) - i16));
                    if (b10 == 0 || b10 < -1 || b10 > this.f15260b.length) {
                        throw new IllegalStateException(this.f15259a.getClass() + "#read(byte[]) returned invalid result: " + b10 + "\nThe InputStream implementation is buggy.");
                    } else if (b10 > 0) {
                        this.f15261c += b10;
                        g();
                        if (this.f15261c >= i10) {
                            return true;
                        }
                        return n(i10);
                    } else {
                        return false;
                    }
                }
                return false;
            }
            throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
            if (this.f15264f != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z10) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i10 = this.f15266h;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - (this.f15265g + this.f15263e);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.f15264f;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.f15265g + this.f15263e;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return this.f15263e == this.f15261c && !n(1);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i10) {
            this.f15266h = i10;
            g();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0) {
                int i11 = i10 + this.f15265g + this.f15263e;
                int i12 = this.f15266h;
                if (i11 <= i12) {
                    this.f15266h = i11;
                    g();
                    return i12;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            int readRawVarint32 = readRawVarint32();
            int i10 = this.f15261c;
            int i11 = this.f15263e;
            if (readRawVarint32 <= i10 - i11 && readRawVarint32 > 0) {
                byte[] copyOfRange = Arrays.copyOfRange(this.f15260b, i11, i11 + readRawVarint32);
                this.f15263e += readRawVarint32;
                return copyOfRange;
            }
            return d(readRawVarint32, false);
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int readRawVarint32 = readRawVarint32();
            int i10 = this.f15261c;
            int i11 = this.f15263e;
            if (readRawVarint32 > i10 - i11 || readRawVarint32 <= 0) {
                if (readRawVarint32 == 0) {
                    return Internal.EMPTY_BYTE_BUFFER;
                }
                return ByteBuffer.wrap(d(readRawVarint32, true));
            }
            ByteBuffer wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f15260b, i11, i11 + readRawVarint32));
            this.f15263e += readRawVarint32;
            return wrap;
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int readRawVarint32 = readRawVarint32();
            int i10 = this.f15261c;
            int i11 = this.f15263e;
            if (readRawVarint32 > i10 - i11 || readRawVarint32 <= 0) {
                if (readRawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                return c(readRawVarint32);
            }
            ByteString copyFrom = ByteString.copyFrom(this.f15260b, i11, readRawVarint32);
            this.f15263e += readRawVarint32;
            return copyFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i10, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            if (this.f15263e == this.f15261c) {
                h(1);
            }
            byte[] bArr = this.f15260b;
            int i10 = this.f15263e;
            this.f15263e = i10 + 1;
            return bArr[i10];
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i10) throws IOException {
            int i11 = this.f15263e;
            if (i10 <= this.f15261c - i11 && i10 > 0) {
                int i12 = i10 + i11;
                this.f15263e = i12;
                return Arrays.copyOfRange(this.f15260b, i11, i12);
            }
            return d(i10, false);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            int i10 = this.f15263e;
            if (this.f15261c - i10 < 4) {
                h(4);
                i10 = this.f15263e;
            }
            byte[] bArr = this.f15260b;
            this.f15263e = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            int i10 = this.f15263e;
            if (this.f15261c - i10 < 8) {
                h(8);
                i10 = this.f15263e;
            }
            byte[] bArr = this.f15260b;
            this.f15263e = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        @Override // com.google.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int readRawVarint32() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f15263e
                int r1 = r5.f15261c
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f15260b
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f15263e = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L70:
                r5.f15263e = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.d.readRawVarint32():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        @Override // com.google.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long readRawVarint64() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.d.readRawVarint64():long");
        }

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte readRawByte = readRawByte();
                j10 |= (readRawByte & Byte.MAX_VALUE) << i10;
                if ((readRawByte & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i10 = this.f15261c;
                int i11 = this.f15263e;
                if (readRawVarint32 <= i10 - i11) {
                    String str = new String(this.f15260b, i11, readRawVarint32, Internal.UTF_8);
                    this.f15263e += readRawVarint32;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= this.f15261c) {
                h(readRawVarint32);
                String str2 = new String(this.f15260b, this.f15263e, readRawVarint32, Internal.UTF_8);
                this.f15263e += readRawVarint32;
                return str2;
            }
            return new String(d(readRawVarint32, false), Internal.UTF_8);
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            byte[] d10;
            int readRawVarint32 = readRawVarint32();
            int i10 = this.f15263e;
            int i11 = this.f15261c;
            if (readRawVarint32 <= i11 - i10 && readRawVarint32 > 0) {
                d10 = this.f15260b;
                this.f15263e = i10 + readRawVarint32;
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 <= i11) {
                    h(readRawVarint32);
                    d10 = this.f15260b;
                    this.f15263e = readRawVarint32 + 0;
                } else {
                    d10 = d(readRawVarint32, false);
                }
                i10 = 0;
            }
            return u0.h(d10, i10, readRawVarint32);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.f15264f = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.f15264f = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.f15264f;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i10, MessageLite.Builder builder) throws IOException {
            readGroup(i10, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.f15265g = -this.f15263e;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i10) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                k();
                return true;
            } else if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            } else if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            } else if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4));
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    skipRawBytes(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage() throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i10) throws IOException {
            int i11 = this.f15261c;
            int i12 = this.f15263e;
            if (i10 <= i11 - i12 && i10 >= 0) {
                this.f15263e = i12 + i10;
            } else {
                j(i10);
            }
        }

        private d(InputStream inputStream, int i10) {
            super();
            this.f15266h = Integer.MAX_VALUE;
            this.f15267i = null;
            Internal.checkNotNull(inputStream, "input");
            this.f15259a = inputStream;
            this.f15260b = new byte[i10];
            this.f15261c = 0;
            this.f15263e = 0;
            this.f15265g = 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i10, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i10, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i10, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            } else if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            } else if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            } else if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i10);
                skipMessage(codedOutputStream);
                int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeUInt32NoTag(i10);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return parsePartialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class e extends CodedInputStream {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f15268a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f15269b;

        /* renamed from: c  reason: collision with root package name */
        private final long f15270c;

        /* renamed from: d  reason: collision with root package name */
        private long f15271d;

        /* renamed from: e  reason: collision with root package name */
        private long f15272e;

        /* renamed from: f  reason: collision with root package name */
        private long f15273f;

        /* renamed from: g  reason: collision with root package name */
        private int f15274g;

        /* renamed from: h  reason: collision with root package name */
        private int f15275h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f15276i;

        /* renamed from: j  reason: collision with root package name */
        private int f15277j;

        private int a(long j10) {
            return (int) (j10 - this.f15270c);
        }

        static boolean b() {
            return t0.K();
        }

        private void c() {
            long j10 = this.f15271d + this.f15274g;
            this.f15271d = j10;
            int i10 = (int) (j10 - this.f15273f);
            int i11 = this.f15277j;
            if (i10 > i11) {
                int i12 = i10 - i11;
                this.f15274g = i12;
                this.f15271d = j10 - i12;
                return;
            }
            this.f15274g = 0;
        }

        private int d() {
            return (int) (this.f15271d - this.f15272e);
        }

        private void e() throws IOException {
            if (d() >= 10) {
                f();
            } else {
                g();
            }
        }

        private void f() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                long j10 = this.f15272e;
                this.f15272e = 1 + j10;
                if (t0.x(j10) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void g() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer h(long j10, long j11) throws IOException {
            int position = this.f15268a.position();
            int limit = this.f15268a.limit();
            ByteBuffer byteBuffer = this.f15268a;
            try {
                try {
                    byteBuffer.position(a(j10));
                    byteBuffer.limit(a(j11));
                    return this.f15268a.slice();
                } catch (IllegalArgumentException e8) {
                    InvalidProtocolBufferException truncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                    truncatedMessage.initCause(e8);
                    throw truncatedMessage;
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
            if (this.f15275h != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z10) {
            this.f15276i = z10;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i10 = this.f15277j;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.f15275h;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (this.f15272e - this.f15273f);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return this.f15272e == this.f15271d;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i10) {
            this.f15277j = i10;
            c();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0) {
                int totalBytesRead = i10 + getTotalBytesRead();
                int i11 = this.f15277j;
                if (totalBytesRead <= i11) {
                    this.f15277j = totalBytesRead;
                    c();
                    return i11;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > d()) {
                if (readRawVarint32 == 0) {
                    return Internal.EMPTY_BYTE_BUFFER;
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (!this.f15269b && this.f15276i) {
                long j10 = this.f15272e;
                long j11 = readRawVarint32;
                ByteBuffer h10 = h(j10, j10 + j11);
                this.f15272e += j11;
                return h10;
            } else {
                byte[] bArr = new byte[readRawVarint32];
                long j12 = readRawVarint32;
                t0.p(this.f15272e, bArr, 0L, j12);
                this.f15272e += j12;
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > d()) {
                if (readRawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (this.f15269b && this.f15276i) {
                long j10 = this.f15272e;
                long j11 = readRawVarint32;
                ByteBuffer h10 = h(j10, j10 + j11);
                this.f15272e += j11;
                return ByteString.wrap(h10);
            } else {
                byte[] bArr = new byte[readRawVarint32];
                long j12 = readRawVarint32;
                t0.p(this.f15272e, bArr, 0L, j12);
                this.f15272e += j12;
                return ByteString.wrap(bArr);
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i10, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            long j10 = this.f15272e;
            if (j10 != this.f15271d) {
                this.f15272e = 1 + j10;
                return t0.x(j10);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i10) throws IOException {
            if (i10 < 0 || i10 > d()) {
                if (i10 <= 0) {
                    if (i10 == 0) {
                        return Internal.EMPTY_BYTE_ARRAY;
                    }
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[i10];
            long j10 = this.f15272e;
            long j11 = i10;
            h(j10, j10 + j11).get(bArr);
            this.f15272e += j11;
            return bArr;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            long j10 = this.f15272e;
            if (this.f15271d - j10 >= 4) {
                this.f15272e = 4 + j10;
                return ((t0.x(j10 + 3) & 255) << 24) | (t0.x(j10) & 255) | ((t0.x(1 + j10) & 255) << 8) | ((t0.x(2 + j10) & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            long j10 = this.f15272e;
            if (this.f15271d - j10 >= 8) {
                this.f15272e = 8 + j10;
                return ((t0.x(j10 + 7) & 255) << 56) | (t0.x(j10) & 255) | ((t0.x(1 + j10) & 255) << 8) | ((t0.x(2 + j10) & 255) << 16) | ((t0.x(3 + j10) & 255) << 24) | ((t0.x(4 + j10) & 255) << 32) | ((t0.x(5 + j10) & 255) << 40) | ((t0.x(6 + j10) & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
            if (com.google.protobuf.t0.x(r4) < 0) goto L34;
         */
        @Override // com.google.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int readRawVarint32() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f15272e
                long r2 = r10.f15271d
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L85
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.t0.x(r0)
                if (r0 < 0) goto L17
                r10.f15272e = r4
                return r0
            L17:
                long r6 = r10.f15271d
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L21
                goto L85
            L21:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.t0.x(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L2f
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L8b
            L2f:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.t0.x(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L3c:
                r6 = r4
                goto L8b
            L3e:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.t0.x(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L4e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L8b
            L4e:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.t0.x(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.t0.x(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.t0.x(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.t0.x(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.t0.x(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.t0.x(r4)
                if (r1 >= 0) goto L8b
            L85:
                long r0 = r10.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L8b:
                r10.f15272e = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.e.readRawVarint32():int");
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
            long x10;
            long j10;
            long j11;
            int i10;
            long j12 = this.f15272e;
            if (this.f15271d != j12) {
                long j13 = j12 + 1;
                byte x11 = t0.x(j12);
                if (x11 >= 0) {
                    this.f15272e = j13;
                    return x11;
                } else if (this.f15271d - j13 >= 9) {
                    long j14 = j13 + 1;
                    int x12 = x11 ^ (t0.x(j13) << 7);
                    if (x12 >= 0) {
                        long j15 = j14 + 1;
                        int x13 = x12 ^ (t0.x(j14) << 14);
                        if (x13 >= 0) {
                            x10 = x13 ^ 16256;
                        } else {
                            j14 = j15 + 1;
                            int x14 = x13 ^ (t0.x(j15) << 21);
                            if (x14 < 0) {
                                i10 = x14 ^ (-2080896);
                            } else {
                                j15 = j14 + 1;
                                long x15 = x14 ^ (t0.x(j14) << 28);
                                if (x15 < 0) {
                                    long j16 = j15 + 1;
                                    long x16 = x15 ^ (t0.x(j15) << 35);
                                    if (x16 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        j15 = j16 + 1;
                                        x15 = x16 ^ (t0.x(j16) << 42);
                                        if (x15 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            j16 = j15 + 1;
                                            x16 = x15 ^ (t0.x(j15) << 49);
                                            if (x16 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                j15 = j16 + 1;
                                                x10 = (x16 ^ (t0.x(j16) << 56)) ^ 71499008037633920L;
                                                if (x10 < 0) {
                                                    long j17 = 1 + j15;
                                                    if (t0.x(j15) >= 0) {
                                                        j14 = j17;
                                                        this.f15272e = j14;
                                                        return x10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    x10 = x16 ^ j10;
                                    j14 = j16;
                                    this.f15272e = j14;
                                    return x10;
                                }
                                j11 = 266354560;
                                x10 = x15 ^ j11;
                            }
                        }
                        j14 = j15;
                        this.f15272e = j14;
                        return x10;
                    }
                    i10 = x12 ^ (-128);
                    x10 = i10;
                    this.f15272e = j14;
                    return x10;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte readRawByte = readRawByte();
                j10 |= (readRawByte & Byte.MAX_VALUE) << i10;
                if ((readRawByte & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > d()) {
                if (readRawVarint32 == 0) {
                    return "";
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[readRawVarint32];
            long j10 = readRawVarint32;
            t0.p(this.f15272e, bArr, 0L, j10);
            String str = new String(bArr, Internal.UTF_8);
            this.f15272e += j10;
            return str;
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= d()) {
                String g10 = u0.g(this.f15268a, a(this.f15272e), readRawVarint32);
                this.f15272e += readRawVarint32;
                return g10;
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 <= 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.f15275h = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.f15275h = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.f15275h;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i10, MessageLite.Builder builder) throws IOException {
            readGroup(i10, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.f15273f = this.f15272e;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i10) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                e();
                return true;
            } else if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            } else if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            } else if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4));
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    skipRawBytes(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage() throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i10) throws IOException {
            if (i10 >= 0 && i10 <= d()) {
                this.f15272e += i10;
            } else if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private e(ByteBuffer byteBuffer, boolean z10) {
            super();
            this.f15277j = Integer.MAX_VALUE;
            this.f15268a = byteBuffer;
            long k10 = t0.k(byteBuffer);
            this.f15270c = k10;
            this.f15271d = byteBuffer.limit() + k10;
            long position = k10 + byteBuffer.position();
            this.f15272e = position;
            this.f15273f = position;
            this.f15269b = z10;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i10, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i10, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i10, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            } else if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            } else if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            } else if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i10);
                skipMessage(codedOutputStream);
                int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            } else if (tagWireType != 4) {
                if (tagWireType == 5) {
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeUInt32NoTag(i10);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            } else {
                return false;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return parsePartialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static int decodeZigZag32(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long decodeZigZag64(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static int readRawVarint32(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i11 |= (read & 127) << i12;
            if ((read & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((read2 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public abstract void checkLastTagWas(int i10) throws InvalidProtocolBufferException;

    public void checkRecursionLimit() throws InvalidProtocolBufferException {
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean z10);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i10);

    public abstract int pushLimit(int i10) throws InvalidProtocolBufferException;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract ByteString readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends MessageLite> T readGroup(int i10, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int i10) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    abstract long readRawVarint64SlowPath() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(int i10, MessageLite.Builder builder) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i10) {
        if (i10 >= 0) {
            int i11 = this.recursionLimit;
            this.recursionLimit = i10;
            return i11;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i10);
    }

    public final int setSizeLimit(int i10) {
        if (i10 >= 0) {
            int i11 = this.sizeLimit;
            this.sizeLimit = i10;
            return i11;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i10);
    }

    final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public abstract boolean skipField(int i10) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i10, CodedOutputStream codedOutputStream) throws IOException;

    public abstract void skipMessage() throws IOException;

    public abstract void skipMessage(CodedOutputStream codedOutputStream) throws IOException;

    public abstract void skipRawBytes(int i10) throws IOException;

    final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    private CodedInputStream() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public static CodedInputStream newInstance(InputStream inputStream, int i10) {
        if (i10 > 0) {
            if (inputStream == null) {
                return newInstance(Internal.EMPTY_BYTE_ARRAY);
            }
            return new d(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable) {
        if (!e.b()) {
            return newInstance(new p(iterable));
        }
        return newInstance(iterable, false);
    }

    static int readRawVarint32(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return readRawVarint32(read, inputStream);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable, boolean z10) {
        boolean z11 = false;
        int i10 = 0;
        for (ByteBuffer byteBuffer : iterable) {
            i10 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z11 |= true;
            } else {
                z11 = byteBuffer.isDirect() ? z11 | true : z11 | true;
            }
        }
        if (z11) {
            return new c(iterable, i10, z10);
        }
        return newInstance(new p(iterable));
    }

    public static CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i10, int i11) {
        return newInstance(bArr, i10, i11, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CodedInputStream newInstance(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.pushLimit(i11);
            return bVar;
        } catch (InvalidProtocolBufferException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CodedInputStream newInstance(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && e.b()) {
            return new e(byteBuffer, z10);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, remaining, true);
    }
}
