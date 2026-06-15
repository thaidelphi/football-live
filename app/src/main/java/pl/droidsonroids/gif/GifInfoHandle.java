package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import com.ironsource.b9;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.FileDescriptor;
import java.io.IOException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class GifInfoHandle {

    /* renamed from: a  reason: collision with root package name */
    private volatile long f29971a;

    static {
        f.b(null);
    }

    GifInfoHandle(String str) throws GifIOException {
        this.f29971a = openFile(str);
    }

    private static native void free(long j10);

    private static native int getCurrentFrameIndex(long j10);

    private static native int getCurrentLoop(long j10);

    private static native int getCurrentPosition(long j10);

    private static native int getDuration(long j10);

    private static native int getHeight(long j10);

    private static native int getLoopCount(long j10);

    private static native int getNativeErrorCode(long j10);

    private static native int getNumberOfFrames(long j10);

    private static native long[] getSavedState(long j10);

    private static native int getWidth(long j10);

    private static native boolean isOpaque(long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static GifInfoHandle m(ContentResolver contentResolver, Uri uri) throws IOException {
        if (b9.h.f16640b.equals(uri.getScheme())) {
            return new GifInfoHandle(uri.getPath());
        }
        return new GifInfoHandle(contentResolver.openAssetFileDescriptor(uri, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ));
    }

    static native long openFd(FileDescriptor fileDescriptor, long j10) throws GifIOException;

    static native long openFile(String str) throws GifIOException;

    private static native long renderFrame(long j10, Bitmap bitmap);

    private static native boolean reset(long j10);

    private static native long restoreRemainder(long j10);

    private static native int restoreSavedState(long j10, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j10);

    private static native void seekToTime(long j10, int i10, Bitmap bitmap);

    private static native void setLoopCount(long j10, char c10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int a() {
        return getCurrentFrameIndex(this.f29971a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int b() {
        return getCurrentLoop(this.f29971a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int c() {
        return getCurrentPosition(this.f29971a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int d() {
        return getDuration(this.f29971a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int e() {
        return getHeight(this.f29971a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int f() {
        return getLoopCount(this.f29971a);
    }

    protected void finalize() throws Throwable {
        try {
            n();
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int g() {
        return getNativeErrorCode(this.f29971a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int h() {
        return getNumberOfFrames(this.f29971a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long[] i() {
        return getSavedState(this.f29971a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int j() {
        return getWidth(this.f29971a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean k() {
        return isOpaque(this.f29971a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean l() {
        return this.f29971a == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void n() {
        free(this.f29971a);
        this.f29971a = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long o(Bitmap bitmap) {
        return renderFrame(this.f29971a, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean p() {
        return reset(this.f29971a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long q() {
        return restoreRemainder(this.f29971a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int r(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f29971a, jArr, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void s() {
        saveRemainder(this.f29971a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void t(int i10, Bitmap bitmap) {
        seekToTime(this.f29971a, i10, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i10) {
        if (i10 >= 0 && i10 <= 65535) {
            synchronized (this) {
                setLoopCount(this.f29971a, (char) i10);
            }
            return;
        }
        throw new IllegalArgumentException("Loop count of range <0, 65535>");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GifInfoHandle(AssetFileDescriptor assetFileDescriptor) throws IOException {
        try {
            this.f29971a = openFd(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset());
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }
}
