package e2;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import f2.l;
import f2.m;
import f2.r;
import java.io.IOException;
import w1.g;
import w1.h;
import w1.i;
import w1.j;
import y1.v;
/* compiled from: ImageDecoderResourceDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a<T> implements j<ImageDecoder.Source, T> {

    /* renamed from: a  reason: collision with root package name */
    final r f24916a = r.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageDecoderResourceDecoder.java */
    /* renamed from: e2.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class C0269a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f24917a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f24918b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f24919c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ w1.b f24920d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l f24921e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f24922f;

        /* compiled from: ImageDecoderResourceDecoder.java */
        /* renamed from: e2.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0270a implements ImageDecoder.OnPartialImageListener {
            C0270a() {
            }

            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        C0269a(int i10, int i11, boolean z10, w1.b bVar, l lVar, i iVar) {
            this.f24917a = i10;
            this.f24918b = i11;
            this.f24919c = z10;
            this.f24920d = bVar;
            this.f24921e = lVar;
            this.f24922f = iVar;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            boolean z10 = false;
            if (a.this.f24916a.e(this.f24917a, this.f24918b, this.f24919c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f24920d == w1.b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0270a());
            Size size = imageInfo.getSize();
            int i10 = this.f24917a;
            if (i10 == Integer.MIN_VALUE) {
                i10 = size.getWidth();
            }
            int i11 = this.f24918b;
            if (i11 == Integer.MIN_VALUE) {
                i11 = size.getHeight();
            }
            float b10 = this.f24921e.b(size.getWidth(), size.getHeight(), i10, i11);
            int round = Math.round(size.getWidth() * b10);
            int round2 = Math.round(size.getHeight() * b10);
            if (Log.isLoggable("ImageDecoder", 2)) {
                Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b10);
            }
            imageDecoder.setTargetSize(round, round2);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 < 28) {
                if (i12 >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                    return;
                }
                return;
            }
            if (this.f24922f == i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                z10 = true;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(z10 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }

    protected abstract v<T> c(ImageDecoder.Source source, int i10, int i11, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    @Override // w1.j
    /* renamed from: d */
    public final v<T> a(ImageDecoder.Source source, int i10, int i11, h hVar) throws IOException {
        w1.b bVar = (w1.b) hVar.c(m.f25335f);
        l lVar = (l) hVar.c(l.f25330h);
        g<Boolean> gVar = m.f25339j;
        return c(source, i10, i11, new C0269a(i10, i11, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), bVar, lVar, (i) hVar.c(m.f25336g)));
    }

    @Override // w1.j
    /* renamed from: e */
    public final boolean b(ImageDecoder.Source source, h hVar) {
        return true;
    }
}
