package c2;

import android.util.Log;
import c2.n;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferFileLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d implements n<File, ByteBuffer> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteBufferFileLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: a  reason: collision with root package name */
        private final File f5332a;

        a(File file) {
            this.f5332a = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public w1.a d() {
            return w1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(s2.a.a(this.f5332a));
            } catch (IOException e8) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e8);
                }
                aVar.c(e8);
            }
        }
    }

    /* compiled from: ByteBufferFileLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements o<File, ByteBuffer> {
        @Override // c2.o
        public n<File, ByteBuffer> b(r rVar) {
            return new d();
        }
    }

    @Override // c2.n
    /* renamed from: c */
    public n.a<ByteBuffer> b(File file, int i10, int i11, w1.h hVar) {
        return new n.a<>(new r2.d(file), new a(file));
    }

    @Override // c2.n
    /* renamed from: d */
    public boolean a(File file) {
        return true;
    }
}
