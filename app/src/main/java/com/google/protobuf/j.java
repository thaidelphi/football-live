package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.FieldSet.FieldDescriptorLite;
import java.io.IOException;
import java.util.Map;
/* compiled from: ExtensionSchema.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
abstract class j<T extends FieldSet.FieldDescriptorLite<T>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int a(Map.Entry<?, ?> entry);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract FieldSet<T> c(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract FieldSet<T> d(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean e(MessageLite messageLite);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <UT, UB> UB g(Object obj, k0 k0Var, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet, UB ub, r0<UT, UB> r0Var) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void h(k0 k0Var, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void j(Writer writer, Map.Entry<?, ?> entry) throws IOException;
}
