package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RopeByteString.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class l0 extends ByteString {

    /* renamed from: f  reason: collision with root package name */
    static final int[] f15443f = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Api.BaseClientBuilder.API_PRIORITY_OTHER};

    /* renamed from: a  reason: collision with root package name */
    private final int f15444a;

    /* renamed from: b  reason: collision with root package name */
    private final ByteString f15445b;

    /* renamed from: c  reason: collision with root package name */
    private final ByteString f15446c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15447d;

    /* renamed from: e  reason: collision with root package name */
    private final int f15448e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RopeByteString.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends ByteString.c {

        /* renamed from: a  reason: collision with root package name */
        final c f15449a;

        /* renamed from: b  reason: collision with root package name */
        ByteString.ByteIterator f15450b = b();

        a() {
            this.f15449a = new c(l0.this, null);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.google.protobuf.ByteString$ByteIterator] */
        private ByteString.ByteIterator b() {
            if (this.f15449a.hasNext()) {
                return this.f15449a.next().iterator2();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15450b != null;
        }

        @Override // com.google.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            ByteString.ByteIterator byteIterator = this.f15450b;
            if (byteIterator != null) {
                byte nextByte = byteIterator.nextByte();
                if (!this.f15450b.hasNext()) {
                    this.f15450b = b();
                }
                return nextByte;
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RopeByteString.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c implements Iterator<ByteString.h> {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayDeque<l0> f15453a;

        /* renamed from: b  reason: collision with root package name */
        private ByteString.h f15454b;

        /* synthetic */ c(ByteString byteString, a aVar) {
            this(byteString);
        }

        private ByteString.h a(ByteString byteString) {
            while (byteString instanceof l0) {
                l0 l0Var = (l0) byteString;
                this.f15453a.push(l0Var);
                byteString = l0Var.f15445b;
            }
            return (ByteString.h) byteString;
        }

        private ByteString.h b() {
            ByteString.h a10;
            do {
                ArrayDeque<l0> arrayDeque = this.f15453a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                a10 = a(this.f15453a.pop().f15446c);
            } while (a10.isEmpty());
            return a10;
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public ByteString.h next() {
            ByteString.h hVar = this.f15454b;
            if (hVar != null) {
                this.f15454b = b();
                return hVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15454b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(ByteString byteString) {
            if (byteString instanceof l0) {
                l0 l0Var = (l0) byteString;
                ArrayDeque<l0> arrayDeque = new ArrayDeque<>(l0Var.getTreeDepth());
                this.f15453a = arrayDeque;
                arrayDeque.push(l0Var);
                this.f15454b = a(l0Var.f15445b);
                return;
            }
            this.f15453a = null;
            this.f15454b = (ByteString.h) byteString;
        }
    }

    /* synthetic */ l0(ByteString byteString, ByteString byteString2, a aVar) {
        this(byteString, byteString2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteString c(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return d(byteString, byteString2);
        }
        if (byteString instanceof l0) {
            l0 l0Var = (l0) byteString;
            if (l0Var.f15446c.size() + byteString2.size() < 128) {
                return new l0(l0Var.f15445b, d(l0Var.f15446c, byteString2));
            } else if (l0Var.f15445b.getTreeDepth() > l0Var.f15446c.getTreeDepth() && l0Var.getTreeDepth() > byteString2.getTreeDepth()) {
                return new l0(l0Var.f15445b, new l0(l0Var.f15446c, byteString2));
            }
        }
        if (size < f(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1)) {
            return new b(null).b(byteString, byteString2);
        }
        return new l0(byteString, byteString2);
    }

    private static ByteString d(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    private boolean e(ByteString byteString) {
        boolean a10;
        c cVar = new c(this, null);
        ByteString.h next = cVar.next();
        c cVar2 = new c(byteString, null);
        ByteString.h next2 = cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = next.size() - i10;
            int size2 = next2.size() - i11;
            int min = Math.min(size, size2);
            if (i10 == 0) {
                a10 = next.a(next2, i11, min);
            } else {
                a10 = next2.a(next, i10, min);
            }
            if (!a10) {
                return false;
            }
            i12 += min;
            int i13 = this.f15444a;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                i10 = 0;
                next = cVar.next();
            } else {
                i10 += min;
                next = next;
            }
            if (min == size2) {
                next2 = cVar2.next();
                i11 = 0;
            } else {
                i11 += min;
            }
        }
    }

    static int f(int i10) {
        int[] iArr = f15443f;
        return i10 >= iArr.length ? Api.BaseClientBuilder.API_PRIORITY_OTHER : iArr[i10];
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i10) {
        ByteString.checkIndex(i10, this.f15444a);
        return internalByteAt(i10);
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.f15445b.copyTo(byteBuffer);
        this.f15446c.copyTo(byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f15447d;
        if (i13 <= i14) {
            this.f15445b.copyToInternal(bArr, i10, i11, i12);
        } else if (i10 >= i14) {
            this.f15446c.copyToInternal(bArr, i10 - i14, i11, i12);
        } else {
            int i15 = i14 - i10;
            this.f15445b.copyToInternal(bArr, i10, i11, i15);
            this.f15446c.copyToInternal(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (this.f15444a != byteString.size()) {
                return false;
            }
            if (this.f15444a == 0) {
                return true;
            }
            int peekCachedHashCode = peekCachedHashCode();
            int peekCachedHashCode2 = byteString.peekCachedHashCode();
            if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                return e(byteString);
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public int getTreeDepth() {
        return this.f15448e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.ByteString
    public byte internalByteAt(int i10) {
        int i11 = this.f15447d;
        if (i10 < i11) {
            return this.f15445b.internalByteAt(i10);
        }
        return this.f15446c.internalByteAt(i10 - i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public boolean isBalanced() {
        return this.f15444a >= f(this.f15448e);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.f15445b.partialIsValidUtf8(0, 0, this.f15447d);
        ByteString byteString = this.f15446c;
        return byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public int partialHash(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f15447d;
        if (i13 <= i14) {
            return this.f15445b.partialHash(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f15446c.partialHash(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f15446c.partialHash(this.f15445b.partialHash(i10, i11, i15), 0, i12 - i15);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.ByteString
    public int partialIsValidUtf8(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f15447d;
        if (i13 <= i14) {
            return this.f15445b.partialIsValidUtf8(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f15446c.partialIsValidUtf8(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f15446c.partialIsValidUtf8(this.f15445b.partialIsValidUtf8(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.f15444a;
    }

    @Override // com.google.protobuf.ByteString
    public ByteString substring(int i10, int i11) {
        int checkRange = ByteString.checkRange(i10, i11, this.f15444a);
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        if (checkRange == this.f15444a) {
            return this;
        }
        int i12 = this.f15447d;
        if (i11 <= i12) {
            return this.f15445b.substring(i10, i11);
        }
        if (i10 >= i12) {
            return this.f15446c.substring(i10 - i12, i11 - i12);
        }
        return new l0(this.f15445b.substring(i10), this.f15446c.substring(0, i11 - this.f15447d));
    }

    @Override // com.google.protobuf.ByteString
    protected String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.f15445b.writeTo(outputStream);
        this.f15446c.writeTo(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        int i13 = this.f15447d;
        if (i12 <= i13) {
            this.f15445b.writeToInternal(outputStream, i10, i11);
        } else if (i10 >= i13) {
            this.f15446c.writeToInternal(outputStream, i10 - i13, i11);
        } else {
            int i14 = i13 - i10;
            this.f15445b.writeToInternal(outputStream, i10, i14);
            this.f15446c.writeToInternal(outputStream, 0, i11 - i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.ByteString
    public void writeToReverse(ByteOutput byteOutput) throws IOException {
        this.f15446c.writeToReverse(byteOutput);
        this.f15445b.writeToReverse(byteOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RopeByteString.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayDeque<ByteString> f15452a;

        private b() {
            this.f15452a = new ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ByteString b(ByteString byteString, ByteString byteString2) {
            c(byteString);
            c(byteString2);
            ByteString pop = this.f15452a.pop();
            while (!this.f15452a.isEmpty()) {
                pop = new l0(this.f15452a.pop(), pop, null);
            }
            return pop;
        }

        private void c(ByteString byteString) {
            if (byteString.isBalanced()) {
                e(byteString);
            } else if (byteString instanceof l0) {
                l0 l0Var = (l0) byteString;
                c(l0Var.f15445b);
                c(l0Var.f15446c);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        private int d(int i10) {
            int binarySearch = Arrays.binarySearch(l0.f15443f, i10);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        private void e(ByteString byteString) {
            int d10 = d(byteString.size());
            int f10 = l0.f(d10 + 1);
            if (!this.f15452a.isEmpty() && this.f15452a.peek().size() < f10) {
                int f11 = l0.f(d10);
                ByteString pop = this.f15452a.pop();
                while (!this.f15452a.isEmpty() && this.f15452a.peek().size() < f11) {
                    pop = new l0(this.f15452a.pop(), pop, null);
                }
                l0 l0Var = new l0(pop, byteString, null);
                while (!this.f15452a.isEmpty()) {
                    if (this.f15452a.peek().size() >= l0.f(d(l0Var.size()) + 1)) {
                        break;
                    }
                    l0Var = new l0(this.f15452a.pop(), l0Var, null);
                }
                this.f15452a.push(l0Var);
                return;
            }
            this.f15452a.push(byteString);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private l0(ByteString byteString, ByteString byteString2) {
        this.f15445b = byteString;
        this.f15446c = byteString2;
        int size = byteString.size();
        this.f15447d = size;
        this.f15444a = size + byteString2.size();
        this.f15448e = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.ByteString
    public void writeTo(ByteOutput byteOutput) throws IOException {
        this.f15445b.writeTo(byteOutput);
        this.f15446c.writeTo(byteOutput);
    }

    /* compiled from: RopeByteString.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private class d extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        private c f15455a;

        /* renamed from: b  reason: collision with root package name */
        private ByteString.h f15456b;

        /* renamed from: c  reason: collision with root package name */
        private int f15457c;

        /* renamed from: d  reason: collision with root package name */
        private int f15458d;

        /* renamed from: e  reason: collision with root package name */
        private int f15459e;

        /* renamed from: f  reason: collision with root package name */
        private int f15460f;

        public d() {
            f();
        }

        private void a() {
            if (this.f15456b != null) {
                int i10 = this.f15458d;
                int i11 = this.f15457c;
                if (i10 == i11) {
                    this.f15459e += i11;
                    this.f15458d = 0;
                    if (this.f15455a.hasNext()) {
                        ByteString.h next = this.f15455a.next();
                        this.f15456b = next;
                        this.f15457c = next.size();
                        return;
                    }
                    this.f15456b = null;
                    this.f15457c = 0;
                }
            }
        }

        private int b() {
            return l0.this.size() - (this.f15459e + this.f15458d);
        }

        private void f() {
            c cVar = new c(l0.this, null);
            this.f15455a = cVar;
            ByteString.h next = cVar.next();
            this.f15456b = next;
            this.f15457c = next.size();
            this.f15458d = 0;
            this.f15459e = 0;
        }

        private int j(byte[] bArr, int i10, int i11) {
            int i12 = i11;
            while (i12 > 0) {
                a();
                if (this.f15456b == null) {
                    break;
                }
                int min = Math.min(this.f15457c - this.f15458d, i12);
                if (bArr != null) {
                    this.f15456b.copyTo(bArr, this.f15458d, i10, min);
                    i10 += min;
                }
                this.f15458d += min;
                i12 -= min;
            }
            return i11 - i12;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return b();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f15460f = this.f15459e + this.f15458d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            Objects.requireNonNull(bArr);
            if (i10 >= 0 && i11 >= 0 && i11 <= bArr.length - i10) {
                int j10 = j(bArr, i10, i11);
                if (j10 == 0) {
                    if (i11 > 0 || b() == 0) {
                        return -1;
                    }
                    return j10;
                }
                return j10;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            f();
            j(null, 0, this.f15460f);
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (j10 >= 0) {
                if (j10 > 2147483647L) {
                    j10 = 2147483647L;
                }
                return j(null, 0, (int) j10);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            a();
            ByteString.h hVar = this.f15456b;
            if (hVar == null) {
                return -1;
            }
            int i10 = this.f15458d;
            this.f15458d = i10 + 1;
            return hVar.byteAt(i10) & 255;
        }
    }
}
