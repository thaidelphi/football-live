package androidx.core.util;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: AtomicFile.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final File f2783a;

    /* renamed from: b  reason: collision with root package name */
    private final File f2784b;

    /* renamed from: c  reason: collision with root package name */
    private final File f2785c;

    public a(File file) {
        this.f2783a = file;
        this.f2784b = new File(file.getPath() + ".new");
        this.f2785c = new File(file.getPath() + ".bak");
    }

    private static void c(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    private static boolean e(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!e(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e8) {
            Log.e("AtomicFile", "Failed to close file output stream", e8);
        }
        if (this.f2784b.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + this.f2784b);
    }

    public void b(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!e(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e8) {
            Log.e("AtomicFile", "Failed to close file output stream", e8);
        }
        c(this.f2784b, this.f2783a);
    }

    public FileOutputStream d() throws IOException {
        if (this.f2785c.exists()) {
            c(this.f2785c, this.f2783a);
        }
        try {
            return new FileOutputStream(this.f2784b);
        } catch (FileNotFoundException unused) {
            if (this.f2784b.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.f2784b);
                } catch (FileNotFoundException e8) {
                    throw new IOException("Failed to create new file " + this.f2784b, e8);
                }
            }
            throw new IOException("Failed to create directory for " + this.f2784b);
        }
    }
}
