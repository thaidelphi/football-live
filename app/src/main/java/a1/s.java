package a1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: TransitionValues.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s {

    /* renamed from: b  reason: collision with root package name */
    public View f182b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f181a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<m> f183c = new ArrayList<>();

    @Deprecated
    public s() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f182b == sVar.f182b && this.f181a.equals(sVar.f181a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f182b.hashCode() * 31) + this.f181a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f182b + "\n") + "    values:";
        for (String str2 : this.f181a.keySet()) {
            str = str + "    " + str2 + ": " + this.f181a.get(str2) + "\n";
        }
        return str;
    }

    public s(View view) {
        this.f182b = view;
    }
}
