package s2;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c2.l;
import com.ironsource.b9;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
/* compiled from: Util.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f30658a = "0123456789abcdef".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f30659b = new char[64];

    /* renamed from: c  reason: collision with root package name */
    private static volatile Handler f30660c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Util.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30661a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f30661a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30661a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30661a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30661a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30661a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private k() {
    }

    public static void a() {
        if (!r()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else if (obj instanceof l) {
            return ((l) obj).a(obj2);
        } else {
            return obj.equals(obj2);
        }
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static String d(byte[] bArr, char[] cArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            char[] cArr2 = f30658a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    public static <T> Queue<T> e(int i10) {
        return new ArrayDeque(i10);
    }

    public static int f(int i10, int i11, Bitmap.Config config) {
        return i10 * i11 * h(config);
    }

    @TargetApi(19)
    public static int g(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + b9.i.f16696d + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    private static int h(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f30661a[config.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return 2;
            }
            return i10 != 4 ? 4 : 8;
        }
        return 1;
    }

    public static <T> List<T> i(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t10 : collection) {
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    private static Handler j() {
        if (f30660c == null) {
            synchronized (k.class) {
                if (f30660c == null) {
                    f30660c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f30660c;
    }

    public static int k(float f10) {
        return l(f10, 17);
    }

    public static int l(float f10, int i10) {
        return n(Float.floatToIntBits(f10), i10);
    }

    public static int m(int i10) {
        return n(i10, 17);
    }

    public static int n(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    public static int o(Object obj, int i10) {
        return n(obj == null ? 0 : obj.hashCode(), i10);
    }

    public static int p(boolean z10, int i10) {
        return n(z10 ? 1 : 0, i10);
    }

    public static boolean q() {
        return !r();
    }

    public static boolean r() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static boolean s(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    public static boolean t(int i10, int i11) {
        return s(i10) && s(i11);
    }

    public static void u(Runnable runnable) {
        j().post(runnable);
    }

    public static void v(Runnable runnable) {
        j().removeCallbacks(runnable);
    }

    public static String w(byte[] bArr) {
        String d10;
        char[] cArr = f30659b;
        synchronized (cArr) {
            d10 = d(bArr, cArr);
        }
        return d10;
    }
}
