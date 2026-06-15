package com.google.protobuf;
/* compiled from: ExtensionSchemas.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final j<?> f15441a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static final j<?> f15442b = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j<?> a() {
        j<?> jVar = f15442b;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j<?> b() {
        return f15441a;
    }

    private static j<?> c() {
        try {
            return (j) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
