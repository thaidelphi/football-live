package m4;

import a5.p0;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.ironsource.b9;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.core.device.MimeTypes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import m4.a;
import n3.h2;
import n3.m1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import v3.g;
import v3.j;
import z4.m0;
/* compiled from: SsManifestParser.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b implements m0.a<m4.a> {

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParserFactory f27719a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SsManifestParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f27720a;

        /* renamed from: b  reason: collision with root package name */
        private final String f27721b;

        /* renamed from: c  reason: collision with root package name */
        private final a f27722c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Pair<String, Object>> f27723d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f27722c = aVar;
            this.f27720a = str;
            this.f27721b = str2;
        }

        private a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        protected void a(Object obj) {
        }

        protected abstract Object b();

        protected final Object c(String str) {
            for (int i10 = 0; i10 < this.f27723d.size(); i10++) {
                Pair<String, Object> pair = this.f27723d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f27722c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        protected boolean d(String str) {
            return false;
        }

        public final Object f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f27721b.equals(name)) {
                        n(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a e8 = e(this, name, this.f27720a);
                            if (e8 == null) {
                                i10 = 1;
                            } else {
                                a(e8.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z10 && i10 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i10 > 0) {
                    i10--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        protected final boolean g(XmlPullParser xmlPullParser, String str, boolean z10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z10;
        }

        protected void h(XmlPullParser xmlPullParser) {
        }

        protected final int i(XmlPullParser xmlPullParser, String str, int i10) throws h2 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e8) {
                    throw h2.c(null, e8);
                }
            }
            return i10;
        }

        protected final long j(XmlPullParser xmlPullParser, String str, long j10) throws h2 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e8) {
                    throw h2.c(null, e8);
                }
            }
            return j10;
        }

        protected final int k(XmlPullParser xmlPullParser, String str) throws h2 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e8) {
                    throw h2.c(null, e8);
                }
            }
            throw new C0314b(str);
        }

        protected final long l(XmlPullParser xmlPullParser, String str) throws h2 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e8) {
                    throw h2.c(null, e8);
                }
            }
            throw new C0314b(str);
        }

        protected final String m(XmlPullParser xmlPullParser, String str) throws C0314b {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C0314b(str);
        }

        protected abstract void n(XmlPullParser xmlPullParser) throws h2;

        protected void o(XmlPullParser xmlPullParser) {
        }

        protected final void p(String str, Object obj) {
            this.f27723d.add(Pair.create(str, obj));
        }
    }

    /* compiled from: SsManifestParser.java */
    /* renamed from: m4.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class C0314b extends h2 {
        public C0314b(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SsManifestParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c extends a {

        /* renamed from: e  reason: collision with root package name */
        private boolean f27724e;

        /* renamed from: f  reason: collision with root package name */
        private UUID f27725f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f27726g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        private static j[] q(byte[] bArr) {
            return new j[]{new j(true, null, 8, r(bArr), 0, 0, null)};
        }

        private static byte[] r(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb.append((char) bArr[i10]);
            }
            String sb2 = sb.toString();
            byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
            t(decode, 0, 3);
            t(decode, 1, 2);
            t(decode, 4, 5);
            t(decode, 6, 7);
            return decode;
        }

        private static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        private static void t(byte[] bArr, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }

        @Override // m4.b.a
        public Object b() {
            UUID uuid = this.f27725f;
            return new a.C0313a(uuid, g.a(uuid, this.f27726g), q(this.f27726g));
        }

        @Override // m4.b.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // m4.b.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f27724e = false;
            }
        }

        @Override // m4.b.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f27724e = true;
                this.f27725f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // m4.b.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.f27724e) {
                this.f27726g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SsManifestParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d extends a {

        /* renamed from: e  reason: collision with root package name */
        private m1 f27727e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        private static List<byte[]> q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] I = p0.I(str);
                byte[][] i10 = a5.e.i(I);
                if (i10 == null) {
                    arrayList.add(I);
                } else {
                    Collections.addAll(arrayList, i10);
                }
            }
            return arrayList;
        }

        private static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return MimeTypes.VIDEO_H264;
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // m4.b.a
        public Object b() {
            return this.f27727e;
        }

        @Override // m4.b.a
        public void n(XmlPullParser xmlPullParser) throws h2 {
            m1.b bVar = new m1.b();
            String r10 = r(m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) c("Type")).intValue();
            if (intValue == 2) {
                bVar.K("video/mp4").j0(k(xmlPullParser, "MaxWidth")).Q(k(xmlPullParser, "MaxHeight")).T(q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (intValue == 1) {
                if (r10 == null) {
                    r10 = "audio/mp4a-latm";
                }
                int k10 = k(xmlPullParser, "Channels");
                int k11 = k(xmlPullParser, "SamplingRate");
                List<byte[]> q10 = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (q10.isEmpty() && "audio/mp4a-latm".equals(r10)) {
                    q10 = Collections.singletonList(p3.a.a(k11, k10));
                }
                bVar.K("audio/mp4").H(k10).f0(k11).T(q10);
            } else if (intValue == 3) {
                int i10 = 0;
                String str = (String) c("Subtype");
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i10 = 64;
                    } else if (str.equals("DESC")) {
                        i10 = 1024;
                    }
                }
                bVar.K("application/mp4").c0(i10);
            } else {
                bVar.K("application/mp4");
            }
            this.f27727e = bVar.S(xmlPullParser.getAttributeValue(null, "Index")).U((String) c("Name")).e0(r10).G(k(xmlPullParser, "Bitrate")).V((String) c("Language")).E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SsManifestParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e extends a {

        /* renamed from: e  reason: collision with root package name */
        private final List<a.b> f27728e;

        /* renamed from: f  reason: collision with root package name */
        private int f27729f;

        /* renamed from: g  reason: collision with root package name */
        private int f27730g;

        /* renamed from: h  reason: collision with root package name */
        private long f27731h;

        /* renamed from: i  reason: collision with root package name */
        private long f27732i;

        /* renamed from: j  reason: collision with root package name */
        private long f27733j;

        /* renamed from: k  reason: collision with root package name */
        private int f27734k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f27735l;

        /* renamed from: m  reason: collision with root package name */
        private a.C0313a f27736m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f27734k = -1;
            this.f27736m = null;
            this.f27728e = new LinkedList();
        }

        @Override // m4.b.a
        public void a(Object obj) {
            if (obj instanceof a.b) {
                this.f27728e.add((a.b) obj);
            } else if (obj instanceof a.C0313a) {
                a5.a.f(this.f27736m == null);
                this.f27736m = (a.C0313a) obj;
            }
        }

        @Override // m4.b.a
        public Object b() {
            int size = this.f27728e.size();
            a.b[] bVarArr = new a.b[size];
            this.f27728e.toArray(bVarArr);
            if (this.f27736m != null) {
                a.C0313a c0313a = this.f27736m;
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(c0313a.f27700a, "video/mp4", c0313a.f27701b));
                for (int i10 = 0; i10 < size; i10++) {
                    a.b bVar = bVarArr[i10];
                    int i11 = bVar.f27703a;
                    if (i11 == 2 || i11 == 1) {
                        m1[] m1VarArr = bVar.f27712j;
                        for (int i12 = 0; i12 < m1VarArr.length; i12++) {
                            m1VarArr[i12] = m1VarArr[i12].b().M(drmInitData).E();
                        }
                    }
                }
            }
            return new m4.a(this.f27729f, this.f27730g, this.f27731h, this.f27732i, this.f27733j, this.f27734k, this.f27735l, this.f27736m, bVarArr);
        }

        @Override // m4.b.a
        public void n(XmlPullParser xmlPullParser) throws h2 {
            this.f27729f = k(xmlPullParser, "MajorVersion");
            this.f27730g = k(xmlPullParser, "MinorVersion");
            this.f27731h = j(xmlPullParser, "TimeScale", 10000000L);
            this.f27732i = l(xmlPullParser, "Duration");
            this.f27733j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.f27734k = i(xmlPullParser, "LookaheadCount", -1);
            this.f27735l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f27731h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SsManifestParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class f extends a {

        /* renamed from: e  reason: collision with root package name */
        private final String f27737e;

        /* renamed from: f  reason: collision with root package name */
        private final List<m1> f27738f;

        /* renamed from: g  reason: collision with root package name */
        private int f27739g;

        /* renamed from: h  reason: collision with root package name */
        private String f27740h;

        /* renamed from: i  reason: collision with root package name */
        private long f27741i;

        /* renamed from: j  reason: collision with root package name */
        private String f27742j;

        /* renamed from: k  reason: collision with root package name */
        private String f27743k;

        /* renamed from: l  reason: collision with root package name */
        private int f27744l;

        /* renamed from: m  reason: collision with root package name */
        private int f27745m;

        /* renamed from: n  reason: collision with root package name */
        private int f27746n;

        /* renamed from: o  reason: collision with root package name */
        private int f27747o;

        /* renamed from: p  reason: collision with root package name */
        private String f27748p;

        /* renamed from: q  reason: collision with root package name */
        private ArrayList<Long> f27749q;

        /* renamed from: r  reason: collision with root package name */
        private long f27750r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f27737e = str;
            this.f27738f = new LinkedList();
        }

        private void q(XmlPullParser xmlPullParser) throws h2 {
            int s10 = s(xmlPullParser);
            this.f27739g = s10;
            p("Type", Integer.valueOf(s10));
            if (this.f27739g == 3) {
                this.f27740h = m(xmlPullParser, "Subtype");
            } else {
                this.f27740h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            p("Subtype", this.f27740h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f27742j = attributeValue;
            p("Name", attributeValue);
            this.f27743k = m(xmlPullParser, "Url");
            this.f27744l = i(xmlPullParser, "MaxWidth", -1);
            this.f27745m = i(xmlPullParser, "MaxHeight", -1);
            this.f27746n = i(xmlPullParser, "DisplayWidth", -1);
            this.f27747o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f27748p = attributeValue2;
            p("Language", attributeValue2);
            long i10 = i(xmlPullParser, "TimeScale", -1);
            this.f27741i = i10;
            if (i10 == -1) {
                this.f27741i = ((Long) c("TimeScale")).longValue();
            }
            this.f27749q = new ArrayList<>();
        }

        private void r(XmlPullParser xmlPullParser) throws h2 {
            int size = this.f27749q.size();
            long j10 = j(xmlPullParser, "t", -9223372036854775807L);
            int i10 = 1;
            if (j10 == -9223372036854775807L) {
                if (size == 0) {
                    j10 = 0;
                } else if (this.f27750r != -1) {
                    j10 = this.f27750r + this.f27749q.get(size - 1).longValue();
                } else {
                    throw h2.c("Unable to infer start time", null);
                }
            }
            this.f27749q.add(Long.valueOf(j10));
            this.f27750r = j(xmlPullParser, "d", -9223372036854775807L);
            long j11 = j(xmlPullParser, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, 1L);
            if (j11 > 1 && this.f27750r == -9223372036854775807L) {
                throw h2.c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j12 = i10;
                if (j12 >= j11) {
                    return;
                }
                this.f27749q.add(Long.valueOf((this.f27750r * j12) + j10));
                i10++;
            }
        }

        private int s(XmlPullParser xmlPullParser) throws h2 {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue != null) {
                if (MimeTypes.BASE_TYPE_AUDIO.equalsIgnoreCase(attributeValue)) {
                    return 1;
                }
                if ("video".equalsIgnoreCase(attributeValue)) {
                    return 2;
                }
                if (b9.h.K0.equalsIgnoreCase(attributeValue)) {
                    return 3;
                }
                throw h2.c("Invalid key value[" + attributeValue + b9.i.f16698e, null);
            }
            throw new C0314b("Type");
        }

        @Override // m4.b.a
        public void a(Object obj) {
            if (obj instanceof m1) {
                this.f27738f.add((m1) obj);
            }
        }

        @Override // m4.b.a
        public Object b() {
            m1[] m1VarArr = new m1[this.f27738f.size()];
            this.f27738f.toArray(m1VarArr);
            return new a.b(this.f27737e, this.f27743k, this.f27739g, this.f27740h, this.f27741i, this.f27742j, this.f27744l, this.f27745m, this.f27746n, this.f27747o, this.f27748p, m1VarArr, this.f27749q, this.f27750r);
        }

        @Override // m4.b.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        @Override // m4.b.a
        public void n(XmlPullParser xmlPullParser) throws h2 {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }
    }

    public b() {
        try {
            this.f27719a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e8) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e8);
        }
    }

    @Override // z4.m0.a
    /* renamed from: b */
    public m4.a a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.f27719a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (m4.a) new e(null, uri.toString()).f(newPullParser);
        } catch (XmlPullParserException e8) {
            throw h2.c(null, e8);
        }
    }
}
