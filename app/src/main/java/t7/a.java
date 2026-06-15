package t7;

import android.os.Bundle;
/* compiled from: RequestExtras.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    public static String f31069b = "query_info_type";

    /* renamed from: c  reason: collision with root package name */
    public static String f31070c = "requester_type_5";

    /* renamed from: d  reason: collision with root package name */
    public static String f31071d = "UnityScar";

    /* renamed from: a  reason: collision with root package name */
    private String f31072a;

    public a(String str) {
        this.f31072a = f31071d + str;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f31069b, f31070c);
        return bundle;
    }

    public String b() {
        return this.f31072a;
    }
}
