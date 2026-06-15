package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.api.Api;
import com.ironsource.b9;
import com.ironsource.j3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.ug;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeh {
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    public static final byte[] zzf;
    private static final Pattern zzg;
    private static HashMap zzh;
    private static final String[] zzi;
    private static final String[] zzj;
    private static final int[] zzk;
    private static final int[] zzl;
    private static final int[] zzm;

    static {
        int i10 = Build.VERSION.SDK_INT;
        zza = i10;
        String str = Build.DEVICE;
        zzb = str;
        String str2 = Build.MANUFACTURER;
        zzc = str2;
        String str3 = Build.MODEL;
        zzd = str3;
        zze = str + ", " + str3 + ", " + str2 + ", " + i10;
        zzf = new byte[0];
        zzg = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zzi = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", ug.f21009x, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzj = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzk = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzl = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        zzm = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, j3.c.b.f17912c, j3.c.b.f17915f, 144, 151, 158, 153, IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, j3.c.b.f17911b, j3.c.b.f17916g, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, j3.c.b.f17913d, 230, 225, 232, 239, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 253, 244, 243};
    }

    public static zzz zzA(int i10, int i11, int i12) {
        zzx zzxVar = new zzx();
        zzxVar.zzad("audio/raw");
        zzxVar.zzB(i11);
        zzxVar.zzae(i12);
        zzxVar.zzX(i10);
        return zzxVar.zzaj();
    }

    public static String zzB(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String zzC(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, StandardCharsets.UTF_8);
    }

    public static String zzD(int i10) {
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
            default:
                return "camera motion";
        }
    }

    public static String zzE(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String zza2 = zzfsb.zza(str);
        int i10 = 0;
        String str2 = zza2.split("-", 2)[0];
        if (zzh == null) {
            zzh = zzS();
        }
        String str3 = (String) zzh.get(str2);
        if (str3 != null) {
            zza2 = str3.concat(String.valueOf(zza2.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return zza2;
        }
        while (true) {
            String[] strArr = zzj;
            int length = strArr.length;
            if (i10 >= 18) {
                return zza2;
            }
            if (zza2.startsWith(strArr[i10])) {
                return String.valueOf(strArr[i10 + 1]).concat(String.valueOf(zza2.substring(strArr[i10].length())));
            }
            i10 += 2;
        }
    }

    public static void zzF(long[] jArr, long j10, long j11) {
        int i10 = (j11 > 1000000L ? 1 : (j11 == 1000000L ? 0 : -1));
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i11 = 0;
        if (i10 >= 0 && j11 % 1000000 == 0) {
            long zzb2 = zzfyt.zzb(j11, 1000000L, RoundingMode.UNNECESSARY);
            while (i11 < jArr.length) {
                jArr[i11] = zzfyt.zzb(jArr[i11], zzb2, roundingMode);
                i11++;
            }
        } else if (i10 < 0 && 1000000 % j11 == 0) {
            long zzb3 = zzfyt.zzb(1000000L, j11, RoundingMode.UNNECESSARY);
            while (i11 < jArr.length) {
                jArr[i11] = zzfyt.zzd(jArr[i11], zzb3);
                i11++;
            }
        } else {
            for (int i12 = 0; i12 < jArr.length; i12++) {
                long j12 = jArr[i12];
                if (j12 != 0) {
                    int i13 = (j11 > j12 ? 1 : (j11 == j12 ? 0 : -1));
                    if (i13 >= 0 && j11 % j12 == 0) {
                        jArr[i12] = zzfyt.zzb(1000000L, zzfyt.zzb(j11, j12, RoundingMode.UNNECESSARY), roundingMode);
                    } else if (i13 < 0 && j12 % j11 == 0) {
                        jArr[i12] = zzfyt.zzd(1000000L, zzfyt.zzb(j12, j11, RoundingMode.UNNECESSARY));
                    } else {
                        jArr[i12] = zzQ(j12, 1000000L, j11, roundingMode);
                    }
                }
            }
        }
    }

    public static boolean zzG(SparseArray sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        r4.zzK(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zzH(com.google.android.gms.internal.ads.zzdx r3, com.google.android.gms.internal.ads.zzdx r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.zzb()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            int r0 = r4.zzc()
            int r2 = r3.zzb()
            if (r0 >= r2) goto L1a
            int r0 = r3.zzb()
            int r0 = r0 + r0
            r4.zzF(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.zzN()
            int r2 = r3.zzd()
            int r3 = r3.zzb()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L31:
            byte[] r0 = r4.zzN()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r2 = r4.zzc()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 == 0) goto L4a
            r4.zzK(r3)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            r1 = 1
            goto L6b
        L4a:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 != 0) goto L6b
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 == 0) goto L57
            goto L6b
        L57:
            int r0 = r4.zzc()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r3 != r0) goto L31
            int r0 = r4.zzc()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r0 = r0 + r0
            r4.zzF(r0)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            goto L31
        L66:
            r3 = move-exception
            r5.reset()
            throw r3
        L6b:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeh.zzH(com.google.android.gms.internal.ads.zzdx, com.google.android.gms.internal.ads.zzdx, java.util.zip.Inflater):boolean");
    }

    public static boolean zzI(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean zzJ(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (com.google.android.gms.internal.ads.zzfsb.zzc(r4, "rmx3231") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zzK(android.content.Context r4) {
        /*
            int r0 = com.google.android.gms.internal.ads.zzeh.zza
            r1 = 0
            r2 = 29
            r3 = 1
            if (r0 < r2) goto L36
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            int r4 = r4.targetSdkVersion
            if (r4 < r2) goto L36
            r4 = 30
            if (r0 != r4) goto L26
            java.lang.String r4 = com.google.android.gms.internal.ads.zzeh.zzd
            java.lang.String r2 = "moto g(20)"
            boolean r2 = com.google.android.gms.internal.ads.zzfsb.zzc(r4, r2)
            if (r2 != 0) goto L36
            java.lang.String r2 = "rmx3231"
            boolean r4 = com.google.android.gms.internal.ads.zzfsb.zzc(r4, r2)
            if (r4 != 0) goto L36
        L26:
            r4 = 34
            if (r0 != r4) goto L37
            java.lang.String r4 = com.google.android.gms.internal.ads.zzeh.zzd
            java.lang.String r0 = "sm-x200"
            boolean r4 = com.google.android.gms.internal.ads.zzfsb.zzc(r4, r0)
            if (r4 == 0) goto L35
            goto L36
        L35:
            return r1
        L36:
            r1 = r3
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeh.zzK(android.content.Context):boolean");
    }

    public static boolean zzL(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static boolean zzM(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzN(zzdx zzdxVar, zzdx zzdxVar2, Inflater inflater) {
        return zzdxVar.zzb() > 0 && zzdxVar.zzf() == 120 && zzH(zzdxVar, zzdxVar2, inflater);
    }

    public static Object[] zzO(Object[] objArr, int i10) {
        zzcv.zzd(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    private static int zzP(int i10, int i11) {
        return (char) (zzl[i10 ^ (i11 >> 12)] ^ ((char) (i11 << 4)));
    }

    private static long zzQ(long j10, long j11, long j12, RoundingMode roundingMode) {
        long zzd2 = zzfyt.zzd(j10, j11);
        if (zzd2 != Long.MAX_VALUE && zzd2 != Long.MIN_VALUE) {
            return zzfyt.zzb(zzd2, j12, roundingMode);
        }
        long zzc2 = zzfyt.zzc(Math.abs(j11), Math.abs(j12));
        long zzb2 = zzfyt.zzb(j11, zzc2, RoundingMode.UNNECESSARY);
        long zzb3 = zzfyt.zzb(j12, zzc2, RoundingMode.UNNECESSARY);
        long zzc3 = zzfyt.zzc(Math.abs(j10), Math.abs(zzb3));
        long zzb4 = zzfyt.zzb(j10, zzc3, RoundingMode.UNNECESSARY);
        long zzb5 = zzfyt.zzb(zzb3, zzc3, RoundingMode.UNNECESSARY);
        long zzd3 = zzfyt.zzd(zzb4, zzb2);
        if (zzd3 == Long.MAX_VALUE || zzd3 == Long.MIN_VALUE) {
            double d10 = zzb4 * (zzb2 / zzb5);
            if (d10 > 9.223372036854776E18d) {
                return Long.MAX_VALUE;
            }
            if (d10 < -9.223372036854776E18d) {
                return Long.MIN_VALUE;
            }
            return zzfyo.zzb(d10, roundingMode);
        }
        return zzfyt.zzb(zzd3, zzb5, roundingMode);
    }

    private static String zzR(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e8) {
            zzdn.zzd("Util", "Failed to read system property ".concat(str), e8);
            return null;
        }
    }

    private static HashMap zzS() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zzi.length;
        HashMap hashMap = new HashMap(length + 88);
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
            String[] strArr = zzi;
            int length3 = strArr.length;
            if (i10 >= 88) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static int zza(long[] jArr, long j10, boolean z10, boolean z11) {
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j10);
        return !z10 ? binarySearch : binarySearch - 1;
    }

    public static int zzb(zzdo zzdoVar, long j10, boolean z10, boolean z11) {
        int zza2 = zzdoVar.zza() - 1;
        int i10 = 0;
        while (i10 <= zza2) {
            int i11 = (i10 + zza2) >>> 1;
            if (zzdoVar.zzb(i11) < j10) {
                i10 = i11 + 1;
            } else {
                zza2 = i11 - 1;
            }
        }
        int i12 = zza2 + 1;
        if (i12 >= zzdoVar.zza() || zzdoVar.zzb(i12) != j10) {
            if (zza2 == -1) {
                return 0;
            }
            return zza2;
        }
        return i12;
    }

    public static int zzc(int[] iArr, int i10, boolean z10, boolean z11) {
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

    public static int zzd(long[] jArr, long j10, boolean z10, boolean z11) {
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
            i10 = binarySearch + 1;
        }
        return z11 ? Math.max(0, i10) : i10;
    }

    public static int zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 65535;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = bArr[i14] & 255;
            i13 = zzP(i15 & 15, zzP(i15 >> 4, i13));
        }
        return i13;
    }

    public static int zzf(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = zzk[(i12 >>> 24) ^ (bArr[i10] & 255)] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static int zzg(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        while (i10 < i11) {
            i13 = zzm[i13 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i13;
    }

    public static int zzh(int i10) {
        if (i10 != 20) {
            if (i10 != 22) {
                if (i10 != 30) {
                    switch (i10) {
                        case 2:
                        case 3:
                            return 3;
                        case 4:
                        case 5:
                        case 6:
                            return 21;
                        case 7:
                        case 8:
                            return 23;
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            return 28;
                        default:
                            switch (i10) {
                                case 14:
                                    return 25;
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                    return 28;
                                default:
                                    return Api.BaseClientBuilder.API_PRIORITY_OTHER;
                            }
                    }
                }
                return 34;
            }
            return 31;
        }
        return 30;
    }

    @SuppressLint({"InlinedApi"})
    public static int zzi(int i10) {
        int i11;
        int i12 = 0;
        if (i10 == 10) {
            i11 = 737532;
            i12 = 6396;
        } else if (i10 == 12) {
            return 743676;
        } else {
            if (i10 != 24) {
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
            i11 = 67108860;
        }
        return zza >= 32 ? i11 : i12;
    }

    public static int zzj(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static int zzk(int i10) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 21) {
                        if (i10 != 22) {
                            if (i10 != 268435456) {
                                if (i10 != 1342177280) {
                                    if (i10 != 1610612736) {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                    return 3;
                }
                return 4;
            }
            return 1;
        }
        return 2;
    }

    public static int zzl(int i10) {
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

    public static int zzm(String str) {
        String[] split;
        int length;
        int i10 = 0;
        if (str != null && (length = (split = str.split("_", -1)).length) >= 2) {
            String str2 = split[length - 1];
            boolean z10 = length >= 3 && "neg".equals(split[length + (-2)]);
            Objects.requireNonNull(str2);
            try {
                i10 = Integer.parseInt(str2);
                if (z10) {
                    return -i10;
                }
            } catch (NumberFormatException unused) {
            }
            return i10;
        }
        return 0;
    }

    public static int zzn(int i10) {
        if (i10 != 8) {
            if (i10 != 16) {
                if (i10 != 24) {
                    return i10 != 32 ? 0 : 22;
                }
                return 21;
            }
            return 2;
        }
        return 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zzo(Uri uri) {
        char c10;
        String scheme = uri.getScheme();
        if (scheme == null || !zzfsb.zzc("rtsp", scheme)) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                return 4;
            }
            int lastIndexOf = lastPathSegment.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                String zza2 = zzfsb.zza(lastPathSegment.substring(lastIndexOf + 1));
                switch (zza2.hashCode()) {
                    case 104579:
                        if (zza2.equals("ism")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 108321:
                        if (zza2.equals("mpd")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3242057:
                        if (zza2.equals("isml")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3299913:
                        if (zza2.equals("m3u8")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                int i10 = c10 != 0 ? c10 != 1 ? (c10 == 2 || c10 == 3) ? 1 : 4 : 2 : 0;
                if (i10 != 4) {
                    return i10;
                }
            }
            Pattern pattern = zzg;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            Matcher matcher = pattern.matcher(path);
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
        return 3;
    }

    public static long zzp(long j10, int i10) {
        return zzu(j10, i10, 1000000L, RoundingMode.UP);
    }

    public static long zzq(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    public static long zzr(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    public static long zzs(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static long zzt(long j10, int i10) {
        return zzu(j10, 1000000L, i10, RoundingMode.DOWN);
    }

    public static long zzu(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 >= 0 && j12 % j11 == 0) {
            return zzfyt.zzb(j10, zzfyt.zzb(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i10 < 0 && j11 % j12 == 0) {
            return zzfyt.zzd(j10, zzfyt.zzb(j11, j12, RoundingMode.UNNECESSARY));
        }
        int i11 = (j12 > j10 ? 1 : (j12 == j10 ? 0 : -1));
        if (i11 >= 0 && j12 % j10 == 0) {
            return zzfyt.zzb(j11, zzfyt.zzb(j12, j10, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i11 < 0 && j10 % j12 == 0) {
            return zzfyt.zzd(j11, zzfyt.zzb(j10, j12, RoundingMode.UNNECESSARY));
        }
        return zzQ(j10, j11, j12, roundingMode);
    }

    public static long zzv(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static Point zzw(Context context) {
        String zzR;
        DisplayManager displayManager = (DisplayManager) context.getSystemService(b9.h.f16644d);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Objects.requireNonNull(windowManager);
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzM(context)) {
            if (zza < 28) {
                zzR = zzR("sys.display-size");
            } else {
                zzR = zzR("vendor.display-size");
            }
            if (!TextUtils.isEmpty(zzR)) {
                try {
                    String[] split = zzR.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzdn.zzc("Util", "Invalid display size: ".concat(String.valueOf(zzR)));
            }
            if ("Sony".equals(zzc) && zzd.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static AudioFormat zzx(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static Handler zzy(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        zzcv.zzb(myLooper);
        return new Handler(myLooper, null);
    }

    public static Looper zzz() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }
}
