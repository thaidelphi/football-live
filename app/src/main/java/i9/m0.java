package i9;
/* compiled from: SystemProps.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final /* synthetic */ class m0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int f26672a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f26672a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
