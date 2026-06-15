package com.google.protobuf;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnknownFieldSchema.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class r0<T, B> {
    abstract void a(B b10, int i10, int i11);

    abstract void b(B b10, int i10, long j10);

    abstract void c(B b10, int i10, T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(B b10, int i10, ByteString byteString);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e(B b10, int i10, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B f(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int h(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int i(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void j(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T k(T t10, T t11);

    final void l(B b10, k0 k0Var) throws IOException {
        while (k0Var.G() != Integer.MAX_VALUE && m(b10, k0Var)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(B b10, k0 k0Var) throws IOException {
        int a10 = k0Var.a();
        int tagFieldNumber = WireFormat.getTagFieldNumber(a10);
        int tagWireType = WireFormat.getTagWireType(a10);
        if (tagWireType == 0) {
            e(b10, tagFieldNumber, k0Var.O());
            return true;
        } else if (tagWireType == 1) {
            b(b10, tagFieldNumber, k0Var.b());
            return true;
        } else if (tagWireType == 2) {
            d(b10, tagFieldNumber, k0Var.s());
            return true;
        } else if (tagWireType != 3) {
            if (tagWireType != 4) {
                if (tagWireType == 5) {
                    a(b10, tagFieldNumber, k0Var.A());
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            return false;
        } else {
            B n10 = n();
            int makeTag = WireFormat.makeTag(tagFieldNumber, 4);
            l(n10, k0Var);
            if (makeTag == k0Var.a()) {
                c(b10, tagFieldNumber, r(n10));
                return true;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    abstract B n();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void o(Object obj, B b10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void p(Object obj, T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean q(k0 k0Var);

    abstract T r(B b10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void s(T t10, Writer writer) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void t(T t10, Writer writer) throws IOException;
}
