package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.LazyField;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: MessageSetSchema.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class a0<T> implements m0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final MessageLite f15396a;

    /* renamed from: b  reason: collision with root package name */
    private final r0<?, ?> f15397b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15398c;

    /* renamed from: d  reason: collision with root package name */
    private final j<?> f15399d;

    private a0(r0<?, ?> r0Var, j<?> jVar, MessageLite messageLite) {
        this.f15397b = r0Var;
        this.f15398c = jVar.e(messageLite);
        this.f15399d = jVar;
        this.f15396a = messageLite;
    }

    private <UT, UB> int k(r0<UT, UB> r0Var, T t10) {
        return r0Var.i(r0Var.g(t10));
    }

    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void l(r0<UT, UB> r0Var, j<ET> jVar, T t10, k0 k0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        UB f10 = r0Var.f(t10);
        FieldSet<ET> d10 = jVar.d(t10);
        do {
            try {
                if (k0Var.G() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                r0Var.o(t10, f10);
            }
        } while (n(k0Var, extensionRegistryLite, jVar, d10, r0Var, f10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> a0<T> m(r0<?, ?> r0Var, j<?> jVar, MessageLite messageLite) {
        return new a0<>(r0Var, jVar, messageLite);
    }

    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> boolean n(k0 k0Var, ExtensionRegistryLite extensionRegistryLite, j<ET> jVar, FieldSet<ET> fieldSet, r0<UT, UB> r0Var, UB ub) throws IOException {
        int a10 = k0Var.a();
        if (a10 != WireFormat.MESSAGE_SET_ITEM_TAG) {
            if (WireFormat.getTagWireType(a10) == 2) {
                Object b10 = jVar.b(extensionRegistryLite, this.f15396a, WireFormat.getTagFieldNumber(a10));
                if (b10 != null) {
                    jVar.h(k0Var, b10, extensionRegistryLite, fieldSet);
                    return true;
                }
                return r0Var.m(ub, k0Var);
            }
            return k0Var.K();
        }
        int i10 = 0;
        Object obj = null;
        ByteString byteString = null;
        while (k0Var.G() != Integer.MAX_VALUE) {
            int a11 = k0Var.a();
            if (a11 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                i10 = k0Var.j();
                obj = jVar.b(extensionRegistryLite, this.f15396a, i10);
            } else if (a11 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (obj != null) {
                    jVar.h(k0Var, obj, extensionRegistryLite, fieldSet);
                } else {
                    byteString = k0Var.s();
                }
            } else if (!k0Var.K()) {
                break;
            }
        }
        if (k0Var.a() == WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            if (byteString != null) {
                if (obj != null) {
                    jVar.i(byteString, obj, extensionRegistryLite, fieldSet);
                } else {
                    r0Var.d(ub, i10, byteString);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.invalidEndTag();
    }

    private <UT, UB> void o(r0<UT, UB> r0Var, T t10, Writer writer) throws IOException {
        r0Var.s(r0Var.g(t10), writer);
    }

    @Override // com.google.protobuf.m0
    public void a(T t10, T t11) {
        o0.G(this.f15397b, t10, t11);
        if (this.f15398c) {
            o0.E(this.f15399d, t10, t11);
        }
    }

    @Override // com.google.protobuf.m0
    public void b(T t10, Writer writer) throws IOException {
        Iterator<Map.Entry<?, Object>> x10 = this.f15399d.c(t10).x();
        while (x10.hasNext()) {
            Map.Entry<?, Object> next = x10.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) next.getKey();
            if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldDescriptorLite.isRepeated() && !fieldDescriptorLite.isPacked()) {
                if (next instanceof LazyField.b) {
                    writer.c(fieldDescriptorLite.getNumber(), ((LazyField.b) next).a().toByteString());
                } else {
                    writer.c(fieldDescriptorLite.getNumber(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        o(this.f15397b, t10, writer);
    }

    @Override // com.google.protobuf.m0
    public void c(T t10) {
        this.f15397b.j(t10);
        this.f15399d.f(t10);
    }

    @Override // com.google.protobuf.m0
    public final boolean d(T t10) {
        return this.f15399d.c(t10).t();
    }

    @Override // com.google.protobuf.m0
    public int e(T t10) {
        int k10 = k(this.f15397b, t10) + 0;
        return this.f15398c ? k10 + this.f15399d.c(t10).k() : k10;
    }

    @Override // com.google.protobuf.m0
    public T f() {
        MessageLite messageLite = this.f15396a;
        if (messageLite instanceof GeneratedMessageLite) {
            return (T) ((GeneratedMessageLite) messageLite).newMutableInstance();
        }
        return (T) messageLite.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.m0
    public int g(T t10) {
        int hashCode = this.f15397b.g(t10).hashCode();
        return this.f15398c ? (hashCode * 53) + this.f15399d.c(t10).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.m0
    public void h(T t10, k0 k0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        l(this.f15397b, this.f15399d, t10, k0Var, extensionRegistryLite);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb A[EDGE_INSN: B:57:0x00cb->B:34:0x00cb ?: BREAK  , SYNTHETIC] */
    @Override // com.google.protobuf.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(T r11, byte[] r12, int r13, int r14, com.google.protobuf.c.b r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            com.google.protobuf.UnknownFieldSetLite r1 = r0.unknownFields
            com.google.protobuf.UnknownFieldSetLite r2 = com.google.protobuf.UnknownFieldSetLite.getDefaultInstance()
            if (r1 != r2) goto L11
            com.google.protobuf.UnknownFieldSetLite r1 = com.google.protobuf.UnknownFieldSetLite.newInstance()
            r0.unknownFields = r1
        L11:
            com.google.protobuf.GeneratedMessageLite$ExtendableMessage r11 = (com.google.protobuf.GeneratedMessageLite.ExtendableMessage) r11
            com.google.protobuf.FieldSet r11 = r11.ensureExtensionsAreMutable()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = com.google.protobuf.c.I(r12, r13, r15)
            int r13 = r15.f15404a
            int r3 = com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = com.google.protobuf.WireFormat.getTagWireType(r13)
            if (r3 != r5) goto L66
            com.google.protobuf.j<?> r2 = r10.f15399d
            com.google.protobuf.ExtensionRegistryLite r3 = r15.f15407d
            com.google.protobuf.MessageLite r5 = r10.f15396a
            int r6 = com.google.protobuf.WireFormat.getTagFieldNumber(r13)
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            com.google.protobuf.GeneratedMessageLite$GeneratedExtension r8 = (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) r8
            if (r8 == 0) goto L5b
            com.google.protobuf.h0 r13 = com.google.protobuf.h0.a()
            com.google.protobuf.MessageLite r2 = r8.getMessageDefaultInstance()
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.m0 r13 = r13.c(r2)
            int r13 = com.google.protobuf.c.p(r13, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$b r2 = r8.descriptor
            java.lang.Object r3 = r15.f15406c
            r11.D(r2, r3)
            goto L64
        L5b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.c.G(r2, r3, r4, r5, r6, r7)
        L64:
            r2 = r8
            goto L19
        L66:
            int r13 = com.google.protobuf.c.P(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = com.google.protobuf.c.I(r12, r4, r15)
            int r6 = r15.f15404a
            int r7 = com.google.protobuf.WireFormat.getTagFieldNumber(r6)
            int r8 = com.google.protobuf.WireFormat.getTagWireType(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            com.google.protobuf.h0 r6 = com.google.protobuf.h0.a()
            com.google.protobuf.MessageLite r7 = r2.getMessageDefaultInstance()
            java.lang.Class r7 = r7.getClass()
            com.google.protobuf.m0 r6 = r6.c(r7)
            int r4 = com.google.protobuf.c.p(r6, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$b r6 = r2.descriptor
            java.lang.Object r7 = r15.f15406c
            r11.D(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = com.google.protobuf.c.b(r12, r4, r15)
            java.lang.Object r3 = r15.f15406c
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = com.google.protobuf.c.I(r12, r4, r15)
            int r13 = r15.f15404a
            com.google.protobuf.j<?> r2 = r10.f15399d
            com.google.protobuf.ExtensionRegistryLite r6 = r15.f15407d
            com.google.protobuf.MessageLite r7 = r10.f15396a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            com.google.protobuf.GeneratedMessageLite$GeneratedExtension r2 = (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) r2
            goto L6d
        Lc1:
            int r7 = com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = com.google.protobuf.c.P(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = com.google.protobuf.WireFormat.makeTag(r13, r5)
            r1.storeField(r13, r3)
        Ld4:
            r13 = r4
            goto L19
        Ld7:
            if (r13 != r14) goto Lda
            return
        Lda:
            com.google.protobuf.InvalidProtocolBufferException r11 = com.google.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a0.i(java.lang.Object, byte[], int, int, com.google.protobuf.c$b):void");
    }

    @Override // com.google.protobuf.m0
    public boolean j(T t10, T t11) {
        if (this.f15397b.g(t10).equals(this.f15397b.g(t11))) {
            if (this.f15398c) {
                return this.f15399d.c(t10).equals(this.f15399d.c(t11));
            }
            return true;
        }
        return false;
    }
}
