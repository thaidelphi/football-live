package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class StructuralMessageInfo implements w {

    /* renamed from: a  reason: collision with root package name */
    private final ProtoSyntax f15375a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15376b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f15377c;

    /* renamed from: d  reason: collision with root package name */
    private final FieldInfo[] f15378d;

    /* renamed from: e  reason: collision with root package name */
    private final MessageLite f15379e;

    StructuralMessageInfo(ProtoSyntax protoSyntax, boolean z10, int[] iArr, FieldInfo[] fieldInfoArr, Object obj) {
        this.f15375a = protoSyntax;
        this.f15376b = z10;
        this.f15377c = iArr;
        this.f15378d = fieldInfoArr;
        this.f15379e = (MessageLite) Internal.checkNotNull(obj, "defaultInstance");
    }

    @Override // com.google.protobuf.w
    public boolean a() {
        return this.f15376b;
    }

    @Override // com.google.protobuf.w
    public MessageLite b() {
        return this.f15379e;
    }

    public int[] c() {
        return this.f15377c;
    }

    public FieldInfo[] d() {
        return this.f15378d;
    }

    @Override // com.google.protobuf.w
    public ProtoSyntax getSyntax() {
        return this.f15375a;
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Builder {
        private int[] checkInitialized;
        private Object defaultInstance;
        private final List<FieldInfo> fields;
        private boolean messageSetWireFormat;
        private ProtoSyntax syntax;
        private boolean wasBuilt;

        public Builder() {
            this.checkInitialized = null;
            this.fields = new ArrayList();
        }

        public StructuralMessageInfo build() {
            if (!this.wasBuilt) {
                if (this.syntax != null) {
                    this.wasBuilt = true;
                    Collections.sort(this.fields);
                    return new StructuralMessageInfo(this.syntax, this.messageSetWireFormat, this.checkInitialized, (FieldInfo[]) this.fields.toArray(new FieldInfo[0]), this.defaultInstance);
                }
                throw new IllegalStateException("Must specify a proto syntax");
            }
            throw new IllegalStateException("Builder can only build once");
        }

        public void withCheckInitialized(int[] iArr) {
            this.checkInitialized = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.defaultInstance = obj;
        }

        public void withField(FieldInfo fieldInfo) {
            if (!this.wasBuilt) {
                this.fields.add(fieldInfo);
                return;
            }
            throw new IllegalStateException("Builder can only build once");
        }

        public void withMessageSetWireFormat(boolean z10) {
            this.messageSetWireFormat = z10;
        }

        public void withSyntax(ProtoSyntax protoSyntax) {
            this.syntax = (ProtoSyntax) Internal.checkNotNull(protoSyntax, "syntax");
        }

        public Builder(int i10) {
            this.checkInitialized = null;
            this.fields = new ArrayList(i10);
        }
    }
}
