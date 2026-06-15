package u9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import y9.l;
import y9.r;
import y9.s;
/* compiled from: FileSystem.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f31618a = new C0365a();

    /* compiled from: FileSystem.java */
    /* renamed from: u9.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class C0365a implements a {
        C0365a() {
        }

        @Override // u9.a
        public void a(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        a(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }

        @Override // u9.a
        public boolean b(File file) {
            return file.exists();
        }

        @Override // u9.a
        public r c(File file) throws FileNotFoundException {
            try {
                return l.a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return l.a(file);
            }
        }

        @Override // u9.a
        public long d(File file) {
            return file.length();
        }

        @Override // u9.a
        public s e(File file) throws FileNotFoundException {
            return l.j(file);
        }

        @Override // u9.a
        public r f(File file) throws FileNotFoundException {
            try {
                return l.f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return l.f(file);
            }
        }

        @Override // u9.a
        public void g(File file, File file2) throws IOException {
            h(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // u9.a
        public void h(File file) throws IOException {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("failed to delete " + file);
        }
    }

    void a(File file) throws IOException;

    boolean b(File file);

    r c(File file) throws FileNotFoundException;

    long d(File file);

    s e(File file) throws FileNotFoundException;

    r f(File file) throws FileNotFoundException;

    void g(File file, File file2) throws IOException;

    void h(File file) throws IOException;
}
