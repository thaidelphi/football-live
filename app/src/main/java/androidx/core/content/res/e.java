package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: FontResourcesParserCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final d[] f2570a;

        public c(d[] dVarArr) {
            this.f2570a = dVarArr;
        }

        public d[] a() {
            return this.f2570a;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f2571a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2572b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f2573c;

        /* renamed from: d  reason: collision with root package name */
        private final String f2574d;

        /* renamed from: e  reason: collision with root package name */
        private final int f2575e;

        /* renamed from: f  reason: collision with root package name */
        private final int f2576f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f2571a = str;
            this.f2572b = i10;
            this.f2573c = z10;
            this.f2574d = str2;
            this.f2575e = i11;
            this.f2576f = i12;
        }

        public String a() {
            return this.f2571a;
        }

        public int b() {
            return this.f2576f;
        }

        public int c() {
            return this.f2575e;
        }

        public String d() {
            return this.f2574d;
        }

        public int e() {
            return this.f2572b;
        }

        public boolean f() {
            return this.f2573c;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.res.e$e  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0038e implements b {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.core.provider.e f2577a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2578b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2579c;

        /* renamed from: d  reason: collision with root package name */
        private final String f2580d;

        public C0038e(androidx.core.provider.e eVar, int i10, int i11, String str) {
            this.f2577a = eVar;
            this.f2579c = i10;
            this.f2578b = i11;
            this.f2580d = str;
        }

        public int a() {
            return this.f2579c;
        }

        public androidx.core.provider.e b() {
            return this.f2577a;
        }

        public String c() {
            return this.f2580d;
        }

        public int d() {
            return this.f2578b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.a(typedArray, i10);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i10, typedValue);
        return typedValue.type;
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), v.d.f31657h);
        String string = obtainAttributes.getString(v.d.f31658i);
        String string2 = obtainAttributes.getString(v.d.f31662m);
        String string3 = obtainAttributes.getString(v.d.f31663n);
        int resourceId = obtainAttributes.getResourceId(v.d.f31659j, 0);
        int integer = obtainAttributes.getInteger(v.d.f31660k, 1);
        int integer2 = obtainAttributes.getInteger(v.d.f31661l, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        String string4 = obtainAttributes.getString(v.d.f31664o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0038e(new androidx.core.provider.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), v.d.f31665p);
        int i10 = v.d.f31674y;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = v.d.f31667r;
        }
        int i11 = obtainAttributes.getInt(i10, CommonGatewayClient.CODE_400);
        int i12 = v.d.f31672w;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = v.d.f31668s;
        }
        boolean z10 = 1 == obtainAttributes.getInt(i12, 0);
        int i13 = v.d.f31675z;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = v.d.f31669t;
        }
        int i14 = v.d.f31673x;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = v.d.f31670u;
        }
        String string = obtainAttributes.getString(i14);
        int i15 = obtainAttributes.getInt(i13, 0);
        int i16 = v.d.f31671v;
        if (!obtainAttributes.hasValue(i16)) {
            i16 = v.d.f31666q;
        }
        int resourceId = obtainAttributes.getResourceId(i16, 0);
        String string2 = obtainAttributes.getString(i16);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i11, z10, string, i15, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
