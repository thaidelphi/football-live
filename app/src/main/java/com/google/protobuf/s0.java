package com.google.protobuf;

import java.io.IOException;
/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class s0 extends r0<UnknownFieldSetLite, UnknownFieldSetLite> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    /* renamed from: A */
    public UnknownFieldSetLite g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    /* renamed from: B */
    public int h(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    /* renamed from: C */
    public int i(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSizeAsMessageSet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    /* renamed from: D */
    public UnknownFieldSetLite k(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        if (UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite2)) {
            return unknownFieldSetLite;
        }
        if (UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite)) {
            return UnknownFieldSetLite.mutableCopyOf(unknownFieldSetLite, unknownFieldSetLite2);
        }
        return unknownFieldSetLite.mergeFrom(unknownFieldSetLite2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    /* renamed from: E */
    public UnknownFieldSetLite n() {
        return UnknownFieldSetLite.newInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    /* renamed from: F */
    public void o(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        p(obj, unknownFieldSetLite);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    /* renamed from: G */
    public void p(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    /* renamed from: H */
    public UnknownFieldSetLite r(UnknownFieldSetLite unknownFieldSetLite) {
        unknownFieldSetLite.makeImmutable();
        return unknownFieldSetLite;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    /* renamed from: I */
    public void s(UnknownFieldSetLite unknownFieldSetLite, Writer writer) throws IOException {
        unknownFieldSetLite.writeAsMessageSetTo(writer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    /* renamed from: J */
    public void t(UnknownFieldSetLite unknownFieldSetLite, Writer writer) throws IOException {
        unknownFieldSetLite.writeTo(writer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    public void j(Object obj) {
        g(obj).makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    public boolean q(k0 k0Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    /* renamed from: u */
    public void a(UnknownFieldSetLite unknownFieldSetLite, int i10, int i11) {
        unknownFieldSetLite.storeField(WireFormat.makeTag(i10, 5), Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    /* renamed from: v */
    public void b(UnknownFieldSetLite unknownFieldSetLite, int i10, long j10) {
        unknownFieldSetLite.storeField(WireFormat.makeTag(i10, 1), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    /* renamed from: w */
    public void c(UnknownFieldSetLite unknownFieldSetLite, int i10, UnknownFieldSetLite unknownFieldSetLite2) {
        unknownFieldSetLite.storeField(WireFormat.makeTag(i10, 3), unknownFieldSetLite2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    /* renamed from: x */
    public void d(UnknownFieldSetLite unknownFieldSetLite, int i10, ByteString byteString) {
        unknownFieldSetLite.storeField(WireFormat.makeTag(i10, 2), byteString);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    /* renamed from: y */
    public void e(UnknownFieldSetLite unknownFieldSetLite, int i10, long j10) {
        unknownFieldSetLite.storeField(WireFormat.makeTag(i10, 0), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r0
    /* renamed from: z */
    public UnknownFieldSetLite f(Object obj) {
        UnknownFieldSetLite g10 = g(obj);
        if (g10 == UnknownFieldSetLite.getDefaultInstance()) {
            UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
            p(obj, newInstance);
            return newInstance;
        }
        return g10;
    }
}
