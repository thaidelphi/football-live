package x1;

import java.io.File;
/* compiled from: FileService.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class a {
    public boolean a(File file) {
        return file.exists();
    }

    public File b(String str) {
        return new File(str);
    }

    public long c(File file) {
        return file.length();
    }
}
