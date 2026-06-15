package i4;

import a5.n0;
import a5.p0;
import a5.q0;
import a5.t;
import a5.x;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.b9;
import com.ironsource.fe;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.ug;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.core.device.MimeTypes;
import i4.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n3.h2;
import n3.m1;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import y5.q;
import y5.w;
import z4.m0;
/* compiled from: DashManifestParser.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d extends DefaultHandler implements m0.a<c> {

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f26532b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f26533c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f26534d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f26535e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParserFactory f26536a;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: DashManifestParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final m1 f26537a;

        /* renamed from: b  reason: collision with root package name */
        public final q<b> f26538b;

        /* renamed from: c  reason: collision with root package name */
        public final k f26539c;

        /* renamed from: d  reason: collision with root package name */
        public final String f26540d;

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList<DrmInitData.SchemeData> f26541e;

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList<e> f26542f;

        /* renamed from: g  reason: collision with root package name */
        public final long f26543g;

        /* renamed from: h  reason: collision with root package name */
        public final List<e> f26544h;

        /* renamed from: i  reason: collision with root package name */
        public final List<e> f26545i;

        public a(m1 m1Var, List<b> list, k kVar, String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<e> arrayList2, List<e> list2, List<e> list3, long j10) {
            this.f26537a = m1Var;
            this.f26538b = q.l(list);
            this.f26539c = kVar;
            this.f26540d = str;
            this.f26541e = arrayList;
            this.f26542f = arrayList2;
            this.f26544h = list2;
            this.f26545i = list3;
            this.f26543g = j10;
        }
    }

    public d() {
        try {
            this.f26536a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e8) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e8);
        }
    }

    protected static int D(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f26546a) && (str = eVar.f26547b) != null) {
                Matcher matcher = f26533c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                t.i("MpdParser", "Unable to parse CEA-608 channel number from: " + eVar.f26547b);
            }
        }
        return -1;
    }

    protected static int E(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f26546a) && (str = eVar.f26547b) != null) {
                Matcher matcher = f26534d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                t.i("MpdParser", "Unable to parse CEA-708 service block number from: " + eVar.f26547b);
            }
        }
        return -1;
    }

    protected static long H(XmlPullParser xmlPullParser, String str, long j10) throws h2 {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : p0.J0(attributeValue);
    }

    protected static e I(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String r02 = r0(xmlPullParser, "schemeIdUri", "");
        String r03 = r0(xmlPullParser, b9.h.X, null);
        String r04 = r0(xmlPullParser, ug.f21009x, null);
        do {
            xmlPullParser.next();
        } while (!q0.d(xmlPullParser, str));
        return new e(r02, r03, r04);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected static int J(XmlPullParser xmlPullParser) {
        char c10;
        String attributeValue = xmlPullParser.getAttributeValue(null, b9.h.X);
        if (attributeValue == null) {
            return -1;
        }
        String e8 = x5.a.e(attributeValue);
        e8.hashCode();
        switch (e8.hashCode()) {
            case 1596796:
                if (e8.equals("4000")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 2937391:
                if (e8.equals("a000")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3094035:
                if (e8.equals("f801")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3133436:
                if (e8.equals("fa01")) {
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
                return 1;
            case 1:
                return 2;
            case 2:
                return 6;
            case 3:
                return 8;
            default:
                return -1;
        }
    }

    protected static int K(XmlPullParser xmlPullParser) {
        int U = U(xmlPullParser, b9.h.X, -1);
        if (U <= 0 || U >= 33) {
            return -1;
        }
        return U;
    }

    protected static int L(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, b9.h.X);
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    protected static long M(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : p0.K0(attributeValue);
    }

    protected static String N(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            String str = eVar.f26546a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(eVar.f26547b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(eVar.f26547b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    protected static float R(XmlPullParser xmlPullParser, String str, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f10 : Float.parseFloat(attributeValue);
    }

    protected static float S(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f26532b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                String group = matcher.group(2);
                return !TextUtils.isEmpty(group) ? parseInt / Integer.parseInt(group) : parseInt;
            }
            return f10;
        }
        return f10;
    }

    protected static int U(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i10 : Integer.parseInt(attributeValue);
    }

    protected static long W(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (x5.a.a("http://dashif.org/guidelines/last-segment-number", eVar.f26546a)) {
                return Long.parseLong(eVar.f26547b);
            }
        }
        return -1L;
    }

    protected static long X(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : Long.parseLong(attributeValue);
    }

    protected static int Z(XmlPullParser xmlPullParser) {
        int U = U(xmlPullParser, b9.h.X, -1);
        if (U >= 0) {
            int[] iArr = f26535e;
            if (U < iArr.length) {
                return iArr[U];
            }
            return -1;
        }
        return -1;
    }

    private long b(List<k.d> list, long j10, long j11, int i10, long j12) {
        int m7 = i10 >= 0 ? i10 + 1 : (int) p0.m(j12 - j10, j11);
        for (int i11 = 0; i11 < m7; i11++) {
            list.add(m(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    private static int p(int i10, int i11) {
        if (i10 == -1) {
            return i11;
        }
        if (i11 == -1) {
            return i10;
        }
        a5.a.f(i10 == i11);
        return i10;
    }

    private static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        a5.a.f(str.equals(str2));
        return str;
    }

    private static void r(ArrayList<DrmInitData.SchemeData> arrayList) {
        String str;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = arrayList.get(i10);
            if (n3.i.f28006c.equals(schemeData.f10436b) && (str = schemeData.f10437c) != null) {
                arrayList.remove(i10);
                break;
            }
            i10++;
        }
        if (str == null) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            DrmInitData.SchemeData schemeData2 = arrayList.get(i11);
            if (n3.i.f28005b.equals(schemeData2.f10436b) && schemeData2.f10437c == null) {
                arrayList.set(i11, new DrmInitData.SchemeData(n3.i.f28006c, str, schemeData2.f10438d, schemeData2.f10439e));
            }
        }
    }

    protected static String r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    private static void s(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.c()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (arrayList.get(i10).a(schemeData)) {
                        arrayList.remove(size);
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
    }

    protected static String s0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                w(xmlPullParser);
            }
        } while (!q0.d(xmlPullParser, str));
        return str2;
    }

    private static long t(long j10, long j11) {
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        if (j10 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j10;
    }

    private static String u(String str, String str2) {
        if (x.o(str)) {
            return x.c(str2);
        }
        if (x.s(str)) {
            return x.n(str2);
        }
        if (x.r(str) || x.p(str)) {
            return str;
        }
        if ("application/mp4".equals(str)) {
            String g10 = x.g(str2);
            return "text/vtt".equals(g10) ? "application/x-mp4-vtt" : g10;
        }
        return null;
    }

    private boolean v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public static void w(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (q0.e(xmlPullParser)) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (q0.e(xmlPullParser)) {
                    i10++;
                } else if (q0.c(xmlPullParser)) {
                    i10--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected int A(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        char c10;
        String r02 = r0(xmlPullParser, "schemeIdUri", null);
        r02.hashCode();
        int i10 = -1;
        switch (r02.hashCode()) {
            case -2128649360:
                if (r02.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1352850286:
                if (r02.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1138141449:
                if (r02.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -986633423:
                if (r02.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -79006963:
                if (r02.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 312179081:
                if (r02.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 2036691300:
                if (r02.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c10 = 6;
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
            case 4:
                i10 = K(xmlPullParser);
                break;
            case 1:
                i10 = U(xmlPullParser, b9.h.X, -1);
                break;
            case 2:
            case 6:
                i10 = J(xmlPullParser);
                break;
            case 3:
                i10 = Z(xmlPullParser);
                break;
            case 5:
                i10 = L(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!q0.d(xmlPullParser, "AudioChannelConfiguration"));
        return i10;
    }

    protected long B(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    protected List<b> C(XmlPullParser xmlPullParser, List<b> list, boolean z10) throws XmlPullParserException, IOException {
        int i10;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else {
            i10 = z10 ? 1 : RecyclerView.UNDEFINED_DURATION;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String s02 = s0(xmlPullParser, "BaseURL");
        if (n0.b(s02)) {
            if (attributeValue3 == null) {
                attributeValue3 = s02;
            }
            return w.j(new b(s02, attributeValue3, i10, parseInt));
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            b bVar = list.get(i11);
            String d10 = n0.d(bVar.f26515a, s02);
            String str = attributeValue3 == null ? d10 : attributeValue3;
            if (z10) {
                i10 = bVar.f26517c;
                parseInt = bVar.f26518d;
                str = bVar.f26516b;
            }
            arrayList.add(new b(d10, str, i10, parseInt));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected android.util.Pair<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData.SchemeData> F(org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.d.F(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    protected int G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MimeTypes.BASE_TYPE_AUDIO.equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        return b9.h.K0.equals(attributeValue) ? 3 : -1;
    }

    protected Pair<Long, EventMessage> O(XmlPullParser xmlPullParser, String str, String str2, long j10, long j11, ByteArrayOutputStream byteArrayOutputStream) throws IOException, XmlPullParserException {
        long X = X(xmlPullParser, ug.f21009x, 0L);
        long X2 = X(xmlPullParser, IronSourceConstants.EVENTS_DURATION, -9223372036854775807L);
        long X3 = X(xmlPullParser, "presentationTime", 0L);
        long O0 = p0.O0(X2, 1000L, j10);
        long O02 = p0.O0(X3 - j11, 1000000L, j10);
        String r02 = r0(xmlPullParser, "messageData", null);
        byte[] P = P(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(O02);
        if (r02 != null) {
            P = p0.m0(r02);
        }
        return Pair.create(valueOf, d(str, str2, X, O0, P));
    }

    protected byte[] P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, x5.b.f32750c.name());
        xmlPullParser.nextToken();
        while (!q0.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i10), xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    protected f Q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        long j10;
        ArrayList arrayList;
        String r02 = r0(xmlPullParser, "schemeIdUri", "");
        String r03 = r0(xmlPullParser, b9.h.X, "");
        long X = X(xmlPullParser, "timescale", 1L);
        long X2 = X(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
        while (true) {
            xmlPullParser.next();
            if (q0.f(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j11 = X2;
                j10 = X2;
                arrayList = arrayList2;
                arrayList.add(O(xmlPullParser, r02, r03, X, j11, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                j10 = X2;
                arrayList = arrayList2;
                w(xmlPullParser);
            }
            if (q0.d(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            X2 = j10;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            jArr[i10] = ((Long) pair.first).longValue();
            eventMessageArr[i10] = (EventMessage) pair.second;
        }
        return e(r02, r03, X, jArr, eventMessageArr);
    }

    protected i T(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "sourceURL", "range");
    }

    protected String V(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return s0(xmlPullParser, "Label");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e7 A[LOOP:0: B:25:0x00a4->B:82:0x01e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected i4.c Y(org.xmlpull.v1.XmlPullParser r47, android.net.Uri r48) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.d.Y(org.xmlpull.v1.XmlPullParser, android.net.Uri):i4.c");
    }

    protected Pair<g, Long> a0(XmlPullParser xmlPullParser, List<b> list, long j10, long j11, long j12, long j13, boolean z10) throws XmlPullParserException, IOException {
        long j14;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j15;
        k l02;
        d dVar = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, ug.f21009x);
        long M = M(xmlPullParser2, "start", j10);
        long j16 = -9223372036854775807L;
        long j17 = j12 != -9223372036854775807L ? j12 + M : -9223372036854775807L;
        long M2 = M(xmlPullParser2, IronSourceConstants.EVENTS_DURATION, -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long j18 = j11;
        boolean z11 = false;
        long j19 = -9223372036854775807L;
        k.e eVar = null;
        e eVar2 = null;
        while (true) {
            xmlPullParser.next();
            if (q0.f(xmlPullParser2, "BaseURL")) {
                if (!z11) {
                    j18 = dVar.B(xmlPullParser2, j18);
                    z11 = true;
                }
                arrayList6.addAll(dVar.C(xmlPullParser2, list, z10));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j15 = j16;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (q0.f(xmlPullParser2, "AdaptationSet")) {
                    j14 = j18;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(y(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, eVar, M2, j18, j19, j17, j13, z10));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    j14 = j18;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (q0.f(xmlPullParser2, "EventStream")) {
                        arrayList7.add(Q(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else if (q0.f(xmlPullParser2, "SegmentBase")) {
                        arrayList3 = arrayList7;
                        eVar = j0(xmlPullParser2, null);
                        obj = null;
                        j18 = j14;
                        j15 = -9223372036854775807L;
                    } else {
                        arrayList3 = arrayList7;
                        if (q0.f(xmlPullParser2, "SegmentList")) {
                            long B = B(xmlPullParser2, -9223372036854775807L);
                            obj = null;
                            l02 = k0(xmlPullParser, null, j17, M2, j14, B, j13);
                            j19 = B;
                            j18 = j14;
                            j15 = -9223372036854775807L;
                        } else {
                            obj = null;
                            if (q0.f(xmlPullParser2, "SegmentTemplate")) {
                                long B2 = B(xmlPullParser2, -9223372036854775807L);
                                j15 = -9223372036854775807L;
                                l02 = l0(xmlPullParser, null, q.p(), j17, M2, j14, B2, j13);
                                j19 = B2;
                                j18 = j14;
                            } else {
                                j15 = -9223372036854775807L;
                                if (q0.f(xmlPullParser2, "AssetIdentifier")) {
                                    eVar2 = I(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    w(xmlPullParser);
                                }
                                j18 = j14;
                            }
                        }
                        eVar = l02;
                    }
                }
                obj = null;
                j15 = -9223372036854775807L;
                j18 = j14;
            }
            if (q0.d(xmlPullParser2, "Period")) {
                return Pair.create(h(attributeValue, M, arrayList2, arrayList3, eVar2), Long.valueOf(M2));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j16 = j15;
            dVar = this;
        }
    }

    protected String[] b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    protected i4.a c(int i10, int i11, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        return new i4.a(i10, i11, list, list2, list3, list4);
    }

    protected h c0(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = null;
        String r02 = r0(xmlPullParser, "moreInformationURL", null);
        String r03 = r0(xmlPullParser, fe.f17443q, null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (q0.f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (q0.f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (q0.f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                w(xmlPullParser);
            }
            String str4 = str3;
            if (q0.d(xmlPullParser, "ProgramInformation")) {
                return new h(str, str2, str4, r02, r03);
            }
            str3 = str4;
        }
    }

    protected EventMessage d(String str, String str2, long j10, long j11, byte[] bArr) {
        return new EventMessage(str, str2, j11, j10, bArr);
    }

    protected i d0(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j10 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j11 = (Long.parseLong(split[1]) - j10) + 1;
                return i(attributeValue, j10, j11);
            }
        } else {
            j10 = 0;
        }
        j11 = -1;
        return i(attributeValue, j10, j11);
    }

    protected f e(String str, String str2, long j10, long[] jArr, EventMessage[] eventMessageArr) {
        return new f(str, str2, j10, jArr, eventMessageArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01ee A[LOOP:0: B:3:0x006a->B:57:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198 A[EDGE_INSN: B:58:0x0198->B:47:0x0198 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected i4.d.a e0(org.xmlpull.v1.XmlPullParser r36, java.util.List<i4.b> r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.List<i4.e> r46, java.util.List<i4.e> r47, java.util.List<i4.e> r48, java.util.List<i4.e> r49, i4.k r50, long r51, long r53, long r55, long r57, long r59, boolean r61) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.d.e0(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, i4.k, long, long, long, long, long, boolean):i4.d$a");
    }

    protected m1 f(String str, String str2, int i10, int i11, float f10, int i12, int i13, int i14, String str3, List<e> list, List<e> list2, String str4, List<e> list3, List<e> list4) {
        String str5 = str4;
        String u10 = u(str2, str5);
        if ("audio/eac3".equals(u10)) {
            u10 = N(list4);
            if ("audio/eac3-joc".equals(u10)) {
                str5 = "ec+3";
            }
        }
        int p02 = p0(list);
        m1.b V = new m1.b().S(str).K(str2).e0(u10).I(str5).Z(i14).g0(p02).c0(i0(list) | f0(list2) | h0(list3) | h0(list4)).V(str3);
        if (x.s(u10)) {
            V.j0(i10).Q(i11).P(f10);
        } else if (x.o(u10)) {
            V.H(i12).f0(i13);
        } else if (x.r(u10)) {
            int i15 = -1;
            if ("application/cea-608".equals(u10)) {
                i15 = D(list2);
            } else if ("application/cea-708".equals(u10)) {
                i15 = E(list2);
            }
            V.F(i15);
        } else if (x.p(u10)) {
            V.j0(i10).Q(i11);
        }
        return V.E();
    }

    protected int f0(List<e> list) {
        int t02;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (x5.a.a("urn:mpeg:dash:role:2011", eVar.f26546a)) {
                t02 = g0(eVar.f26547b);
            } else if (x5.a.a("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.f26546a)) {
                t02 = t0(eVar.f26547b);
            }
            i10 |= t02;
        }
        return i10;
    }

    protected c g(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        return new c(j10, j11, j12, z10, j13, j14, j15, j16, hVar, oVar, lVar, uri, list);
    }

    protected int g0(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c10 = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals(b9.h.Z)) {
                    c10 = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
            case 5:
                return 128;
            case 1:
                return AdRequest.MAX_CONTENT_URL_LENGTH;
            case 2:
                return com.ironsource.mediationsdk.metadata.a.f18931n;
            case 4:
                return 2;
            case 6:
                return 16;
            case 7:
                return 1;
            case '\b':
                return 256;
            case '\t':
                return 64;
            case '\n':
                return 8;
            case 11:
                return 32;
            case '\f':
                return 4;
            default:
                return 0;
        }
    }

    protected g h(String str, long j10, List<i4.a> list, List<f> list2, e eVar) {
        return new g(str, j10, list, list2, eVar);
    }

    protected int h0(List<e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (x5.a.a("http://dashif.org/guidelines/trickmode", list.get(i11).f26546a)) {
                i10 |= 16384;
            }
        }
        return i10;
    }

    protected i i(String str, long j10, long j11) {
        return new i(str, j10, j11);
    }

    protected int i0(List<e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (x5.a.a("urn:mpeg:dash:role:2011", eVar.f26546a)) {
                i10 |= g0(eVar.f26547b);
            }
        }
        return i10;
    }

    protected j j(a aVar, String str, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<e> arrayList2) {
        m1.b b10 = aVar.f26537a.b();
        if (str != null) {
            b10.U(str);
        }
        String str3 = aVar.f26540d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = aVar.f26541e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            s(arrayList3);
            b10.M(new DrmInitData(str2, arrayList3));
        }
        ArrayList<e> arrayList4 = aVar.f26542f;
        arrayList4.addAll(arrayList2);
        return j.o(aVar.f26543g, b10.E(), aVar.f26538b, aVar.f26539c, arrayList4, aVar.f26544h, aVar.f26545i, null);
    }

    protected k.e j0(XmlPullParser xmlPullParser, k.e eVar) throws XmlPullParserException, IOException {
        long j10;
        long j11;
        long X = X(xmlPullParser, "timescale", eVar != null ? eVar.f26583b : 1L);
        long X2 = X(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f26584c : 0L);
        long j12 = eVar != null ? eVar.f26597d : 0L;
        long j13 = eVar != null ? eVar.f26598e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j10 = (Long.parseLong(split[1]) - parseLong) + 1;
            j11 = parseLong;
        } else {
            j10 = j13;
            j11 = j12;
        }
        i iVar = eVar != null ? eVar.f26582a : null;
        do {
            xmlPullParser.next();
            if (q0.f(xmlPullParser, "Initialization")) {
                iVar = T(xmlPullParser);
            } else {
                w(xmlPullParser);
            }
        } while (!q0.d(xmlPullParser, "SegmentBase"));
        return n(iVar, X, X2, j11, j10);
    }

    protected k.b k(i iVar, long j10, long j11, long j12, long j13, List<k.d> list, long j14, List<i> list2, long j15, long j16) {
        return new k.b(iVar, j10, j11, j12, j13, list, j14, list2, p0.C0(j15), p0.C0(j16));
    }

    protected k.b k0(XmlPullParser xmlPullParser, k.b bVar, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long X = X(xmlPullParser, "timescale", bVar != null ? bVar.f26583b : 1L);
        long X2 = X(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f26584c : 0L);
        long X3 = X(xmlPullParser, IronSourceConstants.EVENTS_DURATION, bVar != null ? bVar.f26586e : -9223372036854775807L);
        long X4 = X(xmlPullParser, "startNumber", bVar != null ? bVar.f26585d : 1L);
        long t10 = t(j12, j13);
        List<k.d> list = null;
        List<i> list2 = null;
        i iVar = null;
        do {
            xmlPullParser.next();
            if (q0.f(xmlPullParser, "Initialization")) {
                iVar = T(xmlPullParser);
            } else if (q0.f(xmlPullParser, "SegmentTimeline")) {
                list = m0(xmlPullParser, X, j11);
            } else if (q0.f(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList<>();
                }
                list2.add(n0(xmlPullParser));
            } else {
                w(xmlPullParser);
            }
        } while (!q0.d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (iVar == null) {
                iVar = bVar.f26582a;
            }
            if (list == null) {
                list = bVar.f26587f;
            }
            if (list2 == null) {
                list2 = bVar.f26591j;
            }
        }
        return k(iVar, X, X2, X4, X3, list, t10, list2, j14, j10);
    }

    protected k.c l(i iVar, long j10, long j11, long j12, long j13, long j14, List<k.d> list, long j15, n nVar, n nVar2, long j16, long j17) {
        return new k.c(iVar, j10, j11, j12, j13, j14, list, j15, nVar, nVar2, p0.C0(j16), p0.C0(j17));
    }

    protected k.c l0(XmlPullParser xmlPullParser, k.c cVar, List<e> list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long X = X(xmlPullParser, "timescale", cVar != null ? cVar.f26583b : 1L);
        long X2 = X(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f26584c : 0L);
        long X3 = X(xmlPullParser, IronSourceConstants.EVENTS_DURATION, cVar != null ? cVar.f26586e : -9223372036854775807L);
        long X4 = X(xmlPullParser, "startNumber", cVar != null ? cVar.f26585d : 1L);
        long W = W(list);
        long t10 = t(j12, j13);
        List<k.d> list2 = null;
        n u02 = u0(xmlPullParser, b9.h.I0, cVar != null ? cVar.f26593k : null);
        n u03 = u0(xmlPullParser, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION, cVar != null ? cVar.f26592j : null);
        i iVar = null;
        while (true) {
            xmlPullParser.next();
            if (q0.f(xmlPullParser, "Initialization")) {
                iVar = T(xmlPullParser);
            } else if (q0.f(xmlPullParser, "SegmentTimeline")) {
                list2 = m0(xmlPullParser, X, j11);
            } else {
                w(xmlPullParser);
            }
            if (q0.d(xmlPullParser, "SegmentTemplate")) {
                break;
            }
        }
        if (cVar != null) {
            if (iVar == null) {
                iVar = cVar.f26582a;
            }
            if (list2 == null) {
                list2 = cVar.f26587f;
            }
        }
        return l(iVar, X, X2, X4, W, X3, list2, t10, u03, u02, j14, j10);
    }

    protected k.d m(long j10, long j11) {
        return new k.d(j10, j11);
    }

    protected List<k.d> m0(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        boolean z10 = false;
        int i10 = 0;
        long j13 = -9223372036854775807L;
        do {
            xmlPullParser.next();
            if (q0.f(xmlPullParser, "S")) {
                long X = X(xmlPullParser, "t", -9223372036854775807L);
                if (z10) {
                    j12 = b(arrayList, j12, j13, i10, X);
                }
                if (X == -9223372036854775807L) {
                    X = j12;
                }
                j13 = X(xmlPullParser, "d", -9223372036854775807L);
                i10 = U(xmlPullParser, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, 0);
                z10 = true;
                j12 = X;
            } else {
                w(xmlPullParser);
            }
        } while (!q0.d(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            b(arrayList, j12, j13, i10, p0.O0(j11, j10, 1000L));
        }
        return arrayList;
    }

    protected k.e n(i iVar, long j10, long j11, long j12, long j13) {
        return new k.e(iVar, j10, j11, j12, j13);
    }

    protected i n0(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, b9.h.I0, "mediaRange");
    }

    protected o o(String str, String str2) {
        return new o(str, str2);
    }

    protected int o0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    protected int p0(List<e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (x5.a.a("urn:mpeg:dash:role:2011", eVar.f26546a)) {
                i10 |= o0(eVar.f26547b);
            }
        }
        return i10;
    }

    protected l q0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        float f10 = -3.4028235E38f;
        float f11 = -3.4028235E38f;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        while (true) {
            xmlPullParser.next();
            if (q0.f(xmlPullParser, "Latency")) {
                j10 = X(xmlPullParser, "target", -9223372036854775807L);
                j11 = X(xmlPullParser, "min", -9223372036854775807L);
                j12 = X(xmlPullParser, AppLovinMediationProvider.MAX, -9223372036854775807L);
            } else if (q0.f(xmlPullParser, "PlaybackRate")) {
                f10 = R(xmlPullParser, "min", -3.4028235E38f);
                f11 = R(xmlPullParser, AppLovinMediationProvider.MAX, -3.4028235E38f);
            }
            long j13 = j10;
            long j14 = j11;
            long j15 = j12;
            float f12 = f10;
            float f13 = f11;
            if (q0.d(xmlPullParser, "ServiceDescription")) {
                return new l(j13, j14, j15, f12, f13);
            }
            j10 = j13;
            j11 = j14;
            j12 = j15;
            f10 = f12;
            f11 = f13;
        }
    }

    protected int t0(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals(CommonGetHeaderBiddingToken.HB_TOKEN_VERSION)) {
                    c10 = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c10 = 2;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c10 = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return AdRequest.MAX_CONTENT_URL_LENGTH;
            case 1:
                return com.ironsource.mediationsdk.metadata.a.f18931n;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    protected n u0(XmlPullParser xmlPullParser, String str, n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? n.b(attributeValue) : nVar;
    }

    protected o v0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, b9.h.X));
    }

    @Override // z4.m0.a
    /* renamed from: x */
    public c a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.f26536a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return Y(newPullParser, uri);
            }
            throw h2.c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e8) {
            throw h2.c(null, e8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x030e A[LOOP:0: B:3:0x007c->B:71:0x030e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ce A[EDGE_INSN: B:72:0x02ce->B:65:0x02ce ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected i4.a y(org.xmlpull.v1.XmlPullParser r55, java.util.List<i4.b> r56, i4.k r57, long r58, long r60, long r62, long r64, long r66, boolean r68) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.d.y(org.xmlpull.v1.XmlPullParser, java.util.List, i4.k, long, long, long, long, long, boolean):i4.a");
    }

    protected void z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        w(xmlPullParser);
    }
}
