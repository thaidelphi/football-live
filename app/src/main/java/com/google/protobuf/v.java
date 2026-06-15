package com.google.protobuf;
/* compiled from: MapFieldSchemas.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class v {

    /* renamed from: a  reason: collision with root package name */
    private static final t f15538a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final t f15539b = new u();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t a() {
        return f15538a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t b() {
        return f15539b;
    }

    private static t c() {
        try {
            return (t) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
