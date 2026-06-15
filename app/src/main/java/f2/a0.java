package f2;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: TransformationUtils.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Paint f25289a = new Paint(6);

    /* renamed from: b  reason: collision with root package name */
    private static final Paint f25290b = new Paint(7);

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f25291c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set<String> f25292d;

    /* renamed from: e  reason: collision with root package name */
    private static final Lock f25293e;

    /* compiled from: TransformationUtils.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f25294a;

        a(int i10) {
            this.f25294a = i10;
        }

        @Override // f2.a0.b
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            int i10 = this.f25294a;
            canvas.drawRoundRect(rectF, i10, i10, paint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransformationUtils.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* compiled from: TransformationUtils.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class c implements Lock {
        c() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j10, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f25292d = hashSet;
        f25293e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new c();
        Paint paint = new Paint(7);
        f25291c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f25293e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f25289a);
            d(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f25293e.unlock();
            throw th;
        }
    }

    public static Bitmap b(z1.e eVar, Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f10 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            width = i11 / bitmap.getHeight();
            f10 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f10 + 0.5f), (int) (height + 0.5f));
        Bitmap d10 = eVar.d(i10, i11, j(bitmap));
        p(bitmap, d10);
        a(bitmap, d10, matrix);
        return d10;
    }

    public static Bitmap c(z1.e eVar, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() <= i10 && bitmap.getHeight() <= i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return e(eVar, bitmap, i10, i11);
    }

    private static void d(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap e(z1.e eVar, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap d10 = eVar.d((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), j(bitmap));
        p(bitmap, d10);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i10 + "x" + i11);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + d10.getWidth() + "x" + d10.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(min);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, d10, matrix);
        return d10;
    }

    private static Bitmap f(z1.e eVar, Bitmap bitmap) {
        Bitmap.Config g10 = g(bitmap);
        if (g10.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap d10 = eVar.d(bitmap.getWidth(), bitmap.getHeight(), g10);
        new Canvas(d10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return d10;
    }

    private static Bitmap.Config g(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Bitmap.Config.RGBA_F16;
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static Lock h() {
        return f25293e;
    }

    public static int i(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    private static Bitmap.Config j(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    static void k(int i10, Matrix matrix) {
        switch (i10) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    public static boolean l(int i10) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap m(z1.e eVar, Bitmap bitmap, int i10) {
        if (l(i10)) {
            Matrix matrix = new Matrix();
            k(i10, matrix);
            RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
            matrix.mapRect(rectF);
            Bitmap d10 = eVar.d(Math.round(rectF.width()), Math.round(rectF.height()), j(bitmap));
            matrix.postTranslate(-rectF.left, -rectF.top);
            d10.setHasAlpha(bitmap.hasAlpha());
            a(bitmap, d10, matrix);
            return d10;
        }
        return bitmap;
    }

    public static Bitmap n(z1.e eVar, Bitmap bitmap, int i10) {
        s2.j.a(i10 > 0, "roundingRadius must be greater than 0.");
        return o(eVar, bitmap, new a(i10));
    }

    private static Bitmap o(z1.e eVar, Bitmap bitmap, b bVar) {
        Bitmap.Config g10 = g(bitmap);
        Bitmap f10 = f(eVar, bitmap);
        Bitmap d10 = eVar.d(f10.getWidth(), f10.getHeight(), g10);
        d10.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(f10, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, d10.getWidth(), d10.getHeight());
        Lock lock = f25293e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d10);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            bVar.a(canvas, paint, rectF);
            d(canvas);
            lock.unlock();
            if (!f10.equals(bitmap)) {
                eVar.c(f10);
            }
            return d10;
        } catch (Throwable th) {
            f25293e.unlock();
            throw th;
        }
    }

    public static void p(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
