package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class UploadDataProviders {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ File f29501a;

        a(File file) {
            this.f29501a = file;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public FileChannel a() throws IOException {
            return new FileInputStream(this.f29501a).getChannel();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static class b implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptor f29502a;

        b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f29502a = parcelFileDescriptor;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public FileChannel a() throws IOException {
            if (this.f29502a.getStatSize() != -1) {
                return new ParcelFileDescriptor.AutoCloseInputStream(this.f29502a).getChannel();
            }
            this.f29502a.close();
            throw new IllegalArgumentException("Not a file: " + this.f29502a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class c extends UploadDataProvider {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f29503a;

        /* synthetic */ c(ByteBuffer byteBuffer, a aVar) {
            this(byteBuffer);
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return this.f29503a.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (byteBuffer.hasRemaining()) {
                if (byteBuffer.remaining() >= this.f29503a.remaining()) {
                    byteBuffer.put(this.f29503a);
                } else {
                    int limit = this.f29503a.limit();
                    ByteBuffer byteBuffer2 = this.f29503a;
                    byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                    byteBuffer.put(this.f29503a);
                    this.f29503a.limit(limit);
                }
                uploadDataSink.onReadSucceeded(false);
                return;
            }
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            this.f29503a.position(0);
            uploadDataSink.onRewindSucceeded();
        }

        private c(ByteBuffer byteBuffer) {
            this.f29503a = byteBuffer;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public interface d {
        FileChannel a() throws IOException;
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    private static final class e extends UploadDataProvider {

        /* renamed from: a  reason: collision with root package name */
        private volatile FileChannel f29504a;

        /* renamed from: b  reason: collision with root package name */
        private final d f29505b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f29506c;

        /* synthetic */ e(d dVar, a aVar) {
            this(dVar);
        }

        private FileChannel a() throws IOException {
            if (this.f29504a == null) {
                synchronized (this.f29506c) {
                    if (this.f29504a == null) {
                        this.f29504a = this.f29505b.a();
                    }
                }
            }
            return this.f29504a;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            FileChannel fileChannel = this.f29504a;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() throws IOException {
            return a().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasRemaining()) {
                FileChannel a10 = a();
                int i10 = 0;
                while (i10 == 0) {
                    int read = a10.read(byteBuffer);
                    if (read == -1) {
                        break;
                    }
                    i10 += read;
                }
                uploadDataSink.onReadSucceeded(false);
                return;
            }
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) throws IOException {
            a().position(0L);
            uploadDataSink.onRewindSucceeded();
        }

        private e(d dVar) {
            this.f29506c = new Object();
            this.f29505b = dVar;
        }
    }

    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new e(new a(file), null);
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new e(new b(parcelFileDescriptor), null);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new c(byteBuffer.slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr, int i10, int i11) {
        return new c(ByteBuffer.wrap(bArr, i10, i11).slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
