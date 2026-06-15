package k4;

import a5.n0;
import a5.p0;
import a5.x;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.gms.ads.AdRequest;
import com.google.protobuf.CodedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.g;
import k4.h;
import n3.h2;
import n3.m1;
import y5.t;
import z4.l0;
import z4.m0;
/* compiled from: HlsPlaylistParser.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j implements m0.a<i> {

    /* renamed from: a  reason: collision with root package name */
    private final h f27258a;

    /* renamed from: b  reason: collision with root package name */
    private final g f27259b;

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f27234c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f27235d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f27236e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f27237f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f27238g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f27239h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f27240i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f27241j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f27242k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f27243l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f27244m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n  reason: collision with root package name */
    private static final Pattern f27245n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o  reason: collision with root package name */
    private static final Pattern f27246o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p  reason: collision with root package name */
    private static final Pattern f27247p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f27248q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f27249r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s  reason: collision with root package name */
    private static final Pattern f27250s = c("CAN-SKIP-DATERANGES");

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f27251t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u  reason: collision with root package name */
    private static final Pattern f27252u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v  reason: collision with root package name */
    private static final Pattern f27253v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w  reason: collision with root package name */
    private static final Pattern f27254w = c("CAN-BLOCK-RELOAD");

    /* renamed from: x  reason: collision with root package name */
    private static final Pattern f27255x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y  reason: collision with root package name */
    private static final Pattern f27256y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z  reason: collision with root package name */
    private static final Pattern f27257z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern A = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern B = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern I = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern K = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern L = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern N = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern O = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern P = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern Q = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern T = c("AUTOSELECT");
    private static final Pattern U = c("DEFAULT");
    private static final Pattern V = c("FORCED");
    private static final Pattern W = c("INDEPENDENT");
    private static final Pattern X = c("GAP");
    private static final Pattern Y = c("PRECISE");
    private static final Pattern Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0  reason: collision with root package name */
    private static final Pattern f27232a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0  reason: collision with root package name */
    private static final Pattern f27233b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* compiled from: HlsPlaylistParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a extends IOException {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HlsPlaylistParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final BufferedReader f27260a;

        /* renamed from: b  reason: collision with root package name */
        private final Queue<String> f27261b;

        /* renamed from: c  reason: collision with root package name */
        private String f27262c;

        public b(Queue<String> queue, BufferedReader bufferedReader) {
            this.f27261b = queue;
            this.f27260a = bufferedReader;
        }

        public boolean a() throws IOException {
            String trim;
            if (this.f27262c != null) {
                return true;
            }
            if (!this.f27261b.isEmpty()) {
                this.f27262c = (String) a5.a.e(this.f27261b.poll());
                return true;
            }
            do {
                String readLine = this.f27260a.readLine();
                this.f27262c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f27262c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() throws IOException {
            if (a()) {
                String str = this.f27262c;
                this.f27262c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public j() {
        this(h.f27208n, null);
    }

    private static long A(String str, Pattern pattern) throws h2 {
        return new BigDecimal(z(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String B(String str, Map<String, String> map) {
        Matcher matcher = f27233b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int C(BufferedReader bufferedReader, boolean z10, int i10) throws IOException {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !p0.v0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    private static boolean b(BufferedReader bufferedReader) throws IOException {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int C2 = C(bufferedReader, true, read);
        for (int i10 = 0; i10 < 7; i10++) {
            if (C2 != "#EXTM3U".charAt(i10)) {
                return false;
            }
            C2 = bufferedReader.read();
        }
        return p0.v0(C(bufferedReader, false, C2));
    }

    private static Pattern c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    private static DrmInitData d(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i10 = 0; i10 < schemeDataArr.length; i10++) {
            schemeDataArr2[i10] = schemeDataArr[i10].b(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    private static String e(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    private static h.b f(ArrayList<h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f27226d)) {
                return bVar;
            }
        }
        return null;
    }

    private static h.b g(ArrayList<h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f27227e)) {
                return bVar;
            }
        }
        return null;
    }

    private static h.b h(ArrayList<h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f27225c)) {
                return bVar;
            }
        }
        return null;
    }

    private static double j(String str, Pattern pattern) throws h2 {
        return Double.parseDouble(z(str, pattern, Collections.emptyMap()));
    }

    private static DrmInitData.SchemeData k(String str, String str2, Map<String, String> map) throws h2 {
        String u10 = u(str, J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String z10 = z(str, K, map);
            return new DrmInitData.SchemeData(n3.i.f28007d, "video/mp4", Base64.decode(z10.substring(z10.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(n3.i.f28007d, "hls", p0.m0(str));
        } else {
            if ("com.microsoft.playready".equals(str2) && "1".equals(u10)) {
                String z11 = z(str, K, map);
                byte[] decode = Base64.decode(z11.substring(z11.indexOf(44)), 0);
                UUID uuid = n3.i.f28008e;
                return new DrmInitData.SchemeData(uuid, "video/mp4", v3.g.a(uuid, decode));
            }
            return null;
        }
    }

    private static String l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static int m(String str, Pattern pattern) throws h2 {
        return Integer.parseInt(z(str, pattern, Collections.emptyMap()));
    }

    private static long n(String str, Pattern pattern) throws h2 {
        return Long.parseLong(z(str, pattern, Collections.emptyMap()));
    }

    private static g o(h hVar, g gVar, b bVar, String str) throws IOException {
        ArrayList arrayList;
        String str2;
        ArrayList arrayList2;
        String str3;
        long j10;
        int i10;
        g.b bVar2;
        String str4;
        String str5;
        long C0;
        int i11;
        long j11;
        long j12;
        long j13;
        boolean z10;
        DrmInitData drmInitData;
        String v10;
        String str6;
        h hVar2 = hVar;
        g gVar2 = gVar;
        boolean z11 = hVar2.f27231c;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        g.f fVar = new g.f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str7 = "";
        boolean z12 = z11;
        g.f fVar2 = fVar;
        String str8 = "";
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = 0;
        int i12 = 0;
        long j22 = -9223372036854775807L;
        boolean z13 = false;
        boolean z14 = false;
        int i13 = 0;
        int i14 = 1;
        long j23 = -9223372036854775807L;
        long j24 = -9223372036854775807L;
        boolean z15 = false;
        DrmInitData drmInitData2 = null;
        DrmInitData drmInitData3 = null;
        boolean z16 = false;
        String str9 = null;
        long j25 = -1;
        String str10 = null;
        String str11 = null;
        int i15 = 0;
        boolean z17 = false;
        g.d dVar = null;
        ArrayList arrayList7 = arrayList4;
        g.b bVar3 = null;
        while (bVar.a()) {
            String b10 = bVar.b();
            if (b10.startsWith("#EXT")) {
                arrayList6.add(b10);
            }
            if (b10.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String z18 = z(b10, f27248q, hashMap);
                if ("VOD".equals(z18)) {
                    i12 = 1;
                } else if ("EVENT".equals(z18)) {
                    i12 = 2;
                }
            } else if (b10.equals("#EXT-X-I-FRAMES-ONLY")) {
                z17 = true;
            } else if (b10.startsWith("#EXT-X-START")) {
                j22 = (long) (j(b10, C) * 1000000.0d);
                z13 = q(b10, Y, false);
            } else if (b10.startsWith("#EXT-X-SERVER-CONTROL")) {
                fVar2 = y(b10);
            } else if (b10.startsWith("#EXT-X-PART-INF")) {
                j24 = (long) (j(b10, f27246o) * 1000000.0d);
            } else if (b10.startsWith("#EXT-X-MAP")) {
                String z19 = z(b10, K, hashMap);
                String v11 = v(b10, E, hashMap);
                if (v11 != null) {
                    String[] R0 = p0.R0(v11, "@");
                    j25 = Long.parseLong(R0[0]);
                    if (R0.length > 1) {
                        j16 = Long.parseLong(R0[1]);
                    }
                }
                int i16 = (j25 > (-1L) ? 1 : (j25 == (-1L) ? 0 : -1));
                if (i16 == 0) {
                    j16 = 0;
                }
                String str12 = str9;
                String str13 = str10;
                if (str12 != null && str13 == null) {
                    throw h2.c("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                }
                dVar = new g.d(z19, j16, j25, str12, str13);
                if (i16 != 0) {
                    j16 += j25;
                }
                str10 = str13;
                str9 = str12;
                j25 = -1;
            } else {
                String str14 = str9;
                String str15 = str10;
                ArrayList arrayList8 = arrayList6;
                if (b10.startsWith("#EXT-X-TARGETDURATION")) {
                    arrayList = arrayList7;
                    j23 = 1000000 * m(b10, f27244m);
                } else {
                    arrayList = arrayList7;
                    if (b10.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        j19 = n(b10, f27255x);
                        str10 = str15;
                        arrayList7 = arrayList;
                        arrayList6 = arrayList8;
                        j15 = j19;
                    } else if (b10.startsWith("#EXT-X-VERSION")) {
                        i14 = m(b10, f27247p);
                    } else {
                        if (b10.startsWith("#EXT-X-DEFINE")) {
                            String v12 = v(b10, f27232a0, hashMap);
                            if (v12 != null) {
                                String str16 = hVar2.f27217l.get(v12);
                                if (str16 != null) {
                                    hashMap.put(v12, str16);
                                }
                            } else {
                                hashMap.put(z(b10, P, hashMap), z(b10, Z, hashMap));
                            }
                            str2 = str7;
                            arrayList2 = arrayList;
                            str3 = str11;
                            j10 = j19;
                            i10 = i12;
                            bVar2 = bVar3;
                            str4 = str15;
                        } else if (b10.startsWith("#EXTINF")) {
                            j20 = A(b10, f27256y);
                            str8 = u(b10, f27257z, str7, hashMap);
                        } else {
                            if (b10.startsWith("#EXT-X-SKIP")) {
                                int m7 = m(b10, f27251t);
                                a5.a.f(gVar2 != null && arrayList3.isEmpty());
                                str2 = str7;
                                str5 = str15;
                                int i17 = (int) (j15 - ((g) p0.j(gVar)).f27173k);
                                int i18 = m7 + i17;
                                if (i17 < 0 || i18 > gVar2.f27180r.size()) {
                                    throw new a();
                                }
                                long j26 = j18;
                                while (i17 < i18) {
                                    g.d dVar2 = gVar2.f27180r.get(i17);
                                    if (j15 != gVar2.f27173k) {
                                        dVar2 = dVar2.b(j26, (gVar2.f27172j - i13) + dVar2.f27195d);
                                    }
                                    arrayList3.add(dVar2);
                                    j26 += dVar2.f27194c;
                                    long j27 = dVar2.f27201j;
                                    if (j27 != -1) {
                                        j16 = dVar2.f27200i + j27;
                                    }
                                    int i19 = dVar2.f27195d;
                                    g.d dVar3 = dVar2.f27193b;
                                    DrmInitData drmInitData4 = dVar2.f27197f;
                                    String str17 = dVar2.f27198g;
                                    String str18 = dVar2.f27199h;
                                    if (str18 == null || !str18.equals(Long.toHexString(j19))) {
                                        str5 = dVar2.f27199h;
                                    }
                                    j19++;
                                    i17++;
                                    gVar2 = gVar;
                                    j17 = j26;
                                    i15 = i19;
                                    dVar = dVar3;
                                    drmInitData3 = drmInitData4;
                                    str14 = str17;
                                }
                                hVar2 = hVar;
                                gVar2 = gVar;
                                j18 = j26;
                            } else {
                                str2 = str7;
                                str5 = str15;
                                if (b10.startsWith("#EXT-X-KEY")) {
                                    String z20 = z(b10, H, hashMap);
                                    String u10 = u(b10, I, "identity", hashMap);
                                    if ("NONE".equals(z20)) {
                                        treeMap.clear();
                                        str6 = null;
                                        v10 = null;
                                        drmInitData3 = null;
                                    } else {
                                        v10 = v(b10, L, hashMap);
                                        if ("identity".equals(u10)) {
                                            if ("AES-128".equals(z20)) {
                                                str6 = z(b10, K, hashMap);
                                            }
                                            str6 = null;
                                        } else {
                                            String str19 = str11;
                                            str11 = str19 == null ? l(z20) : str19;
                                            DrmInitData.SchemeData k10 = k(b10, u10, hashMap);
                                            if (k10 != null) {
                                                treeMap.put(u10, k10);
                                                str6 = null;
                                                drmInitData3 = null;
                                            }
                                            str6 = null;
                                        }
                                    }
                                    gVar2 = gVar;
                                    arrayList7 = arrayList;
                                    str7 = str2;
                                    str10 = v10;
                                    arrayList6 = arrayList8;
                                    str9 = str6;
                                    hVar2 = hVar;
                                } else {
                                    str3 = str11;
                                    if (b10.startsWith("#EXT-X-BYTERANGE")) {
                                        String[] R02 = p0.R0(z(b10, D, hashMap), "@");
                                        j25 = Long.parseLong(R02[0]);
                                        if (R02.length > 1) {
                                            j16 = Long.parseLong(R02[1]);
                                        }
                                    } else if (b10.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i13 = Integer.parseInt(b10.substring(b10.indexOf(58) + 1));
                                        hVar2 = hVar;
                                        gVar2 = gVar;
                                        str11 = str3;
                                        arrayList7 = arrayList;
                                        arrayList6 = arrayList8;
                                        str7 = str2;
                                        str10 = str5;
                                        z14 = true;
                                    } else if (b10.equals("#EXT-X-DISCONTINUITY")) {
                                        i15++;
                                    } else {
                                        if (b10.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (j14 == 0) {
                                                try {
                                                    C0 = p0.C0(p0.J0(b10.substring(b10.indexOf(58) + 1)));
                                                } catch (Exception unused) {
                                                    C0 = p0.C0(p0.J0(b10.substring(b10.indexOf(58) + 1).replace(" ", "+")));
                                                }
                                                j14 = C0 - j18;
                                            } else {
                                                i10 = i12;
                                            }
                                        } else if (b10.equals("#EXT-X-GAP")) {
                                            hVar2 = hVar;
                                            gVar2 = gVar;
                                            str11 = str3;
                                            arrayList7 = arrayList;
                                            arrayList6 = arrayList8;
                                            str7 = str2;
                                            str10 = str5;
                                            z16 = true;
                                        } else if (b10.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            hVar2 = hVar;
                                            gVar2 = gVar;
                                            str11 = str3;
                                            arrayList7 = arrayList;
                                            arrayList6 = arrayList8;
                                            str7 = str2;
                                            str10 = str5;
                                            z12 = true;
                                        } else if (b10.equals("#EXT-X-ENDLIST")) {
                                            hVar2 = hVar;
                                            gVar2 = gVar;
                                            str11 = str3;
                                            arrayList7 = arrayList;
                                            arrayList6 = arrayList8;
                                            str7 = str2;
                                            str10 = str5;
                                            z15 = true;
                                        } else {
                                            if (b10.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                i11 = i12;
                                                arrayList5.add(new g.c(Uri.parse(n0.d(str, z(b10, K, hashMap))), t(b10, A, -1L), s(b10, B, -1)));
                                            } else {
                                                i11 = i12;
                                                if (b10.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                    if (bVar3 == null && "PART".equals(z(b10, N, hashMap))) {
                                                        String z21 = z(b10, K, hashMap);
                                                        long t10 = t(b10, F, -1L);
                                                        long t11 = t(b10, G, -1L);
                                                        long j28 = j19;
                                                        String e8 = e(j28, str14, str5);
                                                        if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                            DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                            DrmInitData drmInitData5 = new DrmInitData(str3, schemeDataArr);
                                                            if (drmInitData2 == null) {
                                                                drmInitData2 = d(str3, schemeDataArr);
                                                            }
                                                            drmInitData3 = drmInitData5;
                                                        }
                                                        int i20 = (t10 > (-1L) ? 1 : (t10 == (-1L) ? 0 : -1));
                                                        if (i20 == 0 || t11 != -1) {
                                                            bVar3 = new g.b(z21, dVar, 0L, i15, j17, drmInitData3, str14, e8, i20 != 0 ? t10 : 0L, t11, false, false, true);
                                                        }
                                                        j19 = j28;
                                                        str11 = str3;
                                                        arrayList7 = arrayList;
                                                        str7 = str2;
                                                        hVar2 = hVar;
                                                        gVar2 = gVar;
                                                        str10 = str5;
                                                        i12 = i11;
                                                        arrayList6 = arrayList8;
                                                    }
                                                } else {
                                                    long j29 = j19;
                                                    str4 = str5;
                                                    if (b10.startsWith("#EXT-X-PART")) {
                                                        String e10 = e(j29, str14, str4);
                                                        String z22 = z(b10, K, hashMap);
                                                        long j30 = (long) (j(b10, f27245n) * 1000000.0d);
                                                        g.b bVar4 = bVar3;
                                                        boolean q10 = q(b10, W, false) | (z12 && arrayList.isEmpty());
                                                        boolean q11 = q(b10, X, false);
                                                        String v13 = v(b10, E, hashMap);
                                                        if (v13 != null) {
                                                            String[] R03 = p0.R0(v13, "@");
                                                            j11 = Long.parseLong(R03[0]);
                                                            if (R03.length > 1) {
                                                                j21 = Long.parseLong(R03[1]);
                                                            }
                                                        } else {
                                                            j11 = -1;
                                                        }
                                                        int i21 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
                                                        if (i21 == 0) {
                                                            j21 = 0;
                                                        }
                                                        if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                            DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                            DrmInitData drmInitData6 = new DrmInitData(str3, schemeDataArr2);
                                                            if (drmInitData2 == null) {
                                                                drmInitData2 = d(str3, schemeDataArr2);
                                                            }
                                                            drmInitData3 = drmInitData6;
                                                        }
                                                        arrayList2 = arrayList;
                                                        arrayList2.add(new g.b(z22, dVar, j30, i15, j17, drmInitData3, str14, e10, j21, j11, q11, q10, false));
                                                        j17 += j30;
                                                        if (i21 != 0) {
                                                            j21 += j11;
                                                        }
                                                        arrayList6 = arrayList8;
                                                        str7 = str2;
                                                        bVar3 = bVar4;
                                                        j19 = j29;
                                                        str10 = str4;
                                                        str9 = str14;
                                                        i12 = i11;
                                                        hVar2 = hVar;
                                                        gVar2 = gVar;
                                                        str11 = str3;
                                                        arrayList7 = arrayList2;
                                                    } else {
                                                        bVar2 = bVar3;
                                                        i10 = i11;
                                                        arrayList2 = arrayList;
                                                        if (b10.startsWith("#")) {
                                                            j10 = j29;
                                                        } else {
                                                            String e11 = e(j29, str14, str4);
                                                            long j31 = j29 + 1;
                                                            String B2 = B(b10, hashMap);
                                                            g.d dVar4 = (g.d) hashMap2.get(B2);
                                                            int i22 = (j25 > (-1L) ? 1 : (j25 == (-1L) ? 0 : -1));
                                                            if (i22 == 0) {
                                                                j12 = 0;
                                                            } else {
                                                                if (z17 && dVar == null && dVar4 == null) {
                                                                    dVar4 = new g.d(B2, 0L, j16, null, null);
                                                                    hashMap2.put(B2, dVar4);
                                                                }
                                                                j12 = j16;
                                                            }
                                                            if (drmInitData3 != null || treeMap.isEmpty()) {
                                                                j13 = j31;
                                                                z10 = false;
                                                                drmInitData = drmInitData3;
                                                            } else {
                                                                j13 = j31;
                                                                z10 = false;
                                                                DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                drmInitData = new DrmInitData(str3, schemeDataArr3);
                                                                if (drmInitData2 == null) {
                                                                    drmInitData2 = d(str3, schemeDataArr3);
                                                                }
                                                            }
                                                            arrayList3.add(new g.d(B2, dVar != null ? dVar : dVar4, str8, j20, i15, j18, drmInitData, str14, e11, j12, j25, z16, arrayList2));
                                                            j17 = j18 + j20;
                                                            ArrayList arrayList9 = new ArrayList();
                                                            if (i22 != 0) {
                                                                j12 += j25;
                                                            }
                                                            j16 = j12;
                                                            z16 = z10;
                                                            drmInitData3 = drmInitData;
                                                            j20 = 0;
                                                            j18 = j17;
                                                            arrayList6 = arrayList8;
                                                            str7 = str2;
                                                            str8 = str7;
                                                            bVar3 = bVar2;
                                                            j25 = -1;
                                                            hVar2 = hVar;
                                                            str10 = str4;
                                                            str9 = str14;
                                                            j19 = j13;
                                                            i12 = i10;
                                                            str11 = str3;
                                                            arrayList7 = arrayList9;
                                                            gVar2 = gVar;
                                                        }
                                                    }
                                                }
                                            }
                                            i10 = i11;
                                        }
                                        arrayList2 = arrayList;
                                        j10 = j19;
                                        str4 = str5;
                                        bVar2 = bVar3;
                                    }
                                    hVar2 = hVar;
                                    gVar2 = gVar;
                                    str11 = str3;
                                }
                            }
                            arrayList7 = arrayList;
                            arrayList6 = arrayList8;
                            str7 = str2;
                            str10 = str5;
                        }
                        hVar2 = hVar;
                        gVar2 = gVar;
                        arrayList6 = arrayList8;
                        str7 = str2;
                        bVar3 = bVar2;
                        str10 = str4;
                        str9 = str14;
                        j19 = j10;
                        i12 = i10;
                        str11 = str3;
                        arrayList7 = arrayList2;
                    }
                    str9 = str14;
                }
                str10 = str15;
                arrayList7 = arrayList;
                arrayList6 = arrayList8;
                str9 = str14;
            }
        }
        int i23 = i12;
        g.b bVar5 = bVar3;
        ArrayList arrayList10 = arrayList7;
        ArrayList arrayList11 = arrayList6;
        HashMap hashMap3 = new HashMap();
        for (int i24 = 0; i24 < arrayList5.size(); i24++) {
            g.c cVar = (g.c) arrayList5.get(i24);
            long j32 = cVar.f27188b;
            if (j32 == -1) {
                j32 = (j15 + arrayList3.size()) - (arrayList10.isEmpty() ? 1L : 0L);
            }
            int i25 = cVar.f27189c;
            if (i25 == -1 && j24 != -9223372036854775807L) {
                i25 = (arrayList10.isEmpty() ? ((g.d) t.c(arrayList3)).f27191m : arrayList10).size() - 1;
            }
            Uri uri = cVar.f27187a;
            hashMap3.put(uri, new g.c(uri, j32, i25));
        }
        if (bVar5 != null) {
            arrayList10.add(bVar5);
        }
        return new g(i23, str, arrayList11, j22, z13, j14, z14, i13, j15, i14, j23, j24, z12, z15, j14 != 0, drmInitData2, arrayList3, arrayList10, fVar2, hashMap3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    private static h p(b bVar, String str) throws IOException {
        char c10;
        m1 m1Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        String str4;
        boolean z10;
        int i10;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i11;
        int i12;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        Uri e8;
        HashMap hashMap;
        int i13;
        String str5 = str;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            String str6 = "application/x-mpegURL";
            if (bVar.a()) {
                String b10 = bVar.b();
                if (b10.startsWith("#EXT")) {
                    arrayList18.add(b10);
                }
                boolean startsWith = b10.startsWith("#EXT-X-I-FRAME-STREAM-INF");
                boolean z13 = z11;
                if (b10.startsWith("#EXT-X-DEFINE")) {
                    hashMap3.put(z(b10, P, hashMap3), z(b10, Z, hashMap3));
                } else {
                    if (b10.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                        hashMap = hashMap2;
                        arrayList10 = arrayList16;
                        arrayList9 = arrayList12;
                        arrayList8 = arrayList13;
                        arrayList7 = arrayList14;
                        arrayList5 = arrayList15;
                        arrayList6 = arrayList18;
                        arrayList4 = arrayList17;
                        z11 = true;
                    } else if (b10.startsWith("#EXT-X-MEDIA")) {
                        arrayList16.add(b10);
                    } else if (b10.startsWith("#EXT-X-SESSION-KEY")) {
                        DrmInitData.SchemeData k10 = k(b10, u(b10, I, "identity", hashMap3), hashMap3);
                        if (k10 != null) {
                            arrayList17.add(new DrmInitData(l(z(b10, H, hashMap3)), k10));
                        }
                    } else if (b10.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                        boolean contains = z12 | b10.contains("CLOSED-CAPTIONS=NONE");
                        if (startsWith) {
                            i10 = 16384;
                            z10 = contains;
                        } else {
                            z10 = contains;
                            i10 = 0;
                        }
                        int m7 = m(b10, f27239h);
                        arrayList4 = arrayList17;
                        arrayList5 = arrayList15;
                        int s10 = s(b10, f27234c, -1);
                        String v10 = v(b10, f27241j, hashMap3);
                        arrayList6 = arrayList18;
                        String v11 = v(b10, f27242k, hashMap3);
                        if (v11 != null) {
                            arrayList7 = arrayList14;
                            String[] R0 = p0.R0(v11, "x");
                            int parseInt2 = Integer.parseInt(R0[0]);
                            int parseInt3 = Integer.parseInt(R0[1]);
                            if (parseInt2 <= 0 || parseInt3 <= 0) {
                                parseInt3 = -1;
                                i13 = -1;
                            } else {
                                i13 = parseInt2;
                            }
                            i12 = parseInt3;
                            i11 = i13;
                        } else {
                            arrayList7 = arrayList14;
                            i11 = -1;
                            i12 = -1;
                        }
                        arrayList8 = arrayList13;
                        String v12 = v(b10, f27243l, hashMap3);
                        arrayList9 = arrayList12;
                        float parseFloat = v12 != null ? Float.parseFloat(v12) : -1.0f;
                        String v13 = v(b10, f27235d, hashMap3);
                        arrayList10 = arrayList16;
                        String v14 = v(b10, f27236e, hashMap3);
                        HashMap hashMap4 = hashMap2;
                        String v15 = v(b10, f27237f, hashMap3);
                        String v16 = v(b10, f27238g, hashMap3);
                        if (startsWith) {
                            e8 = n0.e(str5, z(b10, K, hashMap3));
                        } else if (bVar.a()) {
                            e8 = n0.e(str5, B(bVar.b(), hashMap3));
                        } else {
                            throw h2.c("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        arrayList11.add(new h.b(e8, new m1.b().R(arrayList11.size()).K("application/x-mpegURL").I(v10).G(s10).Z(m7).j0(i11).Q(i12).P(parseFloat).c0(i10).E(), v13, v14, v15, v16));
                        hashMap = hashMap4;
                        ArrayList arrayList19 = (ArrayList) hashMap.get(e8);
                        if (arrayList19 == null) {
                            arrayList19 = new ArrayList();
                            hashMap.put(e8, arrayList19);
                        }
                        arrayList19.add(new HlsTrackMetadataEntry.VariantInfo(s10, m7, v13, v14, v15, v16));
                        z11 = z13;
                        z12 = z10;
                    }
                    hashMap2 = hashMap;
                    arrayList17 = arrayList4;
                    arrayList15 = arrayList5;
                    arrayList18 = arrayList6;
                    arrayList14 = arrayList7;
                    arrayList13 = arrayList8;
                    arrayList12 = arrayList9;
                    arrayList16 = arrayList10;
                    str5 = str;
                }
                hashMap = hashMap2;
                arrayList10 = arrayList16;
                arrayList9 = arrayList12;
                arrayList8 = arrayList13;
                arrayList7 = arrayList14;
                arrayList5 = arrayList15;
                arrayList6 = arrayList18;
                arrayList4 = arrayList17;
                z11 = z13;
                hashMap2 = hashMap;
                arrayList17 = arrayList4;
                arrayList15 = arrayList5;
                arrayList18 = arrayList6;
                arrayList14 = arrayList7;
                arrayList13 = arrayList8;
                arrayList12 = arrayList9;
                arrayList16 = arrayList10;
                str5 = str;
            } else {
                HashMap hashMap5 = hashMap2;
                ArrayList arrayList20 = arrayList16;
                ArrayList arrayList21 = arrayList12;
                ArrayList arrayList22 = arrayList13;
                ArrayList arrayList23 = arrayList14;
                ArrayList arrayList24 = arrayList15;
                ArrayList arrayList25 = arrayList18;
                boolean z14 = z11;
                ArrayList arrayList26 = arrayList17;
                ArrayList arrayList27 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i14 = 0; i14 < arrayList11.size(); i14++) {
                    h.b bVar2 = (h.b) arrayList11.get(i14);
                    if (hashSet.add(bVar2.f27223a)) {
                        a5.a.f(bVar2.f27224b.f28183j == null);
                        arrayList27.add(bVar2.a(bVar2.f27224b.b().X(new Metadata(new HlsTrackMetadataEntry(null, null, (List) a5.a.e((ArrayList) hashMap5.get(bVar2.f27223a))))).E()));
                    }
                }
                Uri uri = null;
                ArrayList arrayList28 = null;
                m1 m1Var2 = null;
                int i15 = 0;
                while (i15 < arrayList20.size()) {
                    ArrayList arrayList29 = arrayList20;
                    String str7 = (String) arrayList29.get(i15);
                    String z15 = z(str7, Q, hashMap3);
                    String z16 = z(str7, P, hashMap3);
                    m1.b V2 = new m1.b().S(z15 + ":" + z16).U(z16).K(str6).g0(x(str7)).c0(w(str7, hashMap3)).V(v(str7, O, hashMap3));
                    String v17 = v(str7, K, hashMap3);
                    Uri e10 = v17 == null ? uri : n0.e(str, v17);
                    arrayList20 = arrayList29;
                    String str8 = str6;
                    Metadata metadata = new Metadata(new HlsTrackMetadataEntry(z15, z16, Collections.emptyList()));
                    String z17 = z(str7, M, hashMap3);
                    z17.hashCode();
                    switch (z17.hashCode()) {
                        case -959297733:
                            if (z17.equals("SUBTITLES")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -333210994:
                            if (z17.equals("CLOSED-CAPTIONS")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 62628790:
                            if (z17.equals("AUDIO")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 81665115:
                            if (z17.equals("VIDEO")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            m1Var = m1Var2;
                            arrayList = arrayList22;
                            arrayList2 = arrayList21;
                            h.b g10 = g(arrayList11, z15);
                            if (g10 != null) {
                                String K2 = p0.K(g10.f27224b.f28182i, 3);
                                V2.I(K2);
                                str2 = x.g(K2);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            V2.e0(str2).X(metadata);
                            if (e10 != null) {
                                h.a aVar = new h.a(e10, V2.E(), z15, z16);
                                arrayList3 = arrayList23;
                                arrayList3.add(aVar);
                                break;
                            } else {
                                arrayList3 = arrayList23;
                                a5.t.i("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                        case 1:
                            m1Var = m1Var2;
                            arrayList = arrayList22;
                            arrayList2 = arrayList21;
                            String z18 = z(str7, S, hashMap3);
                            if (z18.startsWith("CC")) {
                                parseInt = Integer.parseInt(z18.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(z18.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (arrayList28 == null) {
                                arrayList28 = new ArrayList();
                            }
                            V2.e0(str3).F(parseInt);
                            arrayList28.add(V2.E());
                            arrayList3 = arrayList23;
                            break;
                        case 2:
                            arrayList2 = arrayList21;
                            h.b f10 = f(arrayList11, z15);
                            if (f10 != null) {
                                m1Var = m1Var2;
                                String K3 = p0.K(f10.f27224b.f28182i, 1);
                                V2.I(K3);
                                str4 = x.g(K3);
                            } else {
                                m1Var = m1Var2;
                                str4 = null;
                            }
                            String v18 = v(str7, f27240i, hashMap3);
                            if (v18 != null) {
                                V2.H(Integer.parseInt(p0.S0(v18, "/")[0]));
                                if ("audio/eac3".equals(str4) && v18.endsWith("/JOC")) {
                                    V2.I("ec+3");
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            V2.e0(str4);
                            if (e10 != null) {
                                V2.X(metadata);
                                arrayList = arrayList22;
                                arrayList.add(new h.a(e10, V2.E(), z15, z16));
                            } else {
                                arrayList = arrayList22;
                                if (f10 != null) {
                                    m1Var = V2.E();
                                }
                            }
                            arrayList3 = arrayList23;
                            break;
                        case 3:
                            h.b h10 = h(arrayList11, z15);
                            if (h10 != null) {
                                m1 m1Var3 = h10.f27224b;
                                String K4 = p0.K(m1Var3.f28182i, 2);
                                V2.I(K4).e0(x.g(K4)).j0(m1Var3.f28190q).Q(m1Var3.f28191r).P(m1Var3.f28192s);
                            }
                            if (e10 != null) {
                                V2.X(metadata);
                                arrayList2 = arrayList21;
                                arrayList2.add(new h.a(e10, V2.E(), z15, z16));
                                m1Var = m1Var2;
                                arrayList3 = arrayList23;
                                arrayList = arrayList22;
                                break;
                            }
                        default:
                            m1Var = m1Var2;
                            arrayList3 = arrayList23;
                            arrayList = arrayList22;
                            arrayList2 = arrayList21;
                            break;
                    }
                    i15++;
                    arrayList23 = arrayList3;
                    arrayList22 = arrayList;
                    arrayList21 = arrayList2;
                    str6 = str8;
                    m1Var2 = m1Var;
                    uri = null;
                }
                return new h(str, arrayList25, arrayList27, arrayList21, arrayList22, arrayList23, arrayList24, m1Var2, z12 ? Collections.emptyList() : arrayList28, z14, hashMap3, arrayList26);
            }
        }
    }

    private static boolean q(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z10;
    }

    private static double r(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) a5.a.e(matcher.group(1))) : d10;
    }

    private static int s(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) a5.a.e(matcher.group(1))) : i10;
    }

    private static long t(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) a5.a.e(matcher.group(1))) : j10;
    }

    private static String u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) a5.a.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : B(str2, map);
    }

    private static String v(String str, Pattern pattern, Map<String, String> map) {
        return u(str, pattern, null, map);
    }

    private static int w(String str, Map<String, String> map) {
        String v10 = v(str, R, map);
        if (TextUtils.isEmpty(v10)) {
            return 0;
        }
        String[] R0 = p0.R0(v10, ",");
        int i10 = p0.s(R0, "public.accessibility.describes-video") ? AdRequest.MAX_CONTENT_URL_LENGTH : 0;
        if (p0.s(R0, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
        }
        if (p0.s(R0, "public.accessibility.describes-music-and-sound")) {
            i10 |= 1024;
        }
        return p0.s(R0, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int x(String str) {
        boolean q10 = q(str, U, false);
        ?? r02 = q10;
        if (q(str, V, false)) {
            r02 = (q10 ? 1 : 0) | true;
        }
        return q(str, T, false) ? r02 | 4 : r02;
    }

    private static g.f y(String str) {
        double r10 = r(str, f27249r, -9.223372036854776E18d);
        long j10 = r10 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r10 * 1000000.0d);
        boolean q10 = q(str, f27250s, false);
        double r11 = r(str, f27252u, -9.223372036854776E18d);
        long j11 = r11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r11 * 1000000.0d);
        double r12 = r(str, f27253v, -9.223372036854776E18d);
        return new g.f(j10, q10, j11, r12 != -9.223372036854776E18d ? (long) (r12 * 1000000.0d) : -9223372036854775807L, q(str, f27254w, false));
    }

    private static String z(String str, Pattern pattern, Map<String, String> map) throws h2 {
        String v10 = v(str, pattern, map);
        if (v10 != null) {
            return v10;
        }
        throw h2.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    @Override // z4.m0.a
    /* renamed from: i */
    public i a(Uri uri, InputStream inputStream) throws IOException {
        String trim;
        String str;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                break;
            }
            sb.append((char) read);
        }
        String sb2 = sb.toString();
        if (!sb.toString().contains("EXT-X")) {
            l0 l0Var = new l0();
            try {
                if (sb.toString().contains("document")) {
                    str = new String(l0Var.a(sb.toString().split("= \"")[1].split("\";")[0]));
                } else {
                    str = new String(l0Var.a(sb.toString()));
                }
                sb2 = str;
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new StringReader(URLDecoder.decode(sb2, "UTF-8")));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (b(bufferedReader2)) {
                while (true) {
                    String readLine = bufferedReader2.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (trim.startsWith("#EXT-X-STREAM-INF")) {
                                arrayDeque.add(trim);
                                return p(new b(arrayDeque, bufferedReader2), uri.toString());
                            } else if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                break;
                            } else {
                                arrayDeque.add(trim);
                            }
                        }
                    } else {
                        p0.n(bufferedReader2);
                        throw h2.c("Failed to parse the playlist, could not identify any tags.", null);
                    }
                }
                arrayDeque.add(trim);
                return o(this.f27258a, this.f27259b, new b(arrayDeque, bufferedReader2), uri.toString());
            }
            throw h2.c("Input does not start with the #EXTM3U header.", null);
        } finally {
            p0.n(bufferedReader2);
        }
    }

    public j(h hVar, g gVar) {
        this.f27258a = hVar;
        this.f27259b = gVar;
    }
}
