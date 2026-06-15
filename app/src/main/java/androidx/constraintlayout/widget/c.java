package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.ironsource.ug;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ConstraintLayoutStates.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f2107a;

    /* renamed from: b  reason: collision with root package name */
    int f2108b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f2109c = -1;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray<a> f2110d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    private SparseArray<d> f2111e = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintLayoutStates.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f2112a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<b> f2113b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        int f2114c;

        /* renamed from: d  reason: collision with root package name */
        d f2115d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f2114c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.F4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.G4) {
                    this.f2112a = obtainStyledAttributes.getResourceId(index, this.f2112a);
                } else if (index == i.H4) {
                    this.f2114c = obtainStyledAttributes.getResourceId(index, this.f2114c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2114c);
                    context.getResources().getResourceName(this.f2114c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f2115d = dVar;
                        dVar.f(context, this.f2114c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f2113b.add(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintLayoutStates.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        float f2116a;

        /* renamed from: b  reason: collision with root package name */
        float f2117b;

        /* renamed from: c  reason: collision with root package name */
        float f2118c;

        /* renamed from: d  reason: collision with root package name */
        float f2119d;

        /* renamed from: e  reason: collision with root package name */
        int f2120e;

        /* renamed from: f  reason: collision with root package name */
        d f2121f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f2116a = Float.NaN;
            this.f2117b = Float.NaN;
            this.f2118c = Float.NaN;
            this.f2119d = Float.NaN;
            this.f2120e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f2225b5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.f2232c5) {
                    this.f2120e = obtainStyledAttributes.getResourceId(index, this.f2120e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2120e);
                    context.getResources().getResourceName(this.f2120e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f2121f = dVar;
                        dVar.f(context, this.f2120e);
                    }
                } else if (index == i.f2239d5) {
                    this.f2119d = obtainStyledAttributes.getDimension(index, this.f2119d);
                } else if (index == i.f2246e5) {
                    this.f2117b = obtainStyledAttributes.getDimension(index, this.f2117b);
                } else if (index == i.f2253f5) {
                    this.f2118c = obtainStyledAttributes.getDimension(index, this.f2118c);
                } else if (index == i.f2260g5) {
                    this.f2116a = obtainStyledAttributes.getDimension(index, this.f2116a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f2107a = constraintLayout;
        a(context, i10);
    }

    private void a(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    char c10 = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    if (c10 != 0 && c10 != 1) {
                        if (c10 == 2) {
                            aVar = new a(context, xml);
                            this.f2110d.put(aVar.f2112a, aVar);
                            continue;
                        } else if (c10 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.a(bVar);
                                continue;
                            } else {
                                continue;
                            }
                        } else if (c10 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            continue;
                        } else {
                            b(context, xml);
                            continue;
                        }
                    }
                }
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (ug.f21009x.equals(xmlPullParser.getAttributeName(i10))) {
                String attributeValue = xmlPullParser.getAttributeValue(i10);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), ug.f21009x, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.n(context, xmlPullParser);
                this.f2111e.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }
}
