package t0;

import android.database.Cursor;
import android.os.Build;
import androidx.room.s;
import com.ironsource.cc;
import com.ironsource.ug;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* compiled from: TableInfo.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f30918a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f30919b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f30920c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f30921d;

    /* compiled from: TableInfo.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f30922a;

        /* renamed from: b  reason: collision with root package name */
        public final String f30923b;

        /* renamed from: c  reason: collision with root package name */
        public final int f30924c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f30925d;

        /* renamed from: e  reason: collision with root package name */
        public final int f30926e;

        /* renamed from: f  reason: collision with root package name */
        public final String f30927f;

        /* renamed from: g  reason: collision with root package name */
        private final int f30928g;

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            this.f30922a = str;
            this.f30923b = str2;
            this.f30925d = z10;
            this.f30926e = i10;
            this.f30924c = c(str2);
            this.f30927f = str3;
            this.f30928g = i11;
        }

        private static boolean a(String str) {
            if (str.length() == 0) {
                return false;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (i11 == 0 && charAt != '(') {
                    return false;
                }
                if (charAt == '(') {
                    i10++;
                } else if (charAt == ')' && i10 - 1 == 0 && i11 != str.length() - 1) {
                    return false;
                }
            }
            return i10 == 0;
        }

        public static boolean b(String str, String str2) {
            if (str2 == null) {
                return false;
            }
            if (str.equals(str2)) {
                return true;
            }
            if (a(str)) {
                return str.substring(1, str.length() - 1).trim().equals(str2);
            }
            return false;
        }

        private static int c(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains(AdPreferences.TYPE_TEXT)) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean d() {
            return this.f30926e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (Build.VERSION.SDK_INT >= 20) {
                    if (this.f30926e != aVar.f30926e) {
                        return false;
                    }
                } else if (d() != aVar.d()) {
                    return false;
                }
                if (this.f30922a.equals(aVar.f30922a) && this.f30925d == aVar.f30925d) {
                    if (this.f30928g != 1 || aVar.f30928g != 2 || (str3 = this.f30927f) == null || b(str3, aVar.f30927f)) {
                        if (this.f30928g != 2 || aVar.f30928g != 1 || (str2 = aVar.f30927f) == null || b(str2, this.f30927f)) {
                            int i10 = this.f30928g;
                            return (i10 == 0 || i10 != aVar.f30928g || ((str = this.f30927f) == null ? aVar.f30927f == null : b(str, aVar.f30927f))) && this.f30924c == aVar.f30924c;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f30922a.hashCode() * 31) + this.f30924c) * 31) + (this.f30925d ? 1231 : 1237)) * 31) + this.f30926e;
        }

        public String toString() {
            return "Column{name='" + this.f30922a + "', type='" + this.f30923b + "', affinity='" + this.f30924c + "', notNull=" + this.f30925d + ", primaryKeyPosition=" + this.f30926e + ", defaultValue='" + this.f30927f + "'}";
        }
    }

    /* compiled from: TableInfo.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f30929a;

        /* renamed from: b  reason: collision with root package name */
        public final String f30930b;

        /* renamed from: c  reason: collision with root package name */
        public final String f30931c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f30932d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f30933e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f30929a = str;
            this.f30930b = str2;
            this.f30931c = str3;
            this.f30932d = Collections.unmodifiableList(list);
            this.f30933e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f30929a.equals(bVar.f30929a) && this.f30930b.equals(bVar.f30930b) && this.f30931c.equals(bVar.f30931c) && this.f30932d.equals(bVar.f30932d)) {
                    return this.f30933e.equals(bVar.f30933e);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f30929a.hashCode() * 31) + this.f30930b.hashCode()) * 31) + this.f30931c.hashCode()) * 31) + this.f30932d.hashCode()) * 31) + this.f30933e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f30929a + "', onDelete='" + this.f30930b + "', onUpdate='" + this.f30931c + "', columnNames=" + this.f30932d + ", referenceColumnNames=" + this.f30933e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TableInfo.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        final int f30934a;

        /* renamed from: b  reason: collision with root package name */
        final int f30935b;

        /* renamed from: c  reason: collision with root package name */
        final String f30936c;

        /* renamed from: d  reason: collision with root package name */
        final String f30937d;

        c(int i10, int i11, String str, String str2) {
            this.f30934a = i10;
            this.f30935b = i11;
            this.f30936c = str;
            this.f30937d = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(c cVar) {
            int i10 = this.f30934a - cVar.f30934a;
            return i10 == 0 ? this.f30935b - cVar.f30935b : i10;
        }
    }

    /* compiled from: TableInfo.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f30938a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f30939b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f30940c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f30941d;

        public d(String str, boolean z10, List<String> list) {
            this(str, z10, list, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f30939b == dVar.f30939b && this.f30940c.equals(dVar.f30940c) && this.f30941d.equals(dVar.f30941d)) {
                    if (this.f30938a.startsWith("index_")) {
                        return dVar.f30938a.startsWith("index_");
                    }
                    return this.f30938a.equals(dVar.f30938a);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return ((((((this.f30938a.startsWith("index_") ? -1184239155 : this.f30938a.hashCode()) * 31) + (this.f30939b ? 1 : 0)) * 31) + this.f30940c.hashCode()) * 31) + this.f30941d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f30938a + "', unique=" + this.f30939b + ", columns=" + this.f30940c + ", orders=" + this.f30941d + '}';
        }

        public d(String str, boolean z10, List<String> list, List<String> list2) {
            this.f30938a = str;
            this.f30939b = z10;
            this.f30940c = list;
            this.f30941d = (list2 == null || list2.size() == 0) ? Collections.nCopies(list.size(), s.ASC.name()) : list2;
        }
    }

    public g(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.f30918a = str;
        this.f30919b = Collections.unmodifiableMap(map);
        this.f30920c = Collections.unmodifiableSet(set);
        this.f30921d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static g a(v0.g gVar, String str) {
        return new g(str, b(gVar, str), d(gVar, str), f(gVar, str));
    }

    private static Map<String, a> b(v0.g gVar, String str) {
        Cursor r02 = gVar.r0("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (r02.getColumnCount() > 0) {
                int columnIndex = r02.getColumnIndex("name");
                int columnIndex2 = r02.getColumnIndex("type");
                int columnIndex3 = r02.getColumnIndex("notnull");
                int columnIndex4 = r02.getColumnIndex("pk");
                int columnIndex5 = r02.getColumnIndex("dflt_value");
                while (r02.moveToNext()) {
                    String string = r02.getString(columnIndex);
                    hashMap.put(string, new a(string, r02.getString(columnIndex2), r02.getInt(columnIndex3) != 0, r02.getInt(columnIndex4), r02.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            r02.close();
        }
    }

    private static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(ug.f21009x);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<b> d(v0.g gVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor r02 = gVar.r0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = r02.getColumnIndex(ug.f21009x);
            int columnIndex2 = r02.getColumnIndex("seq");
            int columnIndex3 = r02.getColumnIndex(cc.Q);
            int columnIndex4 = r02.getColumnIndex("on_delete");
            int columnIndex5 = r02.getColumnIndex("on_update");
            List<c> c10 = c(r02);
            int count = r02.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                r02.moveToPosition(i10);
                if (r02.getInt(columnIndex2) == 0) {
                    int i11 = r02.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : c10) {
                        if (cVar.f30934a == i11) {
                            arrayList.add(cVar.f30936c);
                            arrayList2.add(cVar.f30937d);
                        }
                    }
                    hashSet.add(new b(r02.getString(columnIndex3), r02.getString(columnIndex4), r02.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            r02.close();
        }
    }

    private static d e(v0.g gVar, String str, boolean z10) {
        Cursor r02 = gVar.r0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = r02.getColumnIndex("seqno");
            int columnIndex2 = r02.getColumnIndex("cid");
            int columnIndex3 = r02.getColumnIndex("name");
            int columnIndex4 = r02.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (r02.moveToNext()) {
                    if (r02.getInt(columnIndex2) >= 0) {
                        int i10 = r02.getInt(columnIndex);
                        String string = r02.getString(columnIndex3);
                        String str2 = r02.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        treeMap.put(Integer.valueOf(i10), string);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                ArrayList arrayList2 = new ArrayList(treeMap2.size());
                arrayList2.addAll(treeMap2.values());
                return new d(str, z10, arrayList, arrayList2);
            }
            return null;
        } finally {
            r02.close();
        }
    }

    private static Set<d> f(v0.g gVar, String str) {
        Cursor r02 = gVar.r0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = r02.getColumnIndex("name");
            int columnIndex2 = r02.getColumnIndex(cc.f16874p);
            int columnIndex3 = r02.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (r02.moveToNext()) {
                    if ("c".equals(r02.getString(columnIndex2))) {
                        String string = r02.getString(columnIndex);
                        boolean z10 = true;
                        if (r02.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        d e8 = e(gVar, string, z10);
                        if (e8 == null) {
                            return null;
                        }
                        hashSet.add(e8);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            r02.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            String str = this.f30918a;
            if (str == null ? gVar.f30918a == null : str.equals(gVar.f30918a)) {
                Map<String, a> map = this.f30919b;
                if (map == null ? gVar.f30919b == null : map.equals(gVar.f30919b)) {
                    Set<b> set2 = this.f30920c;
                    if (set2 == null ? gVar.f30920c == null : set2.equals(gVar.f30920c)) {
                        Set<d> set3 = this.f30921d;
                        if (set3 == null || (set = gVar.f30921d) == null) {
                            return true;
                        }
                        return set3.equals(set);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f30918a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f30919b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f30920c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f30918a + "', columns=" + this.f30919b + ", foreignKeys=" + this.f30920c + ", indices=" + this.f30921d + '}';
    }
}
