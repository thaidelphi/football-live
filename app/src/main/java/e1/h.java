package e1;

import android.content.Context;
import android.os.Build;
import androidx.work.p;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* compiled from: WorkDatabasePathHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final String f24866a = p.f("WrkDbPathHelper");

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f24867b = {"-journal", "-shm", "-wal"};

    public static File a(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return b(context);
        }
        return c(context, "androidx.work.workdb");
    }

    public static File b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    private static File c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    public static String d() {
        return "androidx.work.workdb";
    }

    public static void e(Context context) {
        String format;
        File b10 = b(context);
        if (Build.VERSION.SDK_INT < 23 || !b10.exists()) {
            return;
        }
        p.c().a(f24866a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
        Map<File, File> f10 = f(context);
        for (File file : f10.keySet()) {
            File file2 = f10.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    p.c().h(f24866a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                }
                if (file.renameTo(file2)) {
                    format = String.format("Migrated %s to %s", file, file2);
                } else {
                    format = String.format("Renaming %s to %s failed", file, file2);
                }
                p.c().a(f24866a, format, new Throwable[0]);
            }
        }
    }

    public static Map<File, File> f(Context context) {
        File b10;
        File a10;
        String[] strArr;
        HashMap hashMap = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            hashMap.put(b(context), a(context));
            for (String str : f24867b) {
                hashMap.put(new File(b10.getPath() + str), new File(a10.getPath() + str));
            }
        }
        return hashMap;
    }
}
