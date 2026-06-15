package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CodedInputStreamReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class f implements k0 {

    /* renamed from: a  reason: collision with root package name */
    private final CodedInputStream f15419a;

    /* renamed from: b  reason: collision with root package name */
    private int f15420b;

    /* renamed from: c  reason: collision with root package name */
    private int f15421c;

    /* renamed from: d  reason: collision with root package name */
    private int f15422d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CodedInputStreamReader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15423a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f15423a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15423a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15423a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15423a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15423a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15423a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15423a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15423a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15423a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15423a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15423a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15423a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15423a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15423a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15423a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15423a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15423a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private f(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.checkNotNull(codedInputStream, "input");
        this.f15419a = codedInputStream2;
        codedInputStream2.wrapper = this;
    }

    public static f Q(CodedInputStream codedInputStream) {
        f fVar = codedInputStream.wrapper;
        return fVar != null ? fVar : new f(codedInputStream);
    }

    private <T> void R(T t10, m0<T> m0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i10 = this.f15421c;
        this.f15421c = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.f15420b), 4);
        try {
            m0Var.h(t10, this, extensionRegistryLite);
            if (this.f15420b == this.f15421c) {
                return;
            }
            throw InvalidProtocolBufferException.parseFailure();
        } finally {
            this.f15421c = i10;
        }
    }

    private <T> void S(T t10, m0<T> m0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        CodedInputStream codedInputStream;
        int readUInt32 = this.f15419a.readUInt32();
        CodedInputStream codedInputStream2 = this.f15419a;
        if (codedInputStream2.recursionDepth < codedInputStream2.recursionLimit) {
            int pushLimit = codedInputStream2.pushLimit(readUInt32);
            this.f15419a.recursionDepth++;
            m0Var.h(t10, this, extensionRegistryLite);
            this.f15419a.checkLastTagWas(0);
            codedInputStream.recursionDepth--;
            this.f15419a.popLimit(pushLimit);
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    private Object T(WireFormat.FieldType fieldType, Class<?> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        switch (a.f15423a[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(f());
            case 2:
                return s();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(m());
            case 5:
                return Integer.valueOf(A());
            case 6:
                return Long.valueOf(b());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(t());
            case 9:
                return Long.valueOf(O());
            case 10:
                return y(cls, extensionRegistryLite);
            case 11:
                return Integer.valueOf(L());
            case 12:
                return Long.valueOf(h());
            case 13:
                return Integer.valueOf(n());
            case 14:
                return Long.valueOf(E());
            case 15:
                return P();
            case 16:
                return Integer.valueOf(j());
            case 17:
                return Long.valueOf(w());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private <T> T U(m0<T> m0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        T f10 = m0Var.f();
        R(f10, m0Var, extensionRegistryLite);
        m0Var.c(f10);
        return f10;
    }

    private <T> T V(m0<T> m0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        T f10 = m0Var.f();
        S(f10, m0Var, extensionRegistryLite);
        m0Var.c(f10);
        return f10;
    }

    private void X(int i10) throws IOException {
        if (this.f15419a.getTotalBytesRead() != i10) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private void Y(int i10) throws IOException {
        if (WireFormat.getTagWireType(this.f15420b) != i10) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    private void Z(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    private void a0(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.k0
    public int A() throws IOException {
        Y(5);
        return this.f15419a.readFixed32();
    }

    @Override // com.google.protobuf.k0
    public void B(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof r) {
            r rVar = (r) list;
            int tagWireType = WireFormat.getTagWireType(this.f15420b);
            if (tagWireType == 1) {
                do {
                    rVar.addLong(this.f15419a.readSFixed64());
                    if (this.f15419a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f15419a.readTag();
                } while (readTag2 == this.f15420b);
                this.f15422d = readTag2;
                return;
            } else if (tagWireType == 2) {
                int readUInt32 = this.f15419a.readUInt32();
                a0(readUInt32);
                int totalBytesRead = this.f15419a.getTotalBytesRead() + readUInt32;
                do {
                    rVar.addLong(this.f15419a.readSFixed64());
                } while (this.f15419a.getTotalBytesRead() < totalBytesRead);
                return;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f15420b);
        if (tagWireType2 == 1) {
            do {
                list.add(Long.valueOf(this.f15419a.readSFixed64()));
                if (this.f15419a.isAtEnd()) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == this.f15420b);
            this.f15422d = readTag;
        } else if (tagWireType2 == 2) {
            int readUInt322 = this.f15419a.readUInt32();
            a0(readUInt322);
            int totalBytesRead2 = this.f15419a.getTotalBytesRead() + readUInt322;
            do {
                list.add(Long.valueOf(this.f15419a.readSFixed64()));
            } while (this.f15419a.getTotalBytesRead() < totalBytesRead2);
        } else {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // com.google.protobuf.k0
    public void C(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof o) {
            o oVar = (o) list;
            int tagWireType = WireFormat.getTagWireType(this.f15420b);
            if (tagWireType == 0) {
                do {
                    oVar.addInt(this.f15419a.readInt32());
                    if (this.f15419a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f15419a.readTag();
                } while (readTag2 == this.f15420b);
                this.f15422d = readTag2;
                return;
            } else if (tagWireType == 2) {
                int totalBytesRead = this.f15419a.getTotalBytesRead() + this.f15419a.readUInt32();
                do {
                    oVar.addInt(this.f15419a.readInt32());
                } while (this.f15419a.getTotalBytesRead() < totalBytesRead);
                X(totalBytesRead);
                return;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f15420b);
        if (tagWireType2 == 0) {
            do {
                list.add(Integer.valueOf(this.f15419a.readInt32()));
                if (this.f15419a.isAtEnd()) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == this.f15420b);
            this.f15422d = readTag;
        } else if (tagWireType2 == 2) {
            int totalBytesRead2 = this.f15419a.getTotalBytesRead() + this.f15419a.readUInt32();
            do {
                list.add(Integer.valueOf(this.f15419a.readInt32()));
            } while (this.f15419a.getTotalBytesRead() < totalBytesRead2);
            X(totalBytesRead2);
        } else {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // com.google.protobuf.k0
    public void D(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof o) {
            o oVar = (o) list;
            int tagWireType = WireFormat.getTagWireType(this.f15420b);
            if (tagWireType == 2) {
                int readUInt32 = this.f15419a.readUInt32();
                Z(readUInt32);
                int totalBytesRead = this.f15419a.getTotalBytesRead() + readUInt32;
                do {
                    oVar.addInt(this.f15419a.readFixed32());
                } while (this.f15419a.getTotalBytesRead() < totalBytesRead);
                return;
            } else if (tagWireType == 5) {
                do {
                    oVar.addInt(this.f15419a.readFixed32());
                    if (this.f15419a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f15419a.readTag();
                } while (readTag2 == this.f15420b);
                this.f15422d = readTag2;
                return;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f15420b);
        if (tagWireType2 == 2) {
            int readUInt322 = this.f15419a.readUInt32();
            Z(readUInt322);
            int totalBytesRead2 = this.f15419a.getTotalBytesRead() + readUInt322;
            do {
                list.add(Integer.valueOf(this.f15419a.readFixed32()));
            } while (this.f15419a.getTotalBytesRead() < totalBytesRead2);
        } else if (tagWireType2 == 5) {
            do {
                list.add(Integer.valueOf(this.f15419a.readFixed32()));
                if (this.f15419a.isAtEnd()) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == this.f15420b);
            this.f15422d = readTag;
        } else {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // com.google.protobuf.k0
    public long E() throws IOException {
        Y(0);
        return this.f15419a.readSInt64();
    }

    @Override // com.google.protobuf.k0
    public String F() throws IOException {
        Y(2);
        return this.f15419a.readString();
    }

    @Override // com.google.protobuf.k0
    public int G() throws IOException {
        int i10 = this.f15422d;
        if (i10 != 0) {
            this.f15420b = i10;
            this.f15422d = 0;
        } else {
            this.f15420b = this.f15419a.readTag();
        }
        int i11 = this.f15420b;
        return (i11 == 0 || i11 == this.f15421c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : WireFormat.getTagFieldNumber(i11);
    }

    @Override // com.google.protobuf.k0
    public void H(List<String> list) throws IOException {
        W(list, false);
    }

    @Override // com.google.protobuf.k0
    public <T> void I(T t10, m0<T> m0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Y(2);
        S(t10, m0Var, extensionRegistryLite);
    }

    @Override // com.google.protobuf.k0
    public void J(List<Float> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof m) {
            m mVar = (m) list;
            int tagWireType = WireFormat.getTagWireType(this.f15420b);
            if (tagWireType == 2) {
                int readUInt32 = this.f15419a.readUInt32();
                Z(readUInt32);
                int totalBytesRead = this.f15419a.getTotalBytesRead() + readUInt32;
                do {
                    mVar.addFloat(this.f15419a.readFloat());
                } while (this.f15419a.getTotalBytesRead() < totalBytesRead);
                return;
            } else if (tagWireType == 5) {
                do {
                    mVar.addFloat(this.f15419a.readFloat());
                    if (this.f15419a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f15419a.readTag();
                } while (readTag2 == this.f15420b);
                this.f15422d = readTag2;
                return;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f15420b);
        if (tagWireType2 == 2) {
            int readUInt322 = this.f15419a.readUInt32();
            Z(readUInt322);
            int totalBytesRead2 = this.f15419a.getTotalBytesRead() + readUInt322;
            do {
                list.add(Float.valueOf(this.f15419a.readFloat()));
            } while (this.f15419a.getTotalBytesRead() < totalBytesRead2);
        } else if (tagWireType2 == 5) {
            do {
                list.add(Float.valueOf(this.f15419a.readFloat()));
                if (this.f15419a.isAtEnd()) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == this.f15420b);
            this.f15422d = readTag;
        } else {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // com.google.protobuf.k0
    public boolean K() throws IOException {
        int i10;
        if (this.f15419a.isAtEnd() || (i10 = this.f15420b) == this.f15421c) {
            return false;
        }
        return this.f15419a.skipField(i10);
    }

    @Override // com.google.protobuf.k0
    public int L() throws IOException {
        Y(5);
        return this.f15419a.readSFixed32();
    }

    @Override // com.google.protobuf.k0
    public void M(List<ByteString> list) throws IOException {
        int readTag;
        if (WireFormat.getTagWireType(this.f15420b) == 2) {
            do {
                list.add(s());
                if (this.f15419a.isAtEnd()) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == this.f15420b);
            this.f15422d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.protobuf.k0
    public void N(List<Double> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof h) {
            h hVar = (h) list;
            int tagWireType = WireFormat.getTagWireType(this.f15420b);
            if (tagWireType == 1) {
                do {
                    hVar.addDouble(this.f15419a.readDouble());
                    if (this.f15419a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f15419a.readTag();
                } while (readTag2 == this.f15420b);
                this.f15422d = readTag2;
                return;
            } else if (tagWireType == 2) {
                int readUInt32 = this.f15419a.readUInt32();
                a0(readUInt32);
                int totalBytesRead = this.f15419a.getTotalBytesRead() + readUInt32;
                do {
                    hVar.addDouble(this.f15419a.readDouble());
                } while (this.f15419a.getTotalBytesRead() < totalBytesRead);
                return;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f15420b);
        if (tagWireType2 == 1) {
            do {
                list.add(Double.valueOf(this.f15419a.readDouble()));
                if (this.f15419a.isAtEnd()) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == this.f15420b);
            this.f15422d = readTag;
        } else if (tagWireType2 == 2) {
            int readUInt322 = this.f15419a.readUInt32();
            a0(readUInt322);
            int totalBytesRead2 = this.f15419a.getTotalBytesRead() + readUInt322;
            do {
                list.add(Double.valueOf(this.f15419a.readDouble()));
            } while (this.f15419a.getTotalBytesRead() < totalBytesRead2);
        } else {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // com.google.protobuf.k0
    public long O() throws IOException {
        Y(0);
        return this.f15419a.readInt64();
    }

    @Override // com.google.protobuf.k0
    public String P() throws IOException {
        Y(2);
        return this.f15419a.readStringRequireUtf8();
    }

    public void W(List<String> list, boolean z10) throws IOException {
        int readTag;
        int readTag2;
        if (WireFormat.getTagWireType(this.f15420b) == 2) {
            if ((list instanceof LazyStringList) && !z10) {
                LazyStringList lazyStringList = (LazyStringList) list;
                do {
                    lazyStringList.add(s());
                    if (this.f15419a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f15419a.readTag();
                } while (readTag2 == this.f15420b);
                this.f15422d = readTag2;
                return;
            }
            do {
                list.add(z10 ? P() : F());
                if (this.f15419a.isAtEnd()) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == this.f15420b);
            this.f15422d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.protobuf.k0
    public int a() {
        return this.f15420b;
    }

    @Override // com.google.protobuf.k0
    public long b() throws IOException {
        Y(1);
        return this.f15419a.readFixed64();
    }

    @Override // com.google.protobuf.k0
    public void c(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof o) {
            o oVar = (o) list;
            int tagWireType = WireFormat.getTagWireType(this.f15420b);
            if (tagWireType == 2) {
                int readUInt32 = this.f15419a.readUInt32();
                Z(readUInt32);
                int totalBytesRead = this.f15419a.getTotalBytesRead() + readUInt32;
                do {
                    oVar.addInt(this.f15419a.readSFixed32());
                } while (this.f15419a.getTotalBytesRead() < totalBytesRead);
                return;
            } else if (tagWireType == 5) {
                do {
                    oVar.addInt(this.f15419a.readSFixed32());
                    if (this.f15419a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f15419a.readTag();
                } while (readTag2 == this.f15420b);
                this.f15422d = readTag2;
                return;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f15420b);
        if (tagWireType2 == 2) {
            int readUInt322 = this.f15419a.readUInt32();
            Z(readUInt322);
            int totalBytesRead2 = this.f15419a.getTotalBytesRead() + readUInt322;
            do {
                list.add(Integer.valueOf(this.f15419a.readSFixed32()));
            } while (this.f15419a.getTotalBytesRead() < totalBytesRead2);
        } else if (tagWireType2 == 5) {
            do {
                list.add(Integer.valueOf(this.f15419a.readSFixed32()));
                if (this.f15419a.isAtEnd()) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == this.f15420b);
            this.f15422d = readTag;
        } else {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // com.google.protobuf.k0
    public void d(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof r) {
            r rVar = (r) list;
            int tagWireType = WireFormat.getTagWireType(this.f15420b);
            if (tagWireType == 0) {
                do {
                    rVar.addLong(this.f15419a.readSInt64());
                    if (this.f15419a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f15419a.readTag();
                } while (readTag2 == this.f15420b);
                this.f15422d = readTag2;
                return;
            } else if (tagWireType == 2) {
                int totalBytesRead = this.f15419a.getTotalBytesRead() + this.f15419a.readUInt32();
                do {
                    rVar.addLong(this.f15419a.readSInt64());
                } while (this.f15419a.getTotalBytesRead() < totalBytesRead);
                X(totalBytesRead);
                return;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f15420b);
        if (tagWireType2 == 0) {
            do {
                list.add(Long.valueOf(this.f15419a.readSInt64()));
                if (this.f15419a.isAtEnd()) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == this.f15420b);
            this.f15422d = readTag;
        } else if (tagWireType2 == 2) {
            int totalBytesRead2 = this.f15419a.getTotalBytesRead() + this.f15419a.readUInt32();
            do {
                list.add(Long.valueOf(this.f15419a.readSInt64()));
            } while (this.f15419a.getTotalBytesRead() < totalBytesRead2);
            X(totalBytesRead2);
        } else {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.k0
    @Deprecated
    public <T> void e(List<T> list, m0<T> m0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int readTag;
        if (WireFormat.getTagWireType(this.f15420b) == 3) {
            int i10 = this.f15420b;
            do {
                list.add(U(m0Var, extensionRegistryLite));
                if (this.f15419a.isAtEnd() || this.f15422d != 0) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == i10);
            this.f15422d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.protobuf.k0
    public boolean f() throws IOException {
        Y(0);
        return this.f15419a.readBool();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.k0
    public <T> void g(List<T> list, m0<T> m0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int readTag;
        if (WireFormat.getTagWireType(this.f15420b) == 2) {
            int i10 = this.f15420b;
            do {
                list.add(V(m0Var, extensionRegistryLite));
                if (this.f15419a.isAtEnd() || this.f15422d != 0) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == i10);
            this.f15422d = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.protobuf.k0
    public long h() throws IOException {
        Y(1);
        return this.f15419a.readSFixed64();
    }

    @Override // com.google.protobuf.k0
    public void i(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof r) {
            r rVar = (r) list;
            int tagWireType = WireFormat.getTagWireType(this.f15420b);
            if (tagWireType == 0) {
                do {
                    rVar.addLong(this.f15419a.readUInt64());
                    if (this.f15419a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f15419a.readTag();
                } while (readTag2 == this.f15420b);
                this.f15422d = readTag2;
                return;
            } else if (tagWireType == 2) {
                int totalBytesRead = this.f15419a.getTotalBytesRead() + this.f15419a.readUInt32();
                do {
                    rVar.addLong(this.f15419a.readUInt64());
                } while (this.f15419a.getTotalBytesRead() < totalBytesRead);
                X(totalBytesRead);
                return;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f15420b);
        if (tagWireType2 == 0) {
            do {
                list.add(Long.valueOf(this.f15419a.readUInt64()));
                if (this.f15419a.isAtEnd()) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == this.f15420b);
            this.f15422d = readTag;
        } else if (tagWireType2 == 2) {
            int totalBytesRead2 = this.f15419a.getTotalBytesRead() + this.f15419a.readUInt32();
            do {
                list.add(Long.valueOf(this.f15419a.readUInt64()));
            } while (this.f15419a.getTotalBytesRead() < totalBytesRead2);
            X(totalBytesRead2);
        } else {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // com.google.protobuf.k0
    public int j() throws IOException {
        Y(0);
        return this.f15419a.readUInt32();
    }

    @Override // com.google.protobuf.k0
    public void k(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof r) {
            r rVar = (r) list;
            int tagWireType = WireFormat.getTagWireType(this.f15420b);
            if (tagWireType == 0) {
                do {
                    rVar.addLong(this.f15419a.readInt64());
                    if (this.f15419a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f15419a.readTag();
                } while (readTag2 == this.f15420b);
                this.f15422d = readTag2;
                return;
            } else if (tagWireType == 2) {
                int totalBytesRead = this.f15419a.getTotalBytesRead() + this.f15419a.readUInt32();
                do {
                    rVar.addLong(this.f15419a.readInt64());
                } while (this.f15419a.getTotalBytesRead() < totalBytesRead);
                X(totalBytesRead);
                return;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f15420b);
        if (tagWireType2 == 0) {
            do {
                list.add(Long.valueOf(this.f15419a.readInt64()));
                if (this.f15419a.isAtEnd()) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == this.f15420b);
            this.f15422d = readTag;
        } else if (tagWireType2 == 2) {
            int totalBytesRead2 = this.f15419a.getTotalBytesRead() + this.f15419a.readUInt32();
            do {
                list.add(Long.valueOf(this.f15419a.readInt64()));
            } while (this.f15419a.getTotalBytesRead() < totalBytesRead2);
            X(totalBytesRead2);
        } else {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // com.google.protobuf.k0
    public void l(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof o) {
            o oVar = (o) list;
            int tagWireType = WireFormat.getTagWireType(this.f15420b);
            if (tagWireType == 0) {
                do {
                    oVar.addInt(this.f15419a.readEnum());
                    if (this.f15419a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f15419a.readTag();
                } while (readTag2 == this.f15420b);
                this.f15422d = readTag2;
                return;
            } else if (tagWireType == 2) {
                int totalBytesRead = this.f15419a.getTotalBytesRead() + this.f15419a.readUInt32();
                do {
                    oVar.addInt(this.f15419a.readEnum());
                } while (this.f15419a.getTotalBytesRead() < totalBytesRead);
                X(totalBytesRead);
                return;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f15420b);
        if (tagWireType2 == 0) {
            do {
                list.add(Integer.valueOf(this.f15419a.readEnum()));
                if (this.f15419a.isAtEnd()) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == this.f15420b);
            this.f15422d = readTag;
        } else if (tagWireType2 == 2) {
            int totalBytesRead2 = this.f15419a.getTotalBytesRead() + this.f15419a.readUInt32();
            do {
                list.add(Integer.valueOf(this.f15419a.readEnum()));
            } while (this.f15419a.getTotalBytesRead() < totalBytesRead2);
            X(totalBytesRead2);
        } else {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // com.google.protobuf.k0
    public int m() throws IOException {
        Y(0);
        return this.f15419a.readEnum();
    }

    @Override // com.google.protobuf.k0
    public int n() throws IOException {
        Y(0);
        return this.f15419a.readSInt32();
    }

    @Override // com.google.protobuf.k0
    public void o(List<Boolean> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof d) {
            d dVar = (d) list;
            int tagWireType = WireFormat.getTagWireType(this.f15420b);
            if (tagWireType == 0) {
                do {
                    dVar.addBoolean(this.f15419a.readBool());
                    if (this.f15419a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f15419a.readTag();
                } while (readTag2 == this.f15420b);
                this.f15422d = readTag2;
                return;
            } else if (tagWireType == 2) {
                int totalBytesRead = this.f15419a.getTotalBytesRead() + this.f15419a.readUInt32();
                do {
                    dVar.addBoolean(this.f15419a.readBool());
                } while (this.f15419a.getTotalBytesRead() < totalBytesRead);
                X(totalBytesRead);
                return;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f15420b);
        if (tagWireType2 == 0) {
            do {
                list.add(Boolean.valueOf(this.f15419a.readBool()));
                if (this.f15419a.isAtEnd()) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == this.f15420b);
            this.f15422d = readTag;
        } else if (tagWireType2 == 2) {
            int totalBytesRead2 = this.f15419a.getTotalBytesRead() + this.f15419a.readUInt32();
            do {
                list.add(Boolean.valueOf(this.f15419a.readBool()));
            } while (this.f15419a.getTotalBytesRead() < totalBytesRead2);
            X(totalBytesRead2);
        } else {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // com.google.protobuf.k0
    @Deprecated
    public <T> T p(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Y(3);
        return (T) U(h0.a().c(cls), extensionRegistryLite);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <K, V> void q(java.util.Map<K, V> r8, com.google.protobuf.MapEntryLite.b<K, V> r9, com.google.protobuf.ExtensionRegistryLite r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            com.google.protobuf.CodedInputStream r1 = r7.f15419a
            int r1 = r1.readUInt32()
            com.google.protobuf.CodedInputStream r2 = r7.f15419a
            int r1 = r2.pushLimit(r1)
            K r2 = r9.f15364b
            V r3 = r9.f15366d
        L14:
            int r4 = r7.G()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            com.google.protobuf.CodedInputStream r5 = r7.f15419a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.isAtEnd()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.K()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
        L3a:
            com.google.protobuf.WireFormat$FieldType r4 = r9.f15365c     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            V r5 = r9.f15366d     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            com.google.protobuf.WireFormat$FieldType r4 = r9.f15363a     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.T(r4, r5, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.K()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            com.google.protobuf.CodedInputStream r8 = r7.f15419a
            r8.popLimit(r1)
            return
        L65:
            r8 = move-exception
            com.google.protobuf.CodedInputStream r9 = r7.f15419a
            r9.popLimit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.q(java.util.Map, com.google.protobuf.MapEntryLite$b, com.google.protobuf.ExtensionRegistryLite):void");
    }

    @Override // com.google.protobuf.k0
    public void r(List<String> list) throws IOException {
        W(list, true);
    }

    @Override // com.google.protobuf.k0
    public double readDouble() throws IOException {
        Y(1);
        return this.f15419a.readDouble();
    }

    @Override // com.google.protobuf.k0
    public float readFloat() throws IOException {
        Y(5);
        return this.f15419a.readFloat();
    }

    @Override // com.google.protobuf.k0
    public ByteString s() throws IOException {
        Y(2);
        return this.f15419a.readBytes();
    }

    @Override // com.google.protobuf.k0
    public int t() throws IOException {
        Y(0);
        return this.f15419a.readInt32();
    }

    @Override // com.google.protobuf.k0
    public void u(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof r) {
            r rVar = (r) list;
            int tagWireType = WireFormat.getTagWireType(this.f15420b);
            if (tagWireType == 1) {
                do {
                    rVar.addLong(this.f15419a.readFixed64());
                    if (this.f15419a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f15419a.readTag();
                } while (readTag2 == this.f15420b);
                this.f15422d = readTag2;
                return;
            } else if (tagWireType == 2) {
                int readUInt32 = this.f15419a.readUInt32();
                a0(readUInt32);
                int totalBytesRead = this.f15419a.getTotalBytesRead() + readUInt32;
                do {
                    rVar.addLong(this.f15419a.readFixed64());
                } while (this.f15419a.getTotalBytesRead() < totalBytesRead);
                return;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f15420b);
        if (tagWireType2 == 1) {
            do {
                list.add(Long.valueOf(this.f15419a.readFixed64()));
                if (this.f15419a.isAtEnd()) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == this.f15420b);
            this.f15422d = readTag;
        } else if (tagWireType2 == 2) {
            int readUInt322 = this.f15419a.readUInt32();
            a0(readUInt322);
            int totalBytesRead2 = this.f15419a.getTotalBytesRead() + readUInt322;
            do {
                list.add(Long.valueOf(this.f15419a.readFixed64()));
            } while (this.f15419a.getTotalBytesRead() < totalBytesRead2);
        } else {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // com.google.protobuf.k0
    public void v(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof o) {
            o oVar = (o) list;
            int tagWireType = WireFormat.getTagWireType(this.f15420b);
            if (tagWireType == 0) {
                do {
                    oVar.addInt(this.f15419a.readSInt32());
                    if (this.f15419a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f15419a.readTag();
                } while (readTag2 == this.f15420b);
                this.f15422d = readTag2;
                return;
            } else if (tagWireType == 2) {
                int totalBytesRead = this.f15419a.getTotalBytesRead() + this.f15419a.readUInt32();
                do {
                    oVar.addInt(this.f15419a.readSInt32());
                } while (this.f15419a.getTotalBytesRead() < totalBytesRead);
                X(totalBytesRead);
                return;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f15420b);
        if (tagWireType2 == 0) {
            do {
                list.add(Integer.valueOf(this.f15419a.readSInt32()));
                if (this.f15419a.isAtEnd()) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == this.f15420b);
            this.f15422d = readTag;
        } else if (tagWireType2 == 2) {
            int totalBytesRead2 = this.f15419a.getTotalBytesRead() + this.f15419a.readUInt32();
            do {
                list.add(Integer.valueOf(this.f15419a.readSInt32()));
            } while (this.f15419a.getTotalBytesRead() < totalBytesRead2);
            X(totalBytesRead2);
        } else {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // com.google.protobuf.k0
    public long w() throws IOException {
        Y(0);
        return this.f15419a.readUInt64();
    }

    @Override // com.google.protobuf.k0
    public void x(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof o) {
            o oVar = (o) list;
            int tagWireType = WireFormat.getTagWireType(this.f15420b);
            if (tagWireType == 0) {
                do {
                    oVar.addInt(this.f15419a.readUInt32());
                    if (this.f15419a.isAtEnd()) {
                        return;
                    }
                    readTag2 = this.f15419a.readTag();
                } while (readTag2 == this.f15420b);
                this.f15422d = readTag2;
                return;
            } else if (tagWireType == 2) {
                int totalBytesRead = this.f15419a.getTotalBytesRead() + this.f15419a.readUInt32();
                do {
                    oVar.addInt(this.f15419a.readUInt32());
                } while (this.f15419a.getTotalBytesRead() < totalBytesRead);
                X(totalBytesRead);
                return;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
        int tagWireType2 = WireFormat.getTagWireType(this.f15420b);
        if (tagWireType2 == 0) {
            do {
                list.add(Integer.valueOf(this.f15419a.readUInt32()));
                if (this.f15419a.isAtEnd()) {
                    return;
                }
                readTag = this.f15419a.readTag();
            } while (readTag == this.f15420b);
            this.f15422d = readTag;
        } else if (tagWireType2 == 2) {
            int totalBytesRead2 = this.f15419a.getTotalBytesRead() + this.f15419a.readUInt32();
            do {
                list.add(Integer.valueOf(this.f15419a.readUInt32()));
            } while (this.f15419a.getTotalBytesRead() < totalBytesRead2);
            X(totalBytesRead2);
        } else {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // com.google.protobuf.k0
    public <T> T y(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Y(2);
        return (T) V(h0.a().c(cls), extensionRegistryLite);
    }

    @Override // com.google.protobuf.k0
    public <T> void z(T t10, m0<T> m0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Y(3);
        R(t10, m0Var, extensionRegistryLite);
    }
}
