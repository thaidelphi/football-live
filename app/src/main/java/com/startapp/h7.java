package com.startapp;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import com.startapp.sdk.adsbase.remoteconfig.RscMetadata;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h7 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22032a;

    /* renamed from: b  reason: collision with root package name */
    public final j2<RscMetadata> f22033b;

    /* renamed from: c  reason: collision with root package name */
    public RscMetadata f22034c;

    /* renamed from: d  reason: collision with root package name */
    public List<k7> f22035d;

    /* renamed from: e  reason: collision with root package name */
    public List<j7> f22036e;

    /* renamed from: f  reason: collision with root package name */
    public final WeakHashMap f22037f = new WeakHashMap();

    public h7(Context context, com.startapp.sdk.components.f fVar) {
        this.f22032a = context;
        this.f22033b = fVar;
    }

    public static JSONArray a(j7 j7Var) {
        l1 l1Var = j7Var.f22145a;
        String[] strArr = l1Var.f22190c;
        Object[] objArr = l1Var.f22192e;
        if (strArr.length == objArr.length) {
            int length = strArr.length;
            if (length == 0) {
                return null;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(strArr[i10], objArr[i10]);
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            } catch (JSONException e8) {
                if (j7Var.a(32)) {
                    l3.a(e8);
                }
            }
        } else if (j7Var.a(AdRequest.MAX_CONTENT_URL_LENGTH)) {
            l3 l3Var = new l3(m3.f22275e);
            l3Var.f22228d = "c690e4ef5365d88b";
            l3Var.f22229e = Arrays.toString(strArr) + ", " + Arrays.toString(objArr);
            l3Var.a();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01c6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.startapp.j7> a() {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.h7.a():java.util.List");
    }

    public final synchronized List a(RscMetadata rscMetadata, ArrayList arrayList, LinkedList linkedList) {
        List<k7> list = this.f22035d;
        if (list != null) {
            for (k7 k7Var : list) {
                k7Var.a(this.f22032a);
            }
        }
        this.f22034c = rscMetadata;
        this.f22035d = arrayList;
        this.f22036e = linkedList;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((k7) it.next()).a(this.f22032a, this);
            }
        }
        return linkedList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if ((((java.lang.Long) r10.first).longValue() + (r0 * 1000)) < android.os.SystemClock.elapsedRealtime()) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.h7.a(java.lang.Object):java.lang.String");
    }

    public final synchronized void a(l1 l1Var, JSONObject jSONObject) {
        this.f22037f.put(l1Var, new Pair(Long.valueOf(SystemClock.elapsedRealtime()), new SoftReference(jSONObject)));
    }
}
