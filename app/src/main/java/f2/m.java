package f2;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.ironsource.b9;
import f2.l;
import f2.s;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
/* compiled from: Downsampler.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m {

    /* renamed from: f  reason: collision with root package name */
    public static final w1.g<w1.b> f25335f = w1.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", w1.b.f31957c);

    /* renamed from: g  reason: collision with root package name */
    public static final w1.g<w1.i> f25336g = w1.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", w1.i.SRGB);
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public static final w1.g<l> f25337h = l.f25330h;

    /* renamed from: i  reason: collision with root package name */
    public static final w1.g<Boolean> f25338i;

    /* renamed from: j  reason: collision with root package name */
    public static final w1.g<Boolean> f25339j;

    /* renamed from: k  reason: collision with root package name */
    private static final Set<String> f25340k;

    /* renamed from: l  reason: collision with root package name */
    private static final b f25341l;

    /* renamed from: m  reason: collision with root package name */
    private static final Set<ImageHeaderParser.ImageType> f25342m;

    /* renamed from: n  reason: collision with root package name */
    private static final Queue<BitmapFactory.Options> f25343n;

    /* renamed from: a  reason: collision with root package name */
    private final z1.e f25344a;

    /* renamed from: b  reason: collision with root package name */
    private final DisplayMetrics f25345b;

    /* renamed from: c  reason: collision with root package name */
    private final z1.b f25346c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ImageHeaderParser> f25347d;

    /* renamed from: e  reason: collision with root package name */
    private final r f25348e = r.b();

    /* compiled from: Downsampler.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements b {
        a() {
        }

        @Override // f2.m.b
        public void a(z1.e eVar, Bitmap bitmap) {
        }

        @Override // f2.m.b
        public void b() {
        }
    }

    /* compiled from: Downsampler.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(z1.e eVar, Bitmap bitmap) throws IOException;

        void b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f25338i = w1.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f25339j = w1.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f25340k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f25341l = new a();
        f25342m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f25343n = s2.k.e(0);
    }

    public m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, z1.e eVar, z1.b bVar) {
        this.f25347d = list;
        this.f25345b = (DisplayMetrics) s2.j.d(displayMetrics);
        this.f25344a = (z1.e) s2.j.d(eVar);
        this.f25346c = (z1.b) s2.j.d(bVar);
    }

    private static int a(double d10) {
        int l10 = l(d10);
        int x10 = x(l10 * d10);
        return x((d10 / (x10 / l10)) * x10);
    }

    private void b(s sVar, w1.b bVar, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        if (this.f25348e.i(i10, i11, options, z10, z11)) {
            return;
        }
        if (bVar != w1.b.PREFER_ARGB_8888 && Build.VERSION.SDK_INT != 16) {
            boolean z12 = false;
            try {
                z12 = sVar.d().hasAlpha();
            } catch (IOException e8) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e8);
                }
            }
            Bitmap.Config config = z12 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
                return;
            }
            return;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
    }

    private static void c(ImageHeaderParser.ImageType imageType, s sVar, b bVar, z1.e eVar, l lVar, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) throws IOException {
        int i15;
        int i16;
        int min;
        int i17;
        int floor;
        double floor2;
        int i18;
        if (i11 > 0 && i12 > 0) {
            if (r(i10)) {
                i16 = i11;
                i15 = i12;
            } else {
                i15 = i11;
                i16 = i12;
            }
            float b10 = lVar.b(i15, i16, i13, i14);
            if (b10 > 0.0f) {
                l.g a10 = lVar.a(i15, i16, i13, i14);
                if (a10 != null) {
                    float f10 = i15;
                    float f11 = i16;
                    int x10 = i15 / x(b10 * f10);
                    int x11 = i16 / x(b10 * f11);
                    l.g gVar = l.g.MEMORY;
                    if (a10 == gVar) {
                        min = Math.max(x10, x11);
                    } else {
                        min = Math.min(x10, x11);
                    }
                    int i19 = Build.VERSION.SDK_INT;
                    if (i19 > 23 || !f25340k.contains(options.outMimeType)) {
                        int max = Math.max(1, Integer.highestOneBit(min));
                        if (a10 == gVar && max < 1.0f / b10) {
                            max <<= 1;
                        }
                        i17 = max;
                    } else {
                        i17 = 1;
                    }
                    options.inSampleSize = i17;
                    if (imageType == ImageHeaderParser.ImageType.JPEG) {
                        float min2 = Math.min(i17, 8);
                        floor = (int) Math.ceil(f10 / min2);
                        i18 = (int) Math.ceil(f11 / min2);
                        int i20 = i17 / 8;
                        if (i20 > 0) {
                            floor /= i20;
                            i18 /= i20;
                        }
                    } else {
                        if (imageType != ImageHeaderParser.ImageType.PNG && imageType != ImageHeaderParser.ImageType.PNG_A) {
                            if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
                                if (i19 >= 24) {
                                    float f12 = i17;
                                    floor = Math.round(f10 / f12);
                                    i18 = Math.round(f11 / f12);
                                } else {
                                    float f13 = i17;
                                    floor = (int) Math.floor(f10 / f13);
                                    floor2 = Math.floor(f11 / f13);
                                }
                            } else if (i15 % i17 == 0 && i16 % i17 == 0) {
                                floor = i15 / i17;
                                i18 = i16 / i17;
                            } else {
                                int[] m7 = m(sVar, options, bVar, eVar);
                                floor = m7[0];
                                i18 = m7[1];
                            }
                        } else {
                            float f14 = i17;
                            floor = (int) Math.floor(f10 / f14);
                            floor2 = Math.floor(f11 / f14);
                        }
                        i18 = (int) floor2;
                    }
                    double b11 = lVar.b(floor, i18, i13, i14);
                    if (i19 >= 19) {
                        options.inTargetDensity = a(b11);
                        options.inDensity = l(b11);
                    }
                    if (s(options)) {
                        options.inScaled = true;
                    } else {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    }
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculate scaling, source: [" + i11 + "x" + i12 + "], degreesToRotate: " + i10 + ", target: [" + i13 + "x" + i14 + "], power of two scaled: [" + floor + "x" + i18 + "], exact scale factor: " + b10 + ", power of 2 sample size: " + i17 + ", adjusted scale factor: " + b11 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            throw new IllegalArgumentException("Cannot scale with factor: " + b10 + " from: " + lVar + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + b9.i.f16698e);
        } else if (Log.isLoggable("Downsampler", 3)) {
            Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i13 + "x" + i14 + b9.i.f16698e);
        }
    }

    private y1.v<Bitmap> e(s sVar, int i10, int i11, w1.h hVar, b bVar) throws IOException {
        byte[] bArr = (byte[]) this.f25346c.c(65536, byte[].class);
        BitmapFactory.Options k10 = k();
        k10.inTempStorage = bArr;
        w1.b bVar2 = (w1.b) hVar.c(f25335f);
        w1.i iVar = (w1.i) hVar.c(f25336g);
        l lVar = (l) hVar.c(l.f25330h);
        boolean booleanValue = ((Boolean) hVar.c(f25338i)).booleanValue();
        w1.g<Boolean> gVar = f25339j;
        try {
            return e.d(h(sVar, k10, lVar, bVar2, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i10, i11, booleanValue, bVar), this.f25344a);
        } finally {
            v(k10);
            this.f25346c.put(bArr);
        }
    }

    private Bitmap h(s sVar, BitmapFactory.Options options, l lVar, w1.b bVar, w1.i iVar, boolean z10, int i10, int i11, boolean z11, b bVar2) throws IOException {
        int i12;
        int i13;
        int i14;
        m mVar;
        int round;
        int round2;
        int i15;
        ColorSpace colorSpace;
        long b10 = s2.f.b();
        int[] m7 = m(sVar, options, bVar2, this.f25344a);
        boolean z12 = false;
        int i16 = m7[0];
        int i17 = m7[1];
        String str = options.outMimeType;
        boolean z13 = (i16 == -1 || i17 == -1) ? false : z10;
        int c10 = sVar.c();
        int i18 = a0.i(c10);
        boolean l10 = a0.l(c10);
        if (i10 == Integer.MIN_VALUE) {
            i12 = i11;
            i13 = r(i18) ? i17 : i16;
        } else {
            i12 = i11;
            i13 = i10;
        }
        if (i12 == Integer.MIN_VALUE) {
            i14 = r(i18) ? i16 : i17;
        } else {
            i14 = i12;
        }
        ImageHeaderParser.ImageType d10 = sVar.d();
        c(d10, sVar, bVar2, this.f25344a, lVar, i18, i16, i17, i13, i14, options);
        b(sVar, bVar, z13, l10, options, i13, i14);
        int i19 = Build.VERSION.SDK_INT;
        boolean z14 = i19 >= 19;
        if (options.inSampleSize == 1 || z14) {
            mVar = this;
            if (mVar.z(d10)) {
                if (i16 < 0 || i17 < 0 || !z11 || !z14) {
                    float f10 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                    int i20 = options.inSampleSize;
                    float f11 = i20;
                    float f12 = f10;
                    round = Math.round(((int) Math.ceil(i16 / f11)) * f12);
                    round2 = Math.round(((int) Math.ceil(i17 / f11)) * f12);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + round + "x" + round2 + "] for source [" + i16 + "x" + i17 + "], sampleSize: " + i20 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f12);
                    }
                } else {
                    round = i13;
                    round2 = i14;
                }
                if (round > 0 && round2 > 0) {
                    y(options, mVar.f25344a, round, round2);
                }
            }
        } else {
            mVar = this;
        }
        if (i19 >= 28) {
            if (iVar == w1.i.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) {
                z12 = true;
            }
            options.inPreferredColorSpace = ColorSpace.get(z12 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        } else if (i19 >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap i21 = i(sVar, options, bVar2, mVar.f25344a);
        bVar2.a(mVar.f25344a, i21);
        if (Log.isLoggable("Downsampler", 2)) {
            i15 = c10;
            t(i16, i17, str, options, i21, i10, i11, b10);
        } else {
            i15 = c10;
        }
        Bitmap bitmap = null;
        if (i21 != null) {
            i21.setDensity(mVar.f25345b.densityDpi);
            bitmap = a0.m(mVar.f25344a, i21, i15);
            if (!i21.equals(bitmap)) {
                mVar.f25344a.c(i21);
            }
        }
        return bitmap;
    }

    private static Bitmap i(s sVar, BitmapFactory.Options options, b bVar, z1.e eVar) throws IOException {
        if (!options.inJustDecodeBounds) {
            bVar.b();
            sVar.b();
        }
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        String str = options.outMimeType;
        a0.h().lock();
        try {
            try {
                Bitmap a10 = sVar.a(options);
                a0.h().unlock();
                return a10;
            } catch (IllegalArgumentException e8) {
                IOException u10 = u(e8, i10, i11, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", u10);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        eVar.c(bitmap);
                        options.inBitmap = null;
                        Bitmap i12 = i(sVar, options, bVar, eVar);
                        a0.h().unlock();
                        return i12;
                    } catch (IOException unused) {
                        throw u10;
                    }
                }
                throw u10;
            }
        } catch (Throwable th) {
            a0.h().unlock();
            throw th;
        }
    }

    @TargetApi(19)
    private static String j(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        return b9.i.f16696d + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options poll;
        synchronized (m.class) {
            Queue<BitmapFactory.Options> queue = f25343n;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                w(poll);
            }
        }
        return poll;
    }

    private static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    private static int[] m(s sVar, BitmapFactory.Options options, b bVar, z1.e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        i(sVar, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    private static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + n(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + s2.f.a(j10));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = f25343n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    @TargetApi(26)
    private static void y(BitmapFactory.Options options, z1.e eVar, int i10, int i11) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.e(i10, i11, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f25342m.contains(imageType);
    }

    public y1.v<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, w1.h hVar) throws IOException {
        return e(new s.b(parcelFileDescriptor, this.f25347d, this.f25346c), i10, i11, hVar, f25341l);
    }

    public y1.v<Bitmap> f(InputStream inputStream, int i10, int i11, w1.h hVar) throws IOException {
        return g(inputStream, i10, i11, hVar, f25341l);
    }

    public y1.v<Bitmap> g(InputStream inputStream, int i10, int i11, w1.h hVar, b bVar) throws IOException {
        return e(new s.a(inputStream, this.f25347d, this.f25346c), i10, i11, hVar, bVar);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }
}
