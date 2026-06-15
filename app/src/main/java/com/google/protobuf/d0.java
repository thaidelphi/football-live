package com.google.protobuf;
/* compiled from: NewInstanceSchemas.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private static final b0 f15411a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final b0 f15412b = new c0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 a() {
        return f15411a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 b() {
        return f15412b;
    }

    private static b0 c() {
        try {
            return (b0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
