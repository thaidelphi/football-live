package pl.droidsonroids.gif;

import android.annotation.SuppressLint;
import android.content.Context;
/* compiled from: LibraryLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class f {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static Context f30026a;

    private static Context a() {
        if (f30026a == null) {
            try {
                f30026a = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e8) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e8);
            }
        }
        return f30026a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context) {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            if (context == null) {
                context = a();
            }
            g.h(context);
        }
    }
}
