package com.ironsource;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a3 implements Parcelable {
    public static final Parcelable.Creator<a3> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private String f16241a;

    /* renamed from: b  reason: collision with root package name */
    private String f16242b;

    /* renamed from: c  reason: collision with root package name */
    private String f16243c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16244d;

    /* renamed from: e  reason: collision with root package name */
    private int f16245e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<String> f16246f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<String> f16247g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<String> f16248h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<String> f16249i;

    /* renamed from: j  reason: collision with root package name */
    private String f16250j;

    /* renamed from: k  reason: collision with root package name */
    private String f16251k;

    /* renamed from: l  reason: collision with root package name */
    private Map<String, String> f16252l;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Parcelable.Creator<a3> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a3 createFromParcel(Parcel parcel) {
            return new a3(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a3[] newArray(int i10) {
            return new a3[i10];
        }
    }

    public a3() {
        i();
    }

    private a3(Parcel parcel) {
        i();
        try {
            this.f16244d = parcel.readByte() != 0;
            this.f16245e = parcel.readInt();
            this.f16241a = parcel.readString();
            this.f16242b = parcel.readString();
            this.f16243c = parcel.readString();
            this.f16250j = parcel.readString();
            this.f16251k = parcel.readString();
            this.f16252l = a(parcel.readString());
        } catch (Throwable th) {
            o9.d().a(th);
            i();
        }
    }

    /* synthetic */ a3(Parcel parcel, a aVar) {
        this(parcel);
    }

    private Map<String, String> a(String str) {
        IronLog ironLog;
        String th;
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e8) {
            o9.d().a(e8);
            ironLog = IronLog.INTERNAL;
            th = e8.toString();
            ironLog.error(th);
            return hashMap;
        } catch (Throwable th2) {
            o9.d().a(th2);
            ironLog = IronLog.INTERNAL;
            th = th2.toString();
            ironLog.error(th);
            return hashMap;
        }
        return hashMap;
    }

    private void i() {
        this.f16244d = false;
        this.f16245e = -1;
        this.f16246f = new ArrayList<>();
        this.f16247g = new ArrayList<>();
        this.f16248h = new ArrayList<>();
        this.f16249i = new ArrayList<>();
        this.f16251k = "";
        this.f16250j = "";
        this.f16252l = new HashMap();
    }

    public void a() {
        this.f16245e = -1;
    }

    public void a(int i10) {
        this.f16245e = i10;
    }

    public void a(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            this.f16247g.remove(str);
        } else if (this.f16247g.indexOf(str) == -1) {
            this.f16247g.add(str);
        }
    }

    public void a(Map<String, String> map) {
        this.f16252l = map;
    }

    public void a(boolean z10) {
        this.f16244d = z10;
    }

    public String b() {
        return this.f16243c;
    }

    public void b(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            this.f16249i.remove(str);
        } else if (this.f16249i.indexOf(str) == -1) {
            this.f16249i.add(str);
        }
    }

    public boolean b(String str) {
        return !TextUtils.isEmpty(str) && this.f16247g.indexOf(str) > -1;
    }

    public int c() {
        return this.f16245e;
    }

    public void c(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            this.f16246f.remove(str);
        } else if (this.f16246f.indexOf(str) == -1) {
            this.f16246f.add(str);
        }
    }

    public boolean c(String str) {
        return !TextUtils.isEmpty(str) && this.f16249i.indexOf(str) > -1;
    }

    public String d() {
        return this.f16250j;
    }

    public void d(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            this.f16248h.remove(str);
        } else if (this.f16248h.indexOf(str) == -1) {
            this.f16248h.add(str);
        }
    }

    public boolean d(String str) {
        return !TextUtils.isEmpty(str) && this.f16246f.indexOf(str) > -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, String> e() {
        return this.f16252l;
    }

    public boolean e(String str) {
        return !TextUtils.isEmpty(str) && this.f16248h.indexOf(str) > -1;
    }

    public String f() {
        return this.f16251k;
    }

    public void f(String str) {
        this.f16243c = str;
    }

    public String g() {
        return this.f16241a;
    }

    public void g(String str) {
        this.f16250j = str;
    }

    public String h() {
        return this.f16242b;
    }

    public void h(String str) {
        this.f16251k = str;
    }

    public void i(String str) {
        this.f16241a = str;
    }

    public void j(String str) {
        this.f16242b = str;
    }

    public boolean j() {
        return this.f16244d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.f16244d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.f16245e);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.f16246f);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.f16247g);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.f16250j);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.f16251k);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.f16252l);
            sb.append(", ");
        } catch (Throwable th) {
            o9.d().a(th);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        try {
            parcel.writeByte(this.f16244d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f16245e);
            parcel.writeString(this.f16241a);
            parcel.writeString(this.f16242b);
            parcel.writeString(this.f16243c);
            parcel.writeString(this.f16250j);
            parcel.writeString(this.f16251k);
            parcel.writeString(new JSONObject(this.f16252l).toString());
        } catch (Throwable th) {
            o9.d().a(th);
        }
    }
}
