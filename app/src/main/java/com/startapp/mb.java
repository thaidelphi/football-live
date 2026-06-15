package com.startapp;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class mb {
    public static ArrayList a(Node node, String str, String str2, List list) {
        NamedNodeMap attributes;
        Node namedItem;
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            Node item = childNodes.item(i10);
            if (item.getNodeName().equals(str)) {
                if (TextUtils.isEmpty(str2) || list == null || !((attributes = item.getAttributes()) == null || (namedItem = attributes.getNamedItem(str2)) == null || !list.contains(namedItem.getNodeValue()))) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }
}
