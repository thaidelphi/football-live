package com.appnext.core.a;

import java.net.URLEncoder;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {
    private int count;
    private double ef;
    private double eg;
    private HashMap<String, Integer> eh;

    public a(double d10, double d11, int i10, HashMap<String, Integer> hashMap) {
        this.count = 0;
        this.ef = d10;
        this.eg = d11;
        this.count = i10;
        this.eh = hashMap;
    }

    public final String a(Long l10) {
        LinkedList<Map.Entry> linkedList = new LinkedList(this.eh.entrySet());
        Collections.sort(linkedList, new Comparator<Map.Entry<String, Integer>>() { // from class: com.appnext.core.a.a.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
                return entry2.getValue().compareTo(entry.getValue());
            }
        });
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        for (Map.Entry entry : linkedList) {
            long j10 = i10;
            if (j10 >= l10.longValue()) {
                break;
            }
            linkedHashMap.put((String) entry.getKey(), (Integer) entry.getValue());
            sb.append(((String) entry.getKey()) + "," + entry.getValue());
            if (j10 != l10.longValue() - 1) {
                sb.append(",");
            }
            i10++;
        }
        return URLEncoder.encode(sb.toString());
    }

    public final String ai() {
        return String.format("%.2f", Double.valueOf(this.ef));
    }

    public final String aj() {
        return String.format("%.2f", Double.valueOf(this.eg));
    }

    public final int getCount() {
        return this.count;
    }

    public final String toString() {
        return "GenderCount{male=" + this.ef + ", female=" + this.eg + ", count=" + this.count + ", categoryMap=" + this.eh + '}';
    }
}
