package a5;

import android.text.TextUtils;
import com.ironsource.b9;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: MimeTypes.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList<a> f519a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f520b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MimeTypes.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f521a;

        /* renamed from: b  reason: collision with root package name */
        public final String f522b;

        /* renamed from: c  reason: collision with root package name */
        public final int f523c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MimeTypes.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f524a;

        /* renamed from: b  reason: collision with root package name */
        public final int f525b;

        public b(int i10, int i11) {
            this.f524a = i10;
            this.f525b = i11;
        }

        public int a() {
            int i10 = this.f525b;
            if (i10 != 2) {
                if (i10 != 5) {
                    if (i10 != 29) {
                        if (i10 != 42) {
                            if (i10 != 22) {
                                return i10 != 23 ? 0 : 15;
                            }
                            return 1073741824;
                        }
                        return 16;
                    }
                    return 12;
                }
                return 11;
            }
            return 10;
        }
    }

    public static boolean a(String str, String str2) {
        b i10;
        int a10;
        if (str == null) {
            return false;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c10 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                return (str2 == null || (i10 = i(str2)) == null || (a10 = i10.a()) == 0 || a10 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean b(String str, String str2) {
        return d(str, str2) != null;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : p0.T0(str)) {
            String g10 = g(str2);
            if (g10 != null && o(g10)) {
                return g10;
            }
        }
        return null;
    }

    public static String d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] T0 = p0.T0(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : T0) {
            if (str2.equals(g(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    private static String e(String str) {
        int size = f519a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f519a.get(i10);
            if (str.startsWith(aVar.f522b)) {
                return aVar.f521a;
            }
        }
        return null;
    }

    public static int f(String str, String str2) {
        b i10;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c10 = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (i10 = i(str2)) == null) {
                    return 0;
                }
                return i10.a();
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    public static String g(String str) {
        b i10;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String e8 = x5.a.e(str.trim());
        if (e8.startsWith("avc1") || e8.startsWith("avc3")) {
            return MimeTypes.VIDEO_H264;
        }
        if (e8.startsWith("hev1") || e8.startsWith("hvc1")) {
            return MimeTypes.VIDEO_H265;
        }
        if (e8.startsWith("dvav") || e8.startsWith("dva1") || e8.startsWith("dvhe") || e8.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (e8.startsWith("av01")) {
            return MimeTypes.VIDEO_AV1;
        }
        if (e8.startsWith("vp9") || e8.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (e8.startsWith("vp8") || e8.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!e8.startsWith("mp4a")) {
            return e8.startsWith("mha1") ? "audio/mha1" : e8.startsWith("mhm1") ? "audio/mhm1" : (e8.startsWith("ac-3") || e8.startsWith("dac3")) ? "audio/ac3" : (e8.startsWith("ec-3") || e8.startsWith("dec3")) ? "audio/eac3" : e8.startsWith("ec+3") ? "audio/eac3-joc" : (e8.startsWith("ac-4") || e8.startsWith("dac4")) ? "audio/ac4" : e8.startsWith("dtsc") ? "audio/vnd.dts" : e8.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (e8.startsWith("dtsh") || e8.startsWith("dtsl")) ? "audio/vnd.dts.hd" : e8.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : e8.startsWith("opus") ? "audio/opus" : e8.startsWith("vorbis") ? "audio/vorbis" : e8.startsWith("flac") ? "audio/flac" : e8.startsWith("stpp") ? "application/ttml+xml" : e8.startsWith("wvtt") ? "text/vtt" : e8.contains("cea708") ? "application/cea-708" : (e8.contains("eia608") || e8.contains("cea608")) ? "application/cea-608" : e(e8);
        }
        if (e8.startsWith("mp4a.") && (i10 = i(e8)) != null) {
            str2 = h(i10.f524a);
        }
        return str2 == null ? "audio/mp4a-latm" : str2;
    }

    public static String h(int i10) {
        if (i10 != 32) {
            if (i10 != 33) {
                if (i10 != 35) {
                    if (i10 != 64) {
                        if (i10 != 163) {
                            if (i10 != 177) {
                                if (i10 != 165) {
                                    if (i10 != 166) {
                                        switch (i10) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return "video/mpeg2";
                                            case 102:
                                            case 103:
                                            case 104:
                                                return "audio/mp4a-latm";
                                            case 105:
                                            case 107:
                                                return "audio/mpeg";
                                            case 106:
                                                return "video/mpeg";
                                            default:
                                                switch (i10) {
                                                    case 169:
                                                    case 172:
                                                        return "audio/vnd.dts";
                                                    case 170:
                                                    case 171:
                                                        return "audio/vnd.dts.hd";
                                                    case 173:
                                                        return "audio/opus";
                                                    case 174:
                                                        return "audio/ac4";
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return MimeTypes.VIDEO_H265;
            }
            return MimeTypes.VIDEO_H264;
        }
        return "video/mp4v-es";
    }

    static b i(String str) {
        Matcher matcher = f520b.matcher(str);
        if (matcher.matches()) {
            String str2 = (String) a5.a.e(matcher.group(1));
            String group = matcher.group(2);
            try {
                return new b(Integer.parseInt(str2, 16), group != null ? Integer.parseInt(group) : 0);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    private static String j(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int k(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (o(str)) {
            return 1;
        }
        if (s(str)) {
            return 2;
        }
        if (r(str)) {
            return 3;
        }
        if (p(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return l(str);
    }

    private static int l(String str) {
        int size = f519a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f519a.get(i10);
            if (str.equals(aVar.f521a)) {
                return aVar.f523c;
            }
        }
        return -1;
    }

    public static int m(String str) {
        return k(g(str));
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : p0.T0(str)) {
            String g10 = g(str2);
            if (g10 != null && s(g10)) {
                return g10;
            }
        }
        return null;
    }

    public static boolean o(String str) {
        return MimeTypes.BASE_TYPE_AUDIO.equals(j(str));
    }

    public static boolean p(String str) {
        return "image".equals(j(str));
    }

    public static boolean q(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(MimeTypes.VIDEO_WEBM) || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    public static boolean r(String str) {
        return b9.h.K0.equals(j(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean s(String str) {
        return "video".equals(j(str));
    }

    public static String t(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c10 = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "audio/flac";
            case 1:
                return "audio/wav";
            case 2:
                return "audio/mpeg";
            default:
                return str;
        }
    }
}
