package f2;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: HardwareConfigState.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class r {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f25353g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f25354h;

    /* renamed from: i  reason: collision with root package name */
    private static final File f25355i;

    /* renamed from: j  reason: collision with root package name */
    private static volatile r f25356j;

    /* renamed from: k  reason: collision with root package name */
    private static volatile int f25357k;

    /* renamed from: b  reason: collision with root package name */
    private final int f25359b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25360c;

    /* renamed from: d  reason: collision with root package name */
    private int f25361d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f25362e = true;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f25363f = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f25358a = f();

    static {
        int i10 = Build.VERSION.SDK_INT;
        f25353g = i10 < 29;
        f25354h = i10 >= 26;
        f25355i = new File("/proc/self/fd");
        f25357k = -1;
    }

    r() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f25359b = 20000;
            this.f25360c = 0;
            return;
        }
        this.f25359b = IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
        this.f25360c = 128;
    }

    private boolean a() {
        return f25353g && !this.f25363f.get();
    }

    public static r b() {
        if (f25356j == null) {
            synchronized (r.class) {
                if (f25356j == null) {
                    f25356j = new r();
                }
            }
        }
        return f25356j;
    }

    private int c() {
        if (f25357k != -1) {
            return f25357k;
        }
        return this.f25359b;
    }

    private synchronized boolean d() {
        boolean z10 = true;
        int i10 = this.f25361d + 1;
        this.f25361d = i10;
        if (i10 >= 50) {
            this.f25361d = 0;
            int length = f25355i.list().length;
            long c10 = c();
            if (length >= c10) {
                z10 = false;
            }
            this.f25362e = z10;
            if (!z10 && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + c10);
            }
        }
        return this.f25362e;
    }

    private static boolean f() {
        return (g() || h()) ? false : true;
    }

    private static boolean g() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        for (String str : Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play")) {
            if (Build.MODEL.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean h() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
    }

    public boolean e(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (!this.f25358a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        } else if (!f25354h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        } else if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        } else if (z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        } else {
            int i12 = this.f25360c;
            if (i10 < i12) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
                }
                return false;
            } else if (i11 < i12) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
                }
                return false;
            } else if (d()) {
                return true;
            } else {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                }
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(26)
    public boolean i(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean e8 = e(i10, i11, z10, z11);
        if (e8) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return e8;
    }
}
