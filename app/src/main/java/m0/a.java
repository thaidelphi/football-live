package m0;

import android.os.Build;
import android.os.ext.SdkExtensions;
/* compiled from: AdServicesInfo.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f27617a = new a();

    /* compiled from: AdServicesInfo.kt */
    /* renamed from: m0.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class C0311a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0311a f27618a = new C0311a();

        private C0311a() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private a() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0311a.f27618a.a();
        }
        return 0;
    }
}
