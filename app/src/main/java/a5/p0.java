package a5;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.protobuf.CodedOutputStream;
import com.ironsource.b9;
import com.ironsource.j3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.ug;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import n3.h2;
import n3.m1;
import n3.p2;
/* compiled from: Util.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f482a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f483b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f484c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f485d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f486e;

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f487f;

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f488g;

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f489h;

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f490i;

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f491j;

    /* renamed from: k  reason: collision with root package name */
    private static HashMap<String, String> f492k;

    /* renamed from: l  reason: collision with root package name */
    private static final String[] f493l;

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f494m;

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f495n;

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f496o;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f482a = i10;
        String str = Build.DEVICE;
        f483b = str;
        String str2 = Build.MANUFACTURER;
        f484c = str2;
        String str3 = Build.MODEL;
        f485d = str3;
        f486e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f487f = new byte[0];
        f488g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f489h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f490i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f491j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f493l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", ug.f21009x, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f494m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f495n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f496o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, j3.c.b.f17912c, j3.c.b.f17915f, 144, 151, 158, 153, IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, j3.c.b.f17911b, j3.c.b.f17916g, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, j3.c.b.f17913d, 230, 225, 232, 239, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 253, 244, 243};
    }

    public static Uri A(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f491j.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    private static String A0(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f494m;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                return strArr[i10 + 1] + str.substring(strArr[i10].length());
            }
            i10 += 2;
        }
    }

    public static String B(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static <T> void B0(List<T> list, int i10, int i11, int i12) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(list.remove(i10 + i13));
        }
        list.addAll(Math.min(i12, list.size()), arrayDeque);
    }

    public static String C(byte[] bArr) {
        return new String(bArr, x5.b.f32750c);
    }

    public static long C0(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static String D(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, x5.b.f32750c);
    }

    public static ExecutorService D0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: a5.o0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread y02;
                y02 = p0.y0(str, runnable);
                return y02;
            }
        });
    }

    public static int E(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static String E0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String e8 = x5.a.e(str);
        String str2 = S0(e8, "-")[0];
        if (f492k == null) {
            f492k = z();
        }
        String str3 = f492k.get(str2);
        if (str3 != null) {
            e8 = str3 + e8.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? A0(e8) : e8;
    }

    @SuppressLint({"InlinedApi"})
    public static int F(int i10) {
        if (i10 != 12) {
            switch (i10) {
                case 1:
                    return 4;
                case 2:
                    return 12;
                case 3:
                    return 28;
                case 4:
                    return 204;
                case 5:
                    return 220;
                case 6:
                    return 252;
                case 7:
                    return 1276;
                case 8:
                    return 6396;
                default:
                    return 0;
            }
        }
        return 743676;
    }

    public static <T> T[] F0(T[] tArr, T t10) {
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t10;
        return (T[]) k(copyOf);
    }

    public static p2.b G(p2 p2Var, p2.b bVar) {
        boolean f10 = p2Var.f();
        boolean L = p2Var.L();
        boolean G = p2Var.G();
        boolean m7 = p2Var.m();
        boolean X = p2Var.X();
        boolean r10 = p2Var.r();
        boolean u10 = p2Var.t().u();
        boolean z10 = false;
        p2.b.a d10 = new p2.b.a().b(bVar).d(4, !f10).d(5, L && !f10).d(6, G && !f10).d(7, !u10 && (G || !X || L) && !f10).d(8, m7 && !f10).d(9, !u10 && (m7 || (X && r10)) && !f10).d(10, !f10).d(11, L && !f10);
        if (L && !f10) {
            z10 = true;
        }
        return d10.d(12, z10).e();
    }

    public static <T> T[] G0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static int H(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static <T> T[] H0(T[] tArr, int i10) {
        a.a(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    public static byte[] I(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((Character.digit(str.charAt(i11), 16) << 4) + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    public static <T> T[] I0(T[] tArr, int i10, int i11) {
        a.a(i10 >= 0);
        a.a(i11 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i10, i11);
    }

    public static int J(String str, int i10) {
        int i11 = 0;
        for (String str2 : T0(str)) {
            if (i10 == x.m(str2)) {
                i11++;
            }
        }
        return i11;
    }

    public static long J0(String str) throws h2 {
        Matcher matcher = f488g.matcher(str);
        if (matcher.matches()) {
            int i10 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i10 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i10 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return i10 != 0 ? timeInMillis - (i10 * 60000) : timeInMillis;
        }
        throw h2.a("Invalid date/time format: " + str, null);
    }

    public static String K(String str, int i10) {
        String[] T0 = T0(str);
        if (T0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : T0) {
            if (i10 == x.m(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static long K0(String str) {
        Matcher matcher = f489h.matcher(str);
        if (matcher.matches()) {
            boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
            String group2 = matcher.group(5);
            double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
            String group3 = matcher.group(7);
            double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
            String group4 = matcher.group(10);
            double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
            String group5 = matcher.group(12);
            double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
            String group6 = matcher.group(14);
            long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
            return isEmpty ? -parseDouble6 : parseDouble6;
        }
        return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
    }

    public static String L(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return x5.a.f(networkCountryIso);
            }
        }
        return x5.a.f(Locale.getDefault().getCountry());
    }

    public static boolean L0(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
                return true;
            }
            return handler.post(runnable);
        }
        return false;
    }

    public static Point M(Context context) {
        DisplayManager displayManager;
        Display display = (f482a < 17 || (displayManager = (DisplayManager) context.getSystemService(b9.h.f16644d)) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return N(context, display);
    }

    public static Intent M0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (f482a < 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }

    public static Point N(Context context, Display display) {
        String j02;
        if (display.getDisplayId() == 0 && x0(context)) {
            if (f482a < 28) {
                j02 = j0("sys.display-size");
            } else {
                j02 = j0("vendor.display-size");
            }
            if (!TextUtils.isEmpty(j02)) {
                try {
                    String[] R0 = R0(j02.trim(), "x");
                    if (R0.length == 2) {
                        int parseInt = Integer.parseInt(R0[0]);
                        int parseInt2 = Integer.parseInt(R0[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                t.c("Util", "Invalid display size: " + j02);
            }
            if ("Sony".equals(f484c) && f485d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i10 = f482a;
        if (i10 >= 23) {
            S(display, point);
        } else if (i10 >= 17) {
            R(display, point);
        } else {
            Q(display, point);
        }
        return point;
    }

    public static <T> void N0(List<T> list, int i10, int i11) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        }
        if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    public static Looper O() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static long O0(long j10, long j11, long j12) {
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 >= 0 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (i10 >= 0 || j11 % j12 != 0) {
            return (long) (j10 * (j11 / j12));
        }
        return j10 * (j11 / j12);
    }

    public static Locale P() {
        return f482a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    public static long[] P0(List<Long> list, long j10, long j11) {
        int size = list.size();
        long[] jArr = new long[size];
        int i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        int i11 = 0;
        if (i10 >= 0 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i11 < size) {
                jArr[i11] = list.get(i11).longValue() / j12;
                i11++;
            }
        } else if (i10 >= 0 || j10 % j11 != 0) {
            double d10 = j10 / j11;
            while (i11 < size) {
                jArr[i11] = (long) (list.get(i11).longValue() * d10);
                i11++;
            }
        } else {
            long j13 = j10 / j11;
            while (i11 < size) {
                jArr[i11] = list.get(i11).longValue() * j13;
                i11++;
            }
        }
        return jArr;
    }

    private static void Q(Display display, Point point) {
        display.getSize(point);
    }

    public static void Q0(long[] jArr, long j10, long j11) {
        int i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        int i11 = 0;
        if (i10 >= 0 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i11 < jArr.length) {
                jArr[i11] = jArr[i11] / j12;
                i11++;
            }
        } else if (i10 < 0 && j10 % j11 == 0) {
            long j13 = j10 / j11;
            while (i11 < jArr.length) {
                jArr[i11] = jArr[i11] * j13;
                i11++;
            }
        } else {
            double d10 = j10 / j11;
            while (i11 < jArr.length) {
                jArr[i11] = (long) (jArr[i11] * d10);
                i11++;
            }
        }
    }

    private static void R(Display display, Point point) {
        display.getRealSize(point);
    }

    public static String[] R0(String str, String str2) {
        return str.split(str2, -1);
    }

    private static void S(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static String[] S0(String str, String str2) {
        return str.split(str2, 2);
    }

    public static int T(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 != 10) {
            if (i10 != 7) {
                if (i10 != 8) {
                    switch (i10) {
                        case 15:
                            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                        case 16:
                        case 18:
                            return 6005;
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            return 6004;
                        default:
                            switch (i10) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                    return AdError.ICONVIEW_MISSING_ERROR_CODE;
                                default:
                                    return 6006;
                            }
                    }
                }
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            }
            return 6005;
        }
        return 6004;
    }

    public static String[] T0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : R0(str.trim(), "(\\s*,\\s*)");
    }

    public static int U(String str) {
        String[] R0;
        int length;
        if (str != null && (length = (R0 = R0(str, "_")).length) >= 2) {
            String str2 = R0[length - 1];
            boolean z10 = length >= 3 && "neg".equals(R0[length - 2]);
            try {
                int parseInt = Integer.parseInt((String) a.e(str2));
                return z10 ? -parseInt : parseInt;
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return 0;
    }

    public static long U0(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    public static String V(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return "YES";
                        }
                        throw new IllegalStateException();
                    }
                    return "NO_EXCEEDS_CAPABILITIES";
                }
                return "NO_UNSUPPORTED_DRM";
            }
            return "NO_UNSUPPORTED_TYPE";
        }
        return "NO";
    }

    public static byte[] V0(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static String W(Locale locale) {
        return f482a >= 21 ? X(locale) : locale.toString();
    }

    public static long W0(int i10, int i11) {
        return X0(i11) | (X0(i10) << 32);
    }

    private static String X(Locale locale) {
        return locale.toLanguageTag();
    }

    public static long X0(int i10) {
        return i10 & 4294967295L;
    }

    public static long Y(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    public static CharSequence Y0(CharSequence charSequence, int i10) {
        return charSequence.length() <= i10 ? charSequence : charSequence.subSequence(0, i10);
    }

    public static long Z(long j10) {
        if (j10 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j10 + SystemClock.elapsedRealtime();
    }

    public static long Z0(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static int a0(int i10) {
        if (i10 != 8) {
            if (i10 != 16) {
                if (i10 != 24) {
                    return i10 != 32 ? 0 : 805306368;
                }
                return 536870912;
            }
            return 2;
        }
        return 3;
    }

    public static long b(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    public static m1 b0(int i10, int i11, int i12) {
        return new m1.b().e0("audio/raw").H(i11).f0(i12).Y(i10).E();
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int c0(int i10, int i11) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 268435456) {
                        if (i10 == 536870912) {
                            return i11 * 3;
                        }
                        if (i10 != 805306368) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                return i11 * 4;
            }
            return i11;
        }
        return i11 * 2;
    }

    public static <T extends Comparable<? super T>> int d(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Collections.binarySearch(list, t10);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t10) == 0);
            i10 = z10 ? binarySearch - 1 : binarySearch;
        }
        return z11 ? Math.min(list.size() - 1, i10) : i10;
    }

    public static long d0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    public static int e(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j10);
            i10 = z10 ? binarySearch - 1 : binarySearch;
        }
        return z11 ? Math.min(jArr.length - 1, i10) : i10;
    }

    public static int e0(int i10) {
        if (i10 != 13) {
            switch (i10) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
        return 1;
    }

    public static int f(u uVar, long j10, boolean z10, boolean z11) {
        int i10;
        int c10 = uVar.c() - 1;
        int i11 = 0;
        while (i11 <= c10) {
            int i12 = (i11 + c10) >>> 1;
            if (uVar.b(i12) < j10) {
                i11 = i12 + 1;
            } else {
                c10 = i12 - 1;
            }
        }
        if (z10 && (i10 = c10 + 1) < uVar.c() && uVar.b(i10) == j10) {
            return i10;
        }
        if (z11 && c10 == -1) {
            return 0;
        }
        return c10;
    }

    public static String f0(StringBuilder sb, Formatter formatter, long j10) {
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        String str = j10 < 0 ? "-" : "";
        long abs = (Math.abs(j10) + 500) / 1000;
        long j11 = abs % 60;
        long j12 = (abs / 60) % 60;
        long j13 = abs / 3600;
        sb.setLength(0);
        return j13 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11)).toString();
    }

    public static <T extends Comparable<? super T>> int g(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Collections.binarySearch(list, t10);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t10) == 0);
            i10 = z10 ? binarySearch + 1 : binarySearch;
        }
        return z11 ? Math.max(0, i10) : i10;
    }

    public static String[] g0() {
        String[] h02 = h0();
        for (int i10 = 0; i10 < h02.length; i10++) {
            h02[i10] = E0(h02[i10]);
        }
        return h02;
    }

    public static int h(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int binarySearch = Arrays.binarySearch(iArr, i10);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] == i10);
            i11 = z10 ? binarySearch + 1 : binarySearch;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    private static String[] h0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f482a >= 24 ? i0(configuration) : new String[]{W(configuration.locale)};
    }

    public static int i(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j10);
            i10 = z10 ? binarySearch + 1 : binarySearch;
        }
        return z11 ? Math.max(0, i10) : i10;
    }

    private static String[] i0(Configuration configuration) {
        return R0(configuration.getLocales().toLanguageTags(), ",");
    }

    public static <T> T j(T t10) {
        return t10;
    }

    private static String j0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e8) {
            t.d("Util", "Failed to read system property " + str, e8);
            return null;
        }
    }

    public static <T> T[] k(T[] tArr) {
        return tArr;
    }

    public static String k0(int i10) {
        switch (i10) {
            case AdSize.AUTO_HEIGHT /* -2 */:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return RewardedVideo.VIDEO_MODE_DEFAULT;
            case 1:
                return MimeTypes.BASE_TYPE_AUDIO;
            case 2:
                return "video";
            case 3:
                return b9.h.K0;
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i10 >= 10000) {
                    return "custom (" + i10 + ")";
                }
                return "?";
        }
    }

    public static int l(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static String l0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.18.2";
    }

    public static long m(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    public static byte[] m0(String str) {
        return str.getBytes(x5.b.f32750c);
    }

    public static void n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int n0(Uri uri) {
        int p02;
        String scheme = uri.getScheme();
        if (scheme == null || !x5.a.a("rtsp", scheme)) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                return 4;
            }
            int lastIndexOf = lastPathSegment.lastIndexOf(46);
            if (lastIndexOf < 0 || (p02 = p0(lastPathSegment.substring(lastIndexOf + 1))) == 4) {
                Matcher matcher = f491j.matcher((CharSequence) a.e(uri.getPath()));
                if (matcher.matches()) {
                    String group = matcher.group(2);
                    if (group != null) {
                        if (group.contains("format=mpd-time-csf")) {
                            return 0;
                        }
                        if (group.contains("format=m3u8-aapl")) {
                            return 2;
                        }
                    }
                    return 1;
                }
                return 4;
            }
            return p02;
        }
        return 3;
    }

    public static int o(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 == 0 ? 0 : 1;
    }

    @Deprecated
    public static int o0(String str) {
        return n0(Uri.parse("file:///" + str));
    }

    public static float p(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int p0(String str) {
        String e8 = x5.a.e(str);
        e8.hashCode();
        char c10 = 65535;
        switch (e8.hashCode()) {
            case 104579:
                if (e8.equals("ism")) {
                    c10 = 0;
                    break;
                }
                break;
            case 108321:
                if (e8.equals("mpd")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3242057:
                if (e8.equals("isml")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3299913:
                if (e8.equals("m3u8")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 2:
                return 1;
            case 1:
                return 0;
            case 3:
                return 2;
            default:
                return 4;
        }
    }

    public static int q(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static int q0(Uri uri, String str) {
        if (str == null) {
            return n0(uri);
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    c10 = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    c10 = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    public static long r(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static boolean r0(c0 c0Var, c0 c0Var2, Inflater inflater) {
        if (c0Var.a() <= 0) {
            return false;
        }
        if (c0Var2.b() < c0Var.a()) {
            c0Var2.c(c0Var.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c0Var.d(), c0Var.e(), c0Var.a());
        int i10 = 0;
        while (true) {
            try {
                i10 += inflater.inflate(c0Var2.d(), i10, c0Var2.b() - i10);
                if (inflater.finished()) {
                    c0Var2.J(i10);
                    return true;
                } else if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                } else if (i10 == c0Var2.b()) {
                    c0Var2.c(c0Var2.b() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static boolean s(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s0(Context context) {
        return f482a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static int t(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f495n[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static boolean t0(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static Handler u(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static boolean u0(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static Handler v() {
        return w(null);
    }

    public static boolean v0(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static Handler w(Handler.Callback callback) {
        return u((Looper) a.h(Looper.myLooper()), callback);
    }

    public static boolean w0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || b9.h.f16640b.equals(scheme);
    }

    public static Handler x() {
        return y(null);
    }

    public static boolean x0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static Handler y(Handler.Callback callback) {
        return u(O(), callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread y0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    private static HashMap<String, String> z() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f493l.length);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f493l;
            if (i10 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static int z0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }
}
