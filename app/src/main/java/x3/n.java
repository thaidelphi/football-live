package x3;

import a5.p0;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import com.google.protobuf.CodedOutputStream;
import com.ironsource.b9;
import com.unity3d.services.core.device.MimeTypes;
import java.util.List;
import n3.m1;
import x3.v;
/* compiled from: MediaCodecInfo.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final String f32489a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32490b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32491c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f32492d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f32493e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f32494f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f32495g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f32496h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f32497i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f32498j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f32499k;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaCodecInfo.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d10);
            for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
                if (supportedPerformancePoints.get(i12).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }
    }

    n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f32489a = (String) a5.a.e(str);
        this.f32490b = str2;
        this.f32491c = str3;
        this.f32492d = codecCapabilities;
        this.f32496h = z10;
        this.f32497i = z11;
        this.f32498j = z12;
        this.f32493e = z13;
        this.f32494f = z14;
        this.f32495g = z15;
        this.f32499k = a5.x.s(str2);
    }

    private static boolean A(String str, int i10) {
        if (MimeTypes.VIDEO_H265.equals(str) && 2 == i10) {
            String str2 = p0.f483b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean B(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(p0.f483b)) ? false : true;
    }

    public static n C(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new n(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !h(codecCapabilities) || z(str)) ? false : true, codecCapabilities != null && s(codecCapabilities), z14 || (codecCapabilities != null && q(codecCapabilities)));
    }

    private static int a(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((p0.f482a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        if ("audio/ac3".equals(str2)) {
            i11 = 6;
        } else {
            i11 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        a5.t.i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + b9.i.f16698e);
        return i11;
    }

    private static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(p0.l(i10, widthAlignment) * widthAlignment, p0.l(i11, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point c10 = c(videoCapabilities, i10, i11);
        int i12 = c10.x;
        int i13 = c10.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    private static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i10 = intValue >= 180000000 ? 1024 : intValue >= 120000000 ? AdRequest.MAX_CONTENT_URL_LENGTH : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return p0.f482a >= 19 && i(codecCapabilities);
    }

    private static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean l(m1 m1Var) {
        Pair<Integer, Integer> q10;
        if (m1Var.f28182i == null || (q10 = v.q(m1Var)) == null) {
            return true;
        }
        int intValue = ((Integer) q10.first).intValue();
        int intValue2 = ((Integer) q10.second).intValue();
        if ("video/dolby-vision".equals(m1Var.f28185l)) {
            if (MimeTypes.VIDEO_H264.equals(this.f32490b)) {
                intValue = 8;
            } else {
                intValue = MimeTypes.VIDEO_H265.equals(this.f32490b) ? 2 : 2;
            }
            intValue2 = 0;
        }
        if (this.f32499k || intValue == 42) {
            MediaCodecInfo.CodecProfileLevel[] g10 = g();
            if (p0.f482a <= 23 && "video/x-vnd.on2.vp9".equals(this.f32490b) && g10.length == 0) {
                g10 = f(this.f32492d);
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g10) {
                if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2 && !A(this.f32490b, intValue)) {
                    return true;
                }
            }
            w("codec.profileLevel, " + m1Var.f28182i + ", " + this.f32491c);
            return false;
        }
        return true;
    }

    private boolean o(m1 m1Var) {
        return this.f32490b.equals(m1Var.f28185l) || this.f32490b.equals(v.m(m1Var));
    }

    private static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return p0.f482a >= 21 && r(codecCapabilities);
    }

    private static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return p0.f482a >= 21 && t(codecCapabilities);
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void v(String str) {
        a5.t.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f32489a + ", " + this.f32490b + "] [" + p0.f486e + b9.i.f16698e);
    }

    private void w(String str) {
        a5.t.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f32489a + ", " + this.f32490b + "] [" + p0.f486e + b9.i.f16698e);
    }

    private static boolean x(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean y(String str) {
        return p0.f485d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean z(String str) {
        if (p0.f482a <= 22) {
            String str2 = p0.f485d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    public Point b(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f32492d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i10, i11);
    }

    public q3.i e(m1 m1Var, m1 m1Var2) {
        int i10 = !p0.c(m1Var.f28185l, m1Var2.f28185l) ? 8 : 0;
        if (this.f32499k) {
            if (m1Var.f28193t != m1Var2.f28193t) {
                i10 |= 1024;
            }
            if (!this.f32493e && (m1Var.f28190q != m1Var2.f28190q || m1Var.f28191r != m1Var2.f28191r)) {
                i10 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            if (!p0.c(m1Var.f28197x, m1Var2.f28197x)) {
                i10 |= com.ironsource.mediationsdk.metadata.a.f18931n;
            }
            if (y(this.f32489a) && !m1Var.g(m1Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new q3.i(this.f32489a, m1Var, m1Var2, m1Var.g(m1Var2) ? 3 : 2, 0);
            }
        } else {
            if (m1Var.f28198y != m1Var2.f28198y) {
                i10 |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
            }
            if (m1Var.f28199z != m1Var2.f28199z) {
                i10 |= 8192;
            }
            if (m1Var.A != m1Var2.A) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f32490b)) {
                Pair<Integer, Integer> q10 = v.q(m1Var);
                Pair<Integer, Integer> q11 = v.q(m1Var2);
                if (q10 != null && q11 != null) {
                    int intValue = ((Integer) q10.first).intValue();
                    int intValue2 = ((Integer) q11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new q3.i(this.f32489a, m1Var, m1Var2, 3, 0);
                    }
                }
            }
            if (!m1Var.g(m1Var2)) {
                i10 |= 32;
            }
            if (x(this.f32490b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new q3.i(this.f32489a, m1Var, m1Var2, 1, 0);
            }
        }
        return new q3.i(this.f32489a, m1Var, m1Var2, 0, i10);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f32492d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f32492d;
        if (codecCapabilities == null) {
            w("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("channelCount.aCaps");
            return false;
        } else if (a(this.f32489a, this.f32490b, audioCapabilities.getMaxInputChannelCount()) < i10) {
            w("channelCount.support, " + i10);
            return false;
        } else {
            return true;
        }
    }

    public boolean k(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f32492d;
        if (codecCapabilities == null) {
            w("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        } else {
            w("sampleRate.support, " + i10);
            return false;
        }
    }

    public boolean m(m1 m1Var) throws v.c {
        int i10;
        if (o(m1Var) && l(m1Var)) {
            if (this.f32499k) {
                int i11 = m1Var.f28190q;
                if (i11 <= 0 || (i10 = m1Var.f28191r) <= 0) {
                    return true;
                }
                if (p0.f482a >= 21) {
                    return u(i11, i10, m1Var.f28192s);
                }
                boolean z10 = i11 * i10 <= v.N();
                if (!z10) {
                    w("legacyFrameSize, " + m1Var.f28190q + "x" + m1Var.f28191r);
                }
                return z10;
            }
            if (p0.f482a >= 21) {
                int i12 = m1Var.f28199z;
                if (i12 != -1 && !k(i12)) {
                    return false;
                }
                int i13 = m1Var.f28198y;
                if (i13 != -1 && !j(i13)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean n() {
        if (p0.f482a >= 29 && "video/x-vnd.on2.vp9".equals(this.f32490b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean p(m1 m1Var) {
        if (this.f32499k) {
            return this.f32493e;
        }
        Pair<Integer, Integer> q10 = v.q(m1Var);
        return q10 != null && ((Integer) q10.first).intValue() == 42;
    }

    public String toString() {
        return this.f32489a;
    }

    public boolean u(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f32492d;
        if (codecCapabilities == null) {
            w("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            w("sizeAndRate.vCaps");
            return false;
        }
        if (p0.f482a >= 29) {
            int a10 = a.a(videoCapabilities, i10, i11, d10);
            if (a10 == 2) {
                return true;
            }
            if (a10 == 1) {
                w("sizeAndRate.cover, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        if (!d(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11 && B(this.f32489a) && d(videoCapabilities, i11, i10, d10)) {
                v("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10);
            } else {
                w("sizeAndRate.support, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        return true;
    }
}
