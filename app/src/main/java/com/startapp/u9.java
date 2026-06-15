package com.startapp;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u9 {

    /* renamed from: a  reason: collision with root package name */
    public final Node f23449a;

    public u9(Node node) {
        this.f23449a = node;
    }

    public final u9 a(String str, String str2) {
        ArrayList a10 = mb.a(this.f23449a, str, str2, null);
        Node node = a10.isEmpty() ? null : (Node) a10.get(0);
        if (node != null) {
            return new u9(node);
        }
        return null;
    }

    public final Integer b(String str) {
        try {
            String a10 = a(str);
            if (a10 != null) {
                return Integer.valueOf(Integer.parseInt(a10));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final ArrayList c(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = mb.a(this.f23449a, str, null, null).iterator();
        while (it.hasNext()) {
            arrayList.add(new u9((Node) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String b10 = ((u9) it2.next()).b();
            if (!TextUtils.isEmpty(b10)) {
                arrayList2.add(b10);
            }
        }
        return arrayList2;
    }

    public final ArrayList d(String str) {
        return a("Tracking", "TrackingEvents", "event", Collections.singletonList(str));
    }

    public final ArrayList e(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = d(str).iterator();
        while (it.hasNext()) {
            String b10 = ((u9) it.next()).b();
            if (!TextUtils.isEmpty(b10)) {
                arrayList.add(b10);
            }
        }
        return arrayList;
    }

    public final String f(String str) {
        u9 a10 = a(str, null);
        if (a10 == null) {
            return null;
        }
        return a10.b();
    }

    public final String b() {
        Node node = this.f23449a;
        if (node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }

    public final ArrayList a(String str, String str2, String str3, List list) {
        ArrayList arrayList = new ArrayList();
        u9 a10 = a(str2, null);
        if (a10 == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = mb.a(a10.f23449a, str, str3, list).iterator();
        while (it.hasNext()) {
            arrayList2.add(new u9((Node) it.next()));
        }
        return arrayList2;
    }

    public final String a(String str) {
        Node namedItem = this.f23449a.getAttributes().getNamedItem(str);
        if (namedItem != null) {
            return namedItem.getNodeValue();
        }
        return null;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = a("Creative", "Creatives", null, null).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((u9) it.next()).a("Companion", "CompanionAds", null, null));
        }
        return arrayList;
    }
}
