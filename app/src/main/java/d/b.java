package d;

import android.content.Context;
import android.content.Intent;
import d.a;
import i8.s;
import j8.i0;
import j8.j0;
import j8.m;
import j8.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import y8.i;
/* compiled from: ActivityResultContracts.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b extends d.a<String[], Map<String, Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23870a = new a(null);

    /* compiled from: ActivityResultContracts.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(String[] input) {
            n.f(input, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            n.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    @Override // d.a
    /* renamed from: d */
    public Intent a(Context context, String[] input) {
        n.f(context, "context");
        n.f(input, "input");
        return f23870a.a(input);
    }

    @Override // d.a
    /* renamed from: e */
    public a.C0258a<Map<String, Boolean>> b(Context context, String[] input) {
        int c10;
        int a10;
        Map f10;
        n.f(context, "context");
        n.f(input, "input");
        boolean z10 = true;
        if (input.length == 0) {
            f10 = j0.f();
            return new a.C0258a<>(f10);
        }
        int length = input.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!(androidx.core.content.a.a(context, input[i10]) == 0)) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (z10) {
            c10 = i0.c(input.length);
            a10 = i.a(c10, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(a10);
            for (String str : input) {
                i8.n a11 = s.a(str, Boolean.TRUE);
                linkedHashMap.put(a11.c(), a11.d());
            }
            return new a.C0258a<>(linkedHashMap);
        }
        return null;
    }

    @Override // d.a
    /* renamed from: f */
    public Map<String, Boolean> c(int i10, Intent intent) {
        Map<String, Boolean> f10;
        List k10;
        List R;
        Map<String, Boolean> r10;
        Map<String, Boolean> f11;
        Map<String, Boolean> f12;
        if (i10 != -1) {
            f12 = j0.f();
            return f12;
        } else if (intent == null) {
            f11 = j0.f();
            return f11;
        } else {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i11 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i11 == 0));
                }
                k10 = m.k(stringArrayExtra);
                R = y.R(k10, arrayList);
                r10 = j0.r(R);
                return r10;
            }
            f10 = j0.f();
            return f10;
        }
    }
}
