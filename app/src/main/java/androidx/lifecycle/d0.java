package androidx.lifecycle;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: SavedStateHandle.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f3610f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    private static final Class<? extends Object>[] f3611g;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f3612a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, a.c> f3613b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Object> f3614c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, g9.w<Object>> f3615d;

    /* renamed from: e  reason: collision with root package name */
    private final a.c f3616e;

    /* compiled from: SavedStateHandle.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final d0 a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new d0();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    kotlin.jvm.internal.n.e(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new d0(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = parcelableArrayList.get(i10);
                    kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
                }
                return new d0(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }

        public final boolean b(Object obj) {
            Class[] clsArr;
            if (obj == null) {
                return true;
            }
            for (Class cls : d0.f3611g) {
                kotlin.jvm.internal.n.c(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        Class<? extends Object>[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        Class<SizeF> cls = Integer.TYPE;
        clsArr[4] = cls;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        int i10 = Build.VERSION.SDK_INT;
        clsArr[27] = i10 >= 21 ? Size.class : cls;
        if (i10 >= 21) {
            cls = SizeF.class;
        }
        clsArr[28] = cls;
        f3611g = clsArr;
    }

    public d0(Map<String, ? extends Object> initialState) {
        kotlin.jvm.internal.n.f(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3612a = linkedHashMap;
        this.f3613b = new LinkedHashMap();
        this.f3614c = new LinkedHashMap();
        this.f3615d = new LinkedHashMap();
        this.f3616e = new a.c() { // from class: androidx.lifecycle.c0
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle d10;
                d10 = d0.d(d0.this);
                return d10;
            }
        };
        linkedHashMap.putAll(initialState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(d0 this$0) {
        Map t10;
        kotlin.jvm.internal.n.f(this$0, "this$0");
        t10 = j8.j0.t(this$0.f3613b);
        for (Map.Entry entry : t10.entrySet()) {
            this$0.e((String) entry.getKey(), ((a.c) entry.getValue()).a());
        }
        Set<String> keySet = this$0.f3612a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f3612a.get(str));
        }
        return androidx.core.os.d.a(i8.s.a("keys", arrayList), i8.s.a("values", arrayList2));
    }

    public final a.c c() {
        return this.f3616e;
    }

    public final <T> void e(String key, T t10) {
        kotlin.jvm.internal.n.f(key, "key");
        if (f3610f.b(t10)) {
            Object obj = this.f3614c.get(key);
            w wVar = obj instanceof w ? (w) obj : null;
            if (wVar != null) {
                wVar.j(t10);
            } else {
                this.f3612a.put(key, t10);
            }
            g9.w<Object> wVar2 = this.f3615d.get(key);
            if (wVar2 == null) {
                return;
            }
            wVar2.setValue(t10);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        kotlin.jvm.internal.n.c(t10);
        sb.append(t10.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }

    public d0() {
        this.f3612a = new LinkedHashMap();
        this.f3613b = new LinkedHashMap();
        this.f3614c = new LinkedHashMap();
        this.f3615d = new LinkedHashMap();
        this.f3616e = new a.c() { // from class: androidx.lifecycle.c0
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle d10;
                d10 = d0.d(d0.this);
                return d10;
            }
        };
    }
}
