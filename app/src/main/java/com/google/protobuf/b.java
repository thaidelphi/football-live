package com.google.protobuf;
/* compiled from: Android.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f15400a;

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f15401b = a("libcore.io.Memory");

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f15402c;

    static {
        f15402c = (f15400a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> b() {
        return f15401b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        return f15400a || !(f15401b == null || f15402c);
    }
}
