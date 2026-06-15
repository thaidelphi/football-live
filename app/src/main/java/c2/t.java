package c2;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: StreamEncoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class t implements w1.d<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final z1.b f5403a;

    public t(z1.b bVar) {
        this.f5403a = bVar;
    }

    @Override // w1.d
    /* renamed from: c */
    public boolean b(InputStream inputStream, File file, w1.h hVar) {
        byte[] bArr = (byte[]) this.f5403a.c(65536, byte[].class);
        boolean z10 = false;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        } catch (IOException e8) {
                            e = e8;
                            fileOutputStream = fileOutputStream2;
                            if (Log.isLoggable("StreamEncoder", 3)) {
                                Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            this.f5403a.put(bArr);
                            return z10;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            this.f5403a.put(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream2.close();
                    z10 = true;
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            } catch (IOException e10) {
                e = e10;
            }
            this.f5403a.put(bArr);
            return z10;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
