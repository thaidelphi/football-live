package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ArrayDecoders.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArrayDecoders.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15403a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f15403a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15403a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15403a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15403a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15403a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15403a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15403a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15403a[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15403a[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15403a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15403a[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15403a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15403a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15403a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15403a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15403a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15403a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f15403a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArrayDecoders.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f15404a;

        /* renamed from: b  reason: collision with root package name */
        public long f15405b;

        /* renamed from: c  reason: collision with root package name */
        public Object f15406c;

        /* renamed from: d  reason: collision with root package name */
        public final ExtensionRegistryLite f15407d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(ExtensionRegistryLite extensionRegistryLite) {
            Objects.requireNonNull(extensionRegistryLite);
            this.f15407d = extensionRegistryLite;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        o oVar = (o) protobufList;
        int I = I(bArr, i11, bVar);
        oVar.addInt(CodedInputStream.decodeZigZag32(bVar.f15404a));
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f15404a) {
                break;
            }
            I = I(bArr, I2, bVar);
            oVar.addInt(CodedInputStream.decodeZigZag32(bVar.f15404a));
        }
        return I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        r rVar = (r) protobufList;
        int L = L(bArr, i11, bVar);
        rVar.addLong(CodedInputStream.decodeZigZag64(bVar.f15405b));
        while (L < i12) {
            int I = I(bArr, L, bVar);
            if (i10 != bVar.f15404a) {
                break;
            }
            L = L(bArr, I, bVar);
            rVar.addLong(CodedInputStream.decodeZigZag64(bVar.f15405b));
        }
        return L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int C(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f15404a;
        if (i11 >= 0) {
            if (i11 == 0) {
                bVar.f15406c = "";
                return I;
            }
            bVar.f15406c = new String(bArr, I, i11, Internal.UTF_8);
            return I + i11;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x001a -> B:9:0x001b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int D(int r4, byte[] r5, int r6, int r7, com.google.protobuf.Internal.ProtobufList<?> r8, com.google.protobuf.c.b r9) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            int r6 = I(r5, r6, r9)
            int r0 = r9.f15404a
            if (r0 < 0) goto L45
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.Internal.UTF_8
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L1a:
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L44
            int r0 = I(r5, r6, r9)
            int r2 = r9.f15404a
            if (r4 == r2) goto L26
            goto L44
        L26:
            int r6 = I(r5, r0, r9)
            int r0 = r9.f15404a
            if (r0 < 0) goto L3f
            if (r0 != 0) goto L34
            r8.add(r1)
            goto L1b
        L34:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.Internal.UTF_8
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L1a
        L3f:
            com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r4
        L44:
            return r6
        L45:
            com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.c.D(int, byte[], int, int, com.google.protobuf.Internal$ProtobufList, com.google.protobuf.c$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0023). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int E(int r5, byte[] r6, int r7, int r8, com.google.protobuf.Internal.ProtobufList<?> r9, com.google.protobuf.c.b r10) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            int r7 = I(r6, r7, r10)
            int r0 = r10.f15404a
            if (r0 < 0) goto L5f
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r9.add(r1)
            goto L23
        L10:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.u0.u(r6, r7, r2)
            if (r3 == 0) goto L5a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.Internal.UTF_8
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L22:
            r7 = r2
        L23:
            if (r7 >= r8) goto L59
            int r0 = I(r6, r7, r10)
            int r2 = r10.f15404a
            if (r5 == r2) goto L2e
            goto L59
        L2e:
            int r7 = I(r6, r0, r10)
            int r0 = r10.f15404a
            if (r0 < 0) goto L54
            if (r0 != 0) goto L3c
            r9.add(r1)
            goto L23
        L3c:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.u0.u(r6, r7, r2)
            if (r3 == 0) goto L4f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.Internal.UTF_8
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L22
        L4f:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r5
        L54:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r5
        L59:
            return r7
        L5a:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r5
        L5f:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.c.E(int, byte[], int, int, com.google.protobuf.Internal$ProtobufList, com.google.protobuf.c$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f15404a;
        if (i11 >= 0) {
            if (i11 == 0) {
                bVar.f15406c = "";
                return I;
            }
            bVar.f15406c = u0.h(bArr, I, i11);
            return I + i11;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int G(int i10, byte[] bArr, int i11, int i12, UnknownFieldSetLite unknownFieldSetLite, b bVar) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i10) != 0) {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                int L = L(bArr, i11, bVar);
                unknownFieldSetLite.storeField(i10, Long.valueOf(bVar.f15405b));
                return L;
            } else if (tagWireType == 1) {
                unknownFieldSetLite.storeField(i10, Long.valueOf(j(bArr, i11)));
                return i11 + 8;
            } else if (tagWireType == 2) {
                int I = I(bArr, i11, bVar);
                int i13 = bVar.f15404a;
                if (i13 >= 0) {
                    if (i13 <= bArr.length - I) {
                        if (i13 == 0) {
                            unknownFieldSetLite.storeField(i10, ByteString.EMPTY);
                        } else {
                            unknownFieldSetLite.storeField(i10, ByteString.copyFrom(bArr, I, i13));
                        }
                        return I + i13;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            } else if (tagWireType != 3) {
                if (tagWireType == 5) {
                    unknownFieldSetLite.storeField(i10, Integer.valueOf(h(bArr, i11)));
                    return i11 + 4;
                }
                throw InvalidProtocolBufferException.invalidTag();
            } else {
                UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
                int i14 = (i10 & (-8)) | 4;
                int i15 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int I2 = I(bArr, i11, bVar);
                    int i16 = bVar.f15404a;
                    if (i16 == i14) {
                        i15 = i16;
                        i11 = I2;
                        break;
                    }
                    i15 = i16;
                    i11 = G(i16, bArr, I2, i12, newInstance, bVar);
                }
                if (i11 <= i12 && i15 == i14) {
                    unknownFieldSetLite.storeField(i10, newInstance);
                    return i11;
                }
                throw InvalidProtocolBufferException.parseFailure();
            }
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(int i10, byte[] bArr, int i11, b bVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            bVar.f15404a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            bVar.f15404a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            bVar.f15404a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            bVar.f15404a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                bVar.f15404a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int I(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            bVar.f15404a = b10;
            return i11;
        }
        return H(b10, bArr, i11, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int J(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        o oVar = (o) protobufList;
        int I = I(bArr, i11, bVar);
        oVar.addInt(bVar.f15404a);
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f15404a) {
                break;
            }
            I = I(bArr, I2, bVar);
            oVar.addInt(bVar.f15404a);
        }
        return I;
    }

    static int K(long j10, byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= (b11 & Byte.MAX_VALUE) << i12;
            i11 = i13;
            b10 = b11;
        }
        bVar.f15405b = j11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int L(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            bVar.f15405b = j10;
            return i11;
        }
        return K(j10, bArr, i11, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int M(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        r rVar = (r) protobufList;
        int L = L(bArr, i11, bVar);
        rVar.addLong(bVar.f15405b);
        while (L < i12) {
            int I = I(bArr, L, bVar);
            if (i10 != bVar.f15404a) {
                break;
            }
            L = L(bArr, I, bVar);
            rVar.addLong(bVar.f15405b);
        }
        return L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int N(Object obj, m0 m0Var, byte[] bArr, int i10, int i11, int i12, b bVar) throws IOException {
        int h02 = ((z) m0Var).h0(obj, bArr, i10, i11, i12, bVar);
        bVar.f15406c = obj;
        return h02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int O(Object obj, m0 m0Var, byte[] bArr, int i10, int i11, b bVar) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = H(i13, bArr, i12, bVar);
            i13 = bVar.f15404a;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = i13 + i14;
            m0Var.i(obj, bArr, i14, i15, bVar);
            bVar.f15406c = obj;
            return i15;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int P(int i10, byte[] bArr, int i11, int i12, b bVar) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i10) != 0) {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                return i11 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        int i13 = (i10 & (-8)) | 4;
                        int i14 = 0;
                        while (i11 < i12) {
                            i11 = I(bArr, i11, bVar);
                            i14 = bVar.f15404a;
                            if (i14 == i13) {
                                break;
                            }
                            i11 = P(i14, bArr, i11, i12, bVar);
                        }
                        if (i11 > i12 || i14 != i13) {
                            throw InvalidProtocolBufferException.parseFailure();
                        }
                        return i11;
                    }
                    return I(bArr, i11, bVar) + bVar.f15404a;
                }
                return i11 + 8;
            }
            return L(bArr, i11, bVar);
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        d dVar = (d) protobufList;
        int L = L(bArr, i11, bVar);
        dVar.addBoolean(bVar.f15405b != 0);
        while (L < i12) {
            int I = I(bArr, L, bVar);
            if (i10 != bVar.f15404a) {
                break;
            }
            L = L(bArr, I, bVar);
            dVar.addBoolean(bVar.f15405b != 0);
        }
        return L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f15404a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - I) {
                if (i11 == 0) {
                    bVar.f15406c = ByteString.EMPTY;
                    return I;
                }
                bVar.f15406c = ByteString.copyFrom(bArr, I, i11);
                return I + i11;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x001b -> B:10:0x001c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r2, byte[] r3, int r4, int r5, com.google.protobuf.Internal.ProtobufList<?> r6, com.google.protobuf.c.b r7) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            int r4 = I(r3, r4, r7)
            int r0 = r7.f15404a
            if (r0 < 0) goto L53
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L4e
            if (r0 != 0) goto L14
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.EMPTY
            r6.add(r0)
            goto L1c
        L14:
            com.google.protobuf.ByteString r1 = com.google.protobuf.ByteString.copyFrom(r3, r4, r0)
            r6.add(r1)
        L1b:
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L4d
            int r0 = I(r3, r4, r7)
            int r1 = r7.f15404a
            if (r2 == r1) goto L27
            goto L4d
        L27:
            int r4 = I(r3, r0, r7)
            int r0 = r7.f15404a
            if (r0 < 0) goto L48
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L43
            if (r0 != 0) goto L3b
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.EMPTY
            r6.add(r0)
            goto L1c
        L3b:
            com.google.protobuf.ByteString r1 = com.google.protobuf.ByteString.copyFrom(r3, r4, r0)
            r6.add(r1)
            goto L1b
        L43:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r2
        L48:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r2
        L4d:
            return r4
        L4e:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r2
        L53:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.c.c(int, byte[], int, int, com.google.protobuf.Internal$ProtobufList, com.google.protobuf.c$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double d(byte[] bArr, int i10) {
        return Double.longBitsToDouble(j(bArr, i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        h hVar = (h) protobufList;
        hVar.addDouble(d(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f15404a) {
                break;
            }
            hVar.addDouble(d(bArr, I));
            i13 = I + 8;
        }
        return i13;
    }

    static int f(int i10, byte[] bArr, int i11, int i12, GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, r0<UnknownFieldSetLite, UnknownFieldSetLite> r0Var, b bVar) throws IOException {
        FieldSet<GeneratedMessageLite.b> fieldSet = extendableMessage.extensions;
        int i13 = i10 >>> 3;
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (a.f15403a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    h hVar = new h();
                    int s10 = s(bArr, i11, hVar, bVar);
                    fieldSet.D(generatedExtension.descriptor, hVar);
                    return s10;
                case 2:
                    m mVar = new m();
                    int v10 = v(bArr, i11, mVar, bVar);
                    fieldSet.D(generatedExtension.descriptor, mVar);
                    return v10;
                case 3:
                case 4:
                    r rVar = new r();
                    int z10 = z(bArr, i11, rVar, bVar);
                    fieldSet.D(generatedExtension.descriptor, rVar);
                    return z10;
                case 5:
                case 6:
                    o oVar = new o();
                    int y10 = y(bArr, i11, oVar, bVar);
                    fieldSet.D(generatedExtension.descriptor, oVar);
                    return y10;
                case 7:
                case 8:
                    r rVar2 = new r();
                    int u10 = u(bArr, i11, rVar2, bVar);
                    fieldSet.D(generatedExtension.descriptor, rVar2);
                    return u10;
                case 9:
                case 10:
                    o oVar2 = new o();
                    int t10 = t(bArr, i11, oVar2, bVar);
                    fieldSet.D(generatedExtension.descriptor, oVar2);
                    return t10;
                case 11:
                    d dVar = new d();
                    int r10 = r(bArr, i11, dVar, bVar);
                    fieldSet.D(generatedExtension.descriptor, dVar);
                    return r10;
                case 12:
                    o oVar3 = new o();
                    int w10 = w(bArr, i11, oVar3, bVar);
                    fieldSet.D(generatedExtension.descriptor, oVar3);
                    return w10;
                case 13:
                    r rVar3 = new r();
                    int x10 = x(bArr, i11, rVar3, bVar);
                    fieldSet.D(generatedExtension.descriptor, rVar3);
                    return x10;
                case 14:
                    o oVar4 = new o();
                    int y11 = y(bArr, i11, oVar4, bVar);
                    o0.z(extendableMessage, i13, oVar4, generatedExtension.descriptor.getEnumType(), null, r0Var);
                    fieldSet.D(generatedExtension.descriptor, oVar4);
                    return y11;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
        }
        Object obj = null;
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            i11 = I(bArr, i11, bVar);
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(bVar.f15404a) == null) {
                o0.L(extendableMessage, i13, bVar.f15404a, null, r0Var);
                return i11;
            }
            obj = Integer.valueOf(bVar.f15404a);
        } else {
            switch (a.f15403a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    obj = Double.valueOf(d(bArr, i11));
                    i11 += 8;
                    break;
                case 2:
                    obj = Float.valueOf(l(bArr, i11));
                    i11 += 4;
                    break;
                case 3:
                case 4:
                    i11 = L(bArr, i11, bVar);
                    obj = Long.valueOf(bVar.f15405b);
                    break;
                case 5:
                case 6:
                    i11 = I(bArr, i11, bVar);
                    obj = Integer.valueOf(bVar.f15404a);
                    break;
                case 7:
                case 8:
                    obj = Long.valueOf(j(bArr, i11));
                    i11 += 8;
                    break;
                case 9:
                case 10:
                    obj = Integer.valueOf(h(bArr, i11));
                    i11 += 4;
                    break;
                case 11:
                    i11 = L(bArr, i11, bVar);
                    obj = Boolean.valueOf(bVar.f15405b != 0);
                    break;
                case 12:
                    i11 = I(bArr, i11, bVar);
                    obj = Integer.valueOf(CodedInputStream.decodeZigZag32(bVar.f15404a));
                    break;
                case 13:
                    i11 = L(bArr, i11, bVar);
                    obj = Long.valueOf(CodedInputStream.decodeZigZag64(bVar.f15405b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i11 = b(bArr, i11, bVar);
                    obj = bVar.f15406c;
                    break;
                case 16:
                    i11 = C(bArr, i11, bVar);
                    obj = bVar.f15406c;
                    break;
                case 17:
                    int i14 = (i13 << 3) | 4;
                    m0 c10 = h0.a().c(generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int n10 = n(c10, bArr, i11, i12, i14, bVar);
                        fieldSet.a(generatedExtension.descriptor, bVar.f15406c);
                        return n10;
                    }
                    Object j10 = fieldSet.j(generatedExtension.descriptor);
                    if (j10 == null) {
                        j10 = c10.f();
                        fieldSet.D(generatedExtension.descriptor, j10);
                    }
                    return N(j10, c10, bArr, i11, i12, i14, bVar);
                case 18:
                    m0 c11 = h0.a().c(generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int p10 = p(c11, bArr, i11, i12, bVar);
                        fieldSet.a(generatedExtension.descriptor, bVar.f15406c);
                        return p10;
                    }
                    Object j11 = fieldSet.j(generatedExtension.descriptor);
                    if (j11 == null) {
                        j11 = c11.f();
                        fieldSet.D(generatedExtension.descriptor, j11);
                    }
                    return O(j11, c11, bArr, i11, i12, bVar);
            }
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.a(generatedExtension.descriptor, obj);
        } else {
            fieldSet.D(generatedExtension.descriptor, obj);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(int i10, byte[] bArr, int i11, int i12, Object obj, MessageLite messageLite, r0<UnknownFieldSetLite, UnknownFieldSetLite> r0Var, b bVar) throws IOException {
        GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber = bVar.f15407d.findLiteExtensionByNumber(messageLite, i10 >>> 3);
        if (findLiteExtensionByNumber == null) {
            return G(i10, bArr, i11, i12, z.x(obj), bVar);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        return f(i10, bArr, i11, i12, extendableMessage, findLiteExtensionByNumber, r0Var, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        o oVar = (o) protobufList;
        oVar.addInt(h(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f15404a) {
                break;
            }
            oVar.addInt(h(bArr, I));
            i13 = I + 4;
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long j(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        r rVar = (r) protobufList;
        rVar.addLong(j(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f15404a) {
                break;
            }
            rVar.addLong(j(bArr, I));
            i13 = I + 8;
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float l(byte[] bArr, int i10) {
        return Float.intBitsToFloat(h(bArr, i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        m mVar = (m) protobufList;
        mVar.addFloat(l(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f15404a) {
                break;
            }
            mVar.addFloat(l(bArr, I));
            i13 = I + 4;
        }
        return i13;
    }

    static int n(m0 m0Var, byte[] bArr, int i10, int i11, int i12, b bVar) throws IOException {
        Object f10 = m0Var.f();
        int N = N(f10, m0Var, bArr, i10, i11, i12, bVar);
        m0Var.c(f10);
        bVar.f15406c = f10;
        return N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(m0 m0Var, int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        int i13 = (i10 & (-8)) | 4;
        int n10 = n(m0Var, bArr, i11, i12, i13, bVar);
        protobufList.add(bVar.f15406c);
        while (n10 < i12) {
            int I = I(bArr, n10, bVar);
            if (i10 != bVar.f15404a) {
                break;
            }
            n10 = n(m0Var, bArr, I, i12, i13, bVar);
            protobufList.add(bVar.f15406c);
        }
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(m0 m0Var, byte[] bArr, int i10, int i11, b bVar) throws IOException {
        Object f10 = m0Var.f();
        int O = O(f10, m0Var, bArr, i10, i11, bVar);
        m0Var.c(f10);
        bVar.f15406c = f10;
        return O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(m0<?> m0Var, int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        int p10 = p(m0Var, bArr, i11, i12, bVar);
        protobufList.add(bVar.f15406c);
        while (p10 < i12) {
            int I = I(bArr, p10, bVar);
            if (i10 != bVar.f15404a) {
                break;
            }
            p10 = p(m0Var, bArr, I, i12, bVar);
            protobufList.add(bVar.f15406c);
        }
        return p10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        d dVar = (d) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f15404a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            dVar.addBoolean(bVar.f15405b != 0);
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        h hVar = (h) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f15404a + I;
        while (I < i11) {
            hVar.addDouble(d(bArr, I));
            I += 8;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        o oVar = (o) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f15404a + I;
        while (I < i11) {
            oVar.addInt(h(bArr, I));
            I += 4;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        r rVar = (r) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f15404a + I;
        while (I < i11) {
            rVar.addLong(j(bArr, I));
            I += 8;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        m mVar = (m) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f15404a + I;
        while (I < i11) {
            mVar.addFloat(l(bArr, I));
            I += 4;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        o oVar = (o) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f15404a + I;
        while (I < i11) {
            I = I(bArr, I, bVar);
            oVar.addInt(CodedInputStream.decodeZigZag32(bVar.f15404a));
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        r rVar = (r) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f15404a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            rVar.addLong(CodedInputStream.decodeZigZag64(bVar.f15405b));
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        o oVar = (o) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f15404a + I;
        while (I < i11) {
            I = I(bArr, I, bVar);
            oVar.addInt(bVar.f15404a);
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        r rVar = (r) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f15404a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            rVar.addLong(bVar.f15405b);
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}
