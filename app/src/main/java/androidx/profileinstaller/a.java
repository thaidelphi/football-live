package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;
/* compiled from: BenchmarkOperation.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class a {

    /* compiled from: BenchmarkOperation.java */
    /* renamed from: androidx.profileinstaller.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class C0068a {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* compiled from: BenchmarkOperation.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class b {
        static File a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    static boolean a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z10 = true;
            for (File file2 : listFiles) {
                z10 = a(file2) && z10;
            }
            return z10;
        }
        file.delete();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context, ProfileInstallReceiver.a aVar) {
        File cacheDir;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            cacheDir = b.a(context);
        } else if (i10 >= 23) {
            cacheDir = C0068a.a(context);
        } else {
            cacheDir = context.getCacheDir();
        }
        if (a(cacheDir)) {
            aVar.a(14, null);
        } else {
            aVar.a(15, null);
        }
    }
}
