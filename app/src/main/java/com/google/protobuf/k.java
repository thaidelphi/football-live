package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ExtensionSchemaLite.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class k extends j<GeneratedMessageLite.b> {

    /* compiled from: ExtensionSchemaLite.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15440a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f15440a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15440a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15440a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15440a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15440a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15440a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15440a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15440a[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15440a[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15440a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15440a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15440a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15440a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15440a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15440a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15440a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15440a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f15440a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.j
    public int a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.b) entry.getKey()).getNumber();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.j
    public Object b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i10) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.j
    public FieldSet<GeneratedMessageLite.b> c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.j
    public FieldSet<GeneratedMessageLite.b> d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.j
    public boolean e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.j
    public void f(Object obj) {
        c(obj).y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.j
    public <UT, UB> UB g(Object obj, k0 k0Var, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.b> fieldSet, UB ub, r0<UT, UB> r0Var) throws IOException {
        Object j10;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        int number = generatedExtension.getNumber();
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (a.f15440a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    k0Var.N(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    k0Var.J(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    k0Var.k(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    k0Var.i(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    k0Var.C(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    k0Var.u(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    k0Var.D(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    k0Var.o(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    k0Var.x(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    k0Var.c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    k0Var.B(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    k0Var.v(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    k0Var.d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    k0Var.l(arrayList);
                    ub = (UB) o0.z(obj, number, arrayList, generatedExtension.descriptor.getEnumType(), ub, r0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
            fieldSet.D(generatedExtension.descriptor, arrayList);
        } else {
            Object obj3 = null;
            if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
                int t10 = k0Var.t();
                if (generatedExtension.descriptor.getEnumType().findValueByNumber(t10) == null) {
                    return (UB) o0.L(obj, number, t10, ub, r0Var);
                }
                obj3 = Integer.valueOf(t10);
            } else {
                switch (a.f15440a[generatedExtension.getLiteType().ordinal()]) {
                    case 1:
                        obj3 = Double.valueOf(k0Var.readDouble());
                        break;
                    case 2:
                        obj3 = Float.valueOf(k0Var.readFloat());
                        break;
                    case 3:
                        obj3 = Long.valueOf(k0Var.O());
                        break;
                    case 4:
                        obj3 = Long.valueOf(k0Var.w());
                        break;
                    case 5:
                        obj3 = Integer.valueOf(k0Var.t());
                        break;
                    case 6:
                        obj3 = Long.valueOf(k0Var.b());
                        break;
                    case 7:
                        obj3 = Integer.valueOf(k0Var.A());
                        break;
                    case 8:
                        obj3 = Boolean.valueOf(k0Var.f());
                        break;
                    case 9:
                        obj3 = Integer.valueOf(k0Var.j());
                        break;
                    case 10:
                        obj3 = Integer.valueOf(k0Var.L());
                        break;
                    case 11:
                        obj3 = Long.valueOf(k0Var.h());
                        break;
                    case 12:
                        obj3 = Integer.valueOf(k0Var.n());
                        break;
                    case 13:
                        obj3 = Long.valueOf(k0Var.E());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj3 = k0Var.s();
                        break;
                    case 16:
                        obj3 = k0Var.F();
                        break;
                    case 17:
                        if (!generatedExtension.isRepeated()) {
                            Object j11 = fieldSet.j(generatedExtension.descriptor);
                            if (j11 instanceof GeneratedMessageLite) {
                                m0 d10 = h0.a().d(j11);
                                if (!((GeneratedMessageLite) j11).isMutable()) {
                                    Object f10 = d10.f();
                                    d10.a(f10, j11);
                                    fieldSet.D(generatedExtension.descriptor, f10);
                                    j11 = f10;
                                }
                                k0Var.z(j11, d10, extensionRegistryLite);
                                return ub;
                            }
                        }
                        obj3 = k0Var.p(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    case 18:
                        if (!generatedExtension.isRepeated()) {
                            Object j12 = fieldSet.j(generatedExtension.descriptor);
                            if (j12 instanceof GeneratedMessageLite) {
                                m0 d11 = h0.a().d(j12);
                                if (!((GeneratedMessageLite) j12).isMutable()) {
                                    Object f11 = d11.f();
                                    d11.a(f11, j12);
                                    fieldSet.D(generatedExtension.descriptor, f11);
                                    j12 = f11;
                                }
                                k0Var.I(j12, d11, extensionRegistryLite);
                                return ub;
                            }
                        }
                        obj3 = k0Var.y(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                }
            }
            if (generatedExtension.isRepeated()) {
                fieldSet.a(generatedExtension.descriptor, obj3);
            } else {
                int i10 = a.f15440a[generatedExtension.getLiteType().ordinal()];
                if ((i10 == 17 || i10 == 18) && (j10 = fieldSet.j(generatedExtension.descriptor)) != null) {
                    obj3 = Internal.mergeMessage(j10, obj3);
                }
                fieldSet.D(generatedExtension.descriptor, obj3);
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.j
    public void h(k0 k0Var, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.b> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.D(generatedExtension.descriptor, k0Var.y(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.j
    public void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.b> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite.Builder newBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
        CodedInputStream newCodedInput = byteString.newCodedInput();
        newBuilderForType.mergeFrom(newCodedInput, extensionRegistryLite);
        fieldSet.D(generatedExtension.descriptor, newBuilderForType.buildPartial());
        newCodedInput.checkLastTagWas(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.j
    public void j(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.b bVar = (GeneratedMessageLite.b) entry.getKey();
        if (bVar.isRepeated()) {
            switch (a.f15440a[bVar.getLiteType().ordinal()]) {
                case 1:
                    o0.P(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    return;
                case 2:
                    o0.T(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    return;
                case 3:
                    o0.W(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    return;
                case 4:
                    o0.e0(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    return;
                case 5:
                    o0.V(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    return;
                case 6:
                    o0.S(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    return;
                case 7:
                    o0.R(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    return;
                case 8:
                    o0.N(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    return;
                case 9:
                    o0.d0(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    return;
                case 10:
                    o0.Y(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    return;
                case 11:
                    o0.Z(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    return;
                case 12:
                    o0.a0(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    return;
                case 13:
                    o0.b0(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    return;
                case 14:
                    o0.V(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    return;
                case 15:
                    o0.O(bVar.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 16:
                    o0.c0(bVar.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    o0.U(bVar.getNumber(), (List) entry.getValue(), writer, h0.a().c(list.get(0).getClass()));
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    o0.X(bVar.getNumber(), (List) entry.getValue(), writer, h0.a().c(list2.get(0).getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (a.f15440a[bVar.getLiteType().ordinal()]) {
            case 1:
                writer.t(bVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                writer.I(bVar.getNumber(), ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                writer.A(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 4:
                writer.g(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 5:
                writer.k(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                writer.x(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 7:
                writer.d(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                writer.B(bVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                writer.s(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                writer.C(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                writer.l(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 12:
                writer.O(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                writer.p(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 14:
                writer.k(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                writer.j(bVar.getNumber(), (ByteString) entry.getValue());
                return;
            case 16:
                writer.f(bVar.getNumber(), (String) entry.getValue());
                return;
            case 17:
                writer.i(bVar.getNumber(), entry.getValue(), h0.a().c(entry.getValue().getClass()));
                return;
            case 18:
                writer.w(bVar.getNumber(), entry.getValue(), h0.a().c(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }
}
