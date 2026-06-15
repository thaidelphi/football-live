package com.startapp.sdk.adsbase.remoteconfig;

import androidx.annotation.Keep;
import com.startapp.common.parser.TypeInfo;
import com.startapp.common.parser.TypeParser;
import com.startapp.o9;
import com.startapp.sdk.common.utils.Pair;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.WeakHashMap;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class RcdTargets implements Serializable {
    private static final long serialVersionUID = 6963217195144137950L;
    @TypeInfo
    private final SortedMap<String, Pair<Integer, String>> nameToScopesIds;
    @TypeInfo
    private final SortedMap<Integer, SortedMap<String, String>> scopeToNamesIds;

    /* compiled from: Sta */
    @Keep
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Parser implements TypeParser<RcdTargets> {
        private static void add(String str, String str2, int i10, SortedMap<String, Pair<Integer, String>> sortedMap, SortedMap<Integer, SortedMap<String, String>> sortedMap2) {
            if (str2.length() < 1) {
                return;
            }
            String replaceAll = str2.replaceAll("~", ".");
            sortedMap.put(replaceAll, new Pair<>(Integer.valueOf(i10), str));
            for (int i11 = 0; i11 < 16; i11++) {
                int i12 = 1 << i11;
                if ((i10 & i12) == i12) {
                    SortedMap<String, String> sortedMap3 = sortedMap2.get(Integer.valueOf(i12));
                    if (sortedMap3 == null) {
                        sortedMap3 = new TreeMap<>();
                        sortedMap2.put(Integer.valueOf(i12), sortedMap3);
                    }
                    sortedMap3.put(replaceAll, str);
                }
            }
        }

        public static void parseRec(String str, String str2, JSONObject jSONObject, SortedMap<String, Pair<Integer, String>> sortedMap, SortedMap<Integer, SortedMap<String, String>> sortedMap2) {
            if (jSONObject == null) {
                return;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.equals("~")) {
                    add(str, str2, jSONObject.optInt(next), sortedMap, sortedMap2);
                } else if (next.endsWith("~") && (jSONObject.opt(next) instanceof JSONObject)) {
                    parseRec(str, str2 + next, jSONObject.optJSONObject(next), sortedMap, sortedMap2);
                } else if (next.length() > 0) {
                    add(str, str2 + next, jSONObject.optInt(next), sortedMap, sortedMap2);
                }
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.startapp.common.parser.TypeParser
        public RcdTargets parse(Class<RcdTargets> cls, Object obj) {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    parseRec(next, "", jSONObject.optJSONObject(next), treeMap, treeMap2);
                }
                return new RcdTargets(treeMap, treeMap2);
            }
            return null;
        }
    }

    public RcdTargets(TreeMap treeMap, TreeMap treeMap2) {
        this.nameToScopesIds = treeMap;
        this.scopeToNamesIds = treeMap2;
    }

    public final Collection<String> a(int i10) {
        SortedMap<String, String> sortedMap = this.scopeToNamesIds.get(Integer.valueOf(i10));
        return sortedMap != null ? Collections.unmodifiableCollection(sortedMap.keySet()) : Collections.emptyList();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RcdTargets rcdTargets = (RcdTargets) obj;
        return o9.a(this.nameToScopesIds, rcdTargets.nameToScopesIds) && o9.a(this.scopeToNamesIds, rcdTargets.scopeToNamesIds);
    }

    public final int hashCode() {
        Object[] objArr = {this.nameToScopesIds, this.scopeToNamesIds};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public final String a(HashMap hashMap) {
        Pair<Integer, String> pair;
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Integer num = (Integer) entry.getValue();
            if (str != null && num != null && (pair = this.nameToScopesIds.get(str)) != null) {
                String str2 = pair.second;
                Integer num2 = (Integer) treeMap.get(str2);
                if (num2 == null) {
                    num2 = 0;
                }
                treeMap.put(str2, Integer.valueOf(num.intValue() | num2.intValue()));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry2 : treeMap.entrySet()) {
            sb.append(':');
            sb.append((String) entry2.getKey());
            sb.append(':');
            int intValue = ((Integer) entry2.getValue()).intValue();
            int i10 = 1;
            boolean z10 = (57344 & intValue) != 0;
            boolean z11 = (intValue & 7680) != 0;
            if (z10 && z11) {
                i10 = 6;
            } else if (z10) {
                i10 = 5;
            } else if (z11) {
                i10 = 4;
            } else if ((intValue & 256) != 0) {
                i10 = 3;
            } else if ((intValue & 172) != 0) {
                i10 = 2;
            } else if ((intValue & 83) == 0) {
                i10 = 0;
            }
            sb.append(i10);
        }
        if (sb.length() > 0) {
            sb.append(':');
        }
        return sb.toString();
    }
}
