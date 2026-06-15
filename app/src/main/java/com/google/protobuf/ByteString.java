package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new i(Internal.EMPTY_BYTE_ARRAY);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final f byteArrayCopier;
    private int hash = 0;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private int f15226a = 0;

        /* renamed from: b  reason: collision with root package name */
        private final int f15227b;

        a() {
            this.f15227b = ByteString.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15226a < this.f15227b;
        }

        @Override // com.google.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            int i10 = this.f15226a;
            if (i10 < this.f15227b) {
                this.f15226a = i10 + 1;
                return ByteString.this.internalByteAt(i10);
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b implements Comparator<ByteString> {
        b() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, com.google.protobuf.ByteString$ByteIterator] */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Iterator, com.google.protobuf.ByteString$ByteIterator] */
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(ByteString byteString, ByteString byteString2) {
            ?? iterator2 = byteString.iterator2();
            ?? iterator22 = byteString2.iterator2();
            while (iterator2.hasNext() && iterator22.hasNext()) {
                int compareTo = Integer.valueOf(ByteString.toInt(iterator2.nextByte())).compareTo(Integer.valueOf(ByteString.toInt(iterator22.nextByte())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(byteString.size()).compareTo(Integer.valueOf(byteString2.size()));
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static abstract class c implements ByteIterator {
        @Override // java.util.Iterator
        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class d implements f {
        private d() {
        }

        @Override // com.google.protobuf.ByteString.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class e extends i {

        /* renamed from: b  reason: collision with root package name */
        private final int f15229b;

        /* renamed from: c  reason: collision with root package name */
        private final int f15230c;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            ByteString.checkRange(i10, i10 + i11, bArr.length);
            this.f15229b = i10;
            this.f15230c = i11;
        }

        @Override // com.google.protobuf.ByteString.i
        protected int b() {
            return this.f15229b;
        }

        @Override // com.google.protobuf.ByteString.i, com.google.protobuf.ByteString
        public byte byteAt(int i10) {
            ByteString.checkIndex(i10, size());
            return this.f15233a[this.f15229b + i10];
        }

        @Override // com.google.protobuf.ByteString.i, com.google.protobuf.ByteString
        protected void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f15233a, b() + i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.ByteString.i, com.google.protobuf.ByteString
        byte internalByteAt(int i10) {
            return this.f15233a[this.f15229b + i10];
        }

        @Override // com.google.protobuf.ByteString.i, com.google.protobuf.ByteString
        public int size() {
            return this.f15230c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final CodedOutputStream f15231a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f15232b;

        /* synthetic */ g(int i10, a aVar) {
            this(i10);
        }

        public ByteString a() {
            this.f15231a.checkNoSpaceLeft();
            return new i(this.f15232b);
        }

        public CodedOutputStream b() {
            return this.f15231a;
        }

        private g(int i10) {
            byte[] bArr = new byte[i10];
            this.f15232b = bArr;
            this.f15231a = CodedOutputStream.newInstance(bArr);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static abstract class h extends ByteString {
        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract boolean a(ByteString byteString, int i10, int i11);

        @Override // com.google.protobuf.ByteString
        protected final int getTreeDepth() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        protected final boolean isBalanced() {
            return true;
        }

        @Override // com.google.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator2();
        }

        @Override // com.google.protobuf.ByteString
        void writeToReverse(ByteOutput byteOutput) throws IOException {
            writeTo(byteOutput);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class i extends h {

        /* renamed from: a  reason: collision with root package name */
        protected final byte[] f15233a;

        i(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f15233a = bArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.protobuf.ByteString.h
        public final boolean a(ByteString byteString, int i10, int i11) {
            if (i11 <= byteString.size()) {
                int i12 = i10 + i11;
                if (i12 <= byteString.size()) {
                    if (byteString instanceof i) {
                        i iVar = (i) byteString;
                        byte[] bArr = this.f15233a;
                        byte[] bArr2 = iVar.f15233a;
                        int b10 = b() + i11;
                        int b11 = b();
                        int b12 = iVar.b() + i10;
                        while (b11 < b10) {
                            if (bArr[b11] != bArr2[b12]) {
                                return false;
                            }
                            b11++;
                            b12++;
                        }
                        return true;
                    }
                    return byteString.substring(i10, i12).equals(substring(0, i11));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + byteString.size());
            }
            throw new IllegalArgumentException("Length too large: " + i11 + size());
        }

        @Override // com.google.protobuf.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.f15233a, b(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.ByteString
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        protected int b() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        public byte byteAt(int i10) {
            return this.f15233a[i10];
        }

        @Override // com.google.protobuf.ByteString
        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.f15233a, b(), size());
        }

        @Override // com.google.protobuf.ByteString
        protected void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f15233a, i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof ByteString) && size() == ((ByteString) obj).size()) {
                if (size() == 0) {
                    return true;
                }
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    int peekCachedHashCode = peekCachedHashCode();
                    int peekCachedHashCode2 = iVar.peekCachedHashCode();
                    if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                        return a(iVar, 0, size());
                    }
                    return false;
                }
                return obj.equals(this);
            }
            return false;
        }

        @Override // com.google.protobuf.ByteString
        byte internalByteAt(int i10) {
            return this.f15233a[i10];
        }

        @Override // com.google.protobuf.ByteString
        public final boolean isValidUtf8() {
            int b10 = b();
            return u0.u(this.f15233a, b10, size() + b10);
        }

        @Override // com.google.protobuf.ByteString
        public final CodedInputStream newCodedInput() {
            return CodedInputStream.newInstance(this.f15233a, b(), size(), true);
        }

        @Override // com.google.protobuf.ByteString
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.f15233a, b(), size());
        }

        @Override // com.google.protobuf.ByteString
        protected final int partialHash(int i10, int i11, int i12) {
            return Internal.partialHash(i10, this.f15233a, b() + i11, i12);
        }

        @Override // com.google.protobuf.ByteString
        protected final int partialIsValidUtf8(int i10, int i11, int i12) {
            int b10 = b() + i11;
            return u0.w(i10, this.f15233a, b10, i12 + b10);
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.f15233a.length;
        }

        @Override // com.google.protobuf.ByteString
        public final ByteString substring(int i10, int i11) {
            int checkRange = ByteString.checkRange(i10, i11, size());
            if (checkRange == 0) {
                return ByteString.EMPTY;
            }
            return new e(this.f15233a, b() + i10, checkRange);
        }

        @Override // com.google.protobuf.ByteString
        protected final String toStringInternal(Charset charset) {
            return new String(this.f15233a, b(), size(), charset);
        }

        @Override // com.google.protobuf.ByteString
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // com.google.protobuf.ByteString
        final void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
            outputStream.write(this.f15233a, b() + i10, i11);
        }

        @Override // com.google.protobuf.ByteString
        final void writeTo(ByteOutput byteOutput) throws IOException {
            byteOutput.writeLazy(this.f15233a, b(), size());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class j implements f {
        private j() {
        }

        @Override // com.google.protobuf.ByteString.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        byteArrayCopier = com.google.protobuf.b.c() ? new j(null) : new d(null);
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new b();
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i10) {
        if (i10 >= 1) {
            if (i10 == 1) {
                return it.next();
            }
            int i11 = i10 >>> 1;
            return balancedConcat(it, i11).concat(balancedConcat(it, i10 - i11));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void checkIndex(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int checkRange(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
            } else if (i11 < i10) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
            }
        }
        return i13;
    }

    public static ByteString copyFrom(byte[] bArr, int i10, int i11) {
        checkRange(i10, i10 + i11, bArr.length);
        return new i(byteArrayCopier.a(bArr, i10, i11));
    }

    public static ByteString copyFromUtf8(String str) {
        return new i(str.getBytes(Internal.UTF_8));
    }

    public static final ByteString empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String str, int i10) {
        int hexDigit = hexDigit(str.charAt(i10));
        if (hexDigit != -1) {
            return hexDigit;
        }
        throw new NumberFormatException("Invalid hexString " + str + " must only contain [0-9a-fA-F] but contained " + str.charAt(i10) + " at index " + i10);
    }

    public static ByteString fromHex(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (extractHexDigit(str, i11 + 1) | (extractHexDigit(str, i11) << 4));
            }
            return new i(bArr);
        }
        throw new NumberFormatException("Invalid hexString " + str + " of length " + str.length() + " must be even.");
    }

    private static int hexDigit(char c10) {
        if (c10 < '0' || c10 > '9') {
            char c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                c11 = 'a';
                if (c10 < 'a' || c10 > 'f') {
                    return -1;
                }
            }
            return (c10 - c11) + 10;
        }
        return c10 - '0';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g newCodedBuilder(int i10) {
        return new g(i10, null);
    }

    public static Output newOutput(int i10) {
        return new Output(i10);
    }

    private static ByteString readChunk(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, i11, i10 - i11);
            if (read == -1) {
                break;
            }
            i11 += read;
        }
        if (i11 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i11);
    }

    public static ByteString readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, MIN_READ_FROM_CHUNK_SIZE, MAX_READ_FROM_CHUNK_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte b10) {
        return b10 & 255;
    }

    private String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return q0.a(this);
        }
        return q0.a(substring(0, 47)) + "...";
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteString wrap(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return wrap(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        return new e0(byteBuffer);
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i10);

    public final ByteString concat(ByteString byteString) {
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - size() >= byteString.size()) {
            return l0.c(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + byteString.size());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i10) {
        copyTo(bArr, 0, i10, size());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void copyToInternal(byte[] bArr, int i10, int i11, int i12);

    public final boolean endsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(size() - byteString.size()).equals(byteString);
    }

    public abstract boolean equals(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int getTreeDepth();

    public final int hashCode() {
        int i10 = this.hash;
        if (i10 == 0) {
            int size = size();
            i10 = partialHash(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.hash = i10;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte internalByteAt(int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract CodedInputStream newCodedInput();

    public abstract InputStream newInput();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int partialHash(int i10, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int partialIsValidUtf8(int i10, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(0, byteString.size()).equals(byteString);
    }

    public final ByteString substring(int i10) {
        return substring(i10, size());
    }

    public abstract ByteString substring(int i10, int i11);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e8) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e8);
            throw unsupportedEncodingException;
        }
    }

    protected abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(Internal.UTF_8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void writeTo(ByteOutput byteOutput) throws IOException;

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    final void writeTo(OutputStream outputStream, int i10, int i11) throws IOException {
        checkRange(i10, i10 + i11, size());
        if (i11 > 0) {
            writeToInternal(outputStream, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void writeToReverse(ByteOutput byteOutput) throws IOException;

    public static Output newOutput() {
        return new Output(CONCATENATE_BY_COPY_SIZE);
    }

    public static ByteString readFrom(InputStream inputStream, int i10) throws IOException {
        return readFrom(inputStream, i10, i10);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i10, int i11, int i12) {
        checkRange(i10, i10 + i12, size());
        checkRange(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            copyToInternal(bArr, i10, i11, i12);
        }
    }

    @Override // java.lang.Iterable
    /* renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new a();
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString readFrom(InputStream inputStream, int i10, int i11) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString readChunk = readChunk(inputStream, i10);
            if (readChunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(readChunk);
            i10 = Math.min(i10 * 2, i11);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        Output(int i10) {
            if (i10 >= 0) {
                this.initialCapacity = i10;
                this.flushedBuffers = new ArrayList<>();
                this.buffer = new byte[i10];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        private byte[] copyArray(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        private void flushFullBuffer(int i10) {
            this.flushedBuffers.add(new i(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i10, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i10 = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i10 >= bArr.length) {
                this.flushedBuffers.add(new i(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i10 > 0) {
                this.flushedBuffers.add(new i(copyArray(bArr, i10)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public synchronized void reset() {
            this.flushedBuffers.clear();
            this.flushedBuffersTotalBytes = 0;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized ByteString toByteString() {
            flushLastBuffer();
            return ByteString.copyFrom(this.flushedBuffers);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            if (this.bufferPos == this.buffer.length) {
                flushFullBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i11 = this.bufferPos;
            this.bufferPos = i11 + 1;
            bArr[i11] = (byte) i10;
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            ByteString[] byteStringArr;
            byte[] bArr;
            int i10;
            synchronized (this) {
                ArrayList<ByteString> arrayList = this.flushedBuffers;
                byteStringArr = (ByteString[]) arrayList.toArray(new ByteString[arrayList.size()]);
                bArr = this.buffer;
                i10 = this.bufferPos;
            }
            for (ByteString byteString : byteStringArr) {
                byteString.writeTo(outputStream);
            }
            outputStream.write(copyArray(bArr, i10));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = this.buffer;
            int length = bArr2.length;
            int i12 = this.bufferPos;
            if (i11 <= length - i12) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.bufferPos += i11;
            } else {
                int length2 = bArr2.length - i12;
                System.arraycopy(bArr, i10, bArr2, i12, length2);
                int i13 = i11 - length2;
                flushFullBuffer(i13);
                System.arraycopy(bArr, i10 + length2, this.buffer, 0, i13);
                this.bufferPos = i13;
            }
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i10) {
        checkRange(0, i10, byteBuffer.remaining());
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return new i(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteString wrap(byte[] bArr) {
        return new i(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteString wrap(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), truncateAndEscapeForDisplay());
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new i(str.getBytes(str2));
    }

    public static ByteString copyFrom(String str, Charset charset) {
        return new i(str.getBytes(charset));
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            size = 0;
            Iterator<ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return balancedConcat(iterable.iterator(), size);
    }
}
