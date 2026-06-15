package com.startapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.StatFs;
import android.provider.Settings;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.VideoView;
import com.ironsource.b9;
import com.startapp.sdk.ads.banner.BannerBase;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f23556a = 0;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Comparator<Signature> {
        @Override // java.util.Comparator
        public final int compare(Signature signature, Signature signature2) {
            return signature.toCharsString().compareTo(signature2.toCharsString());
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
    }

    static {
        "startapp.".concat(y.class.getSimpleName());
    }

    public static void a(Activity activity) {
        try {
            if (Build.VERSION.SDK_INT >= 9) {
                activity.setRequestedOrientation(6);
            } else {
                activity.setRequestedOrientation(0);
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(Activity activity) {
        try {
            if (Build.VERSION.SDK_INT >= 9) {
                activity.setRequestedOrientation(7);
            } else {
                activity.setRequestedOrientation(1);
            }
        } catch (Throwable unused) {
        }
    }

    public static void c(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.onPause();
            return;
        }
        try {
            Class.forName("android.webkit.WebView").getMethod(b9.h.f16677t0, new Class[0]).invoke(webView, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    public static void d(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.onResume();
            return;
        }
        try {
            Class.forName("android.webkit.WebView").getMethod(b9.h.f16679u0, new Class[0]).invoke(webView, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    public static boolean e(Context context) {
        try {
            if (c2.f21819k == null) {
                if (c2.f21818j == null) {
                    Context a10 = f0.a(context);
                    if (a10 != null) {
                        context = a10;
                    }
                    c2.f21818j = new c2(context);
                }
                c2.f21819k = Boolean.valueOf(c2.f21818j.c());
            }
            return c2.f21819k.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (android.provider.Settings.Secure.getInt(r5.getContentResolver(), "install_non_market_apps") == 1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.content.Context r5) {
        /*
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L25
            r2 = 17
            java.lang.String r3 = "install_non_market_apps"
            r4 = 1
            if (r1 < r2) goto L1a
            r2 = 21
            if (r1 < r2) goto Lf
            goto L1a
        Lf:
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L25
            int r5 = android.provider.Settings.Global.getInt(r5, r3)     // Catch: java.lang.Throwable -> L25
            if (r5 != r4) goto L25
            goto L24
        L1a:
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L25
            int r5 = android.provider.Settings.Secure.getInt(r5, r3)     // Catch: java.lang.Throwable -> L25
            if (r5 != r4) goto L25
        L24:
            r0 = r4
        L25:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.y.b(android.content.Context):boolean");
    }

    public static void a(View view, float f10) {
        if (Build.VERSION.SDK_INT >= 11) {
            view.setAlpha(f10);
        }
    }

    public static boolean c(Context context) {
        int i10;
        try {
            if (Build.VERSION.SDK_INT < 17) {
                i10 = Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0);
            } else {
                i10 = Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0);
            }
            return i10 != 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean d(Context context) {
        return Build.VERSION.SDK_INT >= 17 ? Settings.Global.getInt(context.getContentResolver(), "auto_time", 0) > 0 : Settings.System.getInt(context.getContentResolver(), "auto_time", 0) > 0;
    }

    public static void a(View view) {
        if (Build.VERSION.SDK_INT >= 12) {
            view.animate().alpha(1.0f).setDuration(1500L).setListener(null);
        }
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 14;
    }

    public static void b(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.setLayerType(1, null);
        }
    }

    public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (Build.VERSION.SDK_INT >= 16) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        } else {
            viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void a(WebView webView) {
        if (Build.VERSION.SDK_INT >= 17) {
            webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
    }

    public static int a(Activity activity, int i10, boolean z10) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i11 = 8;
        if (i10 != 1) {
            if (i10 == 2) {
                if (Build.VERSION.SDK_INT <= 8 || z10 || rotation == 0 || rotation == 1) {
                    i11 = 0;
                }
            }
            i11 = 1;
        } else {
            if (Build.VERSION.SDK_INT > 8 && !z10 && (rotation == 1 || rotation == 2)) {
                i11 = 9;
            }
            i11 = 1;
        }
        try {
            activity.setRequestedOrientation(i11);
        } catch (Throwable unused) {
        }
        return i11;
    }

    public static void a(VideoView videoView, ma maVar) {
        if (Build.VERSION.SDK_INT >= 11) {
            videoView.addOnLayoutChangeListener(new x(maVar));
        }
    }

    public static Long a(ActivityManager.MemoryInfo memoryInfo) {
        if (Build.VERSION.SDK_INT >= 16) {
            return Long.valueOf(memoryInfo.totalMem);
        }
        return null;
    }

    public static boolean a(BannerBase bannerBase, boolean z10) {
        if (Build.VERSION.SDK_INT >= 11 && 1 != bannerBase.getLayerType() && z10) {
            return bannerBase.isHardwareAccelerated();
        }
        return false;
    }

    public static long a(File file) {
        if (file != null) {
            try {
                if (file.isDirectory()) {
                    if (Build.VERSION.SDK_INT >= 9) {
                        return file.getFreeSpace();
                    }
                    StatFs statFs = new StatFs(file.getPath());
                    return statFs.getBlockSize() * statFs.getFreeBlocks();
                }
            } catch (Throwable unused) {
            }
        }
        return -1L;
    }

    public static boolean a(Context context, String str) {
        try {
            return Build.VERSION.SDK_INT >= 23 ? context.checkSelfPermission(str) == 0 : context.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    @SuppressLint({"RtlHardcoded"})
    public static int a(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 17) {
            if (i10 != 16) {
                if (i10 != 17) {
                    if (i10 != 20) {
                        if (i10 != 21) {
                            if (i10 == 8388611) {
                                if (i11 < 14) {
                                    return 3;
                                }
                                return i10;
                            } else if (i10 == 8388613 && i11 < 14) {
                                return 5;
                            } else {
                                return i10;
                            }
                        }
                        return 11;
                    }
                    return 9;
                }
                return 1;
            }
            return 0;
        }
        return i10;
    }

    public static List<PackageInfo> a(PackageManager packageManager) throws Exception {
        return (List) packageManager.getClass().getMethod("getInstalledPackages", Integer.TYPE).invoke(packageManager, 8192);
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public static String a(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                return null;
            }
            if (signatureArr.length == 1) {
                return signatureArr[0].toCharsString();
            }
            Arrays.sort(signatureArr, new a());
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < signatureArr.length; i10++) {
                sb.append(signatureArr[i10].toCharsString());
                if (i10 < signatureArr.length - 1) {
                    sb.append(';');
                }
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
