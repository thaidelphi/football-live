package u4;

import a5.p0;
import a5.q0;
import a5.t;
import android.text.Layout;
import com.ironsource.b9;
import com.ironsource.ug;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n4.j;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: TtmlDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c extends n4.g {

    /* renamed from: p  reason: collision with root package name */
    private static final Pattern f31386p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f31387q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f31388r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s  reason: collision with root package name */
    static final Pattern f31389s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t  reason: collision with root package name */
    static final Pattern f31390t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u  reason: collision with root package name */
    private static final Pattern f31391u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v  reason: collision with root package name */
    private static final Pattern f31392v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w  reason: collision with root package name */
    private static final b f31393w = new b(30.0f, 1, 1);

    /* renamed from: x  reason: collision with root package name */
    private static final a f31394x = new a(32, 15);

    /* renamed from: o  reason: collision with root package name */
    private final XmlPullParserFactory f31395o;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TtmlDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int f31396a;

        /* renamed from: b  reason: collision with root package name */
        final int f31397b;

        a(int i10, int i11) {
            this.f31396a = i10;
            this.f31397b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TtmlDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final float f31398a;

        /* renamed from: b  reason: collision with root package name */
        final int f31399b;

        /* renamed from: c  reason: collision with root package name */
        final int f31400c;

        b(float f10, int i10, int i11) {
            this.f31398a = f10;
            this.f31399b = i10;
            this.f31400c = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TtmlDecoder.java */
    /* renamed from: u4.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0362c {

        /* renamed from: a  reason: collision with root package name */
        final int f31401a;

        /* renamed from: b  reason: collision with root package name */
        final int f31402b;

        C0362c(int i10, int i11) {
            this.f31401a = i10;
            this.f31402b = i11;
        }
    }

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f31395o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e8) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e8);
        }
    }

    private static g B(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean C(String str) {
        return str.equals("tt") || str.equals("head") || str.equals(b9.h.E0) || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static Layout.Alignment D(String str) {
        String e8 = x5.a.e(str);
        e8.hashCode();
        char c10 = 65535;
        switch (e8.hashCode()) {
            case -1364013995:
                if (e8.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case 100571:
                if (e8.equals("end")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3317767:
                if (e8.equals("left")) {
                    c10 = 2;
                    break;
                }
                break;
            case 108511772:
                if (e8.equals("right")) {
                    c10 = 3;
                    break;
                }
                break;
            case 109757538:
                if (e8.equals("start")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static a E(XmlPullParser xmlPullParser, a aVar) throws j {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f31392v.matcher(attributeValue);
        if (!matcher.matches()) {
            t.i("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt((String) a5.a.e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) a5.a.e(matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            throw new j("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            t.i("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
    }

    private static void F(String str, g gVar) throws j {
        Matcher matcher;
        String[] R0 = p0.R0(str, "\\s+");
        if (R0.length == 1) {
            matcher = f31388r.matcher(str);
        } else if (R0.length == 2) {
            matcher = f31388r.matcher(R0[1]);
            t.i("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new j("Invalid number of entries for fontSize: " + R0.length + ".");
        }
        if (matcher.matches()) {
            String str2 = (String) a5.a.e(matcher.group(3));
            str2.hashCode();
            char c10 = 65535;
            switch (str2.hashCode()) {
                case 37:
                    if (str2.equals("%")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str2.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str2.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    gVar.z(3);
                    break;
                case 1:
                    gVar.z(2);
                    break;
                case 2:
                    gVar.z(1);
                    break;
                default:
                    throw new j("Invalid unit for fontSize: '" + str2 + "'.");
            }
            gVar.y(Float.parseFloat((String) a5.a.e(matcher.group(1))));
            return;
        }
        throw new j("Invalid expression for fontSize: '" + str + "'.");
    }

    private static b G(XmlPullParser xmlPullParser) throws j {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] R0 = p0.R0(attributeValue2, " ");
            if (R0.length == 2) {
                f10 = Integer.parseInt(R0[0]) / Integer.parseInt(R0[1]);
            } else {
                throw new j("frameRateMultiplier doesn't have 2 parts");
            }
        }
        b bVar = f31393w;
        int i10 = bVar.f31399b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = bVar.f31400c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f10, i10, i11);
    }

    private static Map<String, g> H(XmlPullParser xmlPullParser, Map<String, g> map, a aVar, C0362c c0362c, Map<String, e> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (q0.f(xmlPullParser, "style")) {
                String a10 = q0.a(xmlPullParser, "style");
                g M = M(xmlPullParser, new g());
                if (a10 != null) {
                    for (String str : N(a10)) {
                        M.a(map.get(str));
                    }
                }
                String g10 = M.g();
                if (g10 != null) {
                    map.put(g10, M);
                }
            } else if (q0.f(xmlPullParser, "region")) {
                e K = K(xmlPullParser, aVar, c0362c);
                if (K != null) {
                    map2.put(K.f31416a, K);
                }
            } else if (q0.f(xmlPullParser, "metadata")) {
                I(xmlPullParser, map3);
            }
        } while (!q0.d(xmlPullParser, "head"));
        return map;
    }

    private static void I(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
        String a10;
        do {
            xmlPullParser.next();
            if (q0.f(xmlPullParser, "image") && (a10 = q0.a(xmlPullParser, ug.f21009x)) != null) {
                map.put(a10, xmlPullParser.nextText());
            }
        } while (!q0.d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static d J(XmlPullParser xmlPullParser, d dVar, Map<String, e> map, b bVar) throws j {
        long j10;
        long j11;
        char c10;
        int attributeCount = xmlPullParser.getAttributeCount();
        g M = M(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        long j14 = -9223372036854775807L;
        String[] strArr = null;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
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
                    if (map.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j14 = O(attributeValue, bVar);
                    break;
                case 2:
                    j13 = O(attributeValue, bVar);
                    break;
                case 3:
                    j12 = O(attributeValue, bVar);
                    break;
                case 4:
                    String[] N = N(attributeValue);
                    if (N.length > 0) {
                        strArr = N;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (dVar != null) {
            long j15 = dVar.f31406d;
            j10 = -9223372036854775807L;
            if (j15 != -9223372036854775807L) {
                if (j12 != -9223372036854775807L) {
                    j12 += j15;
                }
                if (j13 != -9223372036854775807L) {
                    j13 += j15;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        long j16 = j12;
        if (j13 == j10) {
            if (j14 != j10) {
                j11 = j16 + j14;
            } else if (dVar != null) {
                long j17 = dVar.f31407e;
                if (j17 != j10) {
                    j11 = j17;
                }
            }
            return d.c(xmlPullParser.getName(), j16, j11, M, strArr, str2, str, dVar);
        }
        j11 = j13;
        return d.c(xmlPullParser.getName(), j16, j11, M, strArr, str2, str, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a7, code lost:
        if (r0.equals("tb") == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static u4.e K(org.xmlpull.v1.XmlPullParser r17, u4.c.a r18, u4.c.C0362c r19) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.c.K(org.xmlpull.v1.XmlPullParser, u4.c$a, u4.c$c):u4.e");
    }

    private static float L(String str) {
        Matcher matcher = f31389s.matcher(str);
        if (!matcher.matches()) {
            t.i("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) a5.a.e(matcher.group(1)))));
        } catch (NumberFormatException e8) {
            t.j("TtmlDecoder", "Failed to parse shear: " + str, e8);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e0, code lost:
        if (r3.equals(com.ironsource.b9.h.K0) == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static u4.g M(org.xmlpull.v1.XmlPullParser r12, u4.g r13) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.c.M(org.xmlpull.v1.XmlPullParser, u4.g):u4.g");
    }

    private static String[] N(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : p0.R0(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bc, code lost:
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long O(java.lang.String r13, u4.c.b r14) throws n4.j {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.c.O(java.lang.String, u4.c$b):long");
    }

    private static C0362c P(XmlPullParser xmlPullParser) {
        String a10 = q0.a(xmlPullParser, "extent");
        if (a10 == null) {
            return null;
        }
        Matcher matcher = f31391u.matcher(a10);
        if (!matcher.matches()) {
            t.i("TtmlDecoder", "Ignoring non-pixel tts extent: " + a10);
            return null;
        }
        try {
            return new C0362c(Integer.parseInt((String) a5.a.e(matcher.group(1))), Integer.parseInt((String) a5.a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            t.i("TtmlDecoder", "Ignoring malformed tts extent: " + a10);
            return null;
        }
    }

    @Override // n4.g
    protected n4.h z(byte[] bArr, int i10, boolean z10) throws j {
        b bVar;
        try {
            XmlPullParser newPullParser = this.f31395o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e(""));
            C0362c c0362c = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f31393w;
            a aVar = f31394x;
            int i11 = 0;
            h hVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = G(newPullParser);
                            aVar = E(newPullParser, f31394x);
                            c0362c = P(newPullParser);
                        }
                        C0362c c0362c2 = c0362c;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (C(name)) {
                            if ("head".equals(name)) {
                                bVar = bVar3;
                                H(newPullParser, hashMap, aVar2, c0362c2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    d J = J(newPullParser, dVar, hashMap2, bVar);
                                    arrayDeque.push(J);
                                    if (dVar != null) {
                                        dVar.a(J);
                                    }
                                } catch (j e8) {
                                    t.j("TtmlDecoder", "Suppressing parser error", e8);
                                    i11++;
                                }
                            }
                            bVar2 = bVar;
                        } else {
                            t.f("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i11++;
                            bVar2 = bVar3;
                        }
                        c0362c = c0362c2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((d) a5.a.e(dVar)).a(d.d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            hVar = new h((d) a5.a.e((d) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new j("No TTML subtitles found");
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected error when reading input.", e10);
        } catch (XmlPullParserException e11) {
            throw new j("Unable to decode source", e11);
        }
    }
}
