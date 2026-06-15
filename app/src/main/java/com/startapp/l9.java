package com.startapp;

import com.startapp.common.parser.TypeParser;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class l9<T> implements TypeParser<List<T>> {
    private static final String LOG_TAG = "l9";
    private final Class<T> itemClass;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements h2<Integer, JSONObject> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f22259a;

        public a(Object obj) {
            this.f22259a = obj;
        }

        @Override // com.startapp.h2
        public final JSONObject a(Integer num) {
            try {
                return ((JSONArray) this.f22259a).getJSONObject(num.intValue());
            } catch (JSONException e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements h2<Integer, JSONObject> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f22260a;

        public b(Object obj) {
            this.f22260a = obj;
        }

        @Override // com.startapp.h2
        public final JSONObject a(Integer num) {
            try {
                return ((JSONObject) this.f22260a).getJSONObject(num.toString());
            } catch (JSONException e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    public l9(Class<T> cls) {
        this.itemClass = cls;
    }

    @Override // com.startapp.common.parser.TypeParser
    public List<T> parse(Class<List<T>> cls, Object obj) {
        int length;
        h2 bVar;
        if (obj instanceof JSONArray) {
            length = ((JSONArray) obj).length();
            bVar = new a(obj);
        } else if (!(obj instanceof JSONObject)) {
            return null;
        } else {
            length = ((JSONObject) obj).length();
            bVar = new b(obj);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            try {
                arrayList.add(k4.a((Class<Object>) this.itemClass, (JSONObject) bVar.a(Integer.valueOf(i10))));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
