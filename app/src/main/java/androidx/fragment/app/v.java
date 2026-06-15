package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;
/* compiled from: LogWriter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class v extends Writer {

    /* renamed from: a  reason: collision with root package name */
    private final String f3500a;

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f3501b = new StringBuilder(128);

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(String str) {
        this.f3500a = str;
    }

    private void a() {
        if (this.f3501b.length() > 0) {
            Log.d(this.f3500a, this.f3501b.toString());
            StringBuilder sb = this.f3501b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f3501b.append(c10);
            }
        }
    }
}
