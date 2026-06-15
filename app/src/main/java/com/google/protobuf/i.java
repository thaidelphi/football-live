package com.google.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExtensionRegistryFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f15432a = e();

    public static ExtensionRegistryLite a() {
        ExtensionRegistryLite c10 = c("newInstance");
        return c10 != null ? c10 : new ExtensionRegistryLite();
    }

    public static ExtensionRegistryLite b() {
        ExtensionRegistryLite c10 = c("getEmptyRegistry");
        return c10 != null ? c10 : ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
    }

    private static final ExtensionRegistryLite c(String str) {
        Class<?> cls = f15432a;
        if (cls == null) {
            return null;
        }
        try {
            return (ExtensionRegistryLite) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(ExtensionRegistryLite extensionRegistryLite) {
        Class<?> cls = f15432a;
        return cls != null && cls.isAssignableFrom(extensionRegistryLite.getClass());
    }

    static Class<?> e() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
