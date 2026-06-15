package r8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utils.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class m extends l {
    public static final File k(File file, File target, boolean z10, int i10) {
        kotlin.jvm.internal.n.f(file, "<this>");
        kotlin.jvm.internal.n.f(target, "target");
        if (file.exists()) {
            if (target.exists()) {
                if (z10) {
                    if (!target.delete()) {
                        throw new e(file, target, "Tried to overwrite the destination, but failed to delete it.");
                    }
                } else {
                    throw new e(file, target, "The destination file already exists.");
                }
            }
            if (file.isDirectory()) {
                if (!target.mkdirs()) {
                    throw new f(file, target, "Failed to create target directory.");
                }
            } else {
                File parentFile = target.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(target);
                    b.a(fileInputStream, fileOutputStream, i10);
                    c.a(fileOutputStream, null);
                    c.a(fileInputStream, null);
                } finally {
                }
            }
            return target;
        }
        throw new o(file, null, "The source file doesn't exist.", 2, null);
    }

    public static /* synthetic */ File l(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return k(file, file2, z10, i10);
    }

    public static final File m(File file, File relative) {
        boolean z10;
        kotlin.jvm.internal.n.f(file, "<this>");
        kotlin.jvm.internal.n.f(relative, "relative");
        if (j.b(relative)) {
            return relative;
        }
        String file2 = file.toString();
        kotlin.jvm.internal.n.e(file2, "this.toString()");
        if (!(file2.length() == 0)) {
            z10 = b9.p.z(file2, File.separatorChar, false, 2, null);
            if (!z10) {
                return new File(file2 + File.separatorChar + relative);
            }
        }
        return new File(file2 + relative);
    }

    public static File n(File file, String relative) {
        kotlin.jvm.internal.n.f(file, "<this>");
        kotlin.jvm.internal.n.f(relative, "relative");
        return m(file, new File(relative));
    }
}
